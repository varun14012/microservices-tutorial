
package com.mastercard.mcrewards.ws.activity;

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
 *         &lt;element name="queueAuthTransactionResult" type="{http://common.ws.mcrewards.mastercard.com/}SuccessResp" minOccurs="0"/&gt;
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "queueAuthTransactionResult",
    "message"
})
@XmlRootElement(name = "queueAuthTransactionResponse")
public class QueueAuthTransactionResponse {

    protected SuccessResp queueAuthTransactionResult;
    protected String message;

    /**
     * Gets the value of the queueAuthTransactionResult property.
     * 
     * @return
     *     possible object is
     *     {@link SuccessResp }
     *     
     */
    public SuccessResp getQueueAuthTransactionResult() {
        return queueAuthTransactionResult;
    }

    /**
     * Sets the value of the queueAuthTransactionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SuccessResp }
     *     
     */
    public void setQueueAuthTransactionResult(SuccessResp value) {
        this.queueAuthTransactionResult = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

}
