
package com.mastercard.mcrewards.ws.redemption;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="mrsRedemptionId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="redemptionReference" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "mrsRedemptionId",
    "redemptionReference"
})
@XmlRootElement(name = "applyStatementOfCreditResponse")
public class ApplyStatementOfCreditResponse {

    protected Long mrsRedemptionId;
    @XmlElement(required = true)
    protected String redemptionReference;

    /**
     * Gets the value of the mrsRedemptionId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMrsRedemptionId() {
        return mrsRedemptionId;
    }

    /**
     * Sets the value of the mrsRedemptionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMrsRedemptionId(Long value) {
        this.mrsRedemptionId = value;
    }

    /**
     * Gets the value of the redemptionReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedemptionReference() {
        return redemptionReference;
    }

    /**
     * Sets the value of the redemptionReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedemptionReference(String value) {
        this.redemptionReference = value;
    }

}
