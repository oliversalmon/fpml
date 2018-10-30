
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A type for defining short form equity option basic features.
 * 
 * <p>Java class for EquityDerivativeShortFormBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EquityDerivativeShortFormBase">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}EquityDerivativeBase">
 *       &lt;sequence>
 *         &lt;element name="strike" type="{http://www.fpml.org/FpML-5/recordkeeping}EquityStrike" minOccurs="0"/>
 *         &lt;element name="spotPrice" type="{http://www.fpml.org/FpML-5/recordkeeping}NonNegativeDecimal" minOccurs="0"/>
 *         &lt;element name="numberOfOptions" type="{http://www.fpml.org/FpML-5/recordkeeping}NonNegativeDecimal" minOccurs="0"/>
 *         &lt;element name="equityPremium" type="{http://www.fpml.org/FpML-5/recordkeeping}EquityPremium" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquityDerivativeShortFormBase", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
@XmlSeeAlso({
    BrokerEquityOption.class,
    EquityOptionTransactionSupplement.class
})
public abstract class EquityDerivativeShortFormBase
    extends EquityDerivativeBase
{


}
