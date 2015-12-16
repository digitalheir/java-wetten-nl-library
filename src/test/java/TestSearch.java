import com.squareup.okhttp.HttpUrl;
import gov.loc.zing.srw.RecordType;
import gov.loc.zing.srw.SearchRetrieveResponseType;
import gov.loc.zing.srw.StringOrXmlFragment;
import junit.framework.Assert;
import org.junit.Test;
import org.leibnizcenter.wetten.SearchRequest;
import org.w3c.dom.Element;

import javax.xml.bind.JAXBException;
import java.io.IOException;

/**
 */
public class TestSearch {

    @Test
    public void testUrlBuilder() {
        SearchRequest.Builder b = new SearchRequest.Builder();
        b.setQuery("overheidbwb.titel=aanbestedingswet");
        b.setxConnection("BWB");
        HttpUrl url = HttpUrl.parse("http://zoekservice.overheid.nl/sru/Search?" +
                "operation=searchRetrieve" +
                "&version=1.2" +
                "&query=overheidbwb.titel%3Daanbestedingswet" +
                "&x-connection=BWB"
        );
        Assert.assertEquals(b.buildUrl(), (url));
    }

    @Test
    public void testRequest() throws IOException, JAXBException {
        SearchRequest req = new SearchRequest.Builder().setQuery("overheidbwb.titel%3Daanbestedingswet").build();
        SearchRetrieveResponseType res = req.next();
        Assert.assertTrue(13 < res.getRecords().getRecord().size());
        for (RecordType r : res.getRecords().getRecord()) {
            Assert.assertTrue(1 == r.getRecordData().getElements().size());
            StringOrXmlFragment recordData = r.getRecordData();
            Element e = recordData.getElement();
            Assert.assertNotNull(e);
            Assert.assertNotNull(recordData.getAuthority().matches("[]]"));
            Assert.assertNotNull(recordData.getGovernmentalDomain());
            Assert.assertNotNull(recordData.getLanguage());
            Assert.assertNotNull(recordData.getModified());

            String validStart = recordData.getValidStart();
            Assert.assertTrue(validStart.matches("^[0-9]{4}.*"));
            Assert.assertTrue(recordData.getValidEnd().matches("^[0-9]{4}.*"));
            Assert.assertTrue(recordData.getVisibleStart().matches("^[0-9]{4}.*"));
            Assert.assertTrue(recordData.getVisibleEnd().matches("^[0-9]{4}.*"));

            Assert.assertTrue(recordData.getLegalAreas().length > 0);
            Assert.assertTrue(recordData.getIdentifier().startsWith("BWB"));
        }
    }

    @Test
    public void testPageIterator() throws IOException, JAXBException {
        SearchRequest sr =
                new SearchRequest.Builder()
                        .setMax(1000)
                        .setQuery(SearchRequest.QueryVars.type,
                                SearchRequest.Type.ministerieleregelingarchiefselectielijst).build();

        int i = 1;
        while (sr.hasNext()) {
            SearchRetrieveResponseType result = sr.next();
            if (result.getNextRecordPosition() == null) {
                org.junit.Assert.assertTrue(i > 1000);
                i = -1;
            } else {
                i += 1000;
                Assert.assertEquals(i, result.getNextRecordPosition().intValue());
            }
        }
        Assert.assertEquals(i,-1);
    }
}
