
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MethodOfAdjustmentEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MethodOfAdjustmentEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="CalculationAgent"/>
 *     &lt;enumeration value="OptionsExchange"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MethodOfAdjustmentEnum", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
@XmlEnum
public enum MethodOfAdjustmentEnum {


    /**
     * The Calculation Agent has the right to adjust the terms of the trade following a corporate action.
     * 
     */
    @XmlEnumValue("CalculationAgent")
    CALCULATION_AGENT("CalculationAgent"),

    /**
     * The trade will be adjusted in accordance with any adjustment made by the exchange on which options on the underlying are listed.
     * 
     */
    @XmlEnumValue("OptionsExchange")
    OPTIONS_EXCHANGE("OptionsExchange");
    private final String value;

    MethodOfAdjustmentEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MethodOfAdjustmentEnum fromValue(String v) {
        for (MethodOfAdjustmentEnum c: MethodOfAdjustmentEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
