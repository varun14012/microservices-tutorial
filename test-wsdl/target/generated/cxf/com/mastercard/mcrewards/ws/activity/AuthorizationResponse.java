
package com.mastercard.mcrewards.ws.activity;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AuthorizationResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuthorizationResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="authResponseLogId" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="reprocessedAuthResponseLogId" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="de004TransactionAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="de005IssuerCurrencySettlementAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="de006CardholderBillingAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="de012TransactionTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="de013TransactionDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="de018MerchantCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="de032AcquiringInstitutionIdCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="de039ResponseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="de042CardAcceptorIdCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="de043CardAcceptorNameLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="de048TCC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="de049TransactionCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="de050SettlementCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="de051CardholderBillingCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="responseReasonId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="responseReasonDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pointsRedeemed" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="merchantCategoryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bankNetReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="reprocessedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reprocessedDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthorizationResponse", propOrder = {
    "authResponseLogId",
    "reprocessedAuthResponseLogId",
    "de004TransactionAmount",
    "de005IssuerCurrencySettlementAmount",
    "de006CardholderBillingAmount",
    "de012TransactionTime",
    "de013TransactionDate",
    "de018MerchantCode",
    "de032AcquiringInstitutionIdCode",
    "de039ResponseCode",
    "de042CardAcceptorIdCode",
    "de043CardAcceptorNameLocation",
    "de048TCC",
    "de049TransactionCurrencyCode",
    "de050SettlementCurrencyCode",
    "de051CardholderBillingCurrencyCode",
    "responseReasonId",
    "responseReasonDesc",
    "pointsRedeemed",
    "merchantCategoryName",
    "bankNetReferenceNumber",
    "reprocessedBy",
    "reprocessedDateTime"
})
public class AuthorizationResponse {

    @XmlElement(required = true)
    protected BigDecimal authResponseLogId;
    protected BigDecimal reprocessedAuthResponseLogId;
    protected String de004TransactionAmount;
    protected String de005IssuerCurrencySettlementAmount;
    protected String de006CardholderBillingAmount;
    protected String de012TransactionTime;
    protected String de013TransactionDate;
    protected String de018MerchantCode;
    protected String de032AcquiringInstitutionIdCode;
    protected String de039ResponseCode;
    protected String de042CardAcceptorIdCode;
    protected String de043CardAcceptorNameLocation;
    protected String de048TCC;
    protected String de049TransactionCurrencyCode;
    protected String de050SettlementCurrencyCode;
    protected String de051CardholderBillingCurrencyCode;
    protected long responseReasonId;
    protected String responseReasonDesc;
    protected BigDecimal pointsRedeemed;
    protected String merchantCategoryName;
    @XmlElement(required = true)
    protected String bankNetReferenceNumber;
    protected String reprocessedBy;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reprocessedDateTime;

