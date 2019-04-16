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
 *         &lt;element ref="{}UNIT_RENT_SCHEDULE" maxOccurs="unbounded"/>
 *         &lt;element ref="{}RENT_INCLUDES_UTILITY" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{}attlist.MULTIFAMILY_RENT_SCHEDULE"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "unitrentschedule",
    "rentincludesutility"
})
@XmlRootElement(name = "MULTIFAMILY_RENT_SCHEDULE")
public class MULTIFAMILYRENTSCHEDULE {

    @XmlElement(name = "UNIT_RENT_SCHEDULE", required = true)
    protected List<UNITRENTSCHEDULE> unitrentschedule;
    @XmlElement(name = "RENT_INCLUDES_UTILITY")
    protected List<RENTINCLUDESUTILITY> rentincludesutility;
    @XmlAttribute(name = "RentalActualGrossMonthlyRentAmount")
    @XmlSchemaType(name = "anySimpleType")
    protected String rentalActualGrossMonthlyRentAmount;
    @XmlAttribute(name = "RentalActualAdditionalMonthlyIncomeAmount")
    @XmlSchemaType(name = "anySimpleType")
    protected String rentalActualAdditionalMonthlyIncomeAmount;
    @XmlAttribute(name = "RentalActualTotalMonthlyIncomeAmount")
    @XmlSchemaType(name = "anySimpleType")
    protected String rentalActualTotalMonthlyIncomeAmount;
    @XmlAttribute(name = "RentalEstimatedGrossMonthlyRentAmount")
    @XmlSchemaType(name = "anySimpleType")
    protected String rentalEstimatedGrossMonthlyRentAmount;
    @XmlAttribute(name = "RentalEstimatedAdditionalMonthlyIncomeAmount")
    @XmlSchemaType(name = "anySimpleType")
    protected String rentalEstimatedAdditionalMonthlyIncomeAmount;
    @XmlAttribute(name = "RentalEstimatedTotalMonthlyIncomeAmount")
    @XmlSchemaType(name = "anySimpleType")
    protected String rentalEstimatedTotalMonthlyIncomeAmount;
    @XmlAttribute(name = "MarketRentalDataComment")
    @XmlSchemaType(name = "anySimpleType")
    protected String marketRentalDataComment;
    @XmlAttribute(name = "RentalDataAnalysisComment")
    @XmlSchemaType(name = "anySimpleType")
    protected String rentalDataAnalysisComment;

    /**
     * Gets the value of the unitrentschedule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unitrentschedule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUNITRENTSCHEDULE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UNITRENTSCHEDULE }
     * 
     * 
     */
    public List<UNITRENTSCHEDULE> getUNITRENTSCHEDULE() {
        if (unitrentschedule == null) {
            unitrentschedule = new ArrayList<UNITRENTSCHEDULE>();
        }
        return this.unitrentschedule;
    }

    /**
     * Gets the value of the rentincludesutility property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rentincludesutility property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRENTINCLUDESUTILITY().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RENTINCLUDESUTILITY }
     * 
     * 
     */
    public List<RENTINCLUDESUTILITY> getRENTINCLUDESUTILITY() {
        if (rentincludesutility == null) {
            rentincludesutility = new ArrayList<RENTINCLUDESUTILITY>();
        }
        return this.rentincludesutility;
    }

    /**
     * Gets the value of the rentalActualGrossMonthlyRentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRentalActualGrossMonthlyRentAmount() {
        return rentalActualGrossMonthlyRentAmount;
    }

    /**
     * Sets the value of the rentalActualGrossMonthlyRentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRentalActualGrossMonthlyRentAmount(String value) {
        this.rentalActualGrossMonthlyRentAmount = value;
    }

    /**
     * Gets the value of the rentalActualAdditionalMonthlyIncomeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRentalActualAdditionalMonthlyIncomeAmount() {
        return rentalActualAdditionalMonthlyIncomeAmount;
    }

    /**
     * Sets the value of the rentalActualAdditionalMonthlyIncomeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRentalActualAdditionalMonthlyIncomeAmount(String value) {
        this.rentalActualAdditionalMonthlyIncomeAmount = value;
    }

    /**
     * Gets the value of the rentalActualTotalMonthlyIncomeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRentalActualTotalMonthlyIncomeAmount() {
        return rentalActualTotalMonthlyIncomeAmount;
    }

    /**
     * Sets the value of the rentalActualTotalMonthlyIncomeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRentalActualTotalMonthlyIncomeAmount(String value) {
        this.rentalActualTotalMonthlyIncomeAmount = value;
    }

    /**
     * Gets the value of the rentalEstimatedGrossMonthlyRentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRentalEstimatedGrossMonthlyRentAmount() {
        return rentalEstimatedGrossMonthlyRentAmount;
    }

    /**
     * Sets the value of the rentalEstimatedGrossMonthlyRentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRentalEstimatedGrossMonthlyRentAmount(String value) {
        this.rentalEstimatedGrossMonthlyRentAmount = value;
    }

    /**
     * Gets the value of the rentalEstimatedAdditionalMonthlyIncomeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRentalEstimatedAdditionalMonthlyIncomeAmount() {
        return rentalEstimatedAdditionalMonthlyIncomeAmount;
    }

    /**
     * Sets the value of the rentalEstimatedAdditionalMonthlyIncomeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRentalEstimatedAdditionalMonthlyIncomeAmount(String value) {
        this.rentalEstimatedAdditionalMonthlyIncomeAmount = value;
    }

    /**
     * Gets the value of the rentalEstimatedTotalMonthlyIncomeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRentalEstimatedTotalMonthlyIncomeAmount() {
        return rentalEstimatedTotalMonthlyIncomeAmount;
    }

    /**
     * Sets the value of the rentalEstimatedTotalMonthlyIncomeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRentalEstimatedTotalMonthlyIncomeAmount(String value) {
        this.rentalEstimatedTotalMonthlyIncomeAmount = value;
    }

    /**
     * Gets the value of the marketRentalDataComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketRentalDataComment() {
        return marketRentalDataComment;
    }

    /**
     * Sets the value of the marketRentalDataComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketRentalDataComment(String value) {
        this.marketRentalDataComment = value;
    }

    /**
     * Gets the value of the rentalDataAnalysisComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRentalDataAnalysisComment() {
        return rentalDataAnalysisComment;
    }

    /**
     * Sets the value of the rentalDataAnalysisComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRentalDataAnalysisComment(String value) {
        this.rentalDataAnalysisComment = value;
    }

}