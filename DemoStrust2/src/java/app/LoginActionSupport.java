/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author MacOS
 */
public class LoginActionSupport extends ActionSupport {

     static final String SUCCESS  = "SUCCESS";
     static final String FAILD  = "FAILD";
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
     
    

    public LoginActionSupport() {
    }

    public String execute() throws Exception {
        System.out.println(user+"----"+pass);
        if(user.equals("admin")&&pass.equals("admin"))
            return SUCCESS;
        return FAILD;
    }

}
