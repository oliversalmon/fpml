
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A curve used to model a set of zero-coupon interest rates.
 * 
 * <p>Java class for ZeroRateCurve complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZeroRateCurve">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="compoundingFrequency" type="{http://www.fpml.org/FpML-5/recordkeeping}CompoundingFrequency" minOccurs="0"/>
 *         &lt;element name="rateCurve" type="{http://www.fpml.org/FpML-5/recordkeeping}TermCurve" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZeroRateCurve", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "compoundingFrequency",
    "rateCurve"
})
public class ZeroRateCurve {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CompoundingFrequency compoundingFrequency;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected TermCurve rateCurve;

    /**
     * Gets the value of the compoundingFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link CompoundingFrequency }
     *     
     */
    public CompoundingFrequency getCompoundingFrequency() {
        return compoundingFrequency;
    }

    /**
     * Sets the value of the compoundingFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompoundingFrequency }
     *     
     */
    public void setCompoundingFrequency(CompoundingFrequency value) {
        this.compoundingFrequency = value;
    }

    /**
     * Gets the value of the rateCurve property.
     * 
     * @return
     *     possible object is
     *     {@link TermCurve }
     *     
     */
    public TermCurve getRateCurve() {
        return rateCurve;
    }

    /**
     * Sets the value of the rateCurve property.
     * 
     * @param value
     *     allowed object is
     *     {@link TermCurve }
     *     
     */
    public void setRateCurve(TermCurve value) {
        this.rateCurve = value;
    }

}
