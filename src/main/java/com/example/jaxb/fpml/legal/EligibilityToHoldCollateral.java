
package com.example.jaxb.fpml.legal;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The conditions under which a party and its custodians are entitled to hold collateral.
 * 
 * <p>Java class for EligibilityToHoldCollateral complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EligibilityToHoldCollateral">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="holdingPostedCollateral" type="{http://www.fpml.org/FpML-5/legal}HoldingPostedCollateral" maxOccurs="unbounded"/>
 *         &lt;element name="custodianTerms" type="{http://www.fpml.org/FpML-5/legal}CustodianTerms" minOccurs="0"/>
 *         &lt;element name="eligibleCountry" type="{http://www.fpml.org/FpML-5/legal}CountryCode" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EligibilityToHoldCollateral", namespace = "http://www.fpml.org/FpML-5/legal", propOrder = {
    "holdingPostedCollateral",
    "custodianTerms",
    "eligibleCountry"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class EligibilityToHoldCollateral {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/legal", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected List<HoldingPostedCollateral> holdingPostedCollateral;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/legal")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected CustodianTerms custodianTerms;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/legal")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected List<CountryCode> eligibleCountry;

    /**
     * Gets the value of the holdingPostedCollateral property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the holdingPostedCollateral property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHoldingPostedCollateral().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HoldingPostedCollateral }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public List<HoldingPostedCollateral> getHoldingPostedCollateral() {
        if (holdingPostedCollateral == null) {
            holdingPostedCollateral = new ArrayList<HoldingPostedCollateral>();
        }
        return this.holdingPostedCollateral;
    }

    /**
     * Gets the value of the custodianTerms property.
     * 
     * @return
     *     possible object is
     *     {@link CustodianTerms }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public CustodianTerms getCustodianTerms() {
        return custodianTerms;
    }

    /**
     * Sets the value of the custodianTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustodianTerms }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setCustodianTerms(CustodianTerms value) {
        this.custodianTerms = value;
    }

    /**
     * Gets the value of the eligibleCountry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eligibleCountry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEligibleCountry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CountryCode }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public List<CountryCode> getEligibleCountry() {
        if (eligibleCountry == null) {
            eligibleCountry = new ArrayList<CountryCode>();
        }
        return this.eligibleCountry;
    }

}
