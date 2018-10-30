
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FxTargetPhysicalSettlement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FxTargetPhysicalSettlement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}FxExchangedCurrency.model"/>
 *         &lt;element name="settlementAdjustmentStyle" type="{http://www.fpml.org/FpML-5/recordkeeping}FxSettlementAdjustmentMethodEnum"/>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}StrikeOrStrikeReference.model" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FxTargetPhysicalSettlement", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "exchangedCurrency1",
    "exchangedCurrency2",
    "settlementAdjustmentStyle",
    "strike",
    "strikeReference"
})
public class FxTargetPhysicalSettlement {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    protected FxExchangedCurrency exchangedCurrency1;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    protected FxExchangedCurrency exchangedCurrency2;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    @XmlSchemaType(name = "token")
    protected FxSettlementAdjustmentMethodEnum settlementAdjustmentStyle;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected FxStrike strike;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected FxStrikeReference strikeReference;

    /**
     * Gets the value of the exchangedCurrency1 property.
     * 
     * @return
     *     possible object is
     *     {@link FxExchangedCurrency }
     *     
     */
    public FxExchangedCurrency getExchangedCurrency1() {
        return exchangedCurrency1;
    }

    /**
     * Sets the value of the exchangedCurrency1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link FxExchangedCurrency }
     *     
     */
    public void setExchangedCurrency1(FxExchangedCurrency value) {
        this.exchangedCurrency1 = value;
    }

    /**
     * Gets the value of the exchangedCurrency2 property.
     * 
     * @return
     *     possible object is
     *     {@link FxExchangedCurrency }
     *     
     */
    public FxExchangedCurrency getExchangedCurrency2() {
        return exchangedCurrency2;
    }

    /**
     * Sets the value of the exchangedCurrency2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link FxExchangedCurrency }
     *     
     */
    public void setExchangedCurrency2(FxExchangedCurrency value) {
        this.exchangedCurrency2 = value;
    }

    /**
     * Gets the value of the settlementAdjustmentStyle property.
     * 
     * @return
     *     possible object is
     *     {@link FxSettlementAdjustmentMethodEnum }
     *     
     */
    public FxSettlementAdjustmentMethodEnum getSettlementAdjustmentStyle() {
        return settlementAdjustmentStyle;
    }

    /**
     * Sets the value of the settlementAdjustmentStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link FxSettlementAdjustmentMethodEnum }
     *     
     */
    public void setSettlementAdjustmentStyle(FxSettlementAdjustmentMethodEnum value) {
        this.settlementAdjustmentStyle = value;
    }

    /**
     * Gets the value of the strike property.
     * 
     * @return
     *     possible object is
     *     {@link FxStrike }
     *     
     */
    public FxStrike getStrike() {
        return strike;
    }

    /**
     * Sets the value of the strike property.
     * 
     * @param value
     *     allowed object is
     *     {@link FxStrike }
     *     
     */
    public void setStrike(FxStrike value) {
        this.strike = value;
    }

    /**
     * Gets the value of the strikeReference property.
     * 
     * @return
     *     possible object is
     *     {@link FxStrikeReference }
     *     
     */
    public FxStrikeReference getStrikeReference() {
        return strikeReference;
    }

    /**
     * Sets the value of the strikeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link FxStrikeReference }
     *     
     */
    public void setStrikeReference(FxStrikeReference value) {
        this.strikeReference = value;
    }

}
