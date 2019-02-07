
package ws.unit04.example1.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws.unit04.example1.webservice package. 
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

    private final static QName _DividedByZeroException_QNAME = new QName("http://webservices.ejemplo1.ws/", "DividedByZeroException");
    private final static QName _Add_QNAME = new QName("http://webservices.ejemplo1.ws/", "add");
    private final static QName _AddResponse_QNAME = new QName("http://webservices.ejemplo1.ws/", "addResponse");
    private final static QName _Div_QNAME = new QName("http://webservices.ejemplo1.ws/", "div");
    private final static QName _DivResponse_QNAME = new QName("http://webservices.ejemplo1.ws/", "divResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws.unit04.example1.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DividedByZeroException }
     * 
     */
    public DividedByZeroException createDividedByZeroException() {
        return new DividedByZeroException();
    }

    /**
     * Create an instance of {@link Add }
     * 
     */
    public Add createAdd() {
        return new Add();
    }

    /**
     * Create an instance of {@link AddResponse }
     * 
     */
    public AddResponse createAddResponse() {
        return new AddResponse();
    }

    /**
     * Create an instance of {@link Div }
     * 
     */
    public Div createDiv() {
        return new Div();
    }

    /**
     * Create an instance of {@link DivResponse }
     * 
     */
    public DivResponse createDivResponse() {
        return new DivResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DividedByZeroException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DividedByZeroException }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservices.ejemplo1.ws/", name = "DividedByZeroException")
    public JAXBElement<DividedByZeroException> createDividedByZeroException(DividedByZeroException value) {
        return new JAXBElement<DividedByZeroException>(_DividedByZeroException_QNAME, DividedByZeroException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Add }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Add }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservices.ejemplo1.ws/", name = "add")
    public JAXBElement<Add> createAdd(Add value) {
        return new JAXBElement<Add>(_Add_QNAME, Add.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservices.ejemplo1.ws/", name = "addResponse")
    public JAXBElement<AddResponse> createAddResponse(AddResponse value) {
        return new JAXBElement<AddResponse>(_AddResponse_QNAME, AddResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Div }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Div }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservices.ejemplo1.ws/", name = "div")
    public JAXBElement<Div> createDiv(Div value) {
        return new JAXBElement<Div>(_Div_QNAME, Div.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DivResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DivResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservices.ejemplo1.ws/", name = "divResponse")
    public JAXBElement<DivResponse> createDivResponse(DivResponse value) {
        return new JAXBElement<DivResponse>(_DivResponse_QNAME, DivResponse.class, null, value);
    }

}
