package org.leibnizcenter.wetten;


import com.squareup.okhttp.HttpUrl;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import nl.wetten._schema.Expression;
import nl.wetten._schema.Item;
import nl.wetten._schema.Work;
import nl.wetten.bwbng.wti.WetstechnischeInformatie;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Maarten on 21/10/2015.
 */
public class Const {
    public static final String HTTPS_REPOSITORY_OFFICIELE_OVERHEIDSPUBLICATIES_NL_BWB =
            "https://repository.officiele-overheidspublicaties.nl/bwb/";
}
