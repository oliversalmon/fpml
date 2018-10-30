
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TriggerTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TriggerTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="EqualOrLess"/>
 *     &lt;enumeration value="EqualOrGreater"/>
 *     &lt;enumeration value="Equal"/>
 *     &lt;enumeration value="Less"/>
 *     &lt;enumeration value="Greater"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TriggerTypeEnum", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
@XmlEnum
public enum TriggerTypeEnum {


    /**
     * The underlyer price must be equal to or less than the Trigger level.
     * 
     */
    @XmlEnumValue("EqualOrLess")
    EQUAL_OR_LESS("EqualOrLess"),

    /**
     * The underlyer price must be equal to or greater than the Trigger level.
     * 
     */
    @XmlEnumValue("EqualOrGreater")
    EQUAL_OR_GREATER("EqualOrGreater"),

    /**
     * The underlyer price must be equal to the Trigger level.
     * 
     */
    @XmlEnumValue("Equal")
    EQUAL("Equal"),

    /**
     * The underlyer price must be less than the Trigger level.
     * 
     */
    @XmlEnumValue("Less")
    LESS("Less"),

    /**
     * The underlyer price must be greater than the Trigger level.
     * 
     */
    @XmlEnumValue("Greater")
    GREATER("Greater");
    private final String value;

    TriggerTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TriggerTypeEnum fromValue(String v) {
        for (TriggerTypeEnum c: TriggerTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
