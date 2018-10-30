
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NationalisationOrInsolvencyOrDelistingEventEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NationalisationOrInsolvencyOrDelistingEventEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="NegotiatedCloseout"/>
 *     &lt;enumeration value="CancellationAndPayment"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NationalisationOrInsolvencyOrDelistingEventEnum", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
@XmlEnum
public enum NationalisationOrInsolvencyOrDelistingEventEnum {


    /**
     * The parties may, but are not obliged, to terminate the transaction on mutually acceptable terms and if the terms are not agreed then the transaction continues.
     * 
     */
    @XmlEnumValue("NegotiatedCloseout")
    NEGOTIATED_CLOSEOUT("NegotiatedCloseout"),

    /**
     * The trade is terminated.
     * 
     */
    @XmlEnumValue("CancellationAndPayment")
    CANCELLATION_AND_PAYMENT("CancellationAndPayment");
    private final String value;

    NationalisationOrInsolvencyOrDelistingEventEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NationalisationOrInsolvencyOrDelistingEventEnum fromValue(String v) {
        for (NationalisationOrInsolvencyOrDelistingEventEnum c: NationalisationOrInsolvencyOrDelistingEventEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
