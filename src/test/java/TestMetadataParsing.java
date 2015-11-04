import junit.framework.Assert;
import nl.wetten._schema.*;
import nl.wetten.bwbng.wti.WetstechnischeInformatie;
import org.junit.Test;
import org.leibnizcenter.wetten.Const;
import org.xml.sax.SAXException;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.text.ParseException;

/**
 * Created by maarten on 4-11-15.
 */
public class TestMetadataParsing {

    @Test
    public void importBWBR0002458_20140215_0() throws JAXBException {
        Class clazz = this.getClass();
        String bwbId = "BWBR0002458";
        Work work = Work.parse(clazz.getResourceAsStream("/" + bwbId + "/manifest.xml"));
        WetstechnischeInformatie wti = WetstechnischeInformatie.parse(clazz.getResourceAsStream("/" + bwbId + "/" + bwbId + ".WTI"));

        Assert.assertEquals(work.getLabel(), bwbId);
        Assert.assertEquals(work.getGegenereerd().toString(), "2015-03-05T12:02:11.2062766+01:00");
        Assert.assertEquals(work.getLatestItem(), "2015-01-01_0/xml/BWBR0002458_2015-01-01_0.xml");

        WorkMetadata metadata = work.getMetadata();
        assertThingsAboutBWBR0002458Metadata(metadata);

        Assert.assertEquals(work.getExpression().size(), 16);
        Expression e = work.getExpression().get(0);
        assertThingsAbout_BWBR0002458_2000_11_01_0(e);

        Manifestation m = e.getManifestation().get(0);

        Assert.assertEquals(m.getLabel(), "xml");
        Assert.assertEquals(m.getItem().size(), 1);
        Assert.assertEquals(m.getMetadata().getHashcode().trim(), "6f9fb47f1f18d1fc19b8c24fa7ef9d4bf1f37b5dc7d525742393f131b0a152601d9b8272bff50ab458935c14df674c3b2340a3c3b8a5d30a340d7ddcd88c1c9c");
        Assert.assertEquals(m.getMetadata().getSize().trim(), "236704");

        Item i = m.getItem().get(0);

        Assert.assertEquals(i.getLabel(), "BWBR0002458_2000-11-01_0.xml");
        Assert.assertEquals(i.getSubitem().size(), 0);
        Assert.assertEquals(i.isDeleted(), Boolean.FALSE);

        String itemPath = "/" + bwbId + "/" + "2014-02-15_0" + "/xml/" + "BWBR0002458_2014-02-15_0.xml";

        //TODO etc
    }

    private void assertThingsAbout_BWBR0002458_2000_11_01_0(Expression e) {
        Assert.assertEquals(e.getManifestation().size(), 1);
        Assert.assertEquals(e.getLabel(), "2000-11-01_0");
        Assert.assertEquals(e.getMetadata().getDatumInwerkingtreding().toString(), "2000-11-01");
        Assert.assertEquals(e.getMetadata().isAankondiging(), null);
        Assert.assertEquals(e.getMetadata().getEinddatum().toString(), "2002-06-30");
        Assert.assertEquals(e.getMetadata().getZichtdatumStart().toString(), "2000-11-01");
        Assert.assertEquals(e.getMetadata().getZichtdatumEind().toString(), "9999-12-31");
        Assert.assertEquals(e.getMetadata().getTijdstipToegevoegd().toString(), "2015-02-17T17:25:40+01:00");
        Assert.assertEquals(e.getMetadata().getTijdstipLaatsteWijziging().toString(), "2015-02-17T17:25:40+01:00");
    }

    private void assertThingsAboutBWBR0002458Metadata(WorkMetadata metadata) {
        Assert.assertEquals(metadata.getWtiLocatie(), "BWBR0002458.WTI");
        Assert.assertEquals(metadata.getDatumTotstandkoming(), null);
        Assert.assertEquals(metadata.getDatumVoorlopigeToepassing(), null);
        Assert.assertEquals(metadata.getDatumInwerkingtreding().toString(), "1966-05-01");
        Assert.assertEquals(metadata.getDatumMaterieleUitwerking(), null);
        Assert.assertEquals(metadata.getDatumIntrekking(), null);
        Assert.assertEquals(metadata.getDatumTerugwerkingVt(), null);
        Assert.assertEquals(metadata.getScopeTerugwerkingVt(), null);
        Assert.assertEquals(metadata.getDatumTerugwerkingIwt(), null);
        Assert.assertEquals(metadata.getScopeTerugwerkingIwt(), null);
        Assert.assertEquals(metadata.getDatumTerugwerkingInt(), null);
        Assert.assertEquals(metadata.getScopeTerugwerkingInt(), null);
        Assert.assertEquals(metadata.getTijdstipWtiToegevoegd().toString(), "2015-02-18T07:39:49+01:00");
        Assert.assertEquals(metadata.getTijdstipLaatsteWijzigingWti().toString(), "2015-03-05T12:01:54+01:00");
    }
}
