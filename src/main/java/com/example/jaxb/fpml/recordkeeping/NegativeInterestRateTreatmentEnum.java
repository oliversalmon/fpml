
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NegativeInterestRateTreatmentEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NegativeInterestRateTreatmentEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="NegativeInterestRateMethod"/>
 *     &lt;enumeration value="ZeroInterestRateMethod"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NegativeInterestRateTreatmentEnum", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
@XmlEnum
public enum NegativeInterestRateTreatmentEnum {


    /**
     * Negative Interest Rate Method. Per 2000 ISDA Definitions, Section 6.4 Negative Interest Rates, paragraphs (b) and (c).
     * 
     */
    @XmlEnumValue("NegativeInterestRateMethod")
    NEGATIVE_INTEREST_RATE_METHOD("NegativeInterestRateMethod"),

    /**
     * Zero Interest Rate Method. Per 2000 ISDA Definitions, Section 6.4. Negative Interest Rates, paragraphs (d) and (e).
     * 
     */
    @XmlEnumValue("ZeroInterestRateMethod")
    ZERO_INTEREST_RATE_METHOD("ZeroInterestRateMethod");
    private final String value;

    NegativeInterestRateTreatmentEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NegativeInterestRateTreatmentEnum fromValue(String v) {
        for (NegativeInterestRateTreatmentEnum c: NegativeInterestRateTreatmentEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
