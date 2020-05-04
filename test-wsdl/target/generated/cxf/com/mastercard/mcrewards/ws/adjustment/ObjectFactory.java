
package com.mastercard.mcrewards.ws.adjustment;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.mastercard.mcrewards.ws.adjustment package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AdjustmentTypeResponse_QNAME = new QName("http://adjustment.ws.mcrewards.mastercard.com/", "adjustmentTypeResponse");
    private final static QName _AdjustmentClassResponse_QNAME = new QName("http://adjustment.ws.mcrewards.mastercard.com/", "adjustmentClassResponse");
    private final static QName _AdjustmentClassCode_QNAME = new QName("http://adjustment.ws.mcrewards.mastercard.com/", "adjustmentClassCode");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mastercard.mcrewards.ws.adjustment
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AdjustPoints }
     * 
     */
    public AdjustPoints createAdjustPoints() {
        return new AdjustPoints();
    }

    /**
     * Create an instance of {@link AdjustPointsResponse }
     * 
     */
    public AdjustPointsResponse createAdjustPointsResponse() {
        return new AdjustPointsResponse();
    }

    /**
     * Create an instance of {@link AdjustmentTypeResponse }
     * 
     */
    public AdjustmentTypeResponse createAdjustmentTypeResponse() {
        return new AdjustmentTypeResponse();
    }

    /**
     * Create an instance of {@link AdjustmentClassResponse }
     * 
     */
    public AdjustmentClassResponse createAdjustmentClassResponse() {
        return new AdjustmentClassResponse();
    }

    /**
     * Create an instance of {@link AdjustAccountPoints }
     * 
     */
    public AdjustAccountPoints createAdjustAccountPoints() {
        return new AdjustAccountPoints();
    }

    /**
     * Create an instance of {@link AdjustAccountPointsResponse }
     * 
     */
    public AdjustAccountPointsResponse createAdjustAccountPointsResponse() {
        return new AdjustAccountPointsResponse();
    }

    /**
     * Create an instance of {@link AdjustmentType }
     * 
     */
    public AdjustmentType createAdjustmentType() {
        return new AdjustmentType();
    }

    /**
     * Create an instance of {@link AdjustmentClass }
     * 
     */
    public AdjustmentClass createAdjustmentClass() {
        return new AdjustmentClass();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdjustmentTypeResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdjustmentTypeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://adjustment.ws.mcrewards.mastercard.com/", name = "adjustmentTypeResponse")
    public JAXBElement<AdjustmentTypeResponse> createAdjustmentTypeResponse(AdjustmentTypeResponse value) {
        return new JAXBElement<AdjustmentTypeResponse>(_AdjustmentTypeResponse_QNAME, AdjustmentTypeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdjustmentClassResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdjustmentClassResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://adjustment.ws.mcrewards.mastercard.com/", name = "adjustmentClassResponse")
    public JAXBElement<AdjustmentClassResponse> createAdjustmentClassResponse(AdjustmentClassResponse value) {
        return new JAXBElement<AdjustmentClassResponse>(_AdjustmentClassResponse_QNAME, AdjustmentClassResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://adjustment.ws.mcrewards.mastercard.com/", name = "adjustmentClassCode")
    public JAXBElement<String> createAdjustmentClassCode(String value) {
        return new JAXBElement<String>(_AdjustmentClassCode_QNAME, String.class, null, value);
    }

}
