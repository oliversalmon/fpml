
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotionalChangeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NotionalChangeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Increase"/>
 *     &lt;enumeration value="Decrease"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NotionalChangeEnum", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
@XmlEnum
public enum NotionalChangeEnum {


    /**
     * Transaction results in a Increase of Notional value
     * 
     */
    @XmlEnumValue("Increase")
    INCREASE("Increase"),

    /**
     * Transaction results in a Decrease of Notional value
     * 
     */
    @XmlEnumValue("Decrease")
    DECREASE("Decrease");
    private final String value;

    NotionalChangeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NotionalChangeEnum fromValue(String v) {
        for (NotionalChangeEnum c: NotionalChangeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
