//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.22 at 04:43:24 PM IST 
//


package com.micros.webservices.og._4_3.guestservices;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TurnDownStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TurnDownStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Completed"/>
 *     &lt;enumeration value="Required"/>
 *     &lt;enumeration value="NotRequired"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TurnDownStatusType")
@XmlEnum
public enum TurnDownStatusType {

    @XmlEnumValue("Completed")
    COMPLETED("Completed"),
    @XmlEnumValue("Required")
    REQUIRED("Required"),
    @XmlEnumValue("NotRequired")
    NOT_REQUIRED("NotRequired");
    private final String value;

    TurnDownStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TurnDownStatusType fromValue(String v) {
        for (TurnDownStatusType c: TurnDownStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
