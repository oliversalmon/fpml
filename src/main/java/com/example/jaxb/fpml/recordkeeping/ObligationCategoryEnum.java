
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ObligationCategoryEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ObligationCategoryEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Payment"/>
 *     &lt;enumeration value="BorrowedMoney"/>
 *     &lt;enumeration value="ReferenceObligationsOnly"/>
 *     &lt;enumeration value="Bond"/>
 *     &lt;enumeration value="Loan"/>
 *     &lt;enumeration value="BondOrLoan"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ObligationCategoryEnum", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
@XmlEnum
public enum ObligationCategoryEnum {


    /**
     * ISDA term "Payment".
     * 
     */
    @XmlEnumValue("Payment")
    PAYMENT("Payment"),

    /**
     * ISDA term "Borrowed Money".
     * 
     */
    @XmlEnumValue("BorrowedMoney")
    BORROWED_MONEY("BorrowedMoney"),

    /**
     * ISDA term "Reference Obligations Only".
     * 
     */
    @XmlEnumValue("ReferenceObligationsOnly")
    REFERENCE_OBLIGATIONS_ONLY("ReferenceObligationsOnly"),

    /**
     * ISDA term "Bond".
     * 
     */
    @XmlEnumValue("Bond")
    BOND("Bond"),

    /**
     * ISDA term "Loan".
     * 
     */
    @XmlEnumValue("Loan")
    LOAN("Loan"),

    /**
     * ISDA term "Bond or Loan".
     * 
     */
    @XmlEnumValue("BondOrLoan")
    BOND_OR_LOAN("BondOrLoan");
    private final String value;

    ObligationCategoryEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ObligationCategoryEnum fromValue(String v) {
        for (ObligationCategoryEnum c: ObligationCategoryEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
