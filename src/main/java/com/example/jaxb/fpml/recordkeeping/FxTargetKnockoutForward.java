
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * A structured forward product which consists of a strip of forwards. Each forward may be settled as an exchange of currencies or cash settled. At each settlement, the amount of gain that one party achieves is measured. The product has a target level of gain. Once the accumulated gain exceeds the target level, the product terminates and there are no further settlements.
 * 
 * <p>Java class for FxTargetKnockoutForward complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FxTargetKnockoutForward">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}Product">
 *       &lt;sequence>
 *         &lt;element name="quotedCurrencyPair" type="{http://www.fpml.org/FpML-5/recordkeeping}QuotedCurrencyPair"/>
 *         &lt;element name="notionalAmount" type="{http://www.fpml.org/FpML-5/recordkeeping}NonNegativeAmountSchedule"/>
 *         &lt;element name="target" type="{http://www.fpml.org/FpML-5/recordkeeping}FxTarget" maxOccurs="2"/>
 *         &lt;element name="expirySchedule" type="{http://www.fpml.org/FpML-5/recordkeeping}FxExpirySchedule"/>
 *         &lt;element name="settlementSchedule" type="{http://www.fpml.org/FpML-5/recordkeeping}FxSettlementSchedule" minOccurs="0"/>
 *         &lt;element name="fixingInformationSource" type="{http://www.fpml.org/FpML-5/recordkeeping}FxInformationSource" minOccurs="0"/>
 *         &lt;element name="spotRate" type="{http://www.fpml.org/FpML-5/recordkeeping}NonNegativeDecimal" minOccurs="0"/>
 *         &lt;sequence>
 *           &lt;sequence minOccurs="0">
 *             &lt;element name="pivot" type="{http://www.fpml.org/FpML-5/recordkeeping}FxPivot"/>
 *             &lt;element name="constantPayoffRegion" type="{http://www.fpml.org/FpML-5/recordkeeping}FxTargetConstantPayoffRegion" maxOccurs="unbounded" minOccurs="0"/>
 *             &lt;element name="linearPayoffRegion" type="{http://www.fpml.org/FpML-5/recordkeeping}FxTargetLinearPayoffRegion"/>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;element name="constantPayoffRegion" type="{http://www.fpml.org/FpML-5/recordkeeping}FxTargetConstantPayoffRegion" maxOccurs="unbounded" minOccurs="0"/>
 *             &lt;element name="linearPayoffRegion" type="{http://www.fpml.org/FpML-5/recordkeeping}FxTargetLinearPayoffRegion"/>
 *           &lt;/sequence>
 *           &lt;choice maxOccurs="unbounded" minOccurs="0">
 *             &lt;element name="constantPayoffRegion" type="{http://www.fpml.org/FpML-5/recordkeeping}FxTargetConstantPayoffRegion"/>
 *             &lt;element name="linearPayoffRegion" type="{http://www.fpml.org/FpML-5/recordkeeping}FxTargetLinearPayoffRegion"/>
 *           &lt;/choice>
 *         &lt;/sequence>
 *         &lt;element name="barrier" type="{http://www.fpml.org/FpML-5/recordkeeping}FxTargetBarrier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="additionalPayment" type="{http://www.fpml.org/FpML-5/recordkeeping}SimplePayment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="cashSettlement" type="{http://www.fpml.org/FpML-5/recordkeeping}FxCashSettlementSimple" minOccurs="0"/>
 *         &lt;element name="settlementPeriodSchedule" type="{http://www.fpml.org/FpML-5/recordkeeping}FxTargetSettlementPeriodSchedule" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FxTargetKnockoutForward", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
public class FxTargetKnockoutForward
    extends Product
{


}
