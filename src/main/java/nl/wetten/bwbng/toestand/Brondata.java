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
 *         &lt;element ref="{}voorbereiding" minOccurs="0"/>
 *         &lt;element ref="{}oorspronkelijk"/>
 *         &lt;element ref="{}voorlopigetoepassing" minOccurs="0"/>
 *         &lt;element ref="{}inwerkingtreding" minOccurs="0"/>
 *         &lt;element ref="{}aanhangig" minOccurs="0"/>
 *         &lt;element ref="{}opmerkingen-inhoud" minOccurs="0"/>
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
    "voorbereiding",
    "oorspronkelijk",
    "voorlopigetoepassing",
    "inwerkingtreding",
    "aanhangig",
    "opmerkingenInhoud"
})
@XmlRootElement(name = "brondata")
public class Brondata {

    protected Voorbereiding voorbereiding;
    @XmlElement(required = true)
    protected Oorspronkelijk oorspronkelijk;
    protected Voorlopigetoepassing voorlopigetoepassing;
    protected Inwerkingtreding inwerkingtreding;
    protected Aanhangig aanhangig;
    @XmlElement(name = "opmerkingen-inhoud")
    protected OpmerkingenInhoud opmerkingenInhoud;

    /**
     * Gets the value of the voorbereiding property.
     * 
     * @return
     *     possible object is
     *     {@link Voorbereiding }
     *     
     */
    public Voorbereiding getVoorbereiding() {
        return voorbereiding;
    }

    /**
     * Sets the value of the voorbereiding property.
     * 
     * @param value
     *     allowed object is
     *     {@link Voorbereiding }
     *     
     */
    public void setVoorbereiding(Voorbereiding value) {
        this.voorbereiding = value;
    }

    /**
     * Gets the value of the oorspronkelijk property.
     * 
     * @return
     *     possible object is
     *     {@link Oorspronkelijk }
     *     
     */
    public Oorspronkelijk getOorspronkelijk() {
        return oorspronkelijk;
    }

    /**
     * Sets the value of the oorspronkelijk property.
     * 
     * @param value
     *     allowed object is
     *     {@link Oorspronkelijk }
     *     
     */
    public void setOorspronkelijk(Oorspronkelijk value) {
        this.oorspronkelijk = value;
    }

    /**
     * Gets the value of the voorlopigetoepassing property.
     * 
     * @return
     *     possible object is
     *     {@link Voorlopigetoepassing }
     *     
     */
    public Voorlopigetoepassing getVoorlopigetoepassing() {
        return voorlopigetoepassing;
    }

    /**
     * Sets the value of the voorlopigetoepassing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Voorlopigetoepassing }
     *     
     */
    public void setVoorlopigetoepassing(Voorlopigetoepassing value) {
        this.voorlopigetoepassing = value;
    }

    /**
     * Gets the value of the inwerkingtreding property.
     * 
     * @return
     *     possible object is
     *     {@link Inwerkingtreding }
     *     
     */
    public Inwerkingtreding getInwerkingtreding() {
        return inwerkingtreding;
    }

    /**
     * Sets the value of the inwerkingtreding property.
     * 
     * @param value
     *     allowed object is
     *     {@link Inwerkingtreding }
     *     
     */
    public void setInwerkingtreding(Inwerkingtreding value) {
        this.inwerkingtreding = value;
    }

    /**
     * Gets the value of the aanhangig property.
     * 
     * @return
     *     possible object is
     *     {@link Aanhangig }
     *     
     */
    public Aanhangig getAanhangig() {
        return aanhangig;
    }

    /**
     * Sets the value of the aanhangig property.
     * 
     * @param value
     *     allowed object is
     *     {@link Aanhangig }
     *     
     */
    public void setAanhangig(Aanhangig value) {
        this.aanhangig = value;
    }

    /**
     * Gets the value of the opmerkingenInhoud property.
     * 
     * @return
     *     possible object is
     *     {@link OpmerkingenInhoud }
     *     
     */
    public OpmerkingenInhoud getOpmerkingenInhoud() {
        return opmerkingenInhoud;
    }

    /**
     * Sets the value of the opmerkingenInhoud property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpmerkingenInhoud }
     *     
     */
    public void setOpmerkingenInhoud(OpmerkingenInhoud value) {
        this.opmerkingenInhoud = value;
    }

}