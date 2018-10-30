
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ElectricityDeliveryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElectricityDeliveryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="firm" type="{http://www.fpml.org/FpML-5/recordkeeping}ElectricityDeliveryFirm"/>
 *         &lt;element name="nonFirm" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="systemFirm" type="{http://www.fpml.org/FpML-5/recordkeeping}ElectricityDeliverySystemFirm"/>
 *         &lt;element name="unitFirm" type="{http://www.fpml.org/FpML-5/recordkeeping}ElectricityDeliveryUnitFirm"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElectricityDeliveryType", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "firm",
    "nonFirm",
    "systemFirm",
    "unitFirm"
})
public class ElectricityDeliveryType {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected ElectricityDeliveryFirm firm;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean nonFirm;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected ElectricityDeliverySystemFirm systemFirm;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected ElectricityDeliveryUnitFirm unitFirm;

    /**
     * Gets the value of the firm property.
     * 
     * @return
     *     possible object is
     *     {@link ElectricityDeliveryFirm }
     *     
     */
    public ElectricityDeliveryFirm getFirm() {
        return firm;
    }

    /**
     * Sets the value of the firm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectricityDeliveryFirm }
     *     
     */
    public void setFirm(ElectricityDeliveryFirm value) {
        this.firm = value;
    }

    /**
     * Gets the value of the nonFirm property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNonFirm() {
        return nonFirm;
    }

    /**
     * Sets the value of the nonFirm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNonFirm(Boolean value) {
        this.nonFirm = value;
    }

    /**
     * Gets the value of the systemFirm property.
     * 
     * @return
     *     possible object is
     *     {@link ElectricityDeliverySystemFirm }
     *     
     */
    public ElectricityDeliverySystemFirm getSystemFirm() {
        return systemFirm;
    }

    /**
     * Sets the value of the systemFirm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectricityDeliverySystemFirm }
     *     
     */
    public void setSystemFirm(ElectricityDeliverySystemFirm value) {
        this.systemFirm = value;
    }

    /**
     * Gets the value of the unitFirm property.
     * 
     * @return
     *     possible object is
     *     {@link ElectricityDeliveryUnitFirm }
     *     
     */
    public ElectricityDeliveryUnitFirm getUnitFirm() {
        return unitFirm;
    }

    /**
     * Sets the value of the unitFirm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectricityDeliveryUnitFirm }
     *     
     */
    public void setUnitFirm(ElectricityDeliveryUnitFirm value) {
        this.unitFirm = value;
    }

}
