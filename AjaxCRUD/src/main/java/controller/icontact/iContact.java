/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.icontact;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author MacOS
 */
public interface iContact {
    public void httpInsertContact(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
    public void httpUpdateContact(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
    public void httpDeleteContact(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
    public void httpSearchContact(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;

}
