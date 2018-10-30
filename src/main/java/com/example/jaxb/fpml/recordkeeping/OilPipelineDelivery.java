
package com.example.jaxb.fpml.recordkeeping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The physical delivery conditions specific to an oil product delivered by pipeline.
 * 
 * <p>Java class for OilPipelineDelivery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OilPipelineDelivery">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pipelineName" type="{http://www.fpml.org/FpML-5/recordkeeping}CommodityPipeline" minOccurs="0"/>
 *         &lt;element name="withdrawalPoint" type="{http://www.fpml.org/FpML-5/recordkeeping}CommodityDeliveryPoint" minOccurs="0"/>
 *         &lt;element name="entryPoint" type="{http://www.fpml.org/FpML-5/recordkeeping}CommodityDeliveryPoint" minOccurs="0"/>
 *         &lt;element name="deliverableByBarge" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="risk" type="{http://www.fpml.org/FpML-5/recordkeeping}CommodityDeliveryRisk" minOccurs="0"/>
 *         &lt;element name="cycle" type="{http://www.fpml.org/FpML-5/recordkeeping}CommodityPipelineCycle" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OilPipelineDelivery", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "pipelineName",
    "withdrawalPoint",
    "entryPoint",
    "deliverableByBarge",
    "risk",
    "cycle"
})
public class OilPipelineDelivery {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CommodityPipeline pipelineName;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CommodityDeliveryPoint withdrawalPoint;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CommodityDeliveryPoint entryPoint;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean deliverableByBarge;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CommodityDeliveryRisk risk;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<CommodityPipelineCycle> cycle;

    /**
     * Gets the value of the pipelineName property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityPipeline }
     *     
     */
    public CommodityPipeline getPipelineName() {
        return pipelineName;
    }

    /**
     * Sets the value of the pipelineName property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityPipeline }
     *     
     */
    public void setPipelineName(CommodityPipeline value) {
        this.pipelineName = value;
    }

    /**
     * Gets the value of the withdrawalPoint property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityDeliveryPoint }
     *     
     */
    public CommodityDeliveryPoint getWithdrawalPoint() {
        return withdrawalPoint;
    }

    /**
     * Sets the value of the withdrawalPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityDeliveryPoint }
     *     
     */
    public void setWithdrawalPoint(CommodityDeliveryPoint value) {
        this.withdrawalPoint = value;
    }

    /**
     * Gets the value of the entryPoint property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityDeliveryPoint }
     *     
     */
    public CommodityDeliveryPoint getEntryPoint() {
        return entryPoint;
    }

    /**
     * Sets the value of the entryPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityDeliveryPoint }
     *     
     */
    public void setEntryPoint(CommodityDeliveryPoint value) {
        this.entryPoint = value;
    }

    /**
     * Gets the value of the deliverableByBarge property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeliverableByBarge() {
        return deliverableByBarge;
    }

    /**
     * Sets the value of the deliverableByBarge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeliverableByBarge(Boolean value) {
        this.deliverableByBarge = value;
    }

    /**
     * Gets the value of the risk property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityDeliveryRisk }
     *     
     */
    public CommodityDeliveryRisk getRisk() {
        return risk;
    }

    /**
     * Sets the value of the risk property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityDeliveryRisk }
     *     
     */
    public void setRisk(CommodityDeliveryRisk value) {
        this.risk = value;
    }

    /**
     * Gets the value of the cycle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cycle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCycle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommodityPipelineCycle }
     * 
     * 
     */
    public List<CommodityPipelineCycle> getCycle() {
        if (cycle == null) {
            cycle = new ArrayList<CommodityPipelineCycle>();
        }
        return this.cycle;
    }

}
