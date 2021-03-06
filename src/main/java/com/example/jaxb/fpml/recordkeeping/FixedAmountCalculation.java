
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FixedAmountCalculation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FixedAmountCalculation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="calculationAmount" type="{http://www.fpml.org/FpML-5/recordkeeping}CalculationAmount" minOccurs="0"/>
 *         &lt;element name="fixedRate" type="{http://www.fpml.org/FpML-5/recordkeeping}FixedRate"/>
 *         &lt;element name="dayCountFraction" type="{http://www.fpml.org/FpML-5/recordkeeping}DayCountFraction" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FixedAmountCalculation", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "calculationAmount",
    "fixedRate",
    "dayCountFraction"
})
public class FixedAmountCalculation {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CalculationAmount calculationAmount;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    protected FixedRate fixedRate;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected DayCountFraction dayCountFraction;

    /**
     * Gets the value of the calculationAmount property.
     * 
     * @return
     *     possible object is
     *     {@link CalculationAmount }
     *     
     */
    public CalculationAmount getCalculationAmount() {
        return calculationAmount;
    }

    /**
     * Sets the value of the calculationAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculationAmount }
     *     
     */
    public void setCalculationAmount(CalculationAmount value) {
        this.calculationAmount = value;
    }

    /**
     * Gets the value of the fixedRate property.
     * 
     * @return
     *     possible object is
     *     {@link FixedRate }
     *     
     */
    public FixedRate getFixedRate() {
        return fixedRate;
    }

    /**
     * Sets the value of the fixedRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link FixedRate }
     *     
     */
    public void setFixedRate(FixedRate value) {
        this.fixedRate = value;
    }

    /**
     * Gets the value of the dayCountFraction property.
     * 
     * @return
     *     possible object is
     *     {@link DayCountFraction }
     *     
     */
    public DayCountFraction getDayCountFraction() {
        return dayCountFraction;
    }

    /**
     * Sets the value of the dayCountFraction property.
     * 
     * @param value
     *     allowed object is
     *     {@link DayCountFraction }
     *     
     */
    public void setDayCountFraction(DayCountFraction value) {
        this.dayCountFraction = value;
    }

}
