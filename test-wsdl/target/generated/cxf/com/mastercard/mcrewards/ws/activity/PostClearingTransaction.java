
package com.mastercard.mcrewards.ws.activity;

import java.math.BigDecimal;
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
 *         &lt;element name="aquiringCountry" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="aquiringICACd" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long"&gt;
 *               &lt;maxInclusive value="99999999999"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="aquiringRefNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="additionalAmtAccountType" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="additionalAmtAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="additionalAmtAmountType" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="additionalAmtCurrencyCd" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="additionalAmtSign" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="aggregateMerchantId" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long"&gt;
 *               &lt;maxInclusive value="6"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="authIdResponse" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="6"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="bankAccountNumber"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="19"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="cardAcceptorIdCd" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="22"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="cardInputCapabilityCd" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="cardInputModeCd" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="cardOutputModeCd" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="cardSequenceNumber" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long"&gt;
 *               &lt;maxInclusive value="999"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="clientTransactionCd" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="cardHolderBillingCurrencyCd" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="transactionAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="issuerSettelemetAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="debitSw" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="issuingCountry" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="issuingICACd" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="issuingRegion" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="itemCd" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="itemDesc" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="itemSku" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="locationId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="merchantCategoryCd"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="merchantTypeClassificationCd"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="merchantCity" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="21"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="merchantCountryCd" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="merchantCategoryGroup" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="merchantPostalCd" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="merchantRegion" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="merchantShortDBAName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="22"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="merchantState" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="merchantTransactionDBAName"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="60"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="merchantAddress" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="30"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="offerTypeCd" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="pointOfSaleCardTerminalInputCapability" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="pointSaleCategoryLvl" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="pointOfSaleCountryCd" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="pointOfSaleCardHolderPresent" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="pointOfSalePostalCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="processCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="productCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="productLine" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="bankNetRefNumber" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="bankNetRefNumberDate" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="reverseInd" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="reverseTransactionAmt" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;maxInclusive value="9999999999"/&gt;
 *               &lt;fractionDigits value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="sellingChannel" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="sequenceNumber" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="settlementCurrencyCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="storeDivision" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="storeNumber" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="tokenAssuranceLevelCd" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="tokenRequestId" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="transactionCurrencyCd" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="transactionCurrencyTransAmt" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;maxInclusive value="999999999999"/&gt;
 *               &lt;fractionDigits value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="transactionDateAndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="cardHolderBillingAmount"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;maxInclusive value="999999999999"/&gt;
 *               &lt;fractionDigits value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="transactionSeqNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="transactionSourceCd" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="transactionType"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="walletId" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
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
    "aquiringCountry",
    "aquiringICACd",
    "aquiringRefNumber",
    "additionalAmtAccountType",
    "additionalAmtAmount",
    "additionalAmtAmountType",
    "additionalAmtCurrencyCd",
    "additionalAmtSign",
    "aggregateMerchantId",
    "authIdResponse",
    "bankAccountNumber",
    "cardAcceptorIdCd",
    "cardInputCapabilityCd",
    "cardInputModeCd",
    "cardOutputModeCd",
    "cardSequenceNumber",
    "clientTransactionCd",
    "cardHolderBillingCurrencyCd",
    "transactionAmount",
    "issuerSettelemetAmount",
    "debitSw",
    "issuingCountry",
    "issuingICACd",
    "issuingRegion",
    "itemCd",
    "itemDesc",
    "itemSku",
    "locationId",
    "merchantCategoryCd",
    "merchantTypeClassificationCd",
    "merchantCity",
    "merchantCountryCd",
    "merchantCategoryGroup",
    "merchantPostalCd",
    "merchantRegion",
    "merchantShortDBAName",
    "merchantState",
    "merchantTransactionDBAName",
    "merchantAddress",
    "offerTypeCd",
    "pointOfSaleCardTerminalInputCapability",
    "pointSaleCategoryLvl",
    "pointOfSaleCountryCd",
    "pointOfSaleCardHolderPresent",
    "pointOfSalePostalCode",
    "processCode",
    "productCode",
    "productLine",
    "bankNetRefNumber",
    "bankNetRefNumberDate",
    "reverseInd",
    "reverseTransactionAmt",
    "sellingChannel",
    "sequenceNumber",
    "settlementCurrencyCode",
    "storeDivision",
    "storeNumber",
    "tokenAssuranceLevelCd",
    "tokenRequestId",
    "transactionCurrencyCd",
    "transactionCurrencyTransAmt",
    "transactionDateAndTime",
    "cardHolderBillingAmount",
    "transactionSeqNumber",
    "transactionSourceCd",
    "transactionType",
    "walletId"
})
@XmlRootElement(name = "postClearingTransaction")
public class PostClearingTransaction {

