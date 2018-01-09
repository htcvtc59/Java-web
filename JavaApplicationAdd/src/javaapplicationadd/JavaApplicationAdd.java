/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplicationadd;

import app.AddSessionBeanRemote;
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
public class JavaApplicationAdd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       try {
            Context ctx = new InitialContext();
            Object obj = ctx.lookup("mrBean");
            AddSessionBeanRemote remote  = (AddSessionBeanRemote)
                    PortableRemoteObject.narrow(obj, AddSessionBeanRemote.class);
            System.out.println(remote.add(1, 2));
            
            
        } catch (NamingException ex) {
            Logger.getLogger(JavaApplicationAdd.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
