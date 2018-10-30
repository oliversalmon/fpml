
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoundingDirectionEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RoundingDirectionEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Up"/>
 *     &lt;enumeration value="Down"/>
 *     &lt;enumeration value="Nearest"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RoundingDirectionEnum", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
@XmlEnum
public enum RoundingDirectionEnum {


    /**
     * A fractional number will be rounded up to the specified number of decimal places (the precision). For example, 5.21 and 5.25 rounded up to 1 decimal place are 5.3 and 5.3 respectively.
     * 
     */
    @XmlEnumValue("Up")
    UP("Up"),

    /**
     * A fractional number will be rounded down to the specified number of decimal places (the precision). For example, 5.29 and 5.25 rounded down to 1 decimal place are 5.2 and 5.2 respectively.
     * 
     */
    @XmlEnumValue("Down")
    DOWN("Down"),

    /**
     * A fractional number will be rounded either up or down to the specified number of decimal places (the precision) depending on its value. For example, 5.24 would be rounded down to 5.2 and 5.25 would be rounded up to 5.3 if a precision of 1 decimal place were specified.
     * 
     */
    @XmlEnumValue("Nearest")
    NEAREST("Nearest");
    private final String value;

    RoundingDirectionEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RoundingDirectionEnum fromValue(String v) {
        for (RoundingDirectionEnum c: RoundingDirectionEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
