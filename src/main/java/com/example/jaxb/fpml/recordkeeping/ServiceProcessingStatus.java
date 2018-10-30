
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A type defining the content model for report on the status of the processing by a service. In the future we may wish to provide some kind of scope or other qualification for the event, e.g. the currencies, products, or books to which it applies.
 * 
 * <p>Java class for ServiceProcessingStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceProcessingStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cycle" type="{http://www.fpml.org/FpML-5/recordkeeping}ServiceProcessingCycle" minOccurs="0"/>
 *         &lt;element name="step" type="{http://www.fpml.org/FpML-5/recordkeeping}ServiceProcessingStep" minOccurs="0"/>
 *         &lt;element name="event" type="{http://www.fpml.org/FpML-5/recordkeeping}ServiceProcessingEvent" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceProcessingStatus", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "cycle",
    "step",
    "event"
})
public class ServiceProcessingStatus {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected ServiceProcessingCycle cycle;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected ServiceProcessingStep step;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected ServiceProcessingEvent event;

    /**
     * Gets the value of the cycle property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceProcessingCycle }
     *     
     */
    public ServiceProcessingCycle getCycle() {
        return cycle;
    }

    /**
     * Sets the value of the cycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceProcessingCycle }
     *     
     */
    public void setCycle(ServiceProcessingCycle value) {
        this.cycle = value;
    }

    /**
     * Gets the value of the step property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceProcessingStep }
     *     
     */
    public ServiceProcessingStep getStep() {
        return step;
    }

    /**
     * Sets the value of the step property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceProcessingStep }
     *     
     */
    public void setStep(ServiceProcessingStep value) {
        this.step = value;
    }

    /**
     * Gets the value of the event property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceProcessingEvent }
     *     
     */
    public ServiceProcessingEvent getEvent() {
        return event;
    }

    /**
     * Sets the value of the event property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceProcessingEvent }
     *     
     */
    public void setEvent(ServiceProcessingEvent value) {
        this.event = value;
    }

}
