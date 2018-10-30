
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DealtCurrencyEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DealtCurrencyEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="ExchangedCurrency1"/>
 *     &lt;enumeration value="ExchangedCurrency2"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DealtCurrencyEnum", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
@XmlEnum
public enum DealtCurrencyEnum {

    @XmlEnumValue("ExchangedCurrency1")
    EXCHANGED_CURRENCY_1("ExchangedCurrency1"),
    @XmlEnumValue("ExchangedCurrency2")
    EXCHANGED_CURRENCY_2("ExchangedCurrency2");
    private final String value;

    DealtCurrencyEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DealtCurrencyEnum fromValue(String v) {
        for (DealtCurrencyEnum c: DealtCurrencyEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
