//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.22 at 04:43:24 PM IST 
//


package com.micros.webservices.og._4_3.guestservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.micros.webservices.og._4_3.common.GovernmentID;
import com.micros.webservices.og._4_3.common.Membership;
import com.micros.webservices.og._4_3.common.UniqueID;
import com.micros.webservices.og._4_3.hotelcommon.HotelReference;
import com.micros.webservices.og._4_3.name.NamePhoneList;


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
 *         &lt;element name="HotelReference" type="{http://webservices.micros.com/og/4.3/HotelCommon/}HotelReference"/>
 *         &lt;element name="ResvNameId" type="{http://webservices.micros.com/og/4.3/Common/}UniqueID"/>
 *         &lt;element name="Phones" type="{http://webservices.micros.com/og/4.3/Name/}NamePhoneList" minOccurs="0"/>
 *         &lt;element name="GovernmentID" type="{http://webservices.micros.com/og/4.3/Common/}GovernmentID" minOccurs="0"/>
 *         &lt;element name="DrivingLicenseID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OtherID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Membership" type="{http://webservices.micros.com/og/4.3/Common/}Membership" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="languageCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="nationality" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="countryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "hotelReference",
    "resvNameId",
    "phones",
    "governmentID",
    "drivingLicenseID",
    "otherID",
    "membership"
})
@XmlRootElement(name = "UpdateReservationForOptInRequest")
public class UpdateReservationForOptInRequest {

    @XmlElement(name = "HotelReference", required = true)
    protected HotelReference hotelReference;
    @XmlElement(name = "ResvNameId", required = true)
    protected UniqueID resvNameId;
    @XmlElement(name = "Phones")
    protected NamePhoneList phones;
    @XmlElement(name = "GovernmentID")
    protected GovernmentID governmentID;
    @XmlElement(name = "DrivingLicenseID")
    protected String drivingLicenseID;
    @XmlElement(name = "OtherID")
    protected String otherID;
    @XmlElement(name = "Membership")
    protected Membership membership;
    @XmlAttribute(name = "languageCode")
    protected String languageCode;
    @XmlAttribute(name = "nationality")
    protected String nationality;
    @XmlAttribute(name = "countryCode")
    protected String countryCode;

    /**
     * Gets the value of the hotelReference property.
     * 
     * @return
     *     possible object is
     *     {@link HotelReference }
     *     
     */
    public HotelReference getHotelReference() {
        return hotelReference;
    }

    /**
     * Sets the value of the hotelReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelReference }
     *     
     */
    public void setHotelReference(HotelReference value) {
        this.hotelReference = value;
    }

    /**
     * Gets the value of the resvNameId property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueID }
     *     
     */
    public UniqueID getResvNameId() {
        return resvNameId;
    }

    /**
     * Sets the value of the resvNameId property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueID }
     *     
     */
    public void setResvNameId(UniqueID value) {
        this.resvNameId = value;
    }

    /**
     * Gets the value of the phones property.
     * 
     * @return
     *     possible object is
     *     {@link NamePhoneList }
     *     
     */
    public NamePhoneList getPhones() {
        return phones;
    }

    /**
     * Sets the value of the phones property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamePhoneList }
     *     
     */
    public void setPhones(NamePhoneList value) {
        this.phones = value;
    }

    /**
     * Gets the value of the governmentID property.
     * 
     * @return
     *     possible object is
     *     {@link GovernmentID }
     *     
     */
    public GovernmentID getGovernmentID() {
        return governmentID;
    }

    /**
     * Sets the value of the governmentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link GovernmentID }
     *     
     */
    public void setGovernmentID(GovernmentID value) {
        this.governmentID = value;
    }

    /**
     * Gets the value of the drivingLicenseID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrivingLicenseID() {
        return drivingLicenseID;
    }

    /**
     * Sets the value of the drivingLicenseID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrivingLicenseID(String value) {
        this.drivingLicenseID = value;
    }

    /**
     * Gets the value of the otherID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherID() {
        return otherID;
    }

    /**
     * Sets the value of the otherID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherID(String value) {
        this.otherID = value;
    }

    /**
     * Gets the value of the membership property.
     * 
     * @return
     *     possible object is
     *     {@link Membership }
     *     
     */
    public Membership getMembership() {
        return membership;
    }

    /**
     * Sets the value of the membership property.
     * 
     * @param value
     *     allowed object is
     *     {@link Membership }
     *     
     */
    public void setMembership(Membership value) {
        this.membership = value;
    }

    /**
     * Gets the value of the languageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * Sets the value of the languageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageCode(String value) {
        this.languageCode = value;
    }

    /**
     * Gets the value of the nationality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * Sets the value of the nationality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationality(String value) {
        this.nationality = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

}