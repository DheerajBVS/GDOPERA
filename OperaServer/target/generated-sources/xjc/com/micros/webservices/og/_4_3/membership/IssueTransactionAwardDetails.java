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
import com.micros.webservices.og._4_3.common.Address;
import com.micros.webservices.og._4_3.common.PersonName;
import com.micros.webservices.og._4_3.common.Phone;
import com.micros.webservices.og._4_3.common.UserDefinedValueList;
import com.micros.webservices.og._4_3.hotelcommon.HotelReference;


/**
 * represents a data needs to sent to redeem transaction awards from external system to opera
 * 
 * <p>Java class for IssueTransactionAwardDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IssueTransactionAwardDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MembershipType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AwardType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="HotelReference" type="{http://webservices.micros.com/og/4.3/HotelCommon/}HotelReference" minOccurs="0"/>
 *         &lt;element name="PointsRequired" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="TransactionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SellBeginDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="SellEndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="HotelCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CentralCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExchangeRateType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonName" type="{http://webservices.micros.com/og/4.3/Common/}PersonName" minOccurs="0"/>
 *         &lt;element name="Address" type="{http://webservices.micros.com/og/4.3/Common/}Address" minOccurs="0"/>
 *         &lt;element name="UDFsList" type="{http://webservices.micros.com/og/4.3/Common/}UserDefinedValueList" minOccurs="0"/>
 *         &lt;element name="IssueKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IssueKeyRaw" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="Phone" type="{http://webservices.micros.com/og/4.3/Common/}Phone" minOccurs="0"/>
 *         &lt;element name="NumberOfRooms" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NumberOfAdults" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="HotelTotalBillAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IssueTransactionAwardDetails", propOrder = {
    "membershipType",
    "awardType",
    "hotelReference",
    "pointsRequired",
    "transactionCode",
    "sellBeginDate",
    "sellEndDate",
    "hotelCurrencyCode",
    "centralCurrencyCode",
    "exchangeRateType",
    "personName",
    "address",
    "udFsList",
    "issueKey",
    "issueKeyRaw",
    "phone",
    "numberOfRooms",
    "numberOfAdults",
    "hotelTotalBillAmount"
})
public class IssueTransactionAwardDetails {

    @XmlElement(name = "MembershipType", required = true)
    protected String membershipType;
    @XmlElement(name = "AwardType", required = true)
    protected String awardType;
    @XmlElement(name = "HotelReference")
    protected HotelReference hotelReference;
    @XmlElement(name = "PointsRequired")
    protected Double pointsRequired;
    @XmlElement(name = "TransactionCode")
    protected String transactionCode;
    @XmlElement(name = "SellBeginDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar sellBeginDate;
    @XmlElement(name = "SellEndDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar sellEndDate;
    @XmlElement(name = "HotelCurrencyCode")
    protected String hotelCurrencyCode;
    @XmlElement(name = "CentralCurrencyCode")
    protected String centralCurrencyCode;
    @XmlElement(name = "ExchangeRateType")
    protected String exchangeRateType;
    @XmlElement(name = "PersonName")
    protected PersonName personName;
    @XmlElement(name = "Address")
    protected Address address;
    @XmlElement(name = "UDFsList")
    protected UserDefinedValueList udFsList;
    @XmlElement(name = "IssueKey")
    protected String issueKey;
    @XmlElement(name = "IssueKeyRaw")
    protected byte[] issueKeyRaw;
    @XmlElement(name = "Phone")
    protected Phone phone;
    @XmlElement(name = "NumberOfRooms")
    protected Integer numberOfRooms;
    @XmlElement(name = "NumberOfAdults")
    protected Integer numberOfAdults;
    @XmlElement(name = "HotelTotalBillAmount")
    protected Double hotelTotalBillAmount;

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
     * Gets the value of the personName property.
     * 
     * @return
     *     possible object is
     *     {@link PersonName }
     *     
     */
    public PersonName getPersonName() {
        return personName;
    }

    /**
     * Sets the value of the personName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonName }
     *     
     */
    public void setPersonName(PersonName value) {
        this.personName = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
    }

    /**
     * Gets the value of the udFsList property.
     * 
     * @return
     *     possible object is
     *     {@link UserDefinedValueList }
     *     
     */
    public UserDefinedValueList getUDFsList() {
        return udFsList;
    }

    /**
     * Sets the value of the udFsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserDefinedValueList }
     *     
     */
    public void setUDFsList(UserDefinedValueList value) {
        this.udFsList = value;
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
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link Phone }
     *     
     */
    public Phone getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link Phone }
     *     
     */
    public void setPhone(Phone value) {
        this.phone = value;
    }

    /**
     * Gets the value of the numberOfRooms property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfRooms() {
        return numberOfRooms;
    }

    /**
     * Sets the value of the numberOfRooms property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfRooms(Integer value) {
        this.numberOfRooms = value;
    }

    /**
     * Gets the value of the numberOfAdults property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfAdults() {
        return numberOfAdults;
    }

    /**
     * Sets the value of the numberOfAdults property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfAdults(Integer value) {
        this.numberOfAdults = value;
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

}
