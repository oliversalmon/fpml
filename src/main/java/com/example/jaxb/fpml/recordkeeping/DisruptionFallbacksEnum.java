
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DisruptionFallbacksEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DisruptionFallbacksEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="AsSpecifiedInMasterAgreement"/>
 *     &lt;enumeration value="AsSpecifiedInConfirmation"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DisruptionFallbacksEnum", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
@XmlEnum
public enum DisruptionFallbacksEnum {


    /**
     * The Disruption Fallback(s) are determined by reference to the relevant Master Agreement.
     * 
     */
    @XmlEnumValue("AsSpecifiedInMasterAgreement")
    AS_SPECIFIED_IN_MASTER_AGREEMENT("AsSpecifiedInMasterAgreement"),

    /**
     * The Disruption Fallback(s) are determined by reference to the relevant Confirmation.
     * 
     */
    @XmlEnumValue("AsSpecifiedInConfirmation")
    AS_SPECIFIED_IN_CONFIRMATION("AsSpecifiedInConfirmation");
    private final String value;

    DisruptionFallbacksEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DisruptionFallbacksEnum fromValue(String v) {
        for (DisruptionFallbacksEnum c: DisruptionFallbacksEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
