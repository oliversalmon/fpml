
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FxOutstandingGain complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FxOutstandingGain">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="targetReference" type="{http://www.fpml.org/FpML-5/recordkeeping}FxTargetReference"/>
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
@XmlType(name = "FxOutstandingGain", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "targetReference",
    "settlementAdjustmentStyle"
})
public class FxOutstandingGain {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    protected FxTargetReference targetReference;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    @XmlSchemaType(name = "token")
    protected FxSettlementAdjustmentMethodEnum settlementAdjustmentStyle;

    /**
     * Gets the value of the targetReference property.
     * 
     * @return
     *     possible object is
     *     {@link FxTargetReference }
     *     
     */
    public FxTargetReference getTargetReference() {
        return targetReference;
    }

    /**
     * Sets the value of the targetReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link FxTargetReference }
     *     
     */
    public void setTargetReference(FxTargetReference value) {
        this.targetReference = value;
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
