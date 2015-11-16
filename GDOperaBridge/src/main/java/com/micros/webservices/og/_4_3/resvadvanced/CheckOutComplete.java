//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.26 at 10:00:49 AM IST 
//


package com.micros.webservices.og._4_3.resvadvanced;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import com.micros.webservices.og._4_3.common.UniqueIDList;
import com.micros.webservices.og._4_3.hotelcommon.CreditCardAuthorizationDetail;


/**
 * <p>Java class for CheckOutComplete complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckOutComplete">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReservationID" type="{http://webservices.micros.com/og/4.3/Common/}UniqueIDList"/>
 *         &lt;element name="InvoiceNumber" maxOccurs="8" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="window" type="{http://www.w3.org/2001/XMLSchema}int" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="GuestBill" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="8" minOccurs="0"/>
 *         &lt;element name="CreditCardAuthorizationDetails" type="{http://webservices.micros.com/og/4.3/HotelCommon/}CreditCardAuthorizationDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="NoPost" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="DoNotMoveRoom" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckOutComplete", propOrder = {
    "reservationID",
    "invoiceNumber",
    "guestBill",
    "creditCardAuthorizationDetails"
})
public class CheckOutComplete {

    @XmlElement(name = "ReservationID", required = true)
    protected UniqueIDList reservationID;
    @XmlElement(name = "InvoiceNumber")
    protected List<CheckOutComplete.InvoiceNumber> invoiceNumber;
    @XmlElement(name = "GuestBill")
    protected List<String> guestBill;
    @XmlElement(name = "CreditCardAuthorizationDetails")
    protected List<CreditCardAuthorizationDetail> creditCardAuthorizationDetails;
    @XmlAttribute(name = "NoPost")
    protected Boolean noPost;
    @XmlAttribute(name = "DoNotMoveRoom")
    protected Boolean doNotMoveRoom;

    /**
     * Gets the value of the reservationID property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueIDList }
     *     
     */
    public UniqueIDList getReservationID() {
        return reservationID;
    }

    /**
     * Sets the value of the reservationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueIDList }
     *     
     */
    public void setReservationID(UniqueIDList value) {
        this.reservationID = value;
    }

    /**
     * Gets the value of the invoiceNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invoiceNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvoiceNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CheckOutComplete.InvoiceNumber }
     * 
     * 
     */
    public List<CheckOutComplete.InvoiceNumber> getInvoiceNumber() {
        if (invoiceNumber == null) {
            invoiceNumber = new ArrayList<CheckOutComplete.InvoiceNumber>();
        }
        return this.invoiceNumber;
    }

    /**
     * Gets the value of the guestBill property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guestBill property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuestBill().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getGuestBill() {
        if (guestBill == null) {
            guestBill = new ArrayList<String>();
        }
        return this.guestBill;
    }

    /**
     * Gets the value of the creditCardAuthorizationDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creditCardAuthorizationDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreditCardAuthorizationDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreditCardAuthorizationDetail }
     * 
     * 
     */
    public List<CreditCardAuthorizationDetail> getCreditCardAuthorizationDetails() {
        if (creditCardAuthorizationDetails == null) {
            creditCardAuthorizationDetails = new ArrayList<CreditCardAuthorizationDetail>();
        }
        return this.creditCardAuthorizationDetails;
    }

    /**
     * Gets the value of the noPost property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoPost() {
        return noPost;
    }

    /**
     * Sets the value of the noPost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoPost(Boolean value) {
        this.noPost = value;
    }

    /**
     * Gets the value of the doNotMoveRoom property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDoNotMoveRoom() {
        return doNotMoveRoom;
    }

    /**
     * Sets the value of the doNotMoveRoom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDoNotMoveRoom(Boolean value) {
        this.doNotMoveRoom = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="window" type="{http://www.w3.org/2001/XMLSchema}int" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class InvoiceNumber {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "window")
        protected Integer window;

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
         * Gets the value of the window property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getWindow() {
            return window;
        }

        /**
         * Sets the value of the window property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setWindow(Integer value) {
            this.window = value;
        }

    }

}
