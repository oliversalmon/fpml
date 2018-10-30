
package com.example.jaxb.fpml.recordkeeping;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NoTouchLowerBarrierObservation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NoTouchLowerBarrierObservation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;sequence>
 *           &lt;element name="triggerRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *           &lt;element name="quotedCurrencyPair" type="{http://www.fpml.org/FpML-5/recordkeeping}QuotedCurrencyPair" minOccurs="0"/>
 *           &lt;element name="minimumObservedRate" type="{http://www.fpml.org/FpML-5/recordkeeping}ObservedRate" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;element name="triggerPrice" type="{http://www.fpml.org/FpML-5/recordkeeping}PositiveMoney" minOccurs="0"/>
 *           &lt;element name="minimumObservedPrice" type="{http://www.fpml.org/FpML-5/recordkeeping}ObservedPrice" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NoTouchLowerBarrierObservation", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "triggerRate",
    "quotedCurrencyPair",
    "minimumObservedRate",
    "triggerPrice",
    "minimumObservedPrice"
})
public class NoTouchLowerBarrierObservation {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BigDecimal triggerRate;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected QuotedCurrencyPair quotedCurrencyPair;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected ObservedRate minimumObservedRate;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected PositiveMoney triggerPrice;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected ObservedPrice minimumObservedPrice;

    /**
     * Gets the value of the triggerRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTriggerRate() {
        return triggerRate;
    }

    /**
     * Sets the value of the triggerRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTriggerRate(BigDecimal value) {
        this.triggerRate = value;
    }

    /**
     * Gets the value of the quotedCurrencyPair property.
     * 
     * @return
     *     possible object is
     *     {@link QuotedCurrencyPair }
     *     
     */
    public QuotedCurrencyPair getQuotedCurrencyPair() {
        return quotedCurrencyPair;
    }

    /**
     * Sets the value of the quotedCurrencyPair property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuotedCurrencyPair }
     *     
     */
    public void setQuotedCurrencyPair(QuotedCurrencyPair value) {
        this.quotedCurrencyPair = value;
    }

    /**
     * Gets the value of the minimumObservedRate property.
     * 
     * @return
     *     possible object is
     *     {@link ObservedRate }
     *     
     */
    public ObservedRate getMinimumObservedRate() {
        return minimumObservedRate;
    }

    /**
     * Sets the value of the minimumObservedRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObservedRate }
     *     
     */
    public void setMinimumObservedRate(ObservedRate value) {
        this.minimumObservedRate = value;
    }

    /**
     * Gets the value of the triggerPrice property.
     * 
     * @return
     *     possible object is
     *     {@link PositiveMoney }
     *     
     */
    public PositiveMoney getTriggerPrice() {
        return triggerPrice;
    }

    /**
     * Sets the value of the triggerPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositiveMoney }
     *     
     */
    public void setTriggerPrice(PositiveMoney value) {
        this.triggerPrice = value;
    }

    /**
     * Gets the value of the minimumObservedPrice property.
     * 
     * @return
     *     possible object is
     *     {@link ObservedPrice }
     *     
     */
    public ObservedPrice getMinimumObservedPrice() {
        return minimumObservedPrice;
    }

    /**
     * Sets the value of the minimumObservedPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObservedPrice }
     *     
     */
    public void setMinimumObservedPrice(ObservedPrice value) {
        this.minimumObservedPrice = value;
    }

}
