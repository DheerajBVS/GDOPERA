//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.16 at 01:21:05 PM IST 
//


package com.micros.webservices.og._4_3.resvadvanced;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="ReservationRequest" type="{http://webservices.micros.com/og/4.3/ResvAdvanced/}ReservationRequestBase"/>
 *       &lt;/sequence>
 *       &lt;attribute name="StationID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="UserID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Keys" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="KeyEncoder" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="GetKeyTrack" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="KeyExpirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="CreateNewKey" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="MobilePhoneAudioKey" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="UDID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="KeyString" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "reservationRequest"
})
@XmlRootElement(name = "AdditionalKeysRequest")
public class AdditionalKeysRequest {

    @XmlElement(name = "ReservationRequest", required = true)
    protected ReservationRequestBase reservationRequest;
    @XmlAttribute(name = "StationID", required = true)
    protected String stationID;
    @XmlAttribute(name = "UserID")
    protected String userID;
    @XmlAttribute(name = "Keys", required = true)
    protected int keys;
    @XmlAttribute(name = "KeyEncoder")
    protected String keyEncoder;
    @XmlAttribute(name = "GetKeyTrack")
    protected Boolean getKeyTrack;
    @XmlAttribute(name = "KeyExpirationDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar keyExpirationDate;
    @XmlAttribute(name = "CreateNewKey")
    protected Boolean createNewKey;
    @XmlAttribute(name = "MobilePhoneAudioKey")
    protected Boolean mobilePhoneAudioKey;
    @XmlAttribute(name = "UDID")
    protected String udid;
    @XmlAttribute(name = "KeyString")
    protected String keyString;

    /**
     * Gets the value of the reservationRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationRequestBase }
     *     
     */
    public ReservationRequestBase getReservationRequest() {
        return reservationRequest;
    }

    /**
     * Sets the value of the reservationRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationRequestBase }
     *     
     */
    public void setReservationRequest(ReservationRequestBase value) {
        this.reservationRequest = value;
    }

    /**
     * Gets the value of the stationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationID() {
        return stationID;
    }

    /**
     * Sets the value of the stationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationID(String value) {
        this.stationID = value;
    }

    /**
     * Gets the value of the userID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserID(String value) {
        this.userID = value;
    }

    /**
     * Gets the value of the keys property.
     * 
     */
    public int getKeys() {
        return keys;
    }

    /**
     * Sets the value of the keys property.
     * 
     */
    public void setKeys(int value) {
        this.keys = value;
    }

    /**
     * Gets the value of the keyEncoder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyEncoder() {
        return keyEncoder;
    }

    /**
     * Sets the value of the keyEncoder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyEncoder(String value) {
        this.keyEncoder = value;
    }

    /**
     * Gets the value of the getKeyTrack property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGetKeyTrack() {
        return getKeyTrack;
    }

    /**
     * Sets the value of the getKeyTrack property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGetKeyTrack(Boolean value) {
        this.getKeyTrack = value;
    }

    /**
     * Gets the value of the keyExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getKeyExpirationDate() {
        return keyExpirationDate;
    }

    /**
     * Sets the value of the keyExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setKeyExpirationDate(XMLGregorianCalendar value) {
        this.keyExpirationDate = value;
    }

    /**
     * Gets the value of the createNewKey property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCreateNewKey() {
        return createNewKey;
    }

    /**
     * Sets the value of the createNewKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCreateNewKey(Boolean value) {
        this.createNewKey = value;
    }

    /**
     * Gets the value of the mobilePhoneAudioKey property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMobilePhoneAudioKey() {
        return mobilePhoneAudioKey;
    }

    /**
     * Sets the value of the mobilePhoneAudioKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMobilePhoneAudioKey(Boolean value) {
        this.mobilePhoneAudioKey = value;
    }

    /**
     * Gets the value of the udid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUDID() {
        return udid;
    }

    /**
     * Sets the value of the udid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUDID(String value) {
        this.udid = value;
    }

    /**
     * Gets the value of the keyString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyString() {
        return keyString;
    }

    /**
     * Sets the value of the keyString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyString(String value) {
        this.keyString = value;
    }

}
