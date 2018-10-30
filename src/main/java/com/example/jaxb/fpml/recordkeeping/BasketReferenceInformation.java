
package com.example.jaxb.fpml.recordkeeping;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * CDS Basket Reference Information
 * 
 * <p>Java class for BasketReferenceInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BasketReferenceInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}BasketIdentifier.model" minOccurs="0"/>
 *         &lt;element name="referencePool" type="{http://www.fpml.org/FpML-5/recordkeeping}ReferencePool" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;sequence>
 *             &lt;element name="nthToDefault" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *             &lt;element name="mthToDefault" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *           &lt;/sequence>
 *           &lt;element name="tranche" type="{http://www.fpml.org/FpML-5/recordkeeping}Tranche"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BasketReferenceInformation", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "basketName",
    "basketId",
    "referencePool",
    "nthToDefault",
    "mthToDefault",
    "tranche"
})
public class BasketReferenceInformation {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BasketName basketName;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<BasketId> basketId;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected ReferencePool referencePool;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger nthToDefault;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger mthToDefault;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Tranche tranche;

    /**
     * Gets the value of the basketName property.
     * 
     * @return
     *     possible object is
     *     {@link BasketName }
     *     
     */
    public BasketName getBasketName() {
        return basketName;
    }

    /**
     * Sets the value of the basketName property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasketName }
     *     
     */
    public void setBasketName(BasketName value) {
        this.basketName = value;
    }

    /**
     * Gets the value of the basketId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the basketId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBasketId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BasketId }
     * 
     * 
     */
    public List<BasketId> getBasketId() {
        if (basketId == null) {
            basketId = new ArrayList<BasketId>();
        }
        return this.basketId;
    }

    /**
     * Gets the value of the referencePool property.
     * 
     * @return
     *     possible object is
     *     {@link ReferencePool }
     *     
     */
    public ReferencePool getReferencePool() {
        return referencePool;
    }

    /**
     * Sets the value of the referencePool property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferencePool }
     *     
     */
    public void setReferencePool(ReferencePool value) {
        this.referencePool = value;
    }

    /**
     * Gets the value of the nthToDefault property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNthToDefault() {
        return nthToDefault;
    }

    /**
     * Sets the value of the nthToDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNthToDefault(BigInteger value) {
        this.nthToDefault = value;
    }

    /**
     * Gets the value of the mthToDefault property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMthToDefault() {
        return mthToDefault;
    }

    /**
     * Sets the value of the mthToDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMthToDefault(BigInteger value) {
        this.mthToDefault = value;
    }

    /**
     * Gets the value of the tranche property.
     * 
     * @return
     *     possible object is
     *     {@link Tranche }
     *     
     */
    public Tranche getTranche() {
        return tranche;
    }

    /**
     * Sets the value of the tranche property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tranche }
     *     
     */
    public void setTranche(Tranche value) {
        this.tranche = value;
    }

}
