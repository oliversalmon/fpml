
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SpecifiedPriceEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SpecifiedPriceEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Afternoon"/>
 *     &lt;enumeration value="Ask"/>
 *     &lt;enumeration value="Bid"/>
 *     &lt;enumeration value="Closing"/>
 *     &lt;enumeration value="High"/>
 *     &lt;enumeration value="Index"/>
 *     &lt;enumeration value="MeanOfBidAndAsk"/>
 *     &lt;enumeration value="LocationalMarginal"/>
 *     &lt;enumeration value="Low"/>
 *     &lt;enumeration value="MarginalHourly"/>
 *     &lt;enumeration value="MarketClearing"/>
 *     &lt;enumeration value="MeanOfHighAndLow"/>
 *     &lt;enumeration value="Morning"/>
 *     &lt;enumeration value="Official"/>
 *     &lt;enumeration value="Opening"/>
 *     &lt;enumeration value="OSP"/>
 *     &lt;enumeration value="Settlement"/>
 *     &lt;enumeration value="Spot"/>
 *     &lt;enumeration value="Midpoint"/>
 *     &lt;enumeration value="NationalSingle"/>
 *     &lt;enumeration value="WeightedAverage"/>
 *     &lt;enumeration value="UnWeightedAverage"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SpecifiedPriceEnum", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
@XmlEnum
public enum SpecifiedPriceEnum {


    /**
     * The Specified Price shall be the Afternoon fixing reported in or by the relevant Price Source as specified in the relevant Confirmation.
     * 
     */
    @XmlEnumValue("Afternoon")
    AFTERNOON("Afternoon"),

    /**
     * The Specified Price shall be the Ask price reported in or by the relevant Price Source as specified in the relevant Confirmation.
     * 
     */
    @XmlEnumValue("Ask")
    ASK("Ask"),

    /**
     * The Specified Price shall be the Bid price reported in or by the relevant Price Source as specified in the relevant Confirmation.
     * 
     */
    @XmlEnumValue("Bid")
    BID("Bid"),

    /**
     * The Specified Price shall be the Closing price reported in or by the relevant Price Source as specified in the relevant Confirmation.
     * 
     */
    @XmlEnumValue("Closing")
    CLOSING("Closing"),

    /**
     * The Specified Price shall be the High price reported in or by the relevant Price Source as specified in the relevant Confirmation.
     * 
     */
    @XmlEnumValue("High")
    HIGH("High"),

    /**
     * The Specified Price shall be the Index price reported in or by the relevant Price Source as specified in the relevant Confirmation.
     * 
     */
    @XmlEnumValue("Index")
    INDEX("Index"),

    /**
     * The Specified Price shall be the Average of the Bid and Ask prices reported in or by the relevant Price Source as specified in the relevant Confirmation.
     * 
     */
    @XmlEnumValue("MeanOfBidAndAsk")
    MEAN_OF_BID_AND_ASK("MeanOfBidAndAsk"),

    /**
     * The Specified Price shall be the Locational Marginal price reported in or by the relevant Price Source as specified in the relevant Confirmation.
     * 
     */
    @XmlEnumValue("LocationalMarginal")
    LOCATIONAL_MARGINAL("LocationalMarginal"),

    /**
     * The Specified Price shall be the Low price reported in or by the relevant Price Source as specified in the relevant Confirmation.
     * 
     */
    @XmlEnumValue("Low")
    LOW("Low"),

    /**
     * The Specified Price shall be the Marginal Hourly price reported in or by the relevant Price Source as specified in the relevant Confirmation.
     * 
     */
    @XmlEnumValue("MarginalHourly")
    MARGINAL_HOURLY("MarginalHourly"),

    /**
     * The Specified Price shall be the Market Clearing price reported in or by the relevant Price Source as specified in the relevant Confirmation.
     * 
     */
    @XmlEnumValue("MarketClearing")
    MARKET_CLEARING("MarketClearing"),

    /**
     * The Specified Price shall be the Average of the High and Low prices reported in or by the relevant Price Source as specified in the relevant Confirmation.
     * 
     */
    @XmlEnumValue("MeanOfHighAndLow")
    MEAN_OF_HIGH_AND_LOW("MeanOfHighAndLow"),

    /**
     * The Specified Price shall be the Morning fixing reported in or by the relevant Price Source as specified in the relevant Confirmation.
     * 
     */
    @XmlEnumValue("Morning")
    MORNING("Morning"),

    /**
     * The Specified Price shall be the Official price reported in or by the relevant Price Source as specified in the relevant Confirmation.
     * 
     */
    @XmlEnumValue("Official")
    OFFICIAL("Official"),

    /**
     * The Specified Price shall be the Opening price reported in or by the relevant Price Source as specified in the relevant Confirmation.
     * 
     */
    @XmlEnumValue("Opening")
    OPENING("Opening"),

    /**
     * The Specified Price shall be the Official Settlement Price reported in or by the relevant Price Source as specified in the relevant Confirmation.
     * 
     */
    OSP("OSP"),

    /**
     * The Specified Price shall be the Settlement price reported in or by the relevant Price Source as specified in the relevant Confirmation.
     * 
     */
    @XmlEnumValue("Settlement")
    SETTLEMENT("Settlement"),

    /**
     * The Specified Price shall be the Spot price reported in or by the relevant Price Source as specified in the relevant Confirmation.
     * 
     */
    @XmlEnumValue("Spot")
    SPOT("Spot"),

    /**
     * The Specified Price shall be the Average of the Midpoint of prices reported in or by the relevant Price Source as specified in the relevant Confirmation.
     * 
     */
    @XmlEnumValue("Midpoint")
    MIDPOINT("Midpoint"),

    /**
     * The Specified Price shall be the National Single price reported in or by the relevant Price Source as specified in the relevant Confirmation.
     * 
     */
    @XmlEnumValue("NationalSingle")
    NATIONAL_SINGLE("NationalSingle"),

    /**
     * The Specified Price shall be the Volume Weighted Average of prices effective on the Pricing Date reported in or by the relevant Price Source as specified in the relevant Confirmation.
     * 
     */
    @XmlEnumValue("WeightedAverage")
    WEIGHTED_AVERAGE("WeightedAverage"),

    /**
     * The Specified Price shall be the Non-volume Weighted Average of prices effective on the Pricing Date reported in or by the relevant Price Source as specified in the relevant Confirmation.
     * 
     */
    @XmlEnumValue("UnWeightedAverage")
    UN_WEIGHTED_AVERAGE("UnWeightedAverage");
    private final String value;

    SpecifiedPriceEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SpecifiedPriceEnum fromValue(String v) {
        for (SpecifiedPriceEnum c: SpecifiedPriceEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
