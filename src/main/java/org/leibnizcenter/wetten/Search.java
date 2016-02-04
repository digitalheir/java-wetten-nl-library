package org.leibnizcenter.wetten;

import com.squareup.okhttp.HttpUrl;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import gov.loc.zing.srw.SearchRetrieveResponseType;

import javax.xml.bind.*;
import java.io.IOException;
import java.io.InputStream;
import java.security.InvalidParameterException;
import java.util.NoSuchElementException;

/**
 * <p>
 * Request to Overheid.nl SRU; the search engine for bwb. Sort of works like an {@link java.util.Iterator}: implements
 * the methods {@link #hasNext()} and {@link #next()} to fetch next page in the search results.
 * </p>
 * Created by maarten on 15-12-15.
 */
public class Search {
    private final OkHttpClient httpClient;
    private Builder url;
    private SearchRetrieveResponseType lastResult;

    /**
     * Sets up this search request. Perform request by calling {@link #next()}.
     *
     * @param builder {@link Builder} that contains all query parameters
     */
    public Search(Builder builder) {
        this.url = builder;
        httpClient = new OkHttpClient();
        //lastResult = executeAndParse(httpClient);
    }


    private Response execute() throws IOException {
        return execute(new OkHttpClient());
    }

    private Response execute(OkHttpClient httpClient) throws IOException {
//        System.out.println(url.buildUrl());
        return httpClient.newCall(
                new Request.Builder().url(url.buildUrl()).build()
        ).execute();
    }

    private SearchRetrieveResponseType executeAndParse() throws IOException, JAXBException {
        return executeAndParse(new OkHttpClient());
    }

