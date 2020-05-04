
package com.mastercard.mcrewards.ws.activity;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AccumulationDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccumulationDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="transSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="postingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="transactionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="transactionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transactionAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="pointsEarned" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="pointType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="processDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="productCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mccClassificationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="merchantCategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transactionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reverseTransactionAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="merchantCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="merchantId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="merchantShortDbaName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="merchantDbaName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reverseIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="issuerIcaCode" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="basePointsAccrued" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="promotionId" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="promotionPointsAccrued" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="aggregateMerchantId" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="merchantAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="merchantCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="merchantPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cardholderPresentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bankPromotionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pointOfSaleCategoryLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="acquirerIcaCode" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="itemDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sellingChannel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="storeNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="storeDivision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="productLine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="itemCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="itemSku" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="offerTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="clientTransactionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="debitSw" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="transactionSourceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bankProductCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bankCustomerNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="postingDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="issuingCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cardholderTransactionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="issuingRegion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="merchantMccGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dataWarehouseMerchantRegion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dataWarehouseMerchantState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="acquirerCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="locationId" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="transactionTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="de0004AmountTransaction" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="de0005AmountReconciliation" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="de0006AmountCardholderBilling" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="de0049CurrencyCodeTransaction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="de0050CurrencyCodeReconciliation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="de0051CurrencyCodeCardholderBilling" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transactionCurrencyTransactionAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="accrualRuleId" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="baseCapTypeId" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="promotionCapTypeId" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="pointUpdateSw" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="acquirerReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="promotionSentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="accountStatusId" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="accruePointsSw" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="cardInputCapabilityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cardInputModeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cardOutputModeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cardSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="authorizationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pointOfSaleBanknetReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pointOfSaleBanknetDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="addendumAmtAccountType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="addendumAmtAmountType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="addendumAmtCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="addendumAmtSign" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="addendumAmtAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="installmentCount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="installmentNumber" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="promotionUserMessageTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccumulationDetail", propOrder = {
    "transSequenceNumber",
    "postingDate",
    "transactionDate",
    "transactionDescription",
    "transactionAmount",
    "pointsEarned",
    "pointType",
    "processDate",
    "productCode",
    "mccClassificationCode",
    "merchantCategoryCode",
    "transactionType",
    "reverseTransactionAmount",
    "merchantCity",
    "merchantId",
    "merchantShortDbaName",
    "merchantDbaName",
    "reverseIndicator",
    "issuerIcaCode",
    "basePointsAccrued",
    "promotionId",
    "promotionPointsAccrued",
    "aggregateMerchantId",
    "merchantAddress",
    "merchantCountryCode",
    "merchantPostalCode",
    "cardholderPresentCode",
    "bankPromotionText",
    "pointOfSaleCategoryLevel",
    "acquirerIcaCode",
    "itemDescription",
    "sellingChannel",
    "storeNumber",
    "storeDivision",
    "productLine",
    "itemCode",
    "itemSku",
    "offerTypeCode",
    "clientTransactionCode",
    "debitSw",
    "transactionSourceCode",
    "bankProductCode",
    "bankCustomerNumber",
    "postingDateTime",
    "issuingCountryCode",
    "cardholderTransactionType",
    "issuingRegion",
    "merchantMccGroup",
    "dataWarehouseMerchantRegion",
    "dataWarehouseMerchantState",
    "acquirerCountry",
    "locationId",
    "transactionTime",
    "de0004AmountTransaction",
    "de0005AmountReconciliation",
    "de0006AmountCardholderBilling",
    "de0049CurrencyCodeTransaction",
    "de0050CurrencyCodeReconciliation",
    "de0051CurrencyCodeCardholderBilling",
    "transactionCurrencyTransactionAmount",
    "accrualRuleId",
    "baseCapTypeId",
    "promotionCapTypeId",
    "pointUpdateSw",
    "acquirerReferenceNumber",
    "promotionSentDate",
    "accountStatusId",
    "accruePointsSw",
    "cardInputCapabilityCode",
    "cardInputModeCode",
    "cardOutputModeCode",
    "cardSequenceNumber",
    "authorizationCode",
    "pointOfSaleBanknetReference",
    "pointOfSaleBanknetDate",
    "addendumAmtAccountType",
    "addendumAmtAmountType",
    "addendumAmtCurrencyCode",
    "addendumAmtSign",
    "addendumAmtAmount",
    "installmentCount",
    "installmentNumber",
    "promotionUserMessageTxt"
})
public class AccumulationDetail {

