
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AveragingInOutEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AveragingInOutEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="In"/>
 *     &lt;enumeration value="Out"/>
 *     &lt;enumeration value="Both"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AveragingInOutEnum", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
@XmlEnum
public enum AveragingInOutEnum {


    /**
     * The average price is used to derive the strike price. Also known as "Asian strike" style option.
     * 
     */
    @XmlEnumValue("In")
    IN("In"),

    /**
     * The average price is used to derive the expiration price. Also known as "Asian price" style option.
     * 
     */
    @XmlEnumValue("Out")
    OUT("Out"),

    /**
     * The average price is used to derive both the strike and the expiration price.
     * 
     */
    @XmlEnumValue("Both")
    BOTH("Both");
    private final String value;

    AveragingInOutEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AveragingInOutEnum fromValue(String v) {
        for (AveragingInOutEnum c: AveragingInOutEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
