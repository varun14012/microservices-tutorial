
package com.mastercard.mcrewards.ws.customer;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter1;


/**
 * <p>Java class for Card complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Card"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bankAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastFourDigitsOfCard" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="accountId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="customerId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="householdRedeemerCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pointTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="accountStatusId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="accountStatusDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bankProductName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="primaryAccountSw" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="programId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="programIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="accruePointsSw" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="accountOpenedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="activeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="autoEnrollSw" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="dda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="enrollmentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="enrollmentTypeId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="oldestLoyaltyTransactionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="lifetimePointsAccrued" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="lifetimePointsRedeemed" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="lifetimeTransactionAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="lifetimeQuantityOfTransactions" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="lostStolenSw" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="previousBankAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="proprietaryAccountStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="proprietaryAccountStatusDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="partnerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="receiveStatementsSw" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="reportCategoryText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="userDefined1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="userDefined2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="userDefined3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="userDefined4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="userDefined5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="userDefined6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="userDefined7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="userDefined8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="householdId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="customerIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="bankProductCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bankProductSegment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="coBrandId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="redeemerSw" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="travelComponent" type="{http://customer.ws.mcrewards.mastercard.com/}TravelComponent" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="bankProductSegmentRank" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="mastercardProductCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="productTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="productAliasName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="referenceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Card", propOrder = {
    "bankAccountNumber",
    "lastFourDigitsOfCard",
    "accountId",
    "customerId",
    "householdRedeemerCode",
    "pointTotal",
    "accountStatusId",
    "accountStatusDesc",
    "bankProductName",
    "primaryAccountSw",
    "programId",
    "programIdentifier",
    "accruePointsSw",
    "accountOpenedDate",
    "activeDate",
    "autoEnrollSw",
    "dda",
    "enrollmentDate",
    "enrollmentTypeId",
    "oldestLoyaltyTransactionDate",
    "lifetimePointsAccrued",
    "lifetimePointsRedeemed",
    "lifetimeTransactionAmount",
    "lifetimeQuantityOfTransactions",
    "lostStolenSw",
    "previousBankAccountNumber",
    "proprietaryAccountStatusCode",
    "proprietaryAccountStatusDate",
    "partnerId",
    "receiveStatementsSw",
    "reportCategoryText",
    "userDefined1",
    "userDefined2",
    "userDefined3",
    "userDefined4",
    "userDefined5",
    "userDefined6",
    "userDefined7",
    "userDefined8",
    "householdId",
    "customerIdentifier",
    "bankProductCode",
    "bankProductSegment",
    "coBrandId",
    "redeemerSw",
    "travelComponent",
    "bankProductSegmentRank",
    "mastercardProductCode",
    "productTypeName",
    "productAliasName",
    "referenceId"
})
public class Card
    implements Serializable
{

    protected String bankAccountNumber;
    protected String lastFourDigitsOfCard;
    protected Long accountId;
    protected Long customerId;
    protected String householdRedeemerCode;
    protected BigDecimal pointTotal;
    protected Long accountStatusId;
    protected String accountStatusDesc;
    protected String bankProductName;
    protected Boolean primaryAccountSw;
    protected Long programId;
    protected String programIdentifier;
    protected Boolean accruePointsSw;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date accountOpenedDate;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date activeDate;
    protected Boolean autoEnrollSw;
    protected String dda;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date enrollmentDate;
    protected Long enrollmentTypeId;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date oldestLoyaltyTransactionDate;
    protected BigDecimal lifetimePointsAccrued;
    protected BigDecimal lifetimePointsRedeemed;
    protected BigDecimal lifetimeTransactionAmount;
    protected BigDecimal lifetimeQuantityOfTransactions;
    protected Boolean lostStolenSw;
    protected String previousBankAccountNumber;
    protected String proprietaryAccountStatusCode;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date proprietaryAccountStatusDate;
    protected String partnerId;
    protected Boolean receiveStatementsSw;
    protected String reportCategoryText;
    protected String userDefined1;
    protected String userDefined2;
    protected String userDefined3;
    protected String userDefined4;
    protected String userDefined5;
    protected String userDefined6;
    protected String userDefined7;
    protected String userDefined8;
    protected Long householdId;
    protected Boolean customerIdentifier;
    protected String bankProductCode;
    protected String bankProductSegment;
    protected String coBrandId;
    protected Boolean redeemerSw;
    protected List<TravelComponent> travelComponent;
    protected Long bankProductSegmentRank;
    protected String mastercardProductCode;
    protected String productTypeName;
    protected String productAliasName;
    protected String referenceId;

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
     * Gets the value of the lastFourDigitsOfCard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastFourDigitsOfCard() {
        return lastFourDigitsOfCard;
    }

    /**
     * Sets the value of the lastFourDigitsOfCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastFourDigitsOfCard(String value) {
        this.lastFourDigitsOfCard = value;
    }

    /**
     * Gets the value of the accountId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAccountId(Long value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the customerId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCustomerId() {
        return customerId;
    }

    /**
     * Sets the value of the customerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCustomerId(Long value) {
        this.customerId = value;
    }

    /**
     * Gets the value of the householdRedeemerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseholdRedeemerCode() {
        return householdRedeemerCode;
    }

    /**
     * Sets the value of the householdRedeemerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseholdRedeemerCode(String value) {
        this.householdRedeemerCode = value;
    }

    /**
     * Gets the value of the pointTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPointTotal() {
        return pointTotal;
    }

    /**
     * Sets the value of the pointTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPointTotal(BigDecimal value) {
        this.pointTotal = value;
    }

    /**
     * Gets the value of the accountStatusId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAccountStatusId() {
        return accountStatusId;
    }

    /**
     * Sets the value of the accountStatusId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAccountStatusId(Long value) {
        this.accountStatusId = value;
    }

    /**
     * Gets the value of the accountStatusDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountStatusDesc() {
        return accountStatusDesc;
    }

    /**
     * Sets the value of the accountStatusDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountStatusDesc(String value) {
        this.accountStatusDesc = value;
    }

    /**
     * Gets the value of the bankProductName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankProductName() {
        return bankProductName;
    }

    /**
     * Sets the value of the bankProductName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankProductName(String value) {
        this.bankProductName = value;
    }

    /**
     * Gets the value of the primaryAccountSw property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrimaryAccountSw() {
        return primaryAccountSw;
    }

    /**
     * Sets the value of the primaryAccountSw property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrimaryAccountSw(Boolean value) {
        this.primaryAccountSw = value;
    }

    /**
     * Gets the value of the programId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProgramId() {
        return programId;
    }

    /**
     * Sets the value of the programId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProgramId(Long value) {
        this.programId = value;
    }

    /**
     * Gets the value of the programIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramIdentifier() {
        return programIdentifier;
    }

    /**
     * Sets the value of the programIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgramIdentifier(String value) {
        this.programIdentifier = value;
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
     * Gets the value of the accountOpenedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getAccountOpenedDate() {
        return accountOpenedDate;
    }

    /**
     * Sets the value of the accountOpenedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountOpenedDate(Date value) {
        this.accountOpenedDate = value;
    }

    /**
     * Gets the value of the activeDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getActiveDate() {
        return activeDate;
    }

    /**
     * Sets the value of the activeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActiveDate(Date value) {
        this.activeDate = value;
    }

    /**
     * Gets the value of the autoEnrollSw property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoEnrollSw() {
        return autoEnrollSw;
    }

    /**
     * Sets the value of the autoEnrollSw property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoEnrollSw(Boolean value) {
        this.autoEnrollSw = value;
    }

    /**
     * Gets the value of the dda property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDda() {
        return dda;
    }

    /**
     * Sets the value of the dda property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDda(String value) {
        this.dda = value;
    }

    /**
     * Gets the value of the enrollmentDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getEnrollmentDate() {
        return enrollmentDate;
    }

    /**
     * Sets the value of the enrollmentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnrollmentDate(Date value) {
        this.enrollmentDate = value;
    }

    /**
     * Gets the value of the enrollmentTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEnrollmentTypeId() {
        return enrollmentTypeId;
    }

    /**
     * Sets the value of the enrollmentTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEnrollmentTypeId(Long value) {
        this.enrollmentTypeId = value;
    }

    /**
     * Gets the value of the oldestLoyaltyTransactionDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getOldestLoyaltyTransactionDate() {
        return oldestLoyaltyTransactionDate;
    }

    /**
     * Sets the value of the oldestLoyaltyTransactionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldestLoyaltyTransactionDate(Date value) {
        this.oldestLoyaltyTransactionDate = value;
    }

    /**
     * Gets the value of the lifetimePointsAccrued property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLifetimePointsAccrued() {
        return lifetimePointsAccrued;
    }

    /**
     * Sets the value of the lifetimePointsAccrued property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLifetimePointsAccrued(BigDecimal value) {
        this.lifetimePointsAccrued = value;
    }

    /**
     * Gets the value of the lifetimePointsRedeemed property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLifetimePointsRedeemed() {
        return lifetimePointsRedeemed;
    }

    /**
     * Sets the value of the lifetimePointsRedeemed property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLifetimePointsRedeemed(BigDecimal value) {
        this.lifetimePointsRedeemed = value;
    }

    /**
     * Gets the value of the lifetimeTransactionAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLifetimeTransactionAmount() {
        return lifetimeTransactionAmount;
    }

    /**
     * Sets the value of the lifetimeTransactionAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLifetimeTransactionAmount(BigDecimal value) {
        this.lifetimeTransactionAmount = value;
    }

    /**
     * Gets the value of the lifetimeQuantityOfTransactions property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLifetimeQuantityOfTransactions() {
        return lifetimeQuantityOfTransactions;
    }

    /**
     * Sets the value of the lifetimeQuantityOfTransactions property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLifetimeQuantityOfTransactions(BigDecimal value) {
        this.lifetimeQuantityOfTransactions = value;
    }

    /**
     * Gets the value of the lostStolenSw property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLostStolenSw() {
        return lostStolenSw;
    }

    /**
     * Sets the value of the lostStolenSw property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLostStolenSw(Boolean value) {
        this.lostStolenSw = value;
    }

    /**
     * Gets the value of the previousBankAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousBankAccountNumber() {
        return previousBankAccountNumber;
    }

    /**
     * Sets the value of the previousBankAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousBankAccountNumber(String value) {
        this.previousBankAccountNumber = value;
    }

    /**
     * Gets the value of the proprietaryAccountStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProprietaryAccountStatusCode() {
        return proprietaryAccountStatusCode;
    }

    /**
     * Sets the value of the proprietaryAccountStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProprietaryAccountStatusCode(String value) {
        this.proprietaryAccountStatusCode = value;
    }

    /**
     * Gets the value of the proprietaryAccountStatusDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getProprietaryAccountStatusDate() {
        return proprietaryAccountStatusDate;
    }

    /**
     * Sets the value of the proprietaryAccountStatusDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProprietaryAccountStatusDate(Date value) {
        this.proprietaryAccountStatusDate = value;
    }

    /**
     * Gets the value of the partnerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerId() {
        return partnerId;
    }

    /**
     * Sets the value of the partnerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerId(String value) {
        this.partnerId = value;
    }

    /**
     * Gets the value of the receiveStatementsSw property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReceiveStatementsSw() {
        return receiveStatementsSw;
    }

    /**
     * Sets the value of the receiveStatementsSw property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReceiveStatementsSw(Boolean value) {
        this.receiveStatementsSw = value;
    }

    /**
     * Gets the value of the reportCategoryText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportCategoryText() {
        return reportCategoryText;
    }

    /**
     * Sets the value of the reportCategoryText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportCategoryText(String value) {
        this.reportCategoryText = value;
    }

    /**
     * Gets the value of the userDefined1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserDefined1() {
        return userDefined1;
    }

    /**
     * Sets the value of the userDefined1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserDefined1(String value) {
        this.userDefined1 = value;
    }

    /**
     * Gets the value of the userDefined2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserDefined2() {
        return userDefined2;
    }

    /**
     * Sets the value of the userDefined2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserDefined2(String value) {
        this.userDefined2 = value;
    }

    /**
     * Gets the value of the userDefined3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserDefined3() {
        return userDefined3;
    }

    /**
     * Sets the value of the userDefined3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserDefined3(String value) {
        this.userDefined3 = value;
    }

    /**
     * Gets the value of the userDefined4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserDefined4() {
        return userDefined4;
    }

    /**
     * Sets the value of the userDefined4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserDefined4(String value) {
        this.userDefined4 = value;
    }

    /**
     * Gets the value of the userDefined5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserDefined5() {
        return userDefined5;
    }

    /**
     * Sets the value of the userDefined5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserDefined5(String value) {
        this.userDefined5 = value;
    }

    /**
     * Gets the value of the userDefined6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserDefined6() {
        return userDefined6;
    }

    /**
     * Sets the value of the userDefined6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserDefined6(String value) {
        this.userDefined6 = value;
    }

    /**
     * Gets the value of the userDefined7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserDefined7() {
        return userDefined7;
    }

    /**
     * Sets the value of the userDefined7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserDefined7(String value) {
        this.userDefined7 = value;
    }

    /**
     * Gets the value of the userDefined8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserDefined8() {
        return userDefined8;
    }

    /**
     * Sets the value of the userDefined8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserDefined8(String value) {
        this.userDefined8 = value;
    }

    /**
     * Gets the value of the householdId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getHouseholdId() {
        return householdId;
    }

    /**
     * Sets the value of the householdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHouseholdId(Long value) {
        this.householdId = value;
    }

    /**
     * Gets the value of the customerIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCustomerIdentifier() {
        return customerIdentifier;
    }

    /**
     * Sets the value of the customerIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCustomerIdentifier(Boolean value) {
        this.customerIdentifier = value;
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
     * Gets the value of the bankProductSegment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankProductSegment() {
        return bankProductSegment;
    }

    /**
     * Sets the value of the bankProductSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankProductSegment(String value) {
        this.bankProductSegment = value;
    }

    /**
     * Gets the value of the coBrandId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoBrandId() {
        return coBrandId;
    }

    /**
     * Sets the value of the coBrandId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoBrandId(String value) {
        this.coBrandId = value;
    }

    /**
     * Gets the value of the redeemerSw property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRedeemerSw() {
        return redeemerSw;
    }

    /**
     * Sets the value of the redeemerSw property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRedeemerSw(Boolean value) {
        this.redeemerSw = value;
    }

    /**
     * Gets the value of the travelComponent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the travelComponent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTravelComponent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TravelComponent }
     * 
     * 
     */
    public List<TravelComponent> getTravelComponent() {
        if (travelComponent == null) {
            travelComponent = new ArrayList<TravelComponent>();
        }
        return this.travelComponent;
    }

    /**
     * Gets the value of the bankProductSegmentRank property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBankProductSegmentRank() {
        return bankProductSegmentRank;
    }

    /**
     * Sets the value of the bankProductSegmentRank property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBankProductSegmentRank(Long value) {
        this.bankProductSegmentRank = value;
    }

    /**
     * Gets the value of the mastercardProductCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMastercardProductCode() {
        return mastercardProductCode;
    }

    /**
     * Sets the value of the mastercardProductCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMastercardProductCode(String value) {
        this.mastercardProductCode = value;
    }

    /**
     * Gets the value of the productTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductTypeName() {
        return productTypeName;
    }

    /**
     * Sets the value of the productTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductTypeName(String value) {
        this.productTypeName = value;
    }

    /**
     * Gets the value of the productAliasName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductAliasName() {
        return productAliasName;
    }

    /**
     * Sets the value of the productAliasName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductAliasName(String value) {
        this.productAliasName = value;
    }

    /**
     * Gets the value of the referenceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceId() {
        return referenceId;
    }

    /**
     * Sets the value of the referenceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceId(String value) {
        this.referenceId = value;
    }

}
