
package com.mastercard.mcrewards.ws.security;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gaModify complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gaModify"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://security.ws.mcrewards.mastercard.com/}gaRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FormData" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gaModify", propOrder = {
    "formData"
})
public class GaModify
    extends GaRequest
{

    @XmlElement(name = "FormData", required = true)
    protected String formData;

    /**
     * Gets the value of the formData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormData() {
        return formData;
    }

    /**
     * Sets the value of the formData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormData(String value) {
        this.formData = value;
    }

}
