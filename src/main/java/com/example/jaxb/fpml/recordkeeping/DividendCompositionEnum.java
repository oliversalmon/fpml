
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DividendCompositionEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DividendCompositionEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="EquityAmountReceiverElection"/>
 *     &lt;enumeration value="CalculationAgentElection"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DividendCompositionEnum", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
@XmlEnum
public enum DividendCompositionEnum {


    /**
     * The Equity Amount Receiver determines the composition of dividends (subject to conditions).
     * 
     */
    @XmlEnumValue("EquityAmountReceiverElection")
    EQUITY_AMOUNT_RECEIVER_ELECTION("EquityAmountReceiverElection"),

    /**
     * The Calculation Agent determines the composition of dividends (subject to conditions).
     * 
     */
    @XmlEnumValue("CalculationAgentElection")
    CALCULATION_AGENT_ELECTION("CalculationAgentElection");
    private final String value;

    DividendCompositionEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DividendCompositionEnum fromValue(String v) {
        for (DividendCompositionEnum c: DividendCompositionEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
