
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A type defining a date (referred to as the derived date) as a relative offset from another date (referred to as the anchor date) plus optional date adjustments.
 * 
 * <p>Java class for AdjustedRelativeDateOffset complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdjustedRelativeDateOffset">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}RelativeDateOffset">
 *       &lt;sequence>
 *         &lt;element name="relativeDateAdjustments" type="{http://www.fpml.org/FpML-5/recordkeeping}BusinessDayAdjustments" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdjustedRelativeDateOffset", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "relativeDateAdjustments"
})
public class AdjustedRelativeDateOffset
    extends RelativeDateOffset
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BusinessDayAdjustments relativeDateAdjustments;

    /**
     * Gets the value of the relativeDateAdjustments property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDayAdjustments }
     *     
     */
    public BusinessDayAdjustments getRelativeDateAdjustments() {
        return relativeDateAdjustments;
    }

    /**
     * Sets the value of the relativeDateAdjustments property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDayAdjustments }
     *     
     */
    public void setRelativeDateAdjustments(BusinessDayAdjustments value) {
        this.relativeDateAdjustments = value;
    }

}
