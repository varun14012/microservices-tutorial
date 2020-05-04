
package com.mastercard.mcrewards.ws.activity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="messageTypeIdentifier"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="250"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="bankAccountNumber"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="19"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="processingCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="6"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="cardholderBillingAmount"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="transactionAmount" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="issuerSettlementAmount" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="transmissionDateAndTime" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="amountCardholderBillingFee" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="conversionRateSettled" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="conversionRateCardholderBilling" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="systemTraceAuditNumber" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="6"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="transactionDateAndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="merchantTypeCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="pointOfSaleEntryMode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="acquiringInstitutionIdCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="30"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="forwardingInstitutionIdCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="6"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="authorizationIdResponse" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="6"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="responseCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="cardAcceptorIdCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="cardAcceptorNameAndLocation"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="transactionCategoryCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="250"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="transactionCurrencyCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="reconciliationCurrencyCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="cardholderBillingCurrencyCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="additionalAmount" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="120"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="reserved" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="60"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="pointOfSaleData" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="26"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="cardholderAccountTerminalLevel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="pointOfSaleCardTerminalInputCapability" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="pointOfSaleCountryCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="pointOfSalePostalCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="pointOfSaleCardholderPresence" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="pointOfSaleCardPresence" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="pointOfSaleCaptureCapabilities" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="originalDataElement" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="42"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="replacementAmount" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="42"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="accountId1" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="28"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="accountId2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="28"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="panMappingFileInformation" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="43"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="walletIdentifier" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="accountNumberIndicator" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="accountNumber" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="19"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="expirationDate" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="productCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="tokenAssuranceLevel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="tokenRequestorId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="primaryAccountNumber" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="19"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="partialApprovalSwitch" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="onBehalfService" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="onBehalfServiceResult1" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="onBehalfServiceResult2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="originalReferenceNUmber" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="250"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="pathText" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="250"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="bankNetReferenceNumber"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="serviceIdentifier"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="250"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
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
    "messageTypeIdentifier",
    "bankAccountNumber",
    "processingCode",
    "cardholderBillingAmount",
    "transactionAmount",
    "issuerSettlementAmount",
    "transmissionDateAndTime",
    "amountCardholderBillingFee",
    "conversionRateSettled",
    "conversionRateCardholderBilling",
    "systemTraceAuditNumber",
    "transactionDateAndTime",
    "merchantTypeCode",
    "pointOfSaleEntryMode",
    "acquiringInstitutionIdCode",
    "forwardingInstitutionIdCode",
    "authorizationIdResponse",
    "responseCode",
    "cardAcceptorIdCode",
    "cardAcceptorNameAndLocation",
    "transactionCategoryCode",
    "transactionCurrencyCode",
    "reconciliationCurrencyCode",
    "cardholderBillingCurrencyCode",
    "additionalAmount",
    "reserved",
    "pointOfSaleData",
    "cardholderAccountTerminalLevel",
    "pointOfSaleCardTerminalInputCapability",
    "pointOfSaleCountryCode",
    "pointOfSalePostalCode",
    "pointOfSaleCardholderPresence",
    "pointOfSaleCardPresence",
    "pointOfSaleCaptureCapabilities",
    "originalDataElement",
    "replacementAmount",
    "accountId1",
    "accountId2",
    "panMappingFileInformation",
    "walletIdentifier",
    "accountNumberIndicator",
    "accountNumber",
    "expirationDate",
    "productCode",
    "tokenAssuranceLevel",
    "tokenRequestorId",
    "primaryAccountNumber",
    "partialApprovalSwitch",
    "onBehalfService",
    "onBehalfServiceResult1",
    "onBehalfServiceResult2",
    "originalReferenceNUmber",
    "pathText",
    "bankNetReferenceNumber",
    "serviceIdentifier"
})
@XmlRootElement(name = "postAuthTransaction")
public class PostAuthTransaction {

