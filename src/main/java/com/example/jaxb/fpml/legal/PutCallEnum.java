
package com.example.jaxb.fpml.legal;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PutCallEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PutCallEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Put"/>
 *     &lt;enumeration value="Call"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PutCallEnum", namespace = "http://www.fpml.org/FpML-5/legal")
@XmlEnum
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
public enum PutCallEnum {


    /**
     * A put option gives the holder the right to sell the underlying asset by a certain date for a certain price.
     * 
     */
    @XmlEnumValue("Put")
    PUT("Put"),

    /**
     * A call option gives the holder the right to buy the underlying asset by a certain date for a certain price.
     * 
     */
    @XmlEnumValue("Call")
    CALL("Call");
    private final String value;

    PutCallEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PutCallEnum fromValue(String v) {
        for (PutCallEnum c: PutCallEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
