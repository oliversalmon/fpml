
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CallingPartyEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CallingPartyEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="InitialBuyer"/>
 *     &lt;enumeration value="InitialSeller"/>
 *     &lt;enumeration value="Either"/>
 *     &lt;enumeration value="AsDefinedInMasterAgreement"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CallingPartyEnum", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
@XmlEnum
public enum CallingPartyEnum {


    /**
     * Initial buyer to the repo transaction.
     * 
     */
    @XmlEnumValue("InitialBuyer")
    INITIAL_BUYER("InitialBuyer"),

    /**
     * Initial seller to the repo transaction.
     * 
     */
    @XmlEnumValue("InitialSeller")
    INITIAL_SELLER("InitialSeller"),

    /**
     * Either, Buyer or Seller to the repo transaction.
     * 
     */
    @XmlEnumValue("Either")
    EITHER("Either"),

    /**
     * As defined in Master Agreement.
     * 
     */
    @XmlEnumValue("AsDefinedInMasterAgreement")
    AS_DEFINED_IN_MASTER_AGREEMENT("AsDefinedInMasterAgreement");
    private final String value;

    CallingPartyEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CallingPartyEnum fromValue(String v) {
        for (CallingPartyEnum c: CallingPartyEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
