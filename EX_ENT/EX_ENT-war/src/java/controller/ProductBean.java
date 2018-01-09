/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entities.Product;
import javax.ejb.EJB;
import model.ProductFacade;

import java.util.*;
import entities.*;

public class ProductBean {

    @EJB
    private ProductFacade productFacade;

    private Product product = new Product();

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public ProductBean() {
    }

    public List<Product> findAll() {
        return this.productFacade.findAll();
    }
    
    public String create() {
        this.productFacade.create(this.product);
        this.product = new Product();
        return "success";
    }

}