    protected String transSequenceNumber;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar postingDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar transactionDate;
    protected String transactionDescription;
    protected BigDecimal transactionAmount;
    protected BigDecimal pointsEarned;
    protected String pointType;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar processDate;
    protected String productCode;
    protected String mccClassificationCode;
    protected String merchantCategoryCode;
    protected String transactionType;
    protected BigDecimal reverseTransactionAmount;
    protected String merchantCity;
    protected String merchantId;
    protected String merchantShortDbaName;
    protected String merchantDbaName;
    protected String reverseIndicator;
    protected BigDecimal issuerIcaCode;
    protected BigDecimal basePointsAccrued;
    protected BigDecimal promotionId;
    protected BigDecimal promotionPointsAccrued;
    protected BigDecimal aggregateMerchantId;
    protected String merchantAddress;
    protected String merchantCountryCode;
    protected String merchantPostalCode;
    protected String cardholderPresentCode;
    protected String bankPromotionText;
    protected String pointOfSaleCategoryLevel;
    protected BigDecimal acquirerIcaCode;
    protected String itemDescription;
    protected String sellingChannel;
    protected String storeNumber;
    protected String storeDivision;
    protected String productLine;
    protected String itemCode;
    protected String itemSku;
    protected String offerTypeCode;
    protected String clientTransactionCode;
    protected Boolean debitSw;
    protected String transactionSourceCode;
    protected String bankProductCode;
    protected String bankCustomerNumber;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar postingDateTime;
    protected String issuingCountryCode;
    protected String cardholderTransactionType;
    protected String issuingRegion;
    protected String merchantMccGroup;
    protected String dataWarehouseMerchantRegion;
    protected String dataWarehouseMerchantState;
    protected String acquirerCountry;
    protected BigDecimal locationId;
    protected String transactionTime;
    protected BigDecimal de0004AmountTransaction;
    protected BigDecimal de0005AmountReconciliation;
    protected BigDecimal de0006AmountCardholderBilling;
    protected String de0049CurrencyCodeTransaction;
    protected String de0050CurrencyCodeReconciliation;
    protected String de0051CurrencyCodeCardholderBilling;
    protected BigDecimal transactionCurrencyTransactionAmount;
    protected BigDecimal accrualRuleId;
    protected BigDecimal baseCapTypeId;
    protected BigDecimal promotionCapTypeId;
    protected Boolean pointUpdateSw;
    protected BigDecimal acquirerReferenceNumber;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar promotionSentDate;
    protected BigDecimal accountStatusId;
    protected Boolean accruePointsSw;
    protected String cardInputCapabilityCode;
    protected String cardInputModeCode;
    protected String cardOutputModeCode;
    protected BigDecimal cardSequenceNumber;
    protected String authorizationCode;
    protected String pointOfSaleBanknetReference;
    protected String pointOfSaleBanknetDate;
    protected String addendumAmtAccountType;
    protected String addendumAmtAmountType;
    protected String addendumAmtCurrencyCode;
    protected String addendumAmtSign;
    protected BigDecimal addendumAmtAmount;
    protected BigDecimal installmentCount;
    protected BigDecimal installmentNumber;
    protected String promotionUserMessageTxt;

