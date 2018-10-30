
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DualCurrencyStrikeQuoteBasisEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DualCurrencyStrikeQuoteBasisEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="DepositCurrencyPerAlternateCurrency"/>
 *     &lt;enumeration value="AlternateCurrencyPerDepositCurrency"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DualCurrencyStrikeQuoteBasisEnum", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
@XmlEnum
public enum DualCurrencyStrikeQuoteBasisEnum {

    @XmlEnumValue("DepositCurrencyPerAlternateCurrency")
    DEPOSIT_CURRENCY_PER_ALTERNATE_CURRENCY("DepositCurrencyPerAlternateCurrency"),
    @XmlEnumValue("AlternateCurrencyPerDepositCurrency")
    ALTERNATE_CURRENCY_PER_DEPOSIT_CURRENCY("AlternateCurrencyPerDepositCurrency");
    private final String value;

    DualCurrencyStrikeQuoteBasisEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DualCurrencyStrikeQuoteBasisEnum fromValue(String v) {
        for (DualCurrencyStrikeQuoteBasisEnum c: DualCurrencyStrikeQuoteBasisEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
