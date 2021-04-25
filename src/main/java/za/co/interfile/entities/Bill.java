package za.co.interfile.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author elias
 */
@Entity
@Table(name = "bill")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Bill.findAll", query = "SELECT b FROM Bill b"),
    @NamedQuery(name = "Bill.findById", query = "SELECT b FROM Bill b WHERE b.id = :id"),
    @NamedQuery(name = "Bill.findByBillDate", query = "SELECT b FROM Bill b WHERE b.billDate = :billDate"),
    @NamedQuery(name = "Bill.findByDueDate", query = "SELECT b FROM Bill b WHERE b.dueDate = :dueDate"),
    @NamedQuery(name = "Bill.findByCharges", query = "SELECT b FROM Bill b WHERE b.charges = :charges"),
    @NamedQuery(name = "Bill.findByOutstanding", query = "SELECT b FROM Bill b WHERE b.outstanding = :outstanding"),
    @NamedQuery(name = "Bill.findByPeriod", query = "SELECT b FROM Bill b WHERE b.period = :period")})
public class Bill implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "bill_date")
    @Temporal(TemporalType.DATE)
    private Date billDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "due_date")
    @Temporal(TemporalType.DATE)
    private Date dueDate;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "charges")
    private BigDecimal charges;
    @Basic(optional = false)
    @NotNull
    @Column(name = "outstanding")
    private BigDecimal outstanding;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "period")
    private String period;
    @JoinColumn(name = "account", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Account account;

    public Bill() {
    }

    public Bill(Integer id) {
        this.id = id;
    }

    public Bill(Integer id, Date billDate, Date dueDate, BigDecimal charges, BigDecimal outstanding, String period) {
        this.id = id;
        this.billDate = billDate;
        this.dueDate = dueDate;
        this.charges = charges;
        this.outstanding = outstanding;
        this.period = period;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getBillDate() {
        return billDate;
    }

    public void setBillDate(Date billDate) {
        this.billDate = billDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public BigDecimal getCharges() {
        return charges;
    }

    public void setCharges(BigDecimal charges) {
        this.charges = charges;
    }

    public BigDecimal getOutstanding() {
        return outstanding;
    }

    public void setOutstanding(BigDecimal outstanding) {
        this.outstanding = outstanding;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
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
        if (!(object instanceof Bill)) {
            return false;
        }
        Bill other = (Bill) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "za.co.interfile.entities.Bill[ id=" + id + " ]";
    }
    
}
