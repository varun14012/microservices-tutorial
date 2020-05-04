
package com.mastercard.mcrewards.ws.customer;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for encryptedField complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="encryptedField"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://common.ws.mcrewards.mastercard.com/&gt;encryptedField"&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "encryptedField")
public class EncryptedField
    extends com.mastercard.mcrewards.ws.common.EncryptedField
    implements Serializable
{


}
