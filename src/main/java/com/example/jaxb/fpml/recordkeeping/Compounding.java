
package com.example.jaxb.fpml.recordkeeping;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Specifies the compounding method and the compounding rate.
 * 
 * <p>Java class for Compounding complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Compounding">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="compoundingMethod" type="{http://www.fpml.org/FpML-5/recordkeeping}CompoundingMethodEnum" minOccurs="0"/>
 *         &lt;element name="compoundingRate" type="{http://www.fpml.org/FpML-5/recordkeeping}CompoundingRate" minOccurs="0"/>
 *         &lt;element name="compoundingSpread" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="compoundingDates" type="{http://www.fpml.org/FpML-5/recordkeeping}AdjustableRelativeOrPeriodicDates2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Compounding", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "compoundingMethod",
    "compoundingRate",
    "compoundingSpread",
    "compoundingDates"
})
public class Compounding {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "token")
    protected CompoundingMethodEnum compoundingMethod;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CompoundingRate compoundingRate;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BigDecimal compoundingSpread;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected AdjustableRelativeOrPeriodicDates2 compoundingDates;

    /**
     * Gets the value of the compoundingMethod property.
     * 
     * @return
     *     possible object is
     *     {@link CompoundingMethodEnum }
     *     
     */
    public CompoundingMethodEnum getCompoundingMethod() {
        return compoundingMethod;
    }

    /**
     * Sets the value of the compoundingMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompoundingMethodEnum }
     *     
     */
    public void setCompoundingMethod(CompoundingMethodEnum value) {
        this.compoundingMethod = value;
    }

    /**
     * Gets the value of the compoundingRate property.
     * 
     * @return
     *     possible object is
     *     {@link CompoundingRate }
     *     
     */
    public CompoundingRate getCompoundingRate() {
        return compoundingRate;
    }

    /**
     * Sets the value of the compoundingRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompoundingRate }
     *     
     */
    public void setCompoundingRate(CompoundingRate value) {
        this.compoundingRate = value;
    }

    /**
     * Gets the value of the compoundingSpread property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCompoundingSpread() {
        return compoundingSpread;
    }

    /**
     * Sets the value of the compoundingSpread property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCompoundingSpread(BigDecimal value) {
        this.compoundingSpread = value;
    }

    /**
     * Gets the value of the compoundingDates property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustableRelativeOrPeriodicDates2 }
     *     
     */
    public AdjustableRelativeOrPeriodicDates2 getCompoundingDates() {
        return compoundingDates;
    }

    /**
     * Sets the value of the compoundingDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustableRelativeOrPeriodicDates2 }
     *     
     */
    public void setCompoundingDates(AdjustableRelativeOrPeriodicDates2 value) {
        this.compoundingDates = value;
    }

}
