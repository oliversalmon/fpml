
package com.example.jaxb.fpml.recordkeeping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * A structure describing the price paid for the instrument.
 * 
 * <p>Java class for InstrumentTradePricing complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InstrumentTradePricing">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="quote" type="{http://www.fpml.org/FpML-5/recordkeeping}BasicQuotation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="couponStartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="exDividendDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="tradedFlatOfAccrued" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstrumentTradePricing", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "quote",
    "couponStartDate",
    "exDividendDate",
    "tradedFlatOfAccrued"
})
public class InstrumentTradePricing {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<BasicQuotation> quote;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar couponStartDate;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar exDividendDate;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean tradedFlatOfAccrued;

    /**
     * Gets the value of the quote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BasicQuotation }
     * 
     * 
     */
    public List<BasicQuotation> getQuote() {
        if (quote == null) {
            quote = new ArrayList<BasicQuotation>();
        }
        return this.quote;
    }

    /**
     * Gets the value of the couponStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCouponStartDate() {
        return couponStartDate;
    }

    /**
     * Sets the value of the couponStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCouponStartDate(XMLGregorianCalendar value) {
        this.couponStartDate = value;
    }

    /**
     * Gets the value of the exDividendDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExDividendDate() {
        return exDividendDate;
    }

    /**
     * Sets the value of the exDividendDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExDividendDate(XMLGregorianCalendar value) {
        this.exDividendDate = value;
    }

    /**
     * Gets the value of the tradedFlatOfAccrued property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTradedFlatOfAccrued() {
        return tradedFlatOfAccrued;
    }

    /**
     * Sets the value of the tradedFlatOfAccrued property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTradedFlatOfAccrued(Boolean value) {
        this.tradedFlatOfAccrued = value;
    }

}