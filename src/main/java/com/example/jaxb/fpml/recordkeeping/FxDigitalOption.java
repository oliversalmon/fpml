
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Describes an option having a triggerable fixed payout.
 * 
 * <p>Java class for FxDigitalOption complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FxDigitalOption">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}Option">
 *       &lt;sequence>
 *         &lt;element name="effectiveDate" type="{http://www.fpml.org/FpML-5/recordkeeping}AdjustableOrRelativeDate" minOccurs="0"/>
 *         &lt;element name="tenorPeriod" type="{http://www.fpml.org/FpML-5/recordkeeping}Period" minOccurs="0"/>
 *         &lt;sequence>
 *           &lt;choice>
 *             &lt;sequence>
 *               &lt;element name="americanExercise" type="{http://www.fpml.org/FpML-5/recordkeeping}FxDigitalAmericanExercise"/>
 *               &lt;element name="touch" type="{http://www.fpml.org/FpML-5/recordkeeping}FxTouch" maxOccurs="unbounded"/>
 *             &lt;/sequence>
 *             &lt;sequence>
 *               &lt;element name="europeanExercise" type="{http://www.fpml.org/FpML-5/recordkeeping}FxEuropeanExercise"/>
 *               &lt;element name="trigger" type="{http://www.fpml.org/FpML-5/recordkeeping}FxTrigger" maxOccurs="unbounded"/>
 *             &lt;/sequence>
 *           &lt;/choice>
 *           &lt;element name="exerciseProcedure" type="{http://www.fpml.org/FpML-5/recordkeeping}ExerciseProcedure" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;element name="payout" type="{http://www.fpml.org/FpML-5/recordkeeping}FxOptionPayout"/>
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
@XmlType(name = "FxDigitalOption", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
public class FxDigitalOption
    extends Option
{


}
