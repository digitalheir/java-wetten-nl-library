//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.21 at 02:36:51 PM CEST 
//


package nl.wetten.bwbng.wti;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="label" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="groep" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="doc" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="anker" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="bwb-id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="eurlex" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="label-id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="verwijzing-id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "value"
})
@XmlRootElement(name = "extref")
public class Extref {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "label")
    protected String label;
    @XmlAttribute(name = "groep")
    protected String groep;
    @XmlAttribute(name = "doc")
    protected String doc;
    @XmlAttribute(name = "anker")
    protected String anker;
    @XmlAttribute(name = "bwb-id")
    protected String bwbId;
    @XmlAttribute(name = "eurlex")
    protected String eurlex;
    @XmlAttribute(name = "label-id")
    protected String labelId;
    @XmlAttribute(name = "verwijzing-id")
    protected String verwijzingId;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

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
     * Gets the value of the groep property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroep() {
        return groep;
    }

    /**
     * Sets the value of the groep property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroep(String value) {
        this.groep = value;
    }

    /**
     * Gets the value of the doc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDoc() {
        return doc;
    }

    /**
     * Sets the value of the doc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDoc(String value) {
        this.doc = value;
    }

    /**
     * Gets the value of the anker property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnker() {
        return anker;
    }

    /**
     * Sets the value of the anker property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnker(String value) {
        this.anker = value;
    }

    /**
     * Gets the value of the bwbId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBwbId() {
        return bwbId;
    }

    /**
     * Sets the value of the bwbId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBwbId(String value) {
        this.bwbId = value;
    }

    /**
     * Gets the value of the eurlex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEurlex() {
        return eurlex;
    }

    /**
     * Sets the value of the eurlex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEurlex(String value) {
        this.eurlex = value;
    }

    /**
     * Gets the value of the labelId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabelId() {
        return labelId;
    }

    /**
     * Sets the value of the labelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabelId(String value) {
        this.labelId = value;
    }

    /**
     * Gets the value of the verwijzingId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerwijzingId() {
        return verwijzingId;
    }

    /**
     * Sets the value of the verwijzingId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerwijzingId(String value) {
        this.verwijzingId = value;
    }

}
