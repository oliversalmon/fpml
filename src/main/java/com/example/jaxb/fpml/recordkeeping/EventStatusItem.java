
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A type used in event status enquiry messages which relates an event identifier to its current status value.
 * 
 * <p>Java class for EventStatusItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventStatusItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="eventIdentifier" type="{http://www.fpml.org/FpML-5/recordkeeping}EventIdentifier" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.fpml.org/FpML-5/recordkeeping}EventStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventStatusItem", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "eventIdentifier",
    "status"
})
public class EventStatusItem {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected EventIdentifier eventIdentifier;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected EventStatus status;

    /**
     * Gets the value of the eventIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link EventIdentifier }
     *     
     */
    public EventIdentifier getEventIdentifier() {
        return eventIdentifier;
    }

    /**
     * Sets the value of the eventIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventIdentifier }
     *     
     */
    public void setEventIdentifier(EventIdentifier value) {
        this.eventIdentifier = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link EventStatus }
     *     
     */
    public EventStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventStatus }
     *     
     */
    public void setStatus(EventStatus value) {
        this.status = value;
    }

}
