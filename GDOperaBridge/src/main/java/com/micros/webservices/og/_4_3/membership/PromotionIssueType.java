//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.26 at 10:00:49 AM IST 
//


package com.micros.webservices.og._4_3.membership;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PromotionIssueType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PromotionIssueType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ASSIGNED"/>
 *     &lt;enumeration value="OPTIN"/>
 *     &lt;enumeration value="PURCHASED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PromotionIssueType")
@XmlEnum
public enum PromotionIssueType {

    ASSIGNED,
    OPTIN,
    PURCHASED;

    public String value() {
        return name();
    }

    public static PromotionIssueType fromValue(String v) {
        return valueOf(v);
    }

}
