
package com.example.jaxb.fpml.recordkeeping;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Fixed Price Leg of a Commodity Swap. It defines schedule of fixed payments associated with a commodity swap.
 * 
 * <p>Java class for FixedPriceLeg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FixedPriceLeg">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}FinancialSwapLeg">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}CommodityCalculationPeriods.model"/>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}CommodityFixedPrice.model"/>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}CommodityNotionalQuantity.model"/>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}CommodityPaymentDates.model"/>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}CommodityFreightFlatRate.model" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FixedPriceLeg", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "calculationDates",
    "calculationPeriods",
    "calculationPeriodsSchedule",
    "calculationPeriodsReference",
    "calculationPeriodsScheduleReference",
    "calculationPeriodsDatesReference",
    "fixedPriceSchedule",
    "fixedPrice",
    "worldscaleRate",
    "contractRate",
    "settlementPeriodsPrice",
    "totalPrice",
    "notionalQuantitySchedule",
    "notionalQuantity",
    "settlementPeriodsNotionalQuantity",
    "totalNotionalQuantity",
    "quantityReference",
    "relativePaymentDates",
    "paymentDates",
    "masterAgreementPaymentDates",
    "flatRate",
    "flatRateAmount"
})
public class FixedPriceLeg
    extends FinancialSwapLeg
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
    protected CommodityFixedPriceSchedule fixedPriceSchedule;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected FixedPrice fixedPrice;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BigDecimal worldscaleRate;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected NonNegativeMoney contractRate;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<SettlementPeriodsFixedPrice> settlementPeriodsPrice;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected NonNegativeMoney totalPrice;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CommodityNotionalQuantitySchedule notionalQuantitySchedule;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CommodityNotionalQuantity notionalQuantity;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<CommoditySettlementPeriodsNotionalQuantity> settlementPeriodsNotionalQuantity;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BigDecimal totalNotionalQuantity;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected QuantityReference quantityReference;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CommodityRelativePaymentDates relativePaymentDates;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected AdjustableDatesOrRelativeDateOffset paymentDates;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean masterAgreementPaymentDates;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "token")
    protected FlatRateEnum flatRate;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected NonNegativeMoney flatRateAmount;

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
     * Gets the value of the fixedPriceSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityFixedPriceSchedule }
     *     
     */
    public CommodityFixedPriceSchedule getFixedPriceSchedule() {
        return fixedPriceSchedule;
    }

    /**
     * Sets the value of the fixedPriceSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityFixedPriceSchedule }
     *     
     */
    public void setFixedPriceSchedule(CommodityFixedPriceSchedule value) {
        this.fixedPriceSchedule = value;
    }

    /**
     * Gets the value of the fixedPrice property.
     * 
     * @return
     *     possible object is
     *     {@link FixedPrice }
     *     
     */
    public FixedPrice getFixedPrice() {
        return fixedPrice;
    }

    /**
     * Sets the value of the fixedPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link FixedPrice }
     *     
     */
    public void setFixedPrice(FixedPrice value) {
        this.fixedPrice = value;
    }

    /**
     * Gets the value of the worldscaleRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWorldscaleRate() {
        return worldscaleRate;
    }

    /**
     * Sets the value of the worldscaleRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWorldscaleRate(BigDecimal value) {
        this.worldscaleRate = value;
    }

    /**
     * Gets the value of the contractRate property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMoney }
     *     
     */
    public NonNegativeMoney getContractRate() {
        return contractRate;
    }

    /**
     * Sets the value of the contractRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMoney }
     *     
     */
    public void setContractRate(NonNegativeMoney value) {
        this.contractRate = value;
    }

    /**
     * Gets the value of the settlementPeriodsPrice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the settlementPeriodsPrice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSettlementPeriodsPrice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SettlementPeriodsFixedPrice }
     * 
     * 
     */
    public List<SettlementPeriodsFixedPrice> getSettlementPeriodsPrice() {
        if (settlementPeriodsPrice == null) {
            settlementPeriodsPrice = new ArrayList<SettlementPeriodsFixedPrice>();
        }
        return this.settlementPeriodsPrice;
    }

    /**
     * Gets the value of the totalPrice property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMoney }
     *     
     */
    public NonNegativeMoney getTotalPrice() {
        return totalPrice;
    }

    /**
     * Sets the value of the totalPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMoney }
     *     
     */
    public void setTotalPrice(NonNegativeMoney value) {
        this.totalPrice = value;
    }

    /**
     * Gets the value of the notionalQuantitySchedule property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityNotionalQuantitySchedule }
     *     
     */
    public CommodityNotionalQuantitySchedule getNotionalQuantitySchedule() {
        return notionalQuantitySchedule;
    }

    /**
     * Sets the value of the notionalQuantitySchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityNotionalQuantitySchedule }
     *     
     */
    public void setNotionalQuantitySchedule(CommodityNotionalQuantitySchedule value) {
        this.notionalQuantitySchedule = value;
    }

    /**
     * Gets the value of the notionalQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityNotionalQuantity }
     *     
     */
    public CommodityNotionalQuantity getNotionalQuantity() {
        return notionalQuantity;
    }

    /**
     * Sets the value of the notionalQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityNotionalQuantity }
     *     
     */
    public void setNotionalQuantity(CommodityNotionalQuantity value) {
        this.notionalQuantity = value;
    }

    /**
     * Gets the value of the settlementPeriodsNotionalQuantity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the settlementPeriodsNotionalQuantity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSettlementPeriodsNotionalQuantity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommoditySettlementPeriodsNotionalQuantity }
     * 
     * 
     */
    public List<CommoditySettlementPeriodsNotionalQuantity> getSettlementPeriodsNotionalQuantity() {
        if (settlementPeriodsNotionalQuantity == null) {
            settlementPeriodsNotionalQuantity = new ArrayList<CommoditySettlementPeriodsNotionalQuantity>();
        }
        return this.settlementPeriodsNotionalQuantity;
    }

    /**
     * Gets the value of the totalNotionalQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalNotionalQuantity() {
        return totalNotionalQuantity;
    }

    /**
     * Sets the value of the totalNotionalQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalNotionalQuantity(BigDecimal value) {
        this.totalNotionalQuantity = value;
    }

    /**
     * Gets the value of the quantityReference property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityReference }
     *     
     */
    public QuantityReference getQuantityReference() {
        return quantityReference;
    }

    /**
     * Sets the value of the quantityReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityReference }
     *     
     */
    public void setQuantityReference(QuantityReference value) {
        this.quantityReference = value;
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
     * Gets the value of the flatRate property.
     * 
     * @return
     *     possible object is
     *     {@link FlatRateEnum }
     *     
     */
    public FlatRateEnum getFlatRate() {
        return flatRate;
    }

    /**
     * Sets the value of the flatRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlatRateEnum }
     *     
     */
    public void setFlatRate(FlatRateEnum value) {
        this.flatRate = value;
    }

    /**
     * Gets the value of the flatRateAmount property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMoney }
     *     
     */
    public NonNegativeMoney getFlatRateAmount() {
        return flatRateAmount;
    }

    /**
     * Sets the value of the flatRateAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMoney }
     *     
     */
    public void setFlatRateAmount(NonNegativeMoney value) {
        this.flatRateAmount = value;
    }

}
