
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FxStraddleTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FxStraddleTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="AtTheMoneyForward"/>
 *     &lt;enumeration value="DeltaNeutral"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FxStraddleTypeEnum", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
@XmlEnum
public enum FxStraddleTypeEnum {


    /**
     * At the money forward straddle.
     * 
     */
    @XmlEnumValue("AtTheMoneyForward")
    AT_THE_MONEY_FORWARD("AtTheMoneyForward"),

    /**
     * Delta neutral straddle.
     * 
     */
    @XmlEnumValue("DeltaNeutral")
    DELTA_NEUTRAL("DeltaNeutral");
    private final String value;

    FxStraddleTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FxStraddleTypeEnum fromValue(String v) {
        for (FxStraddleTypeEnum c: FxStraddleTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
