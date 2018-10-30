
package com.example.jaxb.fpml.recordkeeping;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * A type defining multiple exercises. As defining in the 2000 ISDA Definitions, Section 12.4. Multiple Exercise, the buyer of the option has the right to exercise all or less than all the unexercised notional amount of the underlying swap on one or more days in the exercise period, but on any such day may not exercise less than the minimum notional amount or more than the maximum notional amount, and if an integral multiple amount is specified, the notional exercised must be equal to or, be an integral multiple of, the integral multiple amount.
 * 
 * <p>Java class for MultipleExercise complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MultipleExercise">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}PartialExercise.model"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="maximumNotionalAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *           &lt;element name="maximumNumberOfOptions" type="{http://www.fpml.org/FpML-5/recordkeeping}NonNegativeDecimal"/>
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
@XmlType(name = "MultipleExercise", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "notionalReference",
    "integralMultipleAmount",
    "minimumNotionalAmount",
    "minimumNumberOfOptions",
    "maximumNotionalAmount",
    "maximumNumberOfOptions"
})
public class MultipleExercise {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<NotionalReference> notionalReference;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BigDecimal integralMultipleAmount;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BigDecimal minimumNotionalAmount;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger minimumNumberOfOptions;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BigDecimal maximumNotionalAmount;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BigDecimal maximumNumberOfOptions;

    /**
     * Gets the value of the notionalReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notionalReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotionalReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotionalReference }
     * 
     * 
     */
    public List<NotionalReference> getNotionalReference() {
        if (notionalReference == null) {
            notionalReference = new ArrayList<NotionalReference>();
        }
        return this.notionalReference;
    }

    /**
     * Gets the value of the integralMultipleAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIntegralMultipleAmount() {
        return integralMultipleAmount;
    }

    /**
     * Sets the value of the integralMultipleAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIntegralMultipleAmount(BigDecimal value) {
        this.integralMultipleAmount = value;
    }

    /**
     * Gets the value of the minimumNotionalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinimumNotionalAmount() {
        return minimumNotionalAmount;
    }

    /**
     * Sets the value of the minimumNotionalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinimumNotionalAmount(BigDecimal value) {
        this.minimumNotionalAmount = value;
    }

    /**
     * Gets the value of the minimumNumberOfOptions property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinimumNumberOfOptions() {
        return minimumNumberOfOptions;
    }

    /**
     * Sets the value of the minimumNumberOfOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinimumNumberOfOptions(BigInteger value) {
        this.minimumNumberOfOptions = value;
    }

    /**
     * Gets the value of the maximumNotionalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumNotionalAmount() {
        return maximumNotionalAmount;
    }

    /**
     * Sets the value of the maximumNotionalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumNotionalAmount(BigDecimal value) {
        this.maximumNotionalAmount = value;
    }

    /**
     * Gets the value of the maximumNumberOfOptions property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumNumberOfOptions() {
        return maximumNumberOfOptions;
    }

    /**
     * Sets the value of the maximumNumberOfOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumNumberOfOptions(BigDecimal value) {
        this.maximumNumberOfOptions = value;
    }

}
