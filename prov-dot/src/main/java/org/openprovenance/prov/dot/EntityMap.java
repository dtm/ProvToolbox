//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.08.05 at 10:17:37 PM BST 
//


package org.openprovenance.prov.dot;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.openprovenance.apache.commons.lang.builder.EqualsBuilder;
import org.openprovenance.apache.commons.lang.builder.HashCodeBuilder;
import org.openprovenance.apache.commons.lang.builder.ToStringBuilder;
import org.openprovenance.prov.xml.builder.Equals;
import org.openprovenance.prov.xml.builder.HashCode;
import org.openprovenance.prov.xml.builder.ToString;
import org.openprovenance.prov.xml.builder.JAXBEqualsBuilder;
import org.openprovenance.prov.xml.builder.JAXBHashCodeBuilder;
import org.openprovenance.prov.xml.builder.JAXBToStringBuilder;



/**
 * <p>Java class for EntityMap complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityMap">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entity" type="{http://openprovenance.org/model/opmPrinterConfig}EntityMapEntry" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="displayValue" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="coloredAsAccount" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityMap", namespace = "http://openprovenance.org/model/opmPrinterConfig", propOrder = {
    "entity"
})
public class EntityMap
    implements Equals, HashCode, ToStringBuilder
{

    @XmlElement(namespace = "http://openprovenance.org/model/opmPrinterConfig")
    protected List<EntityMapEntry> entity;
    @XmlAttribute(name = "displayValue")
    protected Boolean displayValue;
    @XmlAttribute(name = "coloredAsAccount")
    protected Boolean coloredAsAccount;

    /**
     * Gets the value of the entity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityMapEntry }
     * 
     * 
     */
    public List<EntityMapEntry> getEntity() {
        if (entity == null) {
            entity = new ArrayList<EntityMapEntry>();
        }
        return this.entity;
    }

    /**
     * Gets the value of the displayValue property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisplayValue() {
        return displayValue;
    }

    /**
     * Sets the value of the displayValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisplayValue(Boolean value) {
        this.displayValue = value;
    }

    /**
     * Gets the value of the coloredAsAccount property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isColoredAsAccount() {
        return coloredAsAccount;
    }

    /**
     * Sets the value of the coloredAsAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setColoredAsAccount(Boolean value) {
        this.coloredAsAccount = value;
    }

    public void equals(Object object, EqualsBuilder equalsBuilder) {
        if (!(object instanceof EntityMap)) {
            equalsBuilder.appendSuper(false);
            return ;
        }
        if (this == object) {
            return ;
        }
        final EntityMap that = ((EntityMap) object);
        equalsBuilder.append(this.getEntity(), that.getEntity());
        equalsBuilder.append(this.isDisplayValue(), that.isDisplayValue());
        equalsBuilder.append(this.isColoredAsAccount(), that.isColoredAsAccount());
    }

    public boolean equals(Object object) {
        if (!(object instanceof EntityMap)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final EqualsBuilder equalsBuilder = new JAXBEqualsBuilder();
        equals(object, equalsBuilder);
        return equalsBuilder.isEquals();
    }

    public void hashCode(HashCodeBuilder hashCodeBuilder) {
        hashCodeBuilder.append(this.getEntity());
        hashCodeBuilder.append(this.isDisplayValue());
        hashCodeBuilder.append(this.isColoredAsAccount());
    }

    public int hashCode() {
        final HashCodeBuilder hashCodeBuilder = new JAXBHashCodeBuilder();
        hashCode(hashCodeBuilder);
        return hashCodeBuilder.toHashCode();
    }

    public void toString(ToStringBuilder toStringBuilder) {
        {
            List<EntityMapEntry> theEntity;
            theEntity = this.getEntity();
            toStringBuilder.append("entity", theEntity);
        }
        {
            Boolean theDisplayValue;
            theDisplayValue = this.isDisplayValue();
            toStringBuilder.append("displayValue", theDisplayValue);
        }
        {
            Boolean theColoredAsAccount;
            theColoredAsAccount = this.isColoredAsAccount();
            toStringBuilder.append("coloredAsAccount", theColoredAsAccount);
        }
    }

    public String toString() {
        final ToStringBuilder toStringBuilder = new JAXBToStringBuilder(this);
        toString(toStringBuilder);
        return toStringBuilder.toString();
    }

}
