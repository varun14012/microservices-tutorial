
package com.mastercard.mcrewards.ws.adjustment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for adjustmentClass complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="adjustmentClass"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="adjustmentClassCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="adjustmentClassDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "adjustmentClass", propOrder = {
    "adjustmentClassCode",
    "adjustmentClassDescription"
})
public class AdjustmentClass {

    protected String adjustmentClassCode;
    protected String adjustmentClassDescription;

    /**
     * Gets the value of the adjustmentClassCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdjustmentClassCode() {
        return adjustmentClassCode;
    }

    /**
     * Sets the value of the adjustmentClassCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdjustmentClassCode(String value) {
        this.adjustmentClassCode = value;
    }

    /**
     * Gets the value of the adjustmentClassDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdjustmentClassDescription() {
        return adjustmentClassDescription;
    }

    /**
     * Sets the value of the adjustmentClassDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdjustmentClassDescription(String value) {
        this.adjustmentClassDescription = value;
    }

}
