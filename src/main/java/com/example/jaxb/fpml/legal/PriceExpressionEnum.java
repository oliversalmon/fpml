
package com.example.jaxb.fpml.legal;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceExpressionEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PriceExpressionEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="AbsoluteTerms"/>
 *     &lt;enumeration value="PercentageOfNotional"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PriceExpressionEnum", namespace = "http://www.fpml.org/FpML-5/legal")
@XmlEnum
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
public enum PriceExpressionEnum {


    /**
     * The price is expressed as an absolute amount.>
     * 
     */
    @XmlEnumValue("AbsoluteTerms")
    ABSOLUTE_TERMS("AbsoluteTerms"),

    /**
     * The price is expressed in percentage of the notional amount.
     * 
     */
    @XmlEnumValue("PercentageOfNotional")
    PERCENTAGE_OF_NOTIONAL("PercentageOfNotional");
    private final String value;

    PriceExpressionEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PriceExpressionEnum fromValue(String v) {
        for (PriceExpressionEnum c: PriceExpressionEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
