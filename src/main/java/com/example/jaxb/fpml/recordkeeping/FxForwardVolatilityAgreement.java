
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Describes a contract on future levels of implied volatility. The main characteristic of this product is that the underlying is a straddle (underlying options) with a specific tenor starting from the fixing (effective or pricing) date, and are priced on that fixing date using a level of volatility that is agreed at the time of execution of the volatility agreement.
 * 
 * <p>Java class for FxForwardVolatilityAgreement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FxForwardVolatilityAgreement">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}Product">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}BuyerSeller.model"/>
 *         &lt;element name="quotedCurrencyPair" type="{http://www.fpml.org/FpML-5/recordkeeping}QuotedCurrencyPair"/>
 *         &lt;element name="fixingDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="fixingTime" type="{http://www.fpml.org/FpML-5/recordkeeping}BusinessCenterTime" minOccurs="0"/>
 *         &lt;element name="forwardVolatilityStrikePrice" type="{http://www.fpml.org/FpML-5/recordkeeping}PositiveDecimal"/>
 *         &lt;element name="straddle" type="{http://www.fpml.org/FpML-5/recordkeeping}FxStraddle"/>
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
@XmlType(name = "FxForwardVolatilityAgreement", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
public class FxForwardVolatilityAgreement
    extends Product
{


}
