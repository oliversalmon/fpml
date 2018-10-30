
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ConvertibleBond complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConvertibleBond">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}Bond">
 *       &lt;sequence>
 *         &lt;element name="underlyingEquity" type="{http://www.fpml.org/FpML-5/recordkeeping}EquityAsset" minOccurs="0"/>
 *         &lt;element name="redemptionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConvertibleBond", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "underlyingEquity",
    "redemptionDate"
})
public class ConvertibleBond
    extends Bond
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected EquityAsset underlyingEquity;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar redemptionDate;

    /**
     * Gets the value of the underlyingEquity property.
     * 
     * @return
     *     possible object is
     *     {@link EquityAsset }
     *     
     */
    public EquityAsset getUnderlyingEquity() {
        return underlyingEquity;
    }

    /**
     * Sets the value of the underlyingEquity property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquityAsset }
     *     
     */
    public void setUnderlyingEquity(EquityAsset value) {
        this.underlyingEquity = value;
    }

    /**
     * Gets the value of the redemptionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRedemptionDate() {
        return redemptionDate;
    }

    /**
     * Sets the value of the redemptionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRedemptionDate(XMLGregorianCalendar value) {
        this.redemptionDate = value;
    }

}
