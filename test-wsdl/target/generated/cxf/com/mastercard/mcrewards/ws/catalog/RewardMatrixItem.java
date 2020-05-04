
package com.mastercard.mcrewards.ws.catalog;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RewardMatrixItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RewardMatrixItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="rewardMatrixItemId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="rewardItemShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rewardItemLongDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rewardItemImageURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rewardMatrixItemPointValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="shippingAddressSw" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="redeemableItemSw" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="physicalAddressRequiredSw" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="singleQuantityRedemptionSw" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="emailAddressRequiredSw" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="orderInformation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="personalizationInformationSw" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="personalizationInformationLength" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="personalizationLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rewardMatrixItemRedemptionFees" type="{http://catalog.ws.mcrewards.mastercard.com/}RewardMatrixItemRedemptionFee" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RewardMatrixItem", propOrder = {
    "rewardMatrixItemId",
    "rewardItemShortDescription",
    "rewardItemLongDescription",
    "rewardItemImageURL",
    "rewardMatrixItemPointValue",
    "shippingAddressSw",
    "redeemableItemSw",
    "physicalAddressRequiredSw",
    "singleQuantityRedemptionSw",
    "emailAddressRequiredSw",
    "orderInformation",
    "personalizationInformationSw",
    "personalizationInformationLength",
    "personalizationLabel",
    "rewardMatrixItemRedemptionFees"
})
public class RewardMatrixItem {

    protected long rewardMatrixItemId;
    protected String rewardItemShortDescription;
    protected String rewardItemLongDescription;
    protected String rewardItemImageURL;
    @XmlElement(required = true)
    protected BigDecimal rewardMatrixItemPointValue;
    protected boolean shippingAddressSw;
    protected boolean redeemableItemSw;
    protected boolean physicalAddressRequiredSw;
    protected boolean singleQuantityRedemptionSw;
    protected boolean emailAddressRequiredSw;
    protected String orderInformation;
    protected boolean personalizationInformationSw;
    protected Long personalizationInformationLength;
    protected String personalizationLabel;
    protected List<RewardMatrixItemRedemptionFee> rewardMatrixItemRedemptionFees;

    /**
     * Gets the value of the rewardMatrixItemId property.
     * 
     */
    public long getRewardMatrixItemId() {
        return rewardMatrixItemId;
    }

    /**
     * Sets the value of the rewardMatrixItemId property.
     * 
     */
    public void setRewardMatrixItemId(long value) {
        this.rewardMatrixItemId = value;
    }

    /**
     * Gets the value of the rewardItemShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRewardItemShortDescription() {
        return rewardItemShortDescription;
    }

    /**
     * Sets the value of the rewardItemShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRewardItemShortDescription(String value) {
        this.rewardItemShortDescription = value;
    }

    /**
     * Gets the value of the rewardItemLongDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRewardItemLongDescription() {
        return rewardItemLongDescription;
    }

    /**
     * Sets the value of the rewardItemLongDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRewardItemLongDescription(String value) {
        this.rewardItemLongDescription = value;
    }

    /**
     * Gets the value of the rewardItemImageURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRewardItemImageURL() {
        return rewardItemImageURL;
    }

    /**
     * Sets the value of the rewardItemImageURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRewardItemImageURL(String value) {
        this.rewardItemImageURL = value;
    }

    /**
     * Gets the value of the rewardMatrixItemPointValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRewardMatrixItemPointValue() {
        return rewardMatrixItemPointValue;
    }

    /**
     * Sets the value of the rewardMatrixItemPointValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRewardMatrixItemPointValue(BigDecimal value) {
        this.rewardMatrixItemPointValue = value;
    }

    /**
     * Gets the value of the shippingAddressSw property.
     * 
     */
    public boolean isShippingAddressSw() {
        return shippingAddressSw;
    }

    /**
     * Sets the value of the shippingAddressSw property.
     * 
     */
    public void setShippingAddressSw(boolean value) {
        this.shippingAddressSw = value;
    }

    /**
     * Gets the value of the redeemableItemSw property.
     * 
     */
    public boolean isRedeemableItemSw() {
        return redeemableItemSw;
    }

    /**
     * Sets the value of the redeemableItemSw property.
     * 
     */
    public void setRedeemableItemSw(boolean value) {
        this.redeemableItemSw = value;
    }

    /**
     * Gets the value of the physicalAddressRequiredSw property.
     * 
     */
    public boolean isPhysicalAddressRequiredSw() {
        return physicalAddressRequiredSw;
    }

    /**
     * Sets the value of the physicalAddressRequiredSw property.
     * 
     */
    public void setPhysicalAddressRequiredSw(boolean value) {
        this.physicalAddressRequiredSw = value;
    }

    /**
     * Gets the value of the singleQuantityRedemptionSw property.
     * 
     */
    public boolean isSingleQuantityRedemptionSw() {
        return singleQuantityRedemptionSw;
    }

    /**
     * Sets the value of the singleQuantityRedemptionSw property.
     * 
     */
    public void setSingleQuantityRedemptionSw(boolean value) {
        this.singleQuantityRedemptionSw = value;
    }

    /**
     * Gets the value of the emailAddressRequiredSw property.
     * 
     */
    public boolean isEmailAddressRequiredSw() {
        return emailAddressRequiredSw;
    }

    /**
     * Sets the value of the emailAddressRequiredSw property.
     * 
     */
    public void setEmailAddressRequiredSw(boolean value) {
        this.emailAddressRequiredSw = value;
    }

    /**
     * Gets the value of the orderInformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderInformation() {
        return orderInformation;
    }

    /**
     * Sets the value of the orderInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderInformation(String value) {
        this.orderInformation = value;
    }

    /**
     * Gets the value of the personalizationInformationSw property.
     * 
     */
    public boolean isPersonalizationInformationSw() {
        return personalizationInformationSw;
    }

    /**
     * Sets the value of the personalizationInformationSw property.
     * 
     */
    public void setPersonalizationInformationSw(boolean value) {
        this.personalizationInformationSw = value;
    }

    /**
     * Gets the value of the personalizationInformationLength property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPersonalizationInformationLength() {
        return personalizationInformationLength;
    }

    /**
     * Sets the value of the personalizationInformationLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPersonalizationInformationLength(Long value) {
        this.personalizationInformationLength = value;
    }

    /**
     * Gets the value of the personalizationLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalizationLabel() {
        return personalizationLabel;
    }

    /**
     * Sets the value of the personalizationLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalizationLabel(String value) {
        this.personalizationLabel = value;
    }

    /**
     * Gets the value of the rewardMatrixItemRedemptionFees property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rewardMatrixItemRedemptionFees property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRewardMatrixItemRedemptionFees().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RewardMatrixItemRedemptionFee }
     * 
     * 
     */
    public List<RewardMatrixItemRedemptionFee> getRewardMatrixItemRedemptionFees() {
        if (rewardMatrixItemRedemptionFees == null) {
            rewardMatrixItemRedemptionFees = new ArrayList<RewardMatrixItemRedemptionFee>();
        }
        return this.rewardMatrixItemRedemptionFees;
    }

}
