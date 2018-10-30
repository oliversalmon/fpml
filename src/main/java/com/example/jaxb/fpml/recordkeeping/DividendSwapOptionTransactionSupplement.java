
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DividendSwapOptionTransactionSupplement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DividendSwapOptionTransactionSupplement">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}OptionBase">
 *       &lt;sequence>
 *         &lt;element name="equityPremium" type="{http://www.fpml.org/FpML-5/recordkeeping}EquityPremium" minOccurs="0"/>
 *         &lt;element name="equityExercise" type="{http://www.fpml.org/FpML-5/recordkeeping}EquityExerciseValuationSettlement"/>
 *         &lt;element name="exchangeLookAlike" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="methodOfAdjustment" type="{http://www.fpml.org/FpML-5/recordkeeping}MethodOfAdjustmentEnum" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="optionEntitlement" type="{http://www.fpml.org/FpML-5/recordkeeping}PositiveDecimal"/>
 *           &lt;element name="multiplier" type="{http://www.fpml.org/FpML-5/recordkeeping}PositiveDecimal"/>
 *         &lt;/choice>
 *         &lt;element name="clearingInstructions" type="{http://www.fpml.org/FpML-5/recordkeeping}SwaptionPhysicalSettlement" minOccurs="0"/>
 *         &lt;element name="dividendSwapTransactionSupplement" type="{http://www.fpml.org/FpML-5/recordkeeping}DividendSwapTransactionSupplement"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DividendSwapOptionTransactionSupplement", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
public class DividendSwapOptionTransactionSupplement
    extends OptionBase
{


}
