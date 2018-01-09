
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author MacOS
 */
public class Cart {

    private String id;
    private String name;
    private int quantity;
    private float price;

    public Cart() {

    }

    public Cart(String id, String name, int quantity, float price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Hashtable<String, Cart> product() {
        Hashtable<String, Cart> cart = new Hashtable<>();

        for (int i = 1; i < 8; i++) {
            cart.put(String.valueOf(i)+"keys", new Cart("id" + i, "name" + i, i, i*10000));
        }
        return cart;
    }
    
    public static void main(String[] args) {
        Cart c = new Cart();
        Hashtable<String, Cart> product = c.product();
        
        for (Map.Entry<String, Cart> entry : product.entrySet()) {
            String key = entry.getKey();
            Cart value = entry.getValue();
            System.out.println(key+"++++++"+value.price);
            
        }
        
        
    }

}
