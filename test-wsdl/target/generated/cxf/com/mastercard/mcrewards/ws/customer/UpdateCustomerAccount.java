
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
 * <p>Java class for UpdateCustomerAccount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateCustomerAccount"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ACCOUNT_STATUS_ID" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="ACCRUE_POINTS_SW" type="{http://common.ws.mcrewards.mastercard.com/}BooleanYesNo" minOccurs="0"/&gt;
 *         &lt;element name="ACCT_OPN_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ALT_FUNDING_BANK_ACCOUNT_NUM" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="30"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ALT_FUNDING_EXPIR_DT_TXT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="6"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DEMND_DEPST_ACCT_NUM" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="19"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ENROLLMENT_DATE" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="GHOST_ACCOUNT_NUM" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="19"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HH_ELIGIBILITY_CODE" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="140"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LIABILITY_BANK_ACCOUNT_NUM" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="30"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LIABILITY_EXPIR_DT_TXT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="6"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PRIMARY_ACCOUNT_SW" type="{http://common.ws.mcrewards.mastercard.com/}BooleanYesNo" minOccurs="0"/&gt;
 *         &lt;element name="PROGRAM_IDENTIFIER" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PRTNR_ID" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RECEIVE_STATEMENTS_SW" type="{http://common.ws.mcrewards.mastercard.com/}BooleanYesNo" minOccurs="0"/&gt;
 *         &lt;element name="REDEMPTION_ACCOUNT_STATUS_ID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="REDEMPTION_BANK_ACCOUNT_NUM" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="30"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="REDEMPTION_EXPIR_DT_TXT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="6"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RPT_CAT_TXT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="USER_DEFINED1" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="USER_DEFINED2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="USER_DEFINED3" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="USER_DEFINED4" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="USER_DEFINED5" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="USER_DEFINED6" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="USER_DEFINED7" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="USER_DEFINED8" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
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
@XmlType(name = "UpdateCustomerAccount", propOrder = {
    "accountstatusid",
    "accruepointssw",
    "acctopndt",
    "altfundingbankaccountnum",
    "altfundingexpirdttxt",
    "demnddepstacctnum",
    "enrollmentdate",
    "ghostaccountnum",
    "hheligibilitycode",
    "liabilitybankaccountnum",
    "liabilityexpirdttxt",
    "primaryaccountsw",
    "programidentifier",
    "prtnrid",
    "receivestatementssw",
    "redemptionaccountstatusid",
    "redemptionbankaccountnum",
    "redemptionexpirdttxt",
    "rptcattxt",
    "userdefined1",
    "userdefined2",
    "userdefined3",
    "userdefined4",
    "userdefined5",
    "userdefined6",
    "userdefined7",
    "userdefined8"
})
public class UpdateCustomerAccount
    implements Serializable
{

    @XmlElement(name = "ACCOUNT_STATUS_ID")
    protected Short accountstatusid;
    @XmlElement(name = "ACCRUE_POINTS_SW")
    @XmlSchemaType(name = "string")
    protected BooleanYesNo accruepointssw;
    @XmlElement(name = "ACCT_OPN_DT", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date acctopndt;
    @XmlElement(name = "ALT_FUNDING_BANK_ACCOUNT_NUM")
    protected String altfundingbankaccountnum;
    @XmlElement(name = "ALT_FUNDING_EXPIR_DT_TXT")
    protected String altfundingexpirdttxt;
    @XmlElement(name = "DEMND_DEPST_ACCT_NUM")
    protected String demnddepstacctnum;
    @XmlElement(name = "ENROLLMENT_DATE", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date enrollmentdate;
    @XmlElement(name = "GHOST_ACCOUNT_NUM")
    protected String ghostaccountnum;
    @XmlElement(name = "HH_ELIGIBILITY_CODE")
    protected String hheligibilitycode;
    @XmlElement(name = "LIABILITY_BANK_ACCOUNT_NUM")
    protected String liabilitybankaccountnum;
    @XmlElement(name = "LIABILITY_EXPIR_DT_TXT")
    protected String liabilityexpirdttxt;
    @XmlElement(name = "PRIMARY_ACCOUNT_SW")
    @XmlSchemaType(name = "string")
    protected BooleanYesNo primaryaccountsw;
    @XmlElement(name = "PROGRAM_IDENTIFIER")
    protected String programidentifier;
    @XmlElement(name = "PRTNR_ID")
    protected String prtnrid;
    @XmlElement(name = "RECEIVE_STATEMENTS_SW")
    @XmlSchemaType(name = "string")
    protected BooleanYesNo receivestatementssw;
    @XmlElement(name = "REDEMPTION_ACCOUNT_STATUS_ID")
    protected Long redemptionaccountstatusid;
    @XmlElement(name = "REDEMPTION_BANK_ACCOUNT_NUM")
    protected String redemptionbankaccountnum;
    @XmlElement(name = "REDEMPTION_EXPIR_DT_TXT")
    protected String redemptionexpirdttxt;
    @XmlElement(name = "RPT_CAT_TXT")
    protected String rptcattxt;
    @XmlElement(name = "USER_DEFINED1")
    protected String userdefined1;
    @XmlElement(name = "USER_DEFINED2")
    protected String userdefined2;
    @XmlElement(name = "USER_DEFINED3")
    protected String userdefined3;
    @XmlElement(name = "USER_DEFINED4")
    protected String userdefined4;
    @XmlElement(name = "USER_DEFINED5")
    protected String userdefined5;
    @XmlElement(name = "USER_DEFINED6")
    protected String userdefined6;
    @XmlElement(name = "USER_DEFINED7")
    protected String userdefined7;
    @XmlElement(name = "USER_DEFINED8")
    protected String userdefined8;

    /**
     * Gets the value of the accountstatusid property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getACCOUNTSTATUSID() {
        return accountstatusid;
    }

    /**
     * Sets the value of the accountstatusid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setACCOUNTSTATUSID(Short value) {
        this.accountstatusid = value;
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
     * Gets the value of the acctopndt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getACCTOPNDT() {
        return acctopndt;
    }

    /**
     * Sets the value of the acctopndt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCTOPNDT(Date value) {
        this.acctopndt = value;
    }

    /**
     * Gets the value of the altfundingbankaccountnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getALTFUNDINGBANKACCOUNTNUM() {
        return altfundingbankaccountnum;
    }

    /**
     * Sets the value of the altfundingbankaccountnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setALTFUNDINGBANKACCOUNTNUM(String value) {
        this.altfundingbankaccountnum = value;
    }

    /**
     * Gets the value of the altfundingexpirdttxt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getALTFUNDINGEXPIRDTTXT() {
        return altfundingexpirdttxt;
    }

    /**
     * Sets the value of the altfundingexpirdttxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setALTFUNDINGEXPIRDTTXT(String value) {
        this.altfundingexpirdttxt = value;
    }

    /**
     * Gets the value of the demnddepstacctnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEMNDDEPSTACCTNUM() {
        return demnddepstacctnum;
    }

    /**
     * Sets the value of the demnddepstacctnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEMNDDEPSTACCTNUM(String value) {
        this.demnddepstacctnum = value;
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
     * Gets the value of the ghostaccountnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGHOSTACCOUNTNUM() {
        return ghostaccountnum;
    }

    /**
     * Sets the value of the ghostaccountnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGHOSTACCOUNTNUM(String value) {
        this.ghostaccountnum = value;
    }

    /**
     * Gets the value of the hheligibilitycode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHHELIGIBILITYCODE() {
        return hheligibilitycode;
    }

    /**
     * Sets the value of the hheligibilitycode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHHELIGIBILITYCODE(String value) {
        this.hheligibilitycode = value;
    }

    /**
     * Gets the value of the liabilitybankaccountnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLIABILITYBANKACCOUNTNUM() {
        return liabilitybankaccountnum;
    }

    /**
     * Sets the value of the liabilitybankaccountnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLIABILITYBANKACCOUNTNUM(String value) {
        this.liabilitybankaccountnum = value;
    }

    /**
     * Gets the value of the liabilityexpirdttxt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLIABILITYEXPIRDTTXT() {
        return liabilityexpirdttxt;
    }

    /**
     * Sets the value of the liabilityexpirdttxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLIABILITYEXPIRDTTXT(String value) {
        this.liabilityexpirdttxt = value;
    }

    /**
     * Gets the value of the primaryaccountsw property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanYesNo }
     *     
     */
    public BooleanYesNo getPRIMARYACCOUNTSW() {
        return primaryaccountsw;
    }

    /**
     * Sets the value of the primaryaccountsw property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanYesNo }
     *     
     */
    public void setPRIMARYACCOUNTSW(BooleanYesNo value) {
        this.primaryaccountsw = value;
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
     * Gets the value of the prtnrid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRTNRID() {
        return prtnrid;
    }

    /**
     * Sets the value of the prtnrid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRTNRID(String value) {
        this.prtnrid = value;
    }

    /**
     * Gets the value of the receivestatementssw property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanYesNo }
     *     
     */
    public BooleanYesNo getRECEIVESTATEMENTSSW() {
        return receivestatementssw;
    }

    /**
     * Sets the value of the receivestatementssw property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanYesNo }
     *     
     */
    public void setRECEIVESTATEMENTSSW(BooleanYesNo value) {
        this.receivestatementssw = value;
    }

    /**
     * Gets the value of the redemptionaccountstatusid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getREDEMPTIONACCOUNTSTATUSID() {
        return redemptionaccountstatusid;
    }

    /**
     * Sets the value of the redemptionaccountstatusid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setREDEMPTIONACCOUNTSTATUSID(Long value) {
        this.redemptionaccountstatusid = value;
    }

    /**
     * Gets the value of the redemptionbankaccountnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREDEMPTIONBANKACCOUNTNUM() {
        return redemptionbankaccountnum;
    }

    /**
     * Sets the value of the redemptionbankaccountnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREDEMPTIONBANKACCOUNTNUM(String value) {
        this.redemptionbankaccountnum = value;
    }

    /**
     * Gets the value of the redemptionexpirdttxt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREDEMPTIONEXPIRDTTXT() {
        return redemptionexpirdttxt;
    }

    /**
     * Sets the value of the redemptionexpirdttxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREDEMPTIONEXPIRDTTXT(String value) {
        this.redemptionexpirdttxt = value;
    }

    /**
     * Gets the value of the rptcattxt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRPTCATTXT() {
        return rptcattxt;
    }

    /**
     * Sets the value of the rptcattxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRPTCATTXT(String value) {
        this.rptcattxt = value;
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
