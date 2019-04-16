//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.13 at 09:07:28 PM EST 
//


package com.accure.mismo.pojo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{}_RECONCILIATION" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{}attlist.VALUATION"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "reconciliation"
})
@XmlRootElement(name = "VALUATION")
public class VALUATION {

    @XmlElement(name = "_RECONCILIATION")
    protected RECONCILIATION reconciliation;
    @XmlAttribute(name = "PropertyAppraisedValueAmount")
    @XmlSchemaType(name = "anySimpleType")
    protected String propertyAppraisedValueAmount;
    @XmlAttribute(name = "PropertyForecastedSalePriceAmount")
    @XmlSchemaType(name = "anySimpleType")
    protected String propertyForecastedSalePriceAmount;
    @XmlAttribute(name = "AppraisalEffectiveDate")
    @XmlSchemaType(name = "anySimpleType")
    protected String appraisalEffectiveDate;

    /**
     * Gets the value of the reconciliation property.
     * 
     * @return
     *     possible object is
     *     {@link RECONCILIATION }
     *     
     */
    public RECONCILIATION getRECONCILIATION() {
        return reconciliation;
    }

    /**
     * Sets the value of the reconciliation property.
     * 
     * @param value
     *     allowed object is
     *     {@link RECONCILIATION }
     *     
     */
    public void setRECONCILIATION(RECONCILIATION value) {
        this.reconciliation = value;
    }

    /**
     * Gets the value of the propertyAppraisedValueAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyAppraisedValueAmount() {
        return propertyAppraisedValueAmount;
    }

    /**
     * Sets the value of the propertyAppraisedValueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyAppraisedValueAmount(String value) {
        this.propertyAppraisedValueAmount = value;
    }

    /**
     * Gets the value of the propertyForecastedSalePriceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyForecastedSalePriceAmount() {
        return propertyForecastedSalePriceAmount;
    }

    /**
     * Sets the value of the propertyForecastedSalePriceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyForecastedSalePriceAmount(String value) {
        this.propertyForecastedSalePriceAmount = value;
    }

    /**
     * Gets the value of the appraisalEffectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppraisalEffectiveDate() {
        return appraisalEffectiveDate;
    }

    /**
     * Sets the value of the appraisalEffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppraisalEffectiveDate(String value) {
        this.appraisalEffectiveDate = value;
    }

}
