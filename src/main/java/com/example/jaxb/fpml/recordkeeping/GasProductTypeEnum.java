
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GasProductTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GasProductTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Butane"/>
 *     &lt;enumeration value="CarbonDioxide"/>
 *     &lt;enumeration value="EPMix"/>
 *     &lt;enumeration value="Ethane"/>
 *     &lt;enumeration value="Gasoline"/>
 *     &lt;enumeration value="Helium"/>
 *     &lt;enumeration value="HydrogenSulfide"/>
 *     &lt;enumeration value="Isobutane"/>
 *     &lt;enumeration value="Methane"/>
 *     &lt;enumeration value="Naphtha"/>
 *     &lt;enumeration value="NaturalGas"/>
 *     &lt;enumeration value="Nitrogen"/>
 *     &lt;enumeration value="Pentane"/>
 *     &lt;enumeration value="Propane"/>
 *     &lt;enumeration value="Propylene"/>
 *     &lt;enumeration value="Water"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GasProductTypeEnum", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
@XmlEnum
public enum GasProductTypeEnum {


    /**
     * Normal butane (C4H10)
     * 
     */
    @XmlEnumValue("Butane")
    BUTANE("Butane"),

    /**
     * Carbon Dioxide (CO2)
     * 
     */
    @XmlEnumValue("CarbonDioxide")
    CARBON_DIOXIDE("CarbonDioxide"),

    /**
     * Ethane-Propane Mix
     * 
     */
    @XmlEnumValue("EPMix")
    EP_MIX("EPMix"),

    /**
     * Ethane (C2H6)
     * 
     */
    @XmlEnumValue("Ethane")
    ETHANE("Ethane"),

    /**
     * Natural Gasoline (C4 – C12)
     * 
     */
    @XmlEnumValue("Gasoline")
    GASOLINE("Gasoline"),

    /**
     * Helium (He)
     * 
     */
    @XmlEnumValue("Helium")
    HELIUM("Helium"),

    /**
     * Hydrogen Sulfide (H2S)
     * 
     */
    @XmlEnumValue("HydrogenSulfide")
    HYDROGEN_SULFIDE("HydrogenSulfide"),

    /**
     * Iso-Butane (C4H10)
     * 
     */
    @XmlEnumValue("Isobutane")
    ISOBUTANE("Isobutane"),

    /**
     * Methane (CH4)
     * 
     */
    @XmlEnumValue("Methane")
    METHANE("Methane"),

    /**
     * Naphtha (C5 – C12)
     * 
     */
    @XmlEnumValue("Naphtha")
    NAPHTHA("Naphtha"),
    @XmlEnumValue("NaturalGas")
    NATURAL_GAS("NaturalGas"),

    /**
     * Nitrogen (N2)
     * 
     */
    @XmlEnumValue("Nitrogen")
    NITROGEN("Nitrogen"),

    /**
     * Pentane (C5H12)
     * 
     */
    @XmlEnumValue("Pentane")
    PENTANE("Pentane"),

    /**
     * Propane (C3H8)
     * 
     */
    @XmlEnumValue("Propane")
    PROPANE("Propane"),

    /**
     * Propylene or propene (C3H6)
     * 
     */
    @XmlEnumValue("Propylene")
    PROPYLENE("Propylene"),

    /**
     * Water Vapor (H2O)
     * 
     */
    @XmlEnumValue("Water")
    WATER("Water");
    private final String value;

    GasProductTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GasProductTypeEnum fromValue(String v) {
        for (GasProductTypeEnum c: GasProductTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
