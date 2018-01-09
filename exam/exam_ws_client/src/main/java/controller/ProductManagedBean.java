/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import app.ResData;
import app.Tblproduct;

public class ProductManagedBean {

   
    private Tblproduct b = new Tblproduct();

    public Tblproduct getB() {
        return b;
    }

    public void setB(Tblproduct b) {
        this.b = b;
    }
 
    public ProductManagedBean() {
    }
    
    public String addProduct() {
        ResData.create(this.b);
        this.b = new Tblproduct();
        return "success";
    }

    public String findbyid(Tblproduct b) {
        this.b = b;
        return "edit";
    }

    public String sellProduct() {
        ResData.put(this.b);
        this.b = new Tblproduct();
        return "success";
    }

    public void delete(Tblproduct b) {
        ResData.delete(b);
    }

    public List<Tblproduct> getAllProducts() {
        return ResData.findall();
    }

    public List<Tblproduct> findalls() {
        if (this.b.getName() != null) {
            return ResData.findallname(b.getName());
        } else {
            return ResData.findall();
        }
    }
    
    public String admin() {
        this.b = new Tblproduct();
        return "admin";
    }
    
}
