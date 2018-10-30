
package com.example.jaxb.fpml.recordkeeping;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * A type that describes the rate of exchange at which the embedded option in a Dual Currency Deposit has been struck.
 * 
 * <p>Java class for DualCurrencyStrikePrice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DualCurrencyStrikePrice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rate" type="{http://www.fpml.org/FpML-5/recordkeeping}PositiveDecimal" minOccurs="0"/>
 *         &lt;element name="strikeQuoteBasis" type="{http://www.fpml.org/FpML-5/recordkeeping}DualCurrencyStrikeQuoteBasisEnum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DualCurrencyStrikePrice", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "rate",
    "strikeQuoteBasis"
})
public class DualCurrencyStrikePrice {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BigDecimal rate;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "token")
    protected DualCurrencyStrikeQuoteBasisEnum strikeQuoteBasis;

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
     * Gets the value of the strikeQuoteBasis property.
     * 
     * @return
     *     possible object is
     *     {@link DualCurrencyStrikeQuoteBasisEnum }
     *     
     */
    public DualCurrencyStrikeQuoteBasisEnum getStrikeQuoteBasis() {
        return strikeQuoteBasis;
    }

    /**
     * Sets the value of the strikeQuoteBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link DualCurrencyStrikeQuoteBasisEnum }
     *     
     */
    public void setStrikeQuoteBasis(DualCurrencyStrikeQuoteBasisEnum value) {
        this.strikeQuoteBasis = value;
    }

}
