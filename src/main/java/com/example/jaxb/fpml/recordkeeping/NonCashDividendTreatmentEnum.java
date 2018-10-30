
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NonCashDividendTreatmentEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NonCashDividendTreatmentEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="PotentialAdjustmentEvent"/>
 *     &lt;enumeration value="CashEquivalent"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NonCashDividendTreatmentEnum", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
@XmlEnum
public enum NonCashDividendTreatmentEnum {


    /**
     * The treatment of any non-cash dividend shall be determined in accordance with the Potential Adjustment Event provisions.
     * 
     */
    @XmlEnumValue("PotentialAdjustmentEvent")
    POTENTIAL_ADJUSTMENT_EVENT("PotentialAdjustmentEvent"),

    /**
     * Any non-cash dividend shall be treated as a Declared Cash Equivalent Dividend.
     * 
     */
    @XmlEnumValue("CashEquivalent")
    CASH_EQUIVALENT("CashEquivalent");
    private final String value;

    NonCashDividendTreatmentEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NonCashDividendTreatmentEnum fromValue(String v) {
        for (NonCashDividendTreatmentEnum c: NonCashDividendTreatmentEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