    protected String aquiringCountry;
    protected Long aquiringICACd;
    protected Long aquiringRefNumber;
    protected String additionalAmtAccountType;
    protected BigDecimal additionalAmtAmount;
    protected String additionalAmtAmountType;
    protected String additionalAmtCurrencyCd;
    protected String additionalAmtSign;
    protected Long aggregateMerchantId;
    protected String authIdResponse;
    @XmlElement(required = true)
    protected String bankAccountNumber;
    protected String cardAcceptorIdCd;
    protected String cardInputCapabilityCd;
    protected String cardInputModeCd;
    protected String cardOutputModeCd;
    protected Long cardSequenceNumber;
    protected String clientTransactionCd;
    protected String cardHolderBillingCurrencyCd;
    protected BigDecimal transactionAmount;
    protected BigDecimal issuerSettelemetAmount;
    protected String debitSw;
    protected String issuingCountry;
    protected long issuingICACd;
    protected String issuingRegion;
    protected String itemCd;
    protected String itemDesc;
    protected String itemSku;
    protected Long locationId;
    @XmlElement(required = true)
    protected String merchantCategoryCd;
    @XmlElement(required = true)
    protected String merchantTypeClassificationCd;
    protected String merchantCity;
    protected String merchantCountryCd;
    protected String merchantCategoryGroup;
    protected String merchantPostalCd;
    protected String merchantRegion;
    protected String merchantShortDBAName;
    protected String merchantState;
    @XmlElement(required = true)
    protected String merchantTransactionDBAName;
    protected String merchantAddress;
    protected String offerTypeCd;
    protected String pointOfSaleCardTerminalInputCapability;
    protected String pointSaleCategoryLvl;
    protected String pointOfSaleCountryCd;
    protected String pointOfSaleCardHolderPresent;
    protected String pointOfSalePostalCode;
    protected String processCode;
    protected String productCode;
    protected String productLine;
    protected String bankNetRefNumber;
    protected String bankNetRefNumberDate;
    protected String reverseInd;
    protected BigDecimal reverseTransactionAmt;
    protected String sellingChannel;
    protected long sequenceNumber;
    protected String settlementCurrencyCode;
    protected String storeDivision;
    protected String storeNumber;
    protected String tokenAssuranceLevelCd;
    protected String tokenRequestId;
    protected String transactionCurrencyCd;
    protected BigDecimal transactionCurrencyTransAmt;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar transactionDateAndTime;
    @XmlElement(required = true)
    protected BigDecimal cardHolderBillingAmount;
    protected Long transactionSeqNumber;
    protected String transactionSourceCd;
    @XmlElement(required = true)
    protected String transactionType;
    protected String walletId;

