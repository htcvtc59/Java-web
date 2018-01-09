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
@Table(name = "tblExam")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblExam.findAll", query = "SELECT t FROM TblExam t")
    , @NamedQuery(name = "TblExam.findByExamcode", query = "SELECT t FROM TblExam t WHERE t.examcode = :examcode")
    , @NamedQuery(name = "TblExam.findByDate", query = "SELECT t FROM TblExam t WHERE t.date = :date")
    , @NamedQuery(name = "TblExam.findByDuration", query = "SELECT t FROM TblExam t WHERE t.duration = :duration")
    , @NamedQuery(name = "TblExam.findByFaculty", query = "SELECT t FROM TblExam t WHERE t.faculty = :faculty")
    , @NamedQuery(name = "TblExam.findBySubject", query = "SELECT t FROM TblExam t WHERE t.subject = :subject")})
public class TblExam implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "examcode")
    private String examcode;
    @Size(max = 200)
    @Column(name = "date")
    private String date;
    @Size(max = 200)
    @Column(name = "duration")
    private String duration;
    @Size(max = 200)
    @Column(name = "faculty")
    private String faculty;
    @Size(max = 200)
    @Column(name = "subject")
    private String subject;

    public TblExam() {
    }

    public TblExam(String examcode) {
        this.examcode = examcode;
    }

    public String getExamcode() {
        return examcode;
    }

    public void setExamcode(String examcode) {
        this.examcode = examcode;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (examcode != null ? examcode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblExam)) {
            return false;
        }
        TblExam other = (TblExam) object;
        if ((this.examcode == null && other.examcode != null) || (this.examcode != null && !this.examcode.equals(other.examcode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.TblExam[ examcode=" + examcode + " ]";
    }
    
}
