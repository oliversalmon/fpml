
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Simple product representation providing key information about a variety of different products. Standard products - for use in Transparency reporting to define a product that represents a standardized OTC derivative transaction whose economics do not need to be fully described using an FpML schema because they are implied by the product ID. In other views, standard products are present for convenience to support internal messaging and workflows that are cross-product. Standard products are not full trade representations as such they are not intended to be used for confirming trades.
 * 
 * <p>Java class for StandardProduct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StandardProduct">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}Product">
 *       &lt;sequence>
 *         &lt;element name="notional" type="{http://www.fpml.org/FpML-5/recordkeeping}CashflowNotional"/>
 *         &lt;element name="quote" type="{http://www.fpml.org/FpML-5/recordkeeping}BasicQuotation" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StandardProduct", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
public class StandardProduct
    extends Product
{


}
