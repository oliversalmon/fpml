
package com.example.jaxb.fpml.legal;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The English Law 2014 SCSA implementation, which extends StandardCreditSupportAnnexBase.
 * 
 * <p>Java class for StandardCreditSupportAnnex2014EnglishLaw complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StandardCreditSupportAnnex2014EnglishLaw">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/legal}StandardCreditSupportAnnexBase">
 *       &lt;sequence>
 *         &lt;element name="demandsAndNotices" type="{http://www.fpml.org/FpML-5/legal}PartyContactInformation" maxOccurs="unbounded"/>
 *         &lt;element name="independentAmountEligibleCreditSupport" type="{http://www.fpml.org/FpML-5/legal}IndependentAmountEligibleCollateral" maxOccurs="2"/>
 *         &lt;element name="valuationDateCity" type="{http://www.fpml.org/FpML-5/legal}BusinessCenters"/>
 *         &lt;element name="notificationTimeCity" type="{http://www.fpml.org/FpML-5/legal}BusinessCenter"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StandardCreditSupportAnnex2014EnglishLaw", namespace = "http://www.fpml.org/FpML-5/legal", propOrder = {
    "demandsAndNotices",
    "independentAmountEligibleCreditSupport",
    "valuationDateCity",
    "notificationTimeCity"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class StandardCreditSupportAnnex2014EnglishLaw
    extends StandardCreditSupportAnnexBase
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/legal", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected List<PartyContactInformation> demandsAndNotices;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/legal", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected List<IndependentAmountEligibleCollateral> independentAmountEligibleCreditSupport;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/legal", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected BusinessCenters valuationDateCity;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/legal", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected BusinessCenter notificationTimeCity;

    /**
     * Gets the value of the demandsAndNotices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the demandsAndNotices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDemandsAndNotices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyContactInformation }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public List<PartyContactInformation> getDemandsAndNotices() {
        if (demandsAndNotices == null) {
            demandsAndNotices = new ArrayList<PartyContactInformation>();
        }
        return this.demandsAndNotices;
    }

    /**
     * Gets the value of the independentAmountEligibleCreditSupport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the independentAmountEligibleCreditSupport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndependentAmountEligibleCreditSupport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndependentAmountEligibleCollateral }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public List<IndependentAmountEligibleCollateral> getIndependentAmountEligibleCreditSupport() {
        if (independentAmountEligibleCreditSupport == null) {
            independentAmountEligibleCreditSupport = new ArrayList<IndependentAmountEligibleCollateral>();
        }
        return this.independentAmountEligibleCreditSupport;
    }

    /**
     * Gets the value of the valuationDateCity property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessCenters }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public BusinessCenters getValuationDateCity() {
        return valuationDateCity;
    }

    /**
     * Sets the value of the valuationDateCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessCenters }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setValuationDateCity(BusinessCenters value) {
        this.valuationDateCity = value;
    }

    /**
     * Gets the value of the notificationTimeCity property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessCenter }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public BusinessCenter getNotificationTimeCity() {
        return notificationTimeCity;
    }

    /**
     * Sets the value of the notificationTimeCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessCenter }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setNotificationTimeCity(BusinessCenter value) {
        this.notificationTimeCity = value;
    }

}
