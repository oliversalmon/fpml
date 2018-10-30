
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Knock In means option to exercise comes into existence. Knock Out means option to exercise goes out of existence.
 * 
 * <p>Java class for Knock complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Knock">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="knockIn" type="{http://www.fpml.org/FpML-5/recordkeeping}TriggerEvent" minOccurs="0"/>
 *         &lt;element name="knockOut" type="{http://www.fpml.org/FpML-5/recordkeeping}TriggerEvent" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Knock", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "knockIn",
    "knockOut"
})
public class Knock {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected TriggerEvent knockIn;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected TriggerEvent knockOut;

    /**
     * Gets the value of the knockIn property.
     * 
     * @return
     *     possible object is
     *     {@link TriggerEvent }
     *     
     */
    public TriggerEvent getKnockIn() {
        return knockIn;
    }

    /**
     * Sets the value of the knockIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link TriggerEvent }
     *     
     */
    public void setKnockIn(TriggerEvent value) {
        this.knockIn = value;
    }

    /**
     * Gets the value of the knockOut property.
     * 
     * @return
     *     possible object is
     *     {@link TriggerEvent }
     *     
     */
    public TriggerEvent getKnockOut() {
        return knockOut;
    }

    /**
     * Sets the value of the knockOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link TriggerEvent }
     *     
     */
    public void setKnockOut(TriggerEvent value) {
        this.knockOut = value;
    }

}
