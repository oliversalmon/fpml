
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FxBarrierTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FxBarrierTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Knockin"/>
 *     &lt;enumeration value="Knockout"/>
 *     &lt;enumeration value="ReverseKnockin"/>
 *     &lt;enumeration value="ReverseKnockout"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FxBarrierTypeEnum", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
@XmlEnum
public enum FxBarrierTypeEnum {


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
    KNOCKOUT("Knockout"),

    /**
     * DEPRECATE: Option exists once the barrier is hit. The trigger rate is in-the money in relation to the strike rate.
     * 
     */
    @XmlEnumValue("ReverseKnockin")
    REVERSE_KNOCKIN("ReverseKnockin"),

    /**
     * DEPRECATE: Option ceases to exist once the barrier is hit. The trigger rate is in-the money in relation to the strike rate.
     * 
     */
    @XmlEnumValue("ReverseKnockout")
    REVERSE_KNOCKOUT("ReverseKnockout");
    private final String value;

    FxBarrierTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FxBarrierTypeEnum fromValue(String v) {
        for (FxBarrierTypeEnum c: FxBarrierTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
