//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.16 at 01:21:05 PM IST 
//


package com.micros.webservices.og._4_3.unitowners;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.micros.webservices.og._4_3.common.Amount;


/**
 * <p>Java class for ContractTask complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContractTask">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RecordId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="TaskCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Amount" type="{http://webservices.micros.com/og/4.3/Common/}Amount" minOccurs="0"/>
 *         &lt;element name="TaskRhythm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransactionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PostTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OccupiedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PostingRule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SystemStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sequence" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="Nights" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractTask", propOrder = {
    "recordId",
    "taskCode",
    "amount",
    "taskRhythm",
    "transactionCode",
    "postTo",
    "occupiedBy",
    "postingRule",
    "systemStatus",
    "sequence",
    "nights"
})
public class ContractTask {

    @XmlElement(name = "RecordId")
    protected Long recordId;
    @XmlElement(name = "TaskCode", required = true)
    protected String taskCode;
    @XmlElement(name = "Amount")
    protected Amount amount;
    @XmlElement(name = "TaskRhythm")
    protected String taskRhythm;
    @XmlElement(name = "TransactionCode")
    protected String transactionCode;
    @XmlElement(name = "PostTo")
    protected String postTo;
    @XmlElement(name = "OccupiedBy")
    protected String occupiedBy;
    @XmlElement(name = "PostingRule")
    protected String postingRule;
    @XmlElement(name = "SystemStatus")
    protected String systemStatus;
    @XmlElement(name = "Sequence")
    protected BigInteger sequence;
    @XmlElement(name = "Nights")
    protected BigInteger nights;

    /**
     * Gets the value of the recordId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRecordId() {
        return recordId;
    }

    /**
     * Sets the value of the recordId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRecordId(Long value) {
        this.recordId = value;
    }

    /**
     * Gets the value of the taskCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskCode() {
        return taskCode;
    }

    /**
     * Sets the value of the taskCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskCode(String value) {
        this.taskCode = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setAmount(Amount value) {
        this.amount = value;
    }

    /**
     * Gets the value of the taskRhythm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskRhythm() {
        return taskRhythm;
    }

    /**
     * Sets the value of the taskRhythm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskRhythm(String value) {
        this.taskRhythm = value;
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
     * Gets the value of the postTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostTo() {
        return postTo;
    }

    /**
     * Sets the value of the postTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostTo(String value) {
        this.postTo = value;
    }

    /**
     * Gets the value of the occupiedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccupiedBy() {
        return occupiedBy;
    }

    /**
     * Sets the value of the occupiedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccupiedBy(String value) {
        this.occupiedBy = value;
    }

    /**
     * Gets the value of the postingRule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostingRule() {
        return postingRule;
    }

    /**
     * Sets the value of the postingRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostingRule(String value) {
        this.postingRule = value;
    }

    /**
     * Gets the value of the systemStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemStatus() {
        return systemStatus;
    }

    /**
     * Sets the value of the systemStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemStatus(String value) {
        this.systemStatus = value;
    }

    /**
     * Gets the value of the sequence property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSequence(BigInteger value) {
        this.sequence = value;
    }

    /**
     * Gets the value of the nights property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNights() {
        return nights;
    }

    /**
     * Sets the value of the nights property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNights(BigInteger value) {
        this.nights = value;
    }

}
