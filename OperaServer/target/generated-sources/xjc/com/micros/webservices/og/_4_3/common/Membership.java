//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.16 at 01:21:05 PM IST 
//


package com.micros.webservices.og._4_3.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.micros.webservices.og._4_3.name.NameMembership;


/**
 * <p>Java class for Membership complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Membership">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="membershipType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="membershipNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="membershipLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="membershipNextLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="memberName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="effectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="expirationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="currentPoints" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="enrollmentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResvNameId" type="{http://webservices.micros.com/og/4.3/Common/}UniqueIDList" minOccurs="0"/>
 *         &lt;element name="membershipid" type="{http://webservices.micros.com/og/4.3/Common/}UniqueID" minOccurs="0"/>
 *         &lt;element name="transferPoints" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="enrollmentSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enrolledAt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="awardPointsToExpires" type="{http://webservices.micros.com/og/4.3/Common/}AwardPointsToExpireList" minOccurs="0"/>
 *         &lt;element name="inactive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="excludeBatchIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Membership", propOrder = {
    "membershipType",
    "membershipNumber",
    "membershipLevel",
    "membershipNextLevel",
    "memberName",
    "effectiveDate",
    "expirationDate",
    "currentPoints",
    "enrollmentCode",
    "resvNameId",
    "membershipid",
    "transferPoints",
    "enrollmentSource",
    "enrolledAt",
    "awardPointsToExpires",
    "inactive",
    "excludeBatchIndicator"
})
@XmlSeeAlso({
    NameMembership.class
})
public class Membership {

    protected String membershipType;
    @XmlElement(required = true)
    protected String membershipNumber;
    protected String membershipLevel;
    protected String membershipNextLevel;
    protected String memberName;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expirationDate;
    protected Double currentPoints;
    protected String enrollmentCode;
    @XmlElement(name = "ResvNameId")
    protected UniqueIDList resvNameId;
    protected UniqueID membershipid;
    protected Long transferPoints;
    protected String enrollmentSource;
    protected String enrolledAt;
    protected AwardPointsToExpireList awardPointsToExpires;
    protected Boolean inactive;
    protected Boolean excludeBatchIndicator;

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
     * Gets the value of the membershipLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMembershipLevel() {
        return membershipLevel;
    }

    /**
     * Sets the value of the membershipLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMembershipLevel(String value) {
        this.membershipLevel = value;
    }

    /**
     * Gets the value of the membershipNextLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMembershipNextLevel() {
        return membershipNextLevel;
    }

    /**
     * Sets the value of the membershipNextLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMembershipNextLevel(String value) {
        this.membershipNextLevel = value;
    }

    /**
     * Gets the value of the memberName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberName() {
        return memberName;
    }

    /**
     * Sets the value of the memberName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberName(String value) {
        this.memberName = value;
    }

    /**
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveDate(XMLGregorianCalendar value) {
        this.effectiveDate = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpirationDate(XMLGregorianCalendar value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the currentPoints property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCurrentPoints() {
        return currentPoints;
    }

    /**
     * Sets the value of the currentPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCurrentPoints(Double value) {
        this.currentPoints = value;
    }

    /**
     * Gets the value of the enrollmentCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnrollmentCode() {
        return enrollmentCode;
    }

    /**
     * Sets the value of the enrollmentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnrollmentCode(String value) {
        this.enrollmentCode = value;
    }

    /**
     * Gets the value of the resvNameId property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueIDList }
     *     
     */
    public UniqueIDList getResvNameId() {
        return resvNameId;
    }

    /**
     * Sets the value of the resvNameId property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueIDList }
     *     
     */
    public void setResvNameId(UniqueIDList value) {
        this.resvNameId = value;
    }

    /**
     * Gets the value of the membershipid property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueID }
     *     
     */
    public UniqueID getMembershipid() {
        return membershipid;
    }

    /**
     * Sets the value of the membershipid property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueID }
     *     
     */
    public void setMembershipid(UniqueID value) {
        this.membershipid = value;
    }

    /**
     * Gets the value of the transferPoints property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTransferPoints() {
        return transferPoints;
    }

    /**
     * Sets the value of the transferPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTransferPoints(Long value) {
        this.transferPoints = value;
    }

    /**
     * Gets the value of the enrollmentSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnrollmentSource() {
        return enrollmentSource;
    }

    /**
     * Sets the value of the enrollmentSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnrollmentSource(String value) {
        this.enrollmentSource = value;
    }

    /**
     * Gets the value of the enrolledAt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnrolledAt() {
        return enrolledAt;
    }

    /**
     * Sets the value of the enrolledAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnrolledAt(String value) {
        this.enrolledAt = value;
    }

    /**
     * Gets the value of the awardPointsToExpires property.
     * 
     * @return
     *     possible object is
     *     {@link AwardPointsToExpireList }
     *     
     */
    public AwardPointsToExpireList getAwardPointsToExpires() {
        return awardPointsToExpires;
    }

    /**
     * Sets the value of the awardPointsToExpires property.
     * 
     * @param value
     *     allowed object is
     *     {@link AwardPointsToExpireList }
     *     
     */
    public void setAwardPointsToExpires(AwardPointsToExpireList value) {
        this.awardPointsToExpires = value;
    }

    /**
     * Gets the value of the inactive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInactive() {
        return inactive;
    }

    /**
     * Sets the value of the inactive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInactive(Boolean value) {
        this.inactive = value;
    }

    /**
     * Gets the value of the excludeBatchIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExcludeBatchIndicator() {
        return excludeBatchIndicator;
    }

    /**
     * Sets the value of the excludeBatchIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcludeBatchIndicator(Boolean value) {
        this.excludeBatchIndicator = value;
    }

}
