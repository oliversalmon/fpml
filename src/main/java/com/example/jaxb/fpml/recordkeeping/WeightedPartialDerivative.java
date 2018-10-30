
package com.example.jaxb.fpml.recordkeeping;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A partial derivative multiplied by a weighting factor.
 * 
 * <p>Java class for WeightedPartialDerivative complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WeightedPartialDerivative">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="partialDerivativeReference" type="{http://www.fpml.org/FpML-5/recordkeeping}PricingParameterDerivativeReference" minOccurs="0"/>
 *         &lt;element name="weight" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WeightedPartialDerivative", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "partialDerivativeReference",
    "weight"
})
public class WeightedPartialDerivative {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected PricingParameterDerivativeReference partialDerivativeReference;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BigDecimal weight;

    /**
     * Gets the value of the partialDerivativeReference property.
     * 
     * @return
     *     possible object is
     *     {@link PricingParameterDerivativeReference }
     *     
     */
    public PricingParameterDerivativeReference getPartialDerivativeReference() {
        return partialDerivativeReference;
    }

    /**
     * Sets the value of the partialDerivativeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingParameterDerivativeReference }
     *     
     */
    public void setPartialDerivativeReference(PricingParameterDerivativeReference value) {
        this.partialDerivativeReference = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWeight(BigDecimal value) {
        this.weight = value;
    }

}
