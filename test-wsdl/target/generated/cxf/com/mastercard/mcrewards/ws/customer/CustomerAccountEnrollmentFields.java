
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
import com.mastercard.mcrewards.ws.common.EncryptedField;
import org.w3._2001.xmlschema.Adapter1;


/**
 * <p>Java class for CustomerAccountEnrollmentFields complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerAccountEnrollmentFields"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DPAN_TOKEN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BANK_ACCOUNT_NUMBER" type="{http://common.ws.mcrewards.mastercard.com/}encryptedField"/&gt;
 *         &lt;element name="ACCOUNT_STATUS_CODE" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="BANK_PRODUCT_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PROGRAM_IDENTIFIER" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ACCOUNT_OPENED_DATE" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ACCRUE_POINTS_SW" type="{http://common.ws.mcrewards.mastercard.com/}BooleanYesNo" minOccurs="0"/&gt;
 *         &lt;element name="DDA_ACCOUNT_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ENROLLMENT_DATE" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="GHOST_ACCOUNT_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HOUSEHOLD_ELIGIBILITY_TOKEN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PARTNER_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PRIMARY_ACCOUNT_SWITCH" type="{http://common.ws.mcrewards.mastercard.com/}BooleanYesNo" minOccurs="0"/&gt;
 *         &lt;element name="RECEIVE_STATEMENTS" type="{http://common.ws.mcrewards.mastercard.com/}BooleanYesNo" minOccurs="0"/&gt;
 *         &lt;element name="REPORTING_CATEGORY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="USER_DEFINED_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="USER_DEFINED_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="USER_DEFINED_3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="USER_DEFINED_4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="USER_DEFINED_5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="USER_DEFINED_6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="USER_DEFINED_7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="USER_DEFINED_8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerAccountEnrollmentFields", propOrder = {
    "dpantoken",
    "bankaccountnumber",
    "accountstatuscode",
    "bankproductcode",
    "programidentifier",
    "accountopeneddate",
    "accruepointssw",
    "ddaaccountnumber",
    "enrollmentdate",
    "ghostaccountnumber",
    "householdeligibilitytoken",
    "partnerid",
    "primaryaccountswitch",
    "receivestatements",
    "reportingcategory",
    "userdefined1",
    "userdefined2",
    "userdefined3",
    "userdefined4",
    "userdefined5",
    "userdefined6",
    "userdefined7",
    "userdefined8"
})
public class CustomerAccountEnrollmentFields
    implements Serializable
{

    @XmlElement(name = "DPAN_TOKEN")
    protected String dpantoken;
    @XmlElement(name = "BANK_ACCOUNT_NUMBER", required = true)
    protected EncryptedField bankaccountnumber;
    @XmlElement(name = "ACCOUNT_STATUS_CODE")
    protected long accountstatuscode;
    @XmlElement(name = "BANK_PRODUCT_CODE", required = true)
    protected String bankproductcode;
    @XmlElement(name = "PROGRAM_IDENTIFIER", required = true)
    protected String programidentifier;
    @XmlElement(name = "ACCOUNT_OPENED_DATE", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date accountopeneddate;
    @XmlElement(name = "ACCRUE_POINTS_SW")
    @XmlSchemaType(name = "string")
    protected BooleanYesNo accruepointssw;
    @XmlElement(name = "DDA_ACCOUNT_NUMBER")
    protected String ddaaccountnumber;
    @XmlElement(name = "ENROLLMENT_DATE", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date enrollmentdate;
    @XmlElement(name = "GHOST_ACCOUNT_NUMBER")
    protected String ghostaccountnumber;
    @XmlElement(name = "HOUSEHOLD_ELIGIBILITY_TOKEN")
    protected String householdeligibilitytoken;
    @XmlElement(name = "PARTNER_ID")
    protected String partnerid;
    @XmlElement(name = "PRIMARY_ACCOUNT_SWITCH")
    @XmlSchemaType(name = "string")
    protected BooleanYesNo primaryaccountswitch;
    @XmlElement(name = "RECEIVE_STATEMENTS")
    @XmlSchemaType(name = "string")
    protected BooleanYesNo receivestatements;
    @XmlElement(name = "REPORTING_CATEGORY")
    protected String reportingcategory;
    @XmlElement(name = "USER_DEFINED_1")
    protected String userdefined1;
    @XmlElement(name = "USER_DEFINED_2")
    protected String userdefined2;
    @XmlElement(name = "USER_DEFINED_3")
    protected String userdefined3;
    @XmlElement(name = "USER_DEFINED_4")
    protected String userdefined4;
    @XmlElement(name = "USER_DEFINED_5")
    protected String userdefined5;
    @XmlElement(name = "USER_DEFINED_6")
    protected String userdefined6;
    @XmlElement(name = "USER_DEFINED_7")
    protected String userdefined7;
    @XmlElement(name = "USER_DEFINED_8")
    protected String userdefined8;

    /**
     * Gets the value of the dpantoken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDPANTOKEN() {
        return dpantoken;
    }

    /**
     * Sets the value of the dpantoken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDPANTOKEN(String value) {
        this.dpantoken = value;
    }

    /**
     * Gets the value of the bankaccountnumber property.
     * 
     * @return
     *     possible object is
     *     {@link EncryptedField }
     *     
     */
    public EncryptedField getBANKACCOUNTNUMBER() {
        return bankaccountnumber;
    }

    /**
     * Sets the value of the bankaccountnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link EncryptedField }
     *     
     */
    public void setBANKACCOUNTNUMBER(EncryptedField value) {
        this.bankaccountnumber = value;
    }

    /**
     * Gets the value of the accountstatuscode property.
     * 
     */
    public long getACCOUNTSTATUSCODE() {
        return accountstatuscode;
    }

    /**
     * Sets the value of the accountstatuscode property.
     * 
     */
    public void setACCOUNTSTATUSCODE(long value) {
        this.accountstatuscode = value;
    }

    /**
     * Gets the value of the bankproductcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBANKPRODUCTCODE() {
        return bankproductcode;
    }

    /**
     * Sets the value of the bankproductcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBANKPRODUCTCODE(String value) {
        this.bankproductcode = value;
    }

    /**
     * Gets the value of the programidentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROGRAMIDENTIFIER() {
        return programidentifier;
    }

    /**
     * Sets the value of the programidentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROGRAMIDENTIFIER(String value) {
        this.programidentifier = value;
    }

    /**
     * Gets the value of the accountopeneddate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getACCOUNTOPENEDDATE() {
        return accountopeneddate;
    }

    /**
     * Sets the value of the accountopeneddate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCOUNTOPENEDDATE(Date value) {
        this.accountopeneddate = value;
    }

    /**
     * Gets the value of the accruepointssw property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanYesNo }
     *     
     */
    public BooleanYesNo getACCRUEPOINTSSW() {
        return accruepointssw;
    }

    /**
     * Sets the value of the accruepointssw property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanYesNo }
     *     
     */
    public void setACCRUEPOINTSSW(BooleanYesNo value) {
        this.accruepointssw = value;
    }

    /**
     * Gets the value of the ddaaccountnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDDAACCOUNTNUMBER() {
        return ddaaccountnumber;
    }

    /**
     * Sets the value of the ddaaccountnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDDAACCOUNTNUMBER(String value) {
        this.ddaaccountnumber = value;
    }

    /**
     * Gets the value of the enrollmentdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getENROLLMENTDATE() {
        return enrollmentdate;
    }

    /**
     * Sets the value of the enrollmentdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setENROLLMENTDATE(Date value) {
        this.enrollmentdate = value;
    }

    /**
     * Gets the value of the ghostaccountnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGHOSTACCOUNTNUMBER() {
        return ghostaccountnumber;
    }

    /**
     * Sets the value of the ghostaccountnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGHOSTACCOUNTNUMBER(String value) {
        this.ghostaccountnumber = value;
    }

    /**
     * Gets the value of the householdeligibilitytoken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHOUSEHOLDELIGIBILITYTOKEN() {
        return householdeligibilitytoken;
    }

    /**
     * Sets the value of the householdeligibilitytoken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHOUSEHOLDELIGIBILITYTOKEN(String value) {
        this.householdeligibilitytoken = value;
    }

    /**
     * Gets the value of the partnerid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPARTNERID() {
        return partnerid;
    }

    /**
     * Sets the value of the partnerid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPARTNERID(String value) {
        this.partnerid = value;
    }

    /**
     * Gets the value of the primaryaccountswitch property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanYesNo }
     *     
     */
    public BooleanYesNo getPRIMARYACCOUNTSWITCH() {
        return primaryaccountswitch;
    }

    /**
     * Sets the value of the primaryaccountswitch property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanYesNo }
     *     
     */
    public void setPRIMARYACCOUNTSWITCH(BooleanYesNo value) {
        this.primaryaccountswitch = value;
    }

    /**
     * Gets the value of the receivestatements property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanYesNo }
     *     
     */
    public BooleanYesNo getRECEIVESTATEMENTS() {
        return receivestatements;
    }

    /**
     * Sets the value of the receivestatements property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanYesNo }
     *     
     */
    public void setRECEIVESTATEMENTS(BooleanYesNo value) {
        this.receivestatements = value;
    }

    /**
     * Gets the value of the reportingcategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREPORTINGCATEGORY() {
        return reportingcategory;
    }

    /**
     * Sets the value of the reportingcategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREPORTINGCATEGORY(String value) {
        this.reportingcategory = value;
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
     * Gets the value of the userdefined5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSERDEFINED5() {
        return userdefined5;
    }

    /**
     * Sets the value of the userdefined5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSERDEFINED5(String value) {
        this.userdefined5 = value;
    }

    /**
     * Gets the value of the userdefined6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSERDEFINED6() {
        return userdefined6;
    }

    /**
     * Sets the value of the userdefined6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSERDEFINED6(String value) {
        this.userdefined6 = value;
    }

    /**
     * Gets the value of the userdefined7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSERDEFINED7() {
        return userdefined7;
    }

    /**
     * Sets the value of the userdefined7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSERDEFINED7(String value) {
        this.userdefined7 = value;
    }

    /**
     * Gets the value of the userdefined8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSERDEFINED8() {
        return userdefined8;
    }

    /**
     * Sets the value of the userdefined8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSERDEFINED8(String value) {
        this.userdefined8 = value;
    }

}
