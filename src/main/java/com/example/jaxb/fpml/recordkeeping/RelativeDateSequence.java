
package com.example.jaxb.fpml.recordkeeping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A type describing a date when this date is defined in reference to another date through one or several date offsets.
 * 
 * <p>Java class for RelativeDateSequence complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelativeDateSequence">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dateRelativeTo" type="{http://www.fpml.org/FpML-5/recordkeeping}DateReference" minOccurs="0"/>
 *         &lt;element name="dateOffset" type="{http://www.fpml.org/FpML-5/recordkeeping}DateOffset" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}BusinessCentersOrReference.model" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelativeDateSequence", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "dateRelativeTo",
    "dateOffset",
    "businessCentersReference",
    "businessCenters"
})
public class RelativeDateSequence {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected DateReference dateRelativeTo;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<DateOffset> dateOffset;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BusinessCentersReference businessCentersReference;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BusinessCenters businessCenters;

    /**
     * Gets the value of the dateRelativeTo property.
     * 
     * @return
     *     possible object is
     *     {@link DateReference }
     *     
     */
    public DateReference getDateRelativeTo() {
        return dateRelativeTo;
    }

    /**
     * Sets the value of the dateRelativeTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateReference }
     *     
     */
    public void setDateRelativeTo(DateReference value) {
        this.dateRelativeTo = value;
    }

    /**
     * Gets the value of the dateOffset property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dateOffset property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDateOffset().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DateOffset }
     * 
     * 
     */
    public List<DateOffset> getDateOffset() {
        if (dateOffset == null) {
            dateOffset = new ArrayList<DateOffset>();
        }
        return this.dateOffset;
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

}
