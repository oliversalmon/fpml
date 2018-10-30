
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ProtectionTerms complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProtectionTerms">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="calculationAmount" type="{http://www.fpml.org/FpML-5/recordkeeping}Money"/>
 *         &lt;element name="creditEvents" type="{http://www.fpml.org/FpML-5/recordkeeping}CreditEvents" minOccurs="0"/>
 *         &lt;element name="obligations" type="{http://www.fpml.org/FpML-5/recordkeeping}Obligations" minOccurs="0"/>
 *         &lt;element name="floatingAmountEvents" type="{http://www.fpml.org/FpML-5/recordkeeping}FloatingAmountEvents" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProtectionTerms", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "calculationAmount",
    "creditEvents",
    "obligations",
    "floatingAmountEvents"
})
public class ProtectionTerms {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    protected Money calculationAmount;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CreditEvents creditEvents;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Obligations obligations;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected FloatingAmountEvents floatingAmountEvents;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the calculationAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getCalculationAmount() {
        return calculationAmount;
    }

    /**
     * Sets the value of the calculationAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setCalculationAmount(Money value) {
        this.calculationAmount = value;
    }

    /**
     * Gets the value of the creditEvents property.
     * 
     * @return
     *     possible object is
     *     {@link CreditEvents }
     *     
     */
    public CreditEvents getCreditEvents() {
        return creditEvents;
    }

    /**
     * Sets the value of the creditEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditEvents }
     *     
     */
    public void setCreditEvents(CreditEvents value) {
        this.creditEvents = value;
    }

    /**
     * Gets the value of the obligations property.
     * 
     * @return
     *     possible object is
     *     {@link Obligations }
     *     
     */
    public Obligations getObligations() {
        return obligations;
    }

    /**
     * Sets the value of the obligations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Obligations }
     *     
     */
    public void setObligations(Obligations value) {
        this.obligations = value;
    }

    /**
     * Gets the value of the floatingAmountEvents property.
     * 
     * @return
     *     possible object is
     *     {@link FloatingAmountEvents }
     *     
     */
    public FloatingAmountEvents getFloatingAmountEvents() {
        return floatingAmountEvents;
    }

    /**
     * Sets the value of the floatingAmountEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link FloatingAmountEvents }
     *     
     */
    public void setFloatingAmountEvents(FloatingAmountEvents value) {
        this.floatingAmountEvents = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
