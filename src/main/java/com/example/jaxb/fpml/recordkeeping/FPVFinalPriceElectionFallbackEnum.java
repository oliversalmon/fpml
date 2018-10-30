
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FPVFinalPriceElectionFallbackEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FPVFinalPriceElectionFallbackEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="FPVClose"/>
 *     &lt;enumeration value="FPVHedgeExecution"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FPVFinalPriceElectionFallbackEnum", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
@XmlEnum
public enum FPVFinalPriceElectionFallbackEnum {


    /**
     * In respect of the Early Final Valuation Date, the provisions for FPV Close shall apply.
     * 
     */
    @XmlEnumValue("FPVClose")
    FPV_CLOSE("FPVClose"),

    /**
     * In respect of the Early Final Valuation Date, the provisions for FPV Hedge Execution shall apply.
     * 
     */
    @XmlEnumValue("FPVHedgeExecution")
    FPV_HEDGE_EXECUTION("FPVHedgeExecution");
    private final String value;

    FPVFinalPriceElectionFallbackEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FPVFinalPriceElectionFallbackEnum fromValue(String v) {
        for (FPVFinalPriceElectionFallbackEnum c: FPVFinalPriceElectionFallbackEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
