
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StrikeQuoteBasisEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StrikeQuoteBasisEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="PutCurrencyPerCallCurrency"/>
 *     &lt;enumeration value="CallCurrencyPerPutCurrency"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StrikeQuoteBasisEnum", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
@XmlEnum
public enum StrikeQuoteBasisEnum {


    /**
     * The strike price is an amount of putCurrency per one unit of callCurrency.
     * 
     */
    @XmlEnumValue("PutCurrencyPerCallCurrency")
    PUT_CURRENCY_PER_CALL_CURRENCY("PutCurrencyPerCallCurrency"),

    /**
     * The strike price is an amount of callCurrency per one unit of putCurrency.
     * 
     */
    @XmlEnumValue("CallCurrencyPerPutCurrency")
    CALL_CURRENCY_PER_PUT_CURRENCY("CallCurrencyPerPutCurrency");
    private final String value;

    StrikeQuoteBasisEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StrikeQuoteBasisEnum fromValue(String v) {
        for (StrikeQuoteBasisEnum c: StrikeQuoteBasisEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
