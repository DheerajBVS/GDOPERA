//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.22 at 04:53:58 PM IST 
//


package com.micros.webservices.og._4_3.hotelcommon;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PackageDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PackageDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PackageInfo" type="{http://webservices.micros.com/og/4.3/HotelCommon/}PackageElement"/>
 *         &lt;element name="ExpectedCharges" type="{http://webservices.micros.com/og/4.3/HotelCommon/}PackageCharges" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackageDetail", propOrder = {
    "packageInfo",
    "expectedCharges"
})
public class PackageDetail {

    @XmlElement(name = "PackageInfo", required = true)
    protected PackageElement packageInfo;
    @XmlElement(name = "ExpectedCharges")
    protected PackageCharges expectedCharges;

    /**
     * Gets the value of the packageInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PackageElement }
     *     
     */
    public PackageElement getPackageInfo() {
        return packageInfo;
    }

    /**
     * Sets the value of the packageInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackageElement }
     *     
     */
    public void setPackageInfo(PackageElement value) {
        this.packageInfo = value;
    }

    /**
     * Gets the value of the expectedCharges property.
     * 
     * @return
     *     possible object is
     *     {@link PackageCharges }
     *     
     */
    public PackageCharges getExpectedCharges() {
        return expectedCharges;
    }

    /**
     * Sets the value of the expectedCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackageCharges }
     *     
     */
    public void setExpectedCharges(PackageCharges value) {
        this.expectedCharges = value;
    }

}
