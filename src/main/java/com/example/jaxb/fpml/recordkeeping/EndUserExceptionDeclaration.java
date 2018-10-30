
package com.example.jaxb.fpml.recordkeeping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Records supporting information justifying an end user exception under 17 CFR part 39.
 * 
 * <p>Java class for EndUserExceptionDeclaration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EndUserExceptionDeclaration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="creditDocument" type="{http://www.fpml.org/FpML-5/recordkeeping}CreditDocument" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="organizationCharacteristic" type="{http://www.fpml.org/FpML-5/recordkeeping}OrganizationCharacteristic" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="transactionCharacteristic" type="{http://www.fpml.org/FpML-5/recordkeeping}TransactionCharacteristic" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="supervisorRegistration" type="{http://www.fpml.org/FpML-5/recordkeeping}SupervisorRegistration" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EndUserExceptionDeclaration", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "creditDocument",
    "organizationCharacteristic",
    "transactionCharacteristic",
    "supervisorRegistration"
})
public class EndUserExceptionDeclaration {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<CreditDocument> creditDocument;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<OrganizationCharacteristic> organizationCharacteristic;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<TransactionCharacteristic> transactionCharacteristic;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<SupervisorRegistration> supervisorRegistration;

    /**
     * Gets the value of the creditDocument property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creditDocument property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreditDocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreditDocument }
     * 
     * 
     */
    public List<CreditDocument> getCreditDocument() {
        if (creditDocument == null) {
            creditDocument = new ArrayList<CreditDocument>();
        }
        return this.creditDocument;
    }

    /**
     * Gets the value of the organizationCharacteristic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organizationCharacteristic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganizationCharacteristic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganizationCharacteristic }
     * 
     * 
     */
    public List<OrganizationCharacteristic> getOrganizationCharacteristic() {
        if (organizationCharacteristic == null) {
            organizationCharacteristic = new ArrayList<OrganizationCharacteristic>();
        }
        return this.organizationCharacteristic;
    }

    /**
     * Gets the value of the transactionCharacteristic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transactionCharacteristic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransactionCharacteristic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionCharacteristic }
     * 
     * 
     */
    public List<TransactionCharacteristic> getTransactionCharacteristic() {
        if (transactionCharacteristic == null) {
            transactionCharacteristic = new ArrayList<TransactionCharacteristic>();
        }
        return this.transactionCharacteristic;
    }

    /**
     * Gets the value of the supervisorRegistration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supervisorRegistration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupervisorRegistration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupervisorRegistration }
     * 
     * 
     */
    public List<SupervisorRegistration> getSupervisorRegistration() {
        if (supervisorRegistration == null) {
            supervisorRegistration = new ArrayList<SupervisorRegistration>();
        }
        return this.supervisorRegistration;
    }

}
