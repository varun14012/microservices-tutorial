
package com.mastercard.mcrewards.ws.customer;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.mastercard.mcrewards.ws.common.SuccessResp;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.mastercard.mcrewards.ws.customer package. 
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

    private final static QName _GetShippingAddress_QNAME = new QName("http://customer.ws.mcrewards.mastercard.com/", "getShippingAddress");
    private final static QName _SetPreferredLanguage_QNAME = new QName("http://customer.ws.mcrewards.mastercard.com/", "setPreferredLanguage");
    private final static QName _SetPreferredLanguageResponse_QNAME = new QName("http://customer.ws.mcrewards.mastercard.com/", "setPreferredLanguageResponse");
    private final static QName _GetPointDetails_QNAME = new QName("http://customer.ws.mcrewards.mastercard.com/", "getPointDetails");
    private final static QName _PointDetails_QNAME = new QName("http://customer.ws.mcrewards.mastercard.com/", "PointDetails");
    private final static QName _AvailablePoints_QNAME = new QName("http://customer.ws.mcrewards.mastercard.com/", "AvailablePoints");
    private final static QName _GetRTRPreferences_QNAME = new QName("http://customer.ws.mcrewards.mastercard.com/", "getRTRPreferences");
    private final static QName _SetRTRPreferences_QNAME = new QName("http://customer.ws.mcrewards.mastercard.com/", "setRTRPreferences");
    private final static QName _RTRPreferences_QNAME = new QName("http://customer.ws.mcrewards.mastercard.com/", "RTRPreferences");
    private final static QName _CustomerDetails_QNAME = new QName("http://customer.ws.mcrewards.mastercard.com/", "CustomerDetails");
    private final static QName _UpdateCustomerAccount_QNAME = new QName("http://customer.ws.mcrewards.mastercard.com/", "updateCustomerAccount");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mastercard.mcrewards.ws.customer
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCustomerInformation }
     * 
     */
    public GetCustomerInformation createGetCustomerInformation() {
        return new GetCustomerInformation();
    }

    /**
     * Create an instance of {@link CustomerInformation }
     * 
     */
    public CustomerInformation createCustomerInformation() {
        return new CustomerInformation();
    }

    /**
     * Create an instance of {@link Card }
     * 
     */
    public Card createCard() {
        return new Card();
    }

    /**
     * Create an instance of {@link Household }
     * 
     */
    public Household createHousehold() {
        return new Household();
    }

    /**
     * Create an instance of {@link HouseholdPoolingDetail }
     * 
     */
    public HouseholdPoolingDetail createHouseholdPoolingDetail() {
        return new HouseholdPoolingDetail();
    }

    /**
     * Create an instance of {@link CustomerMap }
     * 
     */
    public CustomerMap createCustomerMap() {
        return new CustomerMap();
    }

    /**
     * Create an instance of {@link Customer }
     * 
     */
    public Customer createCustomer() {
        return new Customer();
    }

    /**
     * Create an instance of {@link GetCustomerAccounts }
     * 
     */
    public GetCustomerAccounts createGetCustomerAccounts() {
        return new GetCustomerAccounts();
    }

    /**
     * Create an instance of {@link CustomerAccounts }
     * 
     */
    public CustomerAccounts createCustomerAccounts() {
        return new CustomerAccounts();
    }

    /**
     * Create an instance of {@link CustomerAccount }
     * 
     */
    public CustomerAccount createCustomerAccount() {
        return new CustomerAccount();
    }

    /**
     * Create an instance of {@link GetValidationQuestions }
     * 
     */
    public GetValidationQuestions createGetValidationQuestions() {
        return new GetValidationQuestions();
    }

    /**
     * Create an instance of {@link EncryptedField }
     * 
     */
    public EncryptedField createEncryptedField() {
        return new EncryptedField();
    }

    /**
     * Create an instance of {@link GetValidationQuestionsResponse }
     * 
     */
    public GetValidationQuestionsResponse createGetValidationQuestionsResponse() {
        return new GetValidationQuestionsResponse();
    }

    /**
     * Create an instance of {@link VerificationQuestion }
     * 
     */
    public VerificationQuestion createVerificationQuestion() {
        return new VerificationQuestion();
    }

    /**
     * Create an instance of {@link ValidateCustomer }
     * 
     */
    public ValidateCustomer createValidateCustomer() {
        return new ValidateCustomer();
    }

    /**
     * Create an instance of {@link ValidateAnswer }
     * 
     */
    public ValidateAnswer createValidateAnswer() {
        return new ValidateAnswer();
    }

    /**
     * Create an instance of {@link ValidateCustomerResponse }
     * 
     */
    public ValidateCustomerResponse createValidateCustomerResponse() {
        return new ValidateCustomerResponse();
    }

    /**
     * Create an instance of {@link GetCustomerQualifications }
     * 
     */
    public GetCustomerQualifications createGetCustomerQualifications() {
        return new GetCustomerQualifications();
    }

    /**
     * Create an instance of {@link GetCustomerQualificationsResponse }
     * 
     */
    public GetCustomerQualificationsResponse createGetCustomerQualificationsResponse() {
        return new GetCustomerQualificationsResponse();
    }

    /**
     * Create an instance of {@link Qualification }
     * 
     */
    public Qualification createQualification() {
        return new Qualification();
    }

    /**
     * Create an instance of {@link GetPointBalance }
     * 
     */
    public GetPointBalance createGetPointBalance() {
        return new GetPointBalance();
    }

    /**
     * Create an instance of {@link GetPointBalanceResponse }
     * 
     */
    public GetPointBalanceResponse createGetPointBalanceResponse() {
        return new GetPointBalanceResponse();
    }

    /**
     * Create an instance of {@link PointBalance }
     * 
     */
    public PointBalance createPointBalance() {
        return new PointBalance();
    }

    /**
     * Create an instance of {@link GetHouseholdPoints }
     * 
     */
    public GetHouseholdPoints createGetHouseholdPoints() {
        return new GetHouseholdPoints();
    }

    /**
     * Create an instance of {@link GetShippingAddress }
     * 
     */
    public GetShippingAddress createGetShippingAddress() {
        return new GetShippingAddress();
    }

    /**
     * Create an instance of {@link GetShippingAddressResponse }
     * 
     */
    public GetShippingAddressResponse createGetShippingAddressResponse() {
        return new GetShippingAddressResponse();
    }

    /**
     * Create an instance of {@link ShippingAddressExt }
     * 
     */
    public ShippingAddressExt createShippingAddressExt() {
        return new ShippingAddressExt();
    }

    /**
     * Create an instance of {@link UpdateCustomer }
     * 
     */
    public UpdateCustomer createUpdateCustomer() {
        return new UpdateCustomer();
    }

    /**
     * Create an instance of {@link HashStringElement }
     * 
     */
    public HashStringElement createHashStringElement() {
        return new HashStringElement();
    }

    /**
     * Create an instance of {@link UpdateCustomerResponse }
     * 
     */
    public UpdateCustomerResponse createUpdateCustomerResponse() {
        return new UpdateCustomerResponse();
    }

    /**
     * Create an instance of {@link SetPreferredLanguage }
     * 
     */
    public SetPreferredLanguage createSetPreferredLanguage() {
        return new SetPreferredLanguage();
    }

    /**
     * Create an instance of {@link GetPointDetails }
     * 
     */
    public GetPointDetails createGetPointDetails() {
        return new GetPointDetails();
    }

    /**
     * Create an instance of {@link PointDetails }
     * 
     */
    public PointDetails createPointDetails() {
        return new PointDetails();
    }

    /**
     * Create an instance of {@link GetRTRPreferences }
     * 
     */
    public GetRTRPreferences createGetRTRPreferences() {
        return new GetRTRPreferences();
    }

    /**
     * Create an instance of {@link SetRTRPreferences }
     * 
     */
    public SetRTRPreferences createSetRTRPreferences() {
        return new SetRTRPreferences();
    }

    /**
     * Create an instance of {@link RTRPreferences }
     * 
     */
    public RTRPreferences createRTRPreferences() {
        return new RTRPreferences();
    }

    /**
     * Create an instance of {@link Enroll }
     * 
     */
    public Enroll createEnroll() {
        return new Enroll();
    }

    /**
     * Create an instance of {@link CustomerEnrollmentFields }
     * 
     */
    public CustomerEnrollmentFields createCustomerEnrollmentFields() {
        return new CustomerEnrollmentFields();
    }

    /**
     * Create an instance of {@link CustomerAccountEnrollmentFields }
     * 
     */
    public CustomerAccountEnrollmentFields createCustomerAccountEnrollmentFields() {
        return new CustomerAccountEnrollmentFields();
    }

    /**
     * Create an instance of {@link EnrollResponse }
     * 
     */
    public EnrollResponse createEnrollResponse() {
        return new EnrollResponse();
    }

    /**
     * Create an instance of {@link GetCustomerDetails }
     * 
     */
    public GetCustomerDetails createGetCustomerDetails() {
        return new GetCustomerDetails();
    }

    /**
     * Create an instance of {@link CustomerDetails }
     * 
     */
    public CustomerDetails createCustomerDetails() {
        return new CustomerDetails();
    }

    /**
     * Create an instance of {@link UpdateCustomerAccount }
     * 
     */
    public UpdateCustomerAccount createUpdateCustomerAccount() {
        return new UpdateCustomerAccount();
    }

    /**
     * Create an instance of {@link UpdateCustomerAccountResponse }
     * 
     */
    public UpdateCustomerAccountResponse createUpdateCustomerAccountResponse() {
        return new UpdateCustomerAccountResponse();
    }

    /**
     * Create an instance of {@link UpdateLostStolenAccount }
     * 
     */
    public UpdateLostStolenAccount createUpdateLostStolenAccount() {
        return new UpdateLostStolenAccount();
    }

    /**
     * Create an instance of {@link UpdateLostStolenAccountResponse }
     * 
     */
    public UpdateLostStolenAccountResponse createUpdateLostStolenAccountResponse() {
        return new UpdateLostStolenAccountResponse();
    }

    /**
     * Create an instance of {@link VerifyCard }
     * 
     */
    public VerifyCard createVerifyCard() {
        return new VerifyCard();
    }

    /**
     * Create an instance of {@link VerifyCardResponse }
     * 
     */
    public VerifyCardResponse createVerifyCardResponse() {
        return new VerifyCardResponse();
    }

    /**
     * Create an instance of {@link SaveQualification }
     * 
     */
    public SaveQualification createSaveQualification() {
        return new SaveQualification();
    }

    /**
     * Create an instance of {@link SaveQualificationResponse }
     * 
     */
    public SaveQualificationResponse createSaveQualificationResponse() {
        return new SaveQualificationResponse();
    }

    /**
     * Create an instance of {@link TravelComponent }
     * 
     */
    public TravelComponent createTravelComponent() {
        return new TravelComponent();
    }

    /**
     * Create an instance of {@link ShippingAddress }
     * 
     */
    public ShippingAddress createShippingAddress() {
        return new ShippingAddress();
    }

    /**
     * Create an instance of {@link HouseholdPointDetails }
     * 
     */
    public HouseholdPointDetails createHouseholdPointDetails() {
        return new HouseholdPointDetails();
    }

    /**
     * Create an instance of {@link CustomerPointDetails }
     * 
     */
    public CustomerPointDetails createCustomerPointDetails() {
        return new CustomerPointDetails();
    }

    /**
     * Create an instance of {@link AccountPointDetails }
     * 
     */
    public AccountPointDetails createAccountPointDetails() {
        return new AccountPointDetails();
    }

    /**
     * Create an instance of {@link BurnAccelerator }
     * 
     */
    public BurnAccelerator createBurnAccelerator() {
        return new BurnAccelerator();
    }

    /**
     * Create an instance of {@link ArsBaseConversionFactor }
     * 
     */
    public ArsBaseConversionFactor createArsBaseConversionFactor() {
        return new ArsBaseConversionFactor();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetShippingAddress }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetShippingAddress }{@code >}
     */
    @XmlElementDecl(namespace = "http://customer.ws.mcrewards.mastercard.com/", name = "getShippingAddress")
    public JAXBElement<GetShippingAddress> createGetShippingAddress(GetShippingAddress value) {
        return new JAXBElement<GetShippingAddress>(_GetShippingAddress_QNAME, GetShippingAddress.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetPreferredLanguage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetPreferredLanguage }{@code >}
     */
    @XmlElementDecl(namespace = "http://customer.ws.mcrewards.mastercard.com/", name = "setPreferredLanguage")
    public JAXBElement<SetPreferredLanguage> createSetPreferredLanguage(SetPreferredLanguage value) {
        return new JAXBElement<SetPreferredLanguage>(_SetPreferredLanguage_QNAME, SetPreferredLanguage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuccessResp }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SuccessResp }{@code >}
     */
    @XmlElementDecl(namespace = "http://customer.ws.mcrewards.mastercard.com/", name = "setPreferredLanguageResponse")
    public JAXBElement<SuccessResp> createSetPreferredLanguageResponse(SuccessResp value) {
        return new JAXBElement<SuccessResp>(_SetPreferredLanguageResponse_QNAME, SuccessResp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPointDetails }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetPointDetails }{@code >}
     */
    @XmlElementDecl(namespace = "http://customer.ws.mcrewards.mastercard.com/", name = "getPointDetails")
    public JAXBElement<GetPointDetails> createGetPointDetails(GetPointDetails value) {
        return new JAXBElement<GetPointDetails>(_GetPointDetails_QNAME, GetPointDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PointDetails }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PointDetails }{@code >}
     */
    @XmlElementDecl(namespace = "http://customer.ws.mcrewards.mastercard.com/", name = "PointDetails")
    public JAXBElement<PointDetails> createPointDetails(PointDetails value) {
        return new JAXBElement<PointDetails>(_PointDetails_QNAME, PointDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://customer.ws.mcrewards.mastercard.com/", name = "AvailablePoints")
    public JAXBElement<BigDecimal> createAvailablePoints(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AvailablePoints_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRTRPreferences }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetRTRPreferences }{@code >}
     */
    @XmlElementDecl(namespace = "http://customer.ws.mcrewards.mastercard.com/", name = "getRTRPreferences")
    public JAXBElement<GetRTRPreferences> createGetRTRPreferences(GetRTRPreferences value) {
        return new JAXBElement<GetRTRPreferences>(_GetRTRPreferences_QNAME, GetRTRPreferences.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetRTRPreferences }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetRTRPreferences }{@code >}
     */
    @XmlElementDecl(namespace = "http://customer.ws.mcrewards.mastercard.com/", name = "setRTRPreferences")
    public JAXBElement<SetRTRPreferences> createSetRTRPreferences(SetRTRPreferences value) {
        return new JAXBElement<SetRTRPreferences>(_SetRTRPreferences_QNAME, SetRTRPreferences.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RTRPreferences }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RTRPreferences }{@code >}
     */
    @XmlElementDecl(namespace = "http://customer.ws.mcrewards.mastercard.com/", name = "RTRPreferences")
    public JAXBElement<RTRPreferences> createRTRPreferences(RTRPreferences value) {
        return new JAXBElement<RTRPreferences>(_RTRPreferences_QNAME, RTRPreferences.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerDetails }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CustomerDetails }{@code >}
     */
    @XmlElementDecl(namespace = "http://customer.ws.mcrewards.mastercard.com/", name = "CustomerDetails")
    public JAXBElement<CustomerDetails> createCustomerDetails(CustomerDetails value) {
        return new JAXBElement<CustomerDetails>(_CustomerDetails_QNAME, CustomerDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCustomerAccount }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateCustomerAccount }{@code >}
     */
    @XmlElementDecl(namespace = "http://customer.ws.mcrewards.mastercard.com/", name = "updateCustomerAccount")
    public JAXBElement<UpdateCustomerAccount> createUpdateCustomerAccount(UpdateCustomerAccount value) {
        return new JAXBElement<UpdateCustomerAccount>(_UpdateCustomerAccount_QNAME, UpdateCustomerAccount.class, null, value);
    }

}
