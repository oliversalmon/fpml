
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Calculation of a Variance Amount.
 * 
 * <p>Java class for VarianceAmount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VarianceAmount">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}CalculatedAmount">
 *       &lt;sequence>
 *         &lt;element name="variance" type="{http://www.fpml.org/FpML-5/recordkeeping}Variance"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VarianceAmount", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "variance"
})
public class VarianceAmount
    extends CalculatedAmount
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    protected Variance variance;

    /**
     * Gets the value of the variance property.
     * 
     * @return
     *     possible object is
     *     {@link Variance }
     *     
     */
    public Variance getVariance() {
        return variance;
    }

    /**
     * Sets the value of the variance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Variance }
     *     
     */
    public void setVariance(Variance value) {
        this.variance = value;
    }

}
