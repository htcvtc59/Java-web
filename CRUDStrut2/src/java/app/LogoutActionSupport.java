/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import static app.LoginActionSupport.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;

/**
 *
 * @author MacOS
 */
public class LogoutActionSupport extends ActionSupport implements SessionAware {

    final static String SUCCESS = "success";

    public LogoutActionSupport() {
    }

    public String execute() throws Exception {
        if (sessionMap.containsKey("userName")) {
            sessionMap.remove("userName");
        }
        return SUCCESS;
    }

    private Map<String, Object> sessionMap;

    @Override
    public void setSession(Map<String, Object> sessionMap) {
        this.sessionMap = sessionMap;

    }

}
