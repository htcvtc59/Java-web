/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

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
@Table(name = "tblcontact")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tblcontact.findAll", query = "SELECT t FROM Tblcontact t")
    , @NamedQuery(name = "Tblcontact.findById", query = "SELECT t FROM Tblcontact t WHERE t.id = :id")
    , @NamedQuery(name = "Tblcontact.findByName", query = "SELECT t FROM Tblcontact t WHERE t.name = :name")
    , @NamedQuery(name = "Tblcontact.findByAge", query = "SELECT t FROM Tblcontact t WHERE t.age = :age")
    , @NamedQuery(name = "Tblcontact.findByAddress", query = "SELECT t FROM Tblcontact t WHERE t.address = :address")})
public class Tblcontact implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Size(max = 200)
    @Column(name = "name")
    private String name;
    @Size(max = 200)
    @Column(name = "age")
    private String age;
    @Size(max = 200)
    @Column(name = "address")
    private String address;

    public Tblcontact() {
    }

    public Tblcontact(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
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
        if (!(object instanceof Tblcontact)) {
            return false;
        }
        Tblcontact other = (Tblcontact) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "app.Tblcontact[ id=" + id + " ]";
    }
    
}
