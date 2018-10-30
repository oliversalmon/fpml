
package com.example.jaxb.fpml.recordkeeping;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommodityReturnCalculation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommodityReturnCalculation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="formula" type="{http://www.fpml.org/FpML-5/recordkeeping}CommodityReturnCalculationFormulaEnum" minOccurs="0"/>
 *         &lt;element name="pricingDates" type="{http://www.fpml.org/FpML-5/recordkeeping}CommodityPricingDates" minOccurs="0"/>
 *         &lt;element name="valuationDates" type="{http://www.fpml.org/FpML-5/recordkeeping}CommodityValuationDates" minOccurs="0"/>
 *         &lt;element name="initialPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommodityReturnCalculation", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "formula",
    "pricingDates",
    "valuationDates",
    "initialPrice"
})
public class CommodityReturnCalculation {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "token")
    protected CommodityReturnCalculationFormulaEnum formula;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CommodityPricingDates pricingDates;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CommodityValuationDates valuationDates;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BigDecimal initialPrice;

    /**
     * Gets the value of the formula property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityReturnCalculationFormulaEnum }
     *     
     */
    public CommodityReturnCalculationFormulaEnum getFormula() {
        return formula;
    }

    /**
     * Sets the value of the formula property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityReturnCalculationFormulaEnum }
     *     
     */
    public void setFormula(CommodityReturnCalculationFormulaEnum value) {
        this.formula = value;
    }

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
     * Gets the value of the initialPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInitialPrice() {
        return initialPrice;
    }

    /**
     * Sets the value of the initialPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInitialPrice(BigDecimal value) {
        this.initialPrice = value;
    }

}
