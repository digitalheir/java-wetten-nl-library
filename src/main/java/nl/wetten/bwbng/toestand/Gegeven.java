//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.21 at 02:36:24 PM CEST 
//


package nl.wetten.bwbng.toestand;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}label" minOccurs="0"/>
 *         &lt;element ref="{}dagtekening"/>
 *         &lt;element ref="{}koning" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "label",
    "dagtekening",
    "koning"
})
@XmlRootElement(name = "gegeven")
public class Gegeven {

    protected String label;
    @XmlElement(required = true)
    protected Dagtekening dagtekening;
    protected String koning;

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the dagtekening property.
     * 
     * @return
     *     possible object is
     *     {@link Dagtekening }
     *     
     */
    public Dagtekening getDagtekening() {
        return dagtekening;
    }

    /**
     * Sets the value of the dagtekening property.
     * 
     * @param value
     *     allowed object is
     *     {@link Dagtekening }
     *     
     */
    public void setDagtekening(Dagtekening value) {
        this.dagtekening = value;
    }

    /**
     * Gets the value of the koning property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKoning() {
        return koning;
    }

    /**
     * Sets the value of the koning property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKoning(String value) {
        this.koning = value;
    }

}