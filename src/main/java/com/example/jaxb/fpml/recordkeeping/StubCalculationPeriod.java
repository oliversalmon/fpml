
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A type describing the Stub Calculation Period.
 * 
 * <p>Java class for StubCalculationPeriod complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StubCalculationPeriod">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;sequence>
 *           &lt;element name="initialStub" type="{http://www.fpml.org/FpML-5/recordkeeping}Stub" minOccurs="0"/>
 *           &lt;element name="finalStub" type="{http://www.fpml.org/FpML-5/recordkeeping}Stub" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StubCalculationPeriod", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "initialStub",
    "finalStub"
})
public class StubCalculationPeriod {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Stub initialStub;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Stub finalStub;

    /**
     * Gets the value of the initialStub property.
     * 
     * @return
     *     possible object is
     *     {@link Stub }
     *     
     */
    public Stub getInitialStub() {
        return initialStub;
    }

    /**
     * Sets the value of the initialStub property.
     * 
     * @param value
     *     allowed object is
     *     {@link Stub }
     *     
     */
    public void setInitialStub(Stub value) {
        this.initialStub = value;
    }

    /**
     * Gets the value of the finalStub property.
     * 
     * @return
     *     possible object is
     *     {@link Stub }
     *     
     */
    public Stub getFinalStub() {
        return finalStub;
    }

    /**
     * Sets the value of the finalStub property.
     * 
     * @param value
     *     allowed object is
     *     {@link Stub }
     *     
     */
    public void setFinalStub(Stub value) {
        this.finalStub = value;
    }

}
