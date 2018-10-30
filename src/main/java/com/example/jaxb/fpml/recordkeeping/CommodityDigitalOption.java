
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Defines the digital commodity option product type. Digital options exercise when a barrier is breached and are financially settled. The 'commodityDigitalOption' type is an extension of the 'commodityOption' product.
 * 
 * <p>Java class for CommodityDigitalOption complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommodityDigitalOption">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}Option">
 *       &lt;sequence>
 *         &lt;element name="optionType" type="{http://www.fpml.org/FpML-5/recordkeeping}PutCallEnum"/>
 *         &lt;element name="commodity" type="{http://www.fpml.org/FpML-5/recordkeeping}Commodity"/>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}CommodityDigitalOptionFeatures.model"/>
 *         &lt;choice>
 *           &lt;element name="notionalAmount" type="{http://www.fpml.org/FpML-5/recordkeeping}NotionalAmount"/>
 *           &lt;sequence>
 *             &lt;element name="notionalQuantity" type="{http://www.fpml.org/FpML-5/recordkeeping}CommodityNotionalQuantity" minOccurs="0"/>
 *             &lt;element name="totalNotionalQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *         &lt;element name="exercise" type="{http://www.fpml.org/FpML-5/recordkeeping}CommodityDigitalExercise" minOccurs="0"/>
 *         &lt;element name="premium" type="{http://www.fpml.org/FpML-5/recordkeeping}CommodityPremium" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}CommodityContent.model" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommodityDigitalOption", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
public class CommodityDigitalOption
    extends Option
{


}
