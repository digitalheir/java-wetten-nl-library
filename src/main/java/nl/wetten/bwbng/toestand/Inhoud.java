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
 *         &lt;element ref="{}nr" minOccurs="0"/>
 *         &lt;element ref="{}titel"/>
 *         &lt;element ref="{}subtitel" minOccurs="0"/>
 *         &lt;element ref="{}paginanr" minOccurs="0"/>
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
    "nr",
    "titel",
    "subtitel",
    "paginanr"
})
@XmlRootElement(name = "inhoud")
public class Inhoud {

    protected Nr nr;
    @XmlElement(required = true)
    protected Titel titel;
    protected ClassTitel subtitel;
    protected String paginanr;

    /**
     * Gets the value of the nr property.
     * 
     * @return
     *     possible object is
     *     {@link Nr }
     *     
     */
    public Nr getNr() {
        return nr;
    }

    /**
     * Sets the value of the nr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Nr }
     *     
     */
    public void setNr(Nr value) {
        this.nr = value;
    }

    /**
     * Gets the value of the titel property.
     * 
     * @return
     *     possible object is
     *     {@link Titel }
     *     
     */
    public Titel getTitel() {
        return titel;
    }

    /**
     * Sets the value of the titel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Titel }
     *     
     */
    public void setTitel(Titel value) {
        this.titel = value;
    }

    /**
     * Gets the value of the subtitel property.
     * 
     * @return
     *     possible object is
     *     {@link ClassTitel }
     *     
     */
    public ClassTitel getSubtitel() {
        return subtitel;
    }

    /**
     * Sets the value of the subtitel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassTitel }
     *     
     */
    public void setSubtitel(ClassTitel value) {
        this.subtitel = value;
    }

    /**
     * Gets the value of the paginanr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaginanr() {
        return paginanr;
    }

    /**
     * Sets the value of the paginanr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaginanr(String value) {
        this.paginanr = value;
    }

}