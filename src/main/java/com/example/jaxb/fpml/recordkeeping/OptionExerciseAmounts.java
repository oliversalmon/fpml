
package com.example.jaxb.fpml.recordkeeping;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OptionExerciseAmounts complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OptionExerciseAmounts">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;sequence>
 *           &lt;element name="notionalReference" type="{http://www.fpml.org/FpML-5/recordkeeping}NotionalReference" minOccurs="0"/>
 *           &lt;element name="exerciseInNotionalAmount" type="{http://www.fpml.org/FpML-5/recordkeeping}Money" minOccurs="0"/>
 *           &lt;element name="outstandingNotionalAmount" type="{http://www.fpml.org/FpML-5/recordkeeping}Money" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;element name="notionalScheduleReference" type="{http://www.fpml.org/FpML-5/recordkeeping}NotionalReference" minOccurs="0"/>
 *           &lt;element name="exerciseInNotionalSchedule" type="{http://www.fpml.org/FpML-5/recordkeeping}NonNegativeAmountSchedule" minOccurs="0"/>
 *           &lt;element name="outstandingNotionalSchedule" type="{http://www.fpml.org/FpML-5/recordkeeping}NonNegativeAmountSchedule" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;element name="numberOfOptionsReference" type="{http://www.fpml.org/FpML-5/recordkeeping}NumberOfOptionsReference" minOccurs="0"/>
 *           &lt;element name="exerciseInNumberOfOptions" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *           &lt;element name="outstandingNumberOfOptions" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;element name="numberOfUnitsReference" type="{http://www.fpml.org/FpML-5/recordkeeping}NumberOfUnitsReference" minOccurs="0"/>
 *           &lt;element name="exerciseInNumberOfUnits" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *           &lt;element name="outstandingNumberOfUnits" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OptionExerciseAmounts", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "notionalReference",
    "exerciseInNotionalAmount",
    "outstandingNotionalAmount",
    "notionalScheduleReference",
    "exerciseInNotionalSchedule",
    "outstandingNotionalSchedule",
    "numberOfOptionsReference",
    "exerciseInNumberOfOptions",
    "outstandingNumberOfOptions",
    "numberOfUnitsReference",
    "exerciseInNumberOfUnits",
    "outstandingNumberOfUnits"
})
public class OptionExerciseAmounts {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected NotionalReference notionalReference;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Money exerciseInNotionalAmount;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Money outstandingNotionalAmount;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected NotionalReference notionalScheduleReference;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected NonNegativeAmountSchedule exerciseInNotionalSchedule;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected NonNegativeAmountSchedule outstandingNotionalSchedule;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected NumberOfOptionsReference numberOfOptionsReference;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BigDecimal exerciseInNumberOfOptions;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BigDecimal outstandingNumberOfOptions;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected NumberOfUnitsReference numberOfUnitsReference;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BigDecimal exerciseInNumberOfUnits;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BigDecimal outstandingNumberOfUnits;

    /**
     * Gets the value of the notionalReference property.
     * 
     * @return
     *     possible object is
     *     {@link NotionalReference }
     *     
     */
    public NotionalReference getNotionalReference() {
        return notionalReference;
    }

    /**
     * Sets the value of the notionalReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotionalReference }
     *     
     */
    public void setNotionalReference(NotionalReference value) {
        this.notionalReference = value;
    }

    /**
     * Gets the value of the exerciseInNotionalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getExerciseInNotionalAmount() {
        return exerciseInNotionalAmount;
    }

    /**
     * Sets the value of the exerciseInNotionalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setExerciseInNotionalAmount(Money value) {
        this.exerciseInNotionalAmount = value;
    }

    /**
     * Gets the value of the outstandingNotionalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getOutstandingNotionalAmount() {
        return outstandingNotionalAmount;
    }

    /**
     * Sets the value of the outstandingNotionalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setOutstandingNotionalAmount(Money value) {
        this.outstandingNotionalAmount = value;
    }

    /**
     * Gets the value of the notionalScheduleReference property.
     * 
     * @return
     *     possible object is
     *     {@link NotionalReference }
     *     
     */
    public NotionalReference getNotionalScheduleReference() {
        return notionalScheduleReference;
    }

