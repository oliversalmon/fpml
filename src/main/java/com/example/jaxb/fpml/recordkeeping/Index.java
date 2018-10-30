
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A published index whose price depends on exchange traded constituents.
 * 
 * <p>Java class for Index complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Index">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}ExchangeTradedCalculatedPrice">
 *       &lt;sequence>
 *         &lt;element name="futureId" type="{http://www.fpml.org/FpML-5/recordkeeping}FutureId" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Index", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "futureId"
})
public class Index
    extends ExchangeTradedCalculatedPrice
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected FutureId futureId;

    /**
     * Gets the value of the futureId property.
     * 
     * @return
     *     possible object is
     *     {@link FutureId }
     *     
     */
    public FutureId getFutureId() {
        return futureId;
    }

    /**
     * Sets the value of the futureId property.
     * 
     * @param value
     *     allowed object is
     *     {@link FutureId }
     *     
     */
    public void setFutureId(FutureId value) {
        this.futureId = value;
    }

}
