
package com.mastercard.mcrewards.ws.diagnostic;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CurrentVersion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CurrentVersion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pomVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="buildDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="svnRevisionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="localIp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrentVersion", propOrder = {
    "pomVersion",
    "buildDate",
    "svnRevisionNumber",
    "localIp"
})
public class CurrentVersion
    implements Serializable
{

    protected String pomVersion;
    protected String buildDate;
    protected String svnRevisionNumber;
    protected String localIp;

    /**
     * Gets the value of the pomVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPomVersion() {
        return pomVersion;
    }

    /**
     * Sets the value of the pomVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPomVersion(String value) {
        this.pomVersion = value;
    }

    /**
     * Gets the value of the buildDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuildDate() {
        return buildDate;
    }

    /**
     * Sets the value of the buildDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuildDate(String value) {
        this.buildDate = value;
    }

    /**
     * Gets the value of the svnRevisionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvnRevisionNumber() {
        return svnRevisionNumber;
    }

    /**
     * Sets the value of the svnRevisionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvnRevisionNumber(String value) {
        this.svnRevisionNumber = value;
    }

    /**
     * Gets the value of the localIp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalIp() {
        return localIp;
    }

    /**
     * Sets the value of the localIp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalIp(String value) {
        this.localIp = value;
    }

}
