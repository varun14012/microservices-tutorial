
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
 *         &lt;element name="confirmJitRegistrationResult" type="{http://common.ws.mcrewards.mastercard.com/}SuccessResp" minOccurs="0"/&gt;
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
    "confirmJitRegistrationResult"
})
@XmlRootElement(name = "confirmJitRegistrationResponse")
public class ConfirmJitRegistrationResponse {

    protected SuccessResp confirmJitRegistrationResult;

    /**
     * Gets the value of the confirmJitRegistrationResult property.
     * 
     * @return
     *     possible object is
     *     {@link SuccessResp }
     *     
     */
    public SuccessResp getConfirmJitRegistrationResult() {
        return confirmJitRegistrationResult;
    }

    /**
     * Sets the value of the confirmJitRegistrationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SuccessResp }
     *     
     */
    public void setConfirmJitRegistrationResult(SuccessResp value) {
        this.confirmJitRegistrationResult = value;
    }

}
