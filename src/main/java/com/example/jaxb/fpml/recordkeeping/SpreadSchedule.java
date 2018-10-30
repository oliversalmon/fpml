
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Adds an optional spread type element to the Schedule to identify a long or short spread value.
 * 
 * <p>Java class for SpreadSchedule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpreadSchedule">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}Schedule">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://www.fpml.org/FpML-5/recordkeeping}SpreadScheduleType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpreadSchedule", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "type"
})
public class SpreadSchedule
    extends Schedule
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected SpreadScheduleType type;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link SpreadScheduleType }
     *     
     */
    public SpreadScheduleType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpreadScheduleType }
     *     
     */
    public void setType(SpreadScheduleType value) {
        this.type = value;
    }

}
