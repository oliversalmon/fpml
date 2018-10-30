
package com.example.jaxb.fpml.recordkeeping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FxAccrualSettlementPeriodSchedule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FxAccrualSettlementPeriodSchedule">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="settlementPeriod" type="{http://www.fpml.org/FpML-5/recordkeeping}FxAccrualSettlementPeriod" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FxAccrualSettlementPeriodSchedule", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "settlementPeriod"
})
public class FxAccrualSettlementPeriodSchedule {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    protected List<FxAccrualSettlementPeriod> settlementPeriod;

    /**
     * Gets the value of the settlementPeriod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the settlementPeriod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSettlementPeriod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FxAccrualSettlementPeriod }
     * 
     * 
     */
    public List<FxAccrualSettlementPeriod> getSettlementPeriod() {
        if (settlementPeriod == null) {
            settlementPeriod = new ArrayList<FxAccrualSettlementPeriod>();
        }
        return this.settlementPeriod;
    }

}
