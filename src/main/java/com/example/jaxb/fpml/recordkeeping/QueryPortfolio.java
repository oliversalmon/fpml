
package com.example.jaxb.fpml.recordkeeping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A type representing a portfolio obtained by querying the set of trades held in a repository. It contains trades matching the intersection of all criteria specified using one or more queryParameters or trades matching the union of two or more child queryPortfolios.
 * 
 * <p>Java class for QueryPortfolio complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryPortfolio">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}Portfolio">
 *       &lt;sequence>
 *         &lt;element name="queryParameter" type="{http://www.fpml.org/FpML-5/recordkeeping}QueryParameter" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryPortfolio", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "queryParameter"
})
public class QueryPortfolio
    extends Portfolio
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<QueryParameter> queryParameter;

    /**
     * Gets the value of the queryParameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the queryParameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQueryParameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QueryParameter }
     * 
     * 
     */
    public List<QueryParameter> getQueryParameter() {
        if (queryParameter == null) {
            queryParameter = new ArrayList<QueryParameter>();
        }
        return this.queryParameter;
    }

}
