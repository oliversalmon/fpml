
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FxTargetStyleEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FxTargetStyleEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Exact"/>
 *     &lt;enumeration value="Exclusive"/>
 *     &lt;enumeration value="Inclusive"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FxTargetStyleEnum", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
@XmlEnum
public enum FxTargetStyleEnum {


    /**
     * The gain for the knockout period is adjusted to yield a final accumulated value equal to the target level.
     * 
     */
    @XmlEnumValue("Exact")
    EXACT("Exact"),

    /**
     * The gain for the knockout period is adjusted to zero i.e. the target yields zero value in the final period.
     * 
     */
    @XmlEnumValue("Exclusive")
    EXCLUSIVE("Exclusive"),

    /**
     * The gain for the knockout period is equal to the whole benefit of the final fixing over spot i.e. the final accumulated value may exceed the target level.
     * 
     */
    @XmlEnumValue("Inclusive")
    INCLUSIVE("Inclusive");
    private final String value;

    FxTargetStyleEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FxTargetStyleEnum fromValue(String v) {
        for (FxTargetStyleEnum c: FxTargetStyleEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
