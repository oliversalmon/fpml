
package com.example.jaxb.fpml.recordkeeping;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A structure describing a change to the size of a single leg or stream of a trade.
 * 
 * <p>Java class for TradeLegSizeChange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradeLegSizeChange">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}TradeLegNotionalChange.model"/>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}TradeLegNumberOfOptionsChange.model"/>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}TradeLegNumberOfUnitsChange.model"/>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}TradeLegNotionalScheduleChange.model"/>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}TradeLegFixedAmountChange.model"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeLegSizeChange", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "notionalReference",
    "changeInNotionalAmount",
    "outstandingNotionalAmount",
    "numberOfOptionsReference",
    "changeInNumberOfOptions",
    "outstandingNumberOfOptions",
    "numberOfUnitsReference",
    "changeInNumberOfUnits",
    "outstandingNumberOfUnits",
    "notionalScheduleReference",
    "changeInNotionalSchedule",
    "outstandingNotionalSchedule",
    "knownAmountReference",
    "changeInKnownAmount",
    "outstandingKnownAmount"
})
public class TradeLegSizeChange {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected NotionalReference notionalReference;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected NonNegativeMoney changeInNotionalAmount;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected NonNegativeMoney outstandingNotionalAmount;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected NumberOfOptionsReference numberOfOptionsReference;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BigDecimal changeInNumberOfOptions;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BigDecimal outstandingNumberOfOptions;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected NumberOfUnitsReference numberOfUnitsReference;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BigDecimal changeInNumberOfUnits;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BigDecimal outstandingNumberOfUnits;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected NotionalReference notionalScheduleReference;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected NonNegativeAmountSchedule changeInNotionalSchedule;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected NonNegativeAmountSchedule outstandingNotionalSchedule;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected AmountReference knownAmountReference;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected NonNegativeMoney changeInKnownAmount;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected NonNegativeMoney outstandingKnownAmount;

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
     * Gets the value of the changeInNotionalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMoney }
     *     
     */
    public NonNegativeMoney getChangeInNotionalAmount() {
        return changeInNotionalAmount;
    }

    /**
     * Sets the value of the changeInNotionalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMoney }
     *     
     */
    public void setChangeInNotionalAmount(NonNegativeMoney value) {
        this.changeInNotionalAmount = value;
    }

    /**
     * Gets the value of the outstandingNotionalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMoney }
     *     
     */
    public NonNegativeMoney getOutstandingNotionalAmount() {
        return outstandingNotionalAmount;
    }

    /**
     * Sets the value of the outstandingNotionalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMoney }
     *     
     */
    public void setOutstandingNotionalAmount(NonNegativeMoney value) {
        this.outstandingNotionalAmount = value;
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
     * Gets the value of the changeInNumberOfOptions property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getChangeInNumberOfOptions() {
        return changeInNumberOfOptions;
    }

    /**
     * Sets the value of the changeInNumberOfOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setChangeInNumberOfOptions(BigDecimal value) {
        this.changeInNumberOfOptions = value;
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
     * Gets the value of the changeInNumberOfUnits property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getChangeInNumberOfUnits() {
        return changeInNumberOfUnits;
    }

    /**
     * Sets the value of the changeInNumberOfUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setChangeInNumberOfUnits(BigDecimal value) {
        this.changeInNumberOfUnits = value;
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
     * Gets the value of the changeInNotionalSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeAmountSchedule }
     *     
     */
    public NonNegativeAmountSchedule getChangeInNotionalSchedule() {
        return changeInNotionalSchedule;
    }

    /**
     * Sets the value of the changeInNotionalSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeAmountSchedule }
     *     
     */
    public void setChangeInNotionalSchedule(NonNegativeAmountSchedule value) {
        this.changeInNotionalSchedule = value;
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
     * Gets the value of the knownAmountReference property.
     * 
     * @return
     *     possible object is
     *     {@link AmountReference }
     *     
     */
    public AmountReference getKnownAmountReference() {
        return knownAmountReference;
    }

    /**
     * Sets the value of the knownAmountReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountReference }
     *     
     */
    public void setKnownAmountReference(AmountReference value) {
        this.knownAmountReference = value;
    }

    /**
     * Gets the value of the changeInKnownAmount property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMoney }
     *     
     */
    public NonNegativeMoney getChangeInKnownAmount() {
        return changeInKnownAmount;
    }

    /**
     * Sets the value of the changeInKnownAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMoney }
     *     
     */
    public void setChangeInKnownAmount(NonNegativeMoney value) {
        this.changeInKnownAmount = value;
    }

    /**
     * Gets the value of the outstandingKnownAmount property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMoney }
     *     
     */
    public NonNegativeMoney getOutstandingKnownAmount() {
        return outstandingKnownAmount;
    }

    /**
     * Sets the value of the outstandingKnownAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMoney }
     *     
     */
    public void setOutstandingKnownAmount(NonNegativeMoney value) {
        this.outstandingKnownAmount = value;
    }

}
