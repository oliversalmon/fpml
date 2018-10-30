
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A type defining a currency amount with a reference.
 * 
 * <p>Java class for MoneyRef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MoneyRef">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}PositiveMoney">
 *       &lt;sequence>
 *         &lt;element name="notionalReference" type="{http://www.fpml.org/FpML-5/recordkeeping}NotionalReference" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MoneyRef", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "notionalReference"
})
public class MoneyRef
    extends PositiveMoney
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected NotionalReference notionalReference;

    /**
     * Gets the value of the notionalReference property.
     * 
     * @return
     *     possible object is
     *     {@link NotionalReference }
     *     
     */
    public NotionalReference getNotionalReference() {
        return notionalReference;
    }

    /**
     * Sets the value of the notionalReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotionalReference }
     *     
     */
    public void setNotionalReference(NotionalReference value) {
        this.notionalReference = value;
    }

}
