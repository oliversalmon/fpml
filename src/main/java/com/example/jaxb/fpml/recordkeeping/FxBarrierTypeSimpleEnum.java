
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FxBarrierTypeSimpleEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FxBarrierTypeSimpleEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Knockin"/>
 *     &lt;enumeration value="Knockout"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FxBarrierTypeSimpleEnum", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
@XmlEnum
public enum FxBarrierTypeSimpleEnum {


    /**
     * The option exists if the spot rate is at or above, or at or below the barrier level according to the specified barrier direction.
     * 
     */
    @XmlEnumValue("Knockin")
    KNOCKIN("Knockin"),

    /**
     * The option ceases to exist if the spot rate is at or above, or at or below the barrier level according to the specified barrier direction.
     * 
     */
    @XmlEnumValue("Knockout")
    KNOCKOUT("Knockout");
    private final String value;

    FxBarrierTypeSimpleEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FxBarrierTypeSimpleEnum fromValue(String v) {
        for (FxBarrierTypeSimpleEnum c: FxBarrierTypeSimpleEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
