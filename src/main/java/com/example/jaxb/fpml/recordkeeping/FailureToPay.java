
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FailureToPay complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FailureToPay">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="applicable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="gracePeriodExtension" type="{http://www.fpml.org/FpML-5/recordkeeping}GracePeriodExtension" minOccurs="0"/>
 *         &lt;element name="paymentRequirement" type="{http://www.fpml.org/FpML-5/recordkeeping}Money" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FailureToPay", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "applicable",
    "gracePeriodExtension",
    "paymentRequirement"
})
public class FailureToPay {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean applicable;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected GracePeriodExtension gracePeriodExtension;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Money paymentRequirement;

    /**
     * Gets the value of the applicable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApplicable() {
        return applicable;
    }

    /**
     * Sets the value of the applicable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApplicable(Boolean value) {
        this.applicable = value;
    }

    /**
     * Gets the value of the gracePeriodExtension property.
     * 
     * @return
     *     possible object is
     *     {@link GracePeriodExtension }
     *     
     */
    public GracePeriodExtension getGracePeriodExtension() {
        return gracePeriodExtension;
    }

    /**
     * Sets the value of the gracePeriodExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link GracePeriodExtension }
     *     
     */
    public void setGracePeriodExtension(GracePeriodExtension value) {
        this.gracePeriodExtension = value;
    }

    /**
     * Gets the value of the paymentRequirement property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getPaymentRequirement() {
        return paymentRequirement;
    }

    /**
     * Sets the value of the paymentRequirement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setPaymentRequirement(Money value) {
        this.paymentRequirement = value;
    }

}
