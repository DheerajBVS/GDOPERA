//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.26 at 10:00:49 AM IST 
//


package com.micros.webservices.og._4_3.membership;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.micros.webservices.og._4_3.common.UniqueID;


/**
 * <p>Java class for MemberSearchCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MemberSearchCriteria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Membership">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="NameId" type="{http://webservices.micros.com/og/4.3/Common/}UniqueID" minOccurs="0"/>
 *                   &lt;element name="MembershipNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="MembershipType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="MembershipID" type="{http://webservices.micros.com/og/4.3/Common/}UniqueID"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MemberSearchCriteria", propOrder = {
    "membership",
    "membershipID"
})
public class MemberSearchCriteria {

    @XmlElement(name = "Membership")
    protected MemberSearchCriteria.Membership membership;
    @XmlElement(name = "MembershipID")
    protected UniqueID membershipID;

    /**
     * Gets the value of the membership property.
     * 
     * @return
     *     possible object is
     *     {@link MemberSearchCriteria.Membership }
     *     
     */
    public MemberSearchCriteria.Membership getMembership() {
        return membership;
    }

    /**
     * Sets the value of the membership property.
     * 
     * @param value
     *     allowed object is
     *     {@link MemberSearchCriteria.Membership }
     *     
     */
    public void setMembership(MemberSearchCriteria.Membership value) {
        this.membership = value;
    }

    /**
     * Gets the value of the membershipID property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueID }
     *     
     */
    public UniqueID getMembershipID() {
        return membershipID;
    }

    /**
     * Sets the value of the membershipID property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueID }
     *     
     */
    public void setMembershipID(UniqueID value) {
        this.membershipID = value;
    }


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
     *         &lt;element name="NameId" type="{http://webservices.micros.com/og/4.3/Common/}UniqueID" minOccurs="0"/>
     *         &lt;element name="MembershipNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="MembershipType" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "nameId",
        "membershipNumber",
        "membershipType"
    })
    public static class Membership {

        @XmlElement(name = "NameId")
        protected UniqueID nameId;
        @XmlElement(name = "MembershipNumber")
        protected String membershipNumber;
        @XmlElement(name = "MembershipType", required = true)
        protected String membershipType;

        /**
         * Gets the value of the nameId property.
         * 
         * @return
         *     possible object is
         *     {@link UniqueID }
         *     
         */
        public UniqueID getNameId() {
            return nameId;
        }

        /**
         * Sets the value of the nameId property.
         * 
         * @param value
         *     allowed object is
         *     {@link UniqueID }
         *     
         */
        public void setNameId(UniqueID value) {
            this.nameId = value;
        }

        /**
         * Gets the value of the membershipNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMembershipNumber() {
            return membershipNumber;
        }

        /**
         * Sets the value of the membershipNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMembershipNumber(String value) {
            this.membershipNumber = value;
        }

        /**
         * Gets the value of the membershipType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMembershipType() {
            return membershipType;
        }

        /**
         * Sets the value of the membershipType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMembershipType(String value) {
            this.membershipType = value;
        }

    }

}
