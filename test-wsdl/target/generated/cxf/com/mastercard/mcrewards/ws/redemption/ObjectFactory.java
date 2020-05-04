
package com.mastercard.mcrewards.ws.redemption;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.mastercard.mcrewards.ws.common.EmptyElement;
import com.mastercard.mcrewards.ws.common.SuccessResp;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.mastercard.mcrewards.ws.redemption package. 
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

    private final static QName _GetEligibleCashbackRedemptionAccounts_QNAME = new QName("http://redemption.ws.mcrewards.mastercard.com/", "getEligibleCashbackRedemptionAccounts");
    private final static QName _DefaultCashbackRedemptionAccount_QNAME = new QName("http://redemption.ws.mcrewards.mastercard.com/", "defaultCashbackRedemptionAccount");
    private final static QName _SetDefaultCashbackRedemptionAccountResult_QNAME = new QName("http://redemption.ws.mcrewards.mastercard.com/", "setDefaultCashbackRedemptionAccountResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mastercard.mcrewards.ws.redemption
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DoItemRedemption }
     * 
     */
    public DoItemRedemption createDoItemRedemption() {
        return new DoItemRedemption();
    }

    /**
     * Create an instance of {@link ItemRedemption }
     * 
     */
    public ItemRedemption createItemRedemption() {
        return new ItemRedemption();
    }

    /**
     * Create an instance of {@link DoItemRedemptionResponse }
     * 
     */
    public DoItemRedemptionResponse createDoItemRedemptionResponse() {
        return new DoItemRedemptionResponse();
    }

    /**
     * Create an instance of {@link ItemRedemptionResult }
     * 
     */
    public ItemRedemptionResult createItemRedemptionResult() {
        return new ItemRedemptionResult();
    }

    /**
     * Create an instance of {@link CreditTravelRedemption }
     * 
     */
    public CreditTravelRedemption createCreditTravelRedemption() {
        return new CreditTravelRedemption();
    }

    /**
     * Create an instance of {@link Credit }
     * 
     */
    public Credit createCredit() {
        return new Credit();
    }

    /**
     * Create an instance of {@link CreditTravelRedemptionResponse }
     * 
     */
    public CreditTravelRedemptionResponse createCreditTravelRedemptionResponse() {
        return new CreditTravelRedemptionResponse();
    }

    /**
     * Create an instance of {@link CreditResult }
     * 
     */
    public CreditResult createCreditResult() {
        return new CreditResult();
    }

    /**
     * Create an instance of {@link CreditRedemption }
     * 
     */
    public CreditRedemption createCreditRedemption() {
        return new CreditRedemption();
    }

    /**
     * Create an instance of {@link CreditRedemptionResponse }
     * 
     */
    public CreditRedemptionResponse createCreditRedemptionResponse() {
        return new CreditRedemptionResponse();
    }

    /**
     * Create an instance of {@link DoTravelRedemption }
     * 
     */
    public DoTravelRedemption createDoTravelRedemption() {
        return new DoTravelRedemption();
    }

    /**
     * Create an instance of {@link TravelRedemption }
     * 
     */
    public TravelRedemption createTravelRedemption() {
        return new TravelRedemption();
    }

    /**
     * Create an instance of {@link TravelRedemptionResponse }
     * 
     */
    public TravelRedemptionResponse createTravelRedemptionResponse() {
        return new TravelRedemptionResponse();
    }

    /**
     * Create an instance of {@link TravelRedemptionResult }
     * 
     */
    public TravelRedemptionResult createTravelRedemptionResult() {
        return new TravelRedemptionResult();
    }

    /**
     * Create an instance of {@link EligibleCashbackRedemptionAccounts }
     * 
     */
    public EligibleCashbackRedemptionAccounts createEligibleCashbackRedemptionAccounts() {
        return new EligibleCashbackRedemptionAccounts();
    }

    /**
     * Create an instance of {@link CashbackRedemptionHousehold }
     * 
     */
    public CashbackRedemptionHousehold createCashbackRedemptionHousehold() {
        return new CashbackRedemptionHousehold();
    }

    /**
     * Create an instance of {@link GetDefaultCashbackRedemptionAccount }
     * 
     */
    public GetDefaultCashbackRedemptionAccount createGetDefaultCashbackRedemptionAccount() {
        return new GetDefaultCashbackRedemptionAccount();
    }

    /**
     * Create an instance of {@link SetDefaultCashbackRedemptionAccount }
     * 
     */
    public SetDefaultCashbackRedemptionAccount createSetDefaultCashbackRedemptionAccount() {
        return new SetDefaultCashbackRedemptionAccount();
    }

    /**
     * Create an instance of {@link ExternalItemRedemption }
     * 
     */
    public ExternalItemRedemption createExternalItemRedemption() {
        return new ExternalItemRedemption();
    }

    /**
     * Create an instance of {@link ExternalItem }
     * 
     */
    public ExternalItem createExternalItem() {
        return new ExternalItem();
    }

    /**
     * Create an instance of {@link ExternalItemRedemptionResponse }
     * 
     */
    public ExternalItemRedemptionResponse createExternalItemRedemptionResponse() {
        return new ExternalItemRedemptionResponse();
    }

    /**
     * Create an instance of {@link ApplyStatementOfCredit }
     * 
     */
    public ApplyStatementOfCredit createApplyStatementOfCredit() {
        return new ApplyStatementOfCredit();
    }

    /**
     * Create an instance of {@link ApplyStatementOfCreditResponse }
     * 
     */
    public ApplyStatementOfCreditResponse createApplyStatementOfCreditResponse() {
        return new ApplyStatementOfCreditResponse();
    }

    /**
     * Create an instance of {@link GenericRedemptionItem }
     * 
     */
    public GenericRedemptionItem createGenericRedemptionItem() {
        return new GenericRedemptionItem();
    }

    /**
     * Create an instance of {@link ShippingAddress }
     * 
     */
    public ShippingAddress createShippingAddress() {
        return new ShippingAddress();
    }

    /**
     * Create an instance of {@link EligibleCashbackRedemptionAccount }
     * 
     */
    public EligibleCashbackRedemptionAccount createEligibleCashbackRedemptionAccount() {
        return new EligibleCashbackRedemptionAccount();
    }

    /**
     * Create an instance of {@link PointFees }
     * 
     */
    public PointFees createPointFees() {
        return new PointFees();
    }

    /**
     * Create an instance of {@link ExternalShippingAddress }
     * 
     */
    public ExternalShippingAddress createExternalShippingAddress() {
        return new ExternalShippingAddress();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmptyElement }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EmptyElement }{@code >}
     */
    @XmlElementDecl(namespace = "http://redemption.ws.mcrewards.mastercard.com/", name = "getEligibleCashbackRedemptionAccounts")
    public JAXBElement<EmptyElement> createGetEligibleCashbackRedemptionAccounts(EmptyElement value) {
        return new JAXBElement<EmptyElement>(_GetEligibleCashbackRedemptionAccounts_QNAME, EmptyElement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://redemption.ws.mcrewards.mastercard.com/", name = "defaultCashbackRedemptionAccount")
    public JAXBElement<String> createDefaultCashbackRedemptionAccount(String value) {
        return new JAXBElement<String>(_DefaultCashbackRedemptionAccount_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuccessResp }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SuccessResp }{@code >}
     */
    @XmlElementDecl(namespace = "http://redemption.ws.mcrewards.mastercard.com/", name = "setDefaultCashbackRedemptionAccountResult")
    public JAXBElement<SuccessResp> createSetDefaultCashbackRedemptionAccountResult(SuccessResp value) {
        return new JAXBElement<SuccessResp>(_SetDefaultCashbackRedemptionAccountResult_QNAME, SuccessResp.class, null, value);
    }

}
