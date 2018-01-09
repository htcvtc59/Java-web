/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import javax.ejb.Stateless;

/**
 *
 * @author MacOS
 */
@Stateless(mappedName = "mrBean")
public class LoginSessionBean implements LoginSessionBeanRemote {

    @Override
    public boolean login(String user, String pass) {
        if(user.equals("admin")&&pass.equals("admin"))
            return true;
        return false;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
