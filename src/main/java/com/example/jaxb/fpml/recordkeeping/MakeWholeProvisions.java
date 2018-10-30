
package com.example.jaxb.fpml.recordkeeping;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * A type to hold early exercise provisions.
 * 
 * <p>Java class for MakeWholeProvisions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MakeWholeProvisions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="makeWholeDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="recallSpread" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MakeWholeProvisions", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "makeWholeDate",
    "recallSpread"
})
public class MakeWholeProvisions {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar makeWholeDate;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BigDecimal recallSpread;

    /**
     * Gets the value of the makeWholeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMakeWholeDate() {
        return makeWholeDate;
    }

    /**
     * Sets the value of the makeWholeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMakeWholeDate(XMLGregorianCalendar value) {
        this.makeWholeDate = value;
    }

    /**
     * Gets the value of the recallSpread property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRecallSpread() {
        return recallSpread;
    }

    /**
     * Sets the value of the recallSpread property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRecallSpread(BigDecimal value) {
        this.recallSpread = value;
    }

}
