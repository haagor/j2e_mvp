
package stubs;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the stubs package. 
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

    private final static QName _PayCardAndReload_QNAME = new QName("http://webservice.isola3000.bf.unice.fr/", "payCardAndReload");
    private final static QName _PayReloadCardResponse_QNAME = new QName("http://webservice.isola3000.bf.unice.fr/", "payReloadCardResponse");
    private final static QName _PaymentException_QNAME = new QName("http://webservice.isola3000.bf.unice.fr/", "PaymentException");
    private final static QName _PayCardAndReloadResponse_QNAME = new QName("http://webservice.isola3000.bf.unice.fr/", "payCardAndReloadResponse");
    private final static QName _PayReloadCard_QNAME = new QName("http://webservice.isola3000.bf.unice.fr/", "payReloadCard");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: stubs
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PayCardAndReload }
     * 
     */
    public PayCardAndReload createPayCardAndReload() {
        return new PayCardAndReload();
    }

    /**
     * Create an instance of {@link PayReloadCardResponse }
     * 
     */
    public PayReloadCardResponse createPayReloadCardResponse() {
        return new PayReloadCardResponse();
    }

    /**
     * Create an instance of {@link PaymentException }
     * 
     */
    public PaymentException createPaymentException() {
        return new PaymentException();
    }

    /**
     * Create an instance of {@link PayCardAndReloadResponse }
     * 
     */
    public PayCardAndReloadResponse createPayCardAndReloadResponse() {
        return new PayCardAndReloadResponse();
    }

    /**
     * Create an instance of {@link PayReloadCard }
     * 
     */
    public PayReloadCard createPayReloadCard() {
        return new PayReloadCard();
    }

    /**
     * Create an instance of {@link Item }
     * 
     */
    public Item createItem() {
        return new Item();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayCardAndReload }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.isola3000.bf.unice.fr/", name = "payCardAndReload")
    public JAXBElement<PayCardAndReload> createPayCardAndReload(PayCardAndReload value) {
        return new JAXBElement<PayCardAndReload>(_PayCardAndReload_QNAME, PayCardAndReload.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayReloadCardResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.isola3000.bf.unice.fr/", name = "payReloadCardResponse")
    public JAXBElement<PayReloadCardResponse> createPayReloadCardResponse(PayReloadCardResponse value) {
        return new JAXBElement<PayReloadCardResponse>(_PayReloadCardResponse_QNAME, PayReloadCardResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.isola3000.bf.unice.fr/", name = "PaymentException")
    public JAXBElement<PaymentException> createPaymentException(PaymentException value) {
        return new JAXBElement<PaymentException>(_PaymentException_QNAME, PaymentException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayCardAndReloadResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.isola3000.bf.unice.fr/", name = "payCardAndReloadResponse")
    public JAXBElement<PayCardAndReloadResponse> createPayCardAndReloadResponse(PayCardAndReloadResponse value) {
        return new JAXBElement<PayCardAndReloadResponse>(_PayCardAndReloadResponse_QNAME, PayCardAndReloadResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayReloadCard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.isola3000.bf.unice.fr/", name = "payReloadCard")
    public JAXBElement<PayReloadCard> createPayReloadCard(PayReloadCard value) {
        return new JAXBElement<PayReloadCard>(_PayReloadCard_QNAME, PayReloadCard.class, null, value);
    }

}
