
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SwaptionTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SwaptionTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Payer"/>
 *     &lt;enumeration value="Receiver"/>
 *     &lt;enumeration value="Straddle"/>
 *     &lt;enumeration value="NonStandard"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SwaptionTypeEnum", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
@XmlEnum
public enum SwaptionTypeEnum {


    /**
     * A Payer swaption confers on the buyer the right, but not the obligation, to enter into the underlying swap as payer of the fixed rate (and receiver of the floating rate).
     * 
     */
    @XmlEnumValue("Payer")
    PAYER("Payer"),

    /**
     * A Receiver swaption confers on the buyer the right, but not the obligation, to enter into the underlying swap as receiver of the fixed rate (and payer of the floating rate).
     * 
     */
    @XmlEnumValue("Receiver")
    RECEIVER("Receiver"),

    /**
     * A swaption straddle is a strategy trade, in which the buyer simultaneously purchases a Payer and a Receiver swaption at the same strike (fixed rate) and with otherwise identical economic characteristics.
     * 
     */
    @XmlEnumValue("Straddle")
    STRADDLE("Straddle"),

    /**
     * This designation is reserved for swaptions with non-standard characteristics e.g. having a basis swap or cross-currency swap underlyer.
     * 
     */
    @XmlEnumValue("NonStandard")
    NON_STANDARD("NonStandard");
    private final String value;

    SwaptionTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SwaptionTypeEnum fromValue(String v) {
        for (SwaptionTypeEnum c: SwaptionTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
