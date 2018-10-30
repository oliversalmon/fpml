
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Identifies the market sector in which the trade has been arranged.
 * 
 * <p>Java class for BrokerConfirmation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BrokerConfirmation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="brokerConfirmationType" type="{http://www.fpml.org/FpML-5/recordkeeping}BrokerConfirmationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BrokerConfirmation", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "brokerConfirmationType"
})
public class BrokerConfirmation {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BrokerConfirmationType brokerConfirmationType;

    /**
     * Gets the value of the brokerConfirmationType property.
     * 
     * @return
     *     possible object is
     *     {@link BrokerConfirmationType }
     *     
     */
    public BrokerConfirmationType getBrokerConfirmationType() {
        return brokerConfirmationType;
    }

    /**
     * Sets the value of the brokerConfirmationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrokerConfirmationType }
     *     
     */
    public void setBrokerConfirmationType(BrokerConfirmationType value) {
        this.brokerConfirmationType = value;
    }

}
