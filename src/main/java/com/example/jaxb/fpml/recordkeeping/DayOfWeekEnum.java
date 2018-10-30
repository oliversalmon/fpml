
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DayOfWeekEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DayOfWeekEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="MON"/>
 *     &lt;enumeration value="TUE"/>
 *     &lt;enumeration value="WED"/>
 *     &lt;enumeration value="THU"/>
 *     &lt;enumeration value="FRI"/>
 *     &lt;enumeration value="SAT"/>
 *     &lt;enumeration value="SUN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DayOfWeekEnum", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
@XmlEnum
public enum DayOfWeekEnum {


    /**
     * Monday
     * 
     */
    MON,

    /**
     * Tuesday
     * 
     */
    TUE,

    /**
     * Wednesday
     * 
     */
    WED,

    /**
     * Thursday
     * 
     */
    THU,

    /**
     * Friday
     * 
     */
    FRI,

    /**
     * Saturday
     * 
     */
    SAT,

    /**
     * Sunday
     * 
     */
    SUN;

    public String value() {
        return name();
    }

    public static DayOfWeekEnum fromValue(String v) {
        return valueOf(v);
    }

}
