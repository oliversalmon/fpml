
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeeElectionEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FeeElectionEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="FlatFee"/>
 *     &lt;enumeration value="AmortizedFee"/>
 *     &lt;enumeration value="FundingFee"/>
 *     &lt;enumeration value="FlatFeeAndFundingFee"/>
 *     &lt;enumeration value="AmortizedFeeAndFundingFee"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FeeElectionEnum", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
@XmlEnum
public enum FeeElectionEnum {


    /**
     * The product of (i) the Break Fee Rate multiplied by (ii) the Equity Notional Amount corresponding to the Early Termination Portion.
     * 
     */
    @XmlEnumValue("FlatFee")
    FLAT_FEE("FlatFee"),

    /**
     * The product of (i) the Break Fee Rate multiplied by (ii) the Equity Notional Amount corresponding to the Early Termination Portion multiplied by (iii) the number of days from the Early Termination Date to the later of the Termination Date or the Cash Settlement Payment Date corresponding to the latest Valuation Date.
     * 
     */
    @XmlEnumValue("AmortizedFee")
    AMORTIZED_FEE("AmortizedFee"),

    /**
     * The product of (i) the Equity Notional Amount corresponding to the Early Termination Portion multiplied by (ii) the Break Funding Rate multiplied by (iii) the number of days from the Early Termination Date to the next scheduled Reset Date divided by (iv) a number equivalent to the denominator of the Day Count Fraction applicable to the Floating Rate Option.
     * 
     */
    @XmlEnumValue("FundingFee")
    FUNDING_FEE("FundingFee"),

    /**
     * Both Flat Fee and Funding Fee are applicable.
     * 
     */
    @XmlEnumValue("FlatFeeAndFundingFee")
    FLAT_FEE_AND_FUNDING_FEE("FlatFeeAndFundingFee"),

    /**
     * Amortized Fee and Funding Fee are applicable.
     * 
     */
    @XmlEnumValue("AmortizedFeeAndFundingFee")
    AMORTIZED_FEE_AND_FUNDING_FEE("AmortizedFeeAndFundingFee");
    private final String value;

    FeeElectionEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FeeElectionEnum fromValue(String v) {
        for (FeeElectionEnum c: FeeElectionEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
