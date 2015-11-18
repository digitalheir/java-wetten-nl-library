import nl.wetten._schema.Expression;
import nl.wetten._schema.Work;
import org.junit.Assert;
import org.junit.Test;
import org.leibnizcenter.wetten.Manifestations;
import org.leibnizcenter.wetten.Works;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by maarten on 18-11-15.
 */
public class TestManifestations {
    @Test
    public void testBWBR0002458() throws IOException, JAXBException {
        Work work = Works.getWork("BWBR0002458");
        for (Expression expression : work.getExpression()) {
            String xml = Manifestations.getXml(work, expression);
            Assert.assertTrue(xml.length() > 0);

            InputStream is = Manifestations.streamXml(work, expression);

        }
    }
}
