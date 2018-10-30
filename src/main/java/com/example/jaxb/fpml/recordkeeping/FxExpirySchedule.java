
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Defines the expiry/observation schedule of the target.
 * 
 * <p>Java class for FxExpirySchedule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FxExpirySchedule">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}FxSchedule">
 *       &lt;sequence>
 *         &lt;element name="finalExpiryDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="expiryTime" type="{http://www.fpml.org/FpML-5/recordkeeping}BusinessCenterTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FxExpirySchedule", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
public class FxExpirySchedule
    extends FxSchedule
{


}
