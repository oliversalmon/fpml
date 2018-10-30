
package com.example.jaxb.fpml.legal;

import javax.annotation.Generated;
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
 *     &lt;extension base="{http://www.fpml.org/FpML-5/legal}ExchangeTradedCalculatedPrice">
 *       &lt;sequence>
 *         &lt;element name="futureId" type="{http://www.fpml.org/FpML-5/legal}FutureId" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Index", namespace = "http://www.fpml.org/FpML-5/legal", propOrder = {
    "futureId"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class Index
    extends ExchangeTradedCalculatedPrice
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/legal")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected FutureId futureId;

    /**
     * Gets the value of the futureId property.
     * 
     * @return
     *     possible object is
     *     {@link FutureId }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setFutureId(FutureId value) {
        this.futureId = value;
    }

}
