//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.21 at 02:36:24 PM CEST 
//


package nl.wetten.bwbng.toestand;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
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
 *       &lt;sequence>
 *         &lt;element ref="{}kop" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element ref="{}citaat-artikel" maxOccurs="unbounded"/>
 *           &lt;element ref="{}lid" maxOccurs="unbounded"/>
 *           &lt;group ref="{}structuur.maximaal" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{}attlist.wetcitaat"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "kop",
    "citaatArtikel",
    "lid",
    "structuurMaximaal"
})
@XmlRootElement(name = "wetcitaat")
public class Wetcitaat {

    protected Kop kop;
    @XmlElement(name = "citaat-artikel")
    protected List<CitaatArtikel> citaatArtikel;
    protected List<Lid> lid;
    @XmlElementRefs({
        @XmlElementRef(name = "structuur.algemeen", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "table", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> structuurMaximaal;
    @XmlAttribute(name = "titel")
    @XmlSchemaType(name = "anySimpleType")
    protected String titel;
    @XmlAttribute(name = "id")
    @XmlSchemaType(name = "anySimpleType")
    protected String id;
    @XmlAttribute(name = "doc")
    @XmlSchemaType(name = "anySimpleType")
    protected String doc;
    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String lang;

    /**
     * Gets the value of the kop property.
     * 
     * @return
     *     possible object is
     *     {@link Kop }
     *     
     */
    public Kop getKop() {
        return kop;
    }

    /**
     * Sets the value of the kop property.
     * 
     * @param value
     *     allowed object is
     *     {@link Kop }
     *     
     */
    public void setKop(Kop value) {
        this.kop = value;
    }

    /**
     * Gets the value of the citaatArtikel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the citaatArtikel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCitaatArtikel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CitaatArtikel }
     * 
     * 
     */
    public List<CitaatArtikel> getCitaatArtikel() {
        if (citaatArtikel == null) {
            citaatArtikel = new ArrayList<CitaatArtikel>();
        }
        return this.citaatArtikel;
    }

    /**
     * Gets the value of the lid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLid().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Lid }
     * 
     * 
     */
    public List<Lid> getLid() {
        if (lid == null) {
            lid = new ArrayList<Lid>();
        }
        return this.lid;
    }

    /**
     * Gets the value of the structuurMaximaal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the structuurMaximaal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStructuurMaximaal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Formule }{@code >}
     * {@link JAXBElement }{@code <}{@link Lijst }{@code >}
     * {@link JAXBElement }{@code <}{@link Plaatje }{@code >}
     * {@link JAXBElement }{@code <}{@link Al }{@code >}
     * {@link JAXBElement }{@code <}{@link Specificatielijst }{@code >}
     * {@link JAXBElement }{@code <}{@link Citaat }{@code >}
     * {@link JAXBElement }{@code <}{@link Adres }{@code >}
     * {@link JAXBElement }{@code <}{@link LokaalStructuurLiType }{@code >}
     * {@link JAXBElement }{@code <}{@link Definitielijst }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Adreslijst }{@code >}
     * {@link JAXBElement }{@code <}{@link Tussenkop }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getStructuurMaximaal() {
        if (structuurMaximaal == null) {
            structuurMaximaal = new ArrayList<JAXBElement<?>>();
        }
        return this.structuurMaximaal;
    }

    /**
     * Gets the value of the titel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitel() {
        return titel;
    }

    /**
     * Sets the value of the titel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitel(String value) {
        this.titel = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
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
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

}