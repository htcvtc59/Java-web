/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import TransactionAPI.payment.baokim.BaoKimPayment;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author MacOS
 */
public class Payment extends HttpServlet {

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
        
        String pay = request.getParameter("pay");
        System.out.println(pay);
        if (pay.equals("pay")) {
            BaoKimPayment bkpay = new BaoKimPayment();
            List<Cart> lstpro = new ArrayList<>();
            Cart c = new Cart();
            Hashtable<String, Cart> product = c.product();
            
            for (Map.Entry<String, Cart> entry : product.entrySet()) {
                String keys = entry.getKey();
                Cart value = entry.getValue();
                lstpro.add(value);
            }
            
            String namesp = "";
            Float total_price = 0f;
            String description = "";
            
            for (Cart cart : lstpro) {
                namesp += cart.getId() + "-";
                total_price += cart.getPrice();
                description += cart.getId() + "-" + cart.getName()
                        + "-" + cart.getPrice() + "-" + cart.getQuantity() + ";";
            }
            
            System.out.println(total_price + "\n" + description + "\n" + namesp);
            
            String createRequestUrl = bkpay.createRequestUrl(namesp, "dev.baokim@bk.vn", String.valueOf(total_price), "1000", "1000", description, "http://localhost:8084/BaoKimPay/index.jsp", "http://localhost:8084/BaoKimPay/error.jsp", "http://localhost:8084/BaoKimPay/error.jsp");
            System.out.println(createRequestUrl);
            
            response.sendRedirect(createRequestUrl);
            
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
