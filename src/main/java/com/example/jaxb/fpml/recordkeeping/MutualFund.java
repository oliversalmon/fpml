
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MutualFund complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MutualFund">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}UnderlyingAsset">
 *       &lt;sequence>
 *         &lt;element name="openEndedFund" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "MutualFund", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "openEndedFund",
    "fundManager"
})
public class MutualFund
    extends UnderlyingAsset
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean openEndedFund;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected String fundManager;

    /**
     * Gets the value of the openEndedFund property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOpenEndedFund() {
        return openEndedFund;
    }

    /**
     * Sets the value of the openEndedFund property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOpenEndedFund(Boolean value) {
        this.openEndedFund = value;
    }

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
