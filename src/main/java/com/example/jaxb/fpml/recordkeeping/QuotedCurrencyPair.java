
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * A type that describes the composition of a rate that has been quoted or is to be quoted. This includes the two currencies and the quotation relationship between the two currencies and is used as a building block throughout the FX specification.
 * 
 * <p>Java class for QuotedCurrencyPair complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuotedCurrencyPair">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="currency1" type="{http://www.fpml.org/FpML-5/recordkeeping}Currency"/>
 *         &lt;element name="currency2" type="{http://www.fpml.org/FpML-5/recordkeeping}Currency"/>
 *         &lt;element name="quoteBasis" type="{http://www.fpml.org/FpML-5/recordkeeping}QuoteBasisEnum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuotedCurrencyPair", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "currency1",
    "currency2",
    "quoteBasis"
})
public class QuotedCurrencyPair {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    protected Currency currency1;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    protected Currency currency2;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "token")
    protected QuoteBasisEnum quoteBasis;

    /**
     * Gets the value of the currency1 property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getCurrency1() {
        return currency1;
    }

    /**
     * Sets the value of the currency1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setCurrency1(Currency value) {
        this.currency1 = value;
    }

    /**
     * Gets the value of the currency2 property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getCurrency2() {
        return currency2;
    }

    /**
     * Sets the value of the currency2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setCurrency2(Currency value) {
        this.currency2 = value;
    }

    /**
     * Gets the value of the quoteBasis property.
     * 
     * @return
     *     possible object is
     *     {@link QuoteBasisEnum }
     *     
     */
    public QuoteBasisEnum getQuoteBasis() {
        return quoteBasis;
    }

    /**
     * Sets the value of the quoteBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuoteBasisEnum }
     *     
     */
    public void setQuoteBasis(QuoteBasisEnum value) {
        this.quoteBasis = value;
    }

}
