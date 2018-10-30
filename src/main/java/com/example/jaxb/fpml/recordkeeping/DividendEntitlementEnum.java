
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DividendEntitlementEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DividendEntitlementEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="ExDate"/>
 *     &lt;enumeration value="RecordDate"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DividendEntitlementEnum", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
@XmlEnum
public enum DividendEntitlementEnum {


    /**
     * Dividend entitlement is on the dividend ex-date.
     * 
     */
    @XmlEnumValue("ExDate")
    EX_DATE("ExDate"),

    /**
     * Dividend entitlement is on the dividend record date.
     * 
     */
    @XmlEnumValue("RecordDate")
    RECORD_DATE("RecordDate");
    private final String value;

    DividendEntitlementEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DividendEntitlementEnum fromValue(String v) {
        for (DividendEntitlementEnum c: DividendEntitlementEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
