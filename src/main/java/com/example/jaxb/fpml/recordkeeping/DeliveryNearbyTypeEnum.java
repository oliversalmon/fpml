
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeliveryNearbyTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DeliveryNearbyTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="CalculationPeriod"/>
 *     &lt;enumeration value="NearbyMonth"/>
 *     &lt;enumeration value="NearbyWeek"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DeliveryNearbyTypeEnum", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
@XmlEnum
public enum DeliveryNearbyTypeEnum {


    /**
     * Describes the contract to be the contract that pertains to the month-year of the calculation period. If used, the nearby count is expected to be 0.
     * 
     */
    @XmlEnumValue("CalculationPeriod")
    CALCULATION_PERIOD("CalculationPeriod"),

    /**
     * The Delivery Date of the underlying Commodity shall be the month of expiration of the futures contract.
     * 
     */
    @XmlEnumValue("NearbyMonth")
    NEARBY_MONTH("NearbyMonth"),

    /**
     * The Delivery Date of the underlying Commodity shall be the Week of expiration of the futures contract.
     * 
     */
    @XmlEnumValue("NearbyWeek")
    NEARBY_WEEK("NearbyWeek");
    private final String value;

    DeliveryNearbyTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DeliveryNearbyTypeEnum fromValue(String v) {
        for (DeliveryNearbyTypeEnum c: DeliveryNearbyTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
