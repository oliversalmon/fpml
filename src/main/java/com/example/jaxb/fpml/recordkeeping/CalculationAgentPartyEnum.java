
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CalculationAgentPartyEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CalculationAgentPartyEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="ExercisingParty"/>
 *     &lt;enumeration value="NonExercisingParty"/>
 *     &lt;enumeration value="AsSpecifiedInMasterAgreement"/>
 *     &lt;enumeration value="AsSpecifiedInStandardTermsSupplement"/>
 *     &lt;enumeration value="Both"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CalculationAgentPartyEnum", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
@XmlEnum
public enum CalculationAgentPartyEnum {


    /**
     * The party that gives notice of exercise. Per 2000 ISDA Definitions, Section 11.1. Parties, paragraph (d).
     * 
     */
    @XmlEnumValue("ExercisingParty")
    EXERCISING_PARTY("ExercisingParty"),

    /**
     * The party that is given notice of exercise. Per 2000 ISDA Definitions, Section 11.1. Parties, paragraph (e).
     * 
     */
    @XmlEnumValue("NonExercisingParty")
    NON_EXERCISING_PARTY("NonExercisingParty"),

    /**
     * The Calculation Agent is determined by reference to the relevant master agreement.
     * 
     */
    @XmlEnumValue("AsSpecifiedInMasterAgreement")
    AS_SPECIFIED_IN_MASTER_AGREEMENT("AsSpecifiedInMasterAgreement"),

    /**
     * The Calculation Agent is determined by reference to the relevant standard terms supplement.
     * 
     */
    @XmlEnumValue("AsSpecifiedInStandardTermsSupplement")
    AS_SPECIFIED_IN_STANDARD_TERMS_SUPPLEMENT("AsSpecifiedInStandardTermsSupplement"),

    /**
     * Both parties with joined rights to be a calculation agent.
     * 
     */
    @XmlEnumValue("Both")
    BOTH("Both");
    private final String value;

    CalculationAgentPartyEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CalculationAgentPartyEnum fromValue(String v) {
        for (CalculationAgentPartyEnum c: CalculationAgentPartyEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
