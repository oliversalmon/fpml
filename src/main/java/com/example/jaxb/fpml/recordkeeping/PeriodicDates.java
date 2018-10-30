
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PeriodicDates complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PeriodicDates">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="calculationStartDate" type="{http://www.fpml.org/FpML-5/recordkeeping}AdjustableOrRelativeDate" minOccurs="0"/>
 *         &lt;element name="calculationEndDate" type="{http://www.fpml.org/FpML-5/recordkeeping}AdjustableOrRelativeDate" minOccurs="0"/>
 *         &lt;element name="calculationPeriodFrequency" type="{http://www.fpml.org/FpML-5/recordkeeping}CalculationPeriodFrequency" minOccurs="0"/>
 *         &lt;element name="calculationPeriodDatesAdjustments" type="{http://www.fpml.org/FpML-5/recordkeeping}BusinessDayAdjustments" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PeriodicDates", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "calculationStartDate",
    "calculationEndDate",
    "calculationPeriodFrequency",
    "calculationPeriodDatesAdjustments"
})
public class PeriodicDates {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected AdjustableOrRelativeDate calculationStartDate;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected AdjustableOrRelativeDate calculationEndDate;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CalculationPeriodFrequency calculationPeriodFrequency;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BusinessDayAdjustments calculationPeriodDatesAdjustments;

    /**
     * Gets the value of the calculationStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustableOrRelativeDate }
     *     
     */
    public AdjustableOrRelativeDate getCalculationStartDate() {
        return calculationStartDate;
    }

    /**
     * Sets the value of the calculationStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustableOrRelativeDate }
     *     
     */
    public void setCalculationStartDate(AdjustableOrRelativeDate value) {
        this.calculationStartDate = value;
    }

    /**
     * Gets the value of the calculationEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustableOrRelativeDate }
     *     
     */
    public AdjustableOrRelativeDate getCalculationEndDate() {
        return calculationEndDate;
    }

    /**
     * Sets the value of the calculationEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustableOrRelativeDate }
     *     
     */
    public void setCalculationEndDate(AdjustableOrRelativeDate value) {
        this.calculationEndDate = value;
    }

    /**
     * Gets the value of the calculationPeriodFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link CalculationPeriodFrequency }
     *     
     */
    public CalculationPeriodFrequency getCalculationPeriodFrequency() {
        return calculationPeriodFrequency;
    }

    /**
     * Sets the value of the calculationPeriodFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculationPeriodFrequency }
     *     
     */
    public void setCalculationPeriodFrequency(CalculationPeriodFrequency value) {
        this.calculationPeriodFrequency = value;
    }

    /**
     * Gets the value of the calculationPeriodDatesAdjustments property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDayAdjustments }
     *     
     */
    public BusinessDayAdjustments getCalculationPeriodDatesAdjustments() {
        return calculationPeriodDatesAdjustments;
    }

    /**
     * Sets the value of the calculationPeriodDatesAdjustments property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDayAdjustments }
     *     
     */
    public void setCalculationPeriodDatesAdjustments(BusinessDayAdjustments value) {
        this.calculationPeriodDatesAdjustments = value;
    }

}
