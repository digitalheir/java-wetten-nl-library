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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for class.inhoud complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="class.inhoud">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}kop" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{}inhoud" maxOccurs="unbounded"/>
 *           &lt;element ref="{}inhoud-groep"/>
 *           &lt;element ref="{}table"/>
 *           &lt;element ref="{}al" maxOccurs="unbounded"/>
 *         &lt;/choice>
 *         &lt;group ref="{}lokaal.structuur.formeel"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "class.inhoud", propOrder = {
    "kop",
    "inhoud",
    "inhoudGroep",
    "table",
    "al",
    "metaData"
})
@XmlSeeAlso({
    OfficieleInhoudsopgave.class
})
public class ClassInhoud {

    protected Kop kop;
    protected List<Inhoud> inhoud;
    @XmlElement(name = "inhoud-groep")
    protected InhoudGroep inhoudGroep;
    protected LokaalStructuurLiType table;
    protected List<Al> al;
    @XmlElement(name = "meta-data")
    protected MetaData metaData;

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
     * Gets the value of the inhoud property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inhoud property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInhoud().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Inhoud }
     * 
     * 
     */
    public List<Inhoud> getInhoud() {
        if (inhoud == null) {
            inhoud = new ArrayList<Inhoud>();
        }
        return this.inhoud;
    }

    /**
     * Gets the value of the inhoudGroep property.
     * 
     * @return
     *     possible object is
     *     {@link InhoudGroep }
     *     
     */
    public InhoudGroep getInhoudGroep() {
        return inhoudGroep;
    }

    /**
     * Sets the value of the inhoudGroep property.
     * 
     * @param value
     *     allowed object is
     *     {@link InhoudGroep }
     *     
     */
    public void setInhoudGroep(InhoudGroep value) {
        this.inhoudGroep = value;
    }

    /**
     * Gets the value of the table property.
     * 
     * @return
     *     possible object is
     *     {@link LokaalStructuurLiType }
     *     
     */
    public LokaalStructuurLiType getTable() {
        return table;
    }

    /**
     * Sets the value of the table property.
     * 
     * @param value
     *     allowed object is
     *     {@link LokaalStructuurLiType }
     *     
     */
    public void setTable(LokaalStructuurLiType value) {
        this.table = value;
    }

    /**
     * Gets the value of the al property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the al property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Al }
     * 
     * 
     */
    public List<Al> getAl() {
        if (al == null) {
            al = new ArrayList<Al>();
        }
        return this.al;
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

}