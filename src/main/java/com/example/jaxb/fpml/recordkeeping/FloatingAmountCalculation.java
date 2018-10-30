
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for FloatingAmountCalculation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FloatingAmountCalculation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="calculationAmount" type="{http://www.fpml.org/FpML-5/recordkeeping}CalculationAmount" minOccurs="0"/>
 *         &lt;element name="floatingRate" type="{http://www.fpml.org/FpML-5/recordkeeping}FloatingRateCalculation"/>
 *         &lt;element name="dayCountFraction" type="{http://www.fpml.org/FpML-5/recordkeeping}DayCountFraction" minOccurs="0"/>
 *         &lt;element name="initialFixingDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="finalFixingDate" type="{http://www.fpml.org/FpML-5/recordkeeping}AdjustableDate" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FloatingAmountCalculation", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "calculationAmount",
    "floatingRate",
    "dayCountFraction",
    "initialFixingDate",
    "finalFixingDate"
})
public class FloatingAmountCalculation {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CalculationAmount calculationAmount;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    protected FloatingRateCalculation floatingRate;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected DayCountFraction dayCountFraction;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar initialFixingDate;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected AdjustableDate finalFixingDate;

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
     * Gets the value of the floatingRate property.
     * 
     * @return
     *     possible object is
     *     {@link FloatingRateCalculation }
     *     
     */
    public FloatingRateCalculation getFloatingRate() {
        return floatingRate;
    }

    /**
     * Sets the value of the floatingRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link FloatingRateCalculation }
     *     
     */
    public void setFloatingRate(FloatingRateCalculation value) {
        this.floatingRate = value;
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

    /**
     * Gets the value of the initialFixingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInitialFixingDate() {
        return initialFixingDate;
    }

    /**
     * Sets the value of the initialFixingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInitialFixingDate(XMLGregorianCalendar value) {
        this.initialFixingDate = value;
    }

    /**
     * Gets the value of the finalFixingDate property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustableDate }
     *     
     */
    public AdjustableDate getFinalFixingDate() {
        return finalFixingDate;
    }

    /**
     * Sets the value of the finalFixingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustableDate }
     *     
     */
    public void setFinalFixingDate(AdjustableDate value) {
        this.finalFixingDate = value;
    }

}
