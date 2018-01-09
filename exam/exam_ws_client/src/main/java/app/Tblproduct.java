/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import com.google.gson.Gson;
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
@Table(name = "tblproduct")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tblproduct.findAll", query = "SELECT t FROM Tblproduct t")
    , @NamedQuery(name = "Tblproduct.findById", query = "SELECT t FROM Tblproduct t WHERE t.id = :id")
    , @NamedQuery(name = "Tblproduct.findByName", query = "SELECT t FROM Tblproduct t WHERE t.name = :name")
    , @NamedQuery(name = "Tblproduct.findByPrice", query = "SELECT t FROM Tblproduct t WHERE t.price = :price")
    , @NamedQuery(name = "Tblproduct.findByQuantity", query = "SELECT t FROM Tblproduct t WHERE t.quantity = :quantity")})
public class Tblproduct implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
//    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Size(max = 200)
    @Column(name = "name")
    private String name;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "price")
    private Double price;
    @Column(name = "quantity")
    private Integer quantity;

    public Tblproduct() {
    }

    public Tblproduct(Integer id) {
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
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
        if (!(object instanceof Tblproduct)) {
            return false;
        }
        Tblproduct other = (Tblproduct) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        Tblproduct book = new Tblproduct();
        book.setName(getName());
        book.setPrice(getPrice());
        book.setQuantity(getQuantity());
        return parseBookToJson(book);
    }

    public static String parseBookToJson(Tblproduct b) {
        String toJson = new Gson().toJson(b);
        return toJson;
    }

}
