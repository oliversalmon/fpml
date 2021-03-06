
package com.example.jaxb.fpml.legal;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DayTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DayTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Business"/>
 *     &lt;enumeration value="Calendar"/>
 *     &lt;enumeration value="CommodityBusiness"/>
 *     &lt;enumeration value="CurrencyBusiness"/>
 *     &lt;enumeration value="ExchangeBusiness"/>
 *     &lt;enumeration value="ScheduledTradingDay"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DayTypeEnum", namespace = "http://www.fpml.org/FpML-5/legal")
@XmlEnum
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
public enum DayTypeEnum {


    /**
     * When calculating the number of days between two dates the count includes only business days.
     * 
     */
    @XmlEnumValue("Business")
    BUSINESS("Business"),

    /**
     * When calculating the number of days between two dates the count includes all calendar days.
     * 
     */
    @XmlEnumValue("Calendar")
    CALENDAR("Calendar"),

    /**
     * When calculating the number of days between two dates the count includes only commodity business days.
     * 
     */
    @XmlEnumValue("CommodityBusiness")
    COMMODITY_BUSINESS("CommodityBusiness"),

    /**
     * When calculating the number of days between two dates the count includes only currency business days.
     * 
     */
    @XmlEnumValue("CurrencyBusiness")
    CURRENCY_BUSINESS("CurrencyBusiness"),

    /**
     * When calculating the number of days between two dates the count includes only stock exchange business days.
     * 
     */
    @XmlEnumValue("ExchangeBusiness")
    EXCHANGE_BUSINESS("ExchangeBusiness"),

    /**
     * When calculating the number of days between two dates the count includes only scheduled trading days.
     * 
     */
    @XmlEnumValue("ScheduledTradingDay")
    SCHEDULED_TRADING_DAY("ScheduledTradingDay");
    private final String value;

    DayTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DayTypeEnum fromValue(String v) {
        for (DayTypeEnum c: DayTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
