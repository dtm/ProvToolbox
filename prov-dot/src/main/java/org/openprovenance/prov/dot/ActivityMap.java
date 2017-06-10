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
 * <p>Java class for ActivityMap complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActivityMap">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="activity" type="{http://openprovenance.org/model/opmPrinterConfig}ActivityMapEntry" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "ActivityMap", namespace = "http://openprovenance.org/model/opmPrinterConfig", propOrder = {
    "activity"
})
public class ActivityMap
    implements Equals, HashCode, ToStringBuilder
{

    @XmlElement(namespace = "http://openprovenance.org/model/opmPrinterConfig")
    protected List<ActivityMapEntry> activity;
    @XmlAttribute(name = "displayValue")
    protected Boolean displayValue;
    @XmlAttribute(name = "coloredAsAccount")
    protected Boolean coloredAsAccount;

    /**
     * Gets the value of the activity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the activity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActivity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActivityMapEntry }
     * 
     * 
     */
    public List<ActivityMapEntry> getActivity() {
        if (activity == null) {
            activity = new ArrayList<ActivityMapEntry>();
        }
        return this.activity;
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
        if (!(object instanceof ActivityMap)) {
            equalsBuilder.appendSuper(false);
            return ;
        }
        if (this == object) {
            return ;
        }
        final ActivityMap that = ((ActivityMap) object);
        equalsBuilder.append(this.getActivity(), that.getActivity());
        equalsBuilder.append(this.isDisplayValue(), that.isDisplayValue());
        equalsBuilder.append(this.isColoredAsAccount(), that.isColoredAsAccount());
    }

    public boolean equals(Object object) {
        if (!(object instanceof ActivityMap)) {
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
        hashCodeBuilder.append(this.getActivity());
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
            List<ActivityMapEntry> theActivity;
            theActivity = this.getActivity();
            toStringBuilder.append("activity", theActivity);
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
