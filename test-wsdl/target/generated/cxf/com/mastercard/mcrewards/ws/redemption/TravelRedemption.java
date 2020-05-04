
package com.mastercard.mcrewards.ws.redemption;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TravelRedemption complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravelRedemption"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="redemptionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="referenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="redemptionComponent" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="conversionFactor" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="minThreshold" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="pointIncrement" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="pointsRedeemed" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="itemCount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="cashPaid" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="fees" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="componentTotalCashValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelRedemption", propOrder = {
    "redemptionDescription",
    "referenceNumber",
    "redemptionComponent",
    "conversionFactor",
    "minThreshold",
    "pointIncrement",
    "pointsRedeemed",
    "itemCount",
    "cashPaid",
    "fees",
    "componentTotalCashValue"
})
public class TravelRedemption {

    protected String redemptionDescription;
    protected String referenceNumber;
    @XmlElement(required = true)
    protected String redemptionComponent;
    @XmlElement(required = true)
    protected BigDecimal conversionFactor;
    @XmlElement(required = true)
    protected BigDecimal minThreshold;
    @XmlElement(required = true)
    protected BigDecimal pointIncrement;
    @XmlElement(required = true)
    protected BigDecimal pointsRedeemed;
    protected long itemCount;
    @XmlElement(required = true)
    protected BigDecimal cashPaid;
    @XmlElement(required = true)
    protected BigDecimal fees;
    @XmlElement(required = true)
    protected BigDecimal componentTotalCashValue;

    /**
     * Gets the value of the redemptionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedemptionDescription() {
        return redemptionDescription;
    }

    /**
     * Sets the value of the redemptionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedemptionDescription(String value) {
        this.redemptionDescription = value;
    }

    /**
     * Gets the value of the referenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceNumber() {
        return referenceNumber;
    }

    /**
     * Sets the value of the referenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceNumber(String value) {
        this.referenceNumber = value;
    }

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
     * Gets the value of the conversionFactor property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getConversionFactor() {
        return conversionFactor;
    }

    /**
     * Sets the value of the conversionFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setConversionFactor(BigDecimal value) {
        this.conversionFactor = value;
    }

    /**
     * Gets the value of the minThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinThreshold() {
        return minThreshold;
    }

    /**
     * Sets the value of the minThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinThreshold(BigDecimal value) {
        this.minThreshold = value;
    }

    /**
     * Gets the value of the pointIncrement property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPointIncrement() {
        return pointIncrement;
    }

    /**
     * Sets the value of the pointIncrement property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPointIncrement(BigDecimal value) {
        this.pointIncrement = value;
    }

    /**
     * Gets the value of the pointsRedeemed property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPointsRedeemed() {
        return pointsRedeemed;
    }

    /**
     * Sets the value of the pointsRedeemed property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPointsRedeemed(BigDecimal value) {
        this.pointsRedeemed = value;
    }

    /**
     * Gets the value of the itemCount property.
     * 
     */
    public long getItemCount() {
        return itemCount;
    }

    /**
     * Sets the value of the itemCount property.
     * 
     */
    public void setItemCount(long value) {
        this.itemCount = value;
    }

    /**
     * Gets the value of the cashPaid property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCashPaid() {
        return cashPaid;
    }

    /**
     * Sets the value of the cashPaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCashPaid(BigDecimal value) {
        this.cashPaid = value;
    }

    /**
     * Gets the value of the fees property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFees() {
        return fees;
    }

    /**
     * Sets the value of the fees property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFees(BigDecimal value) {
        this.fees = value;
    }

    /**
     * Gets the value of the componentTotalCashValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getComponentTotalCashValue() {
        return componentTotalCashValue;
    }

    /**
     * Sets the value of the componentTotalCashValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setComponentTotalCashValue(BigDecimal value) {
        this.componentTotalCashValue = value;
    }

}
