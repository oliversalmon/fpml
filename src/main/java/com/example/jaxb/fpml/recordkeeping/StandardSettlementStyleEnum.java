
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StandardSettlementStyleEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StandardSettlementStyleEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Standard"/>
 *     &lt;enumeration value="Net"/>
 *     &lt;enumeration value="StandardAndNet"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StandardSettlementStyleEnum", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
@XmlEnum
public enum StandardSettlementStyleEnum {


    /**
     * This trade will settle using standard pre-determined funds settlement instructions.
     * 
     */
    @XmlEnumValue("Standard")
    STANDARD("Standard"),

    /**
     * This trade is a candidate for settlement netting.
     * 
     */
    @XmlEnumValue("Net")
    NET("Net"),

    /**
     * This trade will settle using standard pre-determined funds settlement instructions and is a candidate for settlement netting.
     * 
     */
    @XmlEnumValue("StandardAndNet")
    STANDARD_AND_NET("StandardAndNet");
    private final String value;

    StandardSettlementStyleEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StandardSettlementStyleEnum fromValue(String v) {
        for (StandardSettlementStyleEnum c: StandardSettlementStyleEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
