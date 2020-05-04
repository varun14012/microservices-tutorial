
package com.mastercard.mcrewards.ws.activity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for authProcessingResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="authProcessingResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="programId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="authRewardsServiceId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="authRewardsServiceType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="responseReasonId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="responseReasonDesc" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "authProcessingResponse", propOrder = {
    "programId",
    "authRewardsServiceId",
    "authRewardsServiceType",
    "responseReasonId",
    "responseReasonDesc"
})
public class AuthProcessingResponse {

    protected long programId;
    protected long authRewardsServiceId;
    @XmlElement(required = true)
    protected String authRewardsServiceType;
    protected long responseReasonId;
    @XmlElement(required = true)
    protected String responseReasonDesc;

    /**
     * Gets the value of the programId property.
     * 
     */
    public long getProgramId() {
        return programId;
    }

    /**
     * Sets the value of the programId property.
     * 
     */
    public void setProgramId(long value) {
        this.programId = value;
    }

    /**
     * Gets the value of the authRewardsServiceId property.
     * 
     */
    public long getAuthRewardsServiceId() {
        return authRewardsServiceId;
    }

    /**
     * Sets the value of the authRewardsServiceId property.
     * 
     */
    public void setAuthRewardsServiceId(long value) {
        this.authRewardsServiceId = value;
    }

    /**
     * Gets the value of the authRewardsServiceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthRewardsServiceType() {
        return authRewardsServiceType;
    }

    /**
     * Sets the value of the authRewardsServiceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthRewardsServiceType(String value) {
        this.authRewardsServiceType = value;
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

}
