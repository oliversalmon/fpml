
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * For an asset (e.g. a reference/benchmark asset), the pricing structure used to price it. Used, for example, to specify that the rateIndex "USD-LIBOR-Telerate" with term = 6M is priced using the "USD-LIBOR-Close" curve.
 * 
 * <p>Java class for PricingMethod complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PricingMethod">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="assetReference" type="{http://www.fpml.org/FpML-5/recordkeeping}AnyAssetReference" minOccurs="0"/>
 *         &lt;element name="pricingInputReference" type="{http://www.fpml.org/FpML-5/recordkeeping}PricingStructureReference" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PricingMethod", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "assetReference",
    "pricingInputReference"
})
public class PricingMethod {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected AnyAssetReference assetReference;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected PricingStructureReference pricingInputReference;

    /**
     * Gets the value of the assetReference property.
     * 
     * @return
     *     possible object is
     *     {@link AnyAssetReference }
     *     
     */
    public AnyAssetReference getAssetReference() {
        return assetReference;
    }

    /**
     * Sets the value of the assetReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnyAssetReference }
     *     
     */
    public void setAssetReference(AnyAssetReference value) {
        this.assetReference = value;
    }

    /**
     * Gets the value of the pricingInputReference property.
     * 
     * @return
     *     possible object is
     *     {@link PricingStructureReference }
     *     
     */
    public PricingStructureReference getPricingInputReference() {
        return pricingInputReference;
    }

    /**
     * Sets the value of the pricingInputReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingStructureReference }
     *     
     */
    public void setPricingInputReference(PricingStructureReference value) {
        this.pricingInputReference = value;
    }

}
