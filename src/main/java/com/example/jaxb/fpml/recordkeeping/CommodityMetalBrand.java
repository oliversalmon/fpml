
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommodityMetalBrand complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommodityMetalBrand">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.fpml.org/FpML-5/recordkeeping}CommodityMetalBrandName" minOccurs="0"/>
 *         &lt;element name="brandManager" type="{http://www.fpml.org/FpML-5/recordkeeping}CommodityMetalBrandManager" minOccurs="0"/>
 *         &lt;element name="country" type="{http://www.fpml.org/FpML-5/recordkeeping}CountryCode" minOccurs="0"/>
 *         &lt;element name="producer" type="{http://www.fpml.org/FpML-5/recordkeeping}CommodityMetalProducer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommodityMetalBrand", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "name",
    "brandManager",
    "country",
    "producer"
})
public class CommodityMetalBrand {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CommodityMetalBrandName name;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CommodityMetalBrandManager brandManager;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CountryCode country;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CommodityMetalProducer producer;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityMetalBrandName }
     *     
     */
    public CommodityMetalBrandName getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityMetalBrandName }
     *     
     */
    public void setName(CommodityMetalBrandName value) {
        this.name = value;
    }

    /**
     * Gets the value of the brandManager property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityMetalBrandManager }
     *     
     */
    public CommodityMetalBrandManager getBrandManager() {
        return brandManager;
    }

    /**
     * Sets the value of the brandManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityMetalBrandManager }
     *     
     */
    public void setBrandManager(CommodityMetalBrandManager value) {
        this.brandManager = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link CountryCode }
     *     
     */
    public CountryCode getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCode }
     *     
     */
    public void setCountry(CountryCode value) {
        this.country = value;
    }

    /**
     * Gets the value of the producer property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityMetalProducer }
     *     
     */
    public CommodityMetalProducer getProducer() {
        return producer;
    }

    /**
     * Sets the value of the producer property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityMetalProducer }
     *     
     */
    public void setProducer(CommodityMetalProducer value) {
        this.producer = value;
    }

}
