
package com.example.jaxb.fpml.recordkeeping;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * A type defining the floating rate and definitions relating to the calculation of floating rate amounts.
 * 
 * <p>Java class for FloatingRateCalculation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FloatingRateCalculation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}FloatingRate">
 *       &lt;sequence>
 *         &lt;element name="initialRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="finalRateRounding" type="{http://www.fpml.org/FpML-5/recordkeeping}Rounding" minOccurs="0"/>
 *         &lt;element name="averagingMethod" type="{http://www.fpml.org/FpML-5/recordkeeping}AveragingMethodEnum" minOccurs="0"/>
 *         &lt;element name="negativeInterestRateTreatment" type="{http://www.fpml.org/FpML-5/recordkeeping}NegativeInterestRateTreatmentEnum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FloatingRateCalculation", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "initialRate",
    "finalRateRounding",
    "averagingMethod",
    "negativeInterestRateTreatment"
})
public class FloatingRateCalculation
    extends FloatingRate
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BigDecimal initialRate;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Rounding finalRateRounding;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "token")
    protected AveragingMethodEnum averagingMethod;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "token")
    protected NegativeInterestRateTreatmentEnum negativeInterestRateTreatment;

    /**
     * Gets the value of the initialRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInitialRate() {
        return initialRate;
    }

    /**
     * Sets the value of the initialRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInitialRate(BigDecimal value) {
        this.initialRate = value;
    }

    /**
     * Gets the value of the finalRateRounding property.
     * 
     * @return
     *     possible object is
     *     {@link Rounding }
     *     
     */
    public Rounding getFinalRateRounding() {
        return finalRateRounding;
    }

    /**
     * Sets the value of the finalRateRounding property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rounding }
     *     
     */
    public void setFinalRateRounding(Rounding value) {
        this.finalRateRounding = value;
    }

    /**
     * Gets the value of the averagingMethod property.
     * 
     * @return
     *     possible object is
     *     {@link AveragingMethodEnum }
     *     
     */
    public AveragingMethodEnum getAveragingMethod() {
        return averagingMethod;
    }

    /**
     * Sets the value of the averagingMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link AveragingMethodEnum }
     *     
     */
    public void setAveragingMethod(AveragingMethodEnum value) {
        this.averagingMethod = value;
    }

    /**
     * Gets the value of the negativeInterestRateTreatment property.
     * 
     * @return
     *     possible object is
     *     {@link NegativeInterestRateTreatmentEnum }
     *     
     */
    public NegativeInterestRateTreatmentEnum getNegativeInterestRateTreatment() {
        return negativeInterestRateTreatment;
    }

    /**
     * Sets the value of the negativeInterestRateTreatment property.
     * 
     * @param value
     *     allowed object is
     *     {@link NegativeInterestRateTreatmentEnum }
     *     
     */
    public void setNegativeInterestRateTreatment(NegativeInterestRateTreatmentEnum value) {
        this.negativeInterestRateTreatment = value;
    }

}
