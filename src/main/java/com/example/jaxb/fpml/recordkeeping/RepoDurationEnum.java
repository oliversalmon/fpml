
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RepoDurationEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RepoDurationEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Overnight"/>
 *     &lt;enumeration value="Term"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RepoDurationEnum", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
@XmlEnum
public enum RepoDurationEnum {


    /**
     * Indicates that a contract is classified as overnight, meaning that there is one business day difference between the start and end date of the contract. Business rule: When the repo is overnight, the number of business days between the spot and forward value dates must be one. Forward leg must be specified.
     * 
     */
    @XmlEnumValue("Overnight")
    OVERNIGHT("Overnight"),

    /**
     * Indicates that a contract is a regular term contract, with a start date and an end date. Business rule: When the repo is 'Term', both spot and forward legs must be specified.
     * 
     */
    @XmlEnumValue("Term")
    TERM("Term");
    private final String value;

    RepoDurationEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RepoDurationEnum fromValue(String v) {
        for (RepoDurationEnum c: RepoDurationEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
