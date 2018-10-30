
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VolatilityAmount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VolatilityAmount">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}CalculatedAmount">
 *       &lt;sequence>
 *         &lt;element name="volatility" type="{http://www.fpml.org/FpML-5/recordkeeping}Volatility"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VolatilityAmount", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "volatility"
})
public class VolatilityAmount
    extends CalculatedAmount
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    protected Volatility volatility;

    /**
     * Gets the value of the volatility property.
     * 
     * @return
     *     possible object is
     *     {@link Volatility }
     *     
     */
    public Volatility getVolatility() {
        return volatility;
    }

    /**
     * Sets the value of the volatility property.
     * 
     * @param value
     *     allowed object is
     *     {@link Volatility }
     *     
     */
    public void setVolatility(Volatility value) {
        this.volatility = value;
    }

}
