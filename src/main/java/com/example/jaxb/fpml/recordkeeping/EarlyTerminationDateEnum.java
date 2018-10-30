
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EarlyTerminationDateEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EarlyTerminationDateEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="AnyDay"/>
 *     &lt;enumeration value="ValuationDate"/>
 *     &lt;enumeration value="ResetDate"/>
 *     &lt;enumeration value="AfterFirstResetDate"/>
 *     &lt;enumeration value="AsSpecifiedInMCA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EarlyTerminationDateEnum", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
@XmlEnum
public enum EarlyTerminationDateEnum {

    @XmlEnumValue("AnyDay")
    ANY_DAY("AnyDay"),
    @XmlEnumValue("ValuationDate")
    VALUATION_DATE("ValuationDate"),
    @XmlEnumValue("ResetDate")
    RESET_DATE("ResetDate"),
    @XmlEnumValue("AfterFirstResetDate")
    AFTER_FIRST_RESET_DATE("AfterFirstResetDate"),
    @XmlEnumValue("AsSpecifiedInMCA")
    AS_SPECIFIED_IN_MCA("AsSpecifiedInMCA");
    private final String value;

    EarlyTerminationDateEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EarlyTerminationDateEnum fromValue(String v) {
        for (EarlyTerminationDateEnum c: EarlyTerminationDateEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
