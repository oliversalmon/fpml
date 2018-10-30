
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FxTenorPeriodEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FxTenorPeriodEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Broken"/>
 *     &lt;enumeration value="Today"/>
 *     &lt;enumeration value="Tomorrow"/>
 *     &lt;enumeration value="TomorrowNext"/>
 *     &lt;enumeration value="Spot"/>
 *     &lt;enumeration value="SpotNext"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FxTenorPeriodEnum", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
@XmlEnum
public enum FxTenorPeriodEnum {


    /**
     * Broken/non conventional Tenor Period.
     * 
     */
    @XmlEnumValue("Broken")
    BROKEN("Broken"),

    /**
     * Today Tenor Period.
     * 
     */
    @XmlEnumValue("Today")
    TODAY("Today"),

    /**
     * Tomorrow Tenor Period.
     * 
     */
    @XmlEnumValue("Tomorrow")
    TOMORROW("Tomorrow"),

    /**
     * Day after Tomorrow Tenor Period.
     * 
     */
    @XmlEnumValue("TomorrowNext")
    TOMORROW_NEXT("TomorrowNext"),

    /**
     * Spot Tenor Period.
     * 
     */
    @XmlEnumValue("Spot")
    SPOT("Spot"),

    /**
     * Day after Spot Tenor period.
     * 
     */
    @XmlEnumValue("SpotNext")
    SPOT_NEXT("SpotNext");
    private final String value;

    FxTenorPeriodEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FxTenorPeriodEnum fromValue(String v) {
        for (FxTenorPeriodEnum c: FxTenorPeriodEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
