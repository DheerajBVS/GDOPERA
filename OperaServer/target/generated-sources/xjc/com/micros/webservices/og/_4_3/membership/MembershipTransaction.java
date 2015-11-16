//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.16 at 01:21:05 PM IST 
//


package com.micros.webservices.og._4_3.membership;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.micros.webservices.og._4_3.common.Amount;


/**
 * represents a transaction against a membership account.  This could be a points award, points consumption, bonus, etc.
 * 
 * <p>Java class for MembershipTransaction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MembershipTransaction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="Points" type="{http://webservices.micros.com/og/4.3/Membership/}Points"/>
 *         &lt;element name="Tsc" type="{http://webservices.micros.com/og/4.3/Membership/}Tsc" minOccurs="0"/>
 *         &lt;element name="AwardLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransferDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserNotes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PointsBreakups" type="{http://webservices.micros.com/og/4.3/Membership/}PointsBreakupList" minOccurs="0"/>
 *         &lt;element name="ProfileList" type="{http://webservices.micros.com/og/4.3/Membership/}FavoriteGuestList" minOccurs="0"/>
 *         &lt;element name="TotalQualifiedCentralRevenue" type="{http://webservices.micros.com/og/4.3/Common/}Amount" minOccurs="0"/>
 *         &lt;element name="TotalQualifiedLocalRevenue" type="{http://webservices.micros.com/og/4.3/Common/}Amount" minOccurs="0"/>
 *         &lt;element name="Revenues" type="{http://webservices.micros.com/og/4.3/Membership/}RevenueList" minOccurs="0"/>
 *       &lt;/all>
 *       &lt;attribute name="postingDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="transactionTypeCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="source" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="referenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="startDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="endDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="pointsCalculated" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="statementId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="transactionId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="crsReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="adjustment" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="resort" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="posCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="stayRecord" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="transactionDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MembershipTransaction", propOrder = {

})
public class MembershipTransaction {

    @XmlElement(name = "Points", required = true)
    protected Points points;
    @XmlElement(name = "Tsc")
    protected Tsc tsc;
    @XmlElement(name = "AwardLabel")
    protected String awardLabel;
    @XmlElement(name = "TransferDescription")
    protected String transferDescription;
    @XmlElement(name = "UserNotes")
    protected String userNotes;
    @XmlElement(name = "PointsBreakups")
    protected PointsBreakupList pointsBreakups;
    @XmlElement(name = "ProfileList")
    protected FavoriteGuestList profileList;
    @XmlElement(name = "TotalQualifiedCentralRevenue")
    protected Amount totalQualifiedCentralRevenue;
    @XmlElement(name = "TotalQualifiedLocalRevenue")
    protected Amount totalQualifiedLocalRevenue;
    @XmlElement(name = "Revenues")
    protected RevenueList revenues;
    @XmlAttribute(name = "postingDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar postingDate;
    @XmlAttribute(name = "transactionTypeCode", required = true)
    protected String transactionTypeCode;
    @XmlAttribute(name = "source")
    protected String source;
    @XmlAttribute(name = "referenceNumber")
    protected String referenceNumber;
    @XmlAttribute(name = "startDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlAttribute(name = "endDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
    @XmlAttribute(name = "pointsCalculated")
    protected Boolean pointsCalculated;
    @XmlAttribute(name = "statementId")
    protected String statementId;
    @XmlAttribute(name = "transactionId")
    protected String transactionId;
    @XmlAttribute(name = "crsReferenceNumber")
    protected String crsReferenceNumber;
    @XmlAttribute(name = "adjustment")
    protected Boolean adjustment;
    @XmlAttribute(name = "resort")
    protected String resort;
    @XmlAttribute(name = "posCode")
    protected String posCode;
    @XmlAttribute(name = "stayRecord")
    protected Boolean stayRecord;
    @XmlAttribute(name = "transactionDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar transactionDate;

    /**
     * Gets the value of the points property.
     * 
     * @return
     *     possible object is
     *     {@link Points }
     *     
     */
    public Points getPoints() {
        return points;
    }

    /**
     * Sets the value of the points property.
     * 
     * @param value
     *     allowed object is
     *     {@link Points }
     *     
     */
    public void setPoints(Points value) {
        this.points = value;
    }

    /**
     * Gets the value of the tsc property.
     * 
     * @return
     *     possible object is
     *     {@link Tsc }
     *     
     */
    public Tsc getTsc() {
        return tsc;
    }

    /**
     * Sets the value of the tsc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tsc }
     *     
     */
    public void setTsc(Tsc value) {
        this.tsc = value;
    }

    /**
     * Gets the value of the awardLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAwardLabel() {
        return awardLabel;
    }

    /**
     * Sets the value of the awardLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAwardLabel(String value) {
        this.awardLabel = value;
    }

    /**
     * Gets the value of the transferDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferDescription() {
        return transferDescription;
    }

    /**
     * Sets the value of the transferDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferDescription(String value) {
        this.transferDescription = value;
    }

    /**
     * Gets the value of the userNotes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserNotes() {
        return userNotes;
    }

    /**
     * Sets the value of the userNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserNotes(String value) {
        this.userNotes = value;
    }

    /**
     * Gets the value of the pointsBreakups property.
     * 
     * @return
     *     possible object is
     *     {@link PointsBreakupList }
     *     
     */
    public PointsBreakupList getPointsBreakups() {
        return pointsBreakups;
    }

    /**
     * Sets the value of the pointsBreakups property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointsBreakupList }
     *     
     */
    public void setPointsBreakups(PointsBreakupList value) {
        this.pointsBreakups = value;
    }

    /**
     * Gets the value of the profileList property.
     * 
     * @return
     *     possible object is
     *     {@link FavoriteGuestList }
     *     
     */
    public FavoriteGuestList getProfileList() {
        return profileList;
    }

    /**
     * Sets the value of the profileList property.
     * 
     * @param value
     *     allowed object is
     *     {@link FavoriteGuestList }
     *     
     */
    public void setProfileList(FavoriteGuestList value) {
        this.profileList = value;
    }

    /**
     * Gets the value of the totalQualifiedCentralRevenue property.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getTotalQualifiedCentralRevenue() {
        return totalQualifiedCentralRevenue;
    }

    /**
     * Sets the value of the totalQualifiedCentralRevenue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setTotalQualifiedCentralRevenue(Amount value) {
        this.totalQualifiedCentralRevenue = value;
    }

    /**
     * Gets the value of the totalQualifiedLocalRevenue property.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getTotalQualifiedLocalRevenue() {
        return totalQualifiedLocalRevenue;
    }

    /**
     * Sets the value of the totalQualifiedLocalRevenue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setTotalQualifiedLocalRevenue(Amount value) {
        this.totalQualifiedLocalRevenue = value;
    }

    /**
     * Gets the value of the revenues property.
     * 
     * @return
     *     possible object is
     *     {@link RevenueList }
     *     
     */
    public RevenueList getRevenues() {
        return revenues;
    }

    /**
     * Sets the value of the revenues property.
     * 
     * @param value
     *     allowed object is
     *     {@link RevenueList }
     *     
     */
    public void setRevenues(RevenueList value) {
        this.revenues = value;
    }

    /**
     * Gets the value of the postingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPostingDate() {
        return postingDate;
    }

    /**
     * Sets the value of the postingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPostingDate(XMLGregorianCalendar value) {
        this.postingDate = value;
    }

    /**
     * Gets the value of the transactionTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionTypeCode() {
        return transactionTypeCode;
    }

    /**
     * Sets the value of the transactionTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionTypeCode(String value) {
        this.transactionTypeCode = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the referenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceNumber() {
        return referenceNumber;
    }

    /**
     * Sets the value of the referenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceNumber(String value) {
        this.referenceNumber = value;
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
     * Gets the value of the pointsCalculated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPointsCalculated() {
        return pointsCalculated;
    }

    /**
     * Sets the value of the pointsCalculated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPointsCalculated(Boolean value) {
        this.pointsCalculated = value;
    }

    /**
     * Gets the value of the statementId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatementId() {
        return statementId;
    }

    /**
     * Sets the value of the statementId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatementId(String value) {
        this.statementId = value;
    }

    /**
     * Gets the value of the transactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Sets the value of the transactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionId(String value) {
        this.transactionId = value;
    }

    /**
     * Gets the value of the crsReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrsReferenceNumber() {
        return crsReferenceNumber;
    }

    /**
     * Sets the value of the crsReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrsReferenceNumber(String value) {
        this.crsReferenceNumber = value;
    }

    /**
     * Gets the value of the adjustment property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdjustment() {
        return adjustment;
    }

    /**
     * Sets the value of the adjustment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdjustment(Boolean value) {
        this.adjustment = value;
    }

    /**
     * Gets the value of the resort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResort() {
        return resort;
    }

    /**
     * Sets the value of the resort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResort(String value) {
        this.resort = value;
    }

    /**
     * Gets the value of the posCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosCode() {
        return posCode;
    }

    /**
     * Sets the value of the posCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosCode(String value) {
        this.posCode = value;
    }

    /**
     * Gets the value of the stayRecord property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStayRecord() {
        return stayRecord;
    }

    /**
     * Sets the value of the stayRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStayRecord(Boolean value) {
        this.stayRecord = value;
    }

    /**
     * Gets the value of the transactionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTransactionDate() {
        return transactionDate;
    }

    /**
     * Sets the value of the transactionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTransactionDate(XMLGregorianCalendar value) {
        this.transactionDate = value;
    }

}
