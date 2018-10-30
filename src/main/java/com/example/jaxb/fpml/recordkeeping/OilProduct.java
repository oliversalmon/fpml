
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The specification of the oil product to be delivered.
 * 
 * <p>Java class for OilProduct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OilProduct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://www.fpml.org/FpML-5/recordkeeping}OilProductType"/>
 *         &lt;element name="grade" type="{http://www.fpml.org/FpML-5/recordkeeping}CommodityProductGrade"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OilProduct", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "type",
    "grade"
})
public class OilProduct {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    protected OilProductType type;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    protected CommodityProductGrade grade;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link OilProductType }
     *     
     */
    public OilProductType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link OilProductType }
     *     
     */
    public void setType(OilProductType value) {
        this.type = value;
    }

    /**
     * Gets the value of the grade property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityProductGrade }
     *     
     */
    public CommodityProductGrade getGrade() {
        return grade;
    }

    /**
     * Sets the value of the grade property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityProductGrade }
     *     
     */
    public void setGrade(CommodityProductGrade value) {
        this.grade = value;
    }

}
