
package com.example.jaxb.fpml.recordkeeping;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * The type defining a denominator term of the formula. Its value is (sum of weighted partials) ^ power.
 * 
 * <p>Java class for DenominatorTerm complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DenominatorTerm">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="weightedPartial" type="{http://www.fpml.org/FpML-5/recordkeeping}WeightedPartialDerivative" minOccurs="0"/>
 *         &lt;element name="power" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DenominatorTerm", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "weightedPartial",
    "power"
})
public class DenominatorTerm {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected WeightedPartialDerivative weightedPartial;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger power;

    /**
     * Gets the value of the weightedPartial property.
     * 
     * @return
     *     possible object is
     *     {@link WeightedPartialDerivative }
     *     
     */
    public WeightedPartialDerivative getWeightedPartial() {
        return weightedPartial;
    }

    /**
     * Sets the value of the weightedPartial property.
     * 
     * @param value
     *     allowed object is
     *     {@link WeightedPartialDerivative }
     *     
     */
    public void setWeightedPartial(WeightedPartialDerivative value) {
        this.weightedPartial = value;
    }

    /**
     * Gets the value of the power property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPower() {
        return power;
    }

    /**
     * Sets the value of the power property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPower(BigInteger value) {
        this.power = value;
    }

}
