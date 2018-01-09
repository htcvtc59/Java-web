/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi_interfacelib;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author MacOS
 */
public interface RMI_InterfaceLib extends Remote {

    public boolean Login(String user, String pass) throws RemoteException;
}
