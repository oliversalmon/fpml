
package com.example.jaxb.fpml.recordkeeping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Defines initial margin applied to a repo transaction. Initial margin is an agreed premium to the Purchase Price of a repo to determine the required Market Value of the collateral to be delivered on the Purchase Date. It reflects quality of the collateral. Its aim is to calculate the risk-adjusted or liquidation value of collateral.
 * 
 * <p>Java class for InitialMargin complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InitialMargin">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="marginType" type="{http://www.fpml.org/FpML-5/recordkeeping}MarginTypeEnum"/>
 *         &lt;element name="margin" type="{http://www.fpml.org/FpML-5/recordkeeping}InitialMarginCalculation" maxOccurs="unbounded"/>
 *         &lt;element name="marginThreshold" type="{http://www.fpml.org/FpML-5/recordkeeping}NonNegativeMoney" minOccurs="0"/>
 *         &lt;element name="minimumTransferAmount" type="{http://www.fpml.org/FpML-5/recordkeeping}NonNegativeMoney" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InitialMargin", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "marginType",
    "margin",
    "marginThreshold",
    "minimumTransferAmount"
})
public class InitialMargin {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    @XmlSchemaType(name = "token")
    protected MarginTypeEnum marginType;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    protected List<InitialMarginCalculation> margin;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected NonNegativeMoney marginThreshold;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected NonNegativeMoney minimumTransferAmount;

    /**
     * Gets the value of the marginType property.
     * 
     * @return
     *     possible object is
     *     {@link MarginTypeEnum }
     *     
     */
    public MarginTypeEnum getMarginType() {
        return marginType;
    }

    /**
     * Sets the value of the marginType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarginTypeEnum }
     *     
     */
    public void setMarginType(MarginTypeEnum value) {
        this.marginType = value;
    }

    /**
     * Gets the value of the margin property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the margin property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMargin().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InitialMarginCalculation }
     * 
     * 
     */
    public List<InitialMarginCalculation> getMargin() {
        if (margin == null) {
            margin = new ArrayList<InitialMarginCalculation>();
        }
        return this.margin;
    }

    /**
     * Gets the value of the marginThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMoney }
     *     
     */
    public NonNegativeMoney getMarginThreshold() {
        return marginThreshold;
    }

    /**
     * Sets the value of the marginThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMoney }
     *     
     */
    public void setMarginThreshold(NonNegativeMoney value) {
        this.marginThreshold = value;
    }

    /**
     * Gets the value of the minimumTransferAmount property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMoney }
     *     
     */
    public NonNegativeMoney getMinimumTransferAmount() {
        return minimumTransferAmount;
    }

    /**
     * Sets the value of the minimumTransferAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMoney }
     *     
     */
    public void setMinimumTransferAmount(NonNegativeMoney value) {
        this.minimumTransferAmount = value;
    }

}
