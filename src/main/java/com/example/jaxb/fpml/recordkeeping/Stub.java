
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A type defining how a stub calculation period amount is calculated and the start and end date of the stub. A single floating rate tenor different to that used for the regular part of the calculation periods schedule may be specified, or two floating rate tenors many be specified. If two floating rate tenors are specified then Linear Interpolation (in accordance with the 2000 ISDA Definitions, Section 8.3 Interpolation) is assumed to apply. Alternatively, an actual known stub rate or stub amount may be specified.
 * 
 * <p>Java class for Stub complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Stub">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}StubValue">
 *       &lt;sequence>
 *         &lt;element name="stubStartDate" type="{http://www.fpml.org/FpML-5/recordkeeping}AdjustableOrRelativeDate" minOccurs="0"/>
 *         &lt;element name="stubEndDate" type="{http://www.fpml.org/FpML-5/recordkeeping}AdjustableOrRelativeDate" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Stub", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "stubStartDate",
    "stubEndDate"
})
public class Stub
    extends StubValue
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected AdjustableOrRelativeDate stubStartDate;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected AdjustableOrRelativeDate stubEndDate;

    /**
     * Gets the value of the stubStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustableOrRelativeDate }
     *     
     */
    public AdjustableOrRelativeDate getStubStartDate() {
        return stubStartDate;
    }

    /**
     * Sets the value of the stubStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustableOrRelativeDate }
     *     
     */
    public void setStubStartDate(AdjustableOrRelativeDate value) {
        this.stubStartDate = value;
    }

    /**
     * Gets the value of the stubEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustableOrRelativeDate }
     *     
     */
    public AdjustableOrRelativeDate getStubEndDate() {
        return stubEndDate;
    }

    /**
     * Sets the value of the stubEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustableOrRelativeDate }
     *     
     */
    public void setStubEndDate(AdjustableOrRelativeDate value) {
        this.stubEndDate = value;
    }

}
