//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.15 at 02:04:00 PM CET 
//


package gov.loc.zing.srw.diagnostic;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gov.loc.zing.srw.diagnostic package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Details_QNAME = new QName("http://www.loc.gov/zing/srw/diagnostic/", "details");
    private final static QName _Diagnostic_QNAME = new QName("http://www.loc.gov/zing/srw/diagnostic/", "diagnostic");
    private final static QName _Message_QNAME = new QName("http://www.loc.gov/zing/srw/diagnostic/", "message");
    private final static QName _Uri_QNAME = new QName("http://www.loc.gov/zing/srw/diagnostic/", "uri");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gov.loc.zing.srw.diagnostic
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DiagnosticType }
     * 
     */
    public DiagnosticType createDiagnosticType() {
        return new DiagnosticType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.loc.gov/zing/srw/diagnostic/", name = "details")
    public JAXBElement<String> createDetails(String value) {
        return new JAXBElement<String>(_Details_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DiagnosticType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.loc.gov/zing/srw/diagnostic/", name = "diagnostic")
    public JAXBElement<DiagnosticType> createDiagnostic(DiagnosticType value) {
        return new JAXBElement<DiagnosticType>(_Diagnostic_QNAME, DiagnosticType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.loc.gov/zing/srw/diagnostic/", name = "message")
    public JAXBElement<String> createMessage(String value) {
        return new JAXBElement<String>(_Message_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.loc.gov/zing/srw/diagnostic/", name = "uri")
    public JAXBElement<String> createUri(String value) {
        return new JAXBElement<String>(_Uri_QNAME, String.class, null, value);
    }

}
