
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * A Variance Swap Transaction Supplement.
 * 
 * <p>Java class for VarianceSwapTransactionSupplement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VarianceSwapTransactionSupplement">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}Product">
 *       &lt;sequence>
 *         &lt;element name="varianceLeg" type="{http://www.fpml.org/FpML-5/recordkeeping}VarianceLeg" maxOccurs="unbounded"/>
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
@XmlType(name = "VarianceSwapTransactionSupplement", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
public class VarianceSwapTransactionSupplement
    extends Product
{


}
