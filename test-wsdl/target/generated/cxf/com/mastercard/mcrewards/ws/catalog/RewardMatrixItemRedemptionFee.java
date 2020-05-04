
package com.mastercard.mcrewards.ws.catalog;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RewardMatrixItemRedemptionFee complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RewardMatrixItemRedemptionFee"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="rewardMatrixItemRedemptionFeeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rewardMatrixItemRedemptionFeeAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="perQuantitySw" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RewardMatrixItemRedemptionFee", propOrder = {
    "rewardMatrixItemRedemptionFeeDescription",
    "rewardMatrixItemRedemptionFeeAmount",
    "perQuantitySw"
})
public class RewardMatrixItemRedemptionFee {

    protected String rewardMatrixItemRedemptionFeeDescription;
    @XmlElement(required = true)
    protected BigDecimal rewardMatrixItemRedemptionFeeAmount;
    protected boolean perQuantitySw;

    /**
     * Gets the value of the rewardMatrixItemRedemptionFeeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRewardMatrixItemRedemptionFeeDescription() {
        return rewardMatrixItemRedemptionFeeDescription;
    }

    /**
     * Sets the value of the rewardMatrixItemRedemptionFeeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRewardMatrixItemRedemptionFeeDescription(String value) {
        this.rewardMatrixItemRedemptionFeeDescription = value;
    }

    /**
     * Gets the value of the rewardMatrixItemRedemptionFeeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRewardMatrixItemRedemptionFeeAmount() {
        return rewardMatrixItemRedemptionFeeAmount;
    }

    /**
     * Sets the value of the rewardMatrixItemRedemptionFeeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRewardMatrixItemRedemptionFeeAmount(BigDecimal value) {
        this.rewardMatrixItemRedemptionFeeAmount = value;
    }

    /**
     * Gets the value of the perQuantitySw property.
     * 
     */
    public boolean isPerQuantitySw() {
        return perQuantitySw;
    }

    /**
     * Sets the value of the perQuantitySw property.
     * 
     */
    public void setPerQuantitySw(boolean value) {
        this.perQuantitySw = value;
    }

}
