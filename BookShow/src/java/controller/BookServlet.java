/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DTO.Book;
import Database.Dbs;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author MacOS
 */
public class BookServlet extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        String ac = request.getParameter("action");
        Dbs db = new Dbs();

        switch (ac) {
            case "AddBook":
                String title = request.getParameter("txttitle");
                String description = request.getParameter("txtdescription");
                String author = request.getParameter("txtauthor");
                Float price = Float.valueOf(request.getParameter("txtprice"));
                String image = request.getParameter("txtimage");
                if (db.AddBooks(title, description, author, price, image)) {
                    ArrayList<Book> list = db.listBook();
                    request.setAttribute("data", list);
                    RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
                    if (rd != null) {
                        rd.forward(request, response);
                    } else {
                        response.sendRedirect("Error.jsp?code=1");
                    }

                }
                break;
            case "GetData":
                ArrayList<Book> list = db.listBook();
                request.setAttribute("data", list);
                RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
                if (rd != null) {
                    rd.forward(request, response);
                } else {
                    response.sendRedirect("Error.jsp?code=1");
                }

                break;

            case "Delete":
                int id = Integer.valueOf(request.getParameter("id"));
                if (db.DeleteBook(id)) {
                    ArrayList<Book> listd = db.listBook();
                    request.setAttribute("data", listd);
                    RequestDispatcher rdd = request.getRequestDispatcher("home.jsp");
                    if (rdd != null) {
                        rdd.forward(request, response);
                    } else {
                        response.sendRedirect("Error.jsp?code=1");
                    }

                }
                break;
            case "Edit":
                int ide = Integer.valueOf(request.getParameter("id"));
                Book b = db.EditListBook(ide);
                request.setAttribute("book", b);
                RequestDispatcher rde = request.getRequestDispatcher("bookedit.jsp");
                if (rde != null) {
                    rde.forward(request, response);
                } else {
                    response.sendRedirect("Error.jsp?code=1");
                }
                break;

            case "EditB":
                int ideb = Integer.valueOf(request.getParameter("ide"));
                String titleb = request.getParameter("txttitlee");
                String descriptionb = request.getParameter("txtdescriptione");
                String authorb = request.getParameter("txtauthore");
                Float priceb = Float.valueOf(request.getParameter("txtpricee"));
                String imageb = request.getParameter("txtimagee");
                
                System.out.println(ideb+titleb+descriptionb+authorb+priceb+imageb);

                if (db.EditBook(ideb, titleb, descriptionb, authorb, priceb, imageb)) {
                    ArrayList<Book> listb = db.listBook();
                    request.setAttribute("data", listb);
                    RequestDispatcher rdb = request.getRequestDispatcher("home.jsp");
                    if (rdb != null) {
                        rdb.forward(request, response);
                    } else {
                        response.sendRedirect("Error.jsp?code=1");
                    }

                }
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
