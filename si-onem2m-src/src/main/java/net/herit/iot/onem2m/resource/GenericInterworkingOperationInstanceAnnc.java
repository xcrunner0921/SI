//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.07 at 09:56:03 AM KST 
//


package net.herit.iot.onem2m.resource;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.onem2m.org/xml/protocols}announcedFlexContainerResource">
 *       &lt;sequence>
 *         &lt;element name="operationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="operationState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inputDataPointLinks" type="{http://www.onem2m.org/xml/protocols}listOfDataLinks" minOccurs="0"/>
 *         &lt;element name="outputDataPointLinks" type="{http://www.onem2m.org/xml/protocols}listOfDataLinks" minOccurs="0"/>
 *         &lt;element name="inputLinks" type="{http://www.onem2m.org/xml/protocols}listOfDataLinks" minOccurs="0"/>
 *         &lt;element name="outputLinks" type="{http://www.onem2m.org/xml/protocols}listOfDataLinks" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="childResource" type="{http://www.onem2m.org/xml/protocols}childResourceRef" maxOccurs="unbounded"/>
 *           &lt;choice maxOccurs="unbounded">
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}semanticDescriptor"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}semanticDescriptorAnnc"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}subscription"/>
 *           &lt;/choice>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "operationName",
    "operationState",
    "inputDataPointLinks",
    "outputDataPointLinks",
    "inputLinks",
    "outputLinks",
    "childResource",
    "semanticDescriptorOrSemanticDescriptorAnncOrSubscription"
})

@XmlRootElement(name = Naming.GENERICINTERWORKINGOPERATIONINSTANCEANNC_SN)
public class GenericInterworkingOperationInstanceAnnc
    extends AnnouncedFlexContainerResource
{

	@XmlElement(name = Naming.OPERATIONNAME_SN)
    protected String operationName;
	@XmlElement(name = Naming.OPERATIONSTATE_SN)
    protected String operationState;
	@XmlElement(name = Naming.INPUTDATAPOINTLINKS_SN)
    protected ListOfDataLinks inputDataPointLinks;
	@XmlElement(name = Naming.OUTPUTDATAPOINTLINKS_SN)
    protected ListOfDataLinks outputDataPointLinks;
	@XmlElement(name = Naming.INPUTLINKS_SN)
    protected ListOfDataLinks inputLinks;
	@XmlElement(name = Naming.OUTPUTLINKS_SN)
    protected ListOfDataLinks outputLinks;
	@XmlElement(name = Naming.CHILDRESOURCE_SN)
    protected List<ChildResourceRef> childResource;
    @XmlElements({
    	@XmlElement(name = "semanticDescriptor", namespace = "http://www.onem2m.org/xml/protocols", type = SemanticDescriptor.class),
        @XmlElement(name = "semanticDescriptorAnnc", namespace = "http://www.onem2m.org/xml/protocols", type = SemanticDescriptorAnnc.class),
        @XmlElement(name = "subscription", namespace = "http://www.onem2m.org/xml/protocols", type = Subscription.class)
    })
    protected List<Resource> semanticDescriptorOrSemanticDescriptorAnncOrSubscription;

    /**
     * Gets the value of the operationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationName() {
        return operationName;
    }

    /**
     * Sets the value of the operationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationName(String value) {
        this.operationName = value;
    }

    /**
     * Gets the value of the operationState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationState() {
        return operationState;
    }

    /**
     * Sets the value of the operationState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationState(String value) {
        this.operationState = value;
    }

    /**
     * Gets the value of the inputDataPointLinks property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfDataLinks }
     *     
     */
    public ListOfDataLinks getInputDataPointLinks() {
        return inputDataPointLinks;
    }

    /**
     * Sets the value of the inputDataPointLinks property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfDataLinks }
     *     
     */
    public void setInputDataPointLinks(ListOfDataLinks value) {
        this.inputDataPointLinks = value;
    }

    /**
     * Gets the value of the outputDataPointLinks property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfDataLinks }
     *     
     */
    public ListOfDataLinks getOutputDataPointLinks() {
        return outputDataPointLinks;
    }

    /**
     * Sets the value of the outputDataPointLinks property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfDataLinks }
     *     
     */
    public void setOutputDataPointLinks(ListOfDataLinks value) {
        this.outputDataPointLinks = value;
    }

    /**
     * Gets the value of the inputLinks property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfDataLinks }
     *     
     */
    public ListOfDataLinks getInputLinks() {
        return inputLinks;
    }

    /**
     * Sets the value of the inputLinks property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfDataLinks }
     *     
     */
    public void setInputLinks(ListOfDataLinks value) {
        this.inputLinks = value;
    }

    /**
     * Gets the value of the outputLinks property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfDataLinks }
     *     
     */
    public ListOfDataLinks getOutputLinks() {
        return outputLinks;
    }

    /**
     * Sets the value of the outputLinks property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfDataLinks }
     *     
     */
    public void setOutputLinks(ListOfDataLinks value) {
        this.outputLinks = value;
    }

    /**
     * Gets the value of the childResource property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the childResource property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChildResource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChildResourceRef }
     * 
     * 
     */
    public List<ChildResourceRef> getChildResource() {
      //  if (childResource == null) {
      //      childResource = new ArrayList<ChildResourceRef>();
      //  }
        return this.childResource;
    }
    
    public void addChildResource(ChildResourceRef value) {
    	if (childResource == null) {
    		childResource = new ArrayList<ChildResourceRef>();
    	}
    	this.childResource.add(value);
    }

    /**
     * Gets the value of the semanticDescriptorOrSemanticDescriptorAnncOrSubscription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the semanticDescriptorOrSemanticDescriptorAnncOrSubscription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSemanticDescriptorOrSemanticDescriptorAnncOrSubscription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SemanticDescriptor }
     * {@link SemanticDescriptorAnnc }
     * {@link Subscription }
     * 
     * 
     */
    public List<Resource> getSemanticDescriptorOrSemanticDescriptorAnncOrSubscription() {
      //  if (semanticDescriptorOrSemanticDescriptorAnncOrSubscription == null) {
      //      semanticDescriptorOrSemanticDescriptorAnncOrSubscription = new ArrayList<Resource>();
      //  }
        return this.semanticDescriptorOrSemanticDescriptorAnncOrSubscription;
    }
    
    public void addSemanticDescriptorOrSemanticDescriptorAnncOrSubscription(Resource value) {
    	if (semanticDescriptorOrSemanticDescriptorAnncOrSubscription == null) {
    		semanticDescriptorOrSemanticDescriptorAnncOrSubscription = new ArrayList<Resource>();
    	}
    	this.semanticDescriptorOrSemanticDescriptorAnncOrSubscription.add(value);
    }

}