
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
 * A type describing the strike price.
 * 
 * <p>Java class for Price complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Price">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commission" type="{http://www.fpml.org/FpML-5/legal}Commission" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element name="determinationMethod" type="{http://www.fpml.org/FpML-5/legal}DeterminationMethod"/>
 *             &lt;group ref="{http://www.fpml.org/FpML-5/legal}EquityPrice.model" minOccurs="0"/>
 *           &lt;/sequence>
 *           &lt;element name="amountRelativeTo" type="{http://www.fpml.org/FpML-5/legal}AmountReference"/>
 *           &lt;group ref="{http://www.fpml.org/FpML-5/legal}EquityPrice.model"/>
 *         &lt;/choice>
 *         &lt;element name="cleanNetPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="quotationCharacteristics" type="{http://www.fpml.org/FpML-5/legal}QuotationCharacteristics" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Price", namespace = "http://www.fpml.org/FpML-5/legal", propOrder = {
    "content"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class Price {

    @XmlElementRefs({
        @XmlElementRef(name = "accruedInterestPrice", namespace = "http://www.fpml.org/FpML-5/legal", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "grossPrice", namespace = "http://www.fpml.org/FpML-5/legal", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "commission", namespace = "http://www.fpml.org/FpML-5/legal", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "netPrice", namespace = "http://www.fpml.org/FpML-5/legal", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "cleanNetPrice", namespace = "http://www.fpml.org/FpML-5/legal", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "determinationMethod", namespace = "http://www.fpml.org/FpML-5/legal", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "amountRelativeTo", namespace = "http://www.fpml.org/FpML-5/legal", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "fxConversion", namespace = "http://www.fpml.org/FpML-5/legal", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "quotationCharacteristics", namespace = "http://www.fpml.org/FpML-5/legal", type = JAXBElement.class, required = false)
    })
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected List<JAXBElement<?>> content;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "GrossPrice" is used by two different parts of a schema. See: 
     * line 1328 of file:/Users/oliverbuckley-salmon/git/fpml/src/main/xsd/legal/fpml-asset-5-10.xsd
     * line 1328 of file:/Users/oliverbuckley-salmon/git/fpml/src/main/xsd/legal/fpml-asset-5-10.xsd
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
     * {@link JAXBElement }{@code <}{@link ActualPrice }{@code >}
     * {@link JAXBElement }{@code <}{@link Commission }{@code >}
     * {@link JAXBElement }{@code <}{@link ActualPrice }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link DeterminationMethod }{@code >}
     * {@link JAXBElement }{@code <}{@link AmountReference }{@code >}
     * {@link JAXBElement }{@code <}{@link FxConversion }{@code >}
     * {@link JAXBElement }{@code <}{@link QuotationCharacteristics }{@code >}
     * 
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public List<JAXBElement<?>> getContent() {
        if (content == null) {
            content = new ArrayList<JAXBElement<?>>();
        }
        return this.content;
    }

}
