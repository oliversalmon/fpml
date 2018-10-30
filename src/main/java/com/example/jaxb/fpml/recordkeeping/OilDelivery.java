
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The physical delivery conditions for an oil product.
 * 
 * <p>Java class for OilDelivery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OilDelivery">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="pipeline" type="{http://www.fpml.org/FpML-5/recordkeeping}OilPipelineDelivery"/>
 *           &lt;element name="transfer" type="{http://www.fpml.org/FpML-5/recordkeeping}OilTransferDelivery"/>
 *         &lt;/choice>
 *         &lt;element name="importerOfRecord" type="{http://www.fpml.org/FpML-5/recordkeeping}PartyReference" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="absoluteTolerance" type="{http://www.fpml.org/FpML-5/recordkeeping}AbsoluteTolerance"/>
 *           &lt;element name="percentageTolerance" type="{http://www.fpml.org/FpML-5/recordkeeping}PercentageTolerance"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OilDelivery", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "pipeline",
    "transfer",
    "importerOfRecord",
    "absoluteTolerance",
    "percentageTolerance"
})
public class OilDelivery {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected OilPipelineDelivery pipeline;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected OilTransferDelivery transfer;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected PartyReference importerOfRecord;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected AbsoluteTolerance absoluteTolerance;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected PercentageTolerance percentageTolerance;

    /**
     * Gets the value of the pipeline property.
     * 
     * @return
     *     possible object is
     *     {@link OilPipelineDelivery }
     *     
     */
    public OilPipelineDelivery getPipeline() {
        return pipeline;
    }

    /**
     * Sets the value of the pipeline property.
     * 
     * @param value
     *     allowed object is
     *     {@link OilPipelineDelivery }
     *     
     */
    public void setPipeline(OilPipelineDelivery value) {
        this.pipeline = value;
    }

    /**
     * Gets the value of the transfer property.
     * 
     * @return
     *     possible object is
     *     {@link OilTransferDelivery }
     *     
     */
    public OilTransferDelivery getTransfer() {
        return transfer;
    }

    /**
     * Sets the value of the transfer property.
     * 
     * @param value
     *     allowed object is
     *     {@link OilTransferDelivery }
     *     
     */
    public void setTransfer(OilTransferDelivery value) {
        this.transfer = value;
    }

    /**
     * Gets the value of the importerOfRecord property.
     * 
     * @return
     *     possible object is
     *     {@link PartyReference }
     *     
     */
    public PartyReference getImporterOfRecord() {
        return importerOfRecord;
    }

    /**
     * Sets the value of the importerOfRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyReference }
     *     
     */
    public void setImporterOfRecord(PartyReference value) {
        this.importerOfRecord = value;
    }

    /**
     * Gets the value of the absoluteTolerance property.
     * 
     * @return
     *     possible object is
     *     {@link AbsoluteTolerance }
     *     
     */
    public AbsoluteTolerance getAbsoluteTolerance() {
        return absoluteTolerance;
    }

    /**
     * Sets the value of the absoluteTolerance property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbsoluteTolerance }
     *     
     */
    public void setAbsoluteTolerance(AbsoluteTolerance value) {
        this.absoluteTolerance = value;
    }

    /**
     * Gets the value of the percentageTolerance property.
     * 
     * @return
     *     possible object is
     *     {@link PercentageTolerance }
     *     
     */
    public PercentageTolerance getPercentageTolerance() {
        return percentageTolerance;
    }

    /**
     * Sets the value of the percentageTolerance property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentageTolerance }
     *     
     */
    public void setPercentageTolerance(PercentageTolerance value) {
        this.percentageTolerance = value;
    }

}
