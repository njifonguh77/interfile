package za.co.interfile.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author elias
 */
@Entity
@Table(name = "address_details")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AddressDetails.findAll", query = "SELECT a FROM AddressDetails a"),
    @NamedQuery(name = "AddressDetails.findById", query = "SELECT a FROM AddressDetails a WHERE a.id = :id")})
public class AddressDetails implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "addressDetails")
    private List<AccountHolderDetails> accountHolderDetailsList;
    @JoinColumn(name = "address", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Address address;

    public AddressDetails() {
    }

    public AddressDetails(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @XmlTransient
    public List<AccountHolderDetails> getAccountHolderDetailsList() {
        return accountHolderDetailsList;
    }

    public void setAccountHolderDetailsList(List<AccountHolderDetails> accountHolderDetailsList) {
        this.accountHolderDetailsList = accountHolderDetailsList;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
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
        if (!(object instanceof AddressDetails)) {
            return false;
        }
        AddressDetails other = (AddressDetails) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "za.co.interfile.entities.AddressDetails[ id=" + id + " ]";
    }
    
}
