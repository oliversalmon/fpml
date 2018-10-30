
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlatRateEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FlatRateEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Fixed"/>
 *     &lt;enumeration value="Floating"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FlatRateEnum", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
@XmlEnum
public enum FlatRateEnum {


    /**
     * The Flat Rate will be the New Worldwide Tanker Nominal Freight Scale for the Freight Index Route for the Trade Date for the transaction.
     * 
     */
    @XmlEnumValue("Fixed")
    FIXED("Fixed"),

    /**
     * The Flat Rate for each Pricing Date will be the New Worldwide Tanker Nominal Freight Scale for the Freight Index Route for the Pricing Date..
     * 
     */
    @XmlEnumValue("Floating")
    FLOATING("Floating");
    private final String value;

    FlatRateEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FlatRateEnum fromValue(String v) {
        for (FlatRateEnum c: FlatRateEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
