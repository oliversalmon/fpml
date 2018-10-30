
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InterestLegResetDates complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InterestLegResetDates">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="calculationPeriodDatesReference" type="{http://www.fpml.org/FpML-5/recordkeeping}InterestLegCalculationPeriodDatesReference" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="resetRelativeTo" type="{http://www.fpml.org/FpML-5/recordkeeping}ResetRelativeToEnum"/>
 *           &lt;element name="resetFrequency" type="{http://www.fpml.org/FpML-5/recordkeeping}ResetFrequency"/>
 *         &lt;/choice>
 *         &lt;element name="initialFixingDate" type="{http://www.fpml.org/FpML-5/recordkeeping}RelativeDateOffset" minOccurs="0"/>
 *         &lt;element name="fixingDates" type="{http://www.fpml.org/FpML-5/recordkeeping}AdjustableDatesOrRelativeDateOffset" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterestLegResetDates", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "calculationPeriodDatesReference",
    "resetRelativeTo",
    "resetFrequency",
    "initialFixingDate",
    "fixingDates"
})
public class InterestLegResetDates {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected InterestLegCalculationPeriodDatesReference calculationPeriodDatesReference;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "token")
    protected ResetRelativeToEnum resetRelativeTo;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected ResetFrequency resetFrequency;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected RelativeDateOffset initialFixingDate;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected AdjustableDatesOrRelativeDateOffset fixingDates;

    /**
     * Gets the value of the calculationPeriodDatesReference property.
     * 
     * @return
     *     possible object is
     *     {@link InterestLegCalculationPeriodDatesReference }
     *     
     */
    public InterestLegCalculationPeriodDatesReference getCalculationPeriodDatesReference() {
        return calculationPeriodDatesReference;
    }

    /**
     * Sets the value of the calculationPeriodDatesReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestLegCalculationPeriodDatesReference }
     *     
     */
    public void setCalculationPeriodDatesReference(InterestLegCalculationPeriodDatesReference value) {
        this.calculationPeriodDatesReference = value;
    }

    /**
     * Gets the value of the resetRelativeTo property.
     * 
     * @return
     *     possible object is
     *     {@link ResetRelativeToEnum }
     *     
     */
    public ResetRelativeToEnum getResetRelativeTo() {
        return resetRelativeTo;
    }

    /**
     * Sets the value of the resetRelativeTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResetRelativeToEnum }
     *     
     */
    public void setResetRelativeTo(ResetRelativeToEnum value) {
        this.resetRelativeTo = value;
    }

    /**
     * Gets the value of the resetFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link ResetFrequency }
     *     
     */
    public ResetFrequency getResetFrequency() {
        return resetFrequency;
    }

    /**
     * Sets the value of the resetFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResetFrequency }
     *     
     */
    public void setResetFrequency(ResetFrequency value) {
        this.resetFrequency = value;
    }

    /**
     * Gets the value of the initialFixingDate property.
     * 
     * @return
     *     possible object is
     *     {@link RelativeDateOffset }
     *     
     */
    public RelativeDateOffset getInitialFixingDate() {
        return initialFixingDate;
    }

    /**
     * Sets the value of the initialFixingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelativeDateOffset }
     *     
     */
    public void setInitialFixingDate(RelativeDateOffset value) {
        this.initialFixingDate = value;
    }

    /**
     * Gets the value of the fixingDates property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustableDatesOrRelativeDateOffset }
     *     
     */
    public AdjustableDatesOrRelativeDateOffset getFixingDates() {
        return fixingDates;
    }

    /**
     * Sets the value of the fixingDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustableDatesOrRelativeDateOffset }
     *     
     */
    public void setFixingDates(AdjustableDatesOrRelativeDateOffset value) {
        this.fixingDates = value;
    }

}
