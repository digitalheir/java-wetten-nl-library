//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.21 at 02:36:24 PM CEST 
//


package nl.wetten.bwbng.toestand;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attGroup ref="{}attlist.omissie"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "omissie")
public class Omissie {

    @XmlAttribute(name = "reden")
    @XmlSchemaType(name = "anySimpleType")
    protected String reden;
    @XmlAttribute(name = "bron")
    @XmlSchemaType(name = "anySimpleType")
    protected String bron;
    @XmlAttribute(name = "plaatsing")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String plaatsing;

    /**
     * Gets the value of the reden property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReden() {
        return reden;
    }

    /**
     * Sets the value of the reden property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReden(String value) {
        this.reden = value;
    }

    /**
     * Gets the value of the bron property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBron() {
        return bron;
    }

    /**
     * Sets the value of the bron property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBron(String value) {
        this.bron = value;
    }

    /**
     * Gets the value of the plaatsing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaatsing() {
        if (plaatsing == null) {
            return "inline";
        } else {
            return plaatsing;
        }
    }

    /**
     * Sets the value of the plaatsing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaatsing(String value) {
        this.plaatsing = value;
    }

}
