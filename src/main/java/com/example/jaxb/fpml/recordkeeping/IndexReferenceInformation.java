
package com.example.jaxb.fpml.recordkeeping;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * A type defining a Credit Default Swap Index.
 * 
 * <p>Java class for IndexReferenceInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndexReferenceInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;sequence>
 *             &lt;element name="indexName" type="{http://www.fpml.org/FpML-5/recordkeeping}IndexName"/>
 *             &lt;element name="indexId" type="{http://www.fpml.org/FpML-5/recordkeeping}IndexId" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;element name="indexId" type="{http://www.fpml.org/FpML-5/recordkeeping}IndexId" maxOccurs="unbounded"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *         &lt;element name="indexSeries" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="indexAnnexVersion" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="indexAnnexDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="indexAnnexSource" type="{http://www.fpml.org/FpML-5/recordkeeping}IndexAnnexSource" minOccurs="0"/>
 *         &lt;element name="excludedReferenceEntity" type="{http://www.fpml.org/FpML-5/recordkeeping}LegalEntity" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="tranche" type="{http://www.fpml.org/FpML-5/recordkeeping}Tranche" minOccurs="0"/>
 *         &lt;element name="settledEntityMatrix" type="{http://www.fpml.org/FpML-5/recordkeeping}SettledEntityMatrix" minOccurs="0"/>
 *         &lt;sequence minOccurs="0">
 *           &lt;element name="indexFactor" type="{http://www.fpml.org/FpML-5/recordkeeping}RestrictedPercentage" minOccurs="0"/>
 *           &lt;element name="seniority" type="{http://www.fpml.org/FpML-5/recordkeeping}CreditSeniority" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndexReferenceInformation", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "content"
})
public class IndexReferenceInformation {

    @XmlElementRefs({
        @XmlElementRef(name = "settledEntityMatrix", namespace = "http://www.fpml.org/FpML-5/recordkeeping", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "excludedReferenceEntity", namespace = "http://www.fpml.org/FpML-5/recordkeeping", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "indexName", namespace = "http://www.fpml.org/FpML-5/recordkeeping", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "indexAnnexVersion", namespace = "http://www.fpml.org/FpML-5/recordkeeping", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "indexFactor", namespace = "http://www.fpml.org/FpML-5/recordkeeping", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "seniority", namespace = "http://www.fpml.org/FpML-5/recordkeeping", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "tranche", namespace = "http://www.fpml.org/FpML-5/recordkeeping", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "indexSeries", namespace = "http://www.fpml.org/FpML-5/recordkeeping", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "indexId", namespace = "http://www.fpml.org/FpML-5/recordkeeping", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "indexAnnexDate", namespace = "http://www.fpml.org/FpML-5/recordkeeping", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "indexAnnexSource", namespace = "http://www.fpml.org/FpML-5/recordkeeping", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> content;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "IndexId" is used by two different parts of a schema. See: 
     * line 634 of file:/Users/oliverbuckley-salmon/git/fpml/src/main/xsd/recordkeeping/fpml-cd-5-10.xsd
     * line 627 of file:/Users/oliverbuckley-salmon/git/fpml/src/main/xsd/recordkeeping/fpml-cd-5-10.xsd
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
     * {@link JAXBElement }{@code <}{@link SettledEntityMatrix }{@code >}
     * {@link JAXBElement }{@code <}{@link LegalEntity }{@code >}
     * {@link JAXBElement }{@code <}{@link IndexName }{@code >}
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link CreditSeniority }{@code >}
     * {@link JAXBElement }{@code <}{@link Tranche }{@code >}
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link JAXBElement }{@code <}{@link IndexId }{@code >}
     * {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * {@link JAXBElement }{@code <}{@link IndexAnnexSource }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getContent() {
        if (content == null) {
            content = new ArrayList<JAXBElement<?>>();
        }
        return this.content;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
