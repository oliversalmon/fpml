
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * An abstract base class for all swap types which have a single netted leg, such as Variance Swaps, and Correlation Swaps.
 * 
 * <p>Java class for NettedSwapBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NettedSwapBase">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}Product">
 *       &lt;sequence>
 *         &lt;element name="additionalPayment" type="{http://www.fpml.org/FpML-5/recordkeeping}ClassifiablePayment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="extraordinaryEvents" type="{http://www.fpml.org/FpML-5/recordkeeping}ExtraordinaryEvents" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NettedSwapBase", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
@XmlSeeAlso({
    VolatilitySwap.class
})
public abstract class NettedSwapBase
    extends Product
{


}
