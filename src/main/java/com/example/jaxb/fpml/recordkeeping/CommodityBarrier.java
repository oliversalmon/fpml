
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * The specification of how a barrier option will trigger (that is, knock-in or knock-out) or expire based on the position of the spot rate relative to trigger level.
 * 
 * <p>Java class for CommodityBarrier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommodityBarrier">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;sequence>
 *           &lt;element name="knock" type="{http://www.fpml.org/FpML-5/recordkeeping}CommodityKnockEnum"/>
 *           &lt;element name="featurePaymentAmount" type="{http://www.fpml.org/FpML-5/recordkeeping}PositiveMoney" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;element name="trigger" type="{http://www.fpml.org/FpML-5/recordkeeping}CommodityTrigger"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommodityBarrier", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "knock",
    "featurePaymentAmount",
    "trigger"
})
public class CommodityBarrier {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    @XmlSchemaType(name = "token")
    protected CommodityKnockEnum knock;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected PositiveMoney featurePaymentAmount;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    protected CommodityTrigger trigger;

    /**
     * Gets the value of the knock property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityKnockEnum }
     *     
     */
    public CommodityKnockEnum getKnock() {
        return knock;
    }

    /**
     * Sets the value of the knock property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityKnockEnum }
     *     
     */
    public void setKnock(CommodityKnockEnum value) {
        this.knock = value;
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

}
