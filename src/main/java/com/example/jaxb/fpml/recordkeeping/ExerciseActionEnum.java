
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExerciseActionEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExerciseActionEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="FullExercise"/>
 *     &lt;enumeration value="PartialExercise"/>
 *     &lt;enumeration value="Abandon"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ExerciseActionEnum", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
@XmlEnum
public enum ExerciseActionEnum {


    /**
     * The option was or is to be exercised fully.
     * 
     */
    @XmlEnumValue("FullExercise")
    FULL_EXERCISE("FullExercise"),

    /**
     * The option was or is to be exercised partially. The amount of the exercise is specified elsewhere in the document than in the exercise amount; for example, in the case of a physical exercise the size of the resulting trade is the same as the amount that was exercise, so if it is specified it is not necessary to specify the amount of the partial exercise.
     * 
     */
    @XmlEnumValue("PartialExercise")
    PARTIAL_EXERCISE("PartialExercise"),

    /**
     * The option was or is to be allowed to expire without being exercised, i.e. it is being abandoned.
     * 
     */
    @XmlEnumValue("Abandon")
    ABANDON("Abandon");
    private final String value;

    ExerciseActionEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExerciseActionEnum fromValue(String v) {
        for (ExerciseActionEnum c: ExerciseActionEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
