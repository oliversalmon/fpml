
package com.example.jaxb.fpml.recordkeeping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Period over which an average value is taken.
 * 
 * <p>Java class for AveragingPeriod complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AveragingPeriod">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="schedule" type="{http://www.fpml.org/FpML-5/recordkeeping}AveragingSchedule" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="averagingDateTimes" type="{http://www.fpml.org/FpML-5/recordkeeping}DateTimeList"/>
 *           &lt;element name="averagingObservations" type="{http://www.fpml.org/FpML-5/recordkeeping}AveragingObservationList"/>
 *         &lt;/choice>
 *         &lt;element name="marketDisruption" type="{http://www.fpml.org/FpML-5/recordkeeping}MarketDisruption" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AveragingPeriod", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "schedule",
    "averagingDateTimes",
    "averagingObservations",
    "marketDisruption"
})
public class AveragingPeriod {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<AveragingSchedule> schedule;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected DateTimeList averagingDateTimes;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected AveragingObservationList averagingObservations;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected MarketDisruption marketDisruption;

    /**
     * Gets the value of the schedule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the schedule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSchedule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AveragingSchedule }
     * 
     * 
     */
    public List<AveragingSchedule> getSchedule() {
        if (schedule == null) {
            schedule = new ArrayList<AveragingSchedule>();
        }
        return this.schedule;
    }

    /**
     * Gets the value of the averagingDateTimes property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeList }
     *     
     */
    public DateTimeList getAveragingDateTimes() {
        return averagingDateTimes;
    }

    /**
     * Sets the value of the averagingDateTimes property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeList }
     *     
     */
    public void setAveragingDateTimes(DateTimeList value) {
        this.averagingDateTimes = value;
    }

    /**
     * Gets the value of the averagingObservations property.
     * 
     * @return
     *     possible object is
     *     {@link AveragingObservationList }
     *     
     */
    public AveragingObservationList getAveragingObservations() {
        return averagingObservations;
    }

    /**
     * Sets the value of the averagingObservations property.
     * 
     * @param value
     *     allowed object is
     *     {@link AveragingObservationList }
     *     
     */
    public void setAveragingObservations(AveragingObservationList value) {
        this.averagingObservations = value;
    }

    /**
     * Gets the value of the marketDisruption property.
     * 
     * @return
     *     possible object is
     *     {@link MarketDisruption }
     *     
     */
    public MarketDisruption getMarketDisruption() {
        return marketDisruption;
    }

    /**
     * Sets the value of the marketDisruption property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketDisruption }
     *     
     */
    public void setMarketDisruption(MarketDisruption value) {
        this.marketDisruption = value;
    }

}
