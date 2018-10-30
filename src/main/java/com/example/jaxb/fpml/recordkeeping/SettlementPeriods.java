
package com.example.jaxb.fpml.recordkeeping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Specifies a set of Settlement Periods associated with an Electricity Transaction for delivery on an Applicable Day or for a series of Applicable Days.
 * 
 * <p>Java class for SettlementPeriods complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SettlementPeriods">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="duration" type="{http://www.fpml.org/FpML-5/recordkeeping}SettlementPeriodDurationEnum" minOccurs="0"/>
 *         &lt;element name="applicableDay" type="{http://www.fpml.org/FpML-5/recordkeeping}DayOfWeekExtEnum" maxOccurs="7" minOccurs="0"/>
 *         &lt;sequence minOccurs="0">
 *           &lt;element name="startTime" type="{http://www.fpml.org/FpML-5/recordkeeping}OffsetPrevailingTime"/>
 *           &lt;element name="endTime" type="{http://www.fpml.org/FpML-5/recordkeeping}OffsetPrevailingTime" minOccurs="0"/>
 *           &lt;element name="timeDuration" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="excludeHolidays" type="{http://www.fpml.org/FpML-5/recordkeeping}CommodityBusinessCalendar"/>
 *           &lt;element name="includeHolidays" type="{http://www.fpml.org/FpML-5/recordkeeping}CommodityBusinessCalendar"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementPeriods", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "duration",
    "applicableDay",
    "startTime",
    "endTime",
    "timeDuration",
    "excludeHolidays",
    "includeHolidays"
})
public class SettlementPeriods {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String duration;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "anySimpleType")
    protected List<String> applicableDay;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected OffsetPrevailingTime startTime;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected OffsetPrevailingTime endTime;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar timeDuration;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CommodityBusinessCalendar excludeHolidays;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CommodityBusinessCalendar includeHolidays;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuration(String value) {
        this.duration = value;
    }

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

    /**
     * Gets the value of the timeDuration property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeDuration() {
        return timeDuration;
    }

    /**
     * Sets the value of the timeDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeDuration(XMLGregorianCalendar value) {
        this.timeDuration = value;
    }

    /**
     * Gets the value of the excludeHolidays property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityBusinessCalendar }
     *     
     */
    public CommodityBusinessCalendar getExcludeHolidays() {
        return excludeHolidays;
    }

    /**
     * Sets the value of the excludeHolidays property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityBusinessCalendar }
     *     
     */
    public void setExcludeHolidays(CommodityBusinessCalendar value) {
        this.excludeHolidays = value;
    }

    /**
     * Gets the value of the includeHolidays property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityBusinessCalendar }
     *     
     */
    public CommodityBusinessCalendar getIncludeHolidays() {
        return includeHolidays;
    }

    /**
     * Sets the value of the includeHolidays property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityBusinessCalendar }
     *     
     */
    public void setIncludeHolidays(CommodityBusinessCalendar value) {
        this.includeHolidays = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
