//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.21 at 02:36:24 PM CEST 
//


package nl.wetten.bwbng.toestand;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element ref="{}dagtekening" minOccurs="0"/>
 *         &lt;element ref="{}slotformulering" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;element ref="{}gegeven"/>
 *           &lt;element ref="{}ondertekenaar"/>
 *           &lt;element ref="{}ondertekening"/>
 *         &lt;/choice>
 *         &lt;element ref="{}uitgifte" minOccurs="0"/>
 *         &lt;element ref="{}goedkeuring" minOccurs="0"/>
 *         &lt;group ref="{}lokaal.structuur.formeel"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{}attlist.bijlage-sluiting"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "dagtekening",
    "slotformulering",
    "gegevenOrOndertekenaarOrOndertekening",
    "uitgifte",
    "goedkeuring",
    "metaData"
})
@XmlRootElement(name = "bijlage-sluiting")
public class BijlageSluiting {

    protected Dagtekening dagtekening;
    protected Slotformulering slotformulering;
    @XmlElements({
        @XmlElement(name = "gegeven", type = Gegeven.class),
        @XmlElement(name = "ondertekenaar", type = Ondertekenaar.class),
        @XmlElement(name = "ondertekening", type = ClassOndertekening.class)
    })
    protected List<Object> gegevenOrOndertekenaarOrOndertekening;
    protected Uitgifte uitgifte;
    protected Goedkeuring goedkeuring;
    @XmlElement(name = "meta-data")
    protected MetaData metaData;
    @XmlAttribute(name = "terugwerking")
    @XmlSchemaType(name = "anySimpleType")
    protected String terugwerking;

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
     * Gets the value of the slotformulering property.
     * 
     * @return
     *     possible object is
     *     {@link Slotformulering }
     *     
     */
    public Slotformulering getSlotformulering() {
        return slotformulering;
    }

    /**
     * Sets the value of the slotformulering property.
     * 
     * @param value
     *     allowed object is
     *     {@link Slotformulering }
     *     
     */
    public void setSlotformulering(Slotformulering value) {
        this.slotformulering = value;
    }

    /**
     * Gets the value of the gegevenOrOndertekenaarOrOndertekening property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gegevenOrOndertekenaarOrOndertekening property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGegevenOrOndertekenaarOrOndertekening().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Gegeven }
     * {@link Ondertekenaar }
     * {@link ClassOndertekening }
     * 
     * 
     */
    public List<Object> getGegevenOrOndertekenaarOrOndertekening() {
        if (gegevenOrOndertekenaarOrOndertekening == null) {
            gegevenOrOndertekenaarOrOndertekening = new ArrayList<Object>();
        }
        return this.gegevenOrOndertekenaarOrOndertekening;
    }

    /**
     * Gets the value of the uitgifte property.
     * 
     * @return
     *     possible object is
     *     {@link Uitgifte }
     *     
     */
    public Uitgifte getUitgifte() {
        return uitgifte;
    }

    /**
     * Sets the value of the uitgifte property.
     * 
     * @param value
     *     allowed object is
     *     {@link Uitgifte }
     *     
     */
    public void setUitgifte(Uitgifte value) {
        this.uitgifte = value;
    }

    /**
     * Gets the value of the goedkeuring property.
     * 
     * @return
     *     possible object is
     *     {@link Goedkeuring }
     *     
     */
    public Goedkeuring getGoedkeuring() {
        return goedkeuring;
    }

    /**
     * Sets the value of the goedkeuring property.
     * 
     * @param value
     *     allowed object is
     *     {@link Goedkeuring }
     *     
     */
    public void setGoedkeuring(Goedkeuring value) {
        this.goedkeuring = value;
    }

    /**
     * Gets the value of the metaData property.
     * 
     * @return
     *     possible object is
     *     {@link MetaData }
     *     
     */
    public MetaData getMetaData() {
        return metaData;
    }

    /**
     * Sets the value of the metaData property.
     * 
     * @param value
     *     allowed object is
     *     {@link MetaData }
     *     
     */
    public void setMetaData(MetaData value) {
        this.metaData = value;
    }

    /**
     * Gets the value of the terugwerking property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerugwerking() {
        return terugwerking;
    }

    /**
     * Sets the value of the terugwerking property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerugwerking(String value) {
        this.terugwerking = value;
    }

}
