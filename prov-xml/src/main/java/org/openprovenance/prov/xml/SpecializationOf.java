//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.04 at 09:11:18 PM GMT 
//


package org.openprovenance.prov.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 * <p>Java class for Specialization complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Specialization">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="specificEntity" type="{http://www.w3.org/ns/prov#}IDRef"/>
 *         &lt;element name="generalEntity" type="{http://www.w3.org/ns/prov#}IDRef"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Specialization", propOrder = {
    "specificEntity",
    "generalEntity"
})
public class SpecializationOf implements Equals, HashCode, ToString, org.openprovenance.prov.model.SpecializationOf
{

    @javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter(IDRefAdapter.class)
    @XmlElement(required = true, type = org.openprovenance.prov.xml.IDRef.class)
    protected org.openprovenance.prov.model.QualifiedName specificEntity;

    @javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter(IDRefAdapter.class)
    @XmlElement(required = true, type = org.openprovenance.prov.xml.IDRef.class)
    protected org.openprovenance.prov.model.QualifiedName generalEntity;

    /**
     * Gets the value of the specificEntity property.
     * 
     * @return
     *     possible object is
     *     {@link org.openprovenance.prov.xml.QualifiedName }
     *     
     */
    public org.openprovenance.prov.model.QualifiedName getSpecificEntity() {
        return specificEntity;
    }

    /**
     * Sets the value of the specificEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.openprovenance.prov.xml.QualifiedName }
     *     
     */
    public void setSpecificEntity(org.openprovenance.prov.model.QualifiedName value) {
        this.specificEntity = value;
    }

    /**
     * Gets the value of the generalEntity property.
     * 
     * @return
     *     possible object is
     *     {@link org.openprovenance.prov.xml.QualifiedName }
     *     
     */
    public org.openprovenance.prov.model.QualifiedName getGeneralEntity() {
        return generalEntity;
    }

    /**
     * Sets the value of the generalEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.openprovenance.prov.xml.QualifiedName }
     *     
     */
    public void setGeneralEntity(org.openprovenance.prov.model.QualifiedName value) {
        this.generalEntity = value;
    }

    public void equals(Object object, EqualsBuilder equalsBuilder) {
        if (!(object instanceof SpecializationOf)) {
            equalsBuilder.appendSuper(false);
            return ;
        }
        if (this == object) {
            return ;
        }
        final SpecializationOf that = ((SpecializationOf) object);
        equalsBuilder.append(this.getSpecificEntity(), that.getSpecificEntity());
        equalsBuilder.append(this.getGeneralEntity(), that.getGeneralEntity());
    }

    public boolean equals(Object object) {
        if (!(object instanceof SpecializationOf)) {
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
        hashCodeBuilder.append(this.getSpecificEntity());
        hashCodeBuilder.append(this.getGeneralEntity());
    }

    public int hashCode() {
        final HashCodeBuilder hashCodeBuilder = new JAXBHashCodeBuilder();
        hashCode(hashCodeBuilder);
        return hashCodeBuilder.toHashCode();
    }

    public void toString(ToStringBuilder toStringBuilder) {
        {
            org.openprovenance.prov.model.QualifiedName theSpecificEntity;
            theSpecificEntity = this.getSpecificEntity();
            toStringBuilder.append("specificEntity", theSpecificEntity);
        }
        {
            org.openprovenance.prov.model.QualifiedName theGeneralEntity;
            theGeneralEntity = this.getGeneralEntity();
            toStringBuilder.append("generalEntity", theGeneralEntity);
        }
    }

    public String toString() {
        final ToStringBuilder toStringBuilder = new JAXBToStringBuilder(this);
        toString(toStringBuilder);
        return toStringBuilder.toString();
    }
    

    public Kind getKind() {
   	return org.openprovenance.prov.model.StatementOrBundle.Kind.PROV_SPECIALIZATION;
    }


}
