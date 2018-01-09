/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iconnectdb;

import dao.MicrosoftAccountDAO;
import dao.MicrosoftContactDAO;
import iconnectdb.idao.AccountDAO;
import iconnectdb.idao.ContactDAO;
import java.sql.Connection;

/**
 *
 * @author MacOS
 */
public class MicrosoftDAOFactory extends DAOFactory {

    public static Connection createConnection() {
        return DbContext.getConnection("127.0.0.1", 1433, "Contactdb", "sa", "230697");
    }

    public ContactDAO getContactDAO() {
        return new MicrosoftContactDAO();
    }

    public AccountDAO getAccountDAO() {
        return new MicrosoftAccountDAO();
    }

}
