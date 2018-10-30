
package com.example.jaxb.fpml.legal;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * The abstract base class for all types which define intra-document pointers.
 * 
 * <p>Java class for Reference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Reference">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Reference", namespace = "http://www.fpml.org/FpML-5/legal")
@XmlSeeAlso({
    DocumentReference.class,
    AccountReference.class,
    SpreadScheduleReference.class,
    BusinessUnitReference.class,
    LegalEntityReference.class,
    ProductReference.class,
    ScheduleReference.class,
    DateReference.class,
    BusinessCentersReference.class,
    AmountReference.class,
    PartyReference.class,
    NotionalReference.class,
    PartyTradeIdentifierReference.class
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
public abstract class Reference {


}
