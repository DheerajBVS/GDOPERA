//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.22 at 04:48:57 PM IST 
//


package com.micros.webservices.og._4_3.meetingroom;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.micros.webservices.og._4_3.common.Amount;
import com.micros.webservices.og._4_3.common.ResultStatus;
import com.micros.webservices.og._4_3.hotelcommon.CreditCardPayment;


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
 *         &lt;element name="Result" type="{http://webservices.micros.com/og/4.3/Common/}ResultStatus"/>
 *         &lt;element name="BookId" type="{http://webservices.micros.com/og/4.3/MeetingRoom/}BookId" minOccurs="0"/>
 *         &lt;element name="CreditCardApproval" type="{http://webservices.micros.com/og/4.3/HotelCommon/}CreditCardPayment" minOccurs="0"/>
 *         &lt;element name="DepositAmount" type="{http://webservices.micros.com/og/4.3/Common/}Amount" minOccurs="0"/>
 *         &lt;element name="EventCharges" type="{http://webservices.micros.com/og/4.3/Common/}Amount" minOccurs="0"/>
 *         &lt;element name="RoomRevenue" type="{http://webservices.micros.com/og/4.3/Common/}Amount" minOccurs="0"/>
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
    "result",
    "bookId",
    "creditCardApproval",
    "depositAmount",
    "eventCharges",
    "roomRevenue"
})
@XmlRootElement(name = "MeetingCreateEventResponse")
public class MeetingCreateEventResponse {

    @XmlElement(name = "Result", required = true)
    protected ResultStatus result;
    @XmlElement(name = "BookId")
    protected BookId bookId;
    @XmlElement(name = "CreditCardApproval")
    protected CreditCardPayment creditCardApproval;
    @XmlElement(name = "DepositAmount")
    protected Amount depositAmount;
    @XmlElement(name = "EventCharges")
    protected Amount eventCharges;
    @XmlElement(name = "RoomRevenue")
    protected Amount roomRevenue;

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link ResultStatus }
     *     
     */
    public ResultStatus getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultStatus }
     *     
     */
    public void setResult(ResultStatus value) {
        this.result = value;
    }

    /**
     * Gets the value of the bookId property.
     * 
     * @return
     *     possible object is
     *     {@link BookId }
     *     
     */
    public BookId getBookId() {
        return bookId;
    }

    /**
     * Sets the value of the bookId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookId }
     *     
     */
    public void setBookId(BookId value) {
        this.bookId = value;
    }

    /**
     * Gets the value of the creditCardApproval property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCardPayment }
     *     
     */
    public CreditCardPayment getCreditCardApproval() {
        return creditCardApproval;
    }

    /**
     * Sets the value of the creditCardApproval property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCardPayment }
     *     
     */
    public void setCreditCardApproval(CreditCardPayment value) {
        this.creditCardApproval = value;
    }

    /**
     * Gets the value of the depositAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getDepositAmount() {
        return depositAmount;
    }

    /**
     * Sets the value of the depositAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setDepositAmount(Amount value) {
        this.depositAmount = value;
    }

    /**
     * Gets the value of the eventCharges property.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getEventCharges() {
        return eventCharges;
    }

    /**
     * Sets the value of the eventCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setEventCharges(Amount value) {
        this.eventCharges = value;
    }

    /**
     * Gets the value of the roomRevenue property.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getRoomRevenue() {
        return roomRevenue;
    }

    /**
     * Sets the value of the roomRevenue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setRoomRevenue(Amount value) {
        this.roomRevenue = value;
    }

}
