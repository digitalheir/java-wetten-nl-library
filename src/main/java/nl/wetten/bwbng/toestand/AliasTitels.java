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
 *         &lt;element ref="{}alias-titel" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}afkorting" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{}attlist.alias-titels"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "aliasTitel",
    "afkorting"
})
@XmlRootElement(name = "alias-titels")
public class AliasTitels {

    @XmlElement(name = "alias-titel")
    protected List<AliasTitel> aliasTitel;
    protected List<Afkorting> afkorting;

    /**
     * Gets the value of the aliasTitel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aliasTitel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAliasTitel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AliasTitel }
     * 
     * 
     */
    public List<AliasTitel> getAliasTitel() {
        if (aliasTitel == null) {
            aliasTitel = new ArrayList<AliasTitel>();
        }
        return this.aliasTitel;
    }

    /**
     * Gets the value of the afkorting property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the afkorting property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAfkorting().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Afkorting }
     * 
     * 
     */
    public List<Afkorting> getAfkorting() {
        if (afkorting == null) {
            afkorting = new ArrayList<Afkorting>();
        }
        return this.afkorting;
    }

}
