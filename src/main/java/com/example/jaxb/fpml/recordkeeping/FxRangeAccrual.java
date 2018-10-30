
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * An FX Range Accrual product. A strip of Digital Options product The product defines a list of fixing (or observation) dates. There are m total fixings. On the relevant Settlement Date, the Option Seller shall pay to the Option Buyer an amount, in the Settlement Currency, calculated according to the following formula: Accrual Currency and Notional Amount x (the total number of Accrual Days / Total Number of Calendar Days in the Accrual Period). Payout can be cash.
 * 
 * <p>Java class for FxRangeAccrual complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FxRangeAccrual">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}Product">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}PayerReceiver.model"/>
 *         &lt;element name="notionalAmount" type="{http://www.fpml.org/FpML-5/recordkeeping}NonNegativeAmountSchedule"/>
 *         &lt;element name="accrual" type="{http://www.fpml.org/FpML-5/recordkeeping}FxAccrual"/>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}FxExpiryDateOrSchedule.model"/>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}FxSettlementDateOrSchedule.model"/>
 *         &lt;element name="barrier" type="{http://www.fpml.org/FpML-5/recordkeeping}FxAccrualBarrier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="premium" type="{http://www.fpml.org/FpML-5/recordkeeping}FxOptionPremium" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FxRangeAccrual", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
public class FxRangeAccrual
    extends Product
{


}
