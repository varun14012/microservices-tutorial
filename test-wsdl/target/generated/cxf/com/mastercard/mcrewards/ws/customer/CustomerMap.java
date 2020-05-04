
package com.mastercard.mcrewards.ws.customer;

import java.io.Serializable;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter1;


/**
 * <p>Java class for CustomerMap complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerMap"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mapTypeGroupCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mapTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mapTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mapId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mapStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mapEnrollDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="mapExpirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="mapUserDefined1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mapUserDefined2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mapUserDefined3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mapUserDefined4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mapUserDefined5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerMap", propOrder = {
    "mapTypeGroupCode",
    "mapTypeCode",
    "mapTypeName",
    "mapId",
    "mapStatus",
    "mapEnrollDate",
    "mapExpirationDate",
    "mapUserDefined1",
    "mapUserDefined2",
    "mapUserDefined3",
    "mapUserDefined4",
    "mapUserDefined5"
})
public class CustomerMap
    implements Serializable
{

    protected String mapTypeGroupCode;
    protected String mapTypeCode;
    protected String mapTypeName;
    protected String mapId;
    protected String mapStatus;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date mapEnrollDate;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date mapExpirationDate;
    protected String mapUserDefined1;
    protected String mapUserDefined2;
    protected String mapUserDefined3;
    protected String mapUserDefined4;
    protected String mapUserDefined5;

    /**
     * Gets the value of the mapTypeGroupCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMapTypeGroupCode() {
        return mapTypeGroupCode;
    }

    /**
     * Sets the value of the mapTypeGroupCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMapTypeGroupCode(String value) {
        this.mapTypeGroupCode = value;
    }

    /**
     * Gets the value of the mapTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMapTypeCode() {
        return mapTypeCode;
    }

    /**
     * Sets the value of the mapTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMapTypeCode(String value) {
        this.mapTypeCode = value;
    }

    /**
     * Gets the value of the mapTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMapTypeName() {
        return mapTypeName;
    }

    /**
     * Sets the value of the mapTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMapTypeName(String value) {
        this.mapTypeName = value;
    }

    /**
     * Gets the value of the mapId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMapId() {
        return mapId;
    }

    /**
     * Sets the value of the mapId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMapId(String value) {
        this.mapId = value;
    }

    /**
     * Gets the value of the mapStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMapStatus() {
        return mapStatus;
    }

    /**
     * Sets the value of the mapStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMapStatus(String value) {
        this.mapStatus = value;
    }

    /**
     * Gets the value of the mapEnrollDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getMapEnrollDate() {
        return mapEnrollDate;
    }

    /**
     * Sets the value of the mapEnrollDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMapEnrollDate(Date value) {
        this.mapEnrollDate = value;
    }

    /**
     * Gets the value of the mapExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getMapExpirationDate() {
        return mapExpirationDate;
    }

    /**
     * Sets the value of the mapExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMapExpirationDate(Date value) {
        this.mapExpirationDate = value;
    }

    /**
     * Gets the value of the mapUserDefined1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMapUserDefined1() {
        return mapUserDefined1;
    }

    /**
     * Sets the value of the mapUserDefined1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMapUserDefined1(String value) {
        this.mapUserDefined1 = value;
    }

    /**
     * Gets the value of the mapUserDefined2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMapUserDefined2() {
        return mapUserDefined2;
    }

    /**
     * Sets the value of the mapUserDefined2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMapUserDefined2(String value) {
        this.mapUserDefined2 = value;
    }

    /**
     * Gets the value of the mapUserDefined3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMapUserDefined3() {
        return mapUserDefined3;
    }

    /**
     * Sets the value of the mapUserDefined3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMapUserDefined3(String value) {
        this.mapUserDefined3 = value;
    }

    /**
     * Gets the value of the mapUserDefined4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMapUserDefined4() {
        return mapUserDefined4;
    }

    /**
     * Sets the value of the mapUserDefined4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMapUserDefined4(String value) {
        this.mapUserDefined4 = value;
    }

    /**
     * Gets the value of the mapUserDefined5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMapUserDefined5() {
        return mapUserDefined5;
    }

    /**
     * Sets the value of the mapUserDefined5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMapUserDefined5(String value) {
        this.mapUserDefined5 = value;
    }

}
