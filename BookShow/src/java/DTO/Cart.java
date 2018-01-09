package DTO;

import Database.Dbs;
import java.util.Enumeration;
import java.util.Hashtable;

public class Cart {

    private Hashtable content;

    public Hashtable getContent() {
        return content;
    }

    public void setContent(Hashtable content) {
        this.content = content;
    }

    public Cart() {
        content = new Hashtable();
    }

    public void addItem(String id, int quantity) {
        Book book = new Dbs().EditListBook(Integer.parseInt(id));

        if (content == null) {
            content = new Hashtable();
            CartChild cc = new CartChild(book, quantity);
            content.put(id, cc);
        } else {
            if (!content.containsKey(id)) {
                CartChild cc = new CartChild(book, quantity);
                content.put(id, cc);
            } else {
                Enumeration enumeration = content.keys();
                while (enumeration.hasMoreElements()) {
                    String keysid = (String) enumeration.nextElement();
                    if (keysid.equals(id)) {
                        CartChild cc = (CartChild) content.get(keysid);
                        cc.setQuantity(cc.getQuantity() + quantity);
                    }

                }
            }
        }
    }

    public void deleteItem(String id) {
        Enumeration enumer = content.keys();
        while (enumer.hasMoreElements()) {
            String key = (String) enumer.nextElement();
            if (key.equals(id)) {
                content.remove(key);
            }
        }
    }

    public void updateItem(String id, int quantity) {
        Book book = new Dbs().EditListBook(Integer.parseInt(id));
        Enumeration enumer = content.keys();
        while (enumer.hasMoreElements()) {
            String key = (String) enumer.nextElement();
            if (key.equals(id)) {
                CartChild cc = (CartChild) content.get(key);
                cc.setQuantity(quantity);
            }
        }

    }

}
