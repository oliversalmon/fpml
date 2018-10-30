
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DividendPeriodEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DividendPeriodEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="FirstPeriod"/>
 *     &lt;enumeration value="SecondPeriod"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DividendPeriodEnum", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
@XmlEnum
public enum DividendPeriodEnum {


    /**
     * "First Period" per the 2002 ISDA Equity Derivatives Definitions will apply.
     * 
     */
    @XmlEnumValue("FirstPeriod")
    FIRST_PERIOD("FirstPeriod"),

    /**
     * "Second Period" per the 2002 ISDA Equity Derivatives Definitions will apply.
     * 
     */
    @XmlEnumValue("SecondPeriod")
    SECOND_PERIOD("SecondPeriod");
    private final String value;

    DividendPeriodEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DividendPeriodEnum fromValue(String v) {
        for (DividendPeriodEnum c: DividendPeriodEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
