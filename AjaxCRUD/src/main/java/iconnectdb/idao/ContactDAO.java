/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iconnectdb.idao;

import dto.Contact;
import java.util.ArrayList;

/**
 *
 * @author MacOS
 */
public interface ContactDAO {

    public int insertContact(Contact c);

    public boolean deleteContact(int id);

    public boolean updateContact(Contact c, int id);
    
    public Contact viewDetail(int id);

    public Contact getNewContact();
    
    public ArrayList<Contact> searchContact(String keysearch, String key);

}
