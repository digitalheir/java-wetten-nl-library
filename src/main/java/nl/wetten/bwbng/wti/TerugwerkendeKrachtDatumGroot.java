//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.21 at 02:36:51 PM CEST 
//


package nl.wetten.bwbng.wti;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for terugwerkende-kracht-datum-groot complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="terugwerkende-kracht-datum-groot">
 *   &lt;complexContent>
 *     &lt;extension base="{}terugwerkende-kracht-datum-klein">
 *       &lt;sequence>
 *         &lt;element name="artikelen" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "terugwerkende-kracht-datum-groot", propOrder = {
    "artikelen"
})
public class TerugwerkendeKrachtDatumGroot
    extends TerugwerkendeKrachtDatumKlein
{

    protected TerugwerkendeKrachtDatumGroot.Artikelen artikelen;

    /**
     * Gets the value of the artikelen property.
     * 
     * @return
     *     possible object is
     *     {@link TerugwerkendeKrachtDatumGroot.Artikelen }
     *     
     */
    public TerugwerkendeKrachtDatumGroot.Artikelen getArtikelen() {
        return artikelen;
    }

    /**
     * Sets the value of the artikelen property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerugwerkendeKrachtDatumGroot.Artikelen }
     *     
     */
    public void setArtikelen(TerugwerkendeKrachtDatumGroot.Artikelen value) {
        this.artikelen = value;
    }


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
     *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
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
        "label"
    })
    public static class Artikelen {

        @XmlElement(required = true)
        protected List<String> label;

        /**
         * Gets the value of the label property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the label property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLabel().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getLabel() {
            if (label == null) {
                label = new ArrayList<String>();
            }
            return this.label;
        }

    }

}
