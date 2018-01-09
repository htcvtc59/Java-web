/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import com.opensymphony.xwork2.ActionSupport;
import entity.Product;
import java.util.Vector;

/**
 *
 * @author MacOS
 */
public class ViewActionSupport extends ActionSupport {

    static final String SUCCESS = "SUCCESS";

    private Vector<Product> items;

    public Vector<Product> getItems() {
        items = new Product().getData();
        return items;
    }

    public void setItems(Vector<Product> items) {
        this.items = items;
    }

    public ViewActionSupport() {
    }

    public String execute() throws Exception {
        return SUCCESS;
    }

}
