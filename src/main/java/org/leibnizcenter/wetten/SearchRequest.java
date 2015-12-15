package org.leibnizcenter.wetten;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by maarten on 15-12-15.
 */
public class SearchRequest {

    public static class Builder {
        private static final String URL = "http://zoekservice.overheid.nl/sru/Search";
        private static final String VERSION = "version";
        private static final String OPERATION = "operation";

        private Map<String, String> params = new HashMap<>(20);

        private static final String X_CONNECTION = "x-connection";

        private static final String QUERY = "query";

        {
            params.put(OPERATION, "searchRetrieve");
            params.put(VERSION, "1.2");
            params.put(X_CONNECTION, "BWB");
            params.put(QUERY, "overheidbwb.titel=aanbestedingswet");
        }

        private void setOperation(String op) {
            params.put(OPERATION, op);
        }

        private void setVersion(String op) {
            params.put(VERSION, op);
        }

        public void setxConnection(String xConnection) {
            params.put(X_CONNECTION, xConnection);
        }

        public void setQuery(Map<String,String> query){

        }
    }
}
