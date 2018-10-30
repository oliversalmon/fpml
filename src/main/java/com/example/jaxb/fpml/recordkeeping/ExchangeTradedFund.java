
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * An exchange traded fund whose price depends on exchange traded constituents.
 * 
 * <p>Java class for ExchangeTradedFund complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExchangeTradedFund">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}ExchangeTradedCalculatedPrice">
 *       &lt;sequence>
 *         &lt;element name="fundManager" type="{http://www.fpml.org/FpML-5/recordkeeping}String" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExchangeTradedFund", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "fundManager"
})
public class ExchangeTradedFund
    extends ExchangeTradedCalculatedPrice
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected String fundManager;

    /**
     * Gets the value of the fundManager property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFundManager() {
        return fundManager;
    }

    /**
     * Sets the value of the fundManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFundManager(String value) {
        this.fundManager = value;
    }

}
