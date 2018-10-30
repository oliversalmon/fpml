
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FxSettlementAdjustmentMethodEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FxSettlementAdjustmentMethodEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="VariedStrike"/>
 *     &lt;enumeration value="VariedNotional"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FxSettlementAdjustmentMethodEnum", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
@XmlEnum
public enum FxSettlementAdjustmentMethodEnum {

    @XmlEnumValue("VariedStrike")
    VARIED_STRIKE("VariedStrike"),
    @XmlEnumValue("VariedNotional")
    VARIED_NOTIONAL("VariedNotional");
    private final String value;

    FxSettlementAdjustmentMethodEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FxSettlementAdjustmentMethodEnum fromValue(String v) {
        for (FxSettlementAdjustmentMethodEnum c: FxSettlementAdjustmentMethodEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
