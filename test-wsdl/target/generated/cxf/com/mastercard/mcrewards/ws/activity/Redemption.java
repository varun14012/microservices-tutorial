
package com.mastercard.mcrewards.ws.activity;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Redemption complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Redemption"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="redemptionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="redemptionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pointsRedeemed" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="redemptionId" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="referenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="redemptionItemDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sourceItemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sourceItemCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rewardMatrixId" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="rewardCategoryId" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="merchantCategoryHierarchyId" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="creditCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="creditRedemptionId" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="redeemedBaseAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="billingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="postingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="deleteDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vendorCost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="purchasePointsCharge" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="overCapCharge" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="issuerCost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="pointsPurchased" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="shippingAddressId" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="redeemedLossAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="lossDescriptionId" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="lossDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="invoiceNumber" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="nonMonSentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="redemptionCallId" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="tripSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="passengerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paymentFormCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fareTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="invoiceTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fulfillmentVendorId" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="personalization" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="qcCenterId" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="qcStatusCode" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="userProfileId" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="customerId" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="programId" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="emailAddressText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="travelComponentQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="loggedinAccountId" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="mrsRedemptionSourceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="billAccountId" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="cashBackAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="cashBackRedemptionAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vendorOfferId" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="cashbackSentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="dealId" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="redeemedMarkupAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="matchedMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="matchDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="billingStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="grossCash" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="grossCredit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="qcUserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nearRealTimeVendorNotification" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Redemption", propOrder = {
    "redemptionDate",
    "redemptionDescription",
    "pointsRedeemed",
    "redemptionId",
    "referenceNumber",
    "redemptionItemDescription",
    "sourceItemId",
    "sourceItemCode",
    "rewardMatrixId",
    "rewardCategoryId",
    "merchantCategoryHierarchyId",
    "creditCode",
    "creditRedemptionId",
    "quantity",
    "redeemedBaseAmount",
    "billingDate",
    "postingDate",
    "deleteDate",
    "userId",
    "vendorCost",
    "purchasePointsCharge",
    "overCapCharge",
    "issuerCost",
    "pointsPurchased",
    "shippingAddressId",
    "redeemedLossAmount",
    "lossDescriptionId",
    "lossDescription",
    "invoiceNumber",
    "nonMonSentDate",
    "redemptionCallId",
    "tripSequenceNumber",
    "passengerName",
    "paymentFormCode",
    "fareTypeCode",
    "invoiceTypeCode",
    "fulfillmentVendorId",
    "groupId",
    "personalization",
    "qcCenterId",
    "qcStatusCode",
    "userProfileId",
    "customerId",
    "programId",
    "emailAddressText",
    "travelComponentQuantity",
    "loggedinAccountId",
    "mrsRedemptionSourceCode",
    "billAccountId",
    "cashBackAmount",
    "cashBackRedemptionAccountNumber",
    "vendorOfferId",
    "cashbackSentDate",
    "dealId",
    "redeemedMarkupAmount",
    "matchedMode",
    "matchDescription",
    "billingStatus",
    "grossCash",
    "grossCredit",
    "qcUserId",
    "nearRealTimeVendorNotification"
})
public class Redemption {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar redemptionDate;
    protected String redemptionDescription;
    protected BigDecimal pointsRedeemed;
    protected BigDecimal redemptionId;
    protected String referenceNumber;
    protected String redemptionItemDescription;
    protected String sourceItemId;
    protected String sourceItemCode;
    protected BigDecimal rewardMatrixId;
    protected BigDecimal rewardCategoryId;
    protected BigDecimal merchantCategoryHierarchyId;
    protected String creditCode;
    protected BigDecimal creditRedemptionId;
    protected BigDecimal quantity;
    protected BigDecimal redeemedBaseAmount;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar billingDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar postingDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deleteDate;
    protected String userId;
    protected BigDecimal vendorCost;
    protected BigDecimal purchasePointsCharge;
    protected BigDecimal overCapCharge;
    protected BigDecimal issuerCost;
    protected BigDecimal pointsPurchased;
    protected BigDecimal shippingAddressId;
    protected BigDecimal redeemedLossAmount;
    protected BigDecimal lossDescriptionId;
    protected String lossDescription;
    protected BigDecimal invoiceNumber;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar nonMonSentDate;
    protected BigDecimal redemptionCallId;
    protected BigDecimal tripSequenceNumber;
    protected String passengerName;
    protected String paymentFormCode;
    protected String fareTypeCode;
    protected String invoiceTypeCode;
    protected BigDecimal fulfillmentVendorId;
    protected BigDecimal groupId;
    protected String personalization;
    protected BigDecimal qcCenterId;
    protected BigDecimal qcStatusCode;
    protected BigDecimal userProfileId;
    protected BigDecimal customerId;
    protected BigDecimal programId;
    protected String emailAddressText;
    protected BigDecimal travelComponentQuantity;
    protected BigDecimal loggedinAccountId;
    protected String mrsRedemptionSourceCode;
    protected BigDecimal billAccountId;
    protected BigDecimal cashBackAmount;
    protected String cashBackRedemptionAccountNumber;
    protected BigDecimal vendorOfferId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cashbackSentDate;
    protected BigDecimal dealId;
    protected BigDecimal redeemedMarkupAmount;
    protected String matchedMode;
    protected String matchDescription;
    protected String billingStatus;
    protected BigDecimal grossCash;
    protected BigDecimal grossCredit;
    protected String qcUserId;
    protected Boolean nearRealTimeVendorNotification;

