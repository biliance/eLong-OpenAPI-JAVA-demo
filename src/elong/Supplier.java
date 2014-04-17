//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.17 at 05:19:22 PM CST 
//


package elong;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement; 
import java.util.List; 
import com.alibaba.fastjson.annotation.JSONField;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Supplier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Supplier">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HelpfulTips" type="{}HelpFulTip" minOccurs="0"/>
 *         &lt;element name="AvailPolicy" type="{}AvailPolicy" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="InstantRoomTypes" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Status" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="WeekendStart" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="WeekendEnd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Supplier", propOrder = {
    "helpfulTips",
    "availPolicy"
})
public class Supplier {

    @JSONField(name = "HelpfulTips")
    protected HelpFulTip helpfulTips;
    @JSONField(name = "AvailPolicy")
    protected AvailPolicy availPolicy;
    @XmlAttribute(name = "InstantRoomTypes")
    protected String instantRoomTypes;
    @XmlAttribute(name = "Status")
    protected boolean status;
    @XmlAttribute(name = "HotelCode")
    protected String hotelCode;
    @XmlAttribute(name = "WeekendStart")
    protected String weekendStart;
    @XmlAttribute(name = "WeekendEnd")
    protected String weekendEnd;

    /**
     * Gets the value of the helpfulTips property.
     * 
     * @return
     *     possible object is
     *     {@link HelpFulTip }
     *     
     */
    public HelpFulTip getHelpfulTips() {
        return helpfulTips;
    }

    /**
     * Sets the value of the helpfulTips property.
     * 
     * @param value
     *     allowed object is
     *     {@link HelpFulTip }
     *     
     */
    public void setHelpfulTips(HelpFulTip value) {
        this.helpfulTips = value;
    }

    /**
     * Gets the value of the availPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link AvailPolicy }
     *     
     */
    public AvailPolicy getAvailPolicy() {
        return availPolicy;
    }

    /**
     * Sets the value of the availPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvailPolicy }
     *     
     */
    public void setAvailPolicy(AvailPolicy value) {
        this.availPolicy = value;
    }

    /**
     * Gets the value of the instantRoomTypes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstantRoomTypes() {
        return instantRoomTypes;
    }

    /**
     * Sets the value of the instantRoomTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstantRoomTypes(String value) {
        this.instantRoomTypes = value;
    }

    /**
     * Gets the value of the status property.
     * 
     */
    public boolean isStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     */
    public void setStatus(boolean value) {
        this.status = value;
    }

    /**
     * Gets the value of the hotelCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelCode() {
        return hotelCode;
    }

    /**
     * Sets the value of the hotelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelCode(String value) {
        this.hotelCode = value;
    }

    /**
     * Gets the value of the weekendStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeekendStart() {
        return weekendStart;
    }

    /**
     * Sets the value of the weekendStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeekendStart(String value) {
        this.weekendStart = value;
    }

    /**
     * Gets the value of the weekendEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeekendEnd() {
        return weekendEnd;
    }

    /**
     * Sets the value of the weekendEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeekendEnd(String value) {
        this.weekendEnd = value;
    }

}
