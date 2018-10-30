
package com.example.jaxb.fpml.recordkeeping;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Trigger point at which feature is effective.
 * 
 * <p>Java class for Trigger complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Trigger">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="level" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *           &lt;element name="levelPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *           &lt;choice minOccurs="0">
 *             &lt;element name="creditEvents" type="{http://www.fpml.org/FpML-5/recordkeeping}CreditEvents"/>
 *             &lt;element name="creditEventsReference" type="{http://www.fpml.org/FpML-5/recordkeeping}CreditEventsReference"/>
 *           &lt;/choice>
 *         &lt;/choice>
 *         &lt;element name="triggerType" type="{http://www.fpml.org/FpML-5/recordkeeping}TriggerTypeEnum" minOccurs="0"/>
 *         &lt;element name="triggerTimeType" type="{http://www.fpml.org/FpML-5/recordkeeping}TriggerTimeTypeEnum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Trigger", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "level",
    "levelPercentage",
    "creditEvents",
    "creditEventsReference",
    "triggerType",
    "triggerTimeType"
})
public class Trigger {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BigDecimal level;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BigDecimal levelPercentage;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CreditEvents creditEvents;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CreditEventsReference creditEventsReference;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "token")
    protected TriggerTypeEnum triggerType;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "token")
    protected TriggerTimeTypeEnum triggerTimeType;

    /**
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLevel(BigDecimal value) {
        this.level = value;
    }

    /**
     * Gets the value of the levelPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLevelPercentage() {
        return levelPercentage;
    }

    /**
     * Sets the value of the levelPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLevelPercentage(BigDecimal value) {
        this.levelPercentage = value;
    }

    /**
     * Gets the value of the creditEvents property.
     * 
     * @return
     *     possible object is
     *     {@link CreditEvents }
     *     
     */
    public CreditEvents getCreditEvents() {
        return creditEvents;
    }

    /**
     * Sets the value of the creditEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditEvents }
     *     
     */
    public void setCreditEvents(CreditEvents value) {
        this.creditEvents = value;
    }

    /**
     * Gets the value of the creditEventsReference property.
     * 
     * @return
     *     possible object is
     *     {@link CreditEventsReference }
     *     
     */
    public CreditEventsReference getCreditEventsReference() {
        return creditEventsReference;
    }

    /**
     * Sets the value of the creditEventsReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditEventsReference }
     *     
     */
    public void setCreditEventsReference(CreditEventsReference value) {
        this.creditEventsReference = value;
    }

    /**
     * Gets the value of the triggerType property.
     * 
     * @return
     *     possible object is
     *     {@link TriggerTypeEnum }
     *     
     */
    public TriggerTypeEnum getTriggerType() {
        return triggerType;
    }

    /**
     * Sets the value of the triggerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TriggerTypeEnum }
     *     
     */
    public void setTriggerType(TriggerTypeEnum value) {
        this.triggerType = value;
    }

    /**
     * Gets the value of the triggerTimeType property.
     * 
     * @return
     *     possible object is
     *     {@link TriggerTimeTypeEnum }
     *     
     */
    public TriggerTimeTypeEnum getTriggerTimeType() {
        return triggerTimeType;
    }

    /**
     * Sets the value of the triggerTimeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TriggerTimeTypeEnum }
     *     
     */
    public void setTriggerTimeType(TriggerTimeTypeEnum value) {
        this.triggerTimeType = value;
    }

}
