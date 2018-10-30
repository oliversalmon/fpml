
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CalendarSourceEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CalendarSourceEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="ListedOption"/>
 *     &lt;enumeration value="Future"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CalendarSourceEnum", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
@XmlEnum
public enum CalendarSourceEnum {


    /**
     * Pricing Dates (based off of listed options dates) in respect of each Calculation Period, the last Commodity Business Day on which the relevant Options Contract is scheduled to trade on the Exchange.
     * 
     */
    @XmlEnumValue("ListedOption")
    LISTED_OPTION("ListedOption"),

    /**
     * Pricing Dates (based off of futures dates) in respect of each Calculation Period, the last Commodity Business Day on which the relevant Futures Contract is scheduled to trade on the Exchange.
     * 
     */
    @XmlEnumValue("Future")
    FUTURE("Future");
    private final String value;

    CalendarSourceEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CalendarSourceEnum fromValue(String v) {
        for (CalendarSourceEnum c: CalendarSourceEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
