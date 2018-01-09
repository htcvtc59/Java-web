/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.ejb.Remove;
import javax.ejb.Stateful;
import model.Book;

/**
 *
 * @author MacOS
 */
@Stateful(mappedName = "mrBean")
public class CartSessionBean implements CartSessionBeanRemote {

    public CartSessionBean() {
    }
    private HashMap<String, Integer> items = new HashMap<String, Integer>();

    public void addItem(String item, int quantity) {
        Integer orderQuantity = items.get(item);
        if (orderQuantity == null) {
            orderQuantity = 0;
        }
        orderQuantity += quantity;
        items.put(item, orderQuantity);
    }

    public void removeItem(String item, int quantity) {
        Integer orderQuantity = items.get(item);
        if (orderQuantity == null) {
            return;
        }
        orderQuantity -= quantity;
        if (orderQuantity > 0) {
            items.put(item, orderQuantity);
        } else {
            items.remove(item);
        }
    }

    public Map<String, Integer> getItems() {
        return items;
    }

    @Remove
    public void checkout(int paymentId) {
        System.out.println("checkout");
    }

    @Remove
    public void cancel() {
    }

    @Override
    public ArrayList<Book> listbook() {
        ArrayList<Book> arrBook = new ArrayList<>();
        for (int i = 1; i < 8; i++) {
            Book b = new Book(i, "title " + i, i * 1000);
            arrBook.add(b);
        }
        return arrBook;
    }

}
