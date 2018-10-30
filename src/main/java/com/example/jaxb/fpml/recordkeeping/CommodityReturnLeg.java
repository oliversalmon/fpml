
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A type describing the return leg of a commodity return swap.
 * 
 * <p>Java class for CommodityReturnLeg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommodityReturnLeg">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}CommodityPerformanceSwapLeg">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}CommodityCalculationPeriods.model"/>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}CommodityPaymentDates.model"/>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}CommodityUnderlyerChoice.model"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="notionalAmount" type="{http://www.fpml.org/FpML-5/recordkeeping}CommodityNotionalAmount"/>
 *           &lt;element name="notionalAmountReference" type="{http://www.fpml.org/FpML-5/recordkeeping}CommodityNotionalAmountReference"/>
 *         &lt;/choice>
 *         &lt;element name="commodityReturnCalculation" type="{http://www.fpml.org/FpML-5/recordkeeping}CommodityReturnCalculation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommodityReturnLeg", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "calculationDates",
    "calculationPeriods",
    "calculationPeriodsSchedule",
    "calculationPeriodsReference",
    "calculationPeriodsScheduleReference",
    "calculationPeriodsDatesReference",
    "relativePaymentDates",
    "paymentDates",
    "masterAgreementPaymentDates",
    "commodity",
    "commodityBasket",
    "notionalAmount",
    "notionalAmountReference",
    "commodityReturnCalculation"
})
public class CommodityReturnLeg
    extends CommodityPerformanceSwapLeg
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected AdjustableDates calculationDates;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected AdjustableDates calculationPeriods;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CommodityCalculationPeriodsSchedule calculationPeriodsSchedule;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CalculationPeriodsReference calculationPeriodsReference;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CalculationPeriodsScheduleReference calculationPeriodsScheduleReference;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CalculationPeriodsDatesReference calculationPeriodsDatesReference;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CommodityRelativePaymentDates relativePaymentDates;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected AdjustableDatesOrRelativeDateOffset paymentDates;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean masterAgreementPaymentDates;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Commodity commodity;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CommodityBasket commodityBasket;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CommodityNotionalAmount notionalAmount;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CommodityNotionalAmountReference notionalAmountReference;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CommodityReturnCalculation commodityReturnCalculation;

    /**
     * Gets the value of the calculationDates property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustableDates }
     *     
     */
    public AdjustableDates getCalculationDates() {
        return calculationDates;
    }

    /**
     * Sets the value of the calculationDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustableDates }
     *     
     */
    public void setCalculationDates(AdjustableDates value) {
        this.calculationDates = value;
    }

    /**
     * Gets the value of the calculationPeriods property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustableDates }
     *     
     */
    public AdjustableDates getCalculationPeriods() {
        return calculationPeriods;
    }

    /**
     * Sets the value of the calculationPeriods property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustableDates }
     *     
     */
    public void setCalculationPeriods(AdjustableDates value) {
        this.calculationPeriods = value;
    }

    /**
     * Gets the value of the calculationPeriodsSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityCalculationPeriodsSchedule }
     *     
     */
    public CommodityCalculationPeriodsSchedule getCalculationPeriodsSchedule() {
        return calculationPeriodsSchedule;
    }

    /**
     * Sets the value of the calculationPeriodsSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityCalculationPeriodsSchedule }
     *     
     */
    public void setCalculationPeriodsSchedule(CommodityCalculationPeriodsSchedule value) {
        this.calculationPeriodsSchedule = value;
    }

    /**
     * Gets the value of the calculationPeriodsReference property.
     * 
     * @return
     *     possible object is
     *     {@link CalculationPeriodsReference }
     *     
     */
    public CalculationPeriodsReference getCalculationPeriodsReference() {
        return calculationPeriodsReference;
    }

    /**
     * Sets the value of the calculationPeriodsReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculationPeriodsReference }
     *     
     */
    public void setCalculationPeriodsReference(CalculationPeriodsReference value) {
        this.calculationPeriodsReference = value;
    }

    /**
     * Gets the value of the calculationPeriodsScheduleReference property.
     * 
     * @return
     *     possible object is
     *     {@link CalculationPeriodsScheduleReference }
     *     
     */
    public CalculationPeriodsScheduleReference getCalculationPeriodsScheduleReference() {
        return calculationPeriodsScheduleReference;
    }

    /**
     * Sets the value of the calculationPeriodsScheduleReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculationPeriodsScheduleReference }
     *     
     */
    public void setCalculationPeriodsScheduleReference(CalculationPeriodsScheduleReference value) {
        this.calculationPeriodsScheduleReference = value;
    }

    /**
     * Gets the value of the calculationPeriodsDatesReference property.
     * 
     * @return
     *     possible object is
     *     {@link CalculationPeriodsDatesReference }
     *     
     */
    public CalculationPeriodsDatesReference getCalculationPeriodsDatesReference() {
        return calculationPeriodsDatesReference;
    }

    /**
     * Sets the value of the calculationPeriodsDatesReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculationPeriodsDatesReference }
     *     
     */
    public void setCalculationPeriodsDatesReference(CalculationPeriodsDatesReference value) {
        this.calculationPeriodsDatesReference = value;
    }

    /**
     * Gets the value of the relativePaymentDates property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityRelativePaymentDates }
     *     
     */
    public CommodityRelativePaymentDates getRelativePaymentDates() {
        return relativePaymentDates;
    }

    /**
     * Sets the value of the relativePaymentDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityRelativePaymentDates }
     *     
     */
    public void setRelativePaymentDates(CommodityRelativePaymentDates value) {
        this.relativePaymentDates = value;
    }

    /**
     * Gets the value of the paymentDates property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustableDatesOrRelativeDateOffset }
     *     
     */
    public AdjustableDatesOrRelativeDateOffset getPaymentDates() {
        return paymentDates;
    }

    /**
     * Sets the value of the paymentDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustableDatesOrRelativeDateOffset }
     *     
     */
    public void setPaymentDates(AdjustableDatesOrRelativeDateOffset value) {
        this.paymentDates = value;
    }

    /**
     * Gets the value of the masterAgreementPaymentDates property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMasterAgreementPaymentDates() {
        return masterAgreementPaymentDates;
    }

    /**
     * Sets the value of the masterAgreementPaymentDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMasterAgreementPaymentDates(Boolean value) {
        this.masterAgreementPaymentDates = value;
    }

    /**
     * Gets the value of the commodity property.
     * 
     * @return
     *     possible object is
     *     {@link Commodity }
     *     
     */
    public Commodity getCommodity() {
        return commodity;
    }

    /**
     * Sets the value of the commodity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Commodity }
     *     
     */
    public void setCommodity(Commodity value) {
        this.commodity = value;
    }

    /**
     * Gets the value of the commodityBasket property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityBasket }
     *     
     */
    public CommodityBasket getCommodityBasket() {
        return commodityBasket;
    }

    /**
     * Sets the value of the commodityBasket property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityBasket }
     *     
     */
    public void setCommodityBasket(CommodityBasket value) {
        this.commodityBasket = value;
    }

    /**
     * Gets the value of the notionalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityNotionalAmount }
     *     
     */
    public CommodityNotionalAmount getNotionalAmount() {
        return notionalAmount;
    }

    /**
     * Sets the value of the notionalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityNotionalAmount }
     *     
     */
    public void setNotionalAmount(CommodityNotionalAmount value) {
        this.notionalAmount = value;
    }

    /**
     * Gets the value of the notionalAmountReference property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityNotionalAmountReference }
     *     
     */
    public CommodityNotionalAmountReference getNotionalAmountReference() {
        return notionalAmountReference;
    }

    /**
     * Sets the value of the notionalAmountReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityNotionalAmountReference }
     *     
     */
    public void setNotionalAmountReference(CommodityNotionalAmountReference value) {
        this.notionalAmountReference = value;
    }

    /**
     * Gets the value of the commodityReturnCalculation property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityReturnCalculation }
     *     
     */
    public CommodityReturnCalculation getCommodityReturnCalculation() {
        return commodityReturnCalculation;
    }

    /**
     * Sets the value of the commodityReturnCalculation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityReturnCalculation }
     *     
     */
    public void setCommodityReturnCalculation(CommodityReturnCalculation value) {
        this.commodityReturnCalculation = value;
    }

}
