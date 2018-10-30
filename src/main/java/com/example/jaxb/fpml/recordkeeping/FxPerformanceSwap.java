
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Describes an FX volatility and variance swap.
 * 
 * <p>Java class for FxPerformanceSwap complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FxPerformanceSwap">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}Product">
 *       &lt;sequence>
 *         &lt;element name="quotedCurrencyPair" type="{http://www.fpml.org/FpML-5/recordkeeping}QuotedCurrencyPair"/>
 *         &lt;element name="vegaNotional" type="{http://www.fpml.org/FpML-5/recordkeeping}NonNegativeMoney"/>
 *         &lt;element name="notional" type="{http://www.fpml.org/FpML-5/recordkeeping}NonNegativeMoney" minOccurs="0"/>
 *         &lt;element name="fixedLeg" type="{http://www.fpml.org/FpML-5/recordkeeping}FxPerformanceFixedLeg"/>
 *         &lt;element name="floatingLeg" type="{http://www.fpml.org/FpML-5/recordkeeping}FxPerformanceFloatingLeg"/>
 *         &lt;element name="fixingInformationSource" type="{http://www.fpml.org/FpML-5/recordkeeping}FxSpotRateSource" minOccurs="0"/>
 *         &lt;element name="fixingSchedule" type="{http://www.fpml.org/FpML-5/recordkeeping}FxFixingScheduleSimple"/>
 *         &lt;choice>
 *           &lt;element name="valuationDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *           &lt;element name="valuationDateOffset" type="{http://www.fpml.org/FpML-5/recordkeeping}FxValuationDateOffset"/>
 *         &lt;/choice>
 *         &lt;element name="settlementDate" type="{http://www.fpml.org/FpML-5/recordkeeping}AdjustableOrAdjustedDate"/>
 *         &lt;element name="annualizationFactor" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="meanAdjustment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="additionalPayment" type="{http://www.fpml.org/FpML-5/recordkeeping}Payment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="cashSettlement" type="{http://www.fpml.org/FpML-5/recordkeeping}FxCashSettlementSimple" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FxPerformanceSwap", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
public class FxPerformanceSwap
    extends Product
{


}
