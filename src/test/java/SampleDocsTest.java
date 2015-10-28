import nl.wetten._schema.Work;
import org.junit.Assert;
import org.junit.Test;
import org.leibnizcenter.wetten.BwbInterface;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.io.StringWriter;

/**
 * Created by Maarten on 28/10/2015.
 */
public class SampleDocsTest {

    @Test
    public void testBWBR0002458() {
        InputStream is = this.getClass().getResourceAsStream("BWBR0002458/manifest.xml");

        try {
            Work w = Work.parse(is);
            w.getCurrentItem();
            Assert.assertEquals(w.getMetadata().getDatumInwerkingtreding().toString(), "1966-05-01");
            Assert.assertEquals(w.getLatestItem(), "2015-01-01_0/xml/BWBR0002458_2015-01-01_0.xml");
            Assert.assertEquals(w.getLabel(), "BWBR0002458");
            Assert.assertEquals(w.getExpression().size(), 16);
        } catch (JAXBException e) {
            throw new Error(e);
        }
    }

    static String convertStreamToString(java.io.InputStream is) {
        java.util.Scanner s = new java.util.Scanner(is).useDelimiter("\\A");
        return s.hasNext() ? s.next() : "";
    }
}
