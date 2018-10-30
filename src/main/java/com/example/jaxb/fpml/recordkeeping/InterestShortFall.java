
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InterestShortFall complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InterestShortFall">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="interestShortfallCap" type="{http://www.fpml.org/FpML-5/recordkeeping}InterestShortfallCapEnum" minOccurs="0"/>
 *         &lt;element name="compounding" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="rateSource" type="{http://www.fpml.org/FpML-5/recordkeeping}FloatingRateIndex" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterestShortFall", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "interestShortfallCap",
    "compounding",
    "rateSource"
})
public class InterestShortFall {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "token")
    protected InterestShortfallCapEnum interestShortfallCap;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean compounding;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected FloatingRateIndex rateSource;

    /**
     * Gets the value of the interestShortfallCap property.
     * 
     * @return
     *     possible object is
     *     {@link InterestShortfallCapEnum }
     *     
     */
    public InterestShortfallCapEnum getInterestShortfallCap() {
        return interestShortfallCap;
    }

    /**
     * Sets the value of the interestShortfallCap property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestShortfallCapEnum }
     *     
     */
    public void setInterestShortfallCap(InterestShortfallCapEnum value) {
        this.interestShortfallCap = value;
    }

    /**
     * Gets the value of the compounding property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCompounding() {
        return compounding;
    }

    /**
     * Sets the value of the compounding property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCompounding(Boolean value) {
        this.compounding = value;
    }

    /**
     * Gets the value of the rateSource property.
     * 
     * @return
     *     possible object is
     *     {@link FloatingRateIndex }
     *     
     */
    public FloatingRateIndex getRateSource() {
        return rateSource;
    }

    /**
     * Sets the value of the rateSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link FloatingRateIndex }
     *     
     */
    public void setRateSource(FloatingRateIndex value) {
        this.rateSource = value;
    }

}
