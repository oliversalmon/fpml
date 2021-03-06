
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * The amount of gain on the client upside or firm upside is limited. If spot settles above the cap, or below the floor, the payout is adjusted to limit the gain. The adjustment may be made by varying the strike, or by maintaining the strike, but varying the payout notionals.
 * 
 * <p>Java class for FxPayoffCap complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FxPayoffCap">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="condition" type="{http://www.fpml.org/FpML-5/recordkeeping}ConditionEnum"/>
 *         &lt;element name="rate" type="{http://www.fpml.org/FpML-5/recordkeeping}Schedule"/>
 *         &lt;element name="settlementAdjustmentStyle" type="{http://www.fpml.org/FpML-5/recordkeeping}FxSettlementAdjustmentMethodEnum"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FxPayoffCap", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "condition",
    "rate",
    "settlementAdjustmentStyle"
})
public class FxPayoffCap {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    @XmlSchemaType(name = "token")
    protected ConditionEnum condition;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    protected Schedule rate;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    @XmlSchemaType(name = "token")
    protected FxSettlementAdjustmentMethodEnum settlementAdjustmentStyle;

    /**
     * Gets the value of the condition property.
     * 
     * @return
     *     possible object is
     *     {@link ConditionEnum }
     *     
     */
    public ConditionEnum getCondition() {
        return condition;
    }

    /**
     * Sets the value of the condition property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionEnum }
     *     
     */
    public void setCondition(ConditionEnum value) {
        this.condition = value;
    }

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link Schedule }
     *     
     */
    public Schedule getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Schedule }
     *     
     */
    public void setRate(Schedule value) {
        this.rate = value;
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
