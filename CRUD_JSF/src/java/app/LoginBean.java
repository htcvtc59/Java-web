/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.io.Serializable;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

public class LoginBean implements Serializable{

    private String user;
    private String pass;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public LoginBean() {

    }

    public String login() {
        if (user.equals("admin@gmail.com") && pass.equals("admin")) {
            HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
            session.setAttribute("user", user);
            return "1";
        } else {
            return "-1";
        }
    }

    public String logout() {
        user = null;
        pass = null;
        HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
        session.removeAttribute("user");
        return "1";
    }

}
