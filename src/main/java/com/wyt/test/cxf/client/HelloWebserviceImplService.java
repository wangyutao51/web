package com.wyt.test.cxf.client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.18
 * 2016-07-31T22:05:51.420+08:00
 * Generated source version: 2.7.18
 * 
 */
@WebServiceClient(name = "HelloWebserviceImplService", 
                  wsdlLocation = "http://localhost:8080/web/services/welcome?wsdl",
                  targetNamespace = "http://www.baidu.com") 
public class HelloWebserviceImplService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.baidu.com", "HelloWebserviceImplService");
    public final static QName HelloWebserviceImplPort = new QName("http://www.baidu.com", "HelloWebserviceImplPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/web/services/welcome?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(HelloWebserviceImplService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://localhost:8080/web/services/welcome?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public HelloWebserviceImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public HelloWebserviceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HelloWebserviceImplService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public HelloWebserviceImplService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public HelloWebserviceImplService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public HelloWebserviceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns HelloWebservice
     */
    @WebEndpoint(name = "HelloWebserviceImplPort")
    public HelloWebserviceClient getHelloWebserviceImplPort() {
        return super.getPort(HelloWebserviceImplPort, HelloWebserviceClient.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HelloWebservice
     */
    @WebEndpoint(name = "HelloWebserviceImplPort")
    public HelloWebserviceClient getHelloWebserviceImplPort(WebServiceFeature... features) {
        return super.getPort(HelloWebserviceImplPort, HelloWebserviceClient.class, features);
    }

}
