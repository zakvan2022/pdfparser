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
 *       &lt;attGroup ref="{}attlist.COOLING"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "COOLING")
public class COOLING {

    @XmlAttribute(name = "_ID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "AdequateIndicator")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String adequateIndicator;
    @XmlAttribute(name = "_AdditionalUnitDescription")
    @XmlSchemaType(name = "anySimpleType")
    protected String additionalUnitDescription;
    @XmlAttribute(name = "_AdditionalUnitName")
    @XmlSchemaType(name = "anySimpleType")
    protected String additionalUnitName;
    @XmlAttribute(name = "_CentralizedIndicator")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String centralizedIndicator;
    @XmlAttribute(name = "_IndividualIndicator")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String individualIndicator;
    @XmlAttribute(name = "_OtherIndicator")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String otherIndicator;
    @XmlAttribute(name = "_UnitDescription")
    @XmlSchemaType(name = "anySimpleType")
    protected String unitDescription;
    @XmlAttribute(name = "_UnitConditionDescription")
    @XmlSchemaType(name = "anySimpleType")
    protected String unitConditionDescription;

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
     * Gets the value of the adequateIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdequateIndicator() {
        return adequateIndicator;
    }

    /**
     * Sets the value of the adequateIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdequateIndicator(String value) {
        this.adequateIndicator = value;
    }

    /**
     * Gets the value of the additionalUnitDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalUnitDescription() {
        return additionalUnitDescription;
    }

    /**
     * Sets the value of the additionalUnitDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalUnitDescription(String value) {
        this.additionalUnitDescription = value;
    }

    /**
     * Gets the value of the additionalUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalUnitName() {
        return additionalUnitName;
    }

    /**
     * Sets the value of the additionalUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalUnitName(String value) {
        this.additionalUnitName = value;
    }

    /**
     * Gets the value of the centralizedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCentralizedIndicator() {
        return centralizedIndicator;
    }

    /**
     * Sets the value of the centralizedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCentralizedIndicator(String value) {
        this.centralizedIndicator = value;
    }

    /**
     * Gets the value of the individualIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndividualIndicator() {
        return individualIndicator;
    }

    /**
     * Sets the value of the individualIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndividualIndicator(String value) {
        this.individualIndicator = value;
    }

    /**
     * Gets the value of the otherIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherIndicator() {
        return otherIndicator;
    }

    /**
     * Sets the value of the otherIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherIndicator(String value) {
        this.otherIndicator = value;
    }

    /**
     * Gets the value of the unitDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitDescription() {
        return unitDescription;
    }

    /**
     * Sets the value of the unitDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitDescription(String value) {
        this.unitDescription = value;
    }

    /**
     * Gets the value of the unitConditionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitConditionDescription() {
        return unitConditionDescription;
    }

    /**
     * Sets the value of the unitConditionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitConditionDescription(String value) {
        this.unitConditionDescription = value;
    }

}
