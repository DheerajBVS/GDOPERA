//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.22 at 04:38:37 PM IST 
//


package com.micros.webservices.og._4_3.activity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.micros.webservices.og._4_3.common.Address;
import com.micros.webservices.og._4_3.common.Membership;
import com.micros.webservices.og._4_3.common.PersonName;
import com.micros.webservices.og._4_3.common.Phone;
import com.micros.webservices.og._4_3.common.UniqueIDList;
import com.micros.webservices.og._4_3.hotelcommon.HotelReference;
import com.micros.webservices.og._4_3.hotelcommon.TimeSpan;


/**
 * Used in the request message to describe the "filter" when executing an activity lookup. Also used in the response message to return the activities matching the filter criteria.
 * 
 * <p>Java class for ActivityLookup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActivityLookup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProfileID" type="{http://webservices.micros.com/og/4.3/Common/}UniqueIDList" minOccurs="0"/>
 *         &lt;element name="PersonName" type="{http://webservices.micros.com/og/4.3/Common/}PersonName" minOccurs="0"/>
 *         &lt;element name="Address" type="{http://webservices.micros.com/og/4.3/Common/}Address" minOccurs="0"/>
 *         &lt;element name="Phone" type="{http://webservices.micros.com/og/4.3/Common/}Phone" minOccurs="0"/>
 *         &lt;element name="TimeSpan" type="{http://webservices.micros.com/og/4.3/HotelCommon/}TimeSpan" minOccurs="0"/>
 *         &lt;element name="Activities" type="{http://webservices.micros.com/og/4.3/Activity/}ActivityList" minOccurs="0"/>
 *         &lt;element name="Membership" type="{http://webservices.micros.com/og/4.3/Common/}Membership" minOccurs="0"/>
 *         &lt;element name="HotelReference" type="{http://webservices.micros.com/og/4.3/HotelCommon/}HotelReference"/>
 *         &lt;element name="ReturnOperaCode" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="externalSystemId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActivityLookup", propOrder = {
    "profileID",
    "personName",
    "address",
    "phone",
    "timeSpan",
    "activities",
    "membership",
    "hotelReference",
    "returnOperaCode"
})
public class ActivityLookup {

    @XmlElement(name = "ProfileID")
    protected UniqueIDList profileID;
    @XmlElement(name = "PersonName")
    protected PersonName personName;
    @XmlElement(name = "Address")
    protected Address address;
    @XmlElement(name = "Phone")
    protected Phone phone;
    @XmlElement(name = "TimeSpan")
    protected TimeSpan timeSpan;
    @XmlElement(name = "Activities")
    protected ActivityList activities;
    @XmlElement(name = "Membership")
    protected Membership membership;
    @XmlElement(name = "HotelReference", required = true)
    protected HotelReference hotelReference;
    @XmlElement(name = "ReturnOperaCode")
    protected Boolean returnOperaCode;
    @XmlAttribute(name = "externalSystemId")
    protected String externalSystemId;

    /**
     * Gets the value of the profileID property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueIDList }
     *     
     */
    public UniqueIDList getProfileID() {
        return profileID;
    }

    /**
     * Sets the value of the profileID property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueIDList }
     *     
     */
    public void setProfileID(UniqueIDList value) {
        this.profileID = value;
    }

    /**
     * Gets the value of the personName property.
     * 
     * @return
     *     possible object is
     *     {@link PersonName }
     *     
     */
    public PersonName getPersonName() {
        return personName;
    }

    /**
     * Sets the value of the personName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonName }
     *     
     */
    public void setPersonName(PersonName value) {
        this.personName = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link Phone }
     *     
     */
    public Phone getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link Phone }
     *     
     */
    public void setPhone(Phone value) {
        this.phone = value;
    }

    /**
     * Gets the value of the timeSpan property.
     * 
     * @return
     *     possible object is
     *     {@link TimeSpan }
     *     
     */
    public TimeSpan getTimeSpan() {
        return timeSpan;
    }

    /**
     * Sets the value of the timeSpan property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeSpan }
     *     
     */
    public void setTimeSpan(TimeSpan value) {
        this.timeSpan = value;
    }

    /**
     * Gets the value of the activities property.
     * 
     * @return
     *     possible object is
     *     {@link ActivityList }
     *     
     */
    public ActivityList getActivities() {
        return activities;
    }

    /**
     * Sets the value of the activities property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityList }
     *     
     */
    public void setActivities(ActivityList value) {
        this.activities = value;
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
     * Gets the value of the returnOperaCode property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnOperaCode() {
        return returnOperaCode;
    }

    /**
     * Sets the value of the returnOperaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnOperaCode(Boolean value) {
        this.returnOperaCode = value;
    }

    /**
     * Gets the value of the externalSystemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalSystemId() {
        return externalSystemId;
    }

    /**
     * Sets the value of the externalSystemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalSystemId(String value) {
        this.externalSystemId = value;
    }

}