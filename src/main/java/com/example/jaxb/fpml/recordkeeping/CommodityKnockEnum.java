
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommodityKnockEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CommodityKnockEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="In"/>
 *     &lt;enumeration value="Out"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CommodityKnockEnum", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
@XmlEnum
public enum CommodityKnockEnum {


    /**
     * Option is exercisable.
     * 
     */
    @XmlEnumValue("In")
    IN("In"),

    /**
     * Option is not exercisable.
     * 
     */
    @XmlEnumValue("Out")
    OUT("Out");
    private final String value;

    CommodityKnockEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CommodityKnockEnum fromValue(String v) {
        for (CommodityKnockEnum c: CommodityKnockEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
