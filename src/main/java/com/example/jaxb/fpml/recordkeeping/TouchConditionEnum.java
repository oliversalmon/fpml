
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TouchConditionEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TouchConditionEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Touch"/>
 *     &lt;enumeration value="Notouch"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TouchConditionEnum", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
@XmlEnum
public enum TouchConditionEnum {


    /**
     * The spot rate must have touched the predetermined trigger rate at any time over the life of the option for the payout to occur.
     * 
     */
    @XmlEnumValue("Touch")
    TOUCH("Touch"),

    /**
     * The spot rate has not touched the predetermined trigger rate at any time over the life of the option for the payout to occur.
     * 
     */
    @XmlEnumValue("Notouch")
    NOTOUCH("Notouch");
    private final String value;

    TouchConditionEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TouchConditionEnum fromValue(String v) {
        for (TouchConditionEnum c: TouchConditionEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
