
package stubs.accessController;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the stubs.accessController package. 
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

    private final static QName _AllowAccessResponse_QNAME = new QName("http://webservice.isola3000.bf.unice.fr/", "allowAccessResponse");
    private final static QName _AllowAccess_QNAME = new QName("http://webservice.isola3000.bf.unice.fr/", "allowAccess");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: stubs.accessController
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AllowAccessResponse }
     * 
     */
    public AllowAccessResponse createAllowAccessResponse() {
        return new AllowAccessResponse();
    }

    /**
     * Create an instance of {@link AllowAccess }
     * 
     */
    public AllowAccess createAllowAccess() {
        return new AllowAccess();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllowAccessResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.isola3000.bf.unice.fr/", name = "allowAccessResponse")
    public JAXBElement<AllowAccessResponse> createAllowAccessResponse(AllowAccessResponse value) {
        return new JAXBElement<AllowAccessResponse>(_AllowAccessResponse_QNAME, AllowAccessResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllowAccess }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.isola3000.bf.unice.fr/", name = "allowAccess")
    public JAXBElement<AllowAccess> createAllowAccess(AllowAccess value) {
        return new JAXBElement<AllowAccess>(_AllowAccess_QNAME, AllowAccess.class, null, value);
    }

}
