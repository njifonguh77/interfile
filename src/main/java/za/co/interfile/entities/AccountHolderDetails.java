package za.co.interfile.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author elias
 */
@Entity
@Table(name = "account_holder_details")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AccountHolderDetails.findAll", query = "SELECT a FROM AccountHolderDetails a"),
    @NamedQuery(name = "AccountHolderDetails.findById", query = "SELECT a FROM AccountHolderDetails a WHERE a.id = :id")})
public class AccountHolderDetails implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @JoinColumn(name = "account", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Account account;
    @JoinColumn(name = "address_details", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private AddressDetails addressDetails;
    @JoinColumn(name = "contact_detials", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private ContactDetails contactDetials;

    public AccountHolderDetails() {
    }

    public AccountHolderDetails(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public AddressDetails getAddressDetails() {
        return addressDetails;
    }

    public void setAddressDetails(AddressDetails addressDetails) {
        this.addressDetails = addressDetails;
    }

    public ContactDetails getContactDetials() {
        return contactDetials;
    }

    public void setContactDetials(ContactDetails contactDetials) {
        this.contactDetials = contactDetials;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AccountHolderDetails)) {
            return false;
        }
        AccountHolderDetails other = (AccountHolderDetails) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "za.co.interfile.entities.AccountHolderDetails[ id=" + id + " ]";
    }
    
}
