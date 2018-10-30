
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoadTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LoadTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Base"/>
 *     &lt;enumeration value="Peak"/>
 *     &lt;enumeration value="OffPeak"/>
 *     &lt;enumeration value="BlockHours"/>
 *     &lt;enumeration value="Custom"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LoadTypeEnum", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
@XmlEnum
public enum LoadTypeEnum {


    /**
     * Base
     * 
     */
    @XmlEnumValue("Base")
    BASE("Base"),

    /**
     * Peak
     * 
     */
    @XmlEnumValue("Peak")
    PEAK("Peak"),

    /**
     * Off-Peak
     * 
     */
    @XmlEnumValue("OffPeak")
    OFF_PEAK("OffPeak"),

    /**
     * Block Hours
     * 
     */
    @XmlEnumValue("BlockHours")
    BLOCK_HOURS("BlockHours"),

    /**
     * Anything that does not fall under the predefined standard categories
     * 
     */
    @XmlEnumValue("Custom")
    CUSTOM("Custom");
    private final String value;

    LoadTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LoadTypeEnum fromValue(String v) {
        for (LoadTypeEnum c: LoadTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
