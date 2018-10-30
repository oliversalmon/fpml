
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Base type for options starting with the 4-3 release, until we refactor the schema as part of the 5-0 release series.
 * 
 * <p>Java class for OptionBaseExtended complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OptionBaseExtended">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}OptionBase">
 *       &lt;sequence>
 *         &lt;element name="premium" type="{http://www.fpml.org/FpML-5/recordkeeping}Premium" minOccurs="0"/>
 *         &lt;element ref="{http://www.fpml.org/FpML-5/recordkeeping}exercise"/>
 *         &lt;element name="exerciseProcedure" type="{http://www.fpml.org/FpML-5/recordkeeping}ExerciseProcedure" minOccurs="0"/>
 *         &lt;element name="feature" type="{http://www.fpml.org/FpML-5/recordkeeping}OptionFeature" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="notionalReference" type="{http://www.fpml.org/FpML-5/recordkeeping}NotionalAmountReference"/>
 *           &lt;element name="notionalAmount" type="{http://www.fpml.org/FpML-5/recordkeeping}Money"/>
 *         &lt;/choice>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}OptionDenomination.model" minOccurs="0"/>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}OptionSettlement.model"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OptionBaseExtended", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
public abstract class OptionBaseExtended
    extends OptionBase
{


}
