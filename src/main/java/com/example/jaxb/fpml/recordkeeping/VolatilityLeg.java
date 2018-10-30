
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VolatilityLeg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VolatilityLeg">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}DirectionalLegUnderlyerValuation">
 *       &lt;sequence>
 *         &lt;element name="amount" type="{http://www.fpml.org/FpML-5/recordkeeping}VolatilityAmount"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VolatilityLeg", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "amount"
})
public class VolatilityLeg
    extends DirectionalLegUnderlyerValuation
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    protected VolatilityAmount amount;

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link VolatilityAmount }
     *     
     */
    public VolatilityAmount getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolatilityAmount }
     *     
     */
    public void setAmount(VolatilityAmount value) {
        this.amount = value;
    }

}
