package org.leibnizcenter.wetten;


import com.squareup.okhttp.HttpUrl;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import nl.wetten._schema.Work;
import nl.wetten.bwbng.wti.WetstechnischeInformatie;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Maarten on 21/10/2015.
 */
public class BwbInterface {

    public static final String HTTPS_REPOSITORY_OFFICIELE_OVERHEIDSPUBLICATIES_NL_BWB = "https://repository.officiele-overheidspublicaties.nl/bwb/";

    /**
     *
     * @param bwbId BWB id for document
     * @return {@link Work} object representing this law
     * @throws IOException
     * @throws JAXBException
     */
    public static Work getWork(String bwbId) throws IOException, JAXBException {
        HttpUrl url = HttpUrl.parse(
                HTTPS_REPOSITORY_OFFICIELE_OVERHEIDSPUBLICATIES_NL_BWB + bwbId + "/manifest.xml"
        );
        return getWork(url);
    }

    private static Work getWork(HttpUrl url) throws IOException, JAXBException {
        return getWork(
                new Request.Builder().url(url).build()
        );
    }

    private static Work getWork(Request build) throws IOException, JAXBException {
        return getWork(build, new OkHttpClient());
    }

    private static Work getWork(Request request, OkHttpClient httpClient) throws IOException, JAXBException {
        Response response = httpClient.newCall(request).execute();
        if (response.isSuccessful()) {
            InputStream stream = response.body().byteStream();
            return Work.parse(stream);
        } else {
            throw new Error("HTTP request not OK: " + response.code() + "\nURL: " + request.url());
        }
    }

    public static WetstechnischeInformatie getWti(String bwbId) throws IOException, JAXBException {
        HttpUrl url = HttpUrl.parse(
                HTTPS_REPOSITORY_OFFICIELE_OVERHEIDSPUBLICATIES_NL_BWB + bwbId + "/" + bwbId + ".WTI"
        );
        return getWti(url);
    }

    public static WetstechnischeInformatie getWti(HttpUrl url) throws IOException, JAXBException {
        return getWti(
                new Request.Builder().url(url).build()
        );
    }

    public static WetstechnischeInformatie getWti(Request request) throws IOException, JAXBException {
        OkHttpClient httpClient = new OkHttpClient();
        Response response = httpClient.newCall(request).execute();
        if (response.isSuccessful()) {
            InputStream stream = response.body().byteStream();
            return WetstechnischeInformatie.parse(stream);
        } else {
            throw new Error("HTTP request not OK: " + response.code() + "\nURL: " + request.url());
        }
    }

}
