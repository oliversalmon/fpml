
package com.example.jaxb.fpml.legal;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A type to specify the interest terms applicable to a margin terms agreement. Initially developed for the Standard CSA, but applicable in concept to other agreements.
 * 
 * <p>Java class for IndependentAmountInterestRate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndependentAmountInterestRate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="initialMarginInterestRateTerms" type="{http://www.fpml.org/FpML-5/legal}InitialMarginInterestRateTerms"/>
 *         &lt;element name="specifiedRate" type="{http://www.fpml.org/FpML-5/legal}SpecifiedRate" maxOccurs="unbounded"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndependentAmountInterestRate", namespace = "http://www.fpml.org/FpML-5/legal", propOrder = {
    "initialMarginInterestRateTerms",
    "specifiedRate"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class IndependentAmountInterestRate {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/legal")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected InitialMarginInterestRateTerms initialMarginInterestRateTerms;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/legal")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected List<SpecifiedRate> specifiedRate;

    /**
     * Gets the value of the initialMarginInterestRateTerms property.
     * 
     * @return
     *     possible object is
     *     {@link InitialMarginInterestRateTerms }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public InitialMarginInterestRateTerms getInitialMarginInterestRateTerms() {
        return initialMarginInterestRateTerms;
    }

    /**
     * Sets the value of the initialMarginInterestRateTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link InitialMarginInterestRateTerms }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setInitialMarginInterestRateTerms(InitialMarginInterestRateTerms value) {
        this.initialMarginInterestRateTerms = value;
    }

    /**
     * Gets the value of the specifiedRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specifiedRate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecifiedRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecifiedRate }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public List<SpecifiedRate> getSpecifiedRate() {
        if (specifiedRate == null) {
            specifiedRate = new ArrayList<SpecifiedRate>();
        }
        return this.specifiedRate;
    }

}