    /**
     * Gets the value of the aquiringCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAquiringCountry() {
        return aquiringCountry;
    }

    /**
     * Sets the value of the aquiringCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAquiringCountry(String value) {
        this.aquiringCountry = value;
    }

    /**
     * Gets the value of the aquiringICACd property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAquiringICACd() {
        return aquiringICACd;
    }

    /**
     * Sets the value of the aquiringICACd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAquiringICACd(Long value) {
        this.aquiringICACd = value;
    }

    /**
     * Gets the value of the aquiringRefNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAquiringRefNumber() {
        return aquiringRefNumber;
    }

    /**
     * Sets the value of the aquiringRefNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAquiringRefNumber(Long value) {
        this.aquiringRefNumber = value;
    }

    /**
     * Gets the value of the additionalAmtAccountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalAmtAccountType() {
        return additionalAmtAccountType;
    }

    /**
     * Sets the value of the additionalAmtAccountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalAmtAccountType(String value) {
        this.additionalAmtAccountType = value;
    }

    /**
     * Gets the value of the additionalAmtAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAdditionalAmtAmount() {
        return additionalAmtAmount;
    }

    /**
     * Sets the value of the additionalAmtAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAdditionalAmtAmount(BigDecimal value) {
        this.additionalAmtAmount = value;
    }

    /**
     * Gets the value of the additionalAmtAmountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalAmtAmountType() {
        return additionalAmtAmountType;
    }

    /**
     * Sets the value of the additionalAmtAmountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalAmtAmountType(String value) {
        this.additionalAmtAmountType = value;
    }

    /**
     * Gets the value of the additionalAmtCurrencyCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalAmtCurrencyCd() {
        return additionalAmtCurrencyCd;
    }

    /**
     * Sets the value of the additionalAmtCurrencyCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalAmtCurrencyCd(String value) {
        this.additionalAmtCurrencyCd = value;
    }

    /**
     * Gets the value of the additionalAmtSign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalAmtSign() {
        return additionalAmtSign;
    }

    /**
     * Sets the value of the additionalAmtSign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalAmtSign(String value) {
        this.additionalAmtSign = value;
    }

    /**
     * Gets the value of the aggregateMerchantId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAggregateMerchantId() {
        return aggregateMerchantId;
    }

    /**
     * Sets the value of the aggregateMerchantId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAggregateMerchantId(Long value) {
        this.aggregateMerchantId = value;
    }

    /**
     * Gets the value of the authIdResponse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthIdResponse() {
        return authIdResponse;
    }

    /**
     * Sets the value of the authIdResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthIdResponse(String value) {
        this.authIdResponse = value;
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
     * Gets the value of the cardAcceptorIdCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardAcceptorIdCd() {
        return cardAcceptorIdCd;
    }

    /**
     * Sets the value of the cardAcceptorIdCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardAcceptorIdCd(String value) {
        this.cardAcceptorIdCd = value;
    }

    /**
     * Gets the value of the cardInputCapabilityCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardInputCapabilityCd() {
        return cardInputCapabilityCd;
    }

    /**
     * Sets the value of the cardInputCapabilityCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardInputCapabilityCd(String value) {
        this.cardInputCapabilityCd = value;
    }

    /**
     * Gets the value of the cardInputModeCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardInputModeCd() {
        return cardInputModeCd;
    }

    /**
     * Sets the value of the cardInputModeCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardInputModeCd(String value) {
        this.cardInputModeCd = value;
    }

    /**
     * Gets the value of the cardOutputModeCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardOutputModeCd() {
        return cardOutputModeCd;
    }

    /**
     * Sets the value of the cardOutputModeCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardOutputModeCd(String value) {
        this.cardOutputModeCd = value;
    }

    /**
     * Gets the value of the cardSequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCardSequenceNumber() {
        return cardSequenceNumber;
    }

    /**
     * Sets the value of the cardSequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCardSequenceNumber(Long value) {
        this.cardSequenceNumber = value;
    }

    /**
     * Gets the value of the clientTransactionCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientTransactionCd() {
        return clientTransactionCd;
    }

    /**
     * Sets the value of the clientTransactionCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientTransactionCd(String value) {
        this.clientTransactionCd = value;
    }

    /**
     * Gets the value of the cardHolderBillingCurrencyCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardHolderBillingCurrencyCd() {
        return cardHolderBillingCurrencyCd;
    }

    /**
     * Sets the value of the cardHolderBillingCurrencyCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardHolderBillingCurrencyCd(String value) {
        this.cardHolderBillingCurrencyCd = value;
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
     * Gets the value of the issuerSettelemetAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIssuerSettelemetAmount() {
        return issuerSettelemetAmount;
    }

    /**
     * Sets the value of the issuerSettelemetAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIssuerSettelemetAmount(BigDecimal value) {
        this.issuerSettelemetAmount = value;
    }

    /**
     * Gets the value of the debitSw property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebitSw() {
        return debitSw;
    }

    /**
     * Sets the value of the debitSw property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebitSw(String value) {
        this.debitSw = value;
    }

    /**
     * Gets the value of the issuingCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuingCountry() {
        return issuingCountry;
    }

    /**
     * Sets the value of the issuingCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuingCountry(String value) {
        this.issuingCountry = value;
    }

    /**
     * Gets the value of the issuingICACd property.
     * 
     */
    public long getIssuingICACd() {
        return issuingICACd;
    }

