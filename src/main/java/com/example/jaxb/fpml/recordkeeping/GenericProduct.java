
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Simple product representation providing key information about a variety of different products. Generic products - for use in Transparency reporting to define a product that represents an OTC derivative transaction whose economics are not fully described using an FpML schema. In other views, generic products are present for convenience to support internal messaging and workflows that are cross-product. Generic products are not full trade representations as such they are not intended to be used for confirming trades.
 * 
 * <p>Java class for GenericProduct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GenericProduct">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}Product">
 *       &lt;sequence>
 *         &lt;element name="multiLeg" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}BuyerSeller.model"/>
 *           &lt;element name="counterpartyReference" type="{http://www.fpml.org/FpML-5/recordkeeping}PartyReference" maxOccurs="2" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="premium" type="{http://www.fpml.org/FpML-5/recordkeeping}SimplePayment" minOccurs="0"/>
 *         &lt;element name="effectiveDate" type="{http://www.fpml.org/FpML-5/recordkeeping}AdjustableDate2" minOccurs="0"/>
 *         &lt;element name="expirationDate" type="{http://www.fpml.org/FpML-5/recordkeeping}AdjustableDate2" minOccurs="0"/>
 *         &lt;element name="terminationDate" type="{http://www.fpml.org/FpML-5/recordkeeping}AdjustableDate2" minOccurs="0"/>
 *         &lt;element name="underlyer" type="{http://www.fpml.org/FpML-5/recordkeeping}TradeUnderlyer2" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="notional" type="{http://www.fpml.org/FpML-5/recordkeeping}CashflowNotional" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}GenericCommodityAttributes.model" minOccurs="0"/>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}GenericEquityAttributes.model" minOccurs="0"/>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}GenericOptionAttributes.model" minOccurs="0"/>
 *         &lt;element name="paymentFrequency" type="{http://www.fpml.org/FpML-5/recordkeeping}GenericFrequency" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="resetFrequency" type="{http://www.fpml.org/FpML-5/recordkeeping}GenericResetFrequency" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="settlementCurrency" type="{http://www.fpml.org/FpML-5/recordkeeping}IdentifiedCurrency" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="settlementType" type="{http://www.fpml.org/FpML-5/recordkeeping}SettlementTypeEnum" minOccurs="0"/>
 *         &lt;element name="additionalPayment" type="{http://www.fpml.org/FpML-5/recordkeeping}Payment" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenericProduct", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
public class GenericProduct
    extends Product
{


}
