
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnvironmentalAbandonmentOfSchemeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnvironmentalAbandonmentOfSchemeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="OptionA(1)"/>
 *     &lt;enumeration value="OptionA(2)"/>
 *     &lt;enumeration value="OptionB"/>
 *     &lt;enumeration value="OptionC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnvironmentalAbandonmentOfSchemeEnum", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
@XmlEnum
public enum EnvironmentalAbandonmentOfSchemeEnum {


    /**
     * Abandonment of Scheme constitutes an Additional Termination Event.
     * 
     */
    @XmlEnumValue("OptionA(1)")
    OPTION_A_1("OptionA(1)"),

    /**
     * Abandonment of Scheme entails no further obligations.
     * 
     */
    @XmlEnumValue("OptionA(2)")
    OPTION_A_2("OptionA(2)"),

    /**
     * The applicability of Abandonment of Scheme to Emissions Transactions is set forth in the applicable Confirmation.
     * 
     */
    @XmlEnumValue("OptionB")
    OPTION_B("OptionB"),

    /**
     * The applicability of Abandonment of Scheme does not apply.
     * 
     */
    @XmlEnumValue("OptionC")
    OPTION_C("OptionC");
    private final String value;

    EnvironmentalAbandonmentOfSchemeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnvironmentalAbandonmentOfSchemeEnum fromValue(String v) {
        for (EnvironmentalAbandonmentOfSchemeEnum c: EnvironmentalAbandonmentOfSchemeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
