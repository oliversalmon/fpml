
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValuationMethodEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ValuationMethodEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Market"/>
 *     &lt;enumeration value="Highest"/>
 *     &lt;enumeration value="AverageMarket"/>
 *     &lt;enumeration value="AverageHighest"/>
 *     &lt;enumeration value="BlendedMarket"/>
 *     &lt;enumeration value="BlendedHighest"/>
 *     &lt;enumeration value="AverageBlendedMarket"/>
 *     &lt;enumeration value="AverageBlendedHighest"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ValuationMethodEnum", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
@XmlEnum
public enum ValuationMethodEnum {

    @XmlEnumValue("Market")
    MARKET("Market"),
    @XmlEnumValue("Highest")
    HIGHEST("Highest"),
    @XmlEnumValue("AverageMarket")
    AVERAGE_MARKET("AverageMarket"),
    @XmlEnumValue("AverageHighest")
    AVERAGE_HIGHEST("AverageHighest"),
    @XmlEnumValue("BlendedMarket")
    BLENDED_MARKET("BlendedMarket"),
    @XmlEnumValue("BlendedHighest")
    BLENDED_HIGHEST("BlendedHighest"),
    @XmlEnumValue("AverageBlendedMarket")
    AVERAGE_BLENDED_MARKET("AverageBlendedMarket"),
    @XmlEnumValue("AverageBlendedHighest")
    AVERAGE_BLENDED_HIGHEST("AverageBlendedHighest");
    private final String value;

    ValuationMethodEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ValuationMethodEnum fromValue(String v) {
        for (ValuationMethodEnum c: ValuationMethodEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
