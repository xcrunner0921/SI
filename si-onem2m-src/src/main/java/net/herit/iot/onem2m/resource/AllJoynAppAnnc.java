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

import net.herit.iot.message.onem2m.OneM2mRequest.OPERATION;
import net.herit.iot.message.onem2m.OneM2mResponse.RESPONSE_STATUS;
import net.herit.iot.onem2m.core.util.OneM2MException;


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
 *         &lt;element name="direction" type="{http://www.onem2m.org/xml/protocols}allJoynDirection"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="childResource" type="{http://www.onem2m.org/xml/protocols}childResourceRef" maxOccurs="unbounded"/>
 *           &lt;choice maxOccurs="unbounded" minOccurs="0">
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}semanticDescriptor"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}semanticDescriptorAnnc"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}subscription"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}allJoynSvcObject"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}allJoynSvcObjectAnnc"/>
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
    "direction",
    "childResource",
    "semanticDescriptorOrSemanticDescriptorAnncOrSubscription"
})

@XmlRootElement(name = Naming.ALLJOYNAPPANNC_SN)
public class AllJoynAppAnnc
    extends AnnouncedFlexContainerResource
{

   // @XmlElement(required = true)
    @XmlElement(name = Naming.DIRECTION_SN, required = true)
    protected Integer direction;
    @XmlElement(name = Naming.CHILDRESOURCE_SN)
    protected List<ChildResourceRef> childResource;
    @XmlElements({
        @XmlElement(name = "semanticDescriptor", namespace = "http://www.onem2m.org/xml/protocols", type = SemanticDescriptor.class),
        @XmlElement(name = "semanticDescriptorAnnc", namespace = "http://www.onem2m.org/xml/protocols", type = SemanticDescriptorAnnc.class),
        @XmlElement(name = "subscription", namespace = "http://www.onem2m.org/xml/protocols", type = Subscription.class),
        @XmlElement(name = "allJoynSvcObject", namespace = "http://www.onem2m.org/xml/protocols", type = AllJoynSvcObject.class),
        @XmlElement(name = "allJoynSvcObjectAnnc", namespace = "http://www.onem2m.org/xml/protocols", type = AllJoynSvcObjectAnnc.class)
    })
    protected List<Object> semanticDescriptorOrSemanticDescriptorAnncOrSubscription;

    /**
     * Gets the value of the direction property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDirection() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDirection(Integer value) {
        this.direction = value;
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
     * {@link AllJoynSvcObject }
     * {@link AllJoynSvcObjectAnnc }
     * 
     * 
     */
    public List<Object> getSemanticDescriptorOrSemanticDescriptorAnncOrSubscription() {
      //  if (semanticDescriptorOrSemanticDescriptorAnncOrSubscription == null) {
      //      semanticDescriptorOrSemanticDescriptorAnncOrSubscription = new ArrayList<Object>();
      //  }
        return this.semanticDescriptorOrSemanticDescriptorAnncOrSubscription;
    }
    
    public void addSemanticDescriptorOrSemanticDescriptorAnncOrSubscription(Object value) {
    	if (semanticDescriptorOrSemanticDescriptorAnncOrSubscription == null) {
    		semanticDescriptorOrSemanticDescriptorAnncOrSubscription = new ArrayList<Object>();
    	}
    	this.semanticDescriptorOrSemanticDescriptorAnncOrSubscription.add(value);
    }

}
