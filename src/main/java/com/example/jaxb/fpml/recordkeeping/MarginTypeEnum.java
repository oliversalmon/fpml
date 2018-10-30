
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MarginTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MarginTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Cash"/>
 *     &lt;enumeration value="Instrument"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MarginTypeEnum", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
@XmlEnum
public enum MarginTypeEnum {


    /**
     * When the margin type is Cash, the margin factor is applied to the cash value of the transaction.
     * 
     */
    @XmlEnumValue("Cash")
    CASH("Cash"),

    /**
     * When the margin type is Instrument, the margin factor is applied to the instrument value for the transaction. In the “instrument” case, the haircut would be applied to the securities.
     * 
     */
    @XmlEnumValue("Instrument")
    INSTRUMENT("Instrument");
    private final String value;

    MarginTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MarginTypeEnum fromValue(String v) {
        for (MarginTypeEnum c: MarginTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