    @XmlElement(required = true)
    protected String messageTypeIdentifier;
    @XmlElement(required = true)
    protected String bankAccountNumber;
    protected String processingCode;
    @XmlElement(required = true)
    protected String cardholderBillingAmount;
    protected String transactionAmount;
    protected String issuerSettlementAmount;
    protected String transmissionDateAndTime;
    protected Long amountCardholderBillingFee;
    protected Long conversionRateSettled;
    protected Long conversionRateCardholderBilling;
    protected String systemTraceAuditNumber;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar transactionDateAndTime;
    protected String merchantTypeCode;
    protected Integer pointOfSaleEntryMode;
    protected String acquiringInstitutionIdCode;
    protected String forwardingInstitutionIdCode;
    protected String authorizationIdResponse;
    protected String responseCode;
    protected String cardAcceptorIdCode;
    @XmlElement(required = true)
    protected String cardAcceptorNameAndLocation;
    protected String transactionCategoryCode;
    protected String transactionCurrencyCode;
    protected String reconciliationCurrencyCode;
    protected String cardholderBillingCurrencyCode;
    protected String additionalAmount;
    protected String reserved;
    protected String pointOfSaleData;
    protected Integer cardholderAccountTerminalLevel;
    protected Integer pointOfSaleCardTerminalInputCapability;
    protected Integer pointOfSaleCountryCode;
    protected String pointOfSalePostalCode;
    protected String pointOfSaleCardholderPresence;
    protected Integer pointOfSaleCardPresence;
    protected Integer pointOfSaleCaptureCapabilities;
    protected String originalDataElement;
    protected String replacementAmount;
    protected String accountId1;
    protected String accountId2;
    protected String panMappingFileInformation;
    protected String walletIdentifier;
    protected String accountNumberIndicator;
    protected String accountNumber;
    protected Integer expirationDate;
    protected String productCode;
    protected Integer tokenAssuranceLevel;
    protected Long tokenRequestorId;
    protected String primaryAccountNumber;
    protected Integer partialApprovalSwitch;
    protected String onBehalfService;
    protected String onBehalfServiceResult1;
    protected String onBehalfServiceResult2;
    protected String originalReferenceNUmber;
    protected String pathText;
    @XmlElement(required = true)
    protected String bankNetReferenceNumber;
    @XmlElement(required = true)
    protected String serviceIdentifier;

