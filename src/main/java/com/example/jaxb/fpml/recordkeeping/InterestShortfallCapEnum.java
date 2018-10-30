
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InterestShortfallCapEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InterestShortfallCapEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Fixed"/>
 *     &lt;enumeration value="Variable"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InterestShortfallCapEnum", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
@XmlEnum
public enum InterestShortfallCapEnum {

    @XmlEnumValue("Fixed")
    FIXED("Fixed"),
    @XmlEnumValue("Variable")
    VARIABLE("Variable");
    private final String value;

    InterestShortfallCapEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InterestShortfallCapEnum fromValue(String v) {
        for (InterestShortfallCapEnum c: InterestShortfallCapEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
