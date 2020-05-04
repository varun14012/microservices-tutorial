
package com.mastercard.mcrewards.ws.adjustment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for adjustmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="adjustmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="adjustmentTypeCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="adjustmentTypeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "adjustmentType", propOrder = {
    "adjustmentTypeCode",
    "adjustmentTypeDescription"
})
public class AdjustmentType {

    protected Long adjustmentTypeCode;
    protected String adjustmentTypeDescription;

    /**
     * Gets the value of the adjustmentTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAdjustmentTypeCode() {
        return adjustmentTypeCode;
    }

    /**
     * Sets the value of the adjustmentTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAdjustmentTypeCode(Long value) {
        this.adjustmentTypeCode = value;
    }

    /**
     * Gets the value of the adjustmentTypeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdjustmentTypeDescription() {
        return adjustmentTypeDescription;
    }

    /**
     * Sets the value of the adjustmentTypeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdjustmentTypeDescription(String value) {
        this.adjustmentTypeDescription = value;
    }

}
