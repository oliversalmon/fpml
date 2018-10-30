
package com.example.jaxb.fpml.recordkeeping;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A type that is used for describing the exchange rate for a particular transaction.
 * 
 * <p>Java class for ExchangeRate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExchangeRate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="quotedCurrencyPair" type="{http://www.fpml.org/FpML-5/recordkeeping}QuotedCurrencyPair" minOccurs="0"/>
 *         &lt;element name="rate" type="{http://www.fpml.org/FpML-5/recordkeeping}PositiveDecimal"/>
 *         &lt;sequence minOccurs="0">
 *           &lt;element name="spotRate" type="{http://www.fpml.org/FpML-5/recordkeeping}PositiveDecimal" minOccurs="0"/>
 *           &lt;sequence minOccurs="0">
 *             &lt;element name="forwardPoints" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *             &lt;element name="pointValue" type="{http://www.fpml.org/FpML-5/recordkeeping}PointValue" minOccurs="0"/>
 *           &lt;/sequence>
 *         &lt;/sequence>
 *         &lt;element name="crossRate" type="{http://www.fpml.org/FpML-5/recordkeeping}CrossRate" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExchangeRate", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "quotedCurrencyPair",
    "rate",
    "spotRate",
    "forwardPoints",
    "pointValue",
    "crossRate"
})
public class ExchangeRate {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected QuotedCurrencyPair quotedCurrencyPair;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    protected BigDecimal rate;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BigDecimal spotRate;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BigDecimal forwardPoints;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BigDecimal pointValue;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<CrossRate> crossRate;

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
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRate(BigDecimal value) {
        this.rate = value;
    }

    /**
     * Gets the value of the spotRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSpotRate() {
        return spotRate;
    }

    /**
     * Sets the value of the spotRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSpotRate(BigDecimal value) {
        this.spotRate = value;
    }

    /**
     * Gets the value of the forwardPoints property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getForwardPoints() {
        return forwardPoints;
    }

    /**
     * Sets the value of the forwardPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setForwardPoints(BigDecimal value) {
        this.forwardPoints = value;
    }

    /**
     * Gets the value of the pointValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPointValue() {
        return pointValue;
    }

    /**
     * Sets the value of the pointValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPointValue(BigDecimal value) {
        this.pointValue = value;
    }

    /**
     * Gets the value of the crossRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the crossRate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCrossRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CrossRate }
     * 
     * 
     */
    public List<CrossRate> getCrossRate() {
        if (crossRate == null) {
            crossRate = new ArrayList<CrossRate>();
        }
        return this.crossRate;
    }

}
