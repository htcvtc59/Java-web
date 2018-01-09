/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import com.opensymphony.xwork2.ActionSupport;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;

/**
 *
 * @author MacOS
 */
public class LoginActionSupport extends ActionSupport implements SessionAware {

    final static String SUCCESS = "success";
    final static String FAILD = "faild";

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

    @Override
    public void validate() {
        if (getUser().length() == 0) {
            addFieldError("user", "The user required");
        } else if (getPass().length() == 0) {
            addFieldError("pass", "The pass required");
        }

    }

    public LoginActionSupport() {
    }
    
    
    private Map<String, Object> sessionMap;

    @Override
    public void setSession(Map<String, Object> sessionMap) {
        this.sessionMap = sessionMap;

    }

    public String execute() throws Exception {
        String loggedUserName = null;

        if (sessionMap.containsKey("userName")) {
            loggedUserName = (String) sessionMap.get("userName");
        }
        if (loggedUserName != null && loggedUserName.equals("a")) {
            return SUCCESS;
        }

        if (user.equals("a") && pass.equals("a")) {

            sessionMap.put("userName", user);

            return SUCCESS;
        }

        return FAILD;

    }
    


}
