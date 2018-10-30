
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SettledEntityMatrix complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SettledEntityMatrix">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="matrixSource" type="{http://www.fpml.org/FpML-5/recordkeeping}MatrixSource" minOccurs="0"/>
 *         &lt;element name="publicationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettledEntityMatrix", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "matrixSource",
    "publicationDate"
})
public class SettledEntityMatrix {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected MatrixSource matrixSource;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar publicationDate;

    /**
     * Gets the value of the matrixSource property.
     * 
     * @return
     *     possible object is
     *     {@link MatrixSource }
     *     
     */
    public MatrixSource getMatrixSource() {
        return matrixSource;
    }

    /**
     * Sets the value of the matrixSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatrixSource }
     *     
     */
    public void setMatrixSource(MatrixSource value) {
        this.matrixSource = value;
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

}
