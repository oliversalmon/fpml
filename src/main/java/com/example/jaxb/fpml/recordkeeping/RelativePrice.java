
package com.example.jaxb.fpml.recordkeeping;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * A type which represents Pricing relative to a Benchmark.
 * 
 * <p>Java class for RelativePrice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelativePrice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="spread" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}BondEquity.model" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelativePrice", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "spread",
    "bondEquityModel"
})
public class RelativePrice {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BigDecimal spread;
    @XmlElements({
        @XmlElement(name = "bond", namespace = "http://www.fpml.org/FpML-5/recordkeeping", type = Bond.class),
        @XmlElement(name = "convertibleBond", namespace = "http://www.fpml.org/FpML-5/recordkeeping", type = ConvertibleBond.class),
        @XmlElement(name = "equity", namespace = "http://www.fpml.org/FpML-5/recordkeeping", type = EquityAsset.class)
    })
    protected List<UnderlyingAsset> bondEquityModel;

    /**
     * Gets the value of the spread property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSpread() {
        return spread;
    }

    /**
     * Sets the value of the spread property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSpread(BigDecimal value) {
        this.spread = value;
    }

    /**
     * The benchmark being referred to; either a bond or equity product.Gets the value of the bondEquityModel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bondEquityModel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBondEquityModel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Bond }
     * {@link ConvertibleBond }
     * {@link EquityAsset }
     * 
     * 
     */
    public List<UnderlyingAsset> getBondEquityModel() {
        if (bondEquityModel == null) {
            bondEquityModel = new ArrayList<UnderlyingAsset>();
        }
        return this.bondEquityModel;
    }

}
