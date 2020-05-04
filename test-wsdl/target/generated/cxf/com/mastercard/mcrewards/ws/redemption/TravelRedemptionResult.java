
package com.mastercard.mcrewards.ws.redemption;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TravelRedemptionResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravelRedemptionResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="redemptionComponent" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="redemptionId" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="redemptionFeeAmt" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelRedemptionResult", propOrder = {
    "redemptionComponent",
    "redemptionId",
    "redemptionFeeAmt"
})
public class TravelRedemptionResult {

    @XmlElement(required = true)
    protected String redemptionComponent;
    @XmlElement(required = true)
    protected BigDecimal redemptionId;
    @XmlElement(required = true)
    protected BigDecimal redemptionFeeAmt;

    /**
     * Gets the value of the redemptionComponent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedemptionComponent() {
        return redemptionComponent;
    }

    /**
     * Sets the value of the redemptionComponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedemptionComponent(String value) {
        this.redemptionComponent = value;
    }

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
     * Gets the value of the redemptionFeeAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRedemptionFeeAmt() {
        return redemptionFeeAmt;
    }

    /**
     * Sets the value of the redemptionFeeAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRedemptionFeeAmt(BigDecimal value) {
        this.redemptionFeeAmt = value;
    }

}
