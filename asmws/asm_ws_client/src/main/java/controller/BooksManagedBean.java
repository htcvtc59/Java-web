package controller;

import java.util.List;
import app.ResData;
import app.Books;

public class BooksManagedBean {

    private Books b = new Books();

    public Books getB() {
        return b;
    }

    public void setB(Books b) {
        this.b = b;
    }

    public BooksManagedBean() {
    }

    public String create() {
        ResData.create(this.b);
        this.b = new Books();
        return "success";
    }

    public String findbyid(Books b) {
        this.b = b;
        return "edit";
    }

    public String put() {
        ResData.put(this.b);
        this.b = new Books();
        return "success";
    }

    public void delete(Books b) {
        ResData.delete(b);
    }

    public List<Books> findall() {
        return ResData.findall();
    }

    public List<Books> findalls() {
        if (this.b.getName() != null) {
            return ResData.findallname(b.getName());
        } else {
            return ResData.findall();
        }
    }

    public String admin() {
        this.b = new Books();
        return "admin";
    }

}
