
package com.example.jaxb.fpml.recordkeeping;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Defines the Target level of gain.
 * 
 * <p>Java class for FxKnockoutLevel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FxKnockoutLevel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="amount" type="{http://www.fpml.org/FpML-5/recordkeeping}NonNegativeMoney"/>
 *           &lt;element name="intrinsicValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;/choice>
 *         &lt;element name="targetStyle" type="{http://www.fpml.org/FpML-5/recordkeeping}FxTargetStyleEnum"/>
 *         &lt;element name="settlementAdjustmentStyle" type="{http://www.fpml.org/FpML-5/recordkeeping}FxSettlementAdjustmentMethodEnum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FxKnockoutLevel", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "amount",
    "intrinsicValue",
    "targetStyle",
    "settlementAdjustmentStyle"
})
public class FxKnockoutLevel {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected NonNegativeMoney amount;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BigDecimal intrinsicValue;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    @XmlSchemaType(name = "token")
    protected FxTargetStyleEnum targetStyle;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "token")
    protected FxSettlementAdjustmentMethodEnum settlementAdjustmentStyle;

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMoney }
     *     
     */
    public NonNegativeMoney getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMoney }
     *     
     */
    public void setAmount(NonNegativeMoney value) {
        this.amount = value;
    }

    /**
     * Gets the value of the intrinsicValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIntrinsicValue() {
        return intrinsicValue;
    }

    /**
     * Sets the value of the intrinsicValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIntrinsicValue(BigDecimal value) {
        this.intrinsicValue = value;
    }

    /**
     * Gets the value of the targetStyle property.
     * 
     * @return
     *     possible object is
     *     {@link FxTargetStyleEnum }
     *     
     */
    public FxTargetStyleEnum getTargetStyle() {
        return targetStyle;
    }

    /**
     * Sets the value of the targetStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link FxTargetStyleEnum }
     *     
     */
    public void setTargetStyle(FxTargetStyleEnum value) {
        this.targetStyle = value;
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

}
