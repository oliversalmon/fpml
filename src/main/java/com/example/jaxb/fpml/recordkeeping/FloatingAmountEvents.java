
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FloatingAmountEvents complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FloatingAmountEvents">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="failureToPayPrincipal" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="interestShortfall" type="{http://www.fpml.org/FpML-5/recordkeeping}InterestShortFall" minOccurs="0"/>
 *         &lt;element name="writedown" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="impliedWritedown" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="floatingAmountProvisions" type="{http://www.fpml.org/FpML-5/recordkeeping}FloatingAmountProvisions" minOccurs="0"/>
 *         &lt;element name="additionalFixedPayments" type="{http://www.fpml.org/FpML-5/recordkeeping}AdditionalFixedPayments" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FloatingAmountEvents", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "failureToPayPrincipal",
    "interestShortfall",
    "writedown",
    "impliedWritedown",
    "floatingAmountProvisions",
    "additionalFixedPayments"
})
public class FloatingAmountEvents {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean failureToPayPrincipal;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected InterestShortFall interestShortfall;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean writedown;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean impliedWritedown;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected FloatingAmountProvisions floatingAmountProvisions;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected AdditionalFixedPayments additionalFixedPayments;

    /**
     * Gets the value of the failureToPayPrincipal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFailureToPayPrincipal() {
        return failureToPayPrincipal;
    }

    /**
     * Sets the value of the failureToPayPrincipal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFailureToPayPrincipal(Boolean value) {
        this.failureToPayPrincipal = value;
    }

    /**
     * Gets the value of the interestShortfall property.
     * 
     * @return
     *     possible object is
     *     {@link InterestShortFall }
     *     
     */
    public InterestShortFall getInterestShortfall() {
        return interestShortfall;
    }

    /**
     * Sets the value of the interestShortfall property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestShortFall }
     *     
     */
    public void setInterestShortfall(InterestShortFall value) {
        this.interestShortfall = value;
    }

    /**
     * Gets the value of the writedown property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWritedown() {
        return writedown;
    }

    /**
     * Sets the value of the writedown property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWritedown(Boolean value) {
        this.writedown = value;
    }

    /**
     * Gets the value of the impliedWritedown property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isImpliedWritedown() {
        return impliedWritedown;
    }

    /**
     * Sets the value of the impliedWritedown property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setImpliedWritedown(Boolean value) {
        this.impliedWritedown = value;
    }

    /**
     * Gets the value of the floatingAmountProvisions property.
     * 
     * @return
     *     possible object is
     *     {@link FloatingAmountProvisions }
     *     
     */
    public FloatingAmountProvisions getFloatingAmountProvisions() {
        return floatingAmountProvisions;
    }

    /**
     * Sets the value of the floatingAmountProvisions property.
     * 
     * @param value
     *     allowed object is
     *     {@link FloatingAmountProvisions }
     *     
     */
    public void setFloatingAmountProvisions(FloatingAmountProvisions value) {
        this.floatingAmountProvisions = value;
    }

    /**
     * Gets the value of the additionalFixedPayments property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalFixedPayments }
     *     
     */
    public AdditionalFixedPayments getAdditionalFixedPayments() {
        return additionalFixedPayments;
    }

    /**
     * Sets the value of the additionalFixedPayments property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalFixedPayments }
     *     
     */
    public void setAdditionalFixedPayments(AdditionalFixedPayments value) {
        this.additionalFixedPayments = value;
    }

}
