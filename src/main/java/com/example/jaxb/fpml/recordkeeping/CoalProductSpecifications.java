
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The different options for specifying the quality attributes of the coal to be delivered.
 * 
 * <p>Java class for CoalProductSpecifications complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CoalProductSpecifications">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="standardQuality" type="{http://www.fpml.org/FpML-5/recordkeeping}CoalStandardQuality"/>
 *         &lt;element name="standardQualitySchedule" type="{http://www.fpml.org/FpML-5/recordkeeping}CoalStandardQualitySchedule"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoalProductSpecifications", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "standardQuality",
    "standardQualitySchedule"
})
public class CoalProductSpecifications {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CoalStandardQuality standardQuality;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CoalStandardQualitySchedule standardQualitySchedule;

    /**
     * Gets the value of the standardQuality property.
     * 
     * @return
     *     possible object is
     *     {@link CoalStandardQuality }
     *     
     */
    public CoalStandardQuality getStandardQuality() {
        return standardQuality;
    }

    /**
     * Sets the value of the standardQuality property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoalStandardQuality }
     *     
     */
    public void setStandardQuality(CoalStandardQuality value) {
        this.standardQuality = value;
    }

    /**
     * Gets the value of the standardQualitySchedule property.
     * 
     * @return
     *     possible object is
     *     {@link CoalStandardQualitySchedule }
     *     
     */
    public CoalStandardQualitySchedule getStandardQualitySchedule() {
        return standardQualitySchedule;
    }

    /**
     * Sets the value of the standardQualitySchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoalStandardQualitySchedule }
     *     
     */
    public void setStandardQualitySchedule(CoalStandardQualitySchedule value) {
        this.standardQualitySchedule = value;
    }

}
