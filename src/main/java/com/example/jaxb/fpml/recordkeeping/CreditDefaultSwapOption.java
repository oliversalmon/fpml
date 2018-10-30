
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * A complex type to support the credit default swap option.
 * 
 * <p>Java class for CreditDefaultSwapOption complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditDefaultSwapOption">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}OptionBaseExtended">
 *       &lt;sequence>
 *         &lt;element name="clearingInstructions" type="{http://www.fpml.org/FpML-5/recordkeeping}SwaptionPhysicalSettlement" minOccurs="0"/>
 *         &lt;element name="strike" type="{http://www.fpml.org/FpML-5/recordkeeping}CreditOptionStrike"/>
 *         &lt;element name="creditDefaultSwap" type="{http://www.fpml.org/FpML-5/recordkeeping}CreditDefaultSwap"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditDefaultSwapOption", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
public class CreditDefaultSwapOption
    extends OptionBaseExtended
{


}
