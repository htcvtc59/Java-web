/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iconnectdb;

import iconnectdb.idao.AccountDAO;
import iconnectdb.idao.ContactDAO;


/**
 *
 * @author MacOS
 */
public abstract class DAOFactory {

    public static final int Microsoft = 1;
//    public static final int Oracle = 2;

    public abstract ContactDAO getContactDAO();
    public abstract AccountDAO getAccountDAO();

    public static DAOFactory getDAOFactory(int whichFactory) {
        switch (whichFactory) {
            case Microsoft:
                return new MicrosoftDAOFactory();
//            case Oracle:
//                return new OracleDAOFactory();
            default:
                return null;
        }
    }

}
