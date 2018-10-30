
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Defined the conditions under which the digital option can triggers and, if triggered, what payment results.
 * 
 * <p>Java class for CommodityDigital complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommodityDigital">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="trigger" type="{http://www.fpml.org/FpML-5/recordkeeping}CommodityTrigger" minOccurs="0"/>
 *         &lt;element name="featurePaymentAmount" type="{http://www.fpml.org/FpML-5/recordkeeping}PositiveMoney" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommodityDigital", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "trigger",
    "featurePaymentAmount"
})
public class CommodityDigital {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CommodityTrigger trigger;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected PositiveMoney featurePaymentAmount;

    /**
     * Gets the value of the trigger property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityTrigger }
     *     
     */
    public CommodityTrigger getTrigger() {
        return trigger;
    }

    /**
     * Sets the value of the trigger property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityTrigger }
     *     
     */
    public void setTrigger(CommodityTrigger value) {
        this.trigger = value;
    }

    /**
     * Gets the value of the featurePaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link PositiveMoney }
     *     
     */
    public PositiveMoney getFeaturePaymentAmount() {
        return featurePaymentAmount;
    }

    /**
     * Sets the value of the featurePaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositiveMoney }
     *     
     */
    public void setFeaturePaymentAmount(PositiveMoney value) {
        this.featurePaymentAmount = value;
    }

}
