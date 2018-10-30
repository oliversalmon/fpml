
package com.example.jaxb.fpml.legal;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TelephoneTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TelephoneTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Work"/>
 *     &lt;enumeration value="Mobile"/>
 *     &lt;enumeration value="Fax"/>
 *     &lt;enumeration value="Personal"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TelephoneTypeEnum", namespace = "http://www.fpml.org/FpML-5/legal")
@XmlEnum
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
public enum TelephoneTypeEnum {


    /**
     * A number used primarily for work-related calls. Includes home office numbers used primarily for work purposes.
     * 
     */
    @XmlEnumValue("Work")
    WORK("Work"),

    /**
     * A number on a mobile telephone or pager that is often or usually used for work-related calls. This type of number can be used for urgent work related business when a work number is not sufficient to contact the person or firm.
     * 
     */
    @XmlEnumValue("Mobile")
    MOBILE("Mobile"),

    /**
     * A number used primarily for work-related facsimile transmissions.
     * 
     */
    @XmlEnumValue("Fax")
    FAX("Fax"),

    /**
     * A number used primarily for nonwork-related calls. (Normally this type of number would be used only as an emergency backup number, not as a regular course of business).
     * 
     */
    @XmlEnumValue("Personal")
    PERSONAL("Personal");
    private final String value;

    TelephoneTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TelephoneTypeEnum fromValue(String v) {
        for (TelephoneTypeEnum c: TelephoneTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
