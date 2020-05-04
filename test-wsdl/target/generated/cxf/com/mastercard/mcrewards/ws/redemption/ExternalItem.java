
package com.mastercard.mcrewards.ws.redemption;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for externalItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="externalItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://redemption.ws.mcrewards.mastercard.com/}GenericRedemptionItem"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="newShippingAddressSw" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="shippingAddressId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="shippingAddress" type="{http://redemption.ws.mcrewards.mastercard.com/}ShippingAddress" minOccurs="0"/&gt;
 *         &lt;element name="rewardMerchantPartnerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="merchantId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="itemSkuCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="itemQuantity" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="redemptionCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="redemptionSubCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="redemptionChannelOrigin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="promotionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pointsFees" type="{http://redemption.ws.mcrewards.mastercard.com/}pointFees"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "externalItem", propOrder = {
    "newShippingAddressSw",
    "shippingAddressId",
    "shippingAddress",
    "rewardMerchantPartnerId",
    "merchantId",
    "itemSkuCode",
    "itemQuantity",
    "redemptionCategory",
    "redemptionSubCategory",
    "redemptionChannelOrigin",
    "promotionId",
    "pointsFees"
})
public class ExternalItem
    extends GenericRedemptionItem
{

    protected boolean newShippingAddressSw;
    protected String shippingAddressId;
    protected ShippingAddress shippingAddress;
    protected String rewardMerchantPartnerId;
    protected String merchantId;
    @XmlElement(required = true)
    protected String itemSkuCode;
    protected long itemQuantity;
    protected String redemptionCategory;
    protected String redemptionSubCategory;
    protected String redemptionChannelOrigin;
    protected String promotionId;
    @XmlElement(required = true)
    protected PointFees pointsFees;

    /**
     * Gets the value of the newShippingAddressSw property.
     * 
     */
    public boolean isNewShippingAddressSw() {
        return newShippingAddressSw;
    }

    /**
     * Sets the value of the newShippingAddressSw property.
     * 
     */
    public void setNewShippingAddressSw(boolean value) {
        this.newShippingAddressSw = value;
    }

    /**
     * Gets the value of the shippingAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingAddressId() {
        return shippingAddressId;
    }

    /**
     * Sets the value of the shippingAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingAddressId(String value) {
        this.shippingAddressId = value;
    }

    /**
     * Gets the value of the shippingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingAddress }
     *     
     */
    public ShippingAddress getShippingAddress() {
        return shippingAddress;
    }

    /**
     * Sets the value of the shippingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingAddress }
     *     
     */
    public void setShippingAddress(ShippingAddress value) {
        this.shippingAddress = value;
    }

    /**
     * Gets the value of the rewardMerchantPartnerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRewardMerchantPartnerId() {
        return rewardMerchantPartnerId;
    }

    /**
     * Sets the value of the rewardMerchantPartnerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRewardMerchantPartnerId(String value) {
        this.rewardMerchantPartnerId = value;
    }

    /**
     * Gets the value of the merchantId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantId() {
        return merchantId;
    }

    /**
     * Sets the value of the merchantId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantId(String value) {
        this.merchantId = value;
    }

    /**
     * Gets the value of the itemSkuCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemSkuCode() {
        return itemSkuCode;
    }

    /**
     * Sets the value of the itemSkuCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemSkuCode(String value) {
        this.itemSkuCode = value;
    }

    /**
     * Gets the value of the itemQuantity property.
     * 
     */
    public long getItemQuantity() {
        return itemQuantity;
    }

    /**
     * Sets the value of the itemQuantity property.
     * 
     */
    public void setItemQuantity(long value) {
        this.itemQuantity = value;
    }

    /**
     * Gets the value of the redemptionCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedemptionCategory() {
        return redemptionCategory;
    }

    /**
     * Sets the value of the redemptionCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedemptionCategory(String value) {
        this.redemptionCategory = value;
    }

    /**
     * Gets the value of the redemptionSubCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedemptionSubCategory() {
        return redemptionSubCategory;
    }

    /**
     * Sets the value of the redemptionSubCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedemptionSubCategory(String value) {
        this.redemptionSubCategory = value;
    }

    /**
     * Gets the value of the redemptionChannelOrigin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedemptionChannelOrigin() {
        return redemptionChannelOrigin;
    }

    /**
     * Sets the value of the redemptionChannelOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedemptionChannelOrigin(String value) {
        this.redemptionChannelOrigin = value;
    }

    /**
     * Gets the value of the promotionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotionId() {
        return promotionId;
    }

    /**
     * Sets the value of the promotionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotionId(String value) {
        this.promotionId = value;
    }

    /**
     * Gets the value of the pointsFees property.
     * 
     * @return
     *     possible object is
     *     {@link PointFees }
     *     
     */
    public PointFees getPointsFees() {
        return pointsFees;
    }

    /**
     * Sets the value of the pointsFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointFees }
     *     
     */
    public void setPointsFees(PointFees value) {
        this.pointsFees = value;
    }

}
