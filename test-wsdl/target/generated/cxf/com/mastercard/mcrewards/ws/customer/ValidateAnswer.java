
package com.mastercard.mcrewards.ws.customer;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValidateAnswer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValidateAnswer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="questionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="answer" type="{http://customer.ws.mcrewards.mastercard.com/}encryptedField" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidateAnswer", propOrder = {
    "questionCode",
    "answer"
})
public class ValidateAnswer
    implements Serializable
{

    protected String questionCode;
    protected EncryptedField answer;

    /**
     * Gets the value of the questionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuestionCode() {
        return questionCode;
    }

    /**
     * Sets the value of the questionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuestionCode(String value) {
        this.questionCode = value;
    }

    /**
     * Gets the value of the answer property.
     * 
     * @return
     *     possible object is
     *     {@link EncryptedField }
     *     
     */
    public EncryptedField getAnswer() {
        return answer;
    }

    /**
     * Sets the value of the answer property.
     * 
     * @param value
     *     allowed object is
     *     {@link EncryptedField }
     *     
     */
    public void setAnswer(EncryptedField value) {
        this.answer = value;
    }

}
