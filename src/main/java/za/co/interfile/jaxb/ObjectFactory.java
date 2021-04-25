package za.co.interfile.jaxb;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the general package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Period_QNAME = new QName("", "period");
    private final static QName _Outstanding_QNAME = new QName("", "outstanding");
    private final static QName _Work_QNAME = new QName("", "work");
    private final static QName _PostalCode_QNAME = new QName("", "postalCode");
    private final static QName _DueDate_QNAME = new QName("", "dueDate");
    private final static QName _Mobile_QNAME = new QName("", "mobile");
    private final static QName _BillDate_QNAME = new QName("", "billDate");
    private final static QName _AccountNumber_QNAME = new QName("", "accountNumber");
    private final static QName _AccountHolderName_QNAME = new QName("", "accountHolderName");
    private final static QName _AccountHolderIDNumber_QNAME = new QName("", "accountHolderIDNumber");
    private final static QName _Home_QNAME = new QName("", "home");
    private final static QName _Charges_QNAME = new QName("", "charges");
    private final static QName _Line3_QNAME = new QName("", "line3");
    private final static QName _Line2_QNAME = new QName("", "line2");
    private final static QName _Line1_QNAME = new QName("", "line1");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: general
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link Bill }
     * 
     */
    public Bill createBill() {
        return new Bill();
    }

    /**
     * Create an instance of {@link Statements }
     * 
     */
    public Statements createStatements() {
        return new Statements();
    }

    /**
     * Create an instance of {@link Statement }
     * 
     */
    public Statement createStatement() {
        return new Statement();
    }

    /**
     * Create an instance of {@link Account }
     * 
     */
    public Account createAccount() {
        return new Account();
    }

    /**
     * Create an instance of {@link AccountHolderDetails }
     * 
     */
    public AccountHolderDetails createAccountHolderDetails() {
        return new AccountHolderDetails();
    }

    /**
     * Create an instance of {@link ContactDetails }
     * 
     */
    public ContactDetails createContactDetails() {
        return new ContactDetails();
    }

    /**
     * Create an instance of {@link AddressDetails }
     * 
     */
    public AddressDetails createAddressDetails() {
        return new AddressDetails();
    }

    /**
     * Create an instance of {@link Bills }
     * 
     */
    public Bills createBills() {
        return new Bills();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "period")
    public JAXBElement<String> createPeriod(String value) {
        return new JAXBElement<String>(_Period_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "outstanding")
    public JAXBElement<BigDecimal> createOutstanding(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Outstanding_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "work")
    public JAXBElement<String> createWork(String value) {
        return new JAXBElement<String>(_Work_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "postalCode")
    public JAXBElement<BigInteger> createPostalCode(BigInteger value) {
        return new JAXBElement<BigInteger>(_PostalCode_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "dueDate")
    public JAXBElement<XMLGregorianCalendar> createDueDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DueDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "mobile")
    public JAXBElement<BigInteger> createMobile(BigInteger value) {
        return new JAXBElement<BigInteger>(_Mobile_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "billDate")
    public JAXBElement<XMLGregorianCalendar> createBillDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_BillDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "accountNumber")
    public JAXBElement<BigInteger> createAccountNumber(BigInteger value) {
        return new JAXBElement<BigInteger>(_AccountNumber_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "accountHolderName")
    public JAXBElement<String> createAccountHolderName(String value) {
        return new JAXBElement<String>(_AccountHolderName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "accountHolderIDNumber")
    public JAXBElement<BigInteger> createAccountHolderIDNumber(BigInteger value) {
        return new JAXBElement<BigInteger>(_AccountHolderIDNumber_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "home")
    public JAXBElement<String> createHome(String value) {
        return new JAXBElement<String>(_Home_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "charges")
    public JAXBElement<BigDecimal> createCharges(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Charges_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "line3")
    public JAXBElement<String> createLine3(String value) {
        return new JAXBElement<String>(_Line3_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "line2")
    public JAXBElement<String> createLine2(String value) {
        return new JAXBElement<String>(_Line2_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "line1")
    public JAXBElement<String> createLine1(String value) {
        return new JAXBElement<String>(_Line1_QNAME, String.class, null, value);
    }

}
