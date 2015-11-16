//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.22 at 04:53:58 PM IST 
//


package com.micros.webservices.og._4_3.hotelcommon;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VendorPolicyType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VendorPolicyType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RateRules"/>
 *     &lt;enumeration value="MarketingInformation"/>
 *     &lt;enumeration value="DepositPolicy"/>
 *     &lt;enumeration value="Promotion"/>
 *     &lt;enumeration value="CommissionPolicy"/>
 *     &lt;enumeration value="GuaranteePolicy"/>
 *     &lt;enumeration value="Miscellaneous"/>
 *     &lt;enumeration value="PackageOptions"/>
 *     &lt;enumeration value="PenaltyPolicy"/>
 *     &lt;enumeration value="TASpecialRequest"/>
 *     &lt;enumeration value="TaxInformation"/>
 *     &lt;enumeration value="CancelPolicy"/>
 *     &lt;enumeration value="ProprietaryGDSCode"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VendorPolicyType")
@XmlEnum
public enum VendorPolicyType {

    @XmlEnumValue("RateRules")
    RATE_RULES("RateRules"),
    @XmlEnumValue("MarketingInformation")
    MARKETING_INFORMATION("MarketingInformation"),
    @XmlEnumValue("DepositPolicy")
    DEPOSIT_POLICY("DepositPolicy"),
    @XmlEnumValue("Promotion")
    PROMOTION("Promotion"),
    @XmlEnumValue("CommissionPolicy")
    COMMISSION_POLICY("CommissionPolicy"),
    @XmlEnumValue("GuaranteePolicy")
    GUARANTEE_POLICY("GuaranteePolicy"),
    @XmlEnumValue("Miscellaneous")
    MISCELLANEOUS("Miscellaneous"),
    @XmlEnumValue("PackageOptions")
    PACKAGE_OPTIONS("PackageOptions"),
    @XmlEnumValue("PenaltyPolicy")
    PENALTY_POLICY("PenaltyPolicy"),
    @XmlEnumValue("TASpecialRequest")
    TA_SPECIAL_REQUEST("TASpecialRequest"),
    @XmlEnumValue("TaxInformation")
    TAX_INFORMATION("TaxInformation"),
    @XmlEnumValue("CancelPolicy")
    CANCEL_POLICY("CancelPolicy"),
    @XmlEnumValue("ProprietaryGDSCode")
    PROPRIETARY_GDS_CODE("ProprietaryGDSCode"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    VendorPolicyType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VendorPolicyType fromValue(String v) {
        for (VendorPolicyType c: VendorPolicyType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
