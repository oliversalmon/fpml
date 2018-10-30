
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommodityReturnCalculationFormulaEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CommodityReturnCalculationFormulaEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="SimpleFormula"/>
 *     &lt;enumeration value="CompoundFormula"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CommodityReturnCalculationFormulaEnum", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
@XmlEnum
public enum CommodityReturnCalculationFormulaEnum {


    /**
     * The value is when the cash settlement amount is the simple formula: Notional Amount * ((Index Level sub d / Index Level sub d-1) - 1). That is, when the cash settlement amount is the Notional Amount for the calculation period multiplied by the ratio of the index level on the reset date/valuation date divided by the index level on the immediately preceding reset date/valuation date minus one.
     * 
     */
    @XmlEnumValue("SimpleFormula")
    SIMPLE_FORMULA("SimpleFormula"),

    /**
     * The value is when the cash settlement amount is the compound formula:
     * 
     */
    @XmlEnumValue("CompoundFormula")
    COMPOUND_FORMULA("CompoundFormula");
    private final String value;

    CommodityReturnCalculationFormulaEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CommodityReturnCalculationFormulaEnum fromValue(String v) {
        for (CommodityReturnCalculationFormulaEnum c: CommodityReturnCalculationFormulaEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
