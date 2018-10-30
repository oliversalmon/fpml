
package com.example.jaxb.fpml.recordkeeping;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommodityVarianceCalculation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommodityVarianceCalculation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pricingDates" type="{http://www.fpml.org/FpML-5/recordkeeping}CommodityPricingDates" minOccurs="0"/>
 *         &lt;element name="valuationDates" type="{http://www.fpml.org/FpML-5/recordkeeping}CommodityValuationDates" minOccurs="0"/>
 *         &lt;element name="annualizationFactor" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="nAdjustment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommodityVarianceCalculation", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "pricingDates",
    "valuationDates",
    "annualizationFactor",
    "nAdjustment"
})
public class CommodityVarianceCalculation {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CommodityPricingDates pricingDates;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CommodityValuationDates valuationDates;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BigDecimal annualizationFactor;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean nAdjustment;

    /**
     * Gets the value of the pricingDates property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityPricingDates }
     *     
     */
    public CommodityPricingDates getPricingDates() {
        return pricingDates;
    }

    /**
     * Sets the value of the pricingDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityPricingDates }
     *     
     */
    public void setPricingDates(CommodityPricingDates value) {
        this.pricingDates = value;
    }

    /**
     * Gets the value of the valuationDates property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityValuationDates }
     *     
     */
    public CommodityValuationDates getValuationDates() {
        return valuationDates;
    }

    /**
     * Sets the value of the valuationDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityValuationDates }
     *     
     */
    public void setValuationDates(CommodityValuationDates value) {
        this.valuationDates = value;
    }

    /**
     * Gets the value of the annualizationFactor property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAnnualizationFactor() {
        return annualizationFactor;
    }

    /**
     * Sets the value of the annualizationFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAnnualizationFactor(BigDecimal value) {
        this.annualizationFactor = value;
    }

    /**
     * Gets the value of the nAdjustment property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNAdjustment() {
        return nAdjustment;
    }

    /**
     * Sets the value of the nAdjustment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNAdjustment(Boolean value) {
        this.nAdjustment = value;
    }

}
