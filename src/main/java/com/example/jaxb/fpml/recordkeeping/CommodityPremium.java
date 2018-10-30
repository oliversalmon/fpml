
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The commodity option premium payable by the buyer to the seller.
 * 
 * <p>Java class for CommodityPremium complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommodityPremium">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}NonNegativePayment">
 *       &lt;sequence>
 *         &lt;element name="premiumPerUnit" type="{http://www.fpml.org/FpML-5/recordkeeping}NonNegativeMoney" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommodityPremium", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "premiumPerUnit"
})
public class CommodityPremium
    extends NonNegativePayment
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected NonNegativeMoney premiumPerUnit;

    /**
     * Gets the value of the premiumPerUnit property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMoney }
     *     
     */
    public NonNegativeMoney getPremiumPerUnit() {
        return premiumPerUnit;
    }

    /**
     * Sets the value of the premiumPerUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMoney }
     *     
     */
    public void setPremiumPerUnit(NonNegativeMoney value) {
        this.premiumPerUnit = value;
    }

}
