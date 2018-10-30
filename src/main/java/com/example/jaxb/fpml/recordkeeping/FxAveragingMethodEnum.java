
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FxAveragingMethodEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FxAveragingMethodEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Arithmetic"/>
 *     &lt;enumeration value="Harmonic"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FxAveragingMethodEnum", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
@XmlEnum
public enum FxAveragingMethodEnum {


    /**
     * Arithmetic method of average calculation.
     * 
     */
    @XmlEnumValue("Arithmetic")
    ARITHMETIC("Arithmetic"),

    /**
     * Harmonic method of average calculation.
     * 
     */
    @XmlEnumValue("Harmonic")
    HARMONIC("Harmonic");
    private final String value;

    FxAveragingMethodEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FxAveragingMethodEnum fromValue(String v) {
        for (FxAveragingMethodEnum c: FxAveragingMethodEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
