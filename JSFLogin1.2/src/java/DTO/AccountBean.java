/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author MacOS
 */
public class AccountBean {

    /**
     * Creates a new instance of AccountBean
     */
    public AccountBean() {

    }

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
    
    public String checkLogin(){
        if(user.equals("admin")&&pass.equals("admin"))
            return "success";
        else return "fail";
    }

}
