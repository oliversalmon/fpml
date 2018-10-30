
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * A type defining a group of products making up a single trade.
 * 
 * <p>Java class for Strategy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Strategy">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}Product">
 *       &lt;sequence>
 *         &lt;element name="strategyComponentIdentifier" type="{http://www.fpml.org/FpML-5/recordkeeping}StrategyComponentIdentification" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="premiumProductReference" type="{http://www.fpml.org/FpML-5/recordkeeping}ProductReference" minOccurs="0"/>
 *         &lt;element ref="{http://www.fpml.org/FpML-5/recordkeeping}product" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Strategy", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
public class Strategy
    extends Product
{


}
