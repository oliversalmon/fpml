
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExerciseTimingEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExerciseTimingEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Immediate"/>
 *     &lt;enumeration value="OnExpiration"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ExerciseTimingEnum", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
@XmlEnum
public enum ExerciseTimingEnum {


    /**
     * Perform the requested exercise behavior immediately on receipt of the request.
     * 
     */
    @XmlEnumValue("Immediate")
    IMMEDIATE("Immediate"),

    /**
     * Perform the requested exercise behavior at the expiration of the option.
     * 
     */
    @XmlEnumValue("OnExpiration")
    ON_EXPIRATION("OnExpiration");
    private final String value;

    ExerciseTimingEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExerciseTimingEnum fromValue(String v) {
        for (ExerciseTimingEnum c: ExerciseTimingEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
