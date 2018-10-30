
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The parameters for defining how the commodity digital option can be exercised. It differs from the CommodityExercise type in that it lacks a specification of Settlement Currency. The Settlement Currency is specified in the 'featurePayment' element.
 * 
 * <p>Java class for CommodityDigitalExercise complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommodityDigitalExercise">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="americanExercise" type="{http://www.fpml.org/FpML-5/recordkeeping}CommodityAmericanExercise"/>
 *           &lt;element name="europeanExercise" type="{http://www.fpml.org/FpML-5/recordkeeping}CommodityEuropeanExercise"/>
 *         &lt;/choice>
 *         &lt;element name="automaticExercise" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="writtenConfirmation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}CommodityPaymentDates.model"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommodityDigitalExercise", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "americanExercise",
    "europeanExercise",
    "automaticExercise",
    "writtenConfirmation",
    "relativePaymentDates",
    "paymentDates",
    "masterAgreementPaymentDates"
})
public class CommodityDigitalExercise {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CommodityAmericanExercise americanExercise;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CommodityEuropeanExercise europeanExercise;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean automaticExercise;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean writtenConfirmation;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CommodityRelativePaymentDates relativePaymentDates;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected AdjustableDatesOrRelativeDateOffset paymentDates;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean masterAgreementPaymentDates;

    /**
     * Gets the value of the americanExercise property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityAmericanExercise }
     *     
     */
    public CommodityAmericanExercise getAmericanExercise() {
        return americanExercise;
    }

    /**
     * Sets the value of the americanExercise property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityAmericanExercise }
     *     
     */
    public void setAmericanExercise(CommodityAmericanExercise value) {
        this.americanExercise = value;
    }

    /**
     * Gets the value of the europeanExercise property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityEuropeanExercise }
     *     
     */
    public CommodityEuropeanExercise getEuropeanExercise() {
        return europeanExercise;
    }

    /**
     * Sets the value of the europeanExercise property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityEuropeanExercise }
     *     
     */
    public void setEuropeanExercise(CommodityEuropeanExercise value) {
        this.europeanExercise = value;
    }

    /**
     * Gets the value of the automaticExercise property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutomaticExercise() {
        return automaticExercise;
    }

    /**
     * Sets the value of the automaticExercise property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutomaticExercise(Boolean value) {
        this.automaticExercise = value;
    }

    /**
     * Gets the value of the writtenConfirmation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWrittenConfirmation() {
        return writtenConfirmation;
    }

    /**
     * Sets the value of the writtenConfirmation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWrittenConfirmation(Boolean value) {
        this.writtenConfirmation = value;
    }

    /**
     * Gets the value of the relativePaymentDates property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityRelativePaymentDates }
     *     
     */
    public CommodityRelativePaymentDates getRelativePaymentDates() {
        return relativePaymentDates;
    }

    /**
     * Sets the value of the relativePaymentDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityRelativePaymentDates }
     *     
     */
    public void setRelativePaymentDates(CommodityRelativePaymentDates value) {
        this.relativePaymentDates = value;
    }

    /**
     * Gets the value of the paymentDates property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustableDatesOrRelativeDateOffset }
     *     
     */
    public AdjustableDatesOrRelativeDateOffset getPaymentDates() {
        return paymentDates;
    }

    /**
     * Sets the value of the paymentDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustableDatesOrRelativeDateOffset }
     *     
     */
    public void setPaymentDates(AdjustableDatesOrRelativeDateOffset value) {
        this.paymentDates = value;
    }

    /**
     * Gets the value of the masterAgreementPaymentDates property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMasterAgreementPaymentDates() {
        return masterAgreementPaymentDates;
    }

    /**
     * Sets the value of the masterAgreementPaymentDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMasterAgreementPaymentDates(Boolean value) {
        this.masterAgreementPaymentDates = value;
    }

}
