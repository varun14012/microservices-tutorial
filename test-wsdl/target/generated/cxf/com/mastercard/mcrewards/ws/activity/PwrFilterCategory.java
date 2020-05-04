
package com.mastercard.mcrewards.ws.activity;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PwrFilterCategory.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PwrFilterCategory"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="R"/&gt;
 *     &lt;enumeration value="E"/&gt;
 *     &lt;enumeration value="I"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PwrFilterCategory")
@XmlEnum
public enum PwrFilterCategory {

    R,
    E,
    I;

    public String value() {
        return name();
    }

    public static PwrFilterCategory fromValue(String v) {
        return valueOf(v);
    }

}
