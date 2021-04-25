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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author elias
 */
@Entity
@Table(name = "statement")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Statement.findAll", query = "SELECT s FROM Statement s"),
    @NamedQuery(name = "Statement.findById", query = "SELECT s FROM Statement s WHERE s.id = :id"),
    @NamedQuery(name = "Statement.findByReference", query = "SELECT s FROM Statement s WHERE s.reference = :reference")})
public class Statement implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "reference")
    private String reference;
    @JoinColumn(name = "account", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Account account;

    public Statement() {
    }

    public Statement(Integer id) {
        this.id = id;
    }

    public Statement(Integer id, String reference) {
        this.id = id;
        this.reference = reference;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
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
        if (!(object instanceof Statement)) {
            return false;
        }
        Statement other = (Statement) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "za.co.interfile.entities.Statement[ id=" + id + " ]";
    }
    
}
