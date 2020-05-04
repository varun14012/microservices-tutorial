
package com.mastercard.mcrewards.ws.customer;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pointDetailsBreakdownLevel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="pointDetailsBreakdownLevel"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="totals"/&gt;
 *     &lt;enumeration value="household"/&gt;
 *     &lt;enumeration value="customer"/&gt;
 *     &lt;enumeration value="account"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "pointDetailsBreakdownLevel")
@XmlEnum
public enum PointDetailsBreakdownLevel {

    @XmlEnumValue("totals")
    TOTALS("totals"),
    @XmlEnumValue("household")
    HOUSEHOLD("household"),
    @XmlEnumValue("customer")
    CUSTOMER("customer"),
    @XmlEnumValue("account")
    ACCOUNT("account");
    private final String value;

    PointDetailsBreakdownLevel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PointDetailsBreakdownLevel fromValue(String v) {
        for (PointDetailsBreakdownLevel c: PointDetailsBreakdownLevel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
