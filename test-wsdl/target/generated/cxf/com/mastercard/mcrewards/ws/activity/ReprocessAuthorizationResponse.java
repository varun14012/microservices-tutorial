
package com.mastercard.mcrewards.ws.activity;

import java.math.BigDecimal;
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
 *         &lt;element name="authResponseLogId" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="authResponseCode" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="reprocessedAuthResponseLogId" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="reprocessedAuthResponseCode" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
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
    "authResponseLogId",
    "authResponseCode",
    "reprocessedAuthResponseLogId",
    "reprocessedAuthResponseCode"
})
@XmlRootElement(name = "reprocessAuthorizationResponse")
public class ReprocessAuthorizationResponse {

    @XmlElement(required = true)
    protected BigDecimal authResponseLogId;
    @XmlElement(required = true)
    protected BigDecimal authResponseCode;
    @XmlElement(required = true)
    protected BigDecimal reprocessedAuthResponseLogId;
    @XmlElement(required = true)
    protected BigDecimal reprocessedAuthResponseCode;

    /**
     * Gets the value of the authResponseLogId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAuthResponseLogId() {
        return authResponseLogId;
    }

    /**
     * Sets the value of the authResponseLogId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAuthResponseLogId(BigDecimal value) {
        this.authResponseLogId = value;
    }

    /**
     * Gets the value of the authResponseCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAuthResponseCode() {
        return authResponseCode;
    }

    /**
     * Sets the value of the authResponseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAuthResponseCode(BigDecimal value) {
        this.authResponseCode = value;
    }

    /**
     * Gets the value of the reprocessedAuthResponseLogId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReprocessedAuthResponseLogId() {
        return reprocessedAuthResponseLogId;
    }

    /**
     * Sets the value of the reprocessedAuthResponseLogId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReprocessedAuthResponseLogId(BigDecimal value) {
        this.reprocessedAuthResponseLogId = value;
    }

    /**
     * Gets the value of the reprocessedAuthResponseCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReprocessedAuthResponseCode() {
        return reprocessedAuthResponseCode;
    }

    /**
     * Sets the value of the reprocessedAuthResponseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReprocessedAuthResponseCode(BigDecimal value) {
        this.reprocessedAuthResponseCode = value;
    }

}