    /**
     * Sets the value of the issuingICACd property.
     * 
     */
    public void setIssuingICACd(long value) {
        this.issuingICACd = value;
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
     * Gets the value of the itemCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemCd() {
        return itemCd;
    }

    /**
     * Sets the value of the itemCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemCd(String value) {
        this.itemCd = value;
    }

    /**
     * Gets the value of the itemDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemDesc() {
        return itemDesc;
    }

    /**
     * Sets the value of the itemDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemDesc(String value) {
        this.itemDesc = value;
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
     * Gets the value of the locationId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLocationId() {
        return locationId;
    }

    /**
     * Sets the value of the locationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLocationId(Long value) {
        this.locationId = value;
    }

    /**
     * Gets the value of the merchantCategoryCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantCategoryCd() {
        return merchantCategoryCd;
    }

    /**
     * Sets the value of the merchantCategoryCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantCategoryCd(String value) {
        this.merchantCategoryCd = value;
    }

    /**
     * Gets the value of the merchantTypeClassificationCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantTypeClassificationCd() {
        return merchantTypeClassificationCd;
    }

    /**
     * Sets the value of the merchantTypeClassificationCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantTypeClassificationCd(String value) {
        this.merchantTypeClassificationCd = value;
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
     * Gets the value of the merchantCountryCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantCountryCd() {
        return merchantCountryCd;
    }

    /**
     * Sets the value of the merchantCountryCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantCountryCd(String value) {
        this.merchantCountryCd = value;
    }

    /**
     * Gets the value of the merchantCategoryGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantCategoryGroup() {
        return merchantCategoryGroup;
    }

    /**
     * Sets the value of the merchantCategoryGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantCategoryGroup(String value) {
        this.merchantCategoryGroup = value;
    }

    /**
     * Gets the value of the merchantPostalCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantPostalCd() {
        return merchantPostalCd;
    }

    /**
     * Sets the value of the merchantPostalCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantPostalCd(String value) {
        this.merchantPostalCd = value;
    }

    /**
     * Gets the value of the merchantRegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantRegion() {
        return merchantRegion;
    }

    /**
     * Sets the value of the merchantRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantRegion(String value) {
        this.merchantRegion = value;
    }

    /**
     * Gets the value of the merchantShortDBAName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantShortDBAName() {
        return merchantShortDBAName;
    }

    /**
     * Sets the value of the merchantShortDBAName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantShortDBAName(String value) {
        this.merchantShortDBAName = value;
    }

    /**
     * Gets the value of the merchantState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantState() {
        return merchantState;
    }

    /**
     * Sets the value of the merchantState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantState(String value) {
        this.merchantState = value;
    }

    /**
     * Gets the value of the merchantTransactionDBAName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantTransactionDBAName() {
        return merchantTransactionDBAName;
    }

    /**
     * Sets the value of the merchantTransactionDBAName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantTransactionDBAName(String value) {
        this.merchantTransactionDBAName = value;
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
     * Gets the value of the offerTypeCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferTypeCd() {
        return offerTypeCd;
    }

    /**
     * Sets the value of the offerTypeCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferTypeCd(String value) {
        this.offerTypeCd = value;
    }

    /**
     * Gets the value of the pointOfSaleCardTerminalInputCapability property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPointOfSaleCardTerminalInputCapability() {
        return pointOfSaleCardTerminalInputCapability;
    }

    /**
     * Sets the value of the pointOfSaleCardTerminalInputCapability property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPointOfSaleCardTerminalInputCapability(String value) {
        this.pointOfSaleCardTerminalInputCapability = value;
    }

    /**
     * Gets the value of the pointSaleCategoryLvl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPointSaleCategoryLvl() {
        return pointSaleCategoryLvl;
    }

    /**
     * Sets the value of the pointSaleCategoryLvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPointSaleCategoryLvl(String value) {
        this.pointSaleCategoryLvl = value;
    }

    /**
     * Gets the value of the pointOfSaleCountryCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPointOfSaleCountryCd() {
        return pointOfSaleCountryCd;
    }

    /**
     * Sets the value of the pointOfSaleCountryCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPointOfSaleCountryCd(String value) {
        this.pointOfSaleCountryCd = value;
    }

    /**
     * Gets the value of the pointOfSaleCardHolderPresent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPointOfSaleCardHolderPresent() {
        return pointOfSaleCardHolderPresent;
    }

    /**
     * Sets the value of the pointOfSaleCardHolderPresent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPointOfSaleCardHolderPresent(String value) {
        this.pointOfSaleCardHolderPresent = value;
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
     * Gets the value of the processCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessCode() {
        return processCode;
    }

    /**
     * Sets the value of the processCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessCode(String value) {
        this.processCode = value;
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
     * Gets the value of the bankNetRefNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankNetRefNumber() {
        return bankNetRefNumber;
    }

    /**
     * Sets the value of the bankNetRefNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankNetRefNumber(String value) {
        this.bankNetRefNumber = value;
    }

    /**
     * Gets the value of the bankNetRefNumberDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankNetRefNumberDate() {
        return bankNetRefNumberDate;
    }

    /**
     * Sets the value of the bankNetRefNumberDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankNetRefNumberDate(String value) {
        this.bankNetRefNumberDate = value;
    }

    /**
     * Gets the value of the reverseInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReverseInd() {
        return reverseInd;
    }

    /**
     * Sets the value of the reverseInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReverseInd(String value) {
        this.reverseInd = value;
    }

    /**
     * Gets the value of the reverseTransactionAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReverseTransactionAmt() {
        return reverseTransactionAmt;
    }

    /**
     * Sets the value of the reverseTransactionAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReverseTransactionAmt(BigDecimal value) {
        this.reverseTransactionAmt = value;
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
     * Gets the value of the sequenceNumber property.
     * 
     */
    public long getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sets the value of the sequenceNumber property.
     * 
     */
    public void setSequenceNumber(long value) {
        this.sequenceNumber = value;
    }

    /**
     * Gets the value of the settlementCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettlementCurrencyCode() {
        return settlementCurrencyCode;
    }

    /**
     * Sets the value of the settlementCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettlementCurrencyCode(String value) {
        this.settlementCurrencyCode = value;
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
     * Gets the value of the tokenAssuranceLevelCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTokenAssuranceLevelCd() {
        return tokenAssuranceLevelCd;
    }

    /**
     * Sets the value of the tokenAssuranceLevelCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTokenAssuranceLevelCd(String value) {
        this.tokenAssuranceLevelCd = value;
    }

    /**
     * Gets the value of the tokenRequestId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTokenRequestId() {
        return tokenRequestId;
    }

    /**
     * Sets the value of the tokenRequestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTokenRequestId(String value) {
        this.tokenRequestId = value;
    }

    /**
     * Gets the value of the transactionCurrencyCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionCurrencyCd() {
        return transactionCurrencyCd;
    }

    /**
     * Sets the value of the transactionCurrencyCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionCurrencyCd(String value) {
        this.transactionCurrencyCd = value;
    }

    /**
     * Gets the value of the transactionCurrencyTransAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTransactionCurrencyTransAmt() {
        return transactionCurrencyTransAmt;
    }

    /**
     * Sets the value of the transactionCurrencyTransAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTransactionCurrencyTransAmt(BigDecimal value) {
        this.transactionCurrencyTransAmt = value;
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
     * Gets the value of the cardHolderBillingAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCardHolderBillingAmount() {
        return cardHolderBillingAmount;
    }

    /**
     * Sets the value of the cardHolderBillingAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCardHolderBillingAmount(BigDecimal value) {
        this.cardHolderBillingAmount = value;
    }

    /**
     * Gets the value of the transactionSeqNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTransactionSeqNumber() {
        return transactionSeqNumber;
    }

    /**
     * Sets the value of the transactionSeqNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTransactionSeqNumber(Long value) {
        this.transactionSeqNumber = value;
    }

    /**
     * Gets the value of the transactionSourceCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionSourceCd() {
        return transactionSourceCd;
    }

    /**
     * Sets the value of the transactionSourceCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionSourceCd(String value) {
        this.transactionSourceCd = value;
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
     * Gets the value of the walletId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWalletId() {
        return walletId;
    }

    /**
     * Sets the value of the walletId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWalletId(String value) {
        this.walletId = value;
    }

}
