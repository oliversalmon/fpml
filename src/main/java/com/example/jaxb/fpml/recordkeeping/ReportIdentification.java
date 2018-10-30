
package com.example.jaxb.fpml.recordkeeping;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * A type that allows the specific report and section to be identified.
 * 
 * <p>Java class for ReportIdentification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReportIdentification">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}ReportSectionIdentification">
 *       &lt;sequence>
 *         &lt;element name="numberOfSections" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="submissionsComplete" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportIdentification", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "numberOfSections",
    "submissionsComplete"
})
public class ReportIdentification
    extends ReportSectionIdentification
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfSections;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean submissionsComplete;

    /**
     * Gets the value of the numberOfSections property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfSections() {
        return numberOfSections;
    }

    /**
     * Sets the value of the numberOfSections property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfSections(BigInteger value) {
        this.numberOfSections = value;
    }

    /**
     * Gets the value of the submissionsComplete property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSubmissionsComplete() {
        return submissionsComplete;
    }

    /**
     * Sets the value of the submissionsComplete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSubmissionsComplete(Boolean value) {
        this.submissionsComplete = value;
    }

}
