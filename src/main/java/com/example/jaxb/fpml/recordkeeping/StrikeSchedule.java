
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A type describing a schedule of cap or floor rates.
 * 
 * <p>Java class for StrikeSchedule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StrikeSchedule">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}Schedule">
 *       &lt;sequence>
 *         &lt;element name="buyer" type="{http://www.fpml.org/FpML-5/recordkeeping}IdentifiedPayerReceiver" minOccurs="0"/>
 *         &lt;element name="seller" type="{http://www.fpml.org/FpML-5/recordkeeping}IdentifiedPayerReceiver" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StrikeSchedule", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "buyer",
    "seller"
})
public class StrikeSchedule
    extends Schedule
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected IdentifiedPayerReceiver buyer;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected IdentifiedPayerReceiver seller;

    /**
     * Gets the value of the buyer property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifiedPayerReceiver }
     *     
     */
    public IdentifiedPayerReceiver getBuyer() {
        return buyer;
    }

    /**
     * Sets the value of the buyer property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifiedPayerReceiver }
     *     
     */
    public void setBuyer(IdentifiedPayerReceiver value) {
        this.buyer = value;
    }

    /**
     * Gets the value of the seller property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifiedPayerReceiver }
     *     
     */
    public IdentifiedPayerReceiver getSeller() {
        return seller;
    }

    /**
     * Sets the value of the seller property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifiedPayerReceiver }
     *     
     */
    public void setSeller(IdentifiedPayerReceiver value) {
        this.seller = value;
    }

}
