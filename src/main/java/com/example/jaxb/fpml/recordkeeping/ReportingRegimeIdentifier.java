
package com.example.jaxb.fpml.recordkeeping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * A type that provides identification for reporting regimes.
 * 
 * <p>Java class for ReportingRegimeIdentifier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReportingRegimeIdentifier">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element name="name" type="{http://www.fpml.org/FpML-5/recordkeeping}ReportingRegimeName"/>
 *             &lt;element name="supervisorRegistration" type="{http://www.fpml.org/FpML-5/recordkeeping}SupervisorRegistration" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;/sequence>
 *           &lt;element name="supervisorRegistration" type="{http://www.fpml.org/FpML-5/recordkeeping}SupervisorRegistration" maxOccurs="unbounded"/>
 *         &lt;/choice>
 *         &lt;element name="reportingRole" type="{http://www.fpml.org/FpML-5/recordkeeping}ReportingRole" minOccurs="0"/>
 *         &lt;element name="actionType" type="{http://www.fpml.org/FpML-5/recordkeeping}ActionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportingRegimeIdentifier", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "content"
})
public class ReportingRegimeIdentifier {

    @XmlElementRefs({
        @XmlElementRef(name = "supervisorRegistration", namespace = "http://www.fpml.org/FpML-5/recordkeeping", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "name", namespace = "http://www.fpml.org/FpML-5/recordkeeping", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "reportingRole", namespace = "http://www.fpml.org/FpML-5/recordkeeping", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "actionType", namespace = "http://www.fpml.org/FpML-5/recordkeeping", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> content;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "SupervisorRegistration" is used by two different parts of a schema. See: 
     * line 503 of file:/Users/oliverbuckley-salmon/git/fpml/src/main/xsd/recordkeeping/fpml-business-events-5-10.xsd
     * line 497 of file:/Users/oliverbuckley-salmon/git/fpml/src/main/xsd/recordkeeping/fpml-business-events-5-10.xsd
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
     * {@link JAXBElement }{@code <}{@link SupervisorRegistration }{@code >}
     * {@link JAXBElement }{@code <}{@link ReportingRegimeName }{@code >}
     * {@link JAXBElement }{@code <}{@link ReportingRole }{@code >}
     * {@link JAXBElement }{@code <}{@link ActionType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getContent() {
        if (content == null) {
            content = new ArrayList<JAXBElement<?>>();
        }
        return this.content;
    }

}
