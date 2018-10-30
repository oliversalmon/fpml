
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * A type that represents the choice of methods for settling a potential currency payment resulting from a trade: by means of a standard settlement instruction, by netting it out with other payments, or with an explicit settlement instruction.
 * 
 * <p>Java class for SettlementInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SettlementInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="standardSettlementStyle" type="{http://www.fpml.org/FpML-5/recordkeeping}StandardSettlementStyleEnum"/>
 *         &lt;element name="settlementInstruction" type="{http://www.fpml.org/FpML-5/recordkeeping}SettlementInstruction"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementInformation", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "standardSettlementStyle",
    "settlementInstruction"
})
public class SettlementInformation {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "token")
    protected StandardSettlementStyleEnum standardSettlementStyle;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected SettlementInstruction settlementInstruction;

    /**
     * Gets the value of the standardSettlementStyle property.
     * 
     * @return
     *     possible object is
     *     {@link StandardSettlementStyleEnum }
     *     
     */
    public StandardSettlementStyleEnum getStandardSettlementStyle() {
        return standardSettlementStyle;
    }

    /**
     * Sets the value of the standardSettlementStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link StandardSettlementStyleEnum }
     *     
     */
    public void setStandardSettlementStyle(StandardSettlementStyleEnum value) {
        this.standardSettlementStyle = value;
    }

    /**
     * Gets the value of the settlementInstruction property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementInstruction }
     *     
     */
    public SettlementInstruction getSettlementInstruction() {
        return settlementInstruction;
    }

    /**
     * Sets the value of the settlementInstruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementInstruction }
     *     
     */
    public void setSettlementInstruction(SettlementInstruction value) {
        this.settlementInstruction = value;
    }

}
