
package com.mastercard.mcrewards.ws.catalog;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="rewardCatalogHierarchID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="filter" type="{http://catalog.ws.mcrewards.mastercard.com/}RewardItemSearchFilter" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "rewardCatalogHierarchID",
    "language",
    "filter"
})
@XmlRootElement(name = "getRewardItems")
public class GetRewardItems {

    protected Long rewardCatalogHierarchID;
    protected String language;
    protected RewardItemSearchFilter filter;

    /**
     * Gets the value of the rewardCatalogHierarchID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRewardCatalogHierarchID() {
        return rewardCatalogHierarchID;
    }

    /**
     * Sets the value of the rewardCatalogHierarchID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRewardCatalogHierarchID(Long value) {
        this.rewardCatalogHierarchID = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the filter property.
     * 
     * @return
     *     possible object is
     *     {@link RewardItemSearchFilter }
     *     
     */
    public RewardItemSearchFilter getFilter() {
        return filter;
    }

    /**
     * Sets the value of the filter property.
     * 
     * @param value
     *     allowed object is
     *     {@link RewardItemSearchFilter }
     *     
     */
    public void setFilter(RewardItemSearchFilter value) {
        this.filter = value;
    }

}
