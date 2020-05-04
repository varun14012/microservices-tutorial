
package com.mastercard.mcrewards.ws.security;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.mastercard.mcrewards.ws.eupuserprofile.ISUserProfile;


/**
 * <p>Java class for gaRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gaRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ISUserProfile" type="{http://eupuserprofile.ws.mcrewards.mastercard.com/}ISUserProfile"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gaRequest", propOrder = {
    "isUserProfile"
})
@XmlSeeAlso({
    GaCreate.class,
    GaModify.class,
    GaDelete.class
})
public abstract class GaRequest {

    @XmlElement(name = "ISUserProfile", required = true)
    protected ISUserProfile isUserProfile;

    /**
     * Gets the value of the isUserProfile property.
     * 
     * @return
     *     possible object is
     *     {@link ISUserProfile }
     *     
     */
    public ISUserProfile getISUserProfile() {
        return isUserProfile;
    }

    /**
     * Sets the value of the isUserProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link ISUserProfile }
     *     
     */
    public void setISUserProfile(ISUserProfile value) {
        this.isUserProfile = value;
    }

}
