
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Product model for a flexible-term fx forward (also known as callable forward, window forward). This is a term forward transaction over a specific period, allowing the client full flexibility on the timing of the transactional flow(s). The product allows for (full or partial) execution at a predetermined forward rate, at any time between the start date and the expiry date. Although, the product is an outright, it has some option-like characteristics, leading to the use of option components in the model: (i) the BuyerSeller model expresses the roles of the parties in the overall transaction - the client "buys" the product (ii) the PutCallCurrency model expresses the buyer's perspective on the exchanged currencies i.e. the client may buy (call) or sell (put) the notional currency for the alternative currency.
 * 
 * <p>Java class for FxFlexibleForward complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FxFlexibleForward">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}Product">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}BuyerSeller.model"/>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}PutCallCurrency.model"/>
 *         &lt;sequence>
 *           &lt;element name="notionalAmount" type="{http://www.fpml.org/FpML-5/recordkeeping}NonNegativeMoney"/>
 *           &lt;element name="minimumExecutionAmount" type="{http://www.fpml.org/FpML-5/recordkeeping}PositiveMoney" minOccurs="0"/>
 *           &lt;element name="settlementAmount" type="{http://www.fpml.org/FpML-5/recordkeeping}NonNegativeMoney" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;element name="executionPeriodDates" type="{http://www.fpml.org/FpML-5/recordkeeping}FxFlexibleForwardExecutionPeriod"/>
 *         &lt;sequence minOccurs="0">
 *           &lt;element name="earliestExecutionTime" type="{http://www.fpml.org/FpML-5/recordkeeping}BusinessCenterTime" minOccurs="0"/>
 *           &lt;element name="latestExecutionTime" type="{http://www.fpml.org/FpML-5/recordkeeping}BusinessCenterTime" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;element name="settlementDateOffset" type="{http://www.fpml.org/FpML-5/recordkeeping}RelativeDateOffset" minOccurs="0"/>
 *         &lt;element name="finalSettlementDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="forwardRate" type="{http://www.fpml.org/FpML-5/recordkeeping}FxFlexibleForwardRate"/>
 *         &lt;element name="additionalPayment" type="{http://www.fpml.org/FpML-5/recordkeeping}Payment" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FxFlexibleForward", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
public class FxFlexibleForward
    extends Product
{


}
