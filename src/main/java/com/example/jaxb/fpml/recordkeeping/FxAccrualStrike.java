
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A shared type between accrual forwards and options where the FX accrual strike reference can point to.
 * 
 * <p>Java class for FxAccrualStrike complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FxAccrualStrike">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}Schedule">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FxAccrualStrike", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
@XmlSeeAlso({
    FxOptionStrikePrice.class,
    FxForwardStrikePrice.class
})
public class FxAccrualStrike
    extends Schedule
{


}
