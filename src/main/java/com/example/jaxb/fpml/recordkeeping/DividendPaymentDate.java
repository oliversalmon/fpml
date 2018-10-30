
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * A type describing the date on which the dividend will be paid/received. This type is also used to specify the date on which the FX rate will be determined, when applicable.
 * 
 * <p>Java class for DividendPaymentDate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DividendPaymentDate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;sequence>
 *             &lt;element name="dividendDateReference" type="{http://www.fpml.org/FpML-5/recordkeeping}DividendDateReferenceEnum" minOccurs="0"/>
 *             &lt;element name="paymentDateOffset" type="{http://www.fpml.org/FpML-5/recordkeeping}Offset" minOccurs="0"/>
 *           &lt;/sequence>
 *           &lt;element name="adjustableDate" type="{http://www.fpml.org/FpML-5/recordkeeping}AdjustableDate"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DividendPaymentDate", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "dividendDateReference",
    "paymentDateOffset",
    "adjustableDate"
})
public class DividendPaymentDate {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "token")
    protected DividendDateReferenceEnum dividendDateReference;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Offset paymentDateOffset;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected AdjustableDate adjustableDate;

    /**
     * Gets the value of the dividendDateReference property.
     * 
     * @return
     *     possible object is
     *     {@link DividendDateReferenceEnum }
     *     
     */
    public DividendDateReferenceEnum getDividendDateReference() {
        return dividendDateReference;
    }

    /**
     * Sets the value of the dividendDateReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link DividendDateReferenceEnum }
     *     
     */
    public void setDividendDateReference(DividendDateReferenceEnum value) {
        this.dividendDateReference = value;
    }

    /**
     * Gets the value of the paymentDateOffset property.
     * 
     * @return
     *     possible object is
     *     {@link Offset }
     *     
     */
    public Offset getPaymentDateOffset() {
        return paymentDateOffset;
    }

    /**
     * Sets the value of the paymentDateOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Offset }
     *     
     */
    public void setPaymentDateOffset(Offset value) {
        this.paymentDateOffset = value;
    }

    /**
     * Gets the value of the adjustableDate property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustableDate }
     *     
     */
    public AdjustableDate getAdjustableDate() {
        return adjustableDate;
    }

    /**
     * Sets the value of the adjustableDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustableDate }
     *     
     */
    public void setAdjustableDate(AdjustableDate value) {
        this.adjustableDate = value;
    }

}
