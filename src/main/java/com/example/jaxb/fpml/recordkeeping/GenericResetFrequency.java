
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GenericResetFrequency complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GenericResetFrequency">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}Frequency">
 *       &lt;sequence>
 *         &lt;element name="underlyerReference" type="{http://www.fpml.org/FpML-5/recordkeeping}UnderlyerReference" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenericResetFrequency", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "underlyerReference"
})
public class GenericResetFrequency
    extends Frequency
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected UnderlyerReference underlyerReference;

    /**
     * Gets the value of the underlyerReference property.
     * 
     * @return
     *     possible object is
     *     {@link UnderlyerReference }
     *     
     */
    public UnderlyerReference getUnderlyerReference() {
        return underlyerReference;
    }

    /**
     * Sets the value of the underlyerReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyerReference }
     *     
     */
    public void setUnderlyerReference(UnderlyerReference value) {
        this.underlyerReference = value;
    }

}
