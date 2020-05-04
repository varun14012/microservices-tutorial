package com.mastercard.mcrewards.ws.redemption;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.3.6
 * 2020-05-04T17:51:59.253+05:30
 * Generated source version: 3.3.6
 *
 */
@WebServiceClient(name = "RedemptionService",
                  wsdlLocation = "file:/C:/Users/varun.srivastawa/Documents/workspace-spring-tool-suite-4-4.1.1.RELEASE/test-wsdl/src/main/resources/wsdl/RedemptionService.wsdl",
                  targetNamespace = "http://redemption.ws.mcrewards.mastercard.com/")
public class RedemptionService_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://redemption.ws.mcrewards.mastercard.com/", "RedemptionService");
    public final static QName RedemptionService = new QName("http://redemption.ws.mcrewards.mastercard.com/", "RedemptionService");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/varun.srivastawa/Documents/workspace-spring-tool-suite-4-4.1.1.RELEASE/test-wsdl/src/main/resources/wsdl/RedemptionService.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(RedemptionService_Service.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/varun.srivastawa/Documents/workspace-spring-tool-suite-4-4.1.1.RELEASE/test-wsdl/src/main/resources/wsdl/RedemptionService.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public RedemptionService_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public RedemptionService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public RedemptionService_Service() {
        super(WSDL_LOCATION, SERVICE);
    }

    public RedemptionService_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public RedemptionService_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public RedemptionService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns RedemptionService
     */
    @WebEndpoint(name = "RedemptionService")
    public RedemptionService getRedemptionService() {
        return super.getPort(RedemptionService, RedemptionService.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns RedemptionService
     */
    @WebEndpoint(name = "RedemptionService")
    public RedemptionService getRedemptionService(WebServiceFeature... features) {
        return super.getPort(RedemptionService, RedemptionService.class, features);
    }

}
