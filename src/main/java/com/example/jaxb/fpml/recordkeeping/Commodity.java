
package com.example.jaxb.fpml.recordkeeping;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * A type describing a commodity underlying asset.
 * 
 * <p>Java class for Commodity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Commodity">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}IdentifiedAsset">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}CommodityProduct.model"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Commodity", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "commodityBase",
    "commodityDetails",
    "unit",
    "currency",
    "exchangeId",
    "publication",
    "specifiedPrice",
    "deliveryDates",
    "deliveryNearby",
    "deliveryDate",
    "deliveryDateYearMonth",
    "deliveryDateRollConvention",
    "deliveryDateExpirationConvention",
    "multiplier"
})
public class Commodity
    extends IdentifiedAsset
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CommodityBase commodityBase;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CommodityDetails commodityDetails;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected QuantityUnit unit;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Currency currency;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected ExchangeId exchangeId;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CommodityInformationSource publication;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "token")
    protected SpecifiedPriceEnum specifiedPrice;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "token")
    protected DeliveryDatesEnum deliveryDates;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected DeliveryNearby deliveryNearby;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected AdjustableDate deliveryDate;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "gYearMonth")
    protected XMLGregorianCalendar deliveryDateYearMonth;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Offset deliveryDateRollConvention;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Offset deliveryDateExpirationConvention;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BigDecimal multiplier;

    /**
     * Gets the value of the commodityBase property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityBase }
     *     
     */
    public CommodityBase getCommodityBase() {
        return commodityBase;
    }

    /**
     * Sets the value of the commodityBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityBase }
     *     
     */
    public void setCommodityBase(CommodityBase value) {
        this.commodityBase = value;
    }

    /**
     * Gets the value of the commodityDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityDetails }
     *     
     */
    public CommodityDetails getCommodityDetails() {
        return commodityDetails;
    }

    /**
     * Sets the value of the commodityDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityDetails }
     *     
     */
    public void setCommodityDetails(CommodityDetails value) {
        this.commodityDetails = value;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityUnit }
     *     
     */
    public QuantityUnit getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityUnit }
     *     
     */
    public void setUnit(QuantityUnit value) {
        this.unit = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setCurrency(Currency value) {
        this.currency = value;
    }

    /**
     * Gets the value of the exchangeId property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeId }
     *     
     */
    public ExchangeId getExchangeId() {
        return exchangeId;
    }

    /**
     * Sets the value of the exchangeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeId }
     *     
     */
    public void setExchangeId(ExchangeId value) {
        this.exchangeId = value;
    }

    /**
     * Gets the value of the publication property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityInformationSource }
     *     
     */
    public CommodityInformationSource getPublication() {
        return publication;
    }

    /**
     * Sets the value of the publication property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityInformationSource }
     *     
     */
    public void setPublication(CommodityInformationSource value) {
        this.publication = value;
    }

    /**
     * Gets the value of the specifiedPrice property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedPriceEnum }
     *     
     */
    public SpecifiedPriceEnum getSpecifiedPrice() {
        return specifiedPrice;
    }

    /**
     * Sets the value of the specifiedPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedPriceEnum }
     *     
     */
    public void setSpecifiedPrice(SpecifiedPriceEnum value) {
        this.specifiedPrice = value;
    }

    /**
     * Gets the value of the deliveryDates property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryDatesEnum }
     *     
     */
    public DeliveryDatesEnum getDeliveryDates() {
        return deliveryDates;
    }

    /**
     * Sets the value of the deliveryDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryDatesEnum }
     *     
     */
    public void setDeliveryDates(DeliveryDatesEnum value) {
        this.deliveryDates = value;
    }

    /**
     * Gets the value of the deliveryNearby property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryNearby }
     *     
     */
    public DeliveryNearby getDeliveryNearby() {
        return deliveryNearby;
    }

    /**
     * Sets the value of the deliveryNearby property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryNearby }
     *     
     */
    public void setDeliveryNearby(DeliveryNearby value) {
        this.deliveryNearby = value;
    }

    /**
     * Gets the value of the deliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustableDate }
     *     
     */
    public AdjustableDate getDeliveryDate() {
        return deliveryDate;
    }

    /**
     * Sets the value of the deliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustableDate }
     *     
     */
    public void setDeliveryDate(AdjustableDate value) {
        this.deliveryDate = value;
    }

    /**
     * Gets the value of the deliveryDateYearMonth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeliveryDateYearMonth() {
        return deliveryDateYearMonth;
    }

    /**
     * Sets the value of the deliveryDateYearMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeliveryDateYearMonth(XMLGregorianCalendar value) {
        this.deliveryDateYearMonth = value;
    }

    /**
     * Gets the value of the deliveryDateRollConvention property.
     * 
     * @return
     *     possible object is
     *     {@link Offset }
     *     
     */
    public Offset getDeliveryDateRollConvention() {
        return deliveryDateRollConvention;
    }

    /**
     * Sets the value of the deliveryDateRollConvention property.
     * 
     * @param value
     *     allowed object is
     *     {@link Offset }
     *     
     */
    public void setDeliveryDateRollConvention(Offset value) {
        this.deliveryDateRollConvention = value;
    }

    /**
     * Gets the value of the deliveryDateExpirationConvention property.
     * 
     * @return
     *     possible object is
     *     {@link Offset }
     *     
     */
    public Offset getDeliveryDateExpirationConvention() {
        return deliveryDateExpirationConvention;
    }

    /**
     * Sets the value of the deliveryDateExpirationConvention property.
     * 
     * @param value
     *     allowed object is
     *     {@link Offset }
     *     
     */
    public void setDeliveryDateExpirationConvention(Offset value) {
        this.deliveryDateExpirationConvention = value;
    }

    /**
     * Gets the value of the multiplier property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMultiplier() {
        return multiplier;
    }

    /**
     * Sets the value of the multiplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMultiplier(BigDecimal value) {
        this.multiplier = value;
    }

}
