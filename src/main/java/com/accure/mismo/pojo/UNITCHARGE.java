//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.13 at 09:07:28 PM EST 
//


package com.accure.mismo.pojo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element ref="{}UNIT_CHARGE_UTILITY" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{}attlist.UNIT_CHARGE"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "unitchargeutility"
})
@XmlRootElement(name = "UNIT_CHARGE")
public class UNITCHARGE {

    @XmlElement(name = "UNIT_CHARGE_UTILITY")
    protected List<UNITCHARGEUTILITY> unitchargeutility;
    @XmlAttribute(name = "_ID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "_PeriodType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String periodType;
    @XmlAttribute(name = "_Amount")
    @XmlSchemaType(name = "anySimpleType")
    protected String amount;
    @XmlAttribute(name = "_PerSquareFootAmount")
    @XmlSchemaType(name = "anySimpleType")
    protected String perSquareFootAmount;
    @XmlAttribute(name = "_NoUtilitiesIncludedInAssessmentIndicator")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String noUtilitiesIncludedInAssessmentIndicator;

    /**
     * Gets the value of the unitchargeutility property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unitchargeutility property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUNITCHARGEUTILITY().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UNITCHARGEUTILITY }
     * 
     * 
     */
    public List<UNITCHARGEUTILITY> getUNITCHARGEUTILITY() {
        if (unitchargeutility == null) {
            unitchargeutility = new ArrayList<UNITCHARGEUTILITY>();
        }
        return this.unitchargeutility;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the periodType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriodType() {
        return periodType;
    }

    /**
     * Sets the value of the periodType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriodType(String value) {
        this.periodType = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmount(String value) {
        this.amount = value;
    }

    /**
     * Gets the value of the perSquareFootAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerSquareFootAmount() {
        return perSquareFootAmount;
    }

    /**
     * Sets the value of the perSquareFootAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerSquareFootAmount(String value) {
        this.perSquareFootAmount = value;
    }

    /**
     * Gets the value of the noUtilitiesIncludedInAssessmentIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoUtilitiesIncludedInAssessmentIndicator() {
        return noUtilitiesIncludedInAssessmentIndicator;
    }

    /**
     * Sets the value of the noUtilitiesIncludedInAssessmentIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoUtilitiesIncludedInAssessmentIndicator(String value) {
        this.noUtilitiesIncludedInAssessmentIndicator = value;
    }

}