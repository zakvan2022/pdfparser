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
 *       &lt;attGroup ref="{}attlist.UNPLATTED_LAND"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "UNPLATTED_LAND")
public class UNPLATTEDLAND {

    @XmlAttribute(name = "_ID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "_DescriptionType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String descriptionType;
    @XmlAttribute(name = "_DescriptionTypeOtherDescription")
    @XmlSchemaType(name = "anySimpleType")
    protected String descriptionTypeOtherDescription;
    @XmlAttribute(name = "PropertyTownshipIdentifier")
    @XmlSchemaType(name = "anySimpleType")
    protected String propertyTownshipIdentifier;
    @XmlAttribute(name = "PropertyRangeIdentifier")
    @XmlSchemaType(name = "anySimpleType")
    protected String propertyRangeIdentifier;
    @XmlAttribute(name = "PropertySectionIdentifier")
    @XmlSchemaType(name = "anySimpleType")
    protected String propertySectionIdentifier;
    @XmlAttribute(name = "_AbstractNumberIdentifier")
    @XmlSchemaType(name = "anySimpleType")
    protected String abstractNumberIdentifier;
    @XmlAttribute(name = "_BaseIdentifier")
    @XmlSchemaType(name = "anySimpleType")
    protected String baseIdentifier;
    @XmlAttribute(name = "_LandGrantIdentifier")
    @XmlSchemaType(name = "anySimpleType")
    protected String landGrantIdentifier;
    @XmlAttribute(name = "_MeridianIdentifier")
    @XmlSchemaType(name = "anySimpleType")
    protected String meridianIdentifier;
    @XmlAttribute(name = "_MetesAndBoundsRemainingDescription")
    @XmlSchemaType(name = "anySimpleType")
    protected String metesAndBoundsRemainingDescription;
    @XmlAttribute(name = "_QuarterSectionIdentifier")
    @XmlSchemaType(name = "anySimpleType")
    protected String quarterSectionIdentifier;

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
     * Gets the value of the descriptionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionType() {
        return descriptionType;
    }

    /**
     * Sets the value of the descriptionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionType(String value) {
        this.descriptionType = value;
    }

    /**
     * Gets the value of the descriptionTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionTypeOtherDescription() {
        return descriptionTypeOtherDescription;
    }

    /**
     * Sets the value of the descriptionTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionTypeOtherDescription(String value) {
        this.descriptionTypeOtherDescription = value;
    }

    /**
     * Gets the value of the propertyTownshipIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyTownshipIdentifier() {
        return propertyTownshipIdentifier;
    }

    /**
     * Sets the value of the propertyTownshipIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyTownshipIdentifier(String value) {
        this.propertyTownshipIdentifier = value;
    }

    /**
     * Gets the value of the propertyRangeIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyRangeIdentifier() {
        return propertyRangeIdentifier;
    }

    /**
     * Sets the value of the propertyRangeIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyRangeIdentifier(String value) {
        this.propertyRangeIdentifier = value;
    }

    /**
     * Gets the value of the propertySectionIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertySectionIdentifier() {
        return propertySectionIdentifier;
    }

    /**
     * Sets the value of the propertySectionIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertySectionIdentifier(String value) {
        this.propertySectionIdentifier = value;
    }

    /**
     * Gets the value of the abstractNumberIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbstractNumberIdentifier() {
        return abstractNumberIdentifier;
    }

    /**
     * Sets the value of the abstractNumberIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbstractNumberIdentifier(String value) {
        this.abstractNumberIdentifier = value;
    }

    /**
     * Gets the value of the baseIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseIdentifier() {
        return baseIdentifier;
    }

    /**
     * Sets the value of the baseIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseIdentifier(String value) {
        this.baseIdentifier = value;
    }

    /**
     * Gets the value of the landGrantIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLandGrantIdentifier() {
        return landGrantIdentifier;
    }

    /**
     * Sets the value of the landGrantIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLandGrantIdentifier(String value) {
        this.landGrantIdentifier = value;
    }

    /**
     * Gets the value of the meridianIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeridianIdentifier() {
        return meridianIdentifier;
    }

    /**
     * Sets the value of the meridianIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeridianIdentifier(String value) {
        this.meridianIdentifier = value;
    }

    /**
     * Gets the value of the metesAndBoundsRemainingDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetesAndBoundsRemainingDescription() {
        return metesAndBoundsRemainingDescription;
    }

    /**
     * Sets the value of the metesAndBoundsRemainingDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetesAndBoundsRemainingDescription(String value) {
        this.metesAndBoundsRemainingDescription = value;
    }

    /**
     * Gets the value of the quarterSectionIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuarterSectionIdentifier() {
        return quarterSectionIdentifier;
    }

    /**
     * Sets the value of the quarterSectionIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuarterSectionIdentifier(String value) {
        this.quarterSectionIdentifier = value;
    }

}