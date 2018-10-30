
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A type for definining equity option simple strike or calendar spread strategy features.
 * 
 * <p>Java class for StrategyFeature complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StrategyFeature">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="strikeSpread" type="{http://www.fpml.org/FpML-5/recordkeeping}StrikeSpread"/>
 *         &lt;element name="calendarSpread" type="{http://www.fpml.org/FpML-5/recordkeeping}CalendarSpread"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StrategyFeature", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "strikeSpread",
    "calendarSpread"
})
public class StrategyFeature {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected StrikeSpread strikeSpread;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CalendarSpread calendarSpread;

    /**
     * Gets the value of the strikeSpread property.
     * 
     * @return
     *     possible object is
     *     {@link StrikeSpread }
     *     
     */
    public StrikeSpread getStrikeSpread() {
        return strikeSpread;
    }

    /**
     * Sets the value of the strikeSpread property.
     * 
     * @param value
     *     allowed object is
     *     {@link StrikeSpread }
     *     
     */
    public void setStrikeSpread(StrikeSpread value) {
        this.strikeSpread = value;
    }

    /**
     * Gets the value of the calendarSpread property.
     * 
     * @return
     *     possible object is
     *     {@link CalendarSpread }
     *     
     */
    public CalendarSpread getCalendarSpread() {
        return calendarSpread;
    }

    /**
     * Sets the value of the calendarSpread property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarSpread }
     *     
     */
    public void setCalendarSpread(CalendarSpread value) {
        this.calendarSpread = value;
    }

}
