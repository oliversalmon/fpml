
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FxAccrualKnockoutBarrierRetentionEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FxAccrualKnockoutBarrierRetentionEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Keep"/>
 *     &lt;enumeration value="Lose"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FxAccrualKnockoutBarrierRetentionEnum", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
@XmlEnum
public enum FxAccrualKnockoutBarrierRetentionEnum {


    /**
     * If the barrier is triggered, the accrual process for that period stops. The parties retain the underlying settlement rights for that period with the currently accrued notional.
     * 
     */
    @XmlEnumValue("Keep")
    KEEP("Keep"),

    /**
     * If the barrier is triggered, the accrual process for that period stops. No settlement occurs for that period.
     * 
     */
    @XmlEnumValue("Lose")
    LOSE("Lose");
    private final String value;

    FxAccrualKnockoutBarrierRetentionEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FxAccrualKnockoutBarrierRetentionEnum fromValue(String v) {
        for (FxAccrualKnockoutBarrierRetentionEnum c: FxAccrualKnockoutBarrierRetentionEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
