
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * A type describing the return leg of a return type swap.
 * 
 * <p>Java class for ReturnLeg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReturnLeg">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}ReturnSwapLegUnderlyer">
 *       &lt;sequence>
 *         &lt;element name="rateOfReturn" type="{http://www.fpml.org/FpML-5/recordkeeping}ReturnLegValuation"/>
 *         &lt;element name="notional" type="{http://www.fpml.org/FpML-5/recordkeeping}ReturnSwapNotional" minOccurs="0"/>
 *         &lt;element name="amount" type="{http://www.fpml.org/FpML-5/recordkeeping}ReturnSwapAmount"/>
 *         &lt;element name="return" type="{http://www.fpml.org/FpML-5/recordkeeping}Return" minOccurs="0"/>
 *         &lt;element name="notionalAdjustments" type="{http://www.fpml.org/FpML-5/recordkeeping}NotionalAdjustmentEnum" minOccurs="0"/>
 *         &lt;element name="fxFeature" type="{http://www.fpml.org/FpML-5/recordkeeping}FxFeature" minOccurs="0"/>
 *         &lt;element name="averagingDates" type="{http://www.fpml.org/FpML-5/recordkeeping}AveragingPeriod" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReturnLeg", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "rateOfReturn",
    "notional",
    "amount",
    "_return",
    "notionalAdjustments",
    "fxFeature",
    "averagingDates"
})
public class ReturnLeg
    extends ReturnSwapLegUnderlyer
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    protected ReturnLegValuation rateOfReturn;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected ReturnSwapNotional notional;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    protected ReturnSwapAmount amount;
    @XmlElement(name = "return", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Return _return;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "token")
    protected NotionalAdjustmentEnum notionalAdjustments;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected FxFeature fxFeature;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected AveragingPeriod averagingDates;

    /**
     * Gets the value of the rateOfReturn property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnLegValuation }
     *     
     */
    public ReturnLegValuation getRateOfReturn() {
        return rateOfReturn;
    }

    /**
     * Sets the value of the rateOfReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnLegValuation }
     *     
     */
    public void setRateOfReturn(ReturnLegValuation value) {
        this.rateOfReturn = value;
    }

    /**
     * Gets the value of the notional property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnSwapNotional }
     *     
     */
    public ReturnSwapNotional getNotional() {
        return notional;
    }

    /**
     * Sets the value of the notional property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnSwapNotional }
     *     
     */
    public void setNotional(ReturnSwapNotional value) {
        this.notional = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnSwapAmount }
     *     
     */
    public ReturnSwapAmount getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnSwapAmount }
     *     
     */
    public void setAmount(ReturnSwapAmount value) {
        this.amount = value;
    }

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link Return }
     *     
     */
    public Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link Return }
     *     
     */
    public void setReturn(Return value) {
        this._return = value;
    }

    /**
     * Gets the value of the notionalAdjustments property.
     * 
     * @return
     *     possible object is
     *     {@link NotionalAdjustmentEnum }
     *     
     */
    public NotionalAdjustmentEnum getNotionalAdjustments() {
        return notionalAdjustments;
    }

    /**
     * Sets the value of the notionalAdjustments property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotionalAdjustmentEnum }
     *     
     */
    public void setNotionalAdjustments(NotionalAdjustmentEnum value) {
        this.notionalAdjustments = value;
    }

    /**
     * Gets the value of the fxFeature property.
     * 
     * @return
     *     possible object is
     *     {@link FxFeature }
     *     
     */
    public FxFeature getFxFeature() {
        return fxFeature;
    }

    /**
     * Sets the value of the fxFeature property.
     * 
     * @param value
     *     allowed object is
     *     {@link FxFeature }
     *     
     */
    public void setFxFeature(FxFeature value) {
        this.fxFeature = value;
    }

    /**
     * Gets the value of the averagingDates property.
     * 
     * @return
     *     possible object is
     *     {@link AveragingPeriod }
     *     
     */
    public AveragingPeriod getAveragingDates() {
        return averagingDates;
    }

    /**
     * Sets the value of the averagingDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link AveragingPeriod }
     *     
     */
    public void setAveragingDates(AveragingPeriod value) {
        this.averagingDates = value;
    }

}
