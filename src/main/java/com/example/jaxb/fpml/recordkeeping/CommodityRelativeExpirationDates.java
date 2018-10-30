
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * The Expiration Dates of the trade relative to the Calculation Periods.
 * 
 * <p>Java class for CommodityRelativeExpirationDates complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommodityRelativeExpirationDates">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="expireRelativeToEvent" type="{http://www.fpml.org/FpML-5/recordkeeping}CommodityExpireRelativeToEvent" minOccurs="0"/>
 *         &lt;element name="expirationDateOffset" type="{http://www.fpml.org/FpML-5/recordkeeping}DateOffset" minOccurs="0"/>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}BusinessCentersOrReference.model" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommodityRelativeExpirationDates", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "expireRelativeToEvent",
    "expirationDateOffset",
    "businessCentersReference",
    "businessCenters"
})
public class CommodityRelativeExpirationDates {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CommodityExpireRelativeToEvent expireRelativeToEvent;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected DateOffset expirationDateOffset;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BusinessCentersReference businessCentersReference;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BusinessCenters businessCenters;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the expireRelativeToEvent property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityExpireRelativeToEvent }
     *     
     */
    public CommodityExpireRelativeToEvent getExpireRelativeToEvent() {
        return expireRelativeToEvent;
    }

    /**
     * Sets the value of the expireRelativeToEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityExpireRelativeToEvent }
     *     
     */
    public void setExpireRelativeToEvent(CommodityExpireRelativeToEvent value) {
        this.expireRelativeToEvent = value;
    }

    /**
     * Gets the value of the expirationDateOffset property.
     * 
     * @return
     *     possible object is
     *     {@link DateOffset }
     *     
     */
    public DateOffset getExpirationDateOffset() {
        return expirationDateOffset;
    }

    /**
     * Sets the value of the expirationDateOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateOffset }
     *     
     */
    public void setExpirationDateOffset(DateOffset value) {
        this.expirationDateOffset = value;
    }

    /**
     * Gets the value of the businessCentersReference property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessCentersReference }
     *     
     */
    public BusinessCentersReference getBusinessCentersReference() {
        return businessCentersReference;
    }

    /**
     * Sets the value of the businessCentersReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessCentersReference }
     *     
     */
    public void setBusinessCentersReference(BusinessCentersReference value) {
        this.businessCentersReference = value;
    }

    /**
     * Gets the value of the businessCenters property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessCenters }
     *     
     */
    public BusinessCenters getBusinessCenters() {
        return businessCenters;
    }

    /**
     * Sets the value of the businessCenters property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessCenters }
     *     
     */
    public void setBusinessCenters(BusinessCenters value) {
        this.businessCenters = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
