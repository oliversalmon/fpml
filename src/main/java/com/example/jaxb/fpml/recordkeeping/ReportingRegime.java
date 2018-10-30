
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
 * Provides information about how the information in this message is applicable to a regulatory reporting process.
 * 
 * <p>Java class for ReportingRegime complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReportingRegime">
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
 *         &lt;element name="reportingPurpose" type="{http://www.fpml.org/FpML-5/recordkeeping}ReportingPurpose" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="mandatorilyClearable" type="{http://www.fpml.org/FpML-5/recordkeeping}ReportingBoolean" minOccurs="0"/>
 *         &lt;sequence minOccurs="0">
 *           &lt;element name="mandatoryFacilityExecution" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *           &lt;element name="mandatoryFacilityExecutionException" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *           &lt;element name="mandatoryFacilityExecutionExceptionDeclaration" type="{http://www.fpml.org/FpML-5/recordkeeping}FacilityExecutionExceptionDeclaration" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;element name="exceedsClearingThreshold" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="relatedParty" type="{http://www.fpml.org/FpML-5/recordkeeping}RelatedParty" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="entityClassification" type="{http://www.fpml.org/FpML-5/recordkeeping}EntityClassification"/>
 *           &lt;element name="partyEntityClassification" type="{http://www.fpml.org/FpML-5/recordkeeping}PartyEntityClassification" maxOccurs="unbounded"/>
 *         &lt;/choice>
 *         &lt;element name="tradePartyRelationshipType" type="{http://www.fpml.org/FpML-5/recordkeeping}PartyRelationshipType" minOccurs="0"/>
 *         &lt;element name="actionType" type="{http://www.fpml.org/FpML-5/recordkeeping}ActionType" minOccurs="0"/>
 *         &lt;element name="preEnactmentTrade" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="notionalType" type="{http://www.fpml.org/FpML-5/recordkeeping}NotionalReportingType" minOccurs="0"/>
 *         &lt;element name="currencyPairClassification" type="{http://www.fpml.org/FpML-5/recordkeeping}CurrencyPairClassification" minOccurs="0"/>
 *         &lt;element name="transmissionOfOrder" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportingRegime", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "content"
})
public class ReportingRegime {

    @XmlElementRefs({
        @XmlElementRef(name = "supervisorRegistration", namespace = "http://www.fpml.org/FpML-5/recordkeeping", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "mandatoryFacilityExecution", namespace = "http://www.fpml.org/FpML-5/recordkeeping", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "relatedParty", namespace = "http://www.fpml.org/FpML-5/recordkeeping", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "reportingPurpose", namespace = "http://www.fpml.org/FpML-5/recordkeeping", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "partyEntityClassification", namespace = "http://www.fpml.org/FpML-5/recordkeeping", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "actionType", namespace = "http://www.fpml.org/FpML-5/recordkeeping", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "currencyPairClassification", namespace = "http://www.fpml.org/FpML-5/recordkeeping", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "tradePartyRelationshipType", namespace = "http://www.fpml.org/FpML-5/recordkeeping", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "preEnactmentTrade", namespace = "http://www.fpml.org/FpML-5/recordkeeping", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "reportingRole", namespace = "http://www.fpml.org/FpML-5/recordkeeping", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "name", namespace = "http://www.fpml.org/FpML-5/recordkeeping", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "entityClassification", namespace = "http://www.fpml.org/FpML-5/recordkeeping", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "mandatorilyClearable", namespace = "http://www.fpml.org/FpML-5/recordkeeping", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "exceedsClearingThreshold", namespace = "http://www.fpml.org/FpML-5/recordkeeping", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "notionalType", namespace = "http://www.fpml.org/FpML-5/recordkeeping", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "mandatoryFacilityExecutionExceptionDeclaration", namespace = "http://www.fpml.org/FpML-5/recordkeeping", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "mandatoryFacilityExecutionException", namespace = "http://www.fpml.org/FpML-5/recordkeeping", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "transmissionOfOrder", namespace = "http://www.fpml.org/FpML-5/recordkeeping", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> content;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "SupervisorRegistration" is used by two different parts of a schema. See: 
     * line 1045 of file:/Users/oliverbuckley-salmon/git/fpml/src/main/xsd/recordkeeping/fpml-doc-5-10.xsd
     * line 1039 of file:/Users/oliverbuckley-salmon/git/fpml/src/main/xsd/recordkeeping/fpml-doc-5-10.xsd
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
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * {@link JAXBElement }{@code <}{@link RelatedParty }{@code >}
     * {@link JAXBElement }{@code <}{@link ReportingPurpose }{@code >}
     * {@link JAXBElement }{@code <}{@link PartyEntityClassification }{@code >}
     * {@link JAXBElement }{@code <}{@link ActionType }{@code >}
     * {@link JAXBElement }{@code <}{@link CurrencyPairClassification }{@code >}
     * {@link JAXBElement }{@code <}{@link PartyRelationshipType }{@code >}
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * {@link JAXBElement }{@code <}{@link ReportingRole }{@code >}
     * {@link JAXBElement }{@code <}{@link ReportingRegimeName }{@code >}
     * {@link JAXBElement }{@code <}{@link EntityClassification }{@code >}
     * {@link JAXBElement }{@code <}{@link ReportingBoolean }{@code >}
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * {@link JAXBElement }{@code <}{@link NotionalReportingType }{@code >}
     * {@link JAXBElement }{@code <}{@link FacilityExecutionExceptionDeclaration }{@code >}
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
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
