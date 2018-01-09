
package app;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the app package. 
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

    private final static QName _HelloResponse_QNAME = new QName("http://app/", "helloResponse");
    private final static QName _GetListProResponse_QNAME = new QName("http://app/", "getListProResponse");
    private final static QName _GetListPro_QNAME = new QName("http://app/", "getListPro");
    private final static QName _Hello_QNAME = new QName("http://app/", "hello");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: app
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetListProResponse }
     * 
     */
    public GetListProResponse createGetListProResponse() {
        return new GetListProResponse();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link GetListPro }
     * 
     */
    public GetListPro createGetListPro() {
        return new GetListPro();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://app/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListProResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://app/", name = "getListProResponse")
    public JAXBElement<GetListProResponse> createGetListProResponse(GetListProResponse value) {
        return new JAXBElement<GetListProResponse>(_GetListProResponse_QNAME, GetListProResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListPro }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://app/", name = "getListPro")
    public JAXBElement<GetListPro> createGetListPro(GetListPro value) {
        return new JAXBElement<GetListPro>(_GetListPro_QNAME, GetListPro.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://app/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

}
