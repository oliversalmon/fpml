
package com.example.jaxb.fpml.legal;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The collateral eligibility as a function of the types of asset, the maturity and rating terms.
 * 
 * <p>Java class for EligibleCollateral complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EligibleCollateral">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="eligibleAsset" type="{http://www.fpml.org/FpML-5/legal}EligibleAsset"/>
 *         &lt;element name="lowerMaturity" type="{http://www.fpml.org/FpML-5/legal}Period" minOccurs="0"/>
 *         &lt;element name="higherMaturity" type="{http://www.fpml.org/FpML-5/legal}Period" minOccurs="0"/>
 *         &lt;element name="minimumRating" type="{http://www.fpml.org/FpML-5/legal}CreditNotations" minOccurs="0"/>
 *         &lt;element name="valuationPercentage" type="{http://www.fpml.org/FpML-5/legal}RestrictedPercentage" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EligibleCollateral", namespace = "http://www.fpml.org/FpML-5/legal", propOrder = {
    "eligibleAsset",
    "lowerMaturity",
    "higherMaturity",
    "minimumRating",
    "valuationPercentage"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class EligibleCollateral {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/legal", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected EligibleAsset eligibleAsset;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/legal")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Period lowerMaturity;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/legal")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Period higherMaturity;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/legal")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected CreditNotations minimumRating;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/legal")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected BigDecimal valuationPercentage;

    /**
     * Gets the value of the eligibleAsset property.
     * 
     * @return
     *     possible object is
     *     {@link EligibleAsset }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public EligibleAsset getEligibleAsset() {
        return eligibleAsset;
    }

    /**
     * Sets the value of the eligibleAsset property.
     * 
     * @param value
     *     allowed object is
     *     {@link EligibleAsset }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setEligibleAsset(EligibleAsset value) {
        this.eligibleAsset = value;
    }

    /**
     * Gets the value of the lowerMaturity property.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Period getLowerMaturity() {
        return lowerMaturity;
    }

    /**
     * Sets the value of the lowerMaturity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setLowerMaturity(Period value) {
        this.lowerMaturity = value;
    }

    /**
     * Gets the value of the higherMaturity property.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Period getHigherMaturity() {
        return higherMaturity;
    }

    /**
     * Sets the value of the higherMaturity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setHigherMaturity(Period value) {
        this.higherMaturity = value;
    }

    /**
     * Gets the value of the minimumRating property.
     * 
     * @return
     *     possible object is
     *     {@link CreditNotations }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public CreditNotations getMinimumRating() {
        return minimumRating;
    }

    /**
     * Sets the value of the minimumRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditNotations }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setMinimumRating(CreditNotations value) {
        this.minimumRating = value;
    }

    /**
     * Gets the value of the valuationPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public BigDecimal getValuationPercentage() {
        return valuationPercentage;
    }

    /**
     * Sets the value of the valuationPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setValuationPercentage(BigDecimal value) {
        this.valuationPercentage = value;
    }

}
