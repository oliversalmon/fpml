
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * A type defining either a spot/forward or forward/forward FX swap transaction.
 * 
 * <p>Java class for FxSwap complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FxSwap">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}Product">
 *       &lt;sequence>
 *         &lt;element name="nearLeg" type="{http://www.fpml.org/FpML-5/recordkeeping}FxSwapLeg"/>
 *         &lt;element name="farLeg" type="{http://www.fpml.org/FpML-5/recordkeeping}FxSwapLeg"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FxSwap", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
public class FxSwap
    extends Product
{


}
