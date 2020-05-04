
package com.mastercard.mcrewards.ws.activity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Account complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Account"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="householdId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="accountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="last4BankAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bankAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="enrollmentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ddaAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ddaAccountNumberUpdateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="customerIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="bankProductCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bankProductName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bankProductSegment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bankProductSegmentRank" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="mastercardProductCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="productTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Account", propOrder = {
    "householdId",
    "accountId",
    "last4BankAccountNumber",
    "bankAccountNumber",
    "enrollmentDate",
    "ddaAccountNumber",
    "ddaAccountNumberUpdateDate",
    "customerIdentifier",
    "bankProductCode",
    "bankProductName",
    "bankProductSegment",
    "bankProductSegmentRank",
    "mastercardProductCode",
    "productTypeName"
})
@XmlSeeAlso({
    AccumulationDetailAccount.class,
    AdjustmentAccount.class,
    RedemptionAccount.class
})
public class Account {

    protected String householdId;
    protected String accountId;
    protected String last4BankAccountNumber;
    protected String bankAccountNumber;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar enrollmentDate;
    protected String ddaAccountNumber;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ddaAccountNumberUpdateDate;
    protected Boolean customerIdentifier;
    protected String bankProductCode;
    protected String bankProductName;
    protected String bankProductSegment;
    protected Integer bankProductSegmentRank;
    protected String mastercardProductCode;
    protected String productTypeName;

    /**
     * Gets the value of the householdId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseholdId() {
        return householdId;
    }

    /**
     * Sets the value of the householdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseholdId(String value) {
        this.householdId = value;
    }

    /**
     * Gets the value of the accountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountId(String value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the last4BankAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLast4BankAccountNumber() {
        return last4BankAccountNumber;
    }

    /**
     * Sets the value of the last4BankAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLast4BankAccountNumber(String value) {
        this.last4BankAccountNumber = value;
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
     * Gets the value of the enrollmentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEnrollmentDate() {
        return enrollmentDate;
    }

    /**
     * Sets the value of the enrollmentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEnrollmentDate(XMLGregorianCalendar value) {
        this.enrollmentDate = value;
    }

    /**
     * Gets the value of the ddaAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDdaAccountNumber() {
        return ddaAccountNumber;
    }

    /**
     * Sets the value of the ddaAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDdaAccountNumber(String value) {
        this.ddaAccountNumber = value;
    }

    /**
     * Gets the value of the ddaAccountNumberUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDdaAccountNumberUpdateDate() {
        return ddaAccountNumberUpdateDate;
    }

    /**
     * Sets the value of the ddaAccountNumberUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDdaAccountNumberUpdateDate(XMLGregorianCalendar value) {
        this.ddaAccountNumberUpdateDate = value;
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
     * Gets the value of the bankProductSegmentRank property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBankProductSegmentRank() {
        return bankProductSegmentRank;
    }

    /**
     * Sets the value of the bankProductSegmentRank property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBankProductSegmentRank(Integer value) {
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

}
