//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.16 at 01:21:05 PM IST 
//


package com.micros.webservices.og._4_3.membership;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.micros.webservices.og._4_3.common.Amount;
import com.micros.webservices.og._4_3.common.DescriptiveText;
import com.micros.webservices.og._4_3.hotelcommon.HotelReference;


/**
 * represents a membership award in the form transactions for a hotel stay
 * 
 * <p>Java class for TransactionAward complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionAward">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MembershipType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AwardType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="HotelReference" type="{http://webservices.micros.com/og/4.3/HotelCommon/}HotelReference" minOccurs="0"/>
 *         &lt;element name="DisplaySet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CancelPenaltyCharge" type="{http://webservices.micros.com/og/4.3/Common/}Amount" minOccurs="0"/>
 *         &lt;element name="CancelPenaltyDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CancelPenaltyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IgnoreFinancialTransaction" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IssueKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IssueKeyRaw" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="LongDescription" type="{http://webservices.micros.com/og/4.3/Common/}DescriptiveText" minOccurs="0"/>
 *         &lt;element name="ShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MaxPercentAllowed" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="MembershipLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CentralCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OriginalPointsRequired" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="PointsRequired" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="HotelCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransactionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SellBeginDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="SellEndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ExchangeRateType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ComputedPointsRequired" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="HotelTotalBillAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="HotelTotalBillAmountAllowed" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="CentralBillAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="CentralBillAmountAllowed" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionAward", propOrder = {
    "membershipType",
    "awardType",
    "hotelReference",
    "displaySet",
    "cancelPenaltyCharge",
    "cancelPenaltyDays",
    "cancelPenaltyType",
    "ignoreFinancialTransaction",
    "issueKey",
    "issueKeyRaw",
    "longDescription",
    "shortDescription",
    "maxPercentAllowed",
    "membershipLevel",
    "centralCurrencyCode",
    "originalPointsRequired",
    "pointsRequired",
    "hotelCurrencyCode",
    "transactionCode",
    "sellBeginDate",
    "sellEndDate",
    "exchangeRateType",
    "computedPointsRequired",
    "hotelTotalBillAmount",
    "hotelTotalBillAmountAllowed",
    "centralBillAmount",
    "centralBillAmountAllowed"
})
public class TransactionAward {

    @XmlElement(name = "MembershipType", required = true)
    protected String membershipType;
    @XmlElement(name = "AwardType", required = true)
    protected String awardType;
    @XmlElement(name = "HotelReference")
    protected HotelReference hotelReference;
    @XmlElement(name = "DisplaySet")
    protected String displaySet;
    @XmlElement(name = "CancelPenaltyCharge")
    protected Amount cancelPenaltyCharge;
    @XmlElement(name = "CancelPenaltyDays")
    protected Integer cancelPenaltyDays;
    @XmlElement(name = "CancelPenaltyType")
    protected String cancelPenaltyType;
    @XmlElement(name = "IgnoreFinancialTransaction")
    protected Boolean ignoreFinancialTransaction;
    @XmlElement(name = "IssueKey")
    protected String issueKey;
    @XmlElement(name = "IssueKeyRaw")
    protected byte[] issueKeyRaw;
    @XmlElement(name = "LongDescription")
    protected DescriptiveText longDescription;
    @XmlElement(name = "ShortDescription")
    protected String shortDescription;
    @XmlElement(name = "MaxPercentAllowed")
    protected Double maxPercentAllowed;
    @XmlElement(name = "MembershipLevel")
    protected String membershipLevel;
    @XmlElement(name = "CentralCurrencyCode")
    protected String centralCurrencyCode;
    @XmlElement(name = "OriginalPointsRequired")
    protected Double originalPointsRequired;
    @XmlElement(name = "PointsRequired")
    protected Double pointsRequired;
    @XmlElement(name = "HotelCurrencyCode")
    protected String hotelCurrencyCode;
    @XmlElement(name = "TransactionCode")
    protected String transactionCode;
    @XmlElement(name = "SellBeginDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar sellBeginDate;
    @XmlElement(name = "SellEndDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar sellEndDate;
    @XmlElement(name = "ExchangeRateType")
    protected String exchangeRateType;
    @XmlElement(name = "ComputedPointsRequired")
    protected Double computedPointsRequired;
    @XmlElement(name = "HotelTotalBillAmount")
    protected Double hotelTotalBillAmount;
    @XmlElement(name = "HotelTotalBillAmountAllowed")
    protected Double hotelTotalBillAmountAllowed;
    @XmlElement(name = "CentralBillAmount")
    protected Double centralBillAmount;
    @XmlElement(name = "CentralBillAmountAllowed")
    protected Double centralBillAmountAllowed;

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
     * Gets the value of the awardType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAwardType() {
        return awardType;
    }

    /**
     * Sets the value of the awardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAwardType(String value) {
        this.awardType = value;
    }

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
     * Gets the value of the displaySet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplaySet() {
        return displaySet;
    }

    /**
     * Sets the value of the displaySet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplaySet(String value) {
        this.displaySet = value;
    }

    /**
     * Gets the value of the cancelPenaltyCharge property.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getCancelPenaltyCharge() {
        return cancelPenaltyCharge;
    }

    /**
     * Sets the value of the cancelPenaltyCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setCancelPenaltyCharge(Amount value) {
        this.cancelPenaltyCharge = value;
    }

    /**
     * Gets the value of the cancelPenaltyDays property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCancelPenaltyDays() {
        return cancelPenaltyDays;
    }

    /**
     * Sets the value of the cancelPenaltyDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCancelPenaltyDays(Integer value) {
        this.cancelPenaltyDays = value;
    }

    /**
     * Gets the value of the cancelPenaltyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelPenaltyType() {
        return cancelPenaltyType;
    }

    /**
     * Sets the value of the cancelPenaltyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelPenaltyType(String value) {
        this.cancelPenaltyType = value;
    }

    /**
     * Gets the value of the ignoreFinancialTransaction property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnoreFinancialTransaction() {
        return ignoreFinancialTransaction;
    }

    /**
     * Sets the value of the ignoreFinancialTransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreFinancialTransaction(Boolean value) {
        this.ignoreFinancialTransaction = value;
    }

    /**
     * Gets the value of the issueKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssueKey() {
        return issueKey;
    }

    /**
     * Sets the value of the issueKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssueKey(String value) {
        this.issueKey = value;
    }

    /**
     * Gets the value of the issueKeyRaw property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getIssueKeyRaw() {
        return issueKeyRaw;
    }

    /**
     * Sets the value of the issueKeyRaw property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setIssueKeyRaw(byte[] value) {
        this.issueKeyRaw = value;
    }

    /**
     * Gets the value of the longDescription property.
     * 
     * @return
     *     possible object is
     *     {@link DescriptiveText }
     *     
     */
    public DescriptiveText getLongDescription() {
        return longDescription;
    }

    /**
     * Sets the value of the longDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link DescriptiveText }
     *     
     */
    public void setLongDescription(DescriptiveText value) {
        this.longDescription = value;
    }

    /**
     * Gets the value of the shortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortDescription() {
        return shortDescription;
    }

    /**
     * Sets the value of the shortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortDescription(String value) {
        this.shortDescription = value;
    }

    /**
     * Gets the value of the maxPercentAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaxPercentAllowed() {
        return maxPercentAllowed;
    }

    /**
     * Sets the value of the maxPercentAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaxPercentAllowed(Double value) {
        this.maxPercentAllowed = value;
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
     * Gets the value of the centralCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCentralCurrencyCode() {
        return centralCurrencyCode;
    }

    /**
     * Sets the value of the centralCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCentralCurrencyCode(String value) {
        this.centralCurrencyCode = value;
    }

    /**
     * Gets the value of the originalPointsRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOriginalPointsRequired() {
        return originalPointsRequired;
    }

    /**
     * Sets the value of the originalPointsRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOriginalPointsRequired(Double value) {
        this.originalPointsRequired = value;
    }

    /**
     * Gets the value of the pointsRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPointsRequired() {
        return pointsRequired;
    }

    /**
     * Sets the value of the pointsRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPointsRequired(Double value) {
        this.pointsRequired = value;
    }

    /**
     * Gets the value of the hotelCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelCurrencyCode() {
        return hotelCurrencyCode;
    }

    /**
     * Sets the value of the hotelCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelCurrencyCode(String value) {
        this.hotelCurrencyCode = value;
    }

    /**
     * Gets the value of the transactionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionCode() {
        return transactionCode;
    }

    /**
     * Sets the value of the transactionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionCode(String value) {
        this.transactionCode = value;
    }

    /**
     * Gets the value of the sellBeginDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSellBeginDate() {
        return sellBeginDate;
    }

    /**
     * Sets the value of the sellBeginDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSellBeginDate(XMLGregorianCalendar value) {
        this.sellBeginDate = value;
    }

    /**
     * Gets the value of the sellEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSellEndDate() {
        return sellEndDate;
    }

    /**
     * Sets the value of the sellEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSellEndDate(XMLGregorianCalendar value) {
        this.sellEndDate = value;
    }

    /**
     * Gets the value of the exchangeRateType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchangeRateType() {
        return exchangeRateType;
    }

    /**
     * Sets the value of the exchangeRateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchangeRateType(String value) {
        this.exchangeRateType = value;
    }

    /**
     * Gets the value of the computedPointsRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getComputedPointsRequired() {
        return computedPointsRequired;
    }

    /**
     * Sets the value of the computedPointsRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setComputedPointsRequired(Double value) {
        this.computedPointsRequired = value;
    }

    /**
     * Gets the value of the hotelTotalBillAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHotelTotalBillAmount() {
        return hotelTotalBillAmount;
    }

    /**
     * Sets the value of the hotelTotalBillAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHotelTotalBillAmount(Double value) {
        this.hotelTotalBillAmount = value;
    }

    /**
     * Gets the value of the hotelTotalBillAmountAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHotelTotalBillAmountAllowed() {
        return hotelTotalBillAmountAllowed;
    }

    /**
     * Sets the value of the hotelTotalBillAmountAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHotelTotalBillAmountAllowed(Double value) {
        this.hotelTotalBillAmountAllowed = value;
    }

    /**
     * Gets the value of the centralBillAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCentralBillAmount() {
        return centralBillAmount;
    }

    /**
     * Sets the value of the centralBillAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCentralBillAmount(Double value) {
        this.centralBillAmount = value;
    }

    /**
     * Gets the value of the centralBillAmountAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCentralBillAmountAllowed() {
        return centralBillAmountAllowed;
    }

    /**
     * Sets the value of the centralBillAmountAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCentralBillAmountAllowed(Double value) {
        this.centralBillAmountAllowed = value;
    }

}
