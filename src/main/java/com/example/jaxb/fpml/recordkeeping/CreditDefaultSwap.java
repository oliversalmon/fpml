
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditDefaultSwap complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditDefaultSwap">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}Product">
 *       &lt;sequence>
 *         &lt;element name="generalTerms" type="{http://www.fpml.org/FpML-5/recordkeeping}GeneralTerms"/>
 *         &lt;element name="feeLeg" type="{http://www.fpml.org/FpML-5/recordkeeping}FeeLeg"/>
 *         &lt;element name="protectionTerms" type="{http://www.fpml.org/FpML-5/recordkeeping}ProtectionTerms" maxOccurs="unbounded"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="cashSettlementTerms" type="{http://www.fpml.org/FpML-5/recordkeeping}CashSettlementTerms"/>
 *           &lt;element name="physicalSettlementTerms" type="{http://www.fpml.org/FpML-5/recordkeeping}PhysicalSettlementTerms"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditDefaultSwap", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
public class CreditDefaultSwap
    extends Product
{


}
