
package com.mastercard.mcrewards.ws.activity;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MappingActionCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MappingActionCode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="A"/&gt;
 *     &lt;enumeration value="C"/&gt;
 *     &lt;enumeration value="H"/&gt;
 *     &lt;enumeration value="P"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MappingActionCode")
@XmlEnum
public enum MappingActionCode {

    A,
    C,
    H,
    P;

    public String value() {
        return name();
    }

    public static MappingActionCode fromValue(String v) {
        return valueOf(v);
    }

}
