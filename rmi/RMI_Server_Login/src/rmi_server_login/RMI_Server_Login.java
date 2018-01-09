/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi_server_login;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MacOS
 */
public class RMI_Server_Login {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            LoginImplement loginImplement= new LoginImplement();
            Registry registry = LocateRegistry.createRegistry(9999);
            Naming.bind("rmi://127.0.0.1:9999/login", loginImplement);
           System.out.println("Server started");
        } catch (RemoteException ex) {
            Logger.getLogger(RMI_Server_Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (AlreadyBoundException ex) {
            Logger.getLogger(RMI_Server_Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(RMI_Server_Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
