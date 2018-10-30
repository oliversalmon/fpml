
package com.example.jaxb.fpml.recordkeeping;

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
@XmlType(name = "Reference", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
@XmlSeeAlso({
    NumberOfOptionsReference.class,
    PersonReference.class,
    AnyAssetReference.class,
    NotionalAmountReference.class,
    AssetReference.class,
    BusinessUnitReference.class,
    PricingStructureReference.class,
    IdentifiedCurrencyReference.class,
    InterestLegCalculationPeriodDatesReference.class,
    DateReference.class,
    CreditEventsReference.class,
    AccountReference.class,
    DeterminationMethodReference.class,
    SpreadScheduleReference.class,
    LegalEntityReference.class,
    ProductReference.class,
    FloatingRateCalculationReference.class,
    ScheduleReference.class,
    BusinessCentersReference.class,
    AmountReference.class,
    ReturnSwapNotionalAmountReference.class,
    PartyReference.class,
    BusinessDayAdjustmentsReference.class,
    NotionalReference.class,
    PartyTradeIdentifierReference.class,
    NumberOfUnitsReference.class
})
public abstract class Reference {


}
