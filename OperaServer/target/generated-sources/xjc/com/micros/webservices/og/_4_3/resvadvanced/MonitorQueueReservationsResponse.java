//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.16 at 01:21:05 PM IST 
//


package com.micros.webservices.og._4_3.resvadvanced;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.micros.webservices.og._4_3.common.ResultStatus;


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
 *         &lt;element name="Result" type="{http://webservices.micros.com/og/4.3/Common/}ResultStatus"/>
 *         &lt;element name="QueueDetails" type="{http://webservices.micros.com/og/4.3/ResvAdvanced/}QueueDataList" minOccurs="0"/>
 *         &lt;element name="QueueTime" type="{http://webservices.micros.com/og/4.3/ResvAdvanced/}QueueTime" minOccurs="0"/>
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
    "result",
    "queueDetails",
    "queueTime"
})
@XmlRootElement(name = "MonitorQueueReservationsResponse")
public class MonitorQueueReservationsResponse {

    @XmlElement(name = "Result", required = true)
    protected ResultStatus result;
    @XmlElement(name = "QueueDetails")
    protected QueueDataList queueDetails;
    @XmlElement(name = "QueueTime")
    protected QueueTime queueTime;

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link ResultStatus }
     *     
     */
    public ResultStatus getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultStatus }
     *     
     */
    public void setResult(ResultStatus value) {
        this.result = value;
    }

    /**
     * Gets the value of the queueDetails property.
     * 
     * @return
     *     possible object is
     *     {@link QueueDataList }
     *     
     */
    public QueueDataList getQueueDetails() {
        return queueDetails;
    }

    /**
     * Sets the value of the queueDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueueDataList }
     *     
     */
    public void setQueueDetails(QueueDataList value) {
        this.queueDetails = value;
    }

    /**
     * Gets the value of the queueTime property.
     * 
     * @return
     *     possible object is
     *     {@link QueueTime }
     *     
     */
    public QueueTime getQueueTime() {
        return queueTime;
    }

    /**
     * Sets the value of the queueTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueueTime }
     *     
     */
    public void setQueueTime(QueueTime value) {
        this.queueTime = value;
    }

}