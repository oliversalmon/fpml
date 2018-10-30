
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ContractualMatrix complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContractualMatrix">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="matrixType" type="{http://www.fpml.org/FpML-5/recordkeeping}MatrixType" minOccurs="0"/>
 *         &lt;element name="publicationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="matrixTerm" type="{http://www.fpml.org/FpML-5/recordkeeping}MatrixTerm" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractualMatrix", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "matrixType",
    "publicationDate",
    "matrixTerm"
})
public class ContractualMatrix {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected MatrixType matrixType;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar publicationDate;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected MatrixTerm matrixTerm;

    /**
     * Gets the value of the matrixType property.
     * 
     * @return
     *     possible object is
     *     {@link MatrixType }
     *     
     */
    public MatrixType getMatrixType() {
        return matrixType;
    }

    /**
     * Sets the value of the matrixType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatrixType }
     *     
     */
    public void setMatrixType(MatrixType value) {
        this.matrixType = value;
    }

    /**
     * Gets the value of the publicationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPublicationDate() {
        return publicationDate;
    }

    /**
     * Sets the value of the publicationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPublicationDate(XMLGregorianCalendar value) {
        this.publicationDate = value;
    }

    /**
     * Gets the value of the matrixTerm property.
     * 
     * @return
     *     possible object is
     *     {@link MatrixTerm }
     *     
     */
    public MatrixTerm getMatrixTerm() {
        return matrixTerm;
    }

    /**
     * Sets the value of the matrixTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatrixTerm }
     *     
     */
    public void setMatrixTerm(MatrixTerm value) {
        this.matrixTerm = value;
    }

}
