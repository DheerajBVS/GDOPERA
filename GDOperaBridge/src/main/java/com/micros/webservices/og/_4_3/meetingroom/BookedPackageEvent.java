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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BookedPackageEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BookedPackageEvent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="BookedPackage" type="{http://webservices.micros.com/og/4.3/MeetingRoom/}BookedPackage"/>
 *         &lt;element name="Event" type="{http://webservices.micros.com/og/4.3/MeetingRoom/}MeetingEventBase"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BookedPackageEvent", propOrder = {
    "bookedPackage",
    "event"
})
public class BookedPackageEvent {

    @XmlElement(name = "BookedPackage")
    protected BookedPackage bookedPackage;
    @XmlElement(name = "Event")
    protected MeetingEventBase event;

    /**
     * Gets the value of the bookedPackage property.
     * 
     * @return
     *     possible object is
     *     {@link BookedPackage }
     *     
     */
    public BookedPackage getBookedPackage() {
        return bookedPackage;
    }

    /**
     * Sets the value of the bookedPackage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookedPackage }
     *     
     */
    public void setBookedPackage(BookedPackage value) {
        this.bookedPackage = value;
    }

    /**
     * Gets the value of the event property.
     * 
     * @return
     *     possible object is
     *     {@link MeetingEventBase }
     *     
     */
    public MeetingEventBase getEvent() {
        return event;
    }

    /**
     * Sets the value of the event property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingEventBase }
     *     
     */
    public void setEvent(MeetingEventBase value) {
        this.event = value;
    }

}