    /**
     * Gets the value of the messageTypeIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageTypeIdentifier() {
        return messageTypeIdentifier;
    }

    /**
     * Sets the value of the messageTypeIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageTypeIdentifier(String value) {
        this.messageTypeIdentifier = value;
    }

    /**
     * Gets the value of the bankAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    /**
     * Sets the value of the bankAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAccountNumber(String value) {
        this.bankAccountNumber = value;
    }

    /**
     * Gets the value of the processingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessingCode() {
        return processingCode;
    }

    /**
     * Sets the value of the processingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessingCode(String value) {
        this.processingCode = value;
    }

    /**
     * Gets the value of the cardholderBillingAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardholderBillingAmount() {
        return cardholderBillingAmount;
    }

    /**
     * Sets the value of the cardholderBillingAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardholderBillingAmount(String value) {
        this.cardholderBillingAmount = value;
    }

    /**
     * Gets the value of the transactionAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionAmount() {
        return transactionAmount;
    }

    /**
     * Sets the value of the transactionAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionAmount(String value) {
        this.transactionAmount = value;
    }

    /**
     * Gets the value of the issuerSettlementAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuerSettlementAmount() {
        return issuerSettlementAmount;
    }

    /**
     * Sets the value of the issuerSettlementAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuerSettlementAmount(String value) {
        this.issuerSettlementAmount = value;
    }

    /**
     * Gets the value of the transmissionDateAndTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransmissionDateAndTime() {
        return transmissionDateAndTime;
    }

    /**
     * Sets the value of the transmissionDateAndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransmissionDateAndTime(String value) {
        this.transmissionDateAndTime = value;
    }

    /**
     * Gets the value of the amountCardholderBillingFee property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAmountCardholderBillingFee() {
        return amountCardholderBillingFee;
    }

    /**
     * Sets the value of the amountCardholderBillingFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAmountCardholderBillingFee(Long value) {
        this.amountCardholderBillingFee = value;
    }

    /**
     * Gets the value of the conversionRateSettled property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getConversionRateSettled() {
        return conversionRateSettled;
    }

    /**
     * Sets the value of the conversionRateSettled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setConversionRateSettled(Long value) {
        this.conversionRateSettled = value;
    }

    /**
     * Gets the value of the conversionRateCardholderBilling property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getConversionRateCardholderBilling() {
        return conversionRateCardholderBilling;
    }

    /**
     * Sets the value of the conversionRateCardholderBilling property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setConversionRateCardholderBilling(Long value) {
        this.conversionRateCardholderBilling = value;
    }

    /**
     * Gets the value of the systemTraceAuditNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemTraceAuditNumber() {
        return systemTraceAuditNumber;
    }

    /**
     * Sets the value of the systemTraceAuditNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemTraceAuditNumber(String value) {
        this.systemTraceAuditNumber = value;
    }

    /**
     * Gets the value of the transactionDateAndTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTransactionDateAndTime() {
        return transactionDateAndTime;
    }

    /**
     * Sets the value of the transactionDateAndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTransactionDateAndTime(XMLGregorianCalendar value) {
        this.transactionDateAndTime = value;
    }

    /**
     * Gets the value of the merchantTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantTypeCode() {
        return merchantTypeCode;
    }

    /**
     * Sets the value of the merchantTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantTypeCode(String value) {
        this.merchantTypeCode = value;
    }

    /**
     * Gets the value of the pointOfSaleEntryMode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPointOfSaleEntryMode() {
        return pointOfSaleEntryMode;
    }

    /**
     * Sets the value of the pointOfSaleEntryMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPointOfSaleEntryMode(Integer value) {
        this.pointOfSaleEntryMode = value;
    }

    /**
     * Gets the value of the acquiringInstitutionIdCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcquiringInstitutionIdCode() {
        return acquiringInstitutionIdCode;
    }

    /**
     * Sets the value of the acquiringInstitutionIdCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcquiringInstitutionIdCode(String value) {
        this.acquiringInstitutionIdCode = value;
    }

    /**
     * Gets the value of the forwardingInstitutionIdCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForwardingInstitutionIdCode() {
        return forwardingInstitutionIdCode;
    }

    /**
     * Sets the value of the forwardingInstitutionIdCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForwardingInstitutionIdCode(String value) {
        this.forwardingInstitutionIdCode = value;
    }

    /**
     * Gets the value of the authorizationIdResponse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizationIdResponse() {
        return authorizationIdResponse;
    }

    /**
     * Sets the value of the authorizationIdResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationIdResponse(String value) {
        this.authorizationIdResponse = value;
    }

    /**
     * Gets the value of the responseCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseCode() {
        return responseCode;
    }

    /**
     * Sets the value of the responseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseCode(String value) {
        this.responseCode = value;
    }

    /**
     * Gets the value of the cardAcceptorIdCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardAcceptorIdCode() {
        return cardAcceptorIdCode;
    }

    /**
     * Sets the value of the cardAcceptorIdCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardAcceptorIdCode(String value) {
        this.cardAcceptorIdCode = value;
    }

    /**
     * Gets the value of the cardAcceptorNameAndLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardAcceptorNameAndLocation() {
        return cardAcceptorNameAndLocation;
    }

    /**
     * Sets the value of the cardAcceptorNameAndLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardAcceptorNameAndLocation(String value) {
        this.cardAcceptorNameAndLocation = value;
    }

    /**
     * Gets the value of the transactionCategoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionCategoryCode() {
        return transactionCategoryCode;
    }

    /**
     * Sets the value of the transactionCategoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionCategoryCode(String value) {
        this.transactionCategoryCode = value;
    }

    /**
     * Gets the value of the transactionCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionCurrencyCode() {
        return transactionCurrencyCode;
    }

    /**
     * Sets the value of the transactionCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionCurrencyCode(String value) {
        this.transactionCurrencyCode = value;
    }

    /**
     * Gets the value of the reconciliationCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReconciliationCurrencyCode() {
        return reconciliationCurrencyCode;
    }

    /**
     * Sets the value of the reconciliationCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReconciliationCurrencyCode(String value) {
        this.reconciliationCurrencyCode = value;
    }

    /**
     * Gets the value of the cardholderBillingCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardholderBillingCurrencyCode() {
        return cardholderBillingCurrencyCode;
    }

    /**
     * Sets the value of the cardholderBillingCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardholderBillingCurrencyCode(String value) {
        this.cardholderBillingCurrencyCode = value;
    }

    /**
     * Gets the value of the additionalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalAmount() {
        return additionalAmount;
    }

    /**
     * Sets the value of the additionalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalAmount(String value) {
        this.additionalAmount = value;
    }

    /**
     * Gets the value of the reserved property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReserved() {
        return reserved;
    }

    /**
     * Sets the value of the reserved property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReserved(String value) {
        this.reserved = value;
    }

    /**
     * Gets the value of the pointOfSaleData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPointOfSaleData() {
        return pointOfSaleData;
    }

    /**
     * Sets the value of the pointOfSaleData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPointOfSaleData(String value) {
        this.pointOfSaleData = value;
    }

    /**
     * Gets the value of the cardholderAccountTerminalLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCardholderAccountTerminalLevel() {
        return cardholderAccountTerminalLevel;
    }

    /**
     * Sets the value of the cardholderAccountTerminalLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCardholderAccountTerminalLevel(Integer value) {
        this.cardholderAccountTerminalLevel = value;
    }

    /**
     * Gets the value of the pointOfSaleCardTerminalInputCapability property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPointOfSaleCardTerminalInputCapability() {
        return pointOfSaleCardTerminalInputCapability;
    }

    /**
     * Sets the value of the pointOfSaleCardTerminalInputCapability property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPointOfSaleCardTerminalInputCapability(Integer value) {
        this.pointOfSaleCardTerminalInputCapability = value;
    }

    /**
     * Gets the value of the pointOfSaleCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPointOfSaleCountryCode() {
        return pointOfSaleCountryCode;
    }

    /**
     * Sets the value of the pointOfSaleCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPointOfSaleCountryCode(Integer value) {
        this.pointOfSaleCountryCode = value;
    }

    /**
     * Gets the value of the pointOfSalePostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPointOfSalePostalCode() {
        return pointOfSalePostalCode;
    }

    /**
     * Sets the value of the pointOfSalePostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPointOfSalePostalCode(String value) {
        this.pointOfSalePostalCode = value;
    }

    /**
     * Gets the value of the pointOfSaleCardholderPresence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPointOfSaleCardholderPresence() {
        return pointOfSaleCardholderPresence;
    }

    /**
     * Sets the value of the pointOfSaleCardholderPresence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPointOfSaleCardholderPresence(String value) {
        this.pointOfSaleCardholderPresence = value;
    }

    /**
     * Gets the value of the pointOfSaleCardPresence property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPointOfSaleCardPresence() {
        return pointOfSaleCardPresence;
    }

    /**
     * Sets the value of the pointOfSaleCardPresence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPointOfSaleCardPresence(Integer value) {
        this.pointOfSaleCardPresence = value;
    }

    /**
     * Gets the value of the pointOfSaleCaptureCapabilities property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPointOfSaleCaptureCapabilities() {
        return pointOfSaleCaptureCapabilities;
    }

    /**
     * Sets the value of the pointOfSaleCaptureCapabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPointOfSaleCaptureCapabilities(Integer value) {
        this.pointOfSaleCaptureCapabilities = value;
    }

    /**
     * Gets the value of the originalDataElement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalDataElement() {
        return originalDataElement;
    }

    /**
     * Sets the value of the originalDataElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalDataElement(String value) {
        this.originalDataElement = value;
    }

    /**
     * Gets the value of the replacementAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplacementAmount() {
        return replacementAmount;
    }

    /**
     * Sets the value of the replacementAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplacementAmount(String value) {
        this.replacementAmount = value;
    }

    /**
     * Gets the value of the accountId1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountId1() {
        return accountId1;
    }

    /**
     * Sets the value of the accountId1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountId1(String value) {
        this.accountId1 = value;
    }

    /**
     * Gets the value of the accountId2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountId2() {
        return accountId2;
    }

    /**
     * Sets the value of the accountId2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountId2(String value) {
        this.accountId2 = value;
    }

    /**
     * Gets the value of the panMappingFileInformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPanMappingFileInformation() {
        return panMappingFileInformation;
    }

    /**
     * Sets the value of the panMappingFileInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPanMappingFileInformation(String value) {
        this.panMappingFileInformation = value;
    }

    /**
     * Gets the value of the walletIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWalletIdentifier() {
        return walletIdentifier;
    }

    /**
     * Sets the value of the walletIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWalletIdentifier(String value) {
        this.walletIdentifier = value;
    }

    /**
     * Gets the value of the accountNumberIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumberIndicator() {
        return accountNumberIndicator;
    }

    /**
     * Sets the value of the accountNumberIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumberIndicator(String value) {
        this.accountNumberIndicator = value;
    }

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExpirationDate(Integer value) {
        this.expirationDate = value;
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
     * Gets the value of the tokenAssuranceLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTokenAssuranceLevel() {
        return tokenAssuranceLevel;
    }

    /**
     * Sets the value of the tokenAssuranceLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTokenAssuranceLevel(Integer value) {
        this.tokenAssuranceLevel = value;
    }

    /**
     * Gets the value of the tokenRequestorId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTokenRequestorId() {
        return tokenRequestorId;
    }

    /**
     * Sets the value of the tokenRequestorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTokenRequestorId(Long value) {
        this.tokenRequestorId = value;
    }

    /**
     * Gets the value of the primaryAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryAccountNumber() {
        return primaryAccountNumber;
    }

    /**
     * Sets the value of the primaryAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryAccountNumber(String value) {
        this.primaryAccountNumber = value;
    }

    /**
     * Gets the value of the partialApprovalSwitch property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPartialApprovalSwitch() {
        return partialApprovalSwitch;
    }

    /**
     * Sets the value of the partialApprovalSwitch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPartialApprovalSwitch(Integer value) {
        this.partialApprovalSwitch = value;
    }

    /**
     * Gets the value of the onBehalfService property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnBehalfService() {
        return onBehalfService;
    }

    /**
     * Sets the value of the onBehalfService property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnBehalfService(String value) {
        this.onBehalfService = value;
    }

    /**
     * Gets the value of the onBehalfServiceResult1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnBehalfServiceResult1() {
        return onBehalfServiceResult1;
    }

    /**
     * Sets the value of the onBehalfServiceResult1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnBehalfServiceResult1(String value) {
        this.onBehalfServiceResult1 = value;
    }

    /**
     * Gets the value of the onBehalfServiceResult2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnBehalfServiceResult2() {
        return onBehalfServiceResult2;
    }

    /**
     * Sets the value of the onBehalfServiceResult2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnBehalfServiceResult2(String value) {
        this.onBehalfServiceResult2 = value;
    }

    /**
     * Gets the value of the originalReferenceNUmber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalReferenceNUmber() {
        return originalReferenceNUmber;
    }

    /**
     * Sets the value of the originalReferenceNUmber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalReferenceNUmber(String value) {
        this.originalReferenceNUmber = value;
    }

    /**
     * Gets the value of the pathText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPathText() {
        return pathText;
    }

    /**
     * Sets the value of the pathText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPathText(String value) {
        this.pathText = value;
    }

    /**
     * Gets the value of the bankNetReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankNetReferenceNumber() {
        return bankNetReferenceNumber;
    }

    /**
     * Sets the value of the bankNetReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankNetReferenceNumber(String value) {
        this.bankNetReferenceNumber = value;
    }

    /**
     * Gets the value of the serviceIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceIdentifier() {
        return serviceIdentifier;
    }

    /**
     * Sets the value of the serviceIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceIdentifier(String value) {
        this.serviceIdentifier = value;
    }

}
