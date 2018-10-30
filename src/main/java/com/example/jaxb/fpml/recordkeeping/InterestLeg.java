
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A type describing the fixed income leg of the equity swap.
 * 
 * <p>Java class for InterestLeg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InterestLeg">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}DirectionalLeg">
 *       &lt;sequence>
 *         &lt;element name="interestLegCalculationPeriodDates" type="{http://www.fpml.org/FpML-5/recordkeeping}InterestLegCalculationPeriodDates" minOccurs="0"/>
 *         &lt;element name="notional" type="{http://www.fpml.org/FpML-5/recordkeeping}ReturnSwapNotional" minOccurs="0"/>
 *         &lt;element name="interestAmount" type="{http://www.fpml.org/FpML-5/recordkeeping}LegAmount" minOccurs="0"/>
 *         &lt;element name="interestCalculation" type="{http://www.fpml.org/FpML-5/recordkeeping}InterestCalculation"/>
 *         &lt;element name="stubCalculationPeriod" type="{http://www.fpml.org/FpML-5/recordkeeping}StubCalculationPeriod" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterestLeg", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "interestLegCalculationPeriodDates",
    "notional",
    "interestAmount",
    "interestCalculation",
    "stubCalculationPeriod"
})
public class InterestLeg
    extends DirectionalLeg
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected InterestLegCalculationPeriodDates interestLegCalculationPeriodDates;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected ReturnSwapNotional notional;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected LegAmount interestAmount;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    protected InterestCalculation interestCalculation;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected StubCalculationPeriod stubCalculationPeriod;

    /**
     * Gets the value of the interestLegCalculationPeriodDates property.
     * 
     * @return
     *     possible object is
     *     {@link InterestLegCalculationPeriodDates }
     *     
     */
    public InterestLegCalculationPeriodDates getInterestLegCalculationPeriodDates() {
        return interestLegCalculationPeriodDates;
    }

    /**
     * Sets the value of the interestLegCalculationPeriodDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestLegCalculationPeriodDates }
     *     
     */
    public void setInterestLegCalculationPeriodDates(InterestLegCalculationPeriodDates value) {
        this.interestLegCalculationPeriodDates = value;
    }

    /**
     * Gets the value of the notional property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnSwapNotional }
     *     
     */
    public ReturnSwapNotional getNotional() {
        return notional;
    }

    /**
     * Sets the value of the notional property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnSwapNotional }
     *     
     */
    public void setNotional(ReturnSwapNotional value) {
        this.notional = value;
    }

    /**
     * Gets the value of the interestAmount property.
     * 
     * @return
     *     possible object is
     *     {@link LegAmount }
     *     
     */
    public LegAmount getInterestAmount() {
        return interestAmount;
    }

    /**
     * Sets the value of the interestAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegAmount }
     *     
     */
    public void setInterestAmount(LegAmount value) {
        this.interestAmount = value;
    }

    /**
     * Gets the value of the interestCalculation property.
     * 
     * @return
     *     possible object is
     *     {@link InterestCalculation }
     *     
     */
    public InterestCalculation getInterestCalculation() {
        return interestCalculation;
    }

    /**
     * Sets the value of the interestCalculation property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestCalculation }
     *     
     */
    public void setInterestCalculation(InterestCalculation value) {
        this.interestCalculation = value;
    }

    /**
     * Gets the value of the stubCalculationPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link StubCalculationPeriod }
     *     
     */
    public StubCalculationPeriod getStubCalculationPeriod() {
        return stubCalculationPeriod;
    }

    /**
     * Sets the value of the stubCalculationPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link StubCalculationPeriod }
     *     
     */
    public void setStubCalculationPeriod(StubCalculationPeriod value) {
        this.stubCalculationPeriod = value;
    }

}
