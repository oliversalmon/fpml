
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PayerReceiverEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PayerReceiverEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Payer"/>
 *     &lt;enumeration value="Receiver"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PayerReceiverEnum", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
@XmlEnum
public enum PayerReceiverEnum {


    /**
     * The party identified as the stream payer.
     * 
     */
    @XmlEnumValue("Payer")
    PAYER("Payer"),

    /**
     * The party identified as the stream receiver.
     * 
     */
    @XmlEnumValue("Receiver")
    RECEIVER("Receiver");
    private final String value;

    PayerReceiverEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PayerReceiverEnum fromValue(String v) {
        for (PayerReceiverEnum c: PayerReceiverEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
