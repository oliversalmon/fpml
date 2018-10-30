
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DiscountingTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DiscountingTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Standard"/>
 *     &lt;enumeration value="FRA"/>
 *     &lt;enumeration value="FRAYield"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DiscountingTypeEnum", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
@XmlEnum
public enum DiscountingTypeEnum {


    /**
     * Per ISDA 2000 Definitions, Section 8.4. Discounting, paragraph (a)
     * 
     */
    @XmlEnumValue("Standard")
    STANDARD("Standard"),

    /**
     * Per ISDA 2000 Definitions, Section 8.4. Discounting, paragraph (b)
     * 
     */
    FRA("FRA"),

    /**
     * Per ISDA 2000 Definitions, Section 8.4. Discounting, paragraph (e)
     * 
     */
    @XmlEnumValue("FRAYield")
    FRA_YIELD("FRAYield");
    private final String value;

    DiscountingTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DiscountingTypeEnum fromValue(String v) {
        for (DiscountingTypeEnum c: DiscountingTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
