
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A type for defining the common features of equity derivatives.
 * 
 * <p>Java class for EquityDerivativeBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EquityDerivativeBase">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}Product">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}BuyerSeller.model"/>
 *         &lt;element name="optionType" type="{http://www.fpml.org/FpML-5/recordkeeping}EquityOptionTypeEnum" minOccurs="0"/>
 *         &lt;element name="equityEffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="underlyer" type="{http://www.fpml.org/FpML-5/recordkeeping}Underlyer"/>
 *         &lt;element name="notional" type="{http://www.fpml.org/FpML-5/recordkeeping}NonNegativeMoney" minOccurs="0"/>
 *         &lt;element name="equityExercise" type="{http://www.fpml.org/FpML-5/recordkeeping}EquityExerciseValuationSettlement"/>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}Feature.model" minOccurs="0"/>
 *         &lt;element name="strategyFeature" type="{http://www.fpml.org/FpML-5/recordkeeping}StrategyFeature" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquityDerivativeBase", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
@XmlSeeAlso({
    EquityDerivativeShortFormBase.class,
    EquityDerivativeLongFormBase.class
})
public abstract class EquityDerivativeBase
    extends Product
{


}
