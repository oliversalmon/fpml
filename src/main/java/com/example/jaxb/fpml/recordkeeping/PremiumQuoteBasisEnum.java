
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PremiumQuoteBasisEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PremiumQuoteBasisEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="PercentageOfCallCurrencyAmount"/>
 *     &lt;enumeration value="PercentageOfPutCurrencyAmount"/>
 *     &lt;enumeration value="CallCurrencyPerPutCurrency"/>
 *     &lt;enumeration value="PutCurrencyPerCallCurrency"/>
 *     &lt;enumeration value="Explicit"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PremiumQuoteBasisEnum", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
@XmlEnum
public enum PremiumQuoteBasisEnum {


    /**
     * Premium is quoted as a percentage of the callCurrencyAmount.
     * 
     */
    @XmlEnumValue("PercentageOfCallCurrencyAmount")
    PERCENTAGE_OF_CALL_CURRENCY_AMOUNT("PercentageOfCallCurrencyAmount"),

    /**
     * Premium is quoted as a percentage of the putCurrencyAmount.
     * 
     */
    @XmlEnumValue("PercentageOfPutCurrencyAmount")
    PERCENTAGE_OF_PUT_CURRENCY_AMOUNT("PercentageOfPutCurrencyAmount"),

    /**
     * Premium is quoted in the call currency as a percentage of the put currency.
     * 
     */
    @XmlEnumValue("CallCurrencyPerPutCurrency")
    CALL_CURRENCY_PER_PUT_CURRENCY("CallCurrencyPerPutCurrency"),

    /**
     * Premium is quoted in the put currency as a percentage of the call currency.
     * 
     */
    @XmlEnumValue("PutCurrencyPerCallCurrency")
    PUT_CURRENCY_PER_CALL_CURRENCY("PutCurrencyPerCallCurrency"),

    /**
     * Premium is quoted as an explicit amount.
     * 
     */
    @XmlEnumValue("Explicit")
    EXPLICIT("Explicit");
    private final String value;

    PremiumQuoteBasisEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PremiumQuoteBasisEnum fromValue(String v) {
        for (PremiumQuoteBasisEnum c: PremiumQuoteBasisEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
