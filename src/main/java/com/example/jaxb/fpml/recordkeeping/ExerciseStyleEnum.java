
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExerciseStyleEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExerciseStyleEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="American"/>
 *     &lt;enumeration value="Bermuda"/>
 *     &lt;enumeration value="European"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ExerciseStyleEnum", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
@XmlEnum
public enum ExerciseStyleEnum {

    @XmlEnumValue("American")
    AMERICAN("American"),
    @XmlEnumValue("Bermuda")
    BERMUDA("Bermuda"),
    @XmlEnumValue("European")
    EUROPEAN("European");
    private final String value;

    ExerciseStyleEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExerciseStyleEnum fromValue(String v) {
        for (ExerciseStyleEnum c: ExerciseStyleEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
