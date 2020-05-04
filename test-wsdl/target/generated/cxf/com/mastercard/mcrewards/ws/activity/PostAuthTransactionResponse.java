
package com.mastercard.mcrewards.ws.activity;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="authProcessingResponse" type="{http://activity.ws.mcrewards.mastercard.com/}authProcessingResponse" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "authProcessingResponse"
})
@XmlRootElement(name = "postAuthTransactionResponse")
public class PostAuthTransactionResponse {

    protected List<AuthProcessingResponse> authProcessingResponse;

    /**
     * Gets the value of the authProcessingResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authProcessingResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthProcessingResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AuthProcessingResponse }
     * 
     * 
     */
    public List<AuthProcessingResponse> getAuthProcessingResponse() {
        if (authProcessingResponse == null) {
            authProcessingResponse = new ArrayList<AuthProcessingResponse>();
        }
        return this.authProcessingResponse;
    }

}
