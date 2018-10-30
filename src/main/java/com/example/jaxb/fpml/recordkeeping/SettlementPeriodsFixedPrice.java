
package com.example.jaxb.fpml.recordkeeping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A type defining the Fixed Price applicable to a range or ranges of Settlement Periods.
 * 
 * <p>Java class for SettlementPeriodsFixedPrice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SettlementPeriodsFixedPrice">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}FixedPrice">
 *       &lt;sequence>
 *         &lt;element name="settlementPeriodsReference" type="{http://www.fpml.org/FpML-5/recordkeeping}SettlementPeriodsReference" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementPeriodsFixedPrice", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "settlementPeriodsReference"
})
public class SettlementPeriodsFixedPrice
    extends FixedPrice
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<SettlementPeriodsReference> settlementPeriodsReference;

    /**
     * Gets the value of the settlementPeriodsReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the settlementPeriodsReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSettlementPeriodsReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SettlementPeriodsReference }
     * 
     * 
     */
    public List<SettlementPeriodsReference> getSettlementPeriodsReference() {
        if (settlementPeriodsReference == null) {
            settlementPeriodsReference = new ArrayList<SettlementPeriodsReference>();
        }
        return this.settlementPeriodsReference;
    }

}
