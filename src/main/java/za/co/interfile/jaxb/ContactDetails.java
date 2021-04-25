package za.co.interfile.jaxb;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}mobile"/>
 *         &lt;element ref="{}home"/>
 *         &lt;element ref="{}work"/>
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
    "mobile",
    "home",
    "work"
})
@XmlRootElement(name = "contactDetails")
public class ContactDetails {

    @XmlElement(required = true)
    protected BigInteger mobile;
    @XmlElement(required = true)
    protected String home;
    @XmlElement(required = true)
    protected String work;

    /**
     * Gets the value of the mobile property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMobile() {
        return mobile;
    }

    /**
     * Sets the value of the mobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMobile(BigInteger value) {
        this.mobile = value;
    }

    /**
     * Gets the value of the home property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHome() {
        return home;
    }

    /**
     * Sets the value of the home property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHome(String value) {
        this.home = value;
    }

    /**
     * Gets the value of the work property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWork() {
        return work;
    }

    /**
     * Sets the value of the work property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWork(String value) {
        this.work = value;
    }

}
