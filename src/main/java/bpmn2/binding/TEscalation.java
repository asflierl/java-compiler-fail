//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.6 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.07.11 at 10:23:09 AM CEST 
//


package bpmn2.binding;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>Java class for tEscalation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tEscalation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tRootElement"&gt;
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="escalationCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="structureRef" type="{http://www.w3.org/2001/XMLSchema}QName" /&gt;
 *       &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tEscalation")
public class TEscalation
    extends TRootElement
{

    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "escalationCode")
    protected String escalationCode;
    @XmlAttribute(name = "structureRef")
    protected QName structureRef;

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

    /**
     * Gets the value of the escalationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEscalationCode() {
        return escalationCode;
    }

    /**
     * Sets the value of the escalationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEscalationCode(String value) {
        this.escalationCode = value;
    }

    /**
     * Gets the value of the structureRef property.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getStructureRef() {
        return structureRef;
    }

    /**
     * Sets the value of the structureRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setStructureRef(QName value) {
        this.structureRef = value;
    }

}
