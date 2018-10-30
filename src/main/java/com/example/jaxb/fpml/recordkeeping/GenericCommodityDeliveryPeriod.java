
package com.example.jaxb.fpml.recordkeeping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GenericCommodityDeliveryPeriod complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GenericCommodityDeliveryPeriod">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="applicableDay" type="{http://www.fpml.org/FpML-5/recordkeeping}DayOfWeekExtEnum" maxOccurs="7"/>
 *         &lt;sequence minOccurs="0">
 *           &lt;element name="startTime" type="{http://www.fpml.org/FpML-5/recordkeeping}OffsetPrevailingTime"/>
 *           &lt;element name="endTime" type="{http://www.fpml.org/FpML-5/recordkeeping}OffsetPrevailingTime"/>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenericCommodityDeliveryPeriod", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "applicableDay",
    "startTime",
    "endTime"
})
public class GenericCommodityDeliveryPeriod {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected List<String> applicableDay;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected OffsetPrevailingTime startTime;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected OffsetPrevailingTime endTime;

    /**
     * Gets the value of the applicableDay property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicableDay property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicableDay().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getApplicableDay() {
        if (applicableDay == null) {
            applicableDay = new ArrayList<String>();
        }
        return this.applicableDay;
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link OffsetPrevailingTime }
     *     
     */
    public OffsetPrevailingTime getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link OffsetPrevailingTime }
     *     
     */
    public void setStartTime(OffsetPrevailingTime value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link OffsetPrevailingTime }
     *     
     */
    public OffsetPrevailingTime getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link OffsetPrevailingTime }
     *     
     */
    public void setEndTime(OffsetPrevailingTime value) {
        this.endTime = value;
    }

}
