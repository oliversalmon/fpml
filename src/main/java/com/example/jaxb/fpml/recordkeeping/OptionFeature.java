
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A type for defining option features.
 * 
 * <p>Java class for OptionFeature complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OptionFeature">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}OptionBaseFeature.model"/>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}OptionFeature.model"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OptionFeature", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "fxFeature",
    "strategyFeature",
    "asian",
    "barrier",
    "knock",
    "passThrough"
})
public class OptionFeature {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected FxFeature fxFeature;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected StrategyFeature strategyFeature;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Asian asian;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Barrier barrier;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Knock knock;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected PassThrough passThrough;

    /**
     * Gets the value of the fxFeature property.
     * 
     * @return
     *     possible object is
     *     {@link FxFeature }
     *     
     */
    public FxFeature getFxFeature() {
        return fxFeature;
    }

    /**
     * Sets the value of the fxFeature property.
     * 
     * @param value
     *     allowed object is
     *     {@link FxFeature }
     *     
     */
    public void setFxFeature(FxFeature value) {
        this.fxFeature = value;
    }

    /**
     * Gets the value of the strategyFeature property.
     * 
     * @return
     *     possible object is
     *     {@link StrategyFeature }
     *     
     */
    public StrategyFeature getStrategyFeature() {
        return strategyFeature;
    }

    /**
     * Sets the value of the strategyFeature property.
     * 
     * @param value
     *     allowed object is
     *     {@link StrategyFeature }
     *     
     */
    public void setStrategyFeature(StrategyFeature value) {
        this.strategyFeature = value;
    }

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

}
