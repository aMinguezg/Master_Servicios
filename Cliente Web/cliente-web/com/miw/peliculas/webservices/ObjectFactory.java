
package com.miw.peliculas.webservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.miw.peliculas.webservices package. 
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

    private final static QName _Comparar_QNAME = new QName("http://webservices.peliculas.miw.com/", "comparar");
    private final static QName _CompararResponse_QNAME = new QName("http://webservices.peliculas.miw.com/", "compararResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.miw.peliculas.webservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Comparar }
     * 
     */
    public Comparar createComparar() {
        return new Comparar();
    }

    /**
     * Create an instance of {@link CompararResponse }
     * 
     */
    public CompararResponse createCompararResponse() {
        return new CompararResponse();
    }

    /**
     * Create an instance of {@link Comparacion }
     * 
     */
    public Comparacion createComparacion() {
        return new Comparacion();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Comparar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Comparar }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservices.peliculas.miw.com/", name = "comparar")
    public JAXBElement<Comparar> createComparar(Comparar value) {
        return new JAXBElement<Comparar>(_Comparar_QNAME, Comparar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompararResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CompararResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservices.peliculas.miw.com/", name = "compararResponse")
    public JAXBElement<CompararResponse> createCompararResponse(CompararResponse value) {
        return new JAXBElement<CompararResponse>(_CompararResponse_QNAME, CompararResponse.class, null, value);
    }

}
