/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author MacOS
 */
public class productBean {

    @EJB
    private TblproductFacade tblproductFacade;

    private int id;
    private String name;
    private Float price;

    private List<Tblproduct> itemss;

    public List<Tblproduct> getItemss() {
        return itemss=tblproductFacade.viewallPro();
    }
   
    public void setItemss(List<Tblproduct> itemss) {
        this.itemss = itemss;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public productBean() {
    }

    public String insertPro() {
        tblproductFacade.addProduct(id, name, price);
        return "success";
    }

}
