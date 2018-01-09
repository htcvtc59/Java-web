/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.ArrayList;
import java.util.Map;
import javax.ejb.Remote;
import model.Book;

/**
 *
 * @author MacOS
 */
@Remote
public interface CartSessionBeanRemote {

    public void addItem(String id, int quantity);

    public void removeItem(String id, int quantity);

    public Map<String, Integer> getItems();

    public void checkout(int paymentId);

    public void cancel();

    ArrayList<Book> listbook();

}
