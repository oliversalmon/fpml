
package com.example.jaxb.fpml.legal;

import java.math.BigDecimal;
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
 * A structure including a net and/or a gross amount and possibly fees and commissions.
 * 
 * <p>Java class for NetAndGross complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NetAndGross">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/legal}NetAndOrGross.model"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetAndGross", namespace = "http://www.fpml.org/FpML-5/legal", propOrder = {
    "content"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class NetAndGross {

    @XmlElementRefs({
        @XmlElementRef(name = "gross", namespace = "http://www.fpml.org/FpML-5/legal", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "net", namespace = "http://www.fpml.org/FpML-5/legal", type = JAXBElement.class, required = false)
    })
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected List<JAXBElement<BigDecimal>> content;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "Net" is used by two different parts of a schema. See: 
     * line 383 of file:/Users/oliverbuckley-salmon/git/fpml/src/main/xsd/legal/fpml-doc-5-10.xsd
     * line 372 of file:/Users/oliverbuckley-salmon/git/fpml/src/main/xsd/legal/fpml-doc-5-10.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public List<JAXBElement<BigDecimal>> getContent() {
        if (content == null) {
            content = new ArrayList<JAXBElement<BigDecimal>>();
        }
        return this.content;
    }

}
