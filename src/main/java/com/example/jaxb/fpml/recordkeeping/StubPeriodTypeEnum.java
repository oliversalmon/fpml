
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StubPeriodTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StubPeriodTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="ShortInitial"/>
 *     &lt;enumeration value="ShortFinal"/>
 *     &lt;enumeration value="LongInitial"/>
 *     &lt;enumeration value="LongFinal"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StubPeriodTypeEnum", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
@XmlEnum
public enum StubPeriodTypeEnum {


    /**
     * If there is a non regular period remaining it is left shorter than the streams calculation period frequency and placed at the start of the stream
     * 
     */
    @XmlEnumValue("ShortInitial")
    SHORT_INITIAL("ShortInitial"),

    /**
     * If there is a non regular period remaining it is left shorter than the streams calculation period frequency and placed at the end of the stream
     * 
     */
    @XmlEnumValue("ShortFinal")
    SHORT_FINAL("ShortFinal"),

    /**
     * If there is a non regular period remaining it is placed at the start of the stream and combined with the adjacent calculation period to give a long first calculation period
     * 
     */
    @XmlEnumValue("LongInitial")
    LONG_INITIAL("LongInitial"),

    /**
     * If there is a non regular period remaining it is placed at the end of the stream and combined with the adjacent calculation period to give a long last calculation period
     * 
     */
    @XmlEnumValue("LongFinal")
    LONG_FINAL("LongFinal");
    private final String value;

    StubPeriodTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StubPeriodTypeEnum fromValue(String v) {
        for (StubPeriodTypeEnum c: StubPeriodTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
