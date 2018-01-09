/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import entity.Product;
import java.util.ArrayList;
import java.util.Map;
import javax.faces.context.FacesContext;
import model.DataProcess;

/**
 *
 * @author MacOS
 */
public class ProductBean {

    private int id;
    private String name;
    private float price;
    private ArrayList items;
    
    private Map<String,Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();  

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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public ArrayList getItems() {
        return items;
    }

    public void setItems(ArrayList items) {
        this.items = items;
    }

    

    public ProductBean() {
        items = new DataProcess().listPro();

    }

    public String save() {
        System.out.println(getName()+getPrice());
        DataProcess dp = new DataProcess();
        if (dp.AddProduct(getName(), getPrice())) {
            return "1";
        } else {
            return "-1";
        }
    }

    public String updatepro(Product p) {
        DataProcess dp = new DataProcess();
        if (dp.EditPro(p.getId(), p.getName(), p.getPrice())) {
            return "1";
        } else {
            return "-1";
        }
    }

    public String viewedit(int id) {
        DataProcess dp = new DataProcess();
        Product DetailPro = dp.DetailPro(id);
        
        if (DetailPro != null) {
            System.out.println(DetailPro.getId());
            sessionMap.put("editPro", DetailPro);
            
            return "1";
        } else {
            return "-1";
        }

    }

    public String delete(int id) {
        DataProcess dp = new DataProcess();
        if (dp.DeletePro(id)) {
            return "1";
        } else {
            return "-1";
        }
    }

}
