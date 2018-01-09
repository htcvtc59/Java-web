/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iconnectdb.idao;

import dto.Contact;

/**
 *
 * @author MacOS
 */
public interface AccountDAO {
    
    public int insertAccount();
    public boolean deleteAccount();
    public Contact findAccount();
    public boolean updateAccount();
}
