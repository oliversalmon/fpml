
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FxRegionUpperBoundDirectionEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FxRegionUpperBoundDirectionEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="AtOrBelow"/>
 *     &lt;enumeration value="Below"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FxRegionUpperBoundDirectionEnum", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
@XmlEnum
public enum FxRegionUpperBoundDirectionEnum {

    @XmlEnumValue("AtOrBelow")
    AT_OR_BELOW("AtOrBelow"),
    @XmlEnumValue("Below")
    BELOW("Below");
    private final String value;

    FxRegionUpperBoundDirectionEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FxRegionUpperBoundDirectionEnum fromValue(String v) {
        for (FxRegionUpperBoundDirectionEnum c: FxRegionUpperBoundDirectionEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
