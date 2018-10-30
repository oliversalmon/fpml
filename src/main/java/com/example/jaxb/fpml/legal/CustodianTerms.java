
package com.example.jaxb.fpml.legal;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * The stipulation of the terms under which a custody agent will be deemed acceptable by the parties. This construct has been initially developed for the purpose of the Standard CSA.
 * 
 * <p>Java class for CustodianTerms complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustodianTerms">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="minimumAssets" type="{http://www.fpml.org/FpML-5/legal}Money" minOccurs="0"/>
 *         &lt;element name="minimumRating" type="{http://www.fpml.org/FpML-5/legal}CreditNotations" minOccurs="0"/>
 *         &lt;element name="initialDesignation" type="{http://www.fpml.org/FpML-5/legal}Token" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustodianTerms", namespace = "http://www.fpml.org/FpML-5/legal", propOrder = {
    "minimumAssets",
    "minimumRating",
    "initialDesignation"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class CustodianTerms {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/legal")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Money minimumAssets;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/legal")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected CreditNotations minimumRating;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/legal")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String initialDesignation;

    /**
     * Gets the value of the minimumAssets property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Money getMinimumAssets() {
        return minimumAssets;
    }

    /**
     * Sets the value of the minimumAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setMinimumAssets(Money value) {
        this.minimumAssets = value;
    }

    /**
     * Gets the value of the minimumRating property.
     * 
     * @return
     *     possible object is
     *     {@link CreditNotations }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public CreditNotations getMinimumRating() {
        return minimumRating;
    }

    /**
     * Sets the value of the minimumRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditNotations }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setMinimumRating(CreditNotations value) {
        this.minimumRating = value;
    }

    /**
     * Gets the value of the initialDesignation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getInitialDesignation() {
        return initialDesignation;
    }

    /**
     * Sets the value of the initialDesignation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setInitialDesignation(String value) {
        this.initialDesignation = value;
    }

}
