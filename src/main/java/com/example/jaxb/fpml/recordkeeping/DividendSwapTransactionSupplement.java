
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * A Dividend Swap Transaction Supplement.
 * 
 * <p>Java class for DividendSwapTransactionSupplement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DividendSwapTransactionSupplement">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}Product">
 *       &lt;sequence>
 *         &lt;element name="dividendLeg" type="{http://www.fpml.org/FpML-5/recordkeeping}DividendLeg" minOccurs="0"/>
 *         &lt;element name="fixedLeg" type="{http://www.fpml.org/FpML-5/recordkeeping}FixedPaymentLeg" minOccurs="0"/>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}EquityUnderlyerProvisions.model" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DividendSwapTransactionSupplement", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
public class DividendSwapTransactionSupplement
    extends Product
{


}
