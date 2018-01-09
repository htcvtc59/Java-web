/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.TblContactFacade;

import entities.*;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;

/**
 *
 * @author MacOS
 */
public class ContactController extends HttpServlet {

    @EJB
    private TblContactFacade tblContactFacade;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String ac = request.getParameter("ac");
        switch (ac) {
            case "list":
                String txtNameS = request.getParameter("txtName");
                if (txtNameS != null) {

                    List<TblContact> listContact = tblContactFacade.search(txtNameS);
                    ServletContext sc = this.getServletContext();
                    request.setAttribute("listC", listContact);
                    RequestDispatcher rd = sc.getRequestDispatcher("/index.jsp");
                    rd.forward(request, response);

                } else {
                    List<TblContact> listContact = tblContactFacade.search("");
                    ServletContext sc = this.getServletContext();
                    request.setAttribute("listC", listContact);
                    RequestDispatcher rd = sc.getRequestDispatcher("/index.jsp");
                    rd.forward(request, response);
                }

                break;
            case "create":
                String txtName = request.getParameter("txtName");
                String txtPhone = request.getParameter("txtPhone");
                String txtGender = request.getParameter("txtGender");
                String txtEmail = request.getParameter("txtEmail");
                if (txtName != null && txtPhone != null && txtGender != null && txtEmail != null) {
                    TblContact cc = new TblContact();
                    cc.setName(txtName);
                    cc.setEmail(txtEmail);
                    cc.setPhone(txtPhone);
                    cc.setGender(txtGender);
                    tblContactFacade.create(cc);
                    response.sendRedirect("index.jsp");
                }

                break;
            case "delete":
                String id = request.getParameter("id");
                if (id != null) {
                    TblContact c = tblContactFacade.find(Integer.valueOf(id));
                    if (c != null) {
                        tblContactFacade.remove(c);
                        response.sendRedirect("index.jsp");
                    }
                }
                break;
            case "viewedit":
                String ide = request.getParameter("id");
                if (ide != null) {
                    TblContact c = tblContactFacade.find(Integer.valueOf(ide));
                    if (c != null) {
                        ServletContext sce = this.getServletContext();
                        request.setAttribute("editc", c);
                        RequestDispatcher rde = sce.getRequestDispatcher("/edit.jsp");
                        rde.forward(request, response);
                    }
                }

                break;
            case "edit":
                String txtIdd = request.getParameter("txtId");
                String txtNamee = request.getParameter("txtName");
                String txtPhonee = request.getParameter("txtPhone");
                String txtGendere = request.getParameter("txtGender");
                String txtEmaile = request.getParameter("txtEmail");
                if (txtIdd != null && txtNamee != null && txtPhonee != null && txtGendere != null && txtEmaile != null) {
                    TblContact ccc = new TblContact();
                    ccc.setId(Integer.valueOf(txtIdd));
                    ccc.setName(txtNamee);
                    ccc.setEmail(txtEmaile);
                    ccc.setPhone(txtPhonee);
                    ccc.setGender(txtGendere);
                    tblContactFacade.edit(ccc);
                    response.sendRedirect("index.jsp");
                }

                break;
            case "search":
                break;
            default:
                break;
        }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
