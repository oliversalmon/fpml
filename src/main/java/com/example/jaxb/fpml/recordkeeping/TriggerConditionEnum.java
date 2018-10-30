
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TriggerConditionEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TriggerConditionEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="AtOrAbove"/>
 *     &lt;enumeration value="AtOrBelow"/>
 *     &lt;enumeration value="Above"/>
 *     &lt;enumeration value="Below"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TriggerConditionEnum", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
@XmlEnum
public enum TriggerConditionEnum {


    /**
     * The spot rate must be greater than or equal to the trigger rate.
     * 
     */
    @XmlEnumValue("AtOrAbove")
    AT_OR_ABOVE("AtOrAbove"),

    /**
     * The spot rate must be less than or equal to the trigger rate.
     * 
     */
    @XmlEnumValue("AtOrBelow")
    AT_OR_BELOW("AtOrBelow"),

    /**
     * DEPRECATE: The spot rate must be greater than or equal to the trigger rate.
     * 
     */
    @XmlEnumValue("Above")
    ABOVE("Above"),

    /**
     * DEPRECATE: The spot rate must be less than or equal to the trigger rate.
     * 
     */
    @XmlEnumValue("Below")
    BELOW("Below");
    private final String value;

    TriggerConditionEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TriggerConditionEnum fromValue(String v) {
        for (TriggerConditionEnum c: TriggerConditionEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
