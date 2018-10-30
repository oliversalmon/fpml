
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InterpolationPeriodEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InterpolationPeriodEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Initial"/>
 *     &lt;enumeration value="InitialAndFinal"/>
 *     &lt;enumeration value="Final"/>
 *     &lt;enumeration value="AnyPeriod"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InterpolationPeriodEnum", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
@XmlEnum
public enum InterpolationPeriodEnum {


    /**
     * Interpolation is applicable to the initial period only.
     * 
     */
    @XmlEnumValue("Initial")
    INITIAL("Initial"),

    /**
     * Interpolation is applicable to the initial and final periods only.
     * 
     */
    @XmlEnumValue("InitialAndFinal")
    INITIAL_AND_FINAL("InitialAndFinal"),

    /**
     * Interpolation is applicable to the final period only.
     * 
     */
    @XmlEnumValue("Final")
    FINAL("Final"),

    /**
     * Interpolation is applicable to any non-standard period.
     * 
     */
    @XmlEnumValue("AnyPeriod")
    ANY_PERIOD("AnyPeriod");
    private final String value;

    InterpolationPeriodEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InterpolationPeriodEnum fromValue(String v) {
        for (InterpolationPeriodEnum c: InterpolationPeriodEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
