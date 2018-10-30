
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A structure describing the value in "native" currency of an instrument that was traded.
 * 
 * <p>Java class for InstrumentTradePrincipal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InstrumentTradePrincipal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="principalAmount" type="{http://www.fpml.org/FpML-5/recordkeeping}NetAndGross" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstrumentTradePrincipal", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "principalAmount"
})
public class InstrumentTradePrincipal {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected NetAndGross principalAmount;

    /**
     * Gets the value of the principalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link NetAndGross }
     *     
     */
    public NetAndGross getPrincipalAmount() {
        return principalAmount;
    }

    /**
     * Sets the value of the principalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetAndGross }
     *     
     */
    public void setPrincipalAmount(NetAndGross value) {
        this.principalAmount = value;
    }

}
