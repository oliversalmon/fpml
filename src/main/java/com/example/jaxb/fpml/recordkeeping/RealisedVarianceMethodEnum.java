
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RealisedVarianceMethodEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RealisedVarianceMethodEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Previous"/>
 *     &lt;enumeration value="Last"/>
 *     &lt;enumeration value="Both"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RealisedVarianceMethodEnum", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
@XmlEnum
public enum RealisedVarianceMethodEnum {


    /**
     * For a return on day T, the observed price on T-1 must be in range.
     * 
     */
    @XmlEnumValue("Previous")
    PREVIOUS("Previous"),

    /**
     * For a return on day T, the observed price on T must be in range.
     * 
     */
    @XmlEnumValue("Last")
    LAST("Last"),

    /**
     * For a return on day T, the observed prices on both T and T-1 must be in range
     * 
     */
    @XmlEnumValue("Both")
    BOTH("Both");
    private final String value;

    RealisedVarianceMethodEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RealisedVarianceMethodEnum fromValue(String v) {
        for (RealisedVarianceMethodEnum c: RealisedVarianceMethodEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
