//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.15 at 10:14:31 PM CET 
//


package gov.loc.zing.srw;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for explainRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="explainRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.loc.gov/zing/srw/}requestType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.loc.gov/zing/srw/}recordPacking" minOccurs="0"/>
 *         &lt;element ref="{http://www.loc.gov/zing/srw/}stylesheet" minOccurs="0"/>
 *         &lt;element ref="{http://www.loc.gov/zing/srw/}extraRequestData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "explainRequestType", propOrder = {
    "recordPacking",
    "stylesheet",
    "extraRequestData"
})
public class ExplainRequestType
    extends RequestType
{

    protected String recordPacking;
    @XmlSchemaType(name = "anyURI")
    protected String stylesheet;
    protected ExtraDataType extraRequestData;

    /**
     * Gets the value of the recordPacking property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordPacking() {
        return recordPacking;
    }

    /**
     * Sets the value of the recordPacking property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordPacking(String value) {
        this.recordPacking = value;
    }

    /**
     * Gets the value of the stylesheet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStylesheet() {
        return stylesheet;
    }

    /**
     * Sets the value of the stylesheet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStylesheet(String value) {
        this.stylesheet = value;
    }

    /**
     * Gets the value of the extraRequestData property.
     * 
     * @return
     *     possible object is
     *     {@link ExtraDataType }
     *     
     */
    public ExtraDataType getExtraRequestData() {
        return extraRequestData;
    }

    /**
     * Sets the value of the extraRequestData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtraDataType }
     *     
     */
    public void setExtraRequestData(ExtraDataType value) {
        this.extraRequestData = value;
    }

}
