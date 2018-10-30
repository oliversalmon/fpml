
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValuationTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ValuationTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Model"/>
 *     &lt;enumeration value="Market"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ValuationTypeEnum", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
@XmlEnum
public enum ValuationTypeEnum {


    /**
     * The valuation was calculated based on a pricing model incorporating trade economics and a model of market conditions.
     * 
     */
    @XmlEnumValue("Model")
    MODEL("Model"),

    /**
     * The valuation was determined based on values for similar products quoted on the open market.
     * 
     */
    @XmlEnumValue("Market")
    MARKET("Market");
    private final String value;

    ValuationTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ValuationTypeEnum fromValue(String v) {
        for (ValuationTypeEnum c: ValuationTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
