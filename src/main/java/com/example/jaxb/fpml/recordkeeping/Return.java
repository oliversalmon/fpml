
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * A type describing the dividend return conditions applicable to the swap.
 * 
 * <p>Java class for Return complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Return">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="returnType" type="{http://www.fpml.org/FpML-5/recordkeeping}ReturnTypeEnum"/>
 *         &lt;element name="dividendConditions" type="{http://www.fpml.org/FpML-5/recordkeeping}DividendConditions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Return", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "returnType",
    "dividendConditions"
})
public class Return {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    @XmlSchemaType(name = "token")
    protected ReturnTypeEnum returnType;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected DividendConditions dividendConditions;

    /**
     * Gets the value of the returnType property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnTypeEnum }
     *     
     */
    public ReturnTypeEnum getReturnType() {
        return returnType;
    }

    /**
     * Sets the value of the returnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnTypeEnum }
     *     
     */
    public void setReturnType(ReturnTypeEnum value) {
        this.returnType = value;
    }

    /**
     * Gets the value of the dividendConditions property.
     * 
     * @return
     *     possible object is
     *     {@link DividendConditions }
     *     
     */
    public DividendConditions getDividendConditions() {
        return dividendConditions;
    }

    /**
     * Sets the value of the dividendConditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link DividendConditions }
     *     
     */
    public void setDividendConditions(DividendConditions value) {
        this.dividendConditions = value;
    }

}
