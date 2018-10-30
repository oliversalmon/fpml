
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommissionDenominationEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CommissionDenominationEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="BPS"/>
 *     &lt;enumeration value="Percentage"/>
 *     &lt;enumeration value="CentsPerShare"/>
 *     &lt;enumeration value="FixedAmount"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CommissionDenominationEnum", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
@XmlEnum
public enum CommissionDenominationEnum {


    /**
     * The commission is expressed in basis points, in reference to the price referenced in the document.
     * 
     */
    BPS("BPS"),

    /**
     * The commission is expressed as a percentage of the gross price referenced in the document.
     * 
     */
    @XmlEnumValue("Percentage")
    PERCENTAGE("Percentage"),

    /**
     * The commission is expressed in cents per share.
     * 
     */
    @XmlEnumValue("CentsPerShare")
    CENTS_PER_SHARE("CentsPerShare"),

    /**
     * The commission is expressed as a absolute amount.
     * 
     */
    @XmlEnumValue("FixedAmount")
    FIXED_AMOUNT("FixedAmount");
    private final String value;

    CommissionDenominationEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CommissionDenominationEnum fromValue(String v) {
        for (CommissionDenominationEnum c: CommissionDenominationEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
