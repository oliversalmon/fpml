
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GracePeriodExtension complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GracePeriodExtension">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="applicable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="gracePeriod" type="{http://www.fpml.org/FpML-5/recordkeeping}Offset" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GracePeriodExtension", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "applicable",
    "gracePeriod"
})
public class GracePeriodExtension {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean applicable;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Offset gracePeriod;

    /**
     * Gets the value of the applicable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApplicable() {
        return applicable;
    }

    /**
     * Sets the value of the applicable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApplicable(Boolean value) {
        this.applicable = value;
    }

    /**
     * Gets the value of the gracePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Offset }
     *     
     */
    public Offset getGracePeriod() {
        return gracePeriod;
    }

    /**
     * Sets the value of the gracePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Offset }
     *     
     */
    public void setGracePeriod(Offset value) {
        this.gracePeriod = value;
    }

}
