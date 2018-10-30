
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommodityBullionSettlementDisruptionEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CommodityBullionSettlementDisruptionEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Negotiation"/>
 *     &lt;enumeration value="Cancellation and Payment"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CommodityBullionSettlementDisruptionEnum", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
@XmlEnum
public enum CommodityBullionSettlementDisruptionEnum {


    /**
     * Negotiation will apply in the event of Bullion Settlement Disruption as per Section 10.5.(d) of the 2005 Commodity Definitions.
     * 
     */
    @XmlEnumValue("Negotiation")
    NEGOTIATION("Negotiation"),

    /**
     * Cancellation and Payment will apply in the event of Bullion Settlement Disruption as per Section 10.5.(d) of the 2005 Commodity Definitions.
     * 
     */
    @XmlEnumValue("Cancellation and Payment")
    CANCELLATION_AND_PAYMENT("Cancellation and Payment");
    private final String value;

    CommodityBullionSettlementDisruptionEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CommodityBullionSettlementDisruptionEnum fromValue(String v) {
        for (CommodityBullionSettlementDisruptionEnum c: CommodityBullionSettlementDisruptionEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
