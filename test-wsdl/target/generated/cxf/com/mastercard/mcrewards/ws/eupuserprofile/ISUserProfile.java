
package com.mastercard.mcrewards.ws.eupuserprofile;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ISUserProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ISUserProfile"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="aliasId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="userId" type="{http://eupuserprofile.ws.mcrewards.mastercard.com/}nonEmptyString"/&gt;
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="userType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="userStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="prejudiceFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isAgreement" type="{http://eupuserprofile.ws.mcrewards.mastercard.com/}ISAgreement" minOccurs="0"/&gt;
 *         &lt;element name="isAccess" type="{http://eupuserprofile.ws.mcrewards.mastercard.com/}ISAccess" minOccurs="0"/&gt;
 *         &lt;element name="isAddress" type="{http://eupuserprofile.ws.mcrewards.mastercard.com/}ISAddress"/&gt;
 *         &lt;element name="isContact" type="{http://eupuserprofile.ws.mcrewards.mastercard.com/}ISContact"/&gt;
 *         &lt;element name="isJobInfo" type="{http://eupuserprofile.ws.mcrewards.mastercard.com/}ISJobInfo"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ISUserProfile", propOrder = {
    "aliasId",
    "userId",
    "password",
    "userType",
    "userStatus",
    "prejudiceFlag",
    "isAgreement",
    "isAccess",
    "isAddress",
    "isContact",
    "isJobInfo"
})
public class ISUserProfile {

    protected String aliasId;
    @XmlElement(required = true)
    protected String userId;
    protected String password;
    protected String userType;
    protected String userStatus;
    protected String prejudiceFlag;
    protected ISAgreement isAgreement;
    protected ISAccess isAccess;
    @XmlElement(required = true)
    protected ISAddress isAddress;
    @XmlElement(required = true)
    protected ISContact isContact;
    @XmlElement(required = true)
    protected ISJobInfo isJobInfo;

    /**
     * Gets the value of the aliasId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAliasId() {
        return aliasId;
    }

    /**
     * Sets the value of the aliasId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAliasId(String value) {
        this.aliasId = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the userType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserType() {
        return userType;
    }

    /**
     * Sets the value of the userType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserType(String value) {
        this.userType = value;
    }

    /**
     * Gets the value of the userStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserStatus() {
        return userStatus;
    }

    /**
     * Sets the value of the userStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserStatus(String value) {
        this.userStatus = value;
    }

    /**
     * Gets the value of the prejudiceFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrejudiceFlag() {
        return prejudiceFlag;
    }

    /**
     * Sets the value of the prejudiceFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrejudiceFlag(String value) {
        this.prejudiceFlag = value;
    }

    /**
     * Gets the value of the isAgreement property.
     * 
     * @return
     *     possible object is
     *     {@link ISAgreement }
     *     
     */
    public ISAgreement getIsAgreement() {
        return isAgreement;
    }

    /**
     * Sets the value of the isAgreement property.
     * 
     * @param value
     *     allowed object is
     *     {@link ISAgreement }
     *     
     */
    public void setIsAgreement(ISAgreement value) {
        this.isAgreement = value;
    }

    /**
     * Gets the value of the isAccess property.
     * 
     * @return
     *     possible object is
     *     {@link ISAccess }
     *     
     */
    public ISAccess getIsAccess() {
        return isAccess;
    }

    /**
     * Sets the value of the isAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link ISAccess }
     *     
     */
    public void setIsAccess(ISAccess value) {
        this.isAccess = value;
    }

    /**
     * Gets the value of the isAddress property.
     * 
     * @return
     *     possible object is
     *     {@link ISAddress }
     *     
     */
    public ISAddress getIsAddress() {
        return isAddress;
    }

    /**
     * Sets the value of the isAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link ISAddress }
     *     
     */
    public void setIsAddress(ISAddress value) {
        this.isAddress = value;
    }

    /**
     * Gets the value of the isContact property.
     * 
     * @return
     *     possible object is
     *     {@link ISContact }
     *     
     */
    public ISContact getIsContact() {
        return isContact;
    }

    /**
     * Sets the value of the isContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link ISContact }
     *     
     */
    public void setIsContact(ISContact value) {
        this.isContact = value;
    }

    /**
     * Gets the value of the isJobInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ISJobInfo }
     *     
     */
    public ISJobInfo getIsJobInfo() {
        return isJobInfo;
    }

    /**
     * Sets the value of the isJobInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ISJobInfo }
     *     
     */
    public void setIsJobInfo(ISJobInfo value) {
        this.isJobInfo = value;
    }

}
