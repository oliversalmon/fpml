
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A type for defining the multiple exercise provisions of an American style commodity option.
 * 
 * <p>Java class for CommodityMultipleExercise complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommodityMultipleExercise">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="integralMultipleQuantity" type="{http://www.fpml.org/FpML-5/recordkeeping}CommodityNotionalQuantity" minOccurs="0"/>
 *         &lt;element name="minimumNotionalQuantity" type="{http://www.fpml.org/FpML-5/recordkeeping}CommodityNotionalQuantity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommodityMultipleExercise", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "integralMultipleQuantity",
    "minimumNotionalQuantity"
})
public class CommodityMultipleExercise {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CommodityNotionalQuantity integralMultipleQuantity;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CommodityNotionalQuantity minimumNotionalQuantity;

    /**
     * Gets the value of the integralMultipleQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityNotionalQuantity }
     *     
     */
    public CommodityNotionalQuantity getIntegralMultipleQuantity() {
        return integralMultipleQuantity;
    }

    /**
     * Sets the value of the integralMultipleQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityNotionalQuantity }
     *     
     */
    public void setIntegralMultipleQuantity(CommodityNotionalQuantity value) {
        this.integralMultipleQuantity = value;
    }

    /**
     * Gets the value of the minimumNotionalQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityNotionalQuantity }
     *     
     */
    public CommodityNotionalQuantity getMinimumNotionalQuantity() {
        return minimumNotionalQuantity;
    }

    /**
     * Sets the value of the minimumNotionalQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityNotionalQuantity }
     *     
     */
    public void setMinimumNotionalQuantity(CommodityNotionalQuantity value) {
        this.minimumNotionalQuantity = value;
    }

}
