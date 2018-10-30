
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A type describing the whole set of possible underlyers: single underlyers or multiple underlyers, each of these having either security or index components.
 * 
 * <p>Java class for Underlyer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Underlyer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="singleUnderlyer" type="{http://www.fpml.org/FpML-5/recordkeeping}SingleUnderlyer"/>
 *         &lt;element name="basket" type="{http://www.fpml.org/FpML-5/recordkeeping}Basket"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Underlyer", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "singleUnderlyer",
    "basket"
})
public class Underlyer {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected SingleUnderlyer singleUnderlyer;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Basket basket;

    /**
     * Gets the value of the singleUnderlyer property.
     * 
     * @return
     *     possible object is
     *     {@link SingleUnderlyer }
     *     
     */
    public SingleUnderlyer getSingleUnderlyer() {
        return singleUnderlyer;
    }

    /**
     * Sets the value of the singleUnderlyer property.
     * 
     * @param value
     *     allowed object is
     *     {@link SingleUnderlyer }
     *     
     */
    public void setSingleUnderlyer(SingleUnderlyer value) {
        this.singleUnderlyer = value;
    }

    /**
     * Gets the value of the basket property.
     * 
     * @return
     *     possible object is
     *     {@link Basket }
     *     
     */
    public Basket getBasket() {
        return basket;
    }

    /**
     * Sets the value of the basket property.
     * 
     * @param value
     *     allowed object is
     *     {@link Basket }
     *     
     */
    public void setBasket(Basket value) {
        this.basket = value;
    }

}
