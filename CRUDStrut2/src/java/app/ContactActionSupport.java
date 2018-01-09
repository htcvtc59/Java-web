/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import dao.contact;
import dbs.Dbs;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;

public class ContactActionSupport extends ActionSupport implements ModelDriven<contact> {

    private contact c = new contact();
    private Dbs db = new Dbs();
    private ArrayList<contact> arrcontact = new ArrayList<>();
    private final static String SUCCESS = "success";

    public ContactActionSupport() {
    }

    public String execute() throws Exception {
//        arrcontact = db.listContact();
        return SUCCESS;
    }

    public String action1() {
        arrcontact = db.listContact();
        return SUCCESS;
    }

    public String action2() {
        HttpServletRequest request = (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
        db.deleteContact((int) Long.parseLong(request.getParameter("id")));
        return SUCCESS;
    }

    public String action3() {
        db.addContacts(c.getUsername(), c.getGender(), c.getCountry(), c.getAbout(), c.isLikes());
        return SUCCESS;
    }

    public String action4() {
        HttpServletRequest request = (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
        c = db.editlistContact((int) Long.parseLong(request.getParameter("id")));
        listgender.add("male");
        listgender.add("female");

        listcountry.add("vn");
        listcountry.add("usa");
        listcountry.add("china");

        return SUCCESS;
    }

    public String action5() {
        db.editContact(c.getId(), c.getUsername(), c.getGender(), c.getCountry(), c.getAbout(), c.isLikes());

        return SUCCESS;
    }

//    list data create
    private List<String> listgender = new ArrayList<>();
    private List<String> listcountry = new ArrayList<>();

    public String actionlist() {
        listgender.add("male");
        listgender.add("female");

        listcountry.add("vn");
        listcountry.add("usa");
        listcountry.add("china");

        return SUCCESS;
    }

    public List<String> getListgender() {
        return listgender;
    }

    public void setListgender(List<String> listgender) {
        this.listgender = listgender;
    }

    public List<String> getListcountry() {
        return listcountry;
    }

    public void setListcountry(List<String> listcountry) {
        this.listcountry = listcountry;
    }

    public contact getC() {
        return c;
    }

    public void setC(contact c) {
        this.c = c;
    }

    public ArrayList<contact> getArrcontact() {
        return arrcontact;
    }

    public void setArrcontact(ArrayList<contact> arrcontact) {
        this.arrcontact = arrcontact;
    }

    @Override
    public contact getModel() {
        return c;
    }

}
