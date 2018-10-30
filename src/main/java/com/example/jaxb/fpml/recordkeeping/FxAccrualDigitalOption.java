
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * An FX Accrual Digital Option product The product defines a list of fixing (or observation) dates. There are m total fixings. At the expiry date of the product, the buyer of the option has the right to an FX settlement with n/m * Notional. Payout can be cash or physical.
 * 
 * <p>Java class for FxAccrualDigitalOption complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FxAccrualDigitalOption">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}Option">
 *       &lt;sequence>
 *         &lt;element name="notionalAmount" type="{http://www.fpml.org/FpML-5/recordkeeping}NonNegativeAmountSchedule"/>
 *         &lt;element name="accrual" type="{http://www.fpml.org/FpML-5/recordkeeping}FxAccrual"/>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}FxExpiryDateOrSchedule.model"/>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}FxSettlementDateOrSchedule.model"/>
 *         &lt;element name="exerciseProcedure" type="{http://www.fpml.org/FpML-5/recordkeeping}ExerciseProcedure" minOccurs="0"/>
 *         &lt;element name="trigger" type="{http://www.fpml.org/FpML-5/recordkeeping}FxAccrualTrigger"/>
 *         &lt;element name="barrier" type="{http://www.fpml.org/FpML-5/recordkeeping}FxAccrualBarrier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="premium" type="{http://www.fpml.org/FpML-5/recordkeeping}FxOptionPremium" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FxAccrualDigitalOption", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
public class FxAccrualDigitalOption
    extends Option
{


}
