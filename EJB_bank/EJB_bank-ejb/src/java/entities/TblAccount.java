/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author MacOS
 */
@Entity
@Table(name = "tblAccount")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblAccount.findAll", query = "SELECT t FROM TblAccount t")
    , @NamedQuery(name = "TblAccount.findByCusNo", query = "SELECT t FROM TblAccount t WHERE t.cusNo = :cusNo")
    , @NamedQuery(name = "TblAccount.findByCusName", query = "SELECT t FROM TblAccount t WHERE t.cusName = :cusName")
    , @NamedQuery(name = "TblAccount.findByPasscode", query = "SELECT t FROM TblAccount t WHERE t.passcode = :passcode")
    , @NamedQuery(name = "TblAccount.findByBalance", query = "SELECT t FROM TblAccount t WHERE t.balance = :balance")})
public class TblAccount implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "cusNo")
    private String cusNo;
    @Size(max = 30)
    @Column(name = "cusName")
    private String cusName;
    @Size(max = 30)
    @Column(name = "passcode")
    private String passcode;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "balance")
    private Double balance;

    public TblAccount() {
    }

    public TblAccount(String cusNo) {
        this.cusNo = cusNo;
    }

    public String getCusNo() {
        return cusNo;
    }

    public void setCusNo(String cusNo) {
        this.cusNo = cusNo;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public String getPasscode() {
        return passcode;
    }

    public void setPasscode(String passcode) {
        this.passcode = passcode;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cusNo != null ? cusNo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblAccount)) {
            return false;
        }
        TblAccount other = (TblAccount) object;
        if ((this.cusNo == null && other.cusNo != null) || (this.cusNo != null && !this.cusNo.equals(other.cusNo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.TblAccount[ cusNo=" + cusNo + " ]";
    }
    
}
