
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GenericFrequency complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GenericFrequency">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}Frequency">
 *       &lt;choice minOccurs="0">
 *         &lt;element name="payerPartyReference" type="{http://www.fpml.org/FpML-5/recordkeeping}PartyReference"/>
 *         &lt;element name="underlyerReference" type="{http://www.fpml.org/FpML-5/recordkeeping}UnderlyerReference"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenericFrequency", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "payerPartyReference",
    "underlyerReference"
})
public class GenericFrequency
    extends Frequency
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected PartyReference payerPartyReference;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected UnderlyerReference underlyerReference;

    /**
     * Gets the value of the payerPartyReference property.
     * 
     * @return
     *     possible object is
     *     {@link PartyReference }
     *     
     */
    public PartyReference getPayerPartyReference() {
        return payerPartyReference;
    }

    /**
     * Sets the value of the payerPartyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyReference }
     *     
     */
    public void setPayerPartyReference(PartyReference value) {
        this.payerPartyReference = value;
    }

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
