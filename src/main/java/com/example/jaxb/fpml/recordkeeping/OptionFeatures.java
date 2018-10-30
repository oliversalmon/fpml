
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A type for defining option features.
 * 
 * <p>Java class for OptionFeatures complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OptionFeatures">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="asian" type="{http://www.fpml.org/FpML-5/recordkeeping}Asian" minOccurs="0"/>
 *         &lt;element name="barrier" type="{http://www.fpml.org/FpML-5/recordkeeping}Barrier" minOccurs="0"/>
 *         &lt;element name="knock" type="{http://www.fpml.org/FpML-5/recordkeeping}Knock" minOccurs="0"/>
 *         &lt;element name="passThrough" type="{http://www.fpml.org/FpML-5/recordkeeping}PassThrough" minOccurs="0"/>
 *         &lt;element name="dividendAdjustment" type="{http://www.fpml.org/FpML-5/recordkeeping}DividendAdjustment" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OptionFeatures", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "asian",
    "barrier",
    "knock",
    "passThrough",
    "dividendAdjustment"
})
public class OptionFeatures {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Asian asian;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Barrier barrier;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Knock knock;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected PassThrough passThrough;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected DividendAdjustment dividendAdjustment;

    /**
     * Gets the value of the asian property.
     * 
     * @return
     *     possible object is
     *     {@link Asian }
     *     
     */
    public Asian getAsian() {
        return asian;
    }

    /**
     * Sets the value of the asian property.
     * 
     * @param value
     *     allowed object is
     *     {@link Asian }
     *     
     */
    public void setAsian(Asian value) {
        this.asian = value;
    }

    /**
     * Gets the value of the barrier property.
     * 
     * @return
     *     possible object is
     *     {@link Barrier }
     *     
     */
    public Barrier getBarrier() {
        return barrier;
    }

    /**
     * Sets the value of the barrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Barrier }
     *     
     */
    public void setBarrier(Barrier value) {
        this.barrier = value;
    }

    /**
     * Gets the value of the knock property.
     * 
     * @return
     *     possible object is
     *     {@link Knock }
     *     
     */
    public Knock getKnock() {
        return knock;
    }

    /**
     * Sets the value of the knock property.
     * 
     * @param value
     *     allowed object is
     *     {@link Knock }
     *     
     */
    public void setKnock(Knock value) {
        this.knock = value;
    }

    /**
     * Gets the value of the passThrough property.
     * 
     * @return
     *     possible object is
     *     {@link PassThrough }
     *     
     */
    public PassThrough getPassThrough() {
        return passThrough;
    }

    /**
     * Sets the value of the passThrough property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassThrough }
     *     
     */
    public void setPassThrough(PassThrough value) {
        this.passThrough = value;
    }

    /**
     * Gets the value of the dividendAdjustment property.
     * 
     * @return
     *     possible object is
     *     {@link DividendAdjustment }
     *     
     */
    public DividendAdjustment getDividendAdjustment() {
        return dividendAdjustment;
    }

    /**
     * Sets the value of the dividendAdjustment property.
     * 
     * @param value
     *     allowed object is
     *     {@link DividendAdjustment }
     *     
     */
    public void setDividendAdjustment(DividendAdjustment value) {
        this.dividendAdjustment = value;
    }

}
