
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A type describing the initial and final valuation of the underlyer.
 * 
 * <p>Java class for ReturnLegValuation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReturnLegValuation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="initialPrice" type="{http://www.fpml.org/FpML-5/recordkeeping}ReturnLegValuationPrice" minOccurs="0"/>
 *         &lt;element name="notionalReset" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="valuationPriceInterim" type="{http://www.fpml.org/FpML-5/recordkeeping}ReturnLegValuationPrice" minOccurs="0"/>
 *         &lt;element name="valuationPriceFinal" type="{http://www.fpml.org/FpML-5/recordkeeping}ReturnLegValuationPrice" minOccurs="0"/>
 *         &lt;element name="paymentDates" type="{http://www.fpml.org/FpML-5/recordkeeping}ReturnSwapPaymentDates" minOccurs="0"/>
 *         &lt;element name="exchangeTradedContractNearest" type="{http://www.fpml.org/FpML-5/recordkeeping}ExchangeTradedContract" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReturnLegValuation", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "initialPrice",
    "notionalReset",
    "valuationPriceInterim",
    "valuationPriceFinal",
    "paymentDates",
    "exchangeTradedContractNearest"
})
public class ReturnLegValuation {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected ReturnLegValuationPrice initialPrice;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean notionalReset;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected ReturnLegValuationPrice valuationPriceInterim;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected ReturnLegValuationPrice valuationPriceFinal;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected ReturnSwapPaymentDates paymentDates;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected ExchangeTradedContract exchangeTradedContractNearest;

    /**
     * Gets the value of the initialPrice property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnLegValuationPrice }
     *     
     */
    public ReturnLegValuationPrice getInitialPrice() {
        return initialPrice;
    }

    /**
     * Sets the value of the initialPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnLegValuationPrice }
     *     
     */
    public void setInitialPrice(ReturnLegValuationPrice value) {
        this.initialPrice = value;
    }

    /**
     * Gets the value of the notionalReset property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNotionalReset() {
        return notionalReset;
    }

    /**
     * Sets the value of the notionalReset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotionalReset(Boolean value) {
        this.notionalReset = value;
    }

    /**
     * Gets the value of the valuationPriceInterim property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnLegValuationPrice }
     *     
     */
    public ReturnLegValuationPrice getValuationPriceInterim() {
        return valuationPriceInterim;
    }

    /**
     * Sets the value of the valuationPriceInterim property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnLegValuationPrice }
     *     
     */
    public void setValuationPriceInterim(ReturnLegValuationPrice value) {
        this.valuationPriceInterim = value;
    }

    /**
     * Gets the value of the valuationPriceFinal property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnLegValuationPrice }
     *     
     */
    public ReturnLegValuationPrice getValuationPriceFinal() {
        return valuationPriceFinal;
    }

    /**
     * Sets the value of the valuationPriceFinal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnLegValuationPrice }
     *     
     */
    public void setValuationPriceFinal(ReturnLegValuationPrice value) {
        this.valuationPriceFinal = value;
    }

    /**
     * Gets the value of the paymentDates property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnSwapPaymentDates }
     *     
     */
    public ReturnSwapPaymentDates getPaymentDates() {
        return paymentDates;
    }

    /**
     * Sets the value of the paymentDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnSwapPaymentDates }
     *     
     */
    public void setPaymentDates(ReturnSwapPaymentDates value) {
        this.paymentDates = value;
    }

    /**
     * Gets the value of the exchangeTradedContractNearest property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeTradedContract }
     *     
     */
    public ExchangeTradedContract getExchangeTradedContractNearest() {
        return exchangeTradedContractNearest;
    }

    /**
     * Sets the value of the exchangeTradedContractNearest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeTradedContract }
     *     
     */
    public void setExchangeTradedContractNearest(ExchangeTradedContract value) {
        this.exchangeTradedContractNearest = value;
    }

}
