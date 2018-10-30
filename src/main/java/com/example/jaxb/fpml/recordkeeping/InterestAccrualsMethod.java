
package com.example.jaxb.fpml.recordkeeping;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A type describing the method for accruing interests on dividends. Can be either a fixed rate reference or a floating rate reference.
 * 
 * <p>Java class for InterestAccrualsMethod complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InterestAccrualsMethod">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="floatingRateCalculation" type="{http://www.fpml.org/FpML-5/recordkeeping}FloatingRateCalculation"/>
 *         &lt;element name="fixedRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterestAccrualsMethod", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "floatingRateCalculation",
    "fixedRate"
})
@XmlSeeAlso({
    InterestCalculation.class,
    InterestAccrualsCompoundingMethod.class
})
public class InterestAccrualsMethod {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected FloatingRateCalculation floatingRateCalculation;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BigDecimal fixedRate;

    /**
     * Gets the value of the floatingRateCalculation property.
     * 
     * @return
     *     possible object is
     *     {@link FloatingRateCalculation }
     *     
     */
    public FloatingRateCalculation getFloatingRateCalculation() {
        return floatingRateCalculation;
    }

    /**
     * Sets the value of the floatingRateCalculation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FloatingRateCalculation }
     *     
     */
    public void setFloatingRateCalculation(FloatingRateCalculation value) {
        this.floatingRateCalculation = value;
    }

    /**
     * Gets the value of the fixedRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFixedRate() {
        return fixedRate;
    }

    /**
     * Sets the value of the fixedRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFixedRate(BigDecimal value) {
        this.fixedRate = value;
    }

}
