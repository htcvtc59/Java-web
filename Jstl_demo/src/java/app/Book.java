/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MacOS
 */
public class Book {

    private String name;
    private String image;
    private String link;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public List<Book> getBook() {
        List list = new ArrayList();
        for (int i = 1; i < 10; i++) {
            Book b = new Book();
            b.setName("name" + i);
            b.setImage("image" + i);
            b.setLink("link" + i);
            list.add(b);
        }
        return list;
    }

}
