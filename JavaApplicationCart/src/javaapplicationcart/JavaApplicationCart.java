/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplicationcart;

import app.CartSessionBeanRemote;
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
public class JavaApplicationCart {

    public static void main(String[] args) {
        try {
            Context ctx = new InitialContext();
            Object obj = ctx.lookup("mrBean");
            CartSessionBeanRemote remote = (CartSessionBeanRemote) 
                    PortableRemoteObject.narrow(obj, CartSessionBeanRemote.class);

            System.out.println(remote.listbook());

        } catch (NamingException ex) {
            Logger.getLogger(JavaApplicationCart.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public final static CartSessionBeanRemote remote() {
        CartSessionBeanRemote remote = null;
        try {
            Context ctx = new InitialContext();
            Object obj = ctx.lookup("mrBean");
            remote
                    = (CartSessionBeanRemote) PortableRemoteObject.narrow(obj, CartSessionBeanRemote.class);

        } catch (NamingException ex) {
            Logger.getLogger(JavaApplicationCart.class.getName()).log(Level.SEVERE, null, ex);
        }
        return remote;
    }

}
