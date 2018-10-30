
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * A type for defining a time with respect to a geographic location, for example 11:00 Phoenix, USA. This type should be used where a wider range of locations than those available as business centres is required.
 * 
 * <p>Java class for PrevailingTime complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrevailingTime">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hourMinuteTime" type="{http://www.fpml.org/FpML-5/recordkeeping}HourMinuteTime" minOccurs="0"/>
 *         &lt;element name="location" type="{http://www.fpml.org/FpML-5/recordkeeping}TimezoneLocation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrevailingTime", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "hourMinuteTime",
    "location"
})
public class PrevailingTime {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar hourMinuteTime;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected TimezoneLocation location;

    /**
     * Gets the value of the hourMinuteTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHourMinuteTime() {
        return hourMinuteTime;
    }

    /**
     * Sets the value of the hourMinuteTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHourMinuteTime(XMLGregorianCalendar value) {
        this.hourMinuteTime = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link TimezoneLocation }
     *     
     */
    public TimezoneLocation getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimezoneLocation }
     *     
     */
    public void setLocation(TimezoneLocation value) {
        this.location = value;
    }

}
