
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuotationSideEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QuotationSideEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Bid"/>
 *     &lt;enumeration value="Ask"/>
 *     &lt;enumeration value="Mid"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "QuotationSideEnum", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
@XmlEnum
public enum QuotationSideEnum {


    /**
     * A value "bid" by a buyer for an asset, i.e. the value a buyer is willing to pay.
     * 
     */
    @XmlEnumValue("Bid")
    BID("Bid"),

    /**
     * A value "asked" by a seller for an asset, i.e. the value at which a seller is willing to sell.
     * 
     */
    @XmlEnumValue("Ask")
    ASK("Ask"),

    /**
     * A value midway between the bid and the ask value.
     * 
     */
    @XmlEnumValue("Mid")
    MID("Mid");
    private final String value;

    QuotationSideEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static QuotationSideEnum fromValue(String v) {
        for (QuotationSideEnum c: QuotationSideEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
