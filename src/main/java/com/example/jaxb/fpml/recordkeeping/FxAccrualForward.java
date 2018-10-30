
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * The product defines a schedule of expiry and delivery dates which specify settlement periods. The product further defines a schedule of fixing (or observation) dates and defines regions of spot where the product settlement amounts will accrue. There are n total fixings. One accumulates a fixed proportion of Notional (1/n) for every observation date that spot fixes within the pre-defined limits of the accrual regions. If spot breaks the limits, the Notional stops accumulating during the fixings outside the limits, but continues accruing once spot comes back to the accruing region. At expiry, one buys the accrued Notional at the pre-agreed hedge rate. Payout can be cash or physical. The variation of this product include: Accrual Forward (European and American), Double Accrual Forward (DAF), Boosted Accrual Forward, Fading Forward, Leveraged Accrual Forward, Accrual Forward with Collars, etc.
 * 
 * <p>Java class for FxAccrualForward complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FxAccrualForward">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}Product">
 *       &lt;sequence>
 *         &lt;element name="notionalAmount" type="{http://www.fpml.org/FpML-5/recordkeeping}NonNegativeAmountSchedule"/>
 *         &lt;element name="accrual" type="{http://www.fpml.org/FpML-5/recordkeeping}FxAccrual"/>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}FxExpiryDateOrSchedule.model"/>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}FxSettlementDateOrSchedule.model"/>
 *         &lt;element name="spotRate" type="{http://www.fpml.org/FpML-5/recordkeeping}PositiveDecimal" minOccurs="0"/>
 *         &lt;element name="linearPayoffRegion" type="{http://www.fpml.org/FpML-5/recordkeeping}FxAccrualLinearPayoffRegion" maxOccurs="unbounded"/>
 *         &lt;element name="averageRate" type="{http://www.fpml.org/FpML-5/recordkeeping}FxAverageRate" minOccurs="0"/>
 *         &lt;element name="barrier" type="{http://www.fpml.org/FpML-5/recordkeeping}FxAccrualBarrier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="additionalPayment" type="{http://www.fpml.org/FpML-5/recordkeeping}SimplePayment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="cashSettlement" type="{http://www.fpml.org/FpML-5/recordkeeping}FxCashSettlementSimple" minOccurs="0"/>
 *         &lt;element name="settlementPeriodSchedule" type="{http://www.fpml.org/FpML-5/recordkeeping}FxAccrualSettlementPeriodSchedule" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FxAccrualForward", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
public class FxAccrualForward
    extends Product
{


}
