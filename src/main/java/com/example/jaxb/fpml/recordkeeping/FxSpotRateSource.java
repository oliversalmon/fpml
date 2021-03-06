
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A type defining the rate source and fixing time for an fx rate.
 * 
 * <p>Java class for FxSpotRateSource complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FxSpotRateSource">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="primaryRateSource" type="{http://www.fpml.org/FpML-5/recordkeeping}InformationSource"/>
 *         &lt;element name="secondaryRateSource" type="{http://www.fpml.org/FpML-5/recordkeeping}InformationSource" minOccurs="0"/>
 *         &lt;element name="fixingTime" type="{http://www.fpml.org/FpML-5/recordkeeping}BusinessCenterTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FxSpotRateSource", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "primaryRateSource",
    "secondaryRateSource",
    "fixingTime"
})
public class FxSpotRateSource {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    protected InformationSource primaryRateSource;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected InformationSource secondaryRateSource;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BusinessCenterTime fixingTime;

    /**
     * Gets the value of the primaryRateSource property.
     * 
     * @return
     *     possible object is
     *     {@link InformationSource }
     *     
     */
    public InformationSource getPrimaryRateSource() {
        return primaryRateSource;
    }

    /**
     * Sets the value of the primaryRateSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformationSource }
     *     
     */
    public void setPrimaryRateSource(InformationSource value) {
        this.primaryRateSource = value;
    }

    /**
     * Gets the value of the secondaryRateSource property.
     * 
     * @return
     *     possible object is
     *     {@link InformationSource }
     *     
     */
    public InformationSource getSecondaryRateSource() {
        return secondaryRateSource;
    }

    /**
     * Sets the value of the secondaryRateSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformationSource }
     *     
     */
    public void setSecondaryRateSource(InformationSource value) {
        this.secondaryRateSource = value;
    }

    /**
     * Gets the value of the fixingTime property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessCenterTime }
     *     
     */
    public BusinessCenterTime getFixingTime() {
        return fixingTime;
    }

    /**
     * Sets the value of the fixingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessCenterTime }
     *     
     */
    public void setFixingTime(BusinessCenterTime value) {
        this.fixingTime = value;
    }

}
