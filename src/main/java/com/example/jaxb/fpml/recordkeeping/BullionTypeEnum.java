
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BullionTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BullionTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Gold"/>
 *     &lt;enumeration value="Palladium"/>
 *     &lt;enumeration value="Platinum"/>
 *     &lt;enumeration value="Silver"/>
 *     &lt;enumeration value="Rhodium"/>
 *     &lt;enumeration value="RhodiumSponge"/>
 *     &lt;enumeration value="Iridium"/>
 *     &lt;enumeration value="Ruthenium"/>
 *     &lt;enumeration value="Osmium"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BullionTypeEnum", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
@XmlEnum
public enum BullionTypeEnum {


    /**
     * Gold. Quality as per the Good Delivery Rules issued by the London Bullion Market Association.
     * 
     */
    @XmlEnumValue("Gold")
    GOLD("Gold"),

    /**
     * Palladium. Quality as per the Good Delivery Rules issued by the London Platinum and Palladium Market.
     * 
     */
    @XmlEnumValue("Palladium")
    PALLADIUM("Palladium"),

    /**
     * Palladium. Quality as per the Good Delivery Rules issued by the London Platinum and Palladium Market.
     * 
     */
    @XmlEnumValue("Platinum")
    PLATINUM("Platinum"),

    /**
     * Silver. Quality as per the Good Delivery Rules issued by the London Bullion Market Association.
     * 
     */
    @XmlEnumValue("Silver")
    SILVER("Silver"),

    /**
     * Quality as per the Good Delivery Rules for Rhodium.
     * 
     */
    @XmlEnumValue("Rhodium")
    RHODIUM("Rhodium"),

    /**
     * DEPRECATED value which will be removed in FpML-6-0 onwards. Quality as per the Good Delivery Rules for Rhodium (Sponge) is too specific.
     * 
     */
    @XmlEnumValue("RhodiumSponge")
    RHODIUM_SPONGE("RhodiumSponge"),

    /**
     * Quality as per the Good Delivery Rules for Iridium.
     * 
     */
    @XmlEnumValue("Iridium")
    IRIDIUM("Iridium"),

    /**
     * Quality as per the Good Delivery Rules for Ruthenium.
     * 
     */
    @XmlEnumValue("Ruthenium")
    RUTHENIUM("Ruthenium"),

    /**
     * Quality as per the Good Delivery Rules for Osmium.
     * 
     */
    @XmlEnumValue("Osmium")
    OSMIUM("Osmium");
    private final String value;

    BullionTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BullionTypeEnum fromValue(String v) {
        for (BullionTypeEnum c: BullionTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
