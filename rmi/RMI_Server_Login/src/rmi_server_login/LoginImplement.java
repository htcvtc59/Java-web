/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi_server_login;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import rmi_interfacelib.RMI_InterfaceLib;

/**
 *
 * @author MacOS
 */
public class LoginImplement extends UnicastRemoteObject implements RMI_InterfaceLib {

    public LoginImplement() throws RemoteException {
        super();
    }

    @Override
    public boolean Login(String user, String pass) throws RemoteException {
        if (user.equalsIgnoreCase("admin") && pass.equalsIgnoreCase("admin")) {
            return true;
        }
        return false;
    }

}
