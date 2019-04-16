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
 *         &lt;element ref="{}SITE_FEATURE" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}FLOOD_ZONE" minOccurs="0"/>
 *         &lt;element ref="{}SITE_UTILITY" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{}attlist.SITE"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sitefeature",
    "floodzone",
    "siteutility"
})
@XmlRootElement(name = "SITE")
public class SITE {

    @XmlElement(name = "SITE_FEATURE")
    protected List<SITEFEATURE> sitefeature;
    @XmlElement(name = "FLOOD_ZONE")
    protected FLOODZONE floodzone;
    @XmlElement(name = "SITE_UTILITY")
    protected List<SITEUTILITY> siteutility;
    @XmlAttribute(name = "_ID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "_Comment")
    @XmlSchemaType(name = "anySimpleType")
    protected String comment;
    @XmlAttribute(name = "CornerLotIndicator")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String cornerLotIndicator;
    @XmlAttribute(name = "DepthFeetCount")
    @XmlSchemaType(name = "anySimpleType")
    protected String depthFeetCount;
    @XmlAttribute(name = "HighestBestUseIndicator")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String highestBestUseIndicator;
    @XmlAttribute(name = "HighestBestUseDescription")
    @XmlSchemaType(name = "anySimpleType")
    protected String highestBestUseDescription;
    @XmlAttribute(name = "PropertyAcreageNumber")
    @XmlSchemaType(name = "anySimpleType")
    protected String propertyAcreageNumber;
    @XmlAttribute(name = "SquareFeetCount")
    @XmlSchemaType(name = "anySimpleType")
    protected String squareFeetCount;
    @XmlAttribute(name = "_AdverseEasementsIndicator")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String adverseEasementsIndicator;
    @XmlAttribute(name = "_AdverseEasementsDescription")
    @XmlSchemaType(name = "anySimpleType")
    protected String adverseEasementsDescription;
    @XmlAttribute(name = "_AdverseEnvironmentalFactorsComment")
    @XmlSchemaType(name = "anySimpleType")
    protected String adverseEnvironmentalFactorsComment;
    @XmlAttribute(name = "_AreaDescription")
    @XmlSchemaType(name = "anySimpleType")
    protected String areaDescription;
    @XmlAttribute(name = "_DimensionsDescription")
    @XmlSchemaType(name = "anySimpleType")
    protected String dimensionsDescription;
    @XmlAttribute(name = "_UndergroundUtilitiesIndicator")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String undergroundUtilitiesIndicator;
    @XmlAttribute(name = "_ZoningComplianceType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String zoningComplianceType;
    @XmlAttribute(name = "_ZoningComplianceDescription")
    @XmlSchemaType(name = "anySimpleType")
    protected String zoningComplianceDescription;
    @XmlAttribute(name = "_ZoningClassificationIdentifier")
    @XmlSchemaType(name = "anySimpleType")
    protected String zoningClassificationIdentifier;
    @XmlAttribute(name = "_ZoningClassificationDescription")
    @XmlSchemaType(name = "anySimpleType")
    protected String zoningClassificationDescription;
    @XmlAttribute(name = "_ZoningPermitRebuildToCurrentDensityIndicator")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String zoningPermitRebuildToCurrentDensityIndicator;
    @XmlAttribute(name = "PropertyZoningCategoryType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String propertyZoningCategoryType;
    @XmlAttribute(name = "PropertyZoningCategoryTypeOtherDescription")
    @XmlSchemaType(name = "anySimpleType")
    protected String propertyZoningCategoryTypeOtherDescription;
    @XmlAttribute(name = "WidthFeetCount")
    @XmlSchemaType(name = "anySimpleType")
    protected String widthFeetCount;
    @XmlAttribute(name = "RatingConditionType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String ratingConditionType;
    @XmlAttribute(name = "CharacteristicsAffectMarketabilityDescription")
    @XmlSchemaType(name = "anySimpleType")
    protected String characteristicsAffectMarketabilityDescription;

    /**
     * Gets the value of the sitefeature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sitefeature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSITEFEATURE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SITEFEATURE }
     * 
     * 
     */
    public List<SITEFEATURE> getSITEFEATURE() {
        if (sitefeature == null) {
            sitefeature = new ArrayList<SITEFEATURE>();
        }
        return this.sitefeature;
    }

    /**
     * Gets the value of the floodzone property.
     * 
     * @return
     *     possible object is
     *     {@link FLOODZONE }
     *     
     */
    public FLOODZONE getFLOODZONE() {
        return floodzone;
    }

    /**
     * Sets the value of the floodzone property.
     * 
     * @param value
     *     allowed object is
     *     {@link FLOODZONE }
     *     
     */
    public void setFLOODZONE(FLOODZONE value) {
        this.floodzone = value;
    }

    /**
     * Gets the value of the siteutility property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the siteutility property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSITEUTILITY().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SITEUTILITY }
     * 
     * 
     */
    public List<SITEUTILITY> getSITEUTILITY() {
        if (siteutility == null) {
            siteutility = new ArrayList<SITEUTILITY>();
        }
        return this.siteutility;
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
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the cornerLotIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCornerLotIndicator() {
        return cornerLotIndicator;
    }

    /**
     * Sets the value of the cornerLotIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCornerLotIndicator(String value) {
        this.cornerLotIndicator = value;
    }

    /**
     * Gets the value of the depthFeetCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepthFeetCount() {
        return depthFeetCount;
    }

    /**
     * Sets the value of the depthFeetCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepthFeetCount(String value) {
        this.depthFeetCount = value;
    }

    /**
     * Gets the value of the highestBestUseIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHighestBestUseIndicator() {
        return highestBestUseIndicator;
    }

    /**
     * Sets the value of the highestBestUseIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHighestBestUseIndicator(String value) {
        this.highestBestUseIndicator = value;
    }

    /**
     * Gets the value of the highestBestUseDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHighestBestUseDescription() {
        return highestBestUseDescription;
    }

    /**
     * Sets the value of the highestBestUseDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHighestBestUseDescription(String value) {
        this.highestBestUseDescription = value;
    }

    /**
     * Gets the value of the propertyAcreageNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyAcreageNumber() {
        return propertyAcreageNumber;
    }

    /**
     * Sets the value of the propertyAcreageNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyAcreageNumber(String value) {
        this.propertyAcreageNumber = value;
    }

    /**
     * Gets the value of the squareFeetCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSquareFeetCount() {
        return squareFeetCount;
    }

    /**
     * Sets the value of the squareFeetCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSquareFeetCount(String value) {
        this.squareFeetCount = value;
    }

    /**
     * Gets the value of the adverseEasementsIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdverseEasementsIndicator() {
        return adverseEasementsIndicator;
    }

    /**
     * Sets the value of the adverseEasementsIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdverseEasementsIndicator(String value) {
        this.adverseEasementsIndicator = value;
    }

    /**
     * Gets the value of the adverseEasementsDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdverseEasementsDescription() {
        return adverseEasementsDescription;
    }

    /**
     * Sets the value of the adverseEasementsDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdverseEasementsDescription(String value) {
        this.adverseEasementsDescription = value;
    }

    /**
     * Gets the value of the adverseEnvironmentalFactorsComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdverseEnvironmentalFactorsComment() {
        return adverseEnvironmentalFactorsComment;
    }

    /**
     * Sets the value of the adverseEnvironmentalFactorsComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdverseEnvironmentalFactorsComment(String value) {
        this.adverseEnvironmentalFactorsComment = value;
    }

    /**
     * Gets the value of the areaDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaDescription() {
        return areaDescription;
    }

    /**
     * Sets the value of the areaDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaDescription(String value) {
        this.areaDescription = value;
    }

    /**
     * Gets the value of the dimensionsDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDimensionsDescription() {
        return dimensionsDescription;
    }

    /**
     * Sets the value of the dimensionsDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDimensionsDescription(String value) {
        this.dimensionsDescription = value;
    }

    /**
     * Gets the value of the undergroundUtilitiesIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUndergroundUtilitiesIndicator() {
        return undergroundUtilitiesIndicator;
    }

    /**
     * Sets the value of the undergroundUtilitiesIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUndergroundUtilitiesIndicator(String value) {
        this.undergroundUtilitiesIndicator = value;
    }

    /**
     * Gets the value of the zoningComplianceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZoningComplianceType() {
        return zoningComplianceType;
    }

    /**
     * Sets the value of the zoningComplianceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZoningComplianceType(String value) {
        this.zoningComplianceType = value;
    }

    /**
     * Gets the value of the zoningComplianceDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZoningComplianceDescription() {
        return zoningComplianceDescription;
    }

    /**
     * Sets the value of the zoningComplianceDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZoningComplianceDescription(String value) {
        this.zoningComplianceDescription = value;
    }

    /**
     * Gets the value of the zoningClassificationIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZoningClassificationIdentifier() {
        return zoningClassificationIdentifier;
    }

    /**
     * Sets the value of the zoningClassificationIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZoningClassificationIdentifier(String value) {
        this.zoningClassificationIdentifier = value;
    }

    /**
     * Gets the value of the zoningClassificationDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZoningClassificationDescription() {
        return zoningClassificationDescription;
    }

    /**
     * Sets the value of the zoningClassificationDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZoningClassificationDescription(String value) {
        this.zoningClassificationDescription = value;
    }

    /**
     * Gets the value of the zoningPermitRebuildToCurrentDensityIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZoningPermitRebuildToCurrentDensityIndicator() {
        return zoningPermitRebuildToCurrentDensityIndicator;
    }

    /**
     * Sets the value of the zoningPermitRebuildToCurrentDensityIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZoningPermitRebuildToCurrentDensityIndicator(String value) {
        this.zoningPermitRebuildToCurrentDensityIndicator = value;
    }

    /**
     * Gets the value of the propertyZoningCategoryType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyZoningCategoryType() {
        return propertyZoningCategoryType;
    }

    /**
     * Sets the value of the propertyZoningCategoryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyZoningCategoryType(String value) {
        this.propertyZoningCategoryType = value;
    }

    /**
     * Gets the value of the propertyZoningCategoryTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyZoningCategoryTypeOtherDescription() {
        return propertyZoningCategoryTypeOtherDescription;
    }

    /**
     * Sets the value of the propertyZoningCategoryTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyZoningCategoryTypeOtherDescription(String value) {
        this.propertyZoningCategoryTypeOtherDescription = value;
    }

    /**
     * Gets the value of the widthFeetCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWidthFeetCount() {
        return widthFeetCount;
    }

    /**
     * Sets the value of the widthFeetCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWidthFeetCount(String value) {
        this.widthFeetCount = value;
    }

    /**
     * Gets the value of the ratingConditionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatingConditionType() {
        return ratingConditionType;
    }

    /**
     * Sets the value of the ratingConditionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatingConditionType(String value) {
        this.ratingConditionType = value;
    }

    /**
     * Gets the value of the characteristicsAffectMarketabilityDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharacteristicsAffectMarketabilityDescription() {
        return characteristicsAffectMarketabilityDescription;
    }

    /**
     * Sets the value of the characteristicsAffectMarketabilityDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharacteristicsAffectMarketabilityDescription(String value) {
        this.characteristicsAffectMarketabilityDescription = value;
    }

}
