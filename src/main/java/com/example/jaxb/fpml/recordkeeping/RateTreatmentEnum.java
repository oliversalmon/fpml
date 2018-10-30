
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RateTreatmentEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RateTreatmentEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="BondEquivalentYield"/>
 *     &lt;enumeration value="MoneyMarketYield"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RateTreatmentEnum", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
@XmlEnum
public enum RateTreatmentEnum {


    /**
     * Bond Equivalent Yield. Per Annex to the 2000 ISDA Definitions (June 2000 Version), Section 7.3. Certain General Definitions Relating to Floating Rate Options, paragraph (g).
     * 
     */
    @XmlEnumValue("BondEquivalentYield")
    BOND_EQUIVALENT_YIELD("BondEquivalentYield"),

    /**
     * Money Market Yield. Per Annex to the 2000 ISDA Definitions (June 2000 Version), Section 7.3. Certain General Definitions Relating to Floating Rate Options, paragraph (h).
     * 
     */
    @XmlEnumValue("MoneyMarketYield")
    MONEY_MARKET_YIELD("MoneyMarketYield");
    private final String value;

    RateTreatmentEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RateTreatmentEnum fromValue(String v) {
        for (RateTreatmentEnum c: RateTreatmentEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
