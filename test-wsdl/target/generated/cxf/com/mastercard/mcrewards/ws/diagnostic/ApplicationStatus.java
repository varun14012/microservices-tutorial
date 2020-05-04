
package com.mastercard.mcrewards.ws.diagnostic;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ApplicationStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApplicationStatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SAMLAttributes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DatabaseLink" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MerchantTerminal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplicationStatus", propOrder = {
    "samlAttributes",
    "databaseLink",
    "merchantTerminal"
})
public class ApplicationStatus
    implements Serializable
{

    @XmlElement(name = "SAMLAttributes")
    protected String samlAttributes;
    @XmlElement(name = "DatabaseLink")
    protected String databaseLink;
    @XmlElement(name = "MerchantTerminal")
    protected String merchantTerminal;

    /**
     * Gets the value of the samlAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAMLAttributes() {
        return samlAttributes;
    }

    /**
     * Sets the value of the samlAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAMLAttributes(String value) {
        this.samlAttributes = value;
    }

    /**
     * Gets the value of the databaseLink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatabaseLink() {
        return databaseLink;
    }

    /**
     * Sets the value of the databaseLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatabaseLink(String value) {
        this.databaseLink = value;
    }

    /**
     * Gets the value of the merchantTerminal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantTerminal() {
        return merchantTerminal;
    }

    /**
     * Sets the value of the merchantTerminal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantTerminal(String value) {
        this.merchantTerminal = value;
    }

}
