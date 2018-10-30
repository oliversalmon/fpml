
package com.example.jaxb.fpml.recordkeeping;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MultipleValuationDates complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MultipleValuationDates">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}SingleValuationDate">
 *       &lt;sequence>
 *         &lt;element name="businessDaysThereafter" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="numberValuationDates" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultipleValuationDates", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "businessDaysThereafter",
    "numberValuationDates"
})
public class MultipleValuationDates
    extends SingleValuationDate
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger businessDaysThereafter;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberValuationDates;

    /**
     * Gets the value of the businessDaysThereafter property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBusinessDaysThereafter() {
        return businessDaysThereafter;
    }

    /**
     * Sets the value of the businessDaysThereafter property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBusinessDaysThereafter(BigInteger value) {
        this.businessDaysThereafter = value;
    }

    /**
     * Gets the value of the numberValuationDates property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberValuationDates() {
        return numberValuationDates;
    }

    /**
     * Sets the value of the numberValuationDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberValuationDates(BigInteger value) {
        this.numberValuationDates = value;
    }

}
