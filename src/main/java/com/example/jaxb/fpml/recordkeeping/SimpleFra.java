
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SimpleFra complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SimpleFra">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}UnderlyingAsset">
 *       &lt;sequence>
 *         &lt;element name="startTerm" type="{http://www.fpml.org/FpML-5/recordkeeping}Period" minOccurs="0"/>
 *         &lt;element name="endTerm" type="{http://www.fpml.org/FpML-5/recordkeeping}Period" minOccurs="0"/>
 *         &lt;element name="dayCountFraction" type="{http://www.fpml.org/FpML-5/recordkeeping}DayCountFraction" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimpleFra", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "startTerm",
    "endTerm",
    "dayCountFraction"
})
public class SimpleFra
    extends UnderlyingAsset
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Period startTerm;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Period endTerm;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected DayCountFraction dayCountFraction;

    /**
     * Gets the value of the startTerm property.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getStartTerm() {
        return startTerm;
    }

    /**
     * Sets the value of the startTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setStartTerm(Period value) {
        this.startTerm = value;
    }

    /**
     * Gets the value of the endTerm property.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getEndTerm() {
        return endTerm;
    }

    /**
     * Sets the value of the endTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setEndTerm(Period value) {
        this.endTerm = value;
    }

    /**
     * Gets the value of the dayCountFraction property.
     * 
     * @return
     *     possible object is
     *     {@link DayCountFraction }
     *     
     */
    public DayCountFraction getDayCountFraction() {
        return dayCountFraction;
    }

    /**
     * Sets the value of the dayCountFraction property.
     * 
     * @param value
     *     allowed object is
     *     {@link DayCountFraction }
     *     
     */
    public void setDayCountFraction(DayCountFraction value) {
        this.dayCountFraction = value;
    }

}