    private SearchRetrieveResponseType executeAndParse(OkHttpClient httpClient) throws IOException, JAXBException {
        Response res = execute(httpClient);
        InputStream stream = res.body().byteStream();
        JAXBContext jaxbContext = JAXBContext.newInstance(SearchRetrieveResponseType.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

        //noinspection unchecked
        JAXBElement<SearchRetrieveResponseType> l = ((JAXBElement<SearchRetrieveResponseType>)
                jaxbUnmarshaller.unmarshal(stream));
        return l.getValue();
    }


    public boolean hasNext() {
        return lastResult == null || lastResult.getNextRecordPosition() != null;
    }

    public SearchRetrieveResponseType next() throws IOException, JAXBException {
        if (lastResult != null) {
            if (lastResult.getNextRecordPosition() == null) {
                throw new NoSuchElementException();
            } else {
                url.setStart(
                        lastResult.getNextRecordPosition().intValue()
                );
            }
        }

        lastResult = executeAndParse(httpClient);
        return lastResult;
    }

    public static Search withQuery(String variable, String value) {
        return new Builder().setQuery(variable, value).build();
    }

    public static Search withQuery(String query) {
        return new Builder().setQuery(query).build();
    }

    public HttpUrl getUrl() {
        return url.buildUrl();
    }

    public static class Builder {
        private static final String VERSION = "version";
        private static final String OPERATION = "operation";
        private static final String X_CONNECTION = "x-connection";
        private static final String QUERY = "query";

        private static int MAX_RESULT_SIZE = 1000;

        final HttpUrl.Builder builder = new HttpUrl.Builder();

        {
            builder.scheme("http");
            builder.host("zoekservice.overheid.nl");
            builder.addPathSegment("sru");
            builder.addPathSegment("Search");
            builder.setQueryParameter(OPERATION, "searchRetrieve");
            builder.setQueryParameter(VERSION, "1.2");
            builder.setQueryParameter(X_CONNECTION, "BWB");
//            builder.setQueryParameter(QUERY, "overheidbwb.titel=aanbestedingswet");
        }

        public Builder() {
        }

        public Builder setOperation(String op) {
            builder.setQueryParameter(OPERATION, op);
            return this;
        }

        public Builder setVersion(String op) {
            builder.setQueryParameter(VERSION, op);
            return this;
        }

        public Builder setStart(int start) {
            builder.setQueryParameter("startRecord", "" + start);
            return this;
        }

        /**
         * Default value 50
         *
         * @param max
         */
        public Builder setMax(int max) {
            if (max > MAX_RESULT_SIZE || max < 1) {
                throw new InvalidParameterException("Maximum value must be 0 < max <= "+MAX_RESULT_SIZE+", not " + max + ".");
            }
            builder.setQueryParameter("maximumRecords", "" + max);
            return this;
        }

        public Builder setxConnection(String xConnection) {
            builder.setQueryParameter(X_CONNECTION, xConnection);
            return this;
        }

        public Builder setQuery(String query) {
            builder.setEncodedQueryParameter(QUERY, query);
            return this;
        }

        public HttpUrl buildUrl() {
            return builder.build();
        }

        public Search build() {
            return new Search(this);
        }


        public Builder setQuery(String var, String val) {
            setQuery(var + "=" + val);
            return this;
        }
    }

    public static class QueryVars {
        /**
         * identificatie van de
         * regeling
         * Dit is niet de identificatie
         * van een specifieke
         * toestand
         */
        public static final String identifier = "dcterms.identifier";
        /**
         * Tijdstip laatste wijziging Ook de operatoren <, >,
         * <=, >= worden
         * ondersteund.
         */
        public static final String modified = "dcterms.modified";
        /**
         * Soort regeling Mogelijke waarden staan
         * in de bijlage
         */
        public static final String type = "dcterms.type";
        /**
         * Eerstverantwoordelijke Mogelijke waarden staan
         * in de bijlage
         */
        public static final String authority = "overheid.authority";
        /**
         * Rechtsgebied Mogelijke waarden staan
         * in de bijlage
         */
        public static final String rechtsgebied = "overheidbwb.rechtsgebied";
        /**
         * Overheidsdomein Niet voor verdragen
         * Mogelijke waarden staan
         * in de bijlage
         */
        public static final String overheidsdomein = "overheidbwb.overheidsdomein";
        /**
         * Verdragsonderwerp Alleen voor verdragen
         * Mogelijke waarden staan
         * in de bijlage
         */
        public static final String onderwerpVerdrag = "overheidbwb.onderwerpVerdrag";
        /**
         * Citeertitel, officiële-titel
         * niet-officiële-titel
         * In alle 3 de velden wordt
         * gezocht
         * De volgende operatoren
         * worden ondersteund: =,
         * adj, any, all. De operator
         * == wordt dus niet
         * ondersteund.
         * De implementatie van de
         * = operator komt
         * overheen met de adj
         * operator.
         */
        public static final String titel = "overheidbwb.titel";
        /**
         * Afkorting
         */
        public static final String afkorting = "overheidbwb.afkorting";
        /**
         * Wetsfamilie
         */
        public static final String wetsfamilie = "overheidbwb.wetsfamilie";
        /**
         * geldigheidsdatum
         */
        public static final String geldigheidsdatum = "overheidbwb.geldigheidsdatum";
        /**
         * zichtdatum
         */
        public static final String zichtdatum = "overheidbwb.zichtdatum";
        /**
         * bekendmaking waarin de
         * regeling aangemaakt of
         * gewijzigd is
         */
        public static final String bekendmaking = "overheidbwb.bekendmaking";
        /**
         * dossiernummer van
         * kamerstukken waarin de
         * regeling aangemaakt of
         * gewijzigd is
         */
        public static final String dossiernummer = "overheidbwb.dossiernummer";
    }

    public enum Type {
        AMvB,
        AMvBBES,
        beleidsregel,
        beleidsregelBES,
        circulaire,
        circulaireBES,
        KB,
        pbo,
        reglement,
        rijksKB,
        rijkswet,
        verdrag,
        wet,
        wetBES,
        zbo,
        ministerieleregeling,
        ministerieleregelingarchiefselectielijst,
        ministerieleregelingBES;

        @Override
        public String toString() {
            switch (this) {
                case AMvBBES:
                    return "AMvB-BES";
                case beleidsregelBES:
                    return "beleidsregel-BES";
                case circulaireBES:
                    return "circulaire-BES";
                case wetBES:
                    return "wet-BES";
                case ministerieleregeling:
                    return "ministeriele-regeling";
                case ministerieleregelingarchiefselectielijst:
                    return "ministeriele-regeling-archiefselectielijst";
                case ministerieleregelingBES:
                    return "ministeriele-regeling-BES";
                default:
                    return super.toString();
            }
        }
    }
}
