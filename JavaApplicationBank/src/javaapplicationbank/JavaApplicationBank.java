/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplicationbank;

import app.MyBankSessionBeanRemote;
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
public class JavaApplicationBank {
  
    public static void main(String[] args) {
        try {
            Context ctx = new InitialContext();
            Object obj = ctx.lookup("mrBean");
            MyBankSessionBeanRemote remote = (MyBankSessionBeanRemote) 
                    PortableRemoteObject.narrow(obj, MyBankSessionBeanRemote.class);

            System.out.println(remote.checklogin("cus01", "passcode1c").getCusNo());

        } catch (NamingException ex) {
            Logger.getLogger(JavaApplicationBank.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public final static MyBankSessionBeanRemote remote() {
        MyBankSessionBeanRemote remote = null;
        try {
            Context ctx = new InitialContext();
            Object obj = ctx.lookup("mrBean");
            remote = 
                    (MyBankSessionBeanRemote) PortableRemoteObject.narrow(obj, MyBankSessionBeanRemote.class);

        } catch (NamingException ex) {
            Logger.getLogger(JavaApplicationBank.class.getName()).log(Level.SEVERE, null, ex);
        }
        return remote;
    }

}
