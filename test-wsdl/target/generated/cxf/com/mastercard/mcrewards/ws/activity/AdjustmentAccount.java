
package com.mastercard.mcrewards.ws.activity;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdjustmentAccount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdjustmentAccount"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://activity.ws.mcrewards.mastercard.com/}Account"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="adjustments" type="{http://activity.ws.mcrewards.mastercard.com/}Adjustment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdjustmentAccount", propOrder = {
    "adjustments"
})
public class AdjustmentAccount
    extends Account
{

    protected List<Adjustment> adjustments;

    /**
     * Gets the value of the adjustments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adjustments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdjustments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Adjustment }
     * 
     * 
     */
    public List<Adjustment> getAdjustments() {
        if (adjustments == null) {
            adjustments = new ArrayList<Adjustment>();
        }
        return this.adjustments;
    }

}
