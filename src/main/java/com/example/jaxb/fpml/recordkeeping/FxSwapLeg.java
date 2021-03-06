
package com.example.jaxb.fpml.recordkeeping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for FxSwapLeg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FxSwapLeg">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}Leg">
 *       &lt;sequence>
 *         &lt;element name="tradeIdentifierReference" type="{http://www.fpml.org/FpML-5/recordkeeping}PartyTradeIdentifierReference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}FxCoreDetails.model"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FxSwapLeg", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "tradeIdentifierReference",
    "exchangedCurrency1",
    "exchangedCurrency2",
    "dealtCurrency",
    "tenorName",
    "tenorPeriod",
    "valueDate",
    "currency1ValueDate",
    "currency2ValueDate",
    "exchangeRate",
    "nonDeliverableSettlement",
    "disruption"
})
public class FxSwapLeg
    extends Leg
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<PartyTradeIdentifierReference> tradeIdentifierReference;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    protected Payment exchangedCurrency1;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    protected Payment exchangedCurrency2;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "token")
    protected DealtCurrencyEnum dealtCurrency;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "token")
    protected FxTenorPeriodEnum tenorName;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Period tenorPeriod;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar valueDate;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar currency1ValueDate;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar currency2ValueDate;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected ExchangeRate exchangeRate;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected FxCashSettlement nonDeliverableSettlement;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<FxDisruption> disruption;

    /**
     * Gets the value of the tradeIdentifierReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradeIdentifierReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradeIdentifierReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyTradeIdentifierReference }
     * 
     * 
     */
    public List<PartyTradeIdentifierReference> getTradeIdentifierReference() {
        if (tradeIdentifierReference == null) {
            tradeIdentifierReference = new ArrayList<PartyTradeIdentifierReference>();
        }
        return this.tradeIdentifierReference;
    }

    /**
     * Gets the value of the exchangedCurrency1 property.
     * 
     * @return
     *     possible object is
     *     {@link Payment }
     *     
     */
    public Payment getExchangedCurrency1() {
        return exchangedCurrency1;
    }

    /**
     * Sets the value of the exchangedCurrency1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Payment }
     *     
     */
    public void setExchangedCurrency1(Payment value) {
        this.exchangedCurrency1 = value;
    }

    /**
     * Gets the value of the exchangedCurrency2 property.
     * 
     * @return
     *     possible object is
     *     {@link Payment }
     *     
     */
    public Payment getExchangedCurrency2() {
        return exchangedCurrency2;
    }

    /**
     * Sets the value of the exchangedCurrency2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Payment }
     *     
     */
    public void setExchangedCurrency2(Payment value) {
        this.exchangedCurrency2 = value;
    }

    /**
     * Gets the value of the dealtCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link DealtCurrencyEnum }
     *     
     */
    public DealtCurrencyEnum getDealtCurrency() {
        return dealtCurrency;
    }

    /**
     * Sets the value of the dealtCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link DealtCurrencyEnum }
     *     
     */
    public void setDealtCurrency(DealtCurrencyEnum value) {
        this.dealtCurrency = value;
    }

    /**
     * Gets the value of the tenorName property.
     * 
     * @return
     *     possible object is
     *     {@link FxTenorPeriodEnum }
     *     
     */
    public FxTenorPeriodEnum getTenorName() {
        return tenorName;
    }

    /**
     * Sets the value of the tenorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link FxTenorPeriodEnum }
     *     
     */
    public void setTenorName(FxTenorPeriodEnum value) {
        this.tenorName = value;
    }

    /**
     * Gets the value of the tenorPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getTenorPeriod() {
        return tenorPeriod;
    }

    /**
     * Sets the value of the tenorPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setTenorPeriod(Period value) {
        this.tenorPeriod = value;
    }

    /**
     * Gets the value of the valueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValueDate() {
        return valueDate;
    }

    /**
     * Sets the value of the valueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValueDate(XMLGregorianCalendar value) {
        this.valueDate = value;
    }

    /**
     * Gets the value of the currency1ValueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCurrency1ValueDate() {
        return currency1ValueDate;
    }

    /**
     * Sets the value of the currency1ValueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCurrency1ValueDate(XMLGregorianCalendar value) {
        this.currency1ValueDate = value;
    }

    /**
     * Gets the value of the currency2ValueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCurrency2ValueDate() {
        return currency2ValueDate;
    }

    /**
     * Sets the value of the currency2ValueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCurrency2ValueDate(XMLGregorianCalendar value) {
        this.currency2ValueDate = value;
    }

    /**
     * Gets the value of the exchangeRate property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeRate }
     *     
     */
    public ExchangeRate getExchangeRate() {
        return exchangeRate;
    }

    /**
     * Sets the value of the exchangeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeRate }
     *     
     */
    public void setExchangeRate(ExchangeRate value) {
        this.exchangeRate = value;
    }

    /**
     * Gets the value of the nonDeliverableSettlement property.
     * 
     * @return
     *     possible object is
     *     {@link FxCashSettlement }
     *     
     */
    public FxCashSettlement getNonDeliverableSettlement() {
        return nonDeliverableSettlement;
    }

    /**
     * Sets the value of the nonDeliverableSettlement property.
     * 
     * @param value
     *     allowed object is
     *     {@link FxCashSettlement }
     *     
     */
    public void setNonDeliverableSettlement(FxCashSettlement value) {
        this.nonDeliverableSettlement = value;
    }

    /**
     * Gets the value of the disruption property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the disruption property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisruption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FxDisruption }
     * 
     * 
     */
    public List<FxDisruption> getDisruption() {
        if (disruption == null) {
            disruption = new ArrayList<FxDisruption>();
        }
        return this.disruption;
    }

}
