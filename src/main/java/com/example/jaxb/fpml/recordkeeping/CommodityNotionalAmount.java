
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A complex type to specify the notional amount.
 * 
 * <p>Java class for CommodityNotionalAmount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommodityNotionalAmount">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}NonNegativeMoney">
 *       &lt;sequence>
 *         &lt;element name="reinvestmentFeature" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommodityNotionalAmount", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "reinvestmentFeature"
})
public class CommodityNotionalAmount
    extends NonNegativeMoney
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean reinvestmentFeature;

    /**
     * Gets the value of the reinvestmentFeature property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReinvestmentFeature() {
        return reinvestmentFeature;
    }

    /**
     * Sets the value of the reinvestmentFeature property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReinvestmentFeature(Boolean value) {
        this.reinvestmentFeature = value;
    }

}
