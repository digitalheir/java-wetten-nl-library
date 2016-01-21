package nl.wetten.bwbng.toestand;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.InputStream;

/**
 * Created by maarten on 17-1-16.
 */
@XmlRootElement(name = "toestand")
public class Toestand {
    protected Wetgeving wetgeving;

    public Wetgeving getWetgeving() {
        return wetgeving;
    }

    public void setWetgeving(Wetgeving wetgeving) {
        this.wetgeving = wetgeving;
    }

    public static Toestand parse(InputStream stream) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Toestand.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        return (Toestand) jaxbUnmarshaller.unmarshal(stream);
    }
}
