
package com.example.jaxb.fpml.recordkeeping;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A type defining how a stub calculation period amount is calculated. A single floating rate tenor different to that used for the regular part of the calculation periods schedule may be specified, or two floating rate tenors many be specified. If two floating rate tenors are specified then Linear Interpolation (in accordance with the 2000 ISDA Definitions, Section 8.3 Interpolation) is assumed to apply. Alternatively, an actual known stub rate or stub amount may be specified.
 * 
 * <p>Java class for StubValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StubValue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="floatingRate" type="{http://www.fpml.org/FpML-5/recordkeeping}StubFloatingRate" maxOccurs="2"/>
 *         &lt;element name="stubRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="stubAmount" type="{http://www.fpml.org/FpML-5/recordkeeping}Money"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StubValue", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "floatingRate",
    "stubRate",
    "stubAmount"
})
@XmlSeeAlso({
    Stub.class
})
public class StubValue {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<StubFloatingRate> floatingRate;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BigDecimal stubRate;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Money stubAmount;

    /**
     * Gets the value of the floatingRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the floatingRate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFloatingRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StubFloatingRate }
     * 
     * 
     */
    public List<StubFloatingRate> getFloatingRate() {
        if (floatingRate == null) {
            floatingRate = new ArrayList<StubFloatingRate>();
        }
        return this.floatingRate;
    }

    /**
     * Gets the value of the stubRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStubRate() {
        return stubRate;
    }

    /**
     * Sets the value of the stubRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStubRate(BigDecimal value) {
        this.stubRate = value;
    }

    /**
     * Gets the value of the stubAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getStubAmount() {
        return stubAmount;
    }

    /**
     * Sets the value of the stubAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setStubAmount(Money value) {
        this.stubAmount = value;
    }

}
