
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FxBarrierScopeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FxBarrierScopeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Global"/>
 *     &lt;enumeration value="PerExpiry"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FxBarrierScopeEnum", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
@XmlEnum
public enum FxBarrierScopeEnum {


    /**
     * The barrier has effect for the expiry period in which it is triggered, and all subsequent periods.
     * 
     */
    @XmlEnumValue("Global")
    GLOBAL("Global"),

    /**
     * The barrier has effect only for the expiry period in which it is triggered.
     * 
     */
    @XmlEnumValue("PerExpiry")
    PER_EXPIRY("PerExpiry");
    private final String value;

    FxBarrierScopeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FxBarrierScopeEnum fromValue(String v) {
        for (FxBarrierScopeEnum c: FxBarrierScopeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
