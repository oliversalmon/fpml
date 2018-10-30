
package com.example.jaxb.fpml.legal;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The day count used as the denominator for interest accrual calculation as specififed in the ISDA Standard CSA. The day count applies to all currencies, unless specified.
 * 
 * <p>Java class for DayCount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DayCount">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="defaultDayCount" type="{http://www.fpml.org/FpML-5/legal}DayCountDenominator"/>
 *         &lt;element name="currencySpecificDayCount" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="dayCountValue" type="{http://www.fpml.org/FpML-5/legal}DayCountDenominator"/>
 *                   &lt;element name="currency" type="{http://www.fpml.org/FpML-5/legal}Currency"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DayCount", namespace = "http://www.fpml.org/FpML-5/legal", propOrder = {
    "defaultDayCount",
    "currencySpecificDayCount"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class DayCount {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/legal", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected DayCountDenominator defaultDayCount;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/legal")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected List<DayCount.CurrencySpecificDayCount> currencySpecificDayCount;

    /**
     * Gets the value of the defaultDayCount property.
     * 
     * @return
     *     possible object is
     *     {@link DayCountDenominator }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public DayCountDenominator getDefaultDayCount() {
        return defaultDayCount;
    }

    /**
     * Sets the value of the defaultDayCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link DayCountDenominator }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setDefaultDayCount(DayCountDenominator value) {
        this.defaultDayCount = value;
    }

    /**
     * Gets the value of the currencySpecificDayCount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the currencySpecificDayCount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurrencySpecificDayCount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DayCount.CurrencySpecificDayCount }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public List<DayCount.CurrencySpecificDayCount> getCurrencySpecificDayCount() {
        if (currencySpecificDayCount == null) {
            currencySpecificDayCount = new ArrayList<DayCount.CurrencySpecificDayCount>();
        }
        return this.currencySpecificDayCount;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="dayCountValue" type="{http://www.fpml.org/FpML-5/legal}DayCountDenominator"/>
     *         &lt;element name="currency" type="{http://www.fpml.org/FpML-5/legal}Currency"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "dayCountValue",
        "currency"
    })
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public static class CurrencySpecificDayCount {

        @XmlElement(namespace = "http://www.fpml.org/FpML-5/legal", required = true)
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
        protected DayCountDenominator dayCountValue;
        @XmlElement(namespace = "http://www.fpml.org/FpML-5/legal", required = true)
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
        protected Currency currency;

        /**
         * Gets the value of the dayCountValue property.
         * 
         * @return
         *     possible object is
         *     {@link DayCountDenominator }
         *     
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public DayCountDenominator getDayCountValue() {
            return dayCountValue;
        }

        /**
         * Sets the value of the dayCountValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link DayCountDenominator }
         *     
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public void setDayCountValue(DayCountDenominator value) {
            this.dayCountValue = value;
        }

        /**
         * Gets the value of the currency property.
         * 
         * @return
         *     possible object is
         *     {@link Currency }
         *     
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public Currency getCurrency() {
            return currency;
        }

        /**
         * Sets the value of the currency property.
         * 
         * @param value
         *     allowed object is
         *     {@link Currency }
         *     
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public void setCurrency(Currency value) {
            this.currency = value;
        }

    }

}
