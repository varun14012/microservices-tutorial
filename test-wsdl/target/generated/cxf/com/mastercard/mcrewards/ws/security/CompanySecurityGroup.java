
package com.mastercard.mcrewards.ws.security;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompanySecurityGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompanySecurityGroup"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="groupID" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/&gt;
 *         &lt;element name="groupDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompanySecurityGroup", propOrder = {
    "groupID",
    "groupDesc"
})
public class CompanySecurityGroup {

    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger groupID;
    protected String groupDesc;

    /**
     * Gets the value of the groupID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGroupID() {
        return groupID;
    }

    /**
     * Sets the value of the groupID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGroupID(BigInteger value) {
        this.groupID = value;
    }

    /**
     * Gets the value of the groupDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupDesc() {
        return groupDesc;
    }

    /**
     * Sets the value of the groupDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupDesc(String value) {
        this.groupDesc = value;
    }

}
