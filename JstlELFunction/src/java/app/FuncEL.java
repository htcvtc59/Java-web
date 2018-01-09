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
public class FuncEL {

    public static int add(int a, int b) {
        return a + b;
    }

    public static List<Book> findbook(String name) {
        List<Book> lstBook = new ArrayList<>();
        List<Book> lstBook1 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Book b = new Book();
            b.setName("name" + i);
            b.setDisplay("display" + i);
            lstBook.add(b);
        }
        for (Book book : lstBook) {
            if (book.getName().contains(name)) {
               lstBook1.add(book);
            }

        }

        return lstBook1;
    }

}
