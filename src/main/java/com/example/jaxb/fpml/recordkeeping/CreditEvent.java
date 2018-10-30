
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditEvent">
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
@XmlType(name = "CreditEvent", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
@XmlSeeAlso({
    RestructuringEvent.class,
    ObligationAccelerationEvent.class,
    RepudiationMoratoriumEvent.class,
    FailureToPayEvent.class,
    BankruptcyEvent.class,
    ObligationDefaultEvent.class
})
public class CreditEvent {


}
