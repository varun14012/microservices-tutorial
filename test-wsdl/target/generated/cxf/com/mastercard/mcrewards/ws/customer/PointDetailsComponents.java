
package com.mastercard.mcrewards.ws.customer;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pointDetailsComponents.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="pointDetailsComponents"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="currentBalance"/&gt;
 *     &lt;enumeration value="previousBalance"/&gt;
 *     &lt;enumeration value="pointsEarned"/&gt;
 *     &lt;enumeration value="pointsRedeemed"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "pointDetailsComponents")
@XmlEnum
public enum PointDetailsComponents {

    @XmlEnumValue("currentBalance")
    CURRENT_BALANCE("currentBalance"),
    @XmlEnumValue("previousBalance")
    PREVIOUS_BALANCE("previousBalance"),
    @XmlEnumValue("pointsEarned")
    POINTS_EARNED("pointsEarned"),
    @XmlEnumValue("pointsRedeemed")
    POINTS_REDEEMED("pointsRedeemed");
    private final String value;

    PointDetailsComponents(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PointDetailsComponents fromValue(String v) {
        for (PointDetailsComponents c: PointDetailsComponents.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
