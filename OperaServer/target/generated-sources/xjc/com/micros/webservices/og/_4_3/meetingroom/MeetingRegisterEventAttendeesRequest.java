//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.16 at 01:21:05 PM IST 
//


package com.micros.webservices.og._4_3.meetingroom;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.micros.webservices.og._4_3.common.UniqueID;
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
 *         &lt;element name="EventAttendees" type="{http://webservices.micros.com/og/4.3/MeetingRoom/}EventAttendee" maxOccurs="unbounded"/>
 *         &lt;element name="BlockID" type="{http://webservices.micros.com/og/4.3/Common/}UniqueID"/>
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
    "eventAttendees",
    "blockID"
})
@XmlRootElement(name = "MeetingRegisterEventAttendeesRequest")
public class MeetingRegisterEventAttendeesRequest {

    @XmlElement(name = "HotelReference", required = true)
    protected HotelReference hotelReference;
    @XmlElement(name = "EventAttendees", required = true)
    protected List<EventAttendee> eventAttendees;
    @XmlElement(name = "BlockID", required = true)
    protected UniqueID blockID;

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
     * Gets the value of the eventAttendees property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eventAttendees property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEventAttendees().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventAttendee }
     * 
     * 
     */
    public List<EventAttendee> getEventAttendees() {
        if (eventAttendees == null) {
            eventAttendees = new ArrayList<EventAttendee>();
        }
        return this.eventAttendees;
    }

    /**
     * Gets the value of the blockID property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueID }
     *     
     */
    public UniqueID getBlockID() {
        return blockID;
    }

    /**
     * Sets the value of the blockID property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueID }
     *     
     */
    public void setBlockID(UniqueID value) {
        this.blockID = value;
    }

}
