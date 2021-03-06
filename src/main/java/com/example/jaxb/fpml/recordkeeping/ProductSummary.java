
package com.example.jaxb.fpml.recordkeeping;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Summary information about the product that was traded. This is intended primarily for trade reporting by TRs.
 * 
 * <p>Java class for ProductSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductSummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="finalSettlementDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="settlementType" type="{http://www.fpml.org/FpML-5/recordkeeping}SettlementTypeEnum" minOccurs="0"/>
 *         &lt;element name="seniority" type="{http://www.fpml.org/FpML-5/recordkeeping}CreditSeniority" minOccurs="0"/>
 *         &lt;element name="indexFactor" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="admissionToTrading" type="{http://www.fpml.org/FpML-5/recordkeeping}AdmissionToTrading" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductSummary", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "finalSettlementDate",
    "settlementType",
    "seniority",
    "indexFactor",
    "admissionToTrading"
})
public class ProductSummary {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar finalSettlementDate;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "token")
    protected SettlementTypeEnum settlementType;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CreditSeniority seniority;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BigDecimal indexFactor;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected AdmissionToTrading admissionToTrading;

    /**
     * Gets the value of the finalSettlementDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFinalSettlementDate() {
        return finalSettlementDate;
    }

    /**
     * Sets the value of the finalSettlementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFinalSettlementDate(XMLGregorianCalendar value) {
        this.finalSettlementDate = value;
    }

    /**
     * Gets the value of the settlementType property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementTypeEnum }
     *     
     */
    public SettlementTypeEnum getSettlementType() {
        return settlementType;
    }

    /**
     * Sets the value of the settlementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementTypeEnum }
     *     
     */
    public void setSettlementType(SettlementTypeEnum value) {
        this.settlementType = value;
    }

    /**
     * Gets the value of the seniority property.
     * 
     * @return
     *     possible object is
     *     {@link CreditSeniority }
     *     
     */
    public CreditSeniority getSeniority() {
        return seniority;
    }

    /**
     * Sets the value of the seniority property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditSeniority }
     *     
     */
    public void setSeniority(CreditSeniority value) {
        this.seniority = value;
    }

    /**
     * Gets the value of the indexFactor property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIndexFactor() {
        return indexFactor;
    }

    /**
     * Sets the value of the indexFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIndexFactor(BigDecimal value) {
        this.indexFactor = value;
    }

    /**
     * Gets the value of the admissionToTrading property.
     * 
     * @return
     *     possible object is
     *     {@link AdmissionToTrading }
     *     
     */
    public AdmissionToTrading getAdmissionToTrading() {
        return admissionToTrading;
    }

    /**
     * Sets the value of the admissionToTrading property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdmissionToTrading }
     *     
     */
    public void setAdmissionToTrading(AdmissionToTrading value) {
        this.admissionToTrading = value;
    }

}
