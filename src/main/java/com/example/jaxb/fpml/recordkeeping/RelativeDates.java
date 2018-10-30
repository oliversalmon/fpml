
package com.example.jaxb.fpml.recordkeeping;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * A type describing a set of dates defined as relative to another set of dates.
 * 
 * <p>Java class for RelativeDates complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelativeDates">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}RelativeDateOffset">
 *       &lt;sequence>
 *         &lt;element name="periodSkip" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="scheduleBounds" type="{http://www.fpml.org/FpML-5/recordkeeping}DateRange" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelativeDates", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "periodSkip",
    "scheduleBounds"
})
public class RelativeDates
    extends RelativeDateOffset
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger periodSkip;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected DateRange scheduleBounds;

    /**
     * Gets the value of the periodSkip property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPeriodSkip() {
        return periodSkip;
    }

    /**
     * Sets the value of the periodSkip property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPeriodSkip(BigInteger value) {
        this.periodSkip = value;
    }

    /**
     * Gets the value of the scheduleBounds property.
     * 
     * @return
     *     possible object is
     *     {@link DateRange }
     *     
     */
    public DateRange getScheduleBounds() {
        return scheduleBounds;
    }

    /**
     * Sets the value of the scheduleBounds property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateRange }
     *     
     */
    public void setScheduleBounds(DateRange value) {
        this.scheduleBounds = value;
    }

}
