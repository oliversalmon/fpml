
package com.example.jaxb.fpml.recordkeeping;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Some kind of numerical measure about an asset, eg. its NPV, together with characteristics of that measure, together with optional sensitivities.
 * 
 * <p>Java class for Quotation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Quotation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}Quotation.model"/>
 *         &lt;element name="sensitivitySet" type="{http://www.fpml.org/FpML-5/recordkeeping}SensitivitySet" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Quotation", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "value",
    "measureType",
    "quoteUnits",
    "side",
    "currency",
    "currencyType",
    "timing",
    "businessCenter",
    "exchangeId",
    "informationSource",
    "pricingModel",
    "time",
    "valuationDate",
    "expiryTime",
    "cashflowType",
    "sensitivitySet"
})
public class Quotation {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BigDecimal value;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected AssetMeasureType measureType;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected PriceQuoteUnits quoteUnits;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "token")
    protected QuotationSideEnum side;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Currency currency;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected ReportingCurrencyType currencyType;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected QuoteTiming timing;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BusinessCenter businessCenter;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected ExchangeId exchangeId;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<InformationSource> informationSource;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected PricingModel pricingModel;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar time;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar valuationDate;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expiryTime;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CashflowType cashflowType;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<SensitivitySet> sensitivitySet;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }

    /**
     * Gets the value of the measureType property.
     * 
     * @return
     *     possible object is
     *     {@link AssetMeasureType }
     *     
     */
    public AssetMeasureType getMeasureType() {
        return measureType;
    }

    /**
     * Sets the value of the measureType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetMeasureType }
     *     
     */
    public void setMeasureType(AssetMeasureType value) {
        this.measureType = value;
    }

    /**
     * Gets the value of the quoteUnits property.
     * 
     * @return
     *     possible object is
     *     {@link PriceQuoteUnits }
     *     
     */
    public PriceQuoteUnits getQuoteUnits() {
        return quoteUnits;
    }

    /**
     * Sets the value of the quoteUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceQuoteUnits }
     *     
     */
    public void setQuoteUnits(PriceQuoteUnits value) {
        this.quoteUnits = value;
    }

    /**
     * Gets the value of the side property.
     * 
     * @return
     *     possible object is
     *     {@link QuotationSideEnum }
     *     
     */
    public QuotationSideEnum getSide() {
        return side;
    }

    /**
     * Sets the value of the side property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuotationSideEnum }
     *     
     */
    public void setSide(QuotationSideEnum value) {
        this.side = value;
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
     * Gets the value of the currencyType property.
     * 
     * @return
     *     possible object is
     *     {@link ReportingCurrencyType }
     *     
     */
    public ReportingCurrencyType getCurrencyType() {
        return currencyType;
    }

    /**
     * Sets the value of the currencyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportingCurrencyType }
     *     
     */
    public void setCurrencyType(ReportingCurrencyType value) {
        this.currencyType = value;
    }

    /**
     * Gets the value of the timing property.
     * 
     * @return
     *     possible object is
     *     {@link QuoteTiming }
     *     
     */
    public QuoteTiming getTiming() {
        return timing;
    }

    /**
     * Sets the value of the timing property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuoteTiming }
     *     
     */
    public void setTiming(QuoteTiming value) {
        this.timing = value;
    }

    /**
     * Gets the value of the businessCenter property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessCenter }
     *     
     */
    public BusinessCenter getBusinessCenter() {
        return businessCenter;
    }

    /**
     * Sets the value of the businessCenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessCenter }
     *     
     */
    public void setBusinessCenter(BusinessCenter value) {
        this.businessCenter = value;
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
     * Gets the value of the informationSource property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the informationSource property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInformationSource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InformationSource }
     * 
     * 
     */
    public List<InformationSource> getInformationSource() {
        if (informationSource == null) {
            informationSource = new ArrayList<InformationSource>();
        }
        return this.informationSource;
    }

    /**
     * Gets the value of the pricingModel property.
     * 
     * @return
     *     possible object is
     *     {@link PricingModel }
     *     
     */
    public PricingModel getPricingModel() {
        return pricingModel;
    }

    /**
     * Sets the value of the pricingModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingModel }
     *     
     */
    public void setPricingModel(PricingModel value) {
        this.pricingModel = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTime(XMLGregorianCalendar value) {
        this.time = value;
    }

    /**
     * Gets the value of the valuationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValuationDate() {
        return valuationDate;
    }

    /**
     * Sets the value of the valuationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValuationDate(XMLGregorianCalendar value) {
        this.valuationDate = value;
    }

    /**
     * Gets the value of the expiryTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpiryTime() {
        return expiryTime;
    }

    /**
     * Sets the value of the expiryTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpiryTime(XMLGregorianCalendar value) {
        this.expiryTime = value;
    }

    /**
     * Gets the value of the cashflowType property.
     * 
     * @return
     *     possible object is
     *     {@link CashflowType }
     *     
     */
    public CashflowType getCashflowType() {
        return cashflowType;
    }

    /**
     * Sets the value of the cashflowType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashflowType }
     *     
     */
    public void setCashflowType(CashflowType value) {
        this.cashflowType = value;
    }

    /**
     * Gets the value of the sensitivitySet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sensitivitySet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSensitivitySet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SensitivitySet }
     * 
     * 
     */
    public List<SensitivitySet> getSensitivitySet() {
        if (sensitivitySet == null) {
            sensitivitySet = new ArrayList<SensitivitySet>();
        }
        return this.sensitivitySet;
    }

}
