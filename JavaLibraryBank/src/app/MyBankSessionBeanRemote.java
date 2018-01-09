/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import javax.ejb.Remote;
import model.AccountBank;

/**
 *
 * @author MacOS
 */
@Remote
public interface MyBankSessionBeanRemote {

    AccountBank receivercode(String passcode);

    boolean transfer(String user, float amount);

    boolean transferreciver(String transferuser, float amount);

    boolean withdraw(String user, float amount);

    AccountBank checklogin(String user, String pass);
    
}
