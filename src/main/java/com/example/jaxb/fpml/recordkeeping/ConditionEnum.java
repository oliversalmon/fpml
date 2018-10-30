
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConditionEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConditionEnum">
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
@XmlType(name = "ConditionEnum", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
@XmlEnum
public enum ConditionEnum {


    /**
     * The event rate must be greater than or equal to the specified trigger rate.
     * 
     */
    @XmlEnumValue("AtOrAbove")
    AT_OR_ABOVE("AtOrAbove"),

    /**
     * The event rate must be less than or equal to the specified trigger rate.
     * 
     */
    @XmlEnumValue("AtOrBelow")
    AT_OR_BELOW("AtOrBelow"),

    /**
     * The event rate must be greater than the specified trigger rate.
     * 
     */
    @XmlEnumValue("Above")
    ABOVE("Above"),

    /**
     * The event rate must be less than the specified trigger rate.
     * 
     */
    @XmlEnumValue("Below")
    BELOW("Below");
    private final String value;

    ConditionEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConditionEnum fromValue(String v) {
        for (ConditionEnum c: ConditionEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
