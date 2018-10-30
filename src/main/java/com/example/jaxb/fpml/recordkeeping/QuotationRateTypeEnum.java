
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuotationRateTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QuotationRateTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Bid"/>
 *     &lt;enumeration value="Ask"/>
 *     &lt;enumeration value="Mid"/>
 *     &lt;enumeration value="ExercisingPartyPays"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "QuotationRateTypeEnum", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
@XmlEnum
public enum QuotationRateTypeEnum {


    /**
     * A bid rate.
     * 
     */
    @XmlEnumValue("Bid")
    BID("Bid"),

    /**
     * An ask rate.
     * 
     */
    @XmlEnumValue("Ask")
    ASK("Ask"),

    /**
     * A mid-market rate.
     * 
     */
    @XmlEnumValue("Mid")
    MID("Mid"),

    /**
     * If optional early termination is applicable to a swap transaction, the rate, which may be a bid or ask rate, which would result, if seller is in-the-money, in the higher absolute value of the cash settlement amount, or, is seller is out-of-the-money, in the lower absolute value of the cash settlement amount.
     * 
     */
    @XmlEnumValue("ExercisingPartyPays")
    EXERCISING_PARTY_PAYS("ExercisingPartyPays");
    private final String value;

    QuotationRateTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static QuotationRateTypeEnum fromValue(String v) {
        for (QuotationRateTypeEnum c: QuotationRateTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
