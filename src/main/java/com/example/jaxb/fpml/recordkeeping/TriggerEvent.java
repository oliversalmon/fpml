
package com.example.jaxb.fpml.recordkeeping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Observation point for trigger.
 * 
 * <p>Java class for TriggerEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TriggerEvent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="schedule" type="{http://www.fpml.org/FpML-5/recordkeeping}AveragingSchedule" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="triggerDates" type="{http://www.fpml.org/FpML-5/recordkeeping}DateList" minOccurs="0"/>
 *         &lt;element name="trigger" type="{http://www.fpml.org/FpML-5/recordkeeping}Trigger" minOccurs="0"/>
 *         &lt;element name="featurePayment" type="{http://www.fpml.org/FpML-5/recordkeeping}FeaturePayment" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TriggerEvent", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "schedule",
    "triggerDates",
    "trigger",
    "featurePayment"
})
public class TriggerEvent {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<AveragingSchedule> schedule;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected DateList triggerDates;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Trigger trigger;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected FeaturePayment featurePayment;

    /**
     * Gets the value of the schedule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the schedule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSchedule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AveragingSchedule }
     * 
     * 
     */
    public List<AveragingSchedule> getSchedule() {
        if (schedule == null) {
            schedule = new ArrayList<AveragingSchedule>();
        }
        return this.schedule;
    }

    /**
     * Gets the value of the triggerDates property.
     * 
     * @return
     *     possible object is
     *     {@link DateList }
     *     
     */
    public DateList getTriggerDates() {
        return triggerDates;
    }

    /**
     * Sets the value of the triggerDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateList }
     *     
     */
    public void setTriggerDates(DateList value) {
        this.triggerDates = value;
    }

    /**
     * Gets the value of the trigger property.
     * 
     * @return
     *     possible object is
     *     {@link Trigger }
     *     
     */
    public Trigger getTrigger() {
        return trigger;
    }

    /**
     * Sets the value of the trigger property.
     * 
     * @param value
     *     allowed object is
     *     {@link Trigger }
     *     
     */
    public void setTrigger(Trigger value) {
        this.trigger = value;
    }

    /**
     * Gets the value of the featurePayment property.
     * 
     * @return
     *     possible object is
     *     {@link FeaturePayment }
     *     
     */
    public FeaturePayment getFeaturePayment() {
        return featurePayment;
    }

    /**
     * Sets the value of the featurePayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeaturePayment }
     *     
     */
    public void setFeaturePayment(FeaturePayment value) {
        this.featurePayment = value;
    }

}