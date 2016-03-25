
package stubs.cashier;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the stubs.cashier package. 
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

    private final static QName _Paye_QNAME = new QName("http://webservices/", "paye");
    private final static QName _PayeResponse_QNAME = new QName("http://webservices/", "payeResponse");
    private final static QName _TestResponse_QNAME = new QName("http://webservices/", "testResponse");
    private final static QName _Test_QNAME = new QName("http://webservices/", "test");
    private final static QName _PaymentException_QNAME = new QName("http://webservices/", "PaymentException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: stubs.cashier
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PaymentException }
     * 
     */
    public PaymentException createPaymentException() {
        return new PaymentException();
    }

    /**
     * Create an instance of {@link Test }
     * 
     */
    public Test createTest() {
        return new Test();
    }

    /**
     * Create an instance of {@link TestResponse }
     * 
     */
    public TestResponse createTestResponse() {
        return new TestResponse();
    }

    /**
     * Create an instance of {@link Paye }
     * 
     */
    public Paye createPaye() {
        return new Paye();
    }

    /**
     * Create an instance of {@link PayeResponse }
     * 
     */
    public PayeResponse createPayeResponse() {
        return new PayeResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Paye }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "paye")
    public JAXBElement<Paye> createPaye(Paye value) {
        return new JAXBElement<Paye>(_Paye_QNAME, Paye.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "payeResponse")
    public JAXBElement<PayeResponse> createPayeResponse(PayeResponse value) {
        return new JAXBElement<PayeResponse>(_PayeResponse_QNAME, PayeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "testResponse")
    public JAXBElement<TestResponse> createTestResponse(TestResponse value) {
        return new JAXBElement<TestResponse>(_TestResponse_QNAME, TestResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Test }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "test")
    public JAXBElement<Test> createTest(Test value) {
        return new JAXBElement<Test>(_Test_QNAME, Test.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "PaymentException")
    public JAXBElement<PaymentException> createPaymentException(PaymentException value) {
        return new JAXBElement<PaymentException>(_PaymentException_QNAME, PaymentException.class, null, value);
    }

}
