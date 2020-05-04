package com.mastercard.mcrewards.ws.activity;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.3.6
 * 2020-05-04T17:51:58.947+05:30
 * Generated source version: 3.3.6
 *
 */
@WebServiceClient(name = "ActivityService",
                  wsdlLocation = "file:/C:/Users/varun.srivastawa/Documents/workspace-spring-tool-suite-4-4.1.1.RELEASE/test-wsdl/src/main/resources/wsdl/ActivityService.wsdl",
                  targetNamespace = "http://activity.ws.mcrewards.mastercard.com/")
public class ActivityService_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://activity.ws.mcrewards.mastercard.com/", "ActivityService");
    public final static QName ActivityService = new QName("http://activity.ws.mcrewards.mastercard.com/", "ActivityService");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/varun.srivastawa/Documents/workspace-spring-tool-suite-4-4.1.1.RELEASE/test-wsdl/src/main/resources/wsdl/ActivityService.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ActivityService_Service.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/varun.srivastawa/Documents/workspace-spring-tool-suite-4-4.1.1.RELEASE/test-wsdl/src/main/resources/wsdl/ActivityService.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ActivityService_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ActivityService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ActivityService_Service() {
        super(WSDL_LOCATION, SERVICE);
    }

    public ActivityService_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public ActivityService_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public ActivityService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns ActivityService
     */
    @WebEndpoint(name = "ActivityService")
    public ActivityService getActivityService() {
        return super.getPort(ActivityService, ActivityService.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ActivityService
     */
    @WebEndpoint(name = "ActivityService")
    public ActivityService getActivityService(WebServiceFeature... features) {
        return super.getPort(ActivityService, ActivityService.class, features);
    }

}
