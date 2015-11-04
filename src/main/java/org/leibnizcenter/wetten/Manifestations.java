package org.leibnizcenter.wetten;

import com.squareup.okhttp.HttpUrl;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import nl.wetten._schema.Expression;
import nl.wetten._schema.Item;
import nl.wetten._schema.Work;

import java.io.IOException;

/**
 * Created by maarten on 4-11-15.
 */
public class Manifestations {
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

    private static String getXml(HttpUrl url) throws IOException {
        return getXml(
                new Request.Builder().url(url).build(),
                new OkHttpClient()
        );
    }

    private static String getXml(Request request, OkHttpClient httpClient) throws IOException {
        Response response = httpClient.newCall(request).execute();
        if (response.isSuccessful()) {
            return response.body().string();
        } else {
            throw new Error("HTTP request not OK: " + response.code() + "\nURL: " + request.url());
        }
    }
}
