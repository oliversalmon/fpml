
package com.example.jaxb.fpml.recordkeeping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Provides supporting evidence when a party invoked exception to not execute the trade on facility such as SEF and DCM even though the particular product is mandated to execute on a SEF.
 * 
 * <p>Java class for FacilityExecutionExceptionDeclaration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FacilityExecutionExceptionDeclaration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reason" type="{http://www.fpml.org/FpML-5/recordkeeping}Token" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "FacilityExecutionExceptionDeclaration", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "reason",
    "organizationCharacteristic",
    "transactionCharacteristic",
    "supervisorRegistration"
})
public class FacilityExecutionExceptionDeclaration {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> reason;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<OrganizationCharacteristic> organizationCharacteristic;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<TransactionCharacteristic> transactionCharacteristic;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<SupervisorRegistration> supervisorRegistration;

    /**
     * Gets the value of the reason property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reason property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getReason() {
        if (reason == null) {
            reason = new ArrayList<String>();
        }
        return this.reason;
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
