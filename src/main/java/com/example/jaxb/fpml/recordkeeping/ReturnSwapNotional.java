
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Specifies the notional of return type swap. When used in the equity leg, the definition will typically combine the actual amount (using the notional component defined by the FpML industry group) and the determination method. When used in the interest leg, the definition will typically point to the definition of the equity leg.
 * 
 * <p>Java class for ReturnSwapNotional complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReturnSwapNotional">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="relativeNotionalAmount" type="{http://www.fpml.org/FpML-5/recordkeeping}ReturnSwapNotionalAmountReference"/>
 *         &lt;element name="relativeDeterminationMethod" type="{http://www.fpml.org/FpML-5/recordkeeping}DeterminationMethodReference"/>
 *         &lt;element name="determinationMethod" type="{http://www.fpml.org/FpML-5/recordkeeping}DeterminationMethod"/>
 *         &lt;element name="notionalAmount" type="{http://www.fpml.org/FpML-5/recordkeeping}NotionalAmount"/>
 *       &lt;/choice>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReturnSwapNotional", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "relativeNotionalAmount",
    "relativeDeterminationMethod",
    "determinationMethod",
    "notionalAmount"
})
public class ReturnSwapNotional {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected ReturnSwapNotionalAmountReference relativeNotionalAmount;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected DeterminationMethodReference relativeDeterminationMethod;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected DeterminationMethod determinationMethod;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected NotionalAmount notionalAmount;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the relativeNotionalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnSwapNotionalAmountReference }
     *     
     */
    public ReturnSwapNotionalAmountReference getRelativeNotionalAmount() {
        return relativeNotionalAmount;
    }

    /**
     * Sets the value of the relativeNotionalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnSwapNotionalAmountReference }
     *     
     */
    public void setRelativeNotionalAmount(ReturnSwapNotionalAmountReference value) {
        this.relativeNotionalAmount = value;
    }

    /**
     * Gets the value of the relativeDeterminationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link DeterminationMethodReference }
     *     
     */
    public DeterminationMethodReference getRelativeDeterminationMethod() {
        return relativeDeterminationMethod;
    }

    /**
     * Sets the value of the relativeDeterminationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeterminationMethodReference }
     *     
     */
    public void setRelativeDeterminationMethod(DeterminationMethodReference value) {
        this.relativeDeterminationMethod = value;
    }

    /**
     * Gets the value of the determinationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link DeterminationMethod }
     *     
     */
    public DeterminationMethod getDeterminationMethod() {
        return determinationMethod;
    }

    /**
     * Sets the value of the determinationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeterminationMethod }
     *     
     */
    public void setDeterminationMethod(DeterminationMethod value) {
        this.determinationMethod = value;
    }

    /**
     * Gets the value of the notionalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link NotionalAmount }
     *     
     */
    public NotionalAmount getNotionalAmount() {
        return notionalAmount;
    }

    /**
     * Sets the value of the notionalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotionalAmount }
     *     
     */
    public void setNotionalAmount(NotionalAmount value) {
        this.notionalAmount = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
