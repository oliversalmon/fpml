
package com.example.jaxb.fpml.recordkeeping;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * A Disruption Fallback with the sequence in which it should be applied relative to other Disruption Fallbacks.
 * 
 * <p>Java class for SequencedDisruptionFallback complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SequencedDisruptionFallback">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fallback" type="{http://www.fpml.org/FpML-5/recordkeeping}DisruptionFallback" minOccurs="0"/>
 *         &lt;element name="sequence" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SequencedDisruptionFallback", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "fallback",
    "sequence"
})
public class SequencedDisruptionFallback {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected DisruptionFallback fallback;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger sequence;

    /**
     * Gets the value of the fallback property.
     * 
     * @return
     *     possible object is
     *     {@link DisruptionFallback }
     *     
     */
    public DisruptionFallback getFallback() {
        return fallback;
    }

    /**
     * Sets the value of the fallback property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisruptionFallback }
     *     
     */
    public void setFallback(DisruptionFallback value) {
        this.fallback = value;
    }

    /**
     * Gets the value of the sequence property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSequence(BigInteger value) {
        this.sequence = value;
    }

}
