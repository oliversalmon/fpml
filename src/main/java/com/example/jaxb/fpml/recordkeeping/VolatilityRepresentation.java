
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A representation of volatilities of an asset. This is a generic structure whose values can be supplied in a specific volatility matrix.
 * 
 * <p>Java class for VolatilityRepresentation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VolatilityRepresentation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}PricingStructure">
 *       &lt;sequence>
 *         &lt;element name="asset" type="{http://www.fpml.org/FpML-5/recordkeeping}AnyAssetReference" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VolatilityRepresentation", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "asset"
})
public class VolatilityRepresentation
    extends PricingStructure
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected AnyAssetReference asset;

    /**
     * Gets the value of the asset property.
     * 
     * @return
     *     possible object is
     *     {@link AnyAssetReference }
     *     
     */
    public AnyAssetReference getAsset() {
        return asset;
    }

    /**
     * Sets the value of the asset property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnyAssetReference }
     *     
     */
    public void setAsset(AnyAssetReference value) {
        this.asset = value;
    }

}
