package org.leibnizcenter.wetten;

import com.squareup.okhttp.HttpUrl;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import nl.wetten._schema.Expression;
import nl.wetten._schema.Item;
import nl.wetten._schema.Manifestation;
import nl.wetten._schema.Work;
import org.leibnizcenter.ResourceNotFoundException;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * <p>
 * Utility methods for manifestations, usually dealing with the XML version of laws on a particular date
 * </p>
 * Created by maarten on 4-11-15.
 */
public class Manifestations {
    public static InputStream streamXml(Work work, Expression expression) throws IOException {
        return streamXml(work, expression, getManifestation(expression));
    }

    public static InputStream streamXml(Work work, Expression expression, Manifestation manifestation) throws IOException {
        return streamXml(work, expression, getItem(manifestation));
    }

    public static InputStream streamXml(Work work, Expression expression, Item item) throws IOException {
        return streamXml(
                new Request.Builder().url(getXmlUrl(work.getLabel(), expression.getLabel(), item.getLabel())).build(),
                new OkHttpClient()
        );
    }

    public static String getXml(Work work, Expression expression) throws IOException {
        Manifestation manifestation = getManifestation(expression);
        return getXml(work, expression, manifestation);
    }

    public static Item getItem(Manifestation manifestation) {
        List<Item> manif = manifestation.getItem();
        if (manif.size() != 1) {
            throw new IllegalStateException("Found " + manif.size() + " items; can't decide which to choose");
        }
        return manif.get(0);
    }

    public static Manifestation getManifestation(Expression expression) {
        List<Manifestation> manif = expression.getManifestation();
        if (manif.size() != 1) {
            throw new IllegalStateException("Found " + manif.size() + " manifestations; can't decide which to choose");
        }
        return manif.get(0);
    }

    public static String getXml(Work work, Expression expression, Manifestation manifestation) throws IOException {
        return getXml(work, expression, getItem(manifestation));
    }

    public static String getXml(Work work, Expression expression, Item item) throws IOException {
        return getXml(work.getLabel(), expression.getLabel(), item.getLabel());
    }

    public static String getXmlUrl(String bwbId, String expressionLabel, String itemLabel) {
        return Const.HTTPS_REPOSITORY_OFFICIELE_OVERHEIDSPUBLICATIES_NL_BWB + bwbId + "/" + expressionLabel + "/xml/" + itemLabel;
    }

    public static String getXml(String bwbId, String expressionLabel, String itemLabel) throws IOException {
        return getXml(
                HttpUrl.parse(getXmlUrl(bwbId, expressionLabel, itemLabel))
        );
    }

    public static String getXml(HttpUrl url) throws IOException {
        return getXml(
                new Request.Builder().url(url).build(),
                new OkHttpClient()
        );
    }

    public static InputStream streamXml(Request request, OkHttpClient httpClient) throws IOException {
        Response response = httpClient.newCall(request).execute();
        if (response.isSuccessful()) {
            return response.body().byteStream();
        } else {
            throw new ResourceNotFoundException(request, response);
        }
    }

    public static String getXml(Request request, OkHttpClient httpClient) throws IOException {
        Response response = httpClient.newCall(request).execute();
        if (response.isSuccessful()) {
            return response.body().string();
        } else {
            throw new ResourceNotFoundException(request, response);
        }
    }
}
