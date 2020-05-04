
package com.mastercard.mcrewards.ws.security;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for firstRegisteredLdapId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="firstRegisteredLdapId"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ldapId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fsso" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "firstRegisteredLdapId", propOrder = {
    "ldapId",
    "fsso"
})
public class FirstRegisteredLdapId {

    @XmlElement(required = true)
    protected String ldapId;
    protected boolean fsso;

    /**
     * Gets the value of the ldapId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLdapId() {
        return ldapId;
    }

    /**
     * Sets the value of the ldapId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLdapId(String value) {
        this.ldapId = value;
    }

    /**
     * Gets the value of the fsso property.
     * 
     */
    public boolean isFsso() {
        return fsso;
    }

    /**
     * Sets the value of the fsso property.
     * 
     */
    public void setFsso(boolean value) {
        this.fsso = value;
    }

}
