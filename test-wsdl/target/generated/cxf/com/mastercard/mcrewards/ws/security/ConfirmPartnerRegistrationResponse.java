
package com.mastercard.mcrewards.ws.security;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.mastercard.mcrewards.ws.common.SuccessResp;


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
 *         &lt;element name="confirmPartnerRegistrationResult" type="{http://common.ws.mcrewards.mastercard.com/}SuccessResp" minOccurs="0"/&gt;
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
    "confirmPartnerRegistrationResult"
})
@XmlRootElement(name = "confirmPartnerRegistrationResponse")
public class ConfirmPartnerRegistrationResponse {

    protected SuccessResp confirmPartnerRegistrationResult;

    /**
     * Gets the value of the confirmPartnerRegistrationResult property.
     * 
     * @return
     *     possible object is
     *     {@link SuccessResp }
     *     
     */
    public SuccessResp getConfirmPartnerRegistrationResult() {
        return confirmPartnerRegistrationResult;
    }

    /**
     * Sets the value of the confirmPartnerRegistrationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SuccessResp }
     *     
     */
    public void setConfirmPartnerRegistrationResult(SuccessResp value) {
        this.confirmPartnerRegistrationResult = value;
    }

}
