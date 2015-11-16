//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.22 at 04:43:24 PM IST 
//


package com.micros.webservices.og._4_3.guestservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.micros.webservices.og._4_3.hotelcommon.HotelReference;


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
 *         &lt;element name="RoomNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RoomStatus" type="{http://webservices.micros.com/og/4.3/GuestServices/}RoomStatusType" minOccurs="0"/>
 *         &lt;element name="TurnDownStatus" type="{http://webservices.micros.com/og/4.3/GuestServices/}TurnDownStatusType" minOccurs="0"/>
 *         &lt;element name="GuestServiceStatus" type="{http://webservices.micros.com/og/4.3/GuestServices/}GuestServiceStatusType" minOccurs="0"/>
 *         &lt;element name="RoomRepair" type="{http://webservices.micros.com/og/4.3/GuestServices/}RoomRepairType" minOccurs="0"/>
 *       &lt;/sequence>
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
    "roomNumber",
    "roomStatus",
    "turnDownStatus",
    "guestServiceStatus",
    "roomRepair"
})
@XmlRootElement(name = "UpdateRoomStatusRequest")
public class UpdateRoomStatusRequest {

    @XmlElement(name = "HotelReference", required = true)
    protected HotelReference hotelReference;
    @XmlElement(name = "RoomNumber", required = true)
    protected String roomNumber;
    @XmlElement(name = "RoomStatus")
    @XmlSchemaType(name = "string")
    protected RoomStatusType roomStatus;
    @XmlElement(name = "TurnDownStatus")
    @XmlSchemaType(name = "string")
    protected TurnDownStatusType turnDownStatus;
    @XmlElement(name = "GuestServiceStatus")
    @XmlSchemaType(name = "string")
    protected GuestServiceStatusType guestServiceStatus;
    @XmlElement(name = "RoomRepair")
    protected RoomRepairType roomRepair;

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
     * Gets the value of the roomNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomNumber() {
        return roomNumber;
    }

    /**
     * Sets the value of the roomNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomNumber(String value) {
        this.roomNumber = value;
    }

    /**
     * Gets the value of the roomStatus property.
     * 
     * @return
     *     possible object is
     *     {@link RoomStatusType }
     *     
     */
    public RoomStatusType getRoomStatus() {
        return roomStatus;
    }

    /**
     * Sets the value of the roomStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoomStatusType }
     *     
     */
    public void setRoomStatus(RoomStatusType value) {
        this.roomStatus = value;
    }

    /**
     * Gets the value of the turnDownStatus property.
     * 
     * @return
     *     possible object is
     *     {@link TurnDownStatusType }
     *     
     */
    public TurnDownStatusType getTurnDownStatus() {
        return turnDownStatus;
    }

    /**
     * Sets the value of the turnDownStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link TurnDownStatusType }
     *     
     */
    public void setTurnDownStatus(TurnDownStatusType value) {
        this.turnDownStatus = value;
    }

    /**
     * Gets the value of the guestServiceStatus property.
     * 
     * @return
     *     possible object is
     *     {@link GuestServiceStatusType }
     *     
     */
    public GuestServiceStatusType getGuestServiceStatus() {
        return guestServiceStatus;
    }

    /**
     * Sets the value of the guestServiceStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link GuestServiceStatusType }
     *     
     */
    public void setGuestServiceStatus(GuestServiceStatusType value) {
        this.guestServiceStatus = value;
    }

    /**
     * Gets the value of the roomRepair property.
     * 
     * @return
     *     possible object is
     *     {@link RoomRepairType }
     *     
     */
    public RoomRepairType getRoomRepair() {
        return roomRepair;
    }

    /**
     * Sets the value of the roomRepair property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoomRepairType }
     *     
     */
    public void setRoomRepair(RoomRepairType value) {
        this.roomRepair = value;
    }

}
