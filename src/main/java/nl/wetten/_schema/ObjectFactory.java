//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.28 at 03:56:30 PM CET 
//


package nl.wetten._schema;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the nl.wetten._schema package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: nl.wetten._schema
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Manifestation }
     * 
     */
    public Manifestation createManifestation() {
        return new Manifestation();
    }

    /**
     * Create an instance of {@link ManifestationMetadata }
     * 
     */
    public ManifestationMetadata createManifestationMetadata() {
        return new ManifestationMetadata();
    }

    /**
     * Create an instance of {@link Item }
     * 
     */
    public Item createItem() {
        return new Item();
    }

    /**
     * Create an instance of {@link Subitem }
     * 
     */
    public Subitem createSubitem() {
        return new Subitem();
    }

    /**
     * Create an instance of {@link Expression }
     * 
     */
    public Expression createExpression() {
        return new Expression();
    }

    /**
     * Create an instance of {@link ExpressionMetadata }
     * 
     */
    public ExpressionMetadata createExpressionMetadata() {
        return new ExpressionMetadata();
    }

    /**
     * Create an instance of {@link Work }
     * 
     */
    public Work createWork() {
        return new Work();
    }

    /**
     * Create an instance of {@link WorkMetadata }
     * 
     */
    public WorkMetadata createWorkMetadata() {
        return new WorkMetadata();
    }

}