    /**
     * Sets the value of the notionalScheduleReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotionalReference }
     *     
     */
    public void setNotionalScheduleReference(NotionalReference value) {
        this.notionalScheduleReference = value;
    }

    /**
     * Gets the value of the exerciseInNotionalSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeAmountSchedule }
     *     
     */
    public NonNegativeAmountSchedule getExerciseInNotionalSchedule() {
        return exerciseInNotionalSchedule;
    }

    /**
     * Sets the value of the exerciseInNotionalSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeAmountSchedule }
     *     
     */
    public void setExerciseInNotionalSchedule(NonNegativeAmountSchedule value) {
        this.exerciseInNotionalSchedule = value;
    }

    /**
     * Gets the value of the outstandingNotionalSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeAmountSchedule }
     *     
     */
    public NonNegativeAmountSchedule getOutstandingNotionalSchedule() {
        return outstandingNotionalSchedule;
    }

    /**
     * Sets the value of the outstandingNotionalSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeAmountSchedule }
     *     
     */
    public void setOutstandingNotionalSchedule(NonNegativeAmountSchedule value) {
        this.outstandingNotionalSchedule = value;
    }

    /**
     * Gets the value of the numberOfOptionsReference property.
     * 
     * @return
     *     possible object is
     *     {@link NumberOfOptionsReference }
     *     
     */
    public NumberOfOptionsReference getNumberOfOptionsReference() {
        return numberOfOptionsReference;
    }

    /**
     * Sets the value of the numberOfOptionsReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberOfOptionsReference }
     *     
     */
    public void setNumberOfOptionsReference(NumberOfOptionsReference value) {
        this.numberOfOptionsReference = value;
    }

    /**
     * Gets the value of the exerciseInNumberOfOptions property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExerciseInNumberOfOptions() {
        return exerciseInNumberOfOptions;
    }

    /**
     * Sets the value of the exerciseInNumberOfOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExerciseInNumberOfOptions(BigDecimal value) {
        this.exerciseInNumberOfOptions = value;
    }

    /**
     * Gets the value of the outstandingNumberOfOptions property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutstandingNumberOfOptions() {
        return outstandingNumberOfOptions;
    }

    /**
     * Sets the value of the outstandingNumberOfOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutstandingNumberOfOptions(BigDecimal value) {
        this.outstandingNumberOfOptions = value;
    }

    /**
     * Gets the value of the numberOfUnitsReference property.
     * 
     * @return
     *     possible object is
     *     {@link NumberOfUnitsReference }
     *     
     */
    public NumberOfUnitsReference getNumberOfUnitsReference() {
        return numberOfUnitsReference;
    }

    /**
     * Sets the value of the numberOfUnitsReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberOfUnitsReference }
     *     
     */
    public void setNumberOfUnitsReference(NumberOfUnitsReference value) {
        this.numberOfUnitsReference = value;
    }

    /**
     * Gets the value of the exerciseInNumberOfUnits property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExerciseInNumberOfUnits() {
        return exerciseInNumberOfUnits;
    }

    /**
     * Sets the value of the exerciseInNumberOfUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExerciseInNumberOfUnits(BigDecimal value) {
        this.exerciseInNumberOfUnits = value;
    }

    /**
     * Gets the value of the outstandingNumberOfUnits property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutstandingNumberOfUnits() {
        return outstandingNumberOfUnits;
    }

    /**
     * Sets the value of the outstandingNumberOfUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutstandingNumberOfUnits(BigDecimal value) {
        this.outstandingNumberOfUnits = value;
    }

}
