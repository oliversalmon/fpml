
package com.example.jaxb.fpml.recordkeeping;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FxKnockoutCount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FxKnockoutCount">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="conditionalFixings" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="settlementAtKnockout" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FxKnockoutCount", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "conditionalFixings",
    "settlementAtKnockout"
})
public class FxKnockoutCount {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    protected BigInteger conditionalFixings;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected boolean settlementAtKnockout;

    /**
     * Gets the value of the conditionalFixings property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getConditionalFixings() {
        return conditionalFixings;
    }

    /**
     * Sets the value of the conditionalFixings property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setConditionalFixings(BigInteger value) {
        this.conditionalFixings = value;
    }

    /**
     * Gets the value of the settlementAtKnockout property.
     * 
     */
    public boolean isSettlementAtKnockout() {
        return settlementAtKnockout;
    }

    /**
     * Sets the value of the settlementAtKnockout property.
     * 
     */
    public void setSettlementAtKnockout(boolean value) {
        this.settlementAtKnockout = value;
    }

}