    /**
     * Gets the value of the authResponseLogId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAuthResponseLogId() {
        return authResponseLogId;
    }

    /**
     * Sets the value of the authResponseLogId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAuthResponseLogId(BigDecimal value) {
        this.authResponseLogId = value;
    }

    /**
     * Gets the value of the reprocessedAuthResponseLogId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReprocessedAuthResponseLogId() {
        return reprocessedAuthResponseLogId;
    }

    /**
     * Sets the value of the reprocessedAuthResponseLogId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReprocessedAuthResponseLogId(BigDecimal value) {
        this.reprocessedAuthResponseLogId = value;
    }

    /**
     * Gets the value of the de004TransactionAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDe004TransactionAmount() {
        return de004TransactionAmount;
    }

    /**
     * Sets the value of the de004TransactionAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDe004TransactionAmount(String value) {
        this.de004TransactionAmount = value;
    }

    /**
     * Gets the value of the de005IssuerCurrencySettlementAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDe005IssuerCurrencySettlementAmount() {
        return de005IssuerCurrencySettlementAmount;
    }

    /**
     * Sets the value of the de005IssuerCurrencySettlementAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDe005IssuerCurrencySettlementAmount(String value) {
        this.de005IssuerCurrencySettlementAmount = value;
    }

    /**
     * Gets the value of the de006CardholderBillingAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDe006CardholderBillingAmount() {
        return de006CardholderBillingAmount;
    }

    /**
     * Sets the value of the de006CardholderBillingAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDe006CardholderBillingAmount(String value) {
        this.de006CardholderBillingAmount = value;
    }

    /**
     * Gets the value of the de012TransactionTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDe012TransactionTime() {
        return de012TransactionTime;
    }

    /**
     * Sets the value of the de012TransactionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDe012TransactionTime(String value) {
        this.de012TransactionTime = value;
    }

    /**
     * Gets the value of the de013TransactionDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDe013TransactionDate() {
        return de013TransactionDate;
    }

    /**
     * Sets the value of the de013TransactionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDe013TransactionDate(String value) {
        this.de013TransactionDate = value;
    }

    /**
     * Gets the value of the de018MerchantCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDe018MerchantCode() {
        return de018MerchantCode;
    }

    /**
     * Sets the value of the de018MerchantCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDe018MerchantCode(String value) {
        this.de018MerchantCode = value;
    }

    /**
     * Gets the value of the de032AcquiringInstitutionIdCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDe032AcquiringInstitutionIdCode() {
        return de032AcquiringInstitutionIdCode;
    }

    /**
     * Sets the value of the de032AcquiringInstitutionIdCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDe032AcquiringInstitutionIdCode(String value) {
        this.de032AcquiringInstitutionIdCode = value;
    }

    /**
     * Gets the value of the de039ResponseCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDe039ResponseCode() {
        return de039ResponseCode;
    }

    /**
     * Sets the value of the de039ResponseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDe039ResponseCode(String value) {
        this.de039ResponseCode = value;
    }

    /**
     * Gets the value of the de042CardAcceptorIdCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDe042CardAcceptorIdCode() {
        return de042CardAcceptorIdCode;
    }

    /**
     * Sets the value of the de042CardAcceptorIdCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDe042CardAcceptorIdCode(String value) {
        this.de042CardAcceptorIdCode = value;
    }

    /**
     * Gets the value of the de043CardAcceptorNameLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDe043CardAcceptorNameLocation() {
        return de043CardAcceptorNameLocation;
    }

    /**
     * Sets the value of the de043CardAcceptorNameLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDe043CardAcceptorNameLocation(String value) {
        this.de043CardAcceptorNameLocation = value;
    }

    /**
     * Gets the value of the de048TCC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDe048TCC() {
        return de048TCC;
    }

    /**
     * Sets the value of the de048TCC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDe048TCC(String value) {
        this.de048TCC = value;
    }

    /**
     * Gets the value of the de049TransactionCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDe049TransactionCurrencyCode() {
        return de049TransactionCurrencyCode;
    }

    /**
     * Sets the value of the de049TransactionCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDe049TransactionCurrencyCode(String value) {
        this.de049TransactionCurrencyCode = value;
    }

    /**
     * Gets the value of the de050SettlementCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDe050SettlementCurrencyCode() {
        return de050SettlementCurrencyCode;
    }

    /**
     * Sets the value of the de050SettlementCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDe050SettlementCurrencyCode(String value) {
        this.de050SettlementCurrencyCode = value;
    }

    /**
     * Gets the value of the de051CardholderBillingCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDe051CardholderBillingCurrencyCode() {
        return de051CardholderBillingCurrencyCode;
    }

    /**
     * Sets the value of the de051CardholderBillingCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDe051CardholderBillingCurrencyCode(String value) {
        this.de051CardholderBillingCurrencyCode = value;
    }

    /**
     * Gets the value of the responseReasonId property.
     * 
     */
    public long getResponseReasonId() {
        return responseReasonId;
    }

    /**
     * Sets the value of the responseReasonId property.
     * 
     */
    public void setResponseReasonId(long value) {
        this.responseReasonId = value;
    }

    /**
     * Gets the value of the responseReasonDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseReasonDesc() {
        return responseReasonDesc;
    }

    /**
     * Sets the value of the responseReasonDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseReasonDesc(String value) {
        this.responseReasonDesc = value;
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
     * Gets the value of the merchantCategoryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantCategoryName() {
        return merchantCategoryName;
    }

    /**
     * Sets the value of the merchantCategoryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantCategoryName(String value) {
        this.merchantCategoryName = value;
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
     * Gets the value of the reprocessedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReprocessedBy() {
        return reprocessedBy;
    }

    /**
     * Sets the value of the reprocessedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReprocessedBy(String value) {
        this.reprocessedBy = value;
    }

    /**
     * Gets the value of the reprocessedDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReprocessedDateTime() {
        return reprocessedDateTime;
    }

    /**
     * Sets the value of the reprocessedDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReprocessedDateTime(XMLGregorianCalendar value) {
        this.reprocessedDateTime = value;
    }

}
