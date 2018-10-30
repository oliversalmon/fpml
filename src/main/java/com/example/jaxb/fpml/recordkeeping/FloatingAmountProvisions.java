
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FloatingAmountProvisions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FloatingAmountProvisions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WACCapInterestProvision" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="stepUpProvision" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FloatingAmountProvisions", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "wacCapInterestProvision",
    "stepUpProvision"
})
public class FloatingAmountProvisions {

    @XmlElement(name = "WACCapInterestProvision", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean wacCapInterestProvision;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean stepUpProvision;

    /**
     * Gets the value of the wacCapInterestProvision property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWACCapInterestProvision() {
        return wacCapInterestProvision;
    }

    /**
     * Sets the value of the wacCapInterestProvision property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWACCapInterestProvision(Boolean value) {
        this.wacCapInterestProvision = value;
    }

    /**
     * Gets the value of the stepUpProvision property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStepUpProvision() {
        return stepUpProvision;
    }

    /**
     * Sets the value of the stepUpProvision property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStepUpProvision(Boolean value) {
        this.stepUpProvision = value;
    }

}
