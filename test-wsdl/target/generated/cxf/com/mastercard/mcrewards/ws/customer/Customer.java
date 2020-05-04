
package com.mastercard.mcrewards.ws.customer;

import java.io.Serializable;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter1;


/**
 * <p>Java class for Customer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Customer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="customerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bankCustomerNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="primaryAccountHolderPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="primaryAccountHolderFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="primaryAccountHolderMiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="primaryAccountHolderLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="primaryAccountHolderSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="accountHolderAddressLine1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="accountHolderAddressLine2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="accountHolderAddressLine3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="accountHolderAddressLine4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="countryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="homePhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="businessPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="faxPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vipIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="languageCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="employeeSw" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ssnLastFour" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="motherMaidenName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="genericIdentification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="genericIdentificationDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="emailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="acceptEmailMessageSw" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="mobilePhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="acceptSmsMessageSw" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="gender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="userDefined1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="userDefined2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="userDefined3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="userDefined4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="proprietarySegmentCluster" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="acceptPromotionalInformationSwitch" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="acceptTrackingSwitch" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="loginCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="lifetimeRedemptionCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Customer", propOrder = {
    "customerID",
    "bankCustomerNumber",
    "primaryAccountHolderPrefix",
    "primaryAccountHolderFirstName",
    "primaryAccountHolderMiddleName",
    "primaryAccountHolderLastName",
    "primaryAccountHolderSuffix",
    "accountHolderAddressLine1",
    "accountHolderAddressLine2",
    "accountHolderAddressLine3",
    "accountHolderAddressLine4",
    "cityName",
    "state",
    "postalCode",
    "countryCode",
    "homePhoneNumber",
    "businessPhoneNumber",
    "faxPhoneNumber",
    "vipIndicator",
    "languageCode",
    "employeeSw",
    "ssnLastFour",
    "motherMaidenName",
    "genericIdentification",
    "genericIdentificationDescription",
    "birthDate",
    "emailAddress",
    "acceptEmailMessageSw",
    "mobilePhoneNumber",
    "acceptSmsMessageSw",
    "gender",
    "userDefined1",
    "userDefined2",
    "userDefined3",
    "userDefined4",
    "proprietarySegmentCluster",
    "acceptPromotionalInformationSwitch",
    "acceptTrackingSwitch",
    "loginCount",
    "lifetimeRedemptionCount"
})
public class Customer
    implements Serializable
{

    protected String customerID;
    protected String bankCustomerNumber;
    protected String primaryAccountHolderPrefix;
    protected String primaryAccountHolderFirstName;
    protected String primaryAccountHolderMiddleName;
    protected String primaryAccountHolderLastName;
    protected String primaryAccountHolderSuffix;
    protected String accountHolderAddressLine1;
    protected String accountHolderAddressLine2;
    protected String accountHolderAddressLine3;
    protected String accountHolderAddressLine4;
    protected String cityName;
    protected String state;
    protected String postalCode;
    protected String countryCode;
    protected String homePhoneNumber;
    protected String businessPhoneNumber;
    protected String faxPhoneNumber;
    protected String vipIndicator;
    protected String languageCode;
    protected Boolean employeeSw;
    protected String ssnLastFour;
    protected String motherMaidenName;
    protected String genericIdentification;
    protected String genericIdentificationDescription;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date birthDate;
    protected String emailAddress;
    protected Boolean acceptEmailMessageSw;
    protected String mobilePhoneNumber;
    protected Boolean acceptSmsMessageSw;
    protected String gender;
    protected String userDefined1;
    protected String userDefined2;
    protected String userDefined3;
    protected String userDefined4;
    protected String proprietarySegmentCluster;
    protected Boolean acceptPromotionalInformationSwitch;
    protected Boolean acceptTrackingSwitch;
    protected Long loginCount;
    protected Long lifetimeRedemptionCount;

    /**
     * Gets the value of the customerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerID() {
        return customerID;
    }

    /**
     * Sets the value of the customerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerID(String value) {
        this.customerID = value;
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
     * Gets the value of the primaryAccountHolderPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryAccountHolderPrefix() {
        return primaryAccountHolderPrefix;
    }

    /**
     * Sets the value of the primaryAccountHolderPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryAccountHolderPrefix(String value) {
        this.primaryAccountHolderPrefix = value;
    }

    /**
     * Gets the value of the primaryAccountHolderFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryAccountHolderFirstName() {
        return primaryAccountHolderFirstName;
    }

    /**
     * Sets the value of the primaryAccountHolderFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryAccountHolderFirstName(String value) {
        this.primaryAccountHolderFirstName = value;
    }

    /**
     * Gets the value of the primaryAccountHolderMiddleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryAccountHolderMiddleName() {
        return primaryAccountHolderMiddleName;
    }

    /**
     * Sets the value of the primaryAccountHolderMiddleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryAccountHolderMiddleName(String value) {
        this.primaryAccountHolderMiddleName = value;
    }

    /**
     * Gets the value of the primaryAccountHolderLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryAccountHolderLastName() {
        return primaryAccountHolderLastName;
    }

    /**
     * Sets the value of the primaryAccountHolderLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryAccountHolderLastName(String value) {
        this.primaryAccountHolderLastName = value;
    }

    /**
     * Gets the value of the primaryAccountHolderSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryAccountHolderSuffix() {
        return primaryAccountHolderSuffix;
    }

    /**
     * Sets the value of the primaryAccountHolderSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryAccountHolderSuffix(String value) {
        this.primaryAccountHolderSuffix = value;
    }

    /**
     * Gets the value of the accountHolderAddressLine1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountHolderAddressLine1() {
        return accountHolderAddressLine1;
    }

    /**
     * Sets the value of the accountHolderAddressLine1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountHolderAddressLine1(String value) {
        this.accountHolderAddressLine1 = value;
    }

    /**
     * Gets the value of the accountHolderAddressLine2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountHolderAddressLine2() {
        return accountHolderAddressLine2;
    }

    /**
     * Sets the value of the accountHolderAddressLine2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountHolderAddressLine2(String value) {
        this.accountHolderAddressLine2 = value;
    }

    /**
     * Gets the value of the accountHolderAddressLine3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountHolderAddressLine3() {
        return accountHolderAddressLine3;
    }

    /**
     * Sets the value of the accountHolderAddressLine3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountHolderAddressLine3(String value) {
        this.accountHolderAddressLine3 = value;
    }

    /**
     * Gets the value of the accountHolderAddressLine4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountHolderAddressLine4() {
        return accountHolderAddressLine4;
    }

    /**
     * Sets the value of the accountHolderAddressLine4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountHolderAddressLine4(String value) {
        this.accountHolderAddressLine4 = value;
    }

    /**
     * Gets the value of the cityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * Sets the value of the cityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityName(String value) {
        this.cityName = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the homePhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomePhoneNumber() {
        return homePhoneNumber;
    }

    /**
     * Sets the value of the homePhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomePhoneNumber(String value) {
        this.homePhoneNumber = value;
    }

    /**
     * Gets the value of the businessPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessPhoneNumber() {
        return businessPhoneNumber;
    }

    /**
     * Sets the value of the businessPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessPhoneNumber(String value) {
        this.businessPhoneNumber = value;
    }

    /**
     * Gets the value of the faxPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaxPhoneNumber() {
        return faxPhoneNumber;
    }

    /**
     * Sets the value of the faxPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaxPhoneNumber(String value) {
        this.faxPhoneNumber = value;
    }

    /**
     * Gets the value of the vipIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVipIndicator() {
        return vipIndicator;
    }

    /**
     * Sets the value of the vipIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVipIndicator(String value) {
        this.vipIndicator = value;
    }

    /**
     * Gets the value of the languageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * Sets the value of the languageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageCode(String value) {
        this.languageCode = value;
    }

    /**
     * Gets the value of the employeeSw property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEmployeeSw() {
        return employeeSw;
    }

    /**
     * Sets the value of the employeeSw property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmployeeSw(Boolean value) {
        this.employeeSw = value;
    }

    /**
     * Gets the value of the ssnLastFour property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSsnLastFour() {
        return ssnLastFour;
    }

    /**
     * Sets the value of the ssnLastFour property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSsnLastFour(String value) {
        this.ssnLastFour = value;
    }

    /**
     * Gets the value of the motherMaidenName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotherMaidenName() {
        return motherMaidenName;
    }

    /**
     * Sets the value of the motherMaidenName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotherMaidenName(String value) {
        this.motherMaidenName = value;
    }

    /**
     * Gets the value of the genericIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenericIdentification() {
        return genericIdentification;
    }

    /**
     * Sets the value of the genericIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenericIdentification(String value) {
        this.genericIdentification = value;
    }

    /**
     * Gets the value of the genericIdentificationDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenericIdentificationDescription() {
        return genericIdentificationDescription;
    }

    /**
     * Sets the value of the genericIdentificationDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenericIdentificationDescription(String value) {
        this.genericIdentificationDescription = value;
    }

    /**
     * Gets the value of the birthDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthDate(Date value) {
        this.birthDate = value;
    }

    /**
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

    /**
     * Gets the value of the acceptEmailMessageSw property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAcceptEmailMessageSw() {
        return acceptEmailMessageSw;
    }

    /**
     * Sets the value of the acceptEmailMessageSw property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAcceptEmailMessageSw(Boolean value) {
        this.acceptEmailMessageSw = value;
    }

    /**
     * Gets the value of the mobilePhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    /**
     * Sets the value of the mobilePhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobilePhoneNumber(String value) {
        this.mobilePhoneNumber = value;
    }

    /**
     * Gets the value of the acceptSmsMessageSw property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAcceptSmsMessageSw() {
        return acceptSmsMessageSw;
    }

    /**
     * Sets the value of the acceptSmsMessageSw property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAcceptSmsMessageSw(Boolean value) {
        this.acceptSmsMessageSw = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
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
     * Gets the value of the proprietarySegmentCluster property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProprietarySegmentCluster() {
        return proprietarySegmentCluster;
    }

    /**
     * Sets the value of the proprietarySegmentCluster property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProprietarySegmentCluster(String value) {
        this.proprietarySegmentCluster = value;
    }

    /**
     * Gets the value of the acceptPromotionalInformationSwitch property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAcceptPromotionalInformationSwitch() {
        return acceptPromotionalInformationSwitch;
    }

    /**
     * Sets the value of the acceptPromotionalInformationSwitch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAcceptPromotionalInformationSwitch(Boolean value) {
        this.acceptPromotionalInformationSwitch = value;
    }

    /**
     * Gets the value of the acceptTrackingSwitch property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAcceptTrackingSwitch() {
        return acceptTrackingSwitch;
    }

    /**
     * Sets the value of the acceptTrackingSwitch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAcceptTrackingSwitch(Boolean value) {
        this.acceptTrackingSwitch = value;
    }

    /**
     * Gets the value of the loginCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLoginCount() {
        return loginCount;
    }

    /**
     * Sets the value of the loginCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLoginCount(Long value) {
        this.loginCount = value;
    }

    /**
     * Gets the value of the lifetimeRedemptionCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLifetimeRedemptionCount() {
        return lifetimeRedemptionCount;
    }

    /**
     * Sets the value of the lifetimeRedemptionCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLifetimeRedemptionCount(Long value) {
        this.lifetimeRedemptionCount = value;
    }

}
