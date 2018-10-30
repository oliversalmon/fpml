
package com.example.jaxb.fpml.legal;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentDetail">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/legal}PaymentBase">
 *       &lt;sequence>
 *         &lt;element name="paymentDate" type="{http://www.fpml.org/FpML-5/legal}AdjustableOrRelativeDate" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="paymentAmount" type="{http://www.fpml.org/FpML-5/legal}Money"/>
 *           &lt;sequence>
 *             &lt;element name="paymentRule" type="{http://www.fpml.org/FpML-5/legal}PaymentRule"/>
 *             &lt;element name="paymentAmount" type="{http://www.fpml.org/FpML-5/legal}Money" minOccurs="0"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentDetail", namespace = "http://www.fpml.org/FpML-5/legal", propOrder = {
    "rest"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class PaymentDetail
    extends PaymentBase
{

    @XmlElementRefs({
        @XmlElementRef(name = "paymentAmount", namespace = "http://www.fpml.org/FpML-5/legal", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "paymentRule", namespace = "http://www.fpml.org/FpML-5/legal", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "paymentDate", namespace = "http://www.fpml.org/FpML-5/legal", type = JAXBElement.class, required = false)
    })
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected List<JAXBElement<?>> rest;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "PaymentAmount" is used by two different parts of a schema. See: 
     * line 1368 of file:/Users/oliverbuckley-salmon/git/fpml/src/main/xsd/legal/fpml-shared-5-10.xsd
     * line 1357 of file:/Users/oliverbuckley-salmon/git/fpml/src/main/xsd/legal/fpml-shared-5-10.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
     * Gets the value of the rest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Money }{@code >}
     * {@link JAXBElement }{@code <}{@link AdjustableOrRelativeDate }{@code >}
     * {@link JAXBElement }{@code <}{@link PaymentRule }{@code >}
     * 
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public List<JAXBElement<?>> getRest() {
        if (rest == null) {
            rest = new ArrayList<JAXBElement<?>>();
        }
        return this.rest;
    }

}
