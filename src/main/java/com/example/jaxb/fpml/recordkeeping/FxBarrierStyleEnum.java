
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FxBarrierStyleEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FxBarrierStyleEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="American"/>
 *     &lt;enumeration value="European"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FxBarrierStyleEnum", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
@XmlEnum
public enum FxBarrierStyleEnum {


    /**
     * The barrier is observed continuously through the observation period.
     * 
     */
    @XmlEnumValue("American")
    AMERICAN("American"),

    /**
     * The barrier is observed on a discrete expiry date, or (in the case of a multi-phase product) series of expiry dates.
     * 
     */
    @XmlEnumValue("European")
    EUROPEAN("European");
    private final String value;

    FxBarrierStyleEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FxBarrierStyleEnum fromValue(String v) {
        for (FxBarrierStyleEnum c: FxBarrierStyleEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