    /**
     * Gets the value of the transSequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransSequenceNumber() {
        return transSequenceNumber;
    }

    /**
     * Sets the value of the transSequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransSequenceNumber(String value) {
        this.transSequenceNumber = value;
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
     * Gets the value of the transactionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTransactionDate() {
        return transactionDate;
    }

    /**
     * Sets the value of the transactionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTransactionDate(XMLGregorianCalendar value) {
        this.transactionDate = value;
    }

    /**
     * Gets the value of the transactionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionDescription() {
        return transactionDescription;
    }

    /**
     * Sets the value of the transactionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionDescription(String value) {
        this.transactionDescription = value;
    }

    /**
     * Gets the value of the transactionAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTransactionAmount() {
        return transactionAmount;
    }

    /**
     * Sets the value of the transactionAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTransactionAmount(BigDecimal value) {
        this.transactionAmount = value;
    }

    /**
     * Gets the value of the pointsEarned property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPointsEarned() {
        return pointsEarned;
    }

    /**
     * Sets the value of the pointsEarned property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPointsEarned(BigDecimal value) {
        this.pointsEarned = value;
    }

    /**
     * Gets the value of the pointType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPointType() {
        return pointType;
    }

    /**
     * Sets the value of the pointType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPointType(String value) {
        this.pointType = value;
    }

    /**
     * Gets the value of the processDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProcessDate() {
        return processDate;
    }

    /**
     * Sets the value of the processDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProcessDate(XMLGregorianCalendar value) {
        this.processDate = value;
    }

    /**
     * Gets the value of the productCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * Sets the value of the productCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductCode(String value) {
        this.productCode = value;
    }

    /**
     * Gets the value of the mccClassificationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMccClassificationCode() {
        return mccClassificationCode;
    }

    /**
     * Sets the value of the mccClassificationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMccClassificationCode(String value) {
        this.mccClassificationCode = value;
    }

    /**
     * Gets the value of the merchantCategoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantCategoryCode() {
        return merchantCategoryCode;
    }

    /**
     * Sets the value of the merchantCategoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantCategoryCode(String value) {
        this.merchantCategoryCode = value;
    }

    /**
     * Gets the value of the transactionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionType() {
        return transactionType;
    }

    /**
     * Sets the value of the transactionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionType(String value) {
        this.transactionType = value;
    }

    /**
     * Gets the value of the reverseTransactionAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReverseTransactionAmount() {
        return reverseTransactionAmount;
    }

    /**
     * Sets the value of the reverseTransactionAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReverseTransactionAmount(BigDecimal value) {
        this.reverseTransactionAmount = value;
    }

    /**
     * Gets the value of the merchantCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantCity() {
        return merchantCity;
    }

    /**
     * Sets the value of the merchantCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantCity(String value) {
        this.merchantCity = value;
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
     * Gets the value of the merchantShortDbaName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantShortDbaName() {
        return merchantShortDbaName;
    }

    /**
     * Sets the value of the merchantShortDbaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantShortDbaName(String value) {
        this.merchantShortDbaName = value;
    }

    /**
     * Gets the value of the merchantDbaName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantDbaName() {
        return merchantDbaName;
    }

    /**
     * Sets the value of the merchantDbaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantDbaName(String value) {
        this.merchantDbaName = value;
    }

    /**
     * Gets the value of the reverseIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReverseIndicator() {
        return reverseIndicator;
    }

    /**
     * Sets the value of the reverseIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReverseIndicator(String value) {
        this.reverseIndicator = value;
    }

    /**
     * Gets the value of the issuerIcaCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIssuerIcaCode() {
        return issuerIcaCode;
    }

    /**
     * Sets the value of the issuerIcaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIssuerIcaCode(BigDecimal value) {
        this.issuerIcaCode = value;
    }

    /**
     * Gets the value of the basePointsAccrued property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBasePointsAccrued() {
        return basePointsAccrued;
    }

    /**
     * Sets the value of the basePointsAccrued property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBasePointsAccrued(BigDecimal value) {
        this.basePointsAccrued = value;
    }

    /**
     * Gets the value of the promotionId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPromotionId() {
        return promotionId;
    }

    /**
     * Sets the value of the promotionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPromotionId(BigDecimal value) {
        this.promotionId = value;
    }

    /**
     * Gets the value of the promotionPointsAccrued property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPromotionPointsAccrued() {
        return promotionPointsAccrued;
    }

    /**
     * Sets the value of the promotionPointsAccrued property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPromotionPointsAccrued(BigDecimal value) {
        this.promotionPointsAccrued = value;
    }

    /**
     * Gets the value of the aggregateMerchantId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAggregateMerchantId() {
        return aggregateMerchantId;
    }

    /**
     * Sets the value of the aggregateMerchantId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAggregateMerchantId(BigDecimal value) {
        this.aggregateMerchantId = value;
    }

    /**
     * Gets the value of the merchantAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantAddress() {
        return merchantAddress;
    }

    /**
     * Sets the value of the merchantAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantAddress(String value) {
        this.merchantAddress = value;
    }

    /**
     * Gets the value of the merchantCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantCountryCode() {
        return merchantCountryCode;
    }

    /**
     * Sets the value of the merchantCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantCountryCode(String value) {
        this.merchantCountryCode = value;
    }

    /**
     * Gets the value of the merchantPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantPostalCode() {
        return merchantPostalCode;
    }

    /**
     * Sets the value of the merchantPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantPostalCode(String value) {
        this.merchantPostalCode = value;
    }

    /**
     * Gets the value of the cardholderPresentCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardholderPresentCode() {
        return cardholderPresentCode;
    }

    /**
     * Sets the value of the cardholderPresentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardholderPresentCode(String value) {
        this.cardholderPresentCode = value;
    }

    /**
     * Gets the value of the bankPromotionText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankPromotionText() {
        return bankPromotionText;
    }

    /**
     * Sets the value of the bankPromotionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankPromotionText(String value) {
        this.bankPromotionText = value;
    }

    /**
     * Gets the value of the pointOfSaleCategoryLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPointOfSaleCategoryLevel() {
        return pointOfSaleCategoryLevel;
    }

    /**
     * Sets the value of the pointOfSaleCategoryLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPointOfSaleCategoryLevel(String value) {
        this.pointOfSaleCategoryLevel = value;
    }

    /**
     * Gets the value of the acquirerIcaCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAcquirerIcaCode() {
        return acquirerIcaCode;
    }

    /**
     * Sets the value of the acquirerIcaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAcquirerIcaCode(BigDecimal value) {
        this.acquirerIcaCode = value;
    }

    /**
     * Gets the value of the itemDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemDescription() {
        return itemDescription;
    }

    /**
     * Sets the value of the itemDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemDescription(String value) {
        this.itemDescription = value;
    }

    /**
     * Gets the value of the sellingChannel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellingChannel() {
        return sellingChannel;
    }

    /**
     * Sets the value of the sellingChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellingChannel(String value) {
        this.sellingChannel = value;
    }

    /**
     * Gets the value of the storeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreNumber() {
        return storeNumber;
    }

    /**
     * Sets the value of the storeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreNumber(String value) {
        this.storeNumber = value;
    }

    /**
     * Gets the value of the storeDivision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreDivision() {
        return storeDivision;
    }

    /**
     * Sets the value of the storeDivision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreDivision(String value) {
        this.storeDivision = value;
    }

    /**
     * Gets the value of the productLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductLine() {
        return productLine;
    }

    /**
     * Sets the value of the productLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductLine(String value) {
        this.productLine = value;
    }

    /**
     * Gets the value of the itemCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemCode() {
        return itemCode;
    }

    /**
     * Sets the value of the itemCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemCode(String value) {
        this.itemCode = value;
    }

    /**
     * Gets the value of the itemSku property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemSku() {
        return itemSku;
    }

    /**
     * Sets the value of the itemSku property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemSku(String value) {
        this.itemSku = value;
    }

    /**
     * Gets the value of the offerTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferTypeCode() {
        return offerTypeCode;
    }

    /**
     * Sets the value of the offerTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferTypeCode(String value) {
        this.offerTypeCode = value;
    }

    /**
     * Gets the value of the clientTransactionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientTransactionCode() {
        return clientTransactionCode;
    }

    /**
     * Sets the value of the clientTransactionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientTransactionCode(String value) {
        this.clientTransactionCode = value;
    }

    /**
     * Gets the value of the debitSw property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDebitSw() {
        return debitSw;
    }

    /**
     * Sets the value of the debitSw property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDebitSw(Boolean value) {
        this.debitSw = value;
    }

    /**
     * Gets the value of the transactionSourceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionSourceCode() {
        return transactionSourceCode;
    }

    /**
     * Sets the value of the transactionSourceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionSourceCode(String value) {
        this.transactionSourceCode = value;
    }

    /**
     * Gets the value of the bankProductCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankProductCode() {
        return bankProductCode;
    }

    /**
     * Sets the value of the bankProductCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankProductCode(String value) {
        this.bankProductCode = value;
    }

    /**
     * Gets the value of the bankCustomerNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankCustomerNumber() {
        return bankCustomerNumber;
    }

    /**
     * Sets the value of the bankCustomerNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankCustomerNumber(String value) {
        this.bankCustomerNumber = value;
    }

    /**
     * Gets the value of the postingDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPostingDateTime() {
        return postingDateTime;
    }

    /**
     * Sets the value of the postingDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPostingDateTime(XMLGregorianCalendar value) {
        this.postingDateTime = value;
    }

    /**
     * Gets the value of the issuingCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuingCountryCode() {
        return issuingCountryCode;
    }

    /**
     * Sets the value of the issuingCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuingCountryCode(String value) {
        this.issuingCountryCode = value;
    }

    /**
     * Gets the value of the cardholderTransactionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardholderTransactionType() {
        return cardholderTransactionType;
    }

    /**
     * Sets the value of the cardholderTransactionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardholderTransactionType(String value) {
        this.cardholderTransactionType = value;
    }

    /**
     * Gets the value of the issuingRegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuingRegion() {
        return issuingRegion;
    }

    /**
     * Sets the value of the issuingRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuingRegion(String value) {
        this.issuingRegion = value;
    }

    /**
     * Gets the value of the merchantMccGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantMccGroup() {
        return merchantMccGroup;
    }

    /**
     * Sets the value of the merchantMccGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantMccGroup(String value) {
        this.merchantMccGroup = value;
    }

    /**
     * Gets the value of the dataWarehouseMerchantRegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataWarehouseMerchantRegion() {
        return dataWarehouseMerchantRegion;
    }

    /**
     * Sets the value of the dataWarehouseMerchantRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataWarehouseMerchantRegion(String value) {
        this.dataWarehouseMerchantRegion = value;
    }

    /**
     * Gets the value of the dataWarehouseMerchantState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataWarehouseMerchantState() {
        return dataWarehouseMerchantState;
    }

    /**
     * Sets the value of the dataWarehouseMerchantState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataWarehouseMerchantState(String value) {
        this.dataWarehouseMerchantState = value;
    }

    /**
     * Gets the value of the acquirerCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcquirerCountry() {
        return acquirerCountry;
    }

    /**
     * Sets the value of the acquirerCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcquirerCountry(String value) {
        this.acquirerCountry = value;
    }

    /**
     * Gets the value of the locationId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLocationId() {
        return locationId;
    }

    /**
     * Sets the value of the locationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLocationId(BigDecimal value) {
        this.locationId = value;
    }

    /**
     * Gets the value of the transactionTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionTime() {
        return transactionTime;
    }

    /**
     * Sets the value of the transactionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionTime(String value) {
        this.transactionTime = value;
    }

    /**
     * Gets the value of the de0004AmountTransaction property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDe0004AmountTransaction() {
        return de0004AmountTransaction;
    }

    /**
     * Sets the value of the de0004AmountTransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDe0004AmountTransaction(BigDecimal value) {
        this.de0004AmountTransaction = value;
    }

    /**
     * Gets the value of the de0005AmountReconciliation property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDe0005AmountReconciliation() {
        return de0005AmountReconciliation;
    }

    /**
     * Sets the value of the de0005AmountReconciliation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDe0005AmountReconciliation(BigDecimal value) {
        this.de0005AmountReconciliation = value;
    }

    /**
     * Gets the value of the de0006AmountCardholderBilling property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDe0006AmountCardholderBilling() {
        return de0006AmountCardholderBilling;
    }

    /**
     * Sets the value of the de0006AmountCardholderBilling property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDe0006AmountCardholderBilling(BigDecimal value) {
        this.de0006AmountCardholderBilling = value;
    }

    /**
     * Gets the value of the de0049CurrencyCodeTransaction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDe0049CurrencyCodeTransaction() {
        return de0049CurrencyCodeTransaction;
    }

    /**
     * Sets the value of the de0049CurrencyCodeTransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDe0049CurrencyCodeTransaction(String value) {
        this.de0049CurrencyCodeTransaction = value;
    }

    /**
     * Gets the value of the de0050CurrencyCodeReconciliation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDe0050CurrencyCodeReconciliation() {
        return de0050CurrencyCodeReconciliation;
    }

    /**
     * Sets the value of the de0050CurrencyCodeReconciliation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDe0050CurrencyCodeReconciliation(String value) {
        this.de0050CurrencyCodeReconciliation = value;
    }

    /**
     * Gets the value of the de0051CurrencyCodeCardholderBilling property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDe0051CurrencyCodeCardholderBilling() {
        return de0051CurrencyCodeCardholderBilling;
    }

    /**
     * Sets the value of the de0051CurrencyCodeCardholderBilling property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDe0051CurrencyCodeCardholderBilling(String value) {
        this.de0051CurrencyCodeCardholderBilling = value;
    }

    /**
     * Gets the value of the transactionCurrencyTransactionAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTransactionCurrencyTransactionAmount() {
        return transactionCurrencyTransactionAmount;
    }

    /**
     * Sets the value of the transactionCurrencyTransactionAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTransactionCurrencyTransactionAmount(BigDecimal value) {
        this.transactionCurrencyTransactionAmount = value;
    }

    /**
     * Gets the value of the accrualRuleId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAccrualRuleId() {
        return accrualRuleId;
    }

    /**
     * Sets the value of the accrualRuleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAccrualRuleId(BigDecimal value) {
        this.accrualRuleId = value;
    }

    /**
     * Gets the value of the baseCapTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBaseCapTypeId() {
        return baseCapTypeId;
    }

    /**
     * Sets the value of the baseCapTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBaseCapTypeId(BigDecimal value) {
        this.baseCapTypeId = value;
    }

    /**
     * Gets the value of the promotionCapTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPromotionCapTypeId() {
        return promotionCapTypeId;
    }

    /**
     * Sets the value of the promotionCapTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPromotionCapTypeId(BigDecimal value) {
        this.promotionCapTypeId = value;
    }

    /**
     * Gets the value of the pointUpdateSw property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPointUpdateSw() {
        return pointUpdateSw;
    }

    /**
     * Sets the value of the pointUpdateSw property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPointUpdateSw(Boolean value) {
        this.pointUpdateSw = value;
    }

    /**
     * Gets the value of the acquirerReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAcquirerReferenceNumber() {
        return acquirerReferenceNumber;
    }

    /**
     * Sets the value of the acquirerReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAcquirerReferenceNumber(BigDecimal value) {
        this.acquirerReferenceNumber = value;
    }

    /**
     * Gets the value of the promotionSentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPromotionSentDate() {
        return promotionSentDate;
    }

    /**
     * Sets the value of the promotionSentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPromotionSentDate(XMLGregorianCalendar value) {
        this.promotionSentDate = value;
    }

    /**
     * Gets the value of the accountStatusId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAccountStatusId() {
        return accountStatusId;
    }

    /**
     * Sets the value of the accountStatusId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAccountStatusId(BigDecimal value) {
        this.accountStatusId = value;
    }

    /**
     * Gets the value of the accruePointsSw property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAccruePointsSw() {
        return accruePointsSw;
    }

    /**
     * Sets the value of the accruePointsSw property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAccruePointsSw(Boolean value) {
        this.accruePointsSw = value;
    }

    /**
     * Gets the value of the cardInputCapabilityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardInputCapabilityCode() {
        return cardInputCapabilityCode;
    }

    /**
     * Sets the value of the cardInputCapabilityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardInputCapabilityCode(String value) {
        this.cardInputCapabilityCode = value;
    }

    /**
     * Gets the value of the cardInputModeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardInputModeCode() {
        return cardInputModeCode;
    }

    /**
     * Sets the value of the cardInputModeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardInputModeCode(String value) {
        this.cardInputModeCode = value;
    }

    /**
     * Gets the value of the cardOutputModeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardOutputModeCode() {
        return cardOutputModeCode;
    }

    /**
     * Sets the value of the cardOutputModeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardOutputModeCode(String value) {
        this.cardOutputModeCode = value;
    }

    /**
     * Gets the value of the cardSequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCardSequenceNumber() {
        return cardSequenceNumber;
    }

    /**
     * Sets the value of the cardSequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCardSequenceNumber(BigDecimal value) {
        this.cardSequenceNumber = value;
    }

    /**
     * Gets the value of the authorizationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizationCode() {
        return authorizationCode;
    }

    /**
     * Sets the value of the authorizationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationCode(String value) {
        this.authorizationCode = value;
    }

    /**
     * Gets the value of the pointOfSaleBanknetReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPointOfSaleBanknetReference() {
        return pointOfSaleBanknetReference;
    }

    /**
     * Sets the value of the pointOfSaleBanknetReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPointOfSaleBanknetReference(String value) {
        this.pointOfSaleBanknetReference = value;
    }

    /**
     * Gets the value of the pointOfSaleBanknetDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPointOfSaleBanknetDate() {
        return pointOfSaleBanknetDate;
    }

    /**
     * Sets the value of the pointOfSaleBanknetDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPointOfSaleBanknetDate(String value) {
        this.pointOfSaleBanknetDate = value;
    }

    /**
     * Gets the value of the addendumAmtAccountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddendumAmtAccountType() {
        return addendumAmtAccountType;
    }

    /**
     * Sets the value of the addendumAmtAccountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddendumAmtAccountType(String value) {
        this.addendumAmtAccountType = value;
    }

    /**
     * Gets the value of the addendumAmtAmountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddendumAmtAmountType() {
        return addendumAmtAmountType;
    }

    /**
     * Sets the value of the addendumAmtAmountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddendumAmtAmountType(String value) {
        this.addendumAmtAmountType = value;
    }

    /**
     * Gets the value of the addendumAmtCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddendumAmtCurrencyCode() {
        return addendumAmtCurrencyCode;
    }

    /**
     * Sets the value of the addendumAmtCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddendumAmtCurrencyCode(String value) {
        this.addendumAmtCurrencyCode = value;
    }

    /**
     * Gets the value of the addendumAmtSign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddendumAmtSign() {
        return addendumAmtSign;
    }

    /**
     * Sets the value of the addendumAmtSign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddendumAmtSign(String value) {
        this.addendumAmtSign = value;
    }

    /**
     * Gets the value of the addendumAmtAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAddendumAmtAmount() {
        return addendumAmtAmount;
    }

    /**
     * Sets the value of the addendumAmtAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAddendumAmtAmount(BigDecimal value) {
        this.addendumAmtAmount = value;
    }

    /**
     * Gets the value of the installmentCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInstallmentCount() {
        return installmentCount;
    }

    /**
     * Sets the value of the installmentCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInstallmentCount(BigDecimal value) {
        this.installmentCount = value;
    }

    /**
     * Gets the value of the installmentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInstallmentNumber() {
        return installmentNumber;
    }

    /**
     * Sets the value of the installmentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInstallmentNumber(BigDecimal value) {
        this.installmentNumber = value;
    }

    /**
     * Gets the value of the promotionUserMessageTxt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotionUserMessageTxt() {
        return promotionUserMessageTxt;
    }

    /**
     * Sets the value of the promotionUserMessageTxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotionUserMessageTxt(String value) {
        this.promotionUserMessageTxt = value;
    }

}
