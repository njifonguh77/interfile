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
@Table(name = "account")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Account.findAll", query = "SELECT a FROM Account a"),
    @NamedQuery(name = "Account.findById", query = "SELECT a FROM Account a WHERE a.id = :id"),
    @NamedQuery(name = "Account.findByAccountHolderIdNumber", query = "SELECT a FROM Account a WHERE a.accountHolderIdNumber = :accountHolderIdNumber"),
    @NamedQuery(name = "Account.findByAccountHolderName", query = "SELECT a FROM Account a WHERE a.accountHolderName = :accountHolderName"),
    @NamedQuery(name = "Account.findByAccountNumber", query = "SELECT a FROM Account a WHERE a.accountNumber = :accountNumber")})
public class Account implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "account_holder_id_number")
    private int accountHolderIdNumber;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "account_holder_name")
    private String accountHolderName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "account_number")
    private int accountNumber;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "account")
    private List<AccountHolderDetails> accountHolderDetailsList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "account")
    private List<Statement> statementList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "account")
    private List<Bill> billList;

    public Account() {
    }

    public Account(Integer id) {
        this.id = id;
    }

    public Account(Integer id, int accountHolderIdNumber, String accountHolderName, int accountNumber) {
        this.id = id;
        this.accountHolderIdNumber = accountHolderIdNumber;
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getAccountHolderIdNumber() {
        return accountHolderIdNumber;
    }

    public void setAccountHolderIdNumber(int accountHolderIdNumber) {
        this.accountHolderIdNumber = accountHolderIdNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    @XmlTransient
    public List<AccountHolderDetails> getAccountHolderDetailsList() {
        return accountHolderDetailsList;
    }

    public void setAccountHolderDetailsList(List<AccountHolderDetails> accountHolderDetailsList) {
        this.accountHolderDetailsList = accountHolderDetailsList;
    }

    @XmlTransient
    public List<Statement> getStatementList() {
        return statementList;
    }

    public void setStatementList(List<Statement> statementList) {
        this.statementList = statementList;
    }

    @XmlTransient
    public List<Bill> getBillList() {
        return billList;
    }

    public void setBillList(List<Bill> billList) {
        this.billList = billList;
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
        if (!(object instanceof Account)) {
            return false;
        }
        Account other = (Account) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "za.co.interfile.entities.Account[ id=" + id + " ]";
    }
    
}
