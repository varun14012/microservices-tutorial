
package com.mastercard.mcrewards.ws.redemption;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="redemptionId" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="totalPointsCredited" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="creditRedemptionId" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditResult", propOrder = {
    "redemptionId",
    "totalPointsCredited",
    "creditRedemptionId"
})
public class CreditResult {

    protected BigDecimal redemptionId;
    protected BigDecimal totalPointsCredited;
    protected BigDecimal creditRedemptionId;

    /**
     * Gets the value of the redemptionId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRedemptionId() {
        return redemptionId;
    }

    /**
     * Sets the value of the redemptionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRedemptionId(BigDecimal value) {
        this.redemptionId = value;
    }

    /**
     * Gets the value of the totalPointsCredited property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalPointsCredited() {
        return totalPointsCredited;
    }

    /**
     * Sets the value of the totalPointsCredited property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalPointsCredited(BigDecimal value) {
        this.totalPointsCredited = value;
    }

    /**
     * Gets the value of the creditRedemptionId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCreditRedemptionId() {
        return creditRedemptionId;
    }

    /**
     * Sets the value of the creditRedemptionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCreditRedemptionId(BigDecimal value) {
        this.creditRedemptionId = value;
    }

}
