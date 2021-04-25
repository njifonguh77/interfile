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
 *         &lt;element ref="{}accountNumber"/>
 *         &lt;element ref="{}accountHolderName"/>
 *         &lt;element ref="{}accountHolderIDNumber"/>
 *         &lt;element ref="{}accountHolderDetails"/>
 *         &lt;element ref="{}bills"/>
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
    "accountNumber",
    "accountHolderName",
    "accountHolderIDNumber",
    "accountHolderDetails",
    "bills"
})
@XmlRootElement(name = "account")
public class Account {

    @XmlElement(required = true)
    protected BigInteger accountNumber;
    @XmlElement(required = true)
    protected String accountHolderName;
    @XmlElement(required = true)
    protected BigInteger accountHolderIDNumber;
    @XmlElement(required = true)
    protected AccountHolderDetails accountHolderDetails;
    @XmlElement(required = true)
    protected Bills bills;

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAccountNumber(BigInteger value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the accountHolderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountHolderName() {
        return accountHolderName;
    }

    /**
     * Sets the value of the accountHolderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountHolderName(String value) {
        this.accountHolderName = value;
    }

    /**
     * Gets the value of the accountHolderIDNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAccountHolderIDNumber() {
        return accountHolderIDNumber;
    }

    /**
     * Sets the value of the accountHolderIDNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAccountHolderIDNumber(BigInteger value) {
        this.accountHolderIDNumber = value;
    }

    /**
     * Gets the value of the accountHolderDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AccountHolderDetails }
     *     
     */
    public AccountHolderDetails getAccountHolderDetails() {
        return accountHolderDetails;
    }

    /**
     * Sets the value of the accountHolderDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountHolderDetails }
     *     
     */
    public void setAccountHolderDetails(AccountHolderDetails value) {
        this.accountHolderDetails = value;
    }

    /**
     * Gets the value of the bills property.
     * 
     * @return
     *     possible object is
     *     {@link Bills }
     *     
     */
    public Bills getBills() {
        return bills;
    }

    /**
     * Sets the value of the bills property.
     * 
     * @param value
     *     allowed object is
     *     {@link Bills }
     *     
     */
    public void setBills(Bills value) {
        this.bills = value;
    }

}
