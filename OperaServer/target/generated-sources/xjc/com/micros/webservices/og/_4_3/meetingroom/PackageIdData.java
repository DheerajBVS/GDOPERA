//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.16 at 01:21:05 PM IST 
//


package com.micros.webservices.og._4_3.meetingroom;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.micros.webservices.og._4_3.common.UniqueID;
import com.micros.webservices.og._4_3.hotelcommon.TimeSpan;


/**
 * <p>Java class for PackageIdData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PackageIdData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PackageID" type="{http://webservices.micros.com/og/4.3/Common/}UniqueID"/>
 *         &lt;element name="PackageDate" type="{http://webservices.micros.com/og/4.3/HotelCommon/}TimeSpan" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackageIdData", propOrder = {
    "packageID",
    "packageDate"
})
public class PackageIdData {

    @XmlElement(name = "PackageID", required = true)
    protected UniqueID packageID;
    @XmlElement(name = "PackageDate")
    protected TimeSpan packageDate;

    /**
     * Gets the value of the packageID property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueID }
     *     
     */
    public UniqueID getPackageID() {
        return packageID;
    }

    /**
     * Sets the value of the packageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueID }
     *     
     */
    public void setPackageID(UniqueID value) {
        this.packageID = value;
    }

    /**
     * Gets the value of the packageDate property.
     * 
     * @return
     *     possible object is
     *     {@link TimeSpan }
     *     
     */
    public TimeSpan getPackageDate() {
        return packageDate;
    }

    /**
     * Sets the value of the packageDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeSpan }
     *     
     */
    public void setPackageDate(TimeSpan value) {
        this.packageDate = value;
    }

}
