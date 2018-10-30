
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A type defining a quantity and unit with a reference.
 * 
 * <p>Java class for UnitQuantityRef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnitQuantityRef">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}UnitQuantity">
 *       &lt;sequence>
 *         &lt;element name="quantityReference" type="{http://www.fpml.org/FpML-5/recordkeeping}NotionalReference" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnitQuantityRef", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "quantityReference"
})
public class UnitQuantityRef
    extends UnitQuantity
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected NotionalReference quantityReference;

    /**
     * Gets the value of the quantityReference property.
     * 
     * @return
     *     possible object is
     *     {@link NotionalReference }
     *     
     */
    public NotionalReference getQuantityReference() {
        return quantityReference;
    }

    /**
     * Sets the value of the quantityReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotionalReference }
     *     
     */
    public void setQuantityReference(NotionalReference value) {
        this.quantityReference = value;
    }

}
