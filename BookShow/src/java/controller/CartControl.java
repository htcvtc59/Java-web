/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DTO.Book;
import DTO.Cart;
import DTO.CartChild;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.json.JSONArray;
import org.json.JSONObject;

public class CartControl extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String ac = request.getParameter("ac");
        switch (ac) {
            case "add":
                String id = request.getParameter("id");
                HttpSession session = request.getSession();
                Cart cart = (Cart) session.getAttribute("cart");
                if (cart == null) {
                    cart = new Cart();
                }
                cart.addItem(id, 1);
                session.setAttribute("cart", cart);
                response.sendRedirect("viewcart.jsp");
                break;
//            case "Delete":
//                String idd = request.getParameter("id");
//                HttpSession session2 = request.getSession();
//                Cart cart2 = (Cart) session2.getAttribute("cart");
//                if (cart2 == null) {
//                    cart2 = new Cart();
//                }
//                cart2.deleteItem(idd);
//                session2.setAttribute("cart", cart2);
//                response.sendRedirect("viewcart.jsp");
//                break;
//
//            case "Update":
//
//                int quantity = Integer.parseInt(request.getParameter("quantity"));
//
//                HttpSession sessionu = request.getSession();
//                Cart cartu = (Cart) sessionu.getAttribute("cart");
//                if (cartu == null) {
//                    cartu = new Cart();
//                }
//                cartu.updateItem("", quantity);
//                sessionu.setAttribute("cart", cartu);
//                response.sendRedirect("viewcart.jsp");
//                break;
            default:
                break;
        }

    }

    protected void cartRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String acc = null;
        if (request.getParameter("ac") != null) {
            acc = request.getParameter("ac");
            switch (acc) {
                case "Delete":
                    String idd = request.getParameter("id");
                    HttpSession session2 = request.getSession();
                    Cart cart2 = (Cart) session2.getAttribute("cart");
                    if (cart2 == null) {
                        cart2 = new Cart();
                    }
                    cart2.deleteItem(idd);
                    session2.setAttribute("cart", cart2);
//                    response.sendRedirect("viewcart.jsp");

                    Map<String, Object> map = new HashMap<String, Object>();
                    boolean status = true;
                    map.put("status", status);
                    response.setContentType("application/json");
                    response.setCharacterEncoding("UTF-8");
                    response.getWriter().print(new Gson().toJson(map));

                    break;
                default:
                    break;
            }

        } else {

            StringBuilder sb = new StringBuilder();
            BufferedReader reader = request.getReader();
            try {
                String line;
                while ((line = reader.readLine()) != null) {
                    sb.append(line).append('\n');
                }
            } finally {
                reader.close();
            }

            ArrayList<CartChild> arr = new ArrayList<>();

            JSONArray arrjson = new JSONArray(sb.toString());
            for (Object t : arrjson) {
                JSONObject objjson = new JSONObject(t.toString());
                CartChild cc = new CartChild();
                Book b = new Book();
                cc.setQuantity(Integer.parseInt(objjson.get("quantity").toString()));
                b.setId(Integer.parseInt(objjson.get("id").toString()));
                cc.setBook(b);
                arr.add(cc);
                acc = objjson.get("ac").toString();
            }

            switch (acc) {
                case "Update":

                    HttpSession sessionu = request.getSession();
                    Cart cartu = (Cart) sessionu.getAttribute("cart");
                    if (cartu == null) {
                        cartu = new Cart();
                    }
                    for (CartChild c : arr) {
                        cartu.updateItem(String.valueOf(c.getBook().getId()), c.getQuantity());
                    }
                    sessionu.setAttribute("cart", cartu);
//                    response.sendRedirect("viewcart.jsp");

                    Map<String, Object> map = new HashMap<String, Object>();
                    boolean status = true;
                    map.put("status", status);
                    response.setContentType("application/json;charset=UTF-8");
                    response.getWriter().print(new Gson().toJson(map));
                    System.out.println(new Gson().toJson(map));

                    break;
                default:
                    break;
            }

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
        cartRequest(request, response);
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