    /**
     * Gets the value of the redemptionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRedemptionDate() {
        return redemptionDate;
    }

    /**
     * Sets the value of the redemptionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRedemptionDate(XMLGregorianCalendar value) {
        this.redemptionDate = value;
    }

    /**
     * Gets the value of the redemptionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedemptionDescription() {
        return redemptionDescription;
    }

    /**
     * Sets the value of the redemptionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedemptionDescription(String value) {
        this.redemptionDescription = value;
    }

    /**
     * Gets the value of the pointsRedeemed property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPointsRedeemed() {
        return pointsRedeemed;
    }

    /**
     * Sets the value of the pointsRedeemed property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPointsRedeemed(BigDecimal value) {
        this.pointsRedeemed = value;
    }

    /**
     * Gets the value of the redemptionId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRedemptionId() {
        return redemptionId;
    }

    /**
     * Sets the value of the redemptionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRedemptionId(BigDecimal value) {
        this.redemptionId = value;
    }

    /**
     * Gets the value of the referenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceNumber() {
        return referenceNumber;
    }

    /**
     * Sets the value of the referenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceNumber(String value) {
        this.referenceNumber = value;
    }

    /**
     * Gets the value of the redemptionItemDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedemptionItemDescription() {
        return redemptionItemDescription;
    }

    /**
     * Sets the value of the redemptionItemDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedemptionItemDescription(String value) {
        this.redemptionItemDescription = value;
    }

    /**
     * Gets the value of the sourceItemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceItemId() {
        return sourceItemId;
    }

    /**
     * Sets the value of the sourceItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceItemId(String value) {
        this.sourceItemId = value;
    }

    /**
     * Gets the value of the sourceItemCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceItemCode() {
        return sourceItemCode;
    }

    /**
     * Sets the value of the sourceItemCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceItemCode(String value) {
        this.sourceItemCode = value;
    }

    /**
     * Gets the value of the rewardMatrixId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRewardMatrixId() {
        return rewardMatrixId;
    }

    /**
     * Sets the value of the rewardMatrixId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRewardMatrixId(BigDecimal value) {
        this.rewardMatrixId = value;
    }

    /**
     * Gets the value of the rewardCategoryId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRewardCategoryId() {
        return rewardCategoryId;
    }

    /**
     * Sets the value of the rewardCategoryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRewardCategoryId(BigDecimal value) {
        this.rewardCategoryId = value;
    }

    /**
     * Gets the value of the merchantCategoryHierarchyId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMerchantCategoryHierarchyId() {
        return merchantCategoryHierarchyId;
    }

    /**
     * Sets the value of the merchantCategoryHierarchyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMerchantCategoryHierarchyId(BigDecimal value) {
        this.merchantCategoryHierarchyId = value;
    }

    /**
     * Gets the value of the creditCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCode() {
        return creditCode;
    }

    /**
     * Sets the value of the creditCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCode(String value) {
        this.creditCode = value;
    }

    /**
     * Gets the value of the creditRedemptionId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCreditRedemptionId() {
        return creditRedemptionId;
    }

    /**
     * Sets the value of the creditRedemptionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCreditRedemptionId(BigDecimal value) {
        this.creditRedemptionId = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuantity(BigDecimal value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the redeemedBaseAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRedeemedBaseAmount() {
        return redeemedBaseAmount;
    }

    /**
     * Sets the value of the redeemedBaseAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRedeemedBaseAmount(BigDecimal value) {
        this.redeemedBaseAmount = value;
    }

    /**
     * Gets the value of the billingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBillingDate() {
        return billingDate;
    }

    /**
     * Sets the value of the billingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBillingDate(XMLGregorianCalendar value) {
        this.billingDate = value;
    }

    /**
     * Gets the value of the postingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPostingDate() {
        return postingDate;
    }

    /**
     * Sets the value of the postingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPostingDate(XMLGregorianCalendar value) {
        this.postingDate = value;
    }

    /**
     * Gets the value of the deleteDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeleteDate() {
        return deleteDate;
    }

    /**
     * Sets the value of the deleteDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeleteDate(XMLGregorianCalendar value) {
        this.deleteDate = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

    /**
     * Gets the value of the vendorCost property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVendorCost() {
        return vendorCost;
    }

    /**
     * Sets the value of the vendorCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVendorCost(BigDecimal value) {
        this.vendorCost = value;
    }

    /**
     * Gets the value of the purchasePointsCharge property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPurchasePointsCharge() {
        return purchasePointsCharge;
    }

    /**
     * Sets the value of the purchasePointsCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPurchasePointsCharge(BigDecimal value) {
        this.purchasePointsCharge = value;
    }

    /**
     * Gets the value of the overCapCharge property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOverCapCharge() {
        return overCapCharge;
    }

    /**
     * Sets the value of the overCapCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOverCapCharge(BigDecimal value) {
        this.overCapCharge = value;
    }

    /**
     * Gets the value of the issuerCost property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIssuerCost() {
        return issuerCost;
    }

    /**
     * Sets the value of the issuerCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIssuerCost(BigDecimal value) {
        this.issuerCost = value;
    }

    /**
     * Gets the value of the pointsPurchased property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPointsPurchased() {
        return pointsPurchased;
    }

    /**
     * Sets the value of the pointsPurchased property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPointsPurchased(BigDecimal value) {
        this.pointsPurchased = value;
    }

    /**
     * Gets the value of the shippingAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getShippingAddressId() {
        return shippingAddressId;
    }

    /**
     * Sets the value of the shippingAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setShippingAddressId(BigDecimal value) {
        this.shippingAddressId = value;
    }

    /**
     * Gets the value of the redeemedLossAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRedeemedLossAmount() {
        return redeemedLossAmount;
    }

    /**
     * Sets the value of the redeemedLossAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRedeemedLossAmount(BigDecimal value) {
        this.redeemedLossAmount = value;
    }

    /**
     * Gets the value of the lossDescriptionId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLossDescriptionId() {
        return lossDescriptionId;
    }

    /**
     * Sets the value of the lossDescriptionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLossDescriptionId(BigDecimal value) {
        this.lossDescriptionId = value;
    }

    /**
     * Gets the value of the lossDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLossDescription() {
        return lossDescription;
    }

    /**
     * Sets the value of the lossDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLossDescription(String value) {
        this.lossDescription = value;
    }

    /**
     * Gets the value of the invoiceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInvoiceNumber() {
        return invoiceNumber;
    }

    /**
     * Sets the value of the invoiceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInvoiceNumber(BigDecimal value) {
        this.invoiceNumber = value;
    }

    /**
     * Gets the value of the nonMonSentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNonMonSentDate() {
        return nonMonSentDate;
    }

    /**
     * Sets the value of the nonMonSentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNonMonSentDate(XMLGregorianCalendar value) {
        this.nonMonSentDate = value;
    }

    /**
     * Gets the value of the redemptionCallId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRedemptionCallId() {
        return redemptionCallId;
    }

    /**
     * Sets the value of the redemptionCallId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRedemptionCallId(BigDecimal value) {
        this.redemptionCallId = value;
    }

    /**
     * Gets the value of the tripSequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTripSequenceNumber() {
        return tripSequenceNumber;
    }

    /**
     * Sets the value of the tripSequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTripSequenceNumber(BigDecimal value) {
        this.tripSequenceNumber = value;
    }

    /**
     * Gets the value of the passengerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerName() {
        return passengerName;
    }

    /**
     * Sets the value of the passengerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerName(String value) {
        this.passengerName = value;
    }

    /**
     * Gets the value of the paymentFormCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentFormCode() {
        return paymentFormCode;
    }

    /**
     * Sets the value of the paymentFormCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentFormCode(String value) {
        this.paymentFormCode = value;
    }

    /**
     * Gets the value of the fareTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareTypeCode() {
        return fareTypeCode;
    }

    /**
     * Sets the value of the fareTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareTypeCode(String value) {
        this.fareTypeCode = value;
    }

    /**
     * Gets the value of the invoiceTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceTypeCode() {
        return invoiceTypeCode;
    }

    /**
     * Sets the value of the invoiceTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceTypeCode(String value) {
        this.invoiceTypeCode = value;
    }

    /**
     * Gets the value of the fulfillmentVendorId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFulfillmentVendorId() {
        return fulfillmentVendorId;
    }

    /**
     * Sets the value of the fulfillmentVendorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFulfillmentVendorId(BigDecimal value) {
        this.fulfillmentVendorId = value;
    }

    /**
     * Gets the value of the groupId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGroupId() {
        return groupId;
    }

    /**
     * Sets the value of the groupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGroupId(BigDecimal value) {
        this.groupId = value;
    }

    /**
     * Gets the value of the personalization property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalization() {
        return personalization;
    }

    /**
     * Sets the value of the personalization property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalization(String value) {
        this.personalization = value;
    }

    /**
     * Gets the value of the qcCenterId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQcCenterId() {
        return qcCenterId;
    }

    /**
     * Sets the value of the qcCenterId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQcCenterId(BigDecimal value) {
        this.qcCenterId = value;
    }

    /**
     * Gets the value of the qcStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQcStatusCode() {
        return qcStatusCode;
    }

    /**
     * Sets the value of the qcStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQcStatusCode(BigDecimal value) {
        this.qcStatusCode = value;
    }

    /**
     * Gets the value of the userProfileId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUserProfileId() {
        return userProfileId;
    }

    /**
     * Sets the value of the userProfileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUserProfileId(BigDecimal value) {
        this.userProfileId = value;
    }

    /**
     * Gets the value of the customerId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCustomerId() {
        return customerId;
    }

    /**
     * Sets the value of the customerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCustomerId(BigDecimal value) {
        this.customerId = value;
    }

    /**
     * Gets the value of the programId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getProgramId() {
        return programId;
    }

    /**
     * Sets the value of the programId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setProgramId(BigDecimal value) {
        this.programId = value;
    }

    /**
     * Gets the value of the emailAddressText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddressText() {
        return emailAddressText;
    }

    /**
     * Sets the value of the emailAddressText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddressText(String value) {
        this.emailAddressText = value;
    }

    /**
     * Gets the value of the travelComponentQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTravelComponentQuantity() {
        return travelComponentQuantity;
    }

    /**
     * Sets the value of the travelComponentQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTravelComponentQuantity(BigDecimal value) {
        this.travelComponentQuantity = value;
    }

    /**
     * Gets the value of the loggedinAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLoggedinAccountId() {
        return loggedinAccountId;
    }

    /**
     * Sets the value of the loggedinAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLoggedinAccountId(BigDecimal value) {
        this.loggedinAccountId = value;
    }

    /**
     * Gets the value of the mrsRedemptionSourceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMrsRedemptionSourceCode() {
        return mrsRedemptionSourceCode;
    }

    /**
     * Sets the value of the mrsRedemptionSourceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMrsRedemptionSourceCode(String value) {
        this.mrsRedemptionSourceCode = value;
    }

    /**
     * Gets the value of the billAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBillAccountId() {
        return billAccountId;
    }

    /**
     * Sets the value of the billAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBillAccountId(BigDecimal value) {
        this.billAccountId = value;
    }

    /**
     * Gets the value of the cashBackAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCashBackAmount() {
        return cashBackAmount;
    }

    /**
     * Sets the value of the cashBackAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCashBackAmount(BigDecimal value) {
        this.cashBackAmount = value;
    }

    /**
     * Gets the value of the cashBackRedemptionAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCashBackRedemptionAccountNumber() {
        return cashBackRedemptionAccountNumber;
    }

    /**
     * Sets the value of the cashBackRedemptionAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCashBackRedemptionAccountNumber(String value) {
        this.cashBackRedemptionAccountNumber = value;
    }

    /**
     * Gets the value of the vendorOfferId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVendorOfferId() {
        return vendorOfferId;
    }

    /**
     * Sets the value of the vendorOfferId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVendorOfferId(BigDecimal value) {
        this.vendorOfferId = value;
    }

    /**
     * Gets the value of the cashbackSentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCashbackSentDate() {
        return cashbackSentDate;
    }

    /**
     * Sets the value of the cashbackSentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCashbackSentDate(XMLGregorianCalendar value) {
        this.cashbackSentDate = value;
    }

    /**
     * Gets the value of the dealId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDealId() {
        return dealId;
    }

    /**
     * Sets the value of the dealId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDealId(BigDecimal value) {
        this.dealId = value;
    }

    /**
     * Gets the value of the redeemedMarkupAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRedeemedMarkupAmount() {
        return redeemedMarkupAmount;
    }

    /**
     * Sets the value of the redeemedMarkupAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRedeemedMarkupAmount(BigDecimal value) {
        this.redeemedMarkupAmount = value;
    }

    /**
     * Gets the value of the matchedMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchedMode() {
        return matchedMode;
    }

    /**
     * Sets the value of the matchedMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchedMode(String value) {
        this.matchedMode = value;
    }

    /**
     * Gets the value of the matchDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchDescription() {
        return matchDescription;
    }

    /**
     * Sets the value of the matchDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchDescription(String value) {
        this.matchDescription = value;
    }

    /**
     * Gets the value of the billingStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingStatus() {
        return billingStatus;
    }

    /**
     * Sets the value of the billingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingStatus(String value) {
        this.billingStatus = value;
    }

    /**
     * Gets the value of the grossCash property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGrossCash() {
        return grossCash;
    }

    /**
     * Sets the value of the grossCash property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGrossCash(BigDecimal value) {
        this.grossCash = value;
    }

    /**
     * Gets the value of the grossCredit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGrossCredit() {
        return grossCredit;
    }

    /**
     * Sets the value of the grossCredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGrossCredit(BigDecimal value) {
        this.grossCredit = value;
    }

    /**
     * Gets the value of the qcUserId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQcUserId() {
        return qcUserId;
    }

    /**
     * Sets the value of the qcUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQcUserId(String value) {
        this.qcUserId = value;
    }

    /**
     * Gets the value of the nearRealTimeVendorNotification property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNearRealTimeVendorNotification() {
        return nearRealTimeVendorNotification;
    }

    /**
     * Sets the value of the nearRealTimeVendorNotification property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNearRealTimeVendorNotification(Boolean value) {
        this.nearRealTimeVendorNotification = value;
    }

}
