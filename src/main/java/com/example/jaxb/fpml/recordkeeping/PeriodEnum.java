
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PeriodEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PeriodEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="D"/>
 *     &lt;enumeration value="W"/>
 *     &lt;enumeration value="M"/>
 *     &lt;enumeration value="Y"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PeriodEnum", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
@XmlEnum
public enum PeriodEnum {


    /**
     * Day.
     * 
     */
    D,

    /**
     * Week.
     * 
     */
    W,

    /**
     * Month.
     * 
     */
    M,

    /**
     * Year.
     * 
     */
    Y;

    public String value() {
        return name();
    }

    public static PeriodEnum fromValue(String v) {
        return valueOf(v);
    }

}
