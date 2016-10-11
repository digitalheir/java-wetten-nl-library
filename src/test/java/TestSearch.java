import com.squareup.okhttp.HttpUrl;
import gov.loc.zing.srw.RecordType;
import gov.loc.zing.srw.SearchRetrieveResponseType;
import gov.loc.zing.srw.StringOrXmlFragment;
import junit.framework.Assert;
import org.junit.Test;
import org.leibnizcenter.wetten.Search;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 */
public class TestSearch {

    @Test
    public void testUrlBuilder() {
        Search.Builder b = new Search.Builder();
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
        Search req = Search.withQuery("overheidbwb.titel","aanbestedingswet");
        SearchRetrieveResponseType res = req.next();
        Assert.assertTrue(13 < res.getRecords().getRecord().size());
        for (RecordType r : res.getRecords().getRecord()) {
            Assert.assertTrue(1 == r.getRecordData().getElements().size());
            StringOrXmlFragment recordData = r.getRecordData();
            Element e = recordData.getElement();
            Assert.assertNotNull(e);
            Assert.assertNotNull(recordData.getAuthority());
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
    public void testRequestModifiedLaterThanJanuary2016() throws IOException, JAXBException {
        Search req = Search.withQuery(Search.QueryVars.modified+">=2016-01-01");
        SearchRetrieveResponseType res = req.next();
        Assert.assertTrue(1 == res.getNumberOfRecords().compareTo(BigInteger.valueOf(50000L)));
        for (RecordType r : res.getRecords().getRecord()) {
            Element gzd = r.getRecordData().getElement();
            String d = getModified(gzd);
            Assert.assertNotNull(d);
            Assert.assertTrue("2016-01-00".compareTo(d) < 0);
        }
    }

    private String getModified(Element gzd) {
        NodeList gzdCh = gzd.getChildNodes();
        for(int i=0;i<gzdCh.getLength();i++){
            Node ch =gzdCh.item(i);
            if(ch.getNodeType() == Node.ELEMENT_NODE && ch.getNodeName().equals("originalData")){
                Element chEl = (Element) ch;
                NodeList el = chEl.getElementsByTagName("dcterms:modified");
                return el.item(0).getTextContent();
            }
        }
//        originalData>
//        <overheidbwb:meta>
//        <owmskern>
//        <dcterms:identifier>BWBR0001821</dcterms:identifier>
//        <dcterms:title>Loi concernant les Mines, les Minières et les Carrières</dcterms:title>
//        <dcterms:type>wet</dcterms:type>
//        <dcterms:language>nl</dcterms:language>
//        <overheid:authority>Economische Zaken</overheid:authority>
//        <dcterms:creator>Ministerie van Binnenlandse Zaken en Koninkrijksrelaties</dcterms:creator>
//        <dcterms:modified>2016-01-12</dcterms:modified>
        return null;
    }

    @Test
    public void testPageIterator() throws IOException, JAXBException {
        Search sr =
                new Search.Builder()
                        .setMax(1000)
                        .setQuery(Search.QueryVars.type,
                                Search.Type.ministerieleregelingarchiefselectielijst+"").build();

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
        Assert.assertEquals(i, -1);
    }
}
