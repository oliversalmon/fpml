
package com.example.jaxb.fpml.legal;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuantifierEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QuantifierEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="All"/>
 *     &lt;enumeration value="Any"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "QuantifierEnum", namespace = "http://www.fpml.org/FpML-5/legal")
@XmlEnum
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
public enum QuantifierEnum {


    /**
     * The condition in the scope of the quantifier is true of every member of the domain i.e. every one of the elements in scope.
     * 
     */
    @XmlEnumValue("All")
    ALL("All"),

    /**
     * The condition in the scope of the quantifier is true of at least one member of the domain i.e. one or more of the elements in scope.
     * 
     */
    @XmlEnumValue("Any")
    ANY("Any");
    private final String value;

    QuantifierEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static QuantifierEnum fromValue(String v) {
        for (QuantifierEnum c: QuantifierEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
