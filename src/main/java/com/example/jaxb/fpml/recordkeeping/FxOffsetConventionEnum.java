
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FxOffsetConventionEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FxOffsetConventionEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="FxSpot"/>
 *     &lt;enumeration value="FxForward"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FxOffsetConventionEnum", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
@XmlEnum
public enum FxOffsetConventionEnum {

    @XmlEnumValue("FxSpot")
    FX_SPOT("FxSpot"),
    @XmlEnumValue("FxForward")
    FX_FORWARD("FxForward");
    private final String value;

    FxOffsetConventionEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FxOffsetConventionEnum fromValue(String v) {
        for (FxOffsetConventionEnum c: FxOffsetConventionEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
