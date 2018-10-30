
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FxRegionLowerBoundDirectionEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FxRegionLowerBoundDirectionEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="AtOrAbove"/>
 *     &lt;enumeration value="Above"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FxRegionLowerBoundDirectionEnum", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
@XmlEnum
public enum FxRegionLowerBoundDirectionEnum {

    @XmlEnumValue("AtOrAbove")
    AT_OR_ABOVE("AtOrAbove"),
    @XmlEnumValue("Above")
    ABOVE("Above");
    private final String value;

    FxRegionLowerBoundDirectionEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FxRegionLowerBoundDirectionEnum fromValue(String v) {
        for (FxRegionLowerBoundDirectionEnum c: FxRegionLowerBoundDirectionEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
