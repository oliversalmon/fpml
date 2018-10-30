
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PayoutEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PayoutEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Deferred"/>
 *     &lt;enumeration value="Immediate"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PayoutEnum", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
@XmlEnum
public enum PayoutEnum {


    /**
     * If the trigger is hit, the option payout will not be paid now but will be paid on the value date of the original option.
     * 
     */
    @XmlEnumValue("Deferred")
    DEFERRED("Deferred"),

    /**
     * If the trigger is hit, the option payout will be paid immediately (i.e., spot from the payout date).
     * 
     */
    @XmlEnumValue("Immediate")
    IMMEDIATE("Immediate");
    private final String value;

    PayoutEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PayoutEnum fromValue(String v) {
        for (PayoutEnum c: PayoutEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
