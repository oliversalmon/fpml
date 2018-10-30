
package com.example.jaxb.fpml.recordkeeping;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A type describing correlation bounds, which form a cap and a floor on the realized correlation.
 * 
 * <p>Java class for BoundedCorrelation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BoundedCorrelation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="minimumBoundaryPercent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="maximumBoundaryPercent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BoundedCorrelation", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "minimumBoundaryPercent",
    "maximumBoundaryPercent"
})
public class BoundedCorrelation {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BigDecimal minimumBoundaryPercent;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BigDecimal maximumBoundaryPercent;

    /**
     * Gets the value of the minimumBoundaryPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinimumBoundaryPercent() {
        return minimumBoundaryPercent;
    }

    /**
     * Sets the value of the minimumBoundaryPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinimumBoundaryPercent(BigDecimal value) {
        this.minimumBoundaryPercent = value;
    }

    /**
     * Gets the value of the maximumBoundaryPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumBoundaryPercent() {
        return maximumBoundaryPercent;
    }

    /**
     * Sets the value of the maximumBoundaryPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumBoundaryPercent(BigDecimal value) {
        this.maximumBoundaryPercent = value;
    }

}
