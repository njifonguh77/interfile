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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author elias
 */
@Entity
@Table(name = "contact_details")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ContactDetails.findAll", query = "SELECT c FROM ContactDetails c"),
    @NamedQuery(name = "ContactDetails.findById", query = "SELECT c FROM ContactDetails c WHERE c.id = :id"),
    @NamedQuery(name = "ContactDetails.findByHome", query = "SELECT c FROM ContactDetails c WHERE c.home = :home"),
    @NamedQuery(name = "ContactDetails.findByMobile", query = "SELECT c FROM ContactDetails c WHERE c.mobile = :mobile"),
    @NamedQuery(name = "ContactDetails.findByWork", query = "SELECT c FROM ContactDetails c WHERE c.work = :work")})
public class ContactDetails implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 10)
    @Column(name = "home")
    private String home;
    @Basic(optional = false)
    @NotNull
    @Column(name = "mobile")
    private long mobile;
    @Size(max = 10)
    @Column(name = "work")
    private String work;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "contactDetials")
    private List<AccountHolderDetails> accountHolderDetailsList;

    public ContactDetails() {
    }

    public ContactDetails(Integer id) {
        this.id = id;
    }

    public ContactDetails(Integer id, long mobile) {
        this.id = id;
        this.mobile = mobile;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    @XmlTransient
    public List<AccountHolderDetails> getAccountHolderDetailsList() {
        return accountHolderDetailsList;
    }

    public void setAccountHolderDetailsList(List<AccountHolderDetails> accountHolderDetailsList) {
        this.accountHolderDetailsList = accountHolderDetailsList;
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
        if (!(object instanceof ContactDetails)) {
            return false;
        }
        ContactDetails other = (ContactDetails) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "za.co.interfile.entities.ContactDetails[ id=" + id + " ]";
    }
    
}
