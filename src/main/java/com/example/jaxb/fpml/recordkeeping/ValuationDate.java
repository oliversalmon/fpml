
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValuationDate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValuationDate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="singleValuationDate" type="{http://www.fpml.org/FpML-5/recordkeeping}SingleValuationDate"/>
 *         &lt;element name="multipleValuationDates" type="{http://www.fpml.org/FpML-5/recordkeeping}MultipleValuationDates"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValuationDate", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "singleValuationDate",
    "multipleValuationDates"
})
public class ValuationDate {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected SingleValuationDate singleValuationDate;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected MultipleValuationDates multipleValuationDates;

    /**
     * Gets the value of the singleValuationDate property.
     * 
     * @return
     *     possible object is
     *     {@link SingleValuationDate }
     *     
     */
    public SingleValuationDate getSingleValuationDate() {
        return singleValuationDate;
    }

    /**
     * Sets the value of the singleValuationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SingleValuationDate }
     *     
     */
    public void setSingleValuationDate(SingleValuationDate value) {
        this.singleValuationDate = value;
    }

    /**
     * Gets the value of the multipleValuationDates property.
     * 
     * @return
     *     possible object is
     *     {@link MultipleValuationDates }
     *     
     */
    public MultipleValuationDates getMultipleValuationDates() {
        return multipleValuationDates;
    }

    /**
     * Sets the value of the multipleValuationDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultipleValuationDates }
     *     
     */
    public void setMultipleValuationDates(MultipleValuationDates value) {
        this.multipleValuationDates = value;
    }

}
