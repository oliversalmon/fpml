
package com.example.jaxb.fpml.recordkeeping;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A type describing the dividend payout ratio associated with an equity underlyer. In certain cases the actual ratio is not known on trade inception, and only general conditions are then specified.
 * 
 * <p>Java class for DividendPayout complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DividendPayout">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;sequence>
 *             &lt;element name="dividendPayoutRatio" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *             &lt;element name="dividendPayoutRatioCash" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *             &lt;element name="dividendPayoutRatioNonCash" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *           &lt;/sequence>
 *           &lt;element name="dividendPayoutConditions" type="{http://www.fpml.org/FpML-5/recordkeeping}String"/>
 *         &lt;/choice>
 *         &lt;element name="dividendPayment" type="{http://www.fpml.org/FpML-5/recordkeeping}PendingPayment" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DividendPayout", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "dividendPayoutRatio",
    "dividendPayoutRatioCash",
    "dividendPayoutRatioNonCash",
    "dividendPayoutConditions",
    "dividendPayment"
})
public class DividendPayout {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BigDecimal dividendPayoutRatio;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BigDecimal dividendPayoutRatioCash;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BigDecimal dividendPayoutRatioNonCash;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected String dividendPayoutConditions;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<PendingPayment> dividendPayment;

    /**
     * Gets the value of the dividendPayoutRatio property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDividendPayoutRatio() {
        return dividendPayoutRatio;
    }

    /**
     * Sets the value of the dividendPayoutRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDividendPayoutRatio(BigDecimal value) {
        this.dividendPayoutRatio = value;
    }

    /**
     * Gets the value of the dividendPayoutRatioCash property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDividendPayoutRatioCash() {
        return dividendPayoutRatioCash;
    }

    /**
     * Sets the value of the dividendPayoutRatioCash property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDividendPayoutRatioCash(BigDecimal value) {
        this.dividendPayoutRatioCash = value;
    }

    /**
     * Gets the value of the dividendPayoutRatioNonCash property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDividendPayoutRatioNonCash() {
        return dividendPayoutRatioNonCash;
    }

    /**
     * Sets the value of the dividendPayoutRatioNonCash property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDividendPayoutRatioNonCash(BigDecimal value) {
        this.dividendPayoutRatioNonCash = value;
    }

    /**
     * Gets the value of the dividendPayoutConditions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDividendPayoutConditions() {
        return dividendPayoutConditions;
    }

    /**
     * Sets the value of the dividendPayoutConditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDividendPayoutConditions(String value) {
        this.dividendPayoutConditions = value;
    }

    /**
     * Gets the value of the dividendPayment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dividendPayment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDividendPayment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PendingPayment }
     * 
     * 
     */
    public List<PendingPayment> getDividendPayment() {
        if (dividendPayment == null) {
            dividendPayment = new ArrayList<PendingPayment>();
        }
        return this.dividendPayment;
    }

}
