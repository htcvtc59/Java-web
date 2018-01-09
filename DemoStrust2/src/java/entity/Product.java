/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Vector;

/**
 *
 * @author MacOS
 */
public class Product {

    private int id;
    private String name;

    public Product(){
        
    }
    public Product(int id, String name) {
        this.id = id;
        this.name = name;
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

    public Vector<Product> getData() {
        Vector<Product> pp = new Vector<Product>();
        for (int i = 0; i < 10; i++) {
            Product p = new Product(i, "NONE" + i);
            pp.add(p);
        }
        return pp;
    }

}
