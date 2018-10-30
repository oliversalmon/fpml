
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VolatilitySwapTransactionSupplement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VolatilitySwapTransactionSupplement">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}Product">
 *       &lt;sequence>
 *         &lt;element name="volatilityLeg" type="{http://www.fpml.org/FpML-5/recordkeeping}VolatilityLeg" maxOccurs="unbounded"/>
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
@XmlType(name = "VolatilitySwapTransactionSupplement", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
public class VolatilitySwapTransactionSupplement
    extends Product
{


}
