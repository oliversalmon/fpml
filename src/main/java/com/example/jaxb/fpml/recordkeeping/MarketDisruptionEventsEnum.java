
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MarketDisruptionEventsEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MarketDisruptionEventsEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Applicable"/>
 *     &lt;enumeration value="NotApplicable"/>
 *     &lt;enumeration value="AsSpecifiedInMasterAgreement"/>
 *     &lt;enumeration value="AsSpecifiedInConfirmation"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MarketDisruptionEventsEnum", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
@XmlEnum
public enum MarketDisruptionEventsEnum {


    /**
     * Market Disruption Events are applicable.
     * 
     */
    @XmlEnumValue("Applicable")
    APPLICABLE("Applicable"),

    /**
     * Market Disruption Events are not applicable.
     * 
     */
    @XmlEnumValue("NotApplicable")
    NOT_APPLICABLE("NotApplicable"),

    /**
     * The Market Disruption Event(s) are determined by reference to the relevant Master Agreement.
     * 
     */
    @XmlEnumValue("AsSpecifiedInMasterAgreement")
    AS_SPECIFIED_IN_MASTER_AGREEMENT("AsSpecifiedInMasterAgreement"),

    /**
     * The Market Disruption Event(s) are determined by reference to the relevant Confirmation.
     * 
     */
    @XmlEnumValue("AsSpecifiedInConfirmation")
    AS_SPECIFIED_IN_CONFIRMATION("AsSpecifiedInConfirmation");
    private final String value;

    MarketDisruptionEventsEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MarketDisruptionEventsEnum fromValue(String v) {
        for (MarketDisruptionEventsEnum c: MarketDisruptionEventsEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
