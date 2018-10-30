
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DividendAmountTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DividendAmountTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="RecordAmount"/>
 *     &lt;enumeration value="ExAmount"/>
 *     &lt;enumeration value="PaidAmount"/>
 *     &lt;enumeration value="AsSpecifiedInMasterConfirmation"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DividendAmountTypeEnum", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
@XmlEnum
public enum DividendAmountTypeEnum {


    /**
     *  100% of the gross cash dividend per Share paid over record date during relevant Dividend Period
     * 
     */
    @XmlEnumValue("RecordAmount")
    RECORD_AMOUNT("RecordAmount"),

    /**
     *  100% of gross cash dividend per Share paid after the Ex Div date during relevant Dividend Period.
     * 
     */
    @XmlEnumValue("ExAmount")
    EX_AMOUNT("ExAmount"),

    /**
     *  100% of gross cash dividend per Share paid during relevant Dividend Period.
     * 
     */
    @XmlEnumValue("PaidAmount")
    PAID_AMOUNT("PaidAmount"),

    /**
     * The Amount is determined as provided in the relevant Master Confirmation.
     * 
     */
    @XmlEnumValue("AsSpecifiedInMasterConfirmation")
    AS_SPECIFIED_IN_MASTER_CONFIRMATION("AsSpecifiedInMasterConfirmation");
    private final String value;

    DividendAmountTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DividendAmountTypeEnum fromValue(String v) {
        for (DividendAmountTypeEnum c: DividendAmountTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
