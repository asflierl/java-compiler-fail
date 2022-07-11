//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.6 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.07.11 at 10:23:09 AM CEST 
//


package bpmn2.binding;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>Java class for tCallableElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tCallableElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tRootElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="supportedInterfaceRef" type="{http://www.w3.org/2001/XMLSchema}QName" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}ioSpecification" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}ioBinding" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tCallableElement", propOrder = {
    "supportedInterfaceRef",
    "ioSpecification",
    "ioBinding"
})
@XmlSeeAlso({
    TGlobalTask.class,
    TProcess.class
})
public class TCallableElement
    extends TRootElement
{

    protected List<QName> supportedInterfaceRef;
    protected TInputOutputSpecification ioSpecification;
    protected List<TInputOutputBinding> ioBinding;
    @XmlAttribute(name = "name")
    protected String name;

    /**
     * Gets the value of the supportedInterfaceRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportedInterfaceRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupportedInterfaceRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QName }
     * 
     * 
     */
    public List<QName> getSupportedInterfaceRef() {
        if (supportedInterfaceRef == null) {
            supportedInterfaceRef = new ArrayList<QName>();
        }
        return this.supportedInterfaceRef;
    }

    /**
     * Gets the value of the ioSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link TInputOutputSpecification }
     *     
     */
    public TInputOutputSpecification getIoSpecification() {
        return ioSpecification;
    }

    /**
     * Sets the value of the ioSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link TInputOutputSpecification }
     *     
     */
    public void setIoSpecification(TInputOutputSpecification value) {
        this.ioSpecification = value;
    }

    /**
     * Gets the value of the ioBinding property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ioBinding property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIoBinding().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TInputOutputBinding }
     * 
     * 
     */
    public List<TInputOutputBinding> getIoBinding() {
        if (ioBinding == null) {
            ioBinding = new ArrayList<TInputOutputBinding>();
        }
        return this.ioBinding;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
