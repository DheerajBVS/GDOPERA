//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.22 at 04:43:24 PM IST 
//


package com.micros.webservices.og._4_3.guestservices;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WakeUpCallStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WakeUpCallStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PENDING"/>
 *     &lt;enumeration value="COMPLETED"/>
 *     &lt;enumeration value="NOANSWER"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="CANCEL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WakeUpCallStatusType")
@XmlEnum
public enum WakeUpCallStatusType {

    PENDING,
    COMPLETED,
    NOANSWER,
    UNKNOWN,
    CANCEL;

    public String value() {
        return name();
    }

    public static WakeUpCallStatusType fromValue(String v) {
        return valueOf(v);
    }

}