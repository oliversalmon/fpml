
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PremiumTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PremiumTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="PrePaid"/>
 *     &lt;enumeration value="PostPaid"/>
 *     &lt;enumeration value="Variable"/>
 *     &lt;enumeration value="Fixed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PremiumTypeEnum", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
@XmlEnum
public enum PremiumTypeEnum {


    /**
     * TODO
     * 
     */
    @XmlEnumValue("PrePaid")
    PRE_PAID("PrePaid"),

    /**
     * TODO
     * 
     */
    @XmlEnumValue("PostPaid")
    POST_PAID("PostPaid"),

    /**
     * TODO
     * 
     */
    @XmlEnumValue("Variable")
    VARIABLE("Variable"),

    /**
     * TODO
     * 
     */
    @XmlEnumValue("Fixed")
    FIXED("Fixed");
    private final String value;

    PremiumTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PremiumTypeEnum fromValue(String v) {
        for (PremiumTypeEnum c: PremiumTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
