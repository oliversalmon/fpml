
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * As per ISDA 2002 Definitions.
 * 
 * <p>Java class for Barrier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Barrier">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="barrierCap" type="{http://www.fpml.org/FpML-5/recordkeeping}TriggerEvent" minOccurs="0"/>
 *         &lt;element name="barrierFloor" type="{http://www.fpml.org/FpML-5/recordkeeping}TriggerEvent" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Barrier", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "barrierCap",
    "barrierFloor"
})
public class Barrier {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected TriggerEvent barrierCap;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected TriggerEvent barrierFloor;

    /**
     * Gets the value of the barrierCap property.
     * 
     * @return
     *     possible object is
     *     {@link TriggerEvent }
     *     
     */
    public TriggerEvent getBarrierCap() {
        return barrierCap;
    }

    /**
     * Sets the value of the barrierCap property.
     * 
     * @param value
     *     allowed object is
     *     {@link TriggerEvent }
     *     
     */
    public void setBarrierCap(TriggerEvent value) {
        this.barrierCap = value;
    }

    /**
     * Gets the value of the barrierFloor property.
     * 
     * @return
     *     possible object is
     *     {@link TriggerEvent }
     *     
     */
    public TriggerEvent getBarrierFloor() {
        return barrierFloor;
    }

    /**
     * Sets the value of the barrierFloor property.
     * 
     * @param value
     *     allowed object is
     *     {@link TriggerEvent }
     *     
     */
    public void setBarrierFloor(TriggerEvent value) {
        this.barrierFloor = value;
    }

}
