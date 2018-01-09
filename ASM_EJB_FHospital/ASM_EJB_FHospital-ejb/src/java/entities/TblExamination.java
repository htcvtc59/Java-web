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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "tblExamination")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblExamination.findAll", query = "SELECT t FROM TblExamination t")
    , @NamedQuery(name = "TblExamination.findById", query = "SELECT t FROM TblExamination t WHERE t.id = :id")
    , @NamedQuery(name = "TblExamination.findByAccId", query = "SELECT t FROM TblExamination t WHERE t.accId = :accId")
    , @NamedQuery(name = "TblExamination.findByDocId", query = "SELECT t FROM TblExamination t WHERE t.docId = :docId")
    , @NamedQuery(name = "TblExamination.findByADate", query = "SELECT t FROM TblExamination t WHERE t.aDate = :aDate")
    , @NamedQuery(name = "TblExamination.findByDDate", query = "SELECT t FROM TblExamination t WHERE t.dDate = :dDate")})
public class TblExamination implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
//    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "acc_id")
    private Integer accId;
    @Column(name = "doc_id")
    private Integer docId;
    @Size(max = 100)
    @Column(name = "a_date")
    private String aDate;
    @Size(max = 100)
    @Column(name = "d_date")
    private String dDate;

    public TblExamination() {
    }

    public TblExamination(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAccId() {
        return accId;
    }

    public void setAccId(Integer accId) {
        this.accId = accId;
    }

    public Integer getDocId() {
        return docId;
    }

    public void setDocId(Integer docId) {
        this.docId = docId;
    }

    public String getADate() {
        return aDate;
    }

    public void setADate(String aDate) {
        this.aDate = aDate;
    }

    public String getDDate() {
        return dDate;
    }

    public void setDDate(String dDate) {
        this.dDate = dDate;
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
        if (!(object instanceof TblExamination)) {
            return false;
        }
        TblExamination other = (TblExamination) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.TblExamination[ id=" + id + " ]";
    }
    
}
