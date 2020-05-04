
package com.mastercard.mcrewards.ws.catalog;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RewardItemSearchFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RewardItemSearchFilter"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="rewardItemPointLevelFrom" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="rewardItemPointLevelTo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="rewardItemKeyword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RewardItemSearchFilter", propOrder = {
    "rewardItemPointLevelFrom",
    "rewardItemPointLevelTo",
    "rewardItemKeyword"
})
public class RewardItemSearchFilter {

    @XmlElementRef(name = "rewardItemPointLevelFrom", namespace = "http://catalog.ws.mcrewards.mastercard.com/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> rewardItemPointLevelFrom;
    @XmlElementRef(name = "rewardItemPointLevelTo", namespace = "http://catalog.ws.mcrewards.mastercard.com/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> rewardItemPointLevelTo;
    protected String rewardItemKeyword;

    /**
     * Gets the value of the rewardItemPointLevelFrom property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getRewardItemPointLevelFrom() {
        return rewardItemPointLevelFrom;
    }

    /**
     * Sets the value of the rewardItemPointLevelFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setRewardItemPointLevelFrom(JAXBElement<BigDecimal> value) {
        this.rewardItemPointLevelFrom = value;
    }

    /**
     * Gets the value of the rewardItemPointLevelTo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getRewardItemPointLevelTo() {
        return rewardItemPointLevelTo;
    }

    /**
     * Sets the value of the rewardItemPointLevelTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setRewardItemPointLevelTo(JAXBElement<BigDecimal> value) {
        this.rewardItemPointLevelTo = value;
    }

    /**
     * Gets the value of the rewardItemKeyword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRewardItemKeyword() {
        return rewardItemKeyword;
    }

    /**
     * Sets the value of the rewardItemKeyword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRewardItemKeyword(String value) {
        this.rewardItemKeyword = value;
    }

}
