/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplicationlogin;

import app.LoginSessionBeanRemote;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.rmi.PortableRemoteObject;

/**
 *
 * @author MacOS
 */
public class JavaApplicationLogin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Context ctx = new InitialContext();
            Object obj = ctx.lookup("mrBean");
            LoginSessionBeanRemote remote = (LoginSessionBeanRemote)
                    PortableRemoteObject.narrow(obj,LoginSessionBeanRemote.class);
            System.out.println(remote.login("admin", "admin"));
            
        } catch (NamingException ex) {
            Logger.getLogger(JavaApplicationLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
