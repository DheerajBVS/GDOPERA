//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.22 at 04:53:58 PM IST 
//


package com.micros.webservices.og._4_3.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InternalID complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InternalID">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://webservices.micros.com/og/4.3/Common/>UniqueID">
 *       &lt;attribute name="actionType" type="{http://webservices.micros.com/og/4.3/Common/}RequestActionType" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InternalID")
public class InternalID
    extends UniqueID
{

    @XmlAttribute(name = "actionType")
    protected RequestActionType actionType;

    /**
     * Gets the value of the actionType property.
     * 
     * @return
     *     possible object is
     *     {@link RequestActionType }
     *     
     */
    public RequestActionType getActionType() {
        return actionType;
    }

    /**
     * Sets the value of the actionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestActionType }
     *     
     */
    public void setActionType(RequestActionType value) {
        this.actionType = value;
    }

}
