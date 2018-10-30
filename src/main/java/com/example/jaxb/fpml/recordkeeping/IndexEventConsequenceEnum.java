
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IndexEventConsequenceEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IndexEventConsequenceEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="CalculationAgentAdjustment"/>
 *     &lt;enumeration value="NegotiatedCloseOut"/>
 *     &lt;enumeration value="CancellationAndPayment"/>
 *     &lt;enumeration value="RelatedExchange"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IndexEventConsequenceEnum", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
@XmlEnum
public enum IndexEventConsequenceEnum {


    /**
     * Calculation Agent Adjustment
     * 
     */
    @XmlEnumValue("CalculationAgentAdjustment")
    CALCULATION_AGENT_ADJUSTMENT("CalculationAgentAdjustment"),

    /**
     * Negotiated Close Out
     * 
     */
    @XmlEnumValue("NegotiatedCloseOut")
    NEGOTIATED_CLOSE_OUT("NegotiatedCloseOut"),

    /**
     * Cancellation and Payment
     * 
     */
    @XmlEnumValue("CancellationAndPayment")
    CANCELLATION_AND_PAYMENT("CancellationAndPayment"),

    /**
     * Related Exchange Adjustment
     * 
     */
    @XmlEnumValue("RelatedExchange")
    RELATED_EXCHANGE("RelatedExchange");
    private final String value;

    IndexEventConsequenceEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IndexEventConsequenceEnum fromValue(String v) {
        for (IndexEventConsequenceEnum c: IndexEventConsequenceEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
