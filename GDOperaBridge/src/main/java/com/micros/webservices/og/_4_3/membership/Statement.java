//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.26 at 10:00:49 AM IST 
//


package com.micros.webservices.og._4_3.membership;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.micros.webservices.og._4_3.common.AwardPointsToExpireList;
import com.micros.webservices.og._4_3.common.TextList;


/**
 * <p>Java class for Statement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Statement">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservices.micros.com/og/4.3/Membership/}MembershipTransactionList">
 *       &lt;sequence>
 *         &lt;element name="noticeText" type="{http://webservices.micros.com/og/4.3/Common/}TextList" minOccurs="0"/>
 *         &lt;element name="AwardPointsToExpires" type="{http://webservices.micros.com/og/4.3/Common/}AwardPointsToExpireList" minOccurs="0"/>
 *         &lt;element name="UDFsList" type="{http://webservices.micros.com/og/4.3/Membership/}UDFsList" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="statementDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="statementID" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="startDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="endDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="beginningBalance" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="endingBalance" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="membershipYear" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="awardPointsEarned" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="awardPointsUsed" type="{http://www.w3.org/2001/XMLSchema}double" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Statement", propOrder = {
    "noticeText",
    "awardPointsToExpires",
    "udFsList"
})
public class Statement
    extends MembershipTransactionList
{

    protected TextList noticeText;
    @XmlElement(name = "AwardPointsToExpires")
    protected AwardPointsToExpireList awardPointsToExpires;
    @XmlElement(name = "UDFsList")
    protected UDFsList udFsList;
    @XmlAttribute(name = "statementDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar statementDate;
    @XmlAttribute(name = "statementID")
    protected BigInteger statementID;
    @XmlAttribute(name = "startDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlAttribute(name = "endDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
    @XmlAttribute(name = "beginningBalance", required = true)
    protected float beginningBalance;
    @XmlAttribute(name = "endingBalance")
    protected Float endingBalance;
    @XmlAttribute(name = "membershipYear")
    protected Integer membershipYear;
    @XmlAttribute(name = "awardPointsEarned")
    protected Double awardPointsEarned;
    @XmlAttribute(name = "awardPointsUsed")
    protected Double awardPointsUsed;

    /**
     * Gets the value of the noticeText property.
     * 
     * @return
     *     possible object is
     *     {@link TextList }
     *     
     */
    public TextList getNoticeText() {
        return noticeText;
    }

    /**
     * Sets the value of the noticeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextList }
     *     
     */
    public void setNoticeText(TextList value) {
        this.noticeText = value;
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
     * Gets the value of the udFsList property.
     * 
     * @return
     *     possible object is
     *     {@link UDFsList }
     *     
     */
    public UDFsList getUDFsList() {
        return udFsList;
    }

    /**
     * Sets the value of the udFsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link UDFsList }
     *     
     */
    public void setUDFsList(UDFsList value) {
        this.udFsList = value;
    }

    /**
     * Gets the value of the statementDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStatementDate() {
        return statementDate;
    }

    /**
     * Sets the value of the statementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStatementDate(XMLGregorianCalendar value) {
        this.statementDate = value;
    }

    /**
     * Gets the value of the statementID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStatementID() {
        return statementID;
    }

    /**
     * Sets the value of the statementID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStatementID(BigInteger value) {
        this.statementID = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the beginningBalance property.
     * 
     */
    public float getBeginningBalance() {
        return beginningBalance;
    }

    /**
     * Sets the value of the beginningBalance property.
     * 
     */
    public void setBeginningBalance(float value) {
        this.beginningBalance = value;
    }

    /**
     * Gets the value of the endingBalance property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getEndingBalance() {
        return endingBalance;
    }

    /**
     * Sets the value of the endingBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setEndingBalance(Float value) {
        this.endingBalance = value;
    }

    /**
     * Gets the value of the membershipYear property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMembershipYear() {
        return membershipYear;
    }

    /**
     * Sets the value of the membershipYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMembershipYear(Integer value) {
        this.membershipYear = value;
    }

    /**
     * Gets the value of the awardPointsEarned property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAwardPointsEarned() {
        return awardPointsEarned;
    }

    /**
     * Sets the value of the awardPointsEarned property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAwardPointsEarned(Double value) {
        this.awardPointsEarned = value;
    }

    /**
     * Gets the value of the awardPointsUsed property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAwardPointsUsed() {
        return awardPointsUsed;
    }

    /**
     * Sets the value of the awardPointsUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAwardPointsUsed(Double value) {
        this.awardPointsUsed = value;
    }

}
