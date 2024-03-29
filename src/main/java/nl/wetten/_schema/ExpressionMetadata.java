//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.28 at 03:56:30 PM CET 
//


package nl.wetten._schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ExpressionMetadata complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExpressionMetadata">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="datum_inwerkingtreding" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="einddatum" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="zichtdatum_start" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="zichtdatum_eind" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="aankondiging" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="tijdstip_toegevoegd" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="tijdstip_laatste_wijziging" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpressionMetadata", propOrder = {
    "datumInwerkingtreding",
    "einddatum",
    "zichtdatumStart",
    "zichtdatumEind",
    "aankondiging",
    "tijdstipToegevoegd",
    "tijdstipLaatsteWijziging"
})
public class ExpressionMetadata {

    @XmlElement(name = "datum_inwerkingtreding", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumInwerkingtreding;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar einddatum;
    @XmlElement(name = "zichtdatum_start", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar zichtdatumStart;
    @XmlElement(name = "zichtdatum_eind", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar zichtdatumEind;
    protected Boolean aankondiging;
    @XmlElement(name = "tijdstip_toegevoegd")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tijdstipToegevoegd;
    @XmlElement(name = "tijdstip_laatste_wijziging")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tijdstipLaatsteWijziging;

    /**
     * Gets the value of the datumInwerkingtreding property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumInwerkingtreding() {
        return datumInwerkingtreding;
    }

    /**
     * Sets the value of the datumInwerkingtreding property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumInwerkingtreding(XMLGregorianCalendar value) {
        this.datumInwerkingtreding = value;
    }

    /**
     * Gets the value of the einddatum property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEinddatum() {
        return einddatum;
    }

    /**
     * Sets the value of the einddatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEinddatum(XMLGregorianCalendar value) {
        this.einddatum = value;
    }

    /**
     * Gets the value of the zichtdatumStart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getZichtdatumStart() {
        return zichtdatumStart;
    }

    /**
     * Sets the value of the zichtdatumStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setZichtdatumStart(XMLGregorianCalendar value) {
        this.zichtdatumStart = value;
    }

    /**
     * Gets the value of the zichtdatumEind property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getZichtdatumEind() {
        return zichtdatumEind;
    }

    /**
     * Sets the value of the zichtdatumEind property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setZichtdatumEind(XMLGregorianCalendar value) {
        this.zichtdatumEind = value;
    }

    /**
     * Gets the value of the aankondiging property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAankondiging() {
        return aankondiging;
    }

    /**
     * Sets the value of the aankondiging property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAankondiging(Boolean value) {
        this.aankondiging = value;
    }

    /**
     * Gets the value of the tijdstipToegevoegd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTijdstipToegevoegd() {
        return tijdstipToegevoegd;
    }

    /**
     * Sets the value of the tijdstipToegevoegd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTijdstipToegevoegd(XMLGregorianCalendar value) {
        this.tijdstipToegevoegd = value;
    }

    /**
     * Gets the value of the tijdstipLaatsteWijziging property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTijdstipLaatsteWijziging() {
        return tijdstipLaatsteWijziging;
    }

    /**
     * Sets the value of the tijdstipLaatsteWijziging property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTijdstipLaatsteWijziging(XMLGregorianCalendar value) {
        this.tijdstipLaatsteWijziging = value;
    }

}
