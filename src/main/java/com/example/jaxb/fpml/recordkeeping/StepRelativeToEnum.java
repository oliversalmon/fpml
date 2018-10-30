
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StepRelativeToEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StepRelativeToEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Initial"/>
 *     &lt;enumeration value="Previous"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StepRelativeToEnum", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
@XmlEnum
public enum StepRelativeToEnum {


    /**
     * Change in notional to be applied is calculated by multiplying the percentage rate by the initial notional amount.
     * 
     */
    @XmlEnumValue("Initial")
    INITIAL("Initial"),

    /**
     * Change in notional to be applied is calculated by multiplying the percentage rate by the previously outstanding notional amount.
     * 
     */
    @XmlEnumValue("Previous")
    PREVIOUS("Previous");
    private final String value;

    StepRelativeToEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StepRelativeToEnum fromValue(String v) {
        for (StepRelativeToEnum c: StepRelativeToEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
