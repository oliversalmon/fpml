
package com.example.jaxb.fpml.legal;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * A structure describing the legal document.
 * 
 * <p>Java class for LegalDocument complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LegalDocument">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/legal}Document">
 *       &lt;sequence>
 *         &lt;element name="documentHeader" type="{http://www.fpml.org/FpML-5/legal}LegalDocumentHeader"/>
 *         &lt;element ref="{http://www.fpml.org/FpML-5/legal}contractualDocument"/>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/legal}PartiesAndAccounts.model" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LegalDocument", namespace = "http://www.fpml.org/FpML-5/legal", propOrder = {
    "documentHeader",
    "contractualDocument",
    "party",
    "account"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class LegalDocument
    extends Document
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/legal", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected LegalDocumentHeader documentHeader;
    @XmlElementRef(name = "contractualDocument", namespace = "http://www.fpml.org/FpML-5/legal", type = JAXBElement.class)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected JAXBElement<? extends ContractualDocument> contractualDocument;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/legal")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected List<Party> party;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/legal")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected List<Account> account;

    /**
     * Gets the value of the documentHeader property.
     * 
     * @return
     *     possible object is
     *     {@link LegalDocumentHeader }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public LegalDocumentHeader getDocumentHeader() {
        return documentHeader;
    }

    /**
     * Sets the value of the documentHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalDocumentHeader }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setDocumentHeader(LegalDocumentHeader value) {
        this.documentHeader = value;
    }

    /**
     * Gets the value of the contractualDocument property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StandardCreditSupportAnnex2013EnglishLaw }{@code >}
     *     {@link JAXBElement }{@code <}{@link ContractualDocument }{@code >}
     *     {@link JAXBElement }{@code <}{@link StandardCreditSupportAnnex2014EnglishLaw }{@code >}
     *     {@link JAXBElement }{@code <}{@link StandardCreditSupportAnnex2014NewYorkLaw }{@code >}
     *     {@link JAXBElement }{@code <}{@link StandardCreditSupportAnnexBase }{@code >}
     *     {@link JAXBElement }{@code <}{@link StandardCreditSupportAnnex2013NewYorkLaw }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public JAXBElement<? extends ContractualDocument> getContractualDocument() {
        return contractualDocument;
    }

    /**
     * Sets the value of the contractualDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StandardCreditSupportAnnex2013EnglishLaw }{@code >}
     *     {@link JAXBElement }{@code <}{@link ContractualDocument }{@code >}
     *     {@link JAXBElement }{@code <}{@link StandardCreditSupportAnnex2014EnglishLaw }{@code >}
     *     {@link JAXBElement }{@code <}{@link StandardCreditSupportAnnex2014NewYorkLaw }{@code >}
     *     {@link JAXBElement }{@code <}{@link StandardCreditSupportAnnexBase }{@code >}
     *     {@link JAXBElement }{@code <}{@link StandardCreditSupportAnnex2013NewYorkLaw }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setContractualDocument(JAXBElement<? extends ContractualDocument> value) {
        this.contractualDocument = value;
    }

    /**
     * Gets the value of the party property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the party property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Party }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public List<Party> getParty() {
        if (party == null) {
            party = new ArrayList<Party>();
        }
        return this.party;
    }

    /**
     * Gets the value of the account property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the account property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Account }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public List<Account> getAccount() {
        if (account == null) {
            account = new ArrayList<Account>();
        }
        return this.account;
    }

}
