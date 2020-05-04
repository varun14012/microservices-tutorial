
package com.mastercard.mcrewards.ws.customer;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter2;


/**
 * <p>Java class for getPointDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getPointDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fromDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="toDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="components" type="{http://customer.ws.mcrewards.mastercard.com/}pointDetailsComponents" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="breakdownLevel" type="{http://customer.ws.mcrewards.mastercard.com/}pointDetailsBreakdownLevel" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPointDetails", propOrder = {
    "fromDate",
    "toDate",
    "components",
    "breakdownLevel"
})
public class GetPointDetails
    implements Serializable
{

    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "date")
    protected Date fromDate;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "date")
    protected Date toDate;
    @XmlElement(defaultValue = "currentBalance")
    @XmlSchemaType(name = "string")
    protected List<PointDetailsComponents> components;
    @XmlSchemaType(name = "string")
    protected PointDetailsBreakdownLevel breakdownLevel;

    /**
     * Gets the value of the fromDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getFromDate() {
        return fromDate;
    }

    /**
     * Sets the value of the fromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromDate(Date value) {
        this.fromDate = value;
    }

    /**
     * Gets the value of the toDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getToDate() {
        return toDate;
    }

    /**
     * Sets the value of the toDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToDate(Date value) {
        this.toDate = value;
    }

    /**
     * Gets the value of the components property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the components property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComponents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PointDetailsComponents }
     * 
     * 
     */
    public List<PointDetailsComponents> getComponents() {
        if (components == null) {
            components = new ArrayList<PointDetailsComponents>();
        }
        return this.components;
    }

    /**
     * Gets the value of the breakdownLevel property.
     * 
     * @return
     *     possible object is
     *     {@link PointDetailsBreakdownLevel }
     *     
     */
    public PointDetailsBreakdownLevel getBreakdownLevel() {
        return breakdownLevel;
    }

    /**
     * Sets the value of the breakdownLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointDetailsBreakdownLevel }
     *     
     */
    public void setBreakdownLevel(PointDetailsBreakdownLevel value) {
        this.breakdownLevel = value;
    }

}
