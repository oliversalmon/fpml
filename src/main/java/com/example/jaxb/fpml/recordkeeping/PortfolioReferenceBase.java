
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A structure used to identify a portfolio in a message.
 * 
 * <p>Java class for PortfolioReferenceBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PortfolioReferenceBase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="portfolioName" type="{http://www.fpml.org/FpML-5/recordkeeping}PortfolioName" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PortfolioReferenceBase", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "portfolioName"
})
@XmlSeeAlso({
    PortfolioConstituentReference.class
})
public class PortfolioReferenceBase {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected PortfolioName portfolioName;

    /**
     * Gets the value of the portfolioName property.
     * 
     * @return
     *     possible object is
     *     {@link PortfolioName }
     *     
     */
    public PortfolioName getPortfolioName() {
        return portfolioName;
    }

    /**
     * Sets the value of the portfolioName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PortfolioName }
     *     
     */
    public void setPortfolioName(PortfolioName value) {
        this.portfolioName = value;
    }

}
