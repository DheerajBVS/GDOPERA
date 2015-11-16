//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.22 at 04:48:57 PM IST 
//


package com.micros.webservices.og._4_3.availability;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import com.micros.webservices.og._4_3.hotelcommon.RegionalSearchCodeType;


/**
 * <p>Java class for RegionalSearchCode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegionalSearchCode">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="regionalSearchCodeType" use="required" type="{http://webservices.micros.com/og/4.3/HotelCommon/}RegionalSearchCodeType" />
 *       &lt;attribute name="otherRegionalSearchCodeType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegionalSearchCode", propOrder = {
    "value"
})
public class RegionalSearchCode {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "regionalSearchCodeType", required = true)
    protected RegionalSearchCodeType regionalSearchCodeType;
    @XmlAttribute(name = "otherRegionalSearchCodeType")
    @XmlSchemaType(name = "anySimpleType")
    protected String otherRegionalSearchCodeType;

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
     * Gets the value of the regionalSearchCodeType property.
     * 
     * @return
     *     possible object is
     *     {@link RegionalSearchCodeType }
     *     
     */
    public RegionalSearchCodeType getRegionalSearchCodeType() {
        return regionalSearchCodeType;
    }

    /**
     * Sets the value of the regionalSearchCodeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegionalSearchCodeType }
     *     
     */
    public void setRegionalSearchCodeType(RegionalSearchCodeType value) {
        this.regionalSearchCodeType = value;
    }

    /**
     * Gets the value of the otherRegionalSearchCodeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherRegionalSearchCodeType() {
        return otherRegionalSearchCodeType;
    }

    /**
     * Sets the value of the otherRegionalSearchCodeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherRegionalSearchCodeType(String value) {
        this.otherRegionalSearchCodeType = value;
    }

}
