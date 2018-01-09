/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.google.gson.Gson;
import controller.icontact.iContact;
import dto.Contact;
import iconnectdb.DAOFactory;
import iconnectdb.idao.ContactDAO;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author MacOS
 */
public class ContactController extends HttpServlet implements iContact {
    
    private static ContactController instance = null;
    
    protected ContactController() {
        
    }
    
    public static ContactController getInstance() {
        if (instance == null) {
            instance = new ContactController();
        }
        return instance;
    }
    
    @Override
    public void httpInsertContact(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        DAOFactory microsoftFactory = DAOFactory.getDAOFactory(DAOFactory.Microsoft);
        ContactDAO contactDAO = microsoftFactory.getContactDAO();
        String name = request.getParameter("txtName");
        String age = request.getParameter("txtAge");
        String address = request.getParameter("txtAddress");
        
        if (name != null && age != null && address != null) {
            int countRow = contactDAO.insertContact(new Contact(name, age, address));
            if (countRow >= 1) {
                Contact c = contactDAO.getNewContact();
                Map<String, Object> map = new HashMap<String, Object>();
                map.put("row", countRow);
                map.put("id", c.getId());
                map.put("name", c.getName());
                map.put("age", c.getAge());
                map.put("address", c.getAddress());
                response.setContentType("application/json;charset=UTF-8");
                response.getWriter().print(new Gson().toJson(map));
                
            }
        }
        
    }
    
    @Override
    public void httpUpdateContact(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        DAOFactory microsoftFactory = DAOFactory.getDAOFactory(DAOFactory.Microsoft);
        ContactDAO contactDAO = microsoftFactory.getContactDAO();
        String id = request.getParameter("txtIdu");
        String name = request.getParameter("txtNameu");
        String age = request.getParameter("txtAgeu");
        String address = request.getParameter("txtAddressu");
        
        if (id != null && name != null && age != null && address != null) {
            Contact c = new Contact();
            c.setId(Integer.valueOf(id));
            c.setName(name);
            c.setAge(age);
            c.setAddress(address);
            if (contactDAO.updateContact(c, Integer.valueOf(id))) {
                Contact cu = contactDAO.viewDetail(Integer.valueOf(id));
                Map<String, Object> map = new HashMap<String, Object>();
                map.put("id", id);
                map.put("name", cu.getName());
                map.put("age", cu.getAge());
                map.put("address", cu.getAddress());
                response.setContentType("application/json;charset=UTF-8");
                response.getWriter().print(new Gson().toJson(map));

            }
        }
        
    }
    
    @Override
    public void httpDeleteContact(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        DAOFactory microsoftFactory = DAOFactory.getDAOFactory(DAOFactory.Microsoft);
        ContactDAO contactDAO = microsoftFactory.getContactDAO();
        String id = request.getParameter("id");
        String ac = request.getParameter("ac");
        if (id != null && ac.equals("Delete")) {
            if (contactDAO.deleteContact(Integer.valueOf(id))) {
                
                Map<String, Object> map = new HashMap<String, Object>();
                map.put("status", true);
                response.setContentType("application/json;charset=UTF-8");
                response.getWriter().print(new Gson().toJson(map));
                
            }
        }
        
    }
    
    @Override
    public void httpSearchContact(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        DAOFactory microsoftFactory = DAOFactory.getDAOFactory(DAOFactory.Microsoft);
        ContactDAO contactDAO = microsoftFactory.getContactDAO();
        String keysearch = request.getParameter("keysearch");
        String key = request.getParameter("key");
        
        if (keysearch != null && key != null) {
            ArrayList<Contact> arrContact = contactDAO.searchContact(keysearch, key);
            response.setContentType("application/json;charset=UTF-8");
            response.getWriter().print(new Gson().toJson(arrContact));
        }
        
    }
    
}
