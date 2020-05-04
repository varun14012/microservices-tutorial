
package com.mastercard.mcrewards.ws.customer;

import java.io.Serializable;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.mastercard.mcrewards.ws.common.BooleanYesNo;
import org.w3._2001.xmlschema.Adapter1;


/**
 * <p>Java class for CustomerEnrollmentFields complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerEnrollmentFields"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BANK_CUSTOMER_NUMBER"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="30"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MEMBER_ICA" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="ACCEPT_EMAIL_MESSAGE_SWITCH" type="{http://common.ws.mcrewards.mastercard.com/}BooleanYesNo" minOccurs="0"/&gt;
 *         &lt;element name="ACCEPT_SMS_MESSAGE_SWITCH" type="{http://common.ws.mcrewards.mastercard.com/}BooleanYesNo" minOccurs="0"/&gt;
 *         &lt;element name="ACCOUNT_HOLDER_ADDRESS_LINE_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ACCOUNT_HOLDER_ADDRESS_LINE_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ACCOUNT_HOLDER_ADDRESS_LINE_3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ACCOUNT_HOLDER_ADDRESS_LINE_4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BIRTH_DATE" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="BUSINESS_PHONE_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CITY_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="COUNTRY_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EMAIL_ADDRESS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EMPLOYEE_SWITCH" type="{http://common.ws.mcrewards.mastercard.com/}BooleanYesNo" minOccurs="0"/&gt;
 *         &lt;element name="FAX_PHONE_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GENERIC_IDENTIFICATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GENERIC_IDENTIFICATION_DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HOME_PHONE_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LANGUAGE_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MOBILE_PHONE_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MOTHER_MAIDEN_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="POSTAL_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PRIMARY_ACCOUNT_HOLDER_FIRST_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PRIMARY_ACCOUNT_HOLDER_LAST_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SSN_LAST_FOUR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="STATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="USER_DEFINED_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="USER_DEFINED_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="USER_DEFINED_3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="USER_DEFINED_4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VIP_INDICATOR" type="{http://common.ws.mcrewards.mastercard.com/}BooleanYesNo" minOccurs="0"/&gt;
 *         &lt;element name="AUTH_USER_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AUTH_USER_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ACCEPT_PROMO_SWITCH" type="{http://common.ws.mcrewards.mastercard.com/}BooleanYesNo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerEnrollmentFields", propOrder = {
    "bankcustomernumber",
    "memberica",
    "acceptemailmessageswitch",
    "acceptsmsmessageswitch",
    "accountholderaddressline1",
    "accountholderaddressline2",
    "accountholderaddressline3",
    "accountholderaddressline4",
    "birthdate",
    "businessphonenumber",
    "cityname",
    "countrycode",
    "emailaddress",
    "employeeswitch",
    "faxphonenumber",
    "genericidentification",
    "genericidentificationdescription",
    "homephonenumber",
    "languagecode",
    "mobilephonenumber",
    "mothermaidenname",
    "postalcode",
    "primaryaccountholderfirstname",
    "primaryaccountholderlastname",
    "ssnlastfour",
    "state",
    "userdefined1",
    "userdefined2",
    "userdefined3",
    "userdefined4",
    "vipindicator",
    "authuser1",
    "authuser2",
    "acceptpromoswitch"
})
public class CustomerEnrollmentFields
    implements Serializable
{

    @XmlElement(name = "BANK_CUSTOMER_NUMBER", required = true)
    protected String bankcustomernumber;
    @XmlElement(name = "MEMBER_ICA")
    protected long memberica;
    @XmlElement(name = "ACCEPT_EMAIL_MESSAGE_SWITCH")
    @XmlSchemaType(name = "string")
    protected BooleanYesNo acceptemailmessageswitch;
    @XmlElement(name = "ACCEPT_SMS_MESSAGE_SWITCH")
    @XmlSchemaType(name = "string")
    protected BooleanYesNo acceptsmsmessageswitch;
    @XmlElement(name = "ACCOUNT_HOLDER_ADDRESS_LINE_1")
    protected String accountholderaddressline1;
    @XmlElement(name = "ACCOUNT_HOLDER_ADDRESS_LINE_2")
    protected String accountholderaddressline2;
    @XmlElement(name = "ACCOUNT_HOLDER_ADDRESS_LINE_3")
    protected String accountholderaddressline3;
    @XmlElement(name = "ACCOUNT_HOLDER_ADDRESS_LINE_4")
    protected String accountholderaddressline4;
    @XmlElement(name = "BIRTH_DATE", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date birthdate;
    @XmlElement(name = "BUSINESS_PHONE_NUMBER")
    protected String businessphonenumber;
    @XmlElement(name = "CITY_NAME")
    protected String cityname;
    @XmlElement(name = "COUNTRY_CODE")
    protected String countrycode;
    @XmlElement(name = "EMAIL_ADDRESS")
    protected String emailaddress;
    @XmlElement(name = "EMPLOYEE_SWITCH")
    @XmlSchemaType(name = "string")
    protected BooleanYesNo employeeswitch;
    @XmlElement(name = "FAX_PHONE_NUMBER")
    protected String faxphonenumber;
    @XmlElement(name = "GENERIC_IDENTIFICATION")
    protected String genericidentification;
    @XmlElement(name = "GENERIC_IDENTIFICATION_DESCRIPTION")
    protected String genericidentificationdescription;
    @XmlElement(name = "HOME_PHONE_NUMBER")
    protected String homephonenumber;
    @XmlElement(name = "LANGUAGE_CODE")
    protected String languagecode;
    @XmlElement(name = "MOBILE_PHONE_NUMBER")
    protected String mobilephonenumber;
    @XmlElement(name = "MOTHER_MAIDEN_NAME")
    protected String mothermaidenname;
    @XmlElement(name = "POSTAL_CODE")
    protected String postalcode;
    @XmlElement(name = "PRIMARY_ACCOUNT_HOLDER_FIRST_NAME")
    protected String primaryaccountholderfirstname;
    @XmlElement(name = "PRIMARY_ACCOUNT_HOLDER_LAST_NAME")
    protected String primaryaccountholderlastname;
    @XmlElement(name = "SSN_LAST_FOUR")
    protected String ssnlastfour;
    @XmlElement(name = "STATE")
    protected String state;
    @XmlElement(name = "USER_DEFINED_1")
    protected String userdefined1;
    @XmlElement(name = "USER_DEFINED_2")
    protected String userdefined2;
    @XmlElement(name = "USER_DEFINED_3")
    protected String userdefined3;
    @XmlElement(name = "USER_DEFINED_4")
    protected String userdefined4;
    @XmlElement(name = "VIP_INDICATOR")
    @XmlSchemaType(name = "string")
    protected BooleanYesNo vipindicator;
    @XmlElement(name = "AUTH_USER_1")
    protected String authuser1;
    @XmlElement(name = "AUTH_USER_2")
    protected String authuser2;
    @XmlElement(name = "ACCEPT_PROMO_SWITCH")
    @XmlSchemaType(name = "string")
    protected BooleanYesNo acceptpromoswitch;

    /**
     * Gets the value of the bankcustomernumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBANKCUSTOMERNUMBER() {
        return bankcustomernumber;
    }

    /**
     * Sets the value of the bankcustomernumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBANKCUSTOMERNUMBER(String value) {
        this.bankcustomernumber = value;
    }

    /**
     * Gets the value of the memberica property.
     * 
     */
    public long getMEMBERICA() {
        return memberica;
    }

    /**
     * Sets the value of the memberica property.
     * 
     */
    public void setMEMBERICA(long value) {
        this.memberica = value;
    }

    /**
     * Gets the value of the acceptemailmessageswitch property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanYesNo }
     *     
     */
    public BooleanYesNo getACCEPTEMAILMESSAGESWITCH() {
        return acceptemailmessageswitch;
    }

    /**
     * Sets the value of the acceptemailmessageswitch property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanYesNo }
     *     
     */
    public void setACCEPTEMAILMESSAGESWITCH(BooleanYesNo value) {
        this.acceptemailmessageswitch = value;
    }

    /**
     * Gets the value of the acceptsmsmessageswitch property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanYesNo }
     *     
     */
    public BooleanYesNo getACCEPTSMSMESSAGESWITCH() {
        return acceptsmsmessageswitch;
    }

    /**
     * Sets the value of the acceptsmsmessageswitch property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanYesNo }
     *     
     */
    public void setACCEPTSMSMESSAGESWITCH(BooleanYesNo value) {
        this.acceptsmsmessageswitch = value;
    }

    /**
     * Gets the value of the accountholderaddressline1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCOUNTHOLDERADDRESSLINE1() {
        return accountholderaddressline1;
    }

    /**
     * Sets the value of the accountholderaddressline1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCOUNTHOLDERADDRESSLINE1(String value) {
        this.accountholderaddressline1 = value;
    }

    /**
     * Gets the value of the accountholderaddressline2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCOUNTHOLDERADDRESSLINE2() {
        return accountholderaddressline2;
    }

    /**
     * Sets the value of the accountholderaddressline2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCOUNTHOLDERADDRESSLINE2(String value) {
        this.accountholderaddressline2 = value;
    }

    /**
     * Gets the value of the accountholderaddressline3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCOUNTHOLDERADDRESSLINE3() {
        return accountholderaddressline3;
    }

    /**
     * Sets the value of the accountholderaddressline3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCOUNTHOLDERADDRESSLINE3(String value) {
        this.accountholderaddressline3 = value;
    }

    /**
     * Gets the value of the accountholderaddressline4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCOUNTHOLDERADDRESSLINE4() {
        return accountholderaddressline4;
    }

    /**
     * Sets the value of the accountholderaddressline4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCOUNTHOLDERADDRESSLINE4(String value) {
        this.accountholderaddressline4 = value;
    }

    /**
     * Gets the value of the birthdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getBIRTHDATE() {
        return birthdate;
    }

    /**
     * Sets the value of the birthdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBIRTHDATE(Date value) {
        this.birthdate = value;
    }

    /**
     * Gets the value of the businessphonenumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBUSINESSPHONENUMBER() {
        return businessphonenumber;
    }

    /**
     * Sets the value of the businessphonenumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBUSINESSPHONENUMBER(String value) {
        this.businessphonenumber = value;
    }

    /**
     * Gets the value of the cityname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCITYNAME() {
        return cityname;
    }

    /**
     * Sets the value of the cityname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCITYNAME(String value) {
        this.cityname = value;
    }

    /**
     * Gets the value of the countrycode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOUNTRYCODE() {
        return countrycode;
    }

    /**
     * Sets the value of the countrycode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOUNTRYCODE(String value) {
        this.countrycode = value;
    }

    /**
     * Gets the value of the emailaddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMAILADDRESS() {
        return emailaddress;
    }

    /**
     * Sets the value of the emailaddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMAILADDRESS(String value) {
        this.emailaddress = value;
    }

    /**
     * Gets the value of the employeeswitch property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanYesNo }
     *     
     */
    public BooleanYesNo getEMPLOYEESWITCH() {
        return employeeswitch;
    }

    /**
     * Sets the value of the employeeswitch property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanYesNo }
     *     
     */
    public void setEMPLOYEESWITCH(BooleanYesNo value) {
        this.employeeswitch = value;
    }

    /**
     * Gets the value of the faxphonenumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFAXPHONENUMBER() {
        return faxphonenumber;
    }

    /**
     * Sets the value of the faxphonenumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFAXPHONENUMBER(String value) {
        this.faxphonenumber = value;
    }

    /**
     * Gets the value of the genericidentification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGENERICIDENTIFICATION() {
        return genericidentification;
    }

    /**
     * Sets the value of the genericidentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGENERICIDENTIFICATION(String value) {
        this.genericidentification = value;
    }

    /**
     * Gets the value of the genericidentificationdescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGENERICIDENTIFICATIONDESCRIPTION() {
        return genericidentificationdescription;
    }

    /**
     * Sets the value of the genericidentificationdescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGENERICIDENTIFICATIONDESCRIPTION(String value) {
        this.genericidentificationdescription = value;
    }

    /**
     * Gets the value of the homephonenumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHOMEPHONENUMBER() {
        return homephonenumber;
    }

    /**
     * Sets the value of the homephonenumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHOMEPHONENUMBER(String value) {
        this.homephonenumber = value;
    }

    /**
     * Gets the value of the languagecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLANGUAGECODE() {
        return languagecode;
    }

    /**
     * Sets the value of the languagecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLANGUAGECODE(String value) {
        this.languagecode = value;
    }

    /**
     * Gets the value of the mobilephonenumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMOBILEPHONENUMBER() {
        return mobilephonenumber;
    }

    /**
     * Sets the value of the mobilephonenumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMOBILEPHONENUMBER(String value) {
        this.mobilephonenumber = value;
    }

    /**
     * Gets the value of the mothermaidenname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMOTHERMAIDENNAME() {
        return mothermaidenname;
    }

    /**
     * Sets the value of the mothermaidenname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMOTHERMAIDENNAME(String value) {
        this.mothermaidenname = value;
    }

    /**
     * Gets the value of the postalcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOSTALCODE() {
        return postalcode;
    }

    /**
     * Sets the value of the postalcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOSTALCODE(String value) {
        this.postalcode = value;
    }

    /**
     * Gets the value of the primaryaccountholderfirstname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRIMARYACCOUNTHOLDERFIRSTNAME() {
        return primaryaccountholderfirstname;
    }

    /**
     * Sets the value of the primaryaccountholderfirstname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRIMARYACCOUNTHOLDERFIRSTNAME(String value) {
        this.primaryaccountholderfirstname = value;
    }

    /**
     * Gets the value of the primaryaccountholderlastname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRIMARYACCOUNTHOLDERLASTNAME() {
        return primaryaccountholderlastname;
    }

    /**
     * Sets the value of the primaryaccountholderlastname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRIMARYACCOUNTHOLDERLASTNAME(String value) {
        this.primaryaccountholderlastname = value;
    }

    /**
     * Gets the value of the ssnlastfour property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSNLASTFOUR() {
        return ssnlastfour;
    }

    /**
     * Sets the value of the ssnlastfour property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSNLASTFOUR(String value) {
        this.ssnlastfour = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTATE() {
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
    public void setSTATE(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the userdefined1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSERDEFINED1() {
        return userdefined1;
    }

    /**
     * Sets the value of the userdefined1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSERDEFINED1(String value) {
        this.userdefined1 = value;
    }

    /**
     * Gets the value of the userdefined2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSERDEFINED2() {
        return userdefined2;
    }

    /**
     * Sets the value of the userdefined2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSERDEFINED2(String value) {
        this.userdefined2 = value;
    }

    /**
     * Gets the value of the userdefined3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSERDEFINED3() {
        return userdefined3;
    }

    /**
     * Sets the value of the userdefined3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSERDEFINED3(String value) {
        this.userdefined3 = value;
    }

    /**
     * Gets the value of the userdefined4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSERDEFINED4() {
        return userdefined4;
    }

    /**
     * Sets the value of the userdefined4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSERDEFINED4(String value) {
        this.userdefined4 = value;
    }

    /**
     * Gets the value of the vipindicator property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanYesNo }
     *     
     */
    public BooleanYesNo getVIPINDICATOR() {
        return vipindicator;
    }

    /**
     * Sets the value of the vipindicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanYesNo }
     *     
     */
    public void setVIPINDICATOR(BooleanYesNo value) {
        this.vipindicator = value;
    }

    /**
     * Gets the value of the authuser1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUTHUSER1() {
        return authuser1;
    }

    /**
     * Sets the value of the authuser1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUTHUSER1(String value) {
        this.authuser1 = value;
    }

    /**
     * Gets the value of the authuser2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUTHUSER2() {
        return authuser2;
    }

    /**
     * Sets the value of the authuser2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUTHUSER2(String value) {
        this.authuser2 = value;
    }

    /**
     * Gets the value of the acceptpromoswitch property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanYesNo }
     *     
     */
    public BooleanYesNo getACCEPTPROMOSWITCH() {
        return acceptpromoswitch;
    }

    /**
     * Sets the value of the acceptpromoswitch property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanYesNo }
     *     
     */
    public void setACCEPTPROMOSWITCH(BooleanYesNo value) {
        this.acceptpromoswitch = value;
    }

}
