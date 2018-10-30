
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Describes an FX option with optional asian and barrier features.
 * 
 * <p>Java class for FxOption complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FxOption">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}Option">
 *       &lt;sequence>
 *         &lt;element name="effectiveDate" type="{http://www.fpml.org/FpML-5/recordkeeping}AdjustableOrRelativeDate" minOccurs="0"/>
 *         &lt;element name="tenorPeriod" type="{http://www.fpml.org/FpML-5/recordkeeping}Period" minOccurs="0"/>
 *         &lt;sequence>
 *           &lt;choice minOccurs="0">
 *             &lt;element name="americanExercise" type="{http://www.fpml.org/FpML-5/recordkeeping}FxAmericanExercise"/>
 *             &lt;element name="europeanExercise" type="{http://www.fpml.org/FpML-5/recordkeeping}FxEuropeanExercise"/>
 *           &lt;/choice>
 *           &lt;element name="exerciseProcedure" type="{http://www.fpml.org/FpML-5/recordkeeping}ExerciseProcedure" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;element name="putCurrencyAmount" type="{http://www.fpml.org/FpML-5/recordkeeping}NonNegativeMoney"/>
 *           &lt;element name="callCurrencyAmount" type="{http://www.fpml.org/FpML-5/recordkeeping}NonNegativeMoney"/>
 *         &lt;/sequence>
 *         &lt;element name="soldAs" type="{http://www.fpml.org/FpML-5/recordkeeping}PutCallEnum" minOccurs="0"/>
 *         &lt;sequence>
 *           &lt;element name="strike" type="{http://www.fpml.org/FpML-5/recordkeeping}FxStrikePrice"/>
 *           &lt;element name="spotRate" type="{http://www.fpml.org/FpML-5/recordkeeping}PositiveDecimal" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;element name="features" type="{http://www.fpml.org/FpML-5/recordkeeping}FxOptionFeatures" minOccurs="0"/>
 *         &lt;element name="premium" type="{http://www.fpml.org/FpML-5/recordkeeping}FxOptionPremium" maxOccurs="unbounded"/>
 *         &lt;element name="cashSettlement" type="{http://www.fpml.org/FpML-5/recordkeeping}FxCashSettlement" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FxOption", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
public class FxOption
    extends Option
{


}
