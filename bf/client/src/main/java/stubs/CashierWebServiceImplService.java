
package stubs;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "CashierWebServiceImplService", targetNamespace = "http://localhost:8080/isa/bf/cashier", wsdlLocation = "file:/C:/Users/user/Documents/Polytech/ISA/bf/client/src/resources/CashierWS.wsdl")
public class CashierWebServiceImplService
    extends Service
{

    private final static URL CASHIERWEBSERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException CASHIERWEBSERVICEIMPLSERVICE_EXCEPTION;
    private final static QName CASHIERWEBSERVICEIMPLSERVICE_QNAME = new QName("http://localhost:8080/isa/bf/cashier", "CashierWebServiceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/Users/user/Documents/Polytech/ISA/bf/client/src/resources/CashierWS.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CASHIERWEBSERVICEIMPLSERVICE_WSDL_LOCATION = url;
        CASHIERWEBSERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public CashierWebServiceImplService() {
        super(__getWsdlLocation(), CASHIERWEBSERVICEIMPLSERVICE_QNAME);
    }

    public CashierWebServiceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), CASHIERWEBSERVICEIMPLSERVICE_QNAME, features);
    }

    public CashierWebServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, CASHIERWEBSERVICEIMPLSERVICE_QNAME);
    }

    public CashierWebServiceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CASHIERWEBSERVICEIMPLSERVICE_QNAME, features);
    }

    public CashierWebServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CashierWebServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ICashierWebService
     */
    @WebEndpoint(name = "CashierWebServiceImplPort")
    public ICashierWebService getCashierWebServiceImplPort() {
        return super.getPort(new QName("http://localhost:8080/isa/bf/cashier", "CashierWebServiceImplPort"), ICashierWebService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ICashierWebService
     */
    @WebEndpoint(name = "CashierWebServiceImplPort")
    public ICashierWebService getCashierWebServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://localhost:8080/isa/bf/cashier", "CashierWebServiceImplPort"), ICashierWebService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CASHIERWEBSERVICEIMPLSERVICE_EXCEPTION!= null) {
            throw CASHIERWEBSERVICEIMPLSERVICE_EXCEPTION;
        }
        return CASHIERWEBSERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}
