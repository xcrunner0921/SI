//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.10 at 01:22:30 오후 KST 
//


package org.onem2m.xml.protocols;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for aggregatedRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="aggregatedRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="request" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="operation" type="{http://www.onem2m.org/xml/protocols}operation"/>
 *                   &lt;element name="to" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *                   &lt;element name="from" type="{http://www.onem2m.org/xml/protocols}ID"/>
 *                   &lt;element name="requestIdentifier" type="{http://www.onem2m.org/xml/protocols}requestID"/>
 *                   &lt;element name="primitiveContent" type="{http://www.onem2m.org/xml/protocols}primitiveContent" minOccurs="0"/>
 *                   &lt;element name="metaInformation" type="{http://www.onem2m.org/xml/protocols}metaInformation" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "aggregatedRequest", propOrder = {
    "request"
})
public class AggregatedRequest {

    @XmlElement(required = true)
    protected List<AggregatedRequest.Request> request;

    /**
     * Gets the value of the request property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the request property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AggregatedRequest.Request }
     * 
     * 
     */
    public List<AggregatedRequest.Request> getRequest() {
        if (request == null) {
            request = new ArrayList<AggregatedRequest.Request>();
        }
        return this.request;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="operation" type="{http://www.onem2m.org/xml/protocols}operation"/>
     *         &lt;element name="to" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
     *         &lt;element name="from" type="{http://www.onem2m.org/xml/protocols}ID"/>
     *         &lt;element name="requestIdentifier" type="{http://www.onem2m.org/xml/protocols}requestID"/>
     *         &lt;element name="primitiveContent" type="{http://www.onem2m.org/xml/protocols}primitiveContent" minOccurs="0"/>
     *         &lt;element name="metaInformation" type="{http://www.onem2m.org/xml/protocols}metaInformation" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "operation",
        "to",
        "from",
        "requestIdentifier",
        "primitiveContent",
        "metaInformation"
    })
    public static class Request {

        @XmlElement(required = true)
        protected BigInteger operation;
        @XmlElement(required = true)
        @XmlSchemaType(name = "anyURI")
        protected String to;
        @XmlElement(required = true)
        protected String from;
        @XmlElement(required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String requestIdentifier;
        protected PrimitiveContent primitiveContent;
        protected MetaInformation metaInformation;

        /**
         * Gets the value of the operation property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getOperation() {
            return operation;
        }

        /**
         * Sets the value of the operation property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setOperation(BigInteger value) {
            this.operation = value;
        }

        /**
         * Gets the value of the to property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTo() {
            return to;
        }

        /**
         * Sets the value of the to property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTo(String value) {
            this.to = value;
        }

        /**
         * Gets the value of the from property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFrom() {
            return from;
        }

        /**
         * Sets the value of the from property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFrom(String value) {
            this.from = value;
        }

        /**
         * Gets the value of the requestIdentifier property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRequestIdentifier() {
            return requestIdentifier;
        }

        /**
         * Sets the value of the requestIdentifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRequestIdentifier(String value) {
            this.requestIdentifier = value;
        }

        /**
         * Gets the value of the primitiveContent property.
         * 
         * @return
         *     possible object is
         *     {@link PrimitiveContent }
         *     
         */
        public PrimitiveContent getPrimitiveContent() {
            return primitiveContent;
        }

        /**
         * Sets the value of the primitiveContent property.
         * 
         * @param value
         *     allowed object is
         *     {@link PrimitiveContent }
         *     
         */
        public void setPrimitiveContent(PrimitiveContent value) {
            this.primitiveContent = value;
        }

        /**
         * Gets the value of the metaInformation property.
         * 
         * @return
         *     possible object is
         *     {@link MetaInformation }
         *     
         */
        public MetaInformation getMetaInformation() {
            return metaInformation;
        }

        /**
         * Sets the value of the metaInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link MetaInformation }
         *     
         */
        public void setMetaInformation(MetaInformation value) {
            this.metaInformation = value;
        }

    }

}
