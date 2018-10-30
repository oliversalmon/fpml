
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WeatherSettlementLevelEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WeatherSettlementLevelEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Cumulative"/>
 *     &lt;enumeration value="Average"/>
 *     &lt;enumeration value="Mximum"/>
 *     &lt;enumeration value="Minimum"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WeatherSettlementLevelEnum", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
@XmlEnum
public enum WeatherSettlementLevelEnum {


    /**
     * The cumulative number of Weather Index Units for each day in the Calculation Period.
     * 
     */
    @XmlEnumValue("Cumulative")
    CUMULATIVE("Cumulative"),

    /**
     * The cumulative number of Weather Index Units for each day in the Calculation Period divided by the number of days in the Calculation Period.
     * 
     */
    @XmlEnumValue("Average")
    AVERAGE("Average"),

    /**
     * The maximum number of Weather Index Units for any day in the Calculation Period.
     * 
     */
    @XmlEnumValue("Mximum")
    MXIMUM("Mximum"),

    /**
     * The minimum number of Weather Index Units for any day in the Calculation Period.
     * 
     */
    @XmlEnumValue("Minimum")
    MINIMUM("Minimum");
    private final String value;

    WeatherSettlementLevelEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WeatherSettlementLevelEnum fromValue(String v) {
        for (WeatherSettlementLevelEnum c: WeatherSettlementLevelEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
