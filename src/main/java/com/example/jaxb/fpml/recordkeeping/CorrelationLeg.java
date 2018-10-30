
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A type describing return which is driven by a Correlation calculation.
 * 
 * <p>Java class for CorrelationLeg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CorrelationLeg">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}DirectionalLegUnderlyerValuation">
 *       &lt;sequence>
 *         &lt;element name="amount" type="{http://www.fpml.org/FpML-5/recordkeeping}CorrelationAmount"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorrelationLeg", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "amount"
})
public class CorrelationLeg
    extends DirectionalLegUnderlyerValuation
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    protected CorrelationAmount amount;

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link CorrelationAmount }
     *     
     */
    public CorrelationAmount getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorrelationAmount }
     *     
     */
    public void setAmount(CorrelationAmount value) {
        this.amount = value;
    }

}
