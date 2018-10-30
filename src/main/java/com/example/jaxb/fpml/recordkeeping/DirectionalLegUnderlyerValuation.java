
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * An abstract base class for all directional leg types with effective date, termination date, and underlyer, where a payer makes a stream of payments of greater than zero value to a receiver.
 * 
 * <p>Java class for DirectionalLegUnderlyerValuation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DirectionalLegUnderlyerValuation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}DirectionalLegUnderlyer">
 *       &lt;sequence>
 *         &lt;element name="valuation" type="{http://www.fpml.org/FpML-5/recordkeeping}EquityValuation"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DirectionalLegUnderlyerValuation", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "valuation"
})
@XmlSeeAlso({
    VolatilityLeg.class
})
public abstract class DirectionalLegUnderlyerValuation
    extends DirectionalLegUnderlyer
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    protected EquityValuation valuation;

    /**
     * Gets the value of the valuation property.
     * 
     * @return
     *     possible object is
     *     {@link EquityValuation }
     *     
     */
    public EquityValuation getValuation() {
        return valuation;
    }

    /**
     * Sets the value of the valuation property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquityValuation }
     *     
     */
    public void setValuation(EquityValuation value) {
        this.valuation = value;
    }

}
