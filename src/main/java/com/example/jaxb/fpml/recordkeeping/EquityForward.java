
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * A type for defining equity forwards.
 * 
 * <p>Java class for EquityForward complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EquityForward">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}EquityDerivativeLongFormBase">
 *       &lt;sequence>
 *         &lt;element name="forwardPrice" type="{http://www.fpml.org/FpML-5/recordkeeping}NonNegativeMoney"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquityForward", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
public class EquityForward
    extends EquityDerivativeLongFormBase
{


}
