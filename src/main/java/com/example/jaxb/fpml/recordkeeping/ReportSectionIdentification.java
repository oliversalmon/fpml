
package com.example.jaxb.fpml.recordkeeping;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A type that allows the specific report and section to be identified.
 * 
 * <p>Java class for ReportSectionIdentification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReportSectionIdentification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reportId" type="{http://www.fpml.org/FpML-5/recordkeeping}ReportId" minOccurs="0"/>
 *         &lt;element name="sectionNumber" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportSectionIdentification", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "reportId",
    "sectionNumber"
})
@XmlSeeAlso({
    ReportIdentification.class
})
public class ReportSectionIdentification {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected ReportId reportId;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger sectionNumber;

    /**
     * Gets the value of the reportId property.
     * 
     * @return
     *     possible object is
     *     {@link ReportId }
     *     
     */
    public ReportId getReportId() {
        return reportId;
    }

    /**
     * Sets the value of the reportId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportId }
     *     
     */
    public void setReportId(ReportId value) {
        this.reportId = value;
    }

    /**
     * Gets the value of the sectionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSectionNumber() {
        return sectionNumber;
    }

    /**
     * Sets the value of the sectionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSectionNumber(BigInteger value) {
        this.sectionNumber = value;
    }

}
