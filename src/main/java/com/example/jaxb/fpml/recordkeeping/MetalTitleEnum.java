
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MetalTitleEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MetalTitleEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="TransfersWithRiskOfLoss"/>
 *     &lt;enumeration value="DoesNotTransferWithRiskOfLoss"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MetalTitleEnum", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
@XmlEnum
public enum MetalTitleEnum {


    /**
     * Transfers with Risk of Loss.
     * 
     */
    @XmlEnumValue("TransfersWithRiskOfLoss")
    TRANSFERS_WITH_RISK_OF_LOSS("TransfersWithRiskOfLoss"),

    /**
     * Does Not Transfer with Risk of Loss.
     * 
     */
    @XmlEnumValue("DoesNotTransferWithRiskOfLoss")
    DOES_NOT_TRANSFER_WITH_RISK_OF_LOSS("DoesNotTransferWithRiskOfLoss");
    private final String value;

    MetalTitleEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MetalTitleEnum fromValue(String v) {
        for (MetalTitleEnum c: MetalTitleEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
