
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A type describing the return payment dates of the swap.
 * 
 * <p>Java class for ReturnSwapPaymentDates complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReturnSwapPaymentDates">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="paymentDatesInterim" type="{http://www.fpml.org/FpML-5/recordkeeping}AdjustableOrRelativeDates" minOccurs="0"/>
 *         &lt;element name="paymentDateFinal" type="{http://www.fpml.org/FpML-5/recordkeeping}AdjustableOrRelativeDate" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReturnSwapPaymentDates", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "paymentDatesInterim",
    "paymentDateFinal"
})
public class ReturnSwapPaymentDates {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected AdjustableOrRelativeDates paymentDatesInterim;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected AdjustableOrRelativeDate paymentDateFinal;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the paymentDatesInterim property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustableOrRelativeDates }
     *     
     */
    public AdjustableOrRelativeDates getPaymentDatesInterim() {
        return paymentDatesInterim;
    }

    /**
     * Sets the value of the paymentDatesInterim property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustableOrRelativeDates }
     *     
     */
    public void setPaymentDatesInterim(AdjustableOrRelativeDates value) {
        this.paymentDatesInterim = value;
    }

    /**
     * Gets the value of the paymentDateFinal property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustableOrRelativeDate }
     *     
     */
    public AdjustableOrRelativeDate getPaymentDateFinal() {
        return paymentDateFinal;
    }

    /**
     * Sets the value of the paymentDateFinal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustableOrRelativeDate }
     *     
     */
    public void setPaymentDateFinal(AdjustableOrRelativeDate value) {
        this.paymentDateFinal = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
