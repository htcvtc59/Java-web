package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import DTO.CartChild;
import java.util.Enumeration;
import java.util.Hashtable;
import DTO.Cart;

public final class viewcart_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>View Cart</title>\n");
      out.write("        <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\"\n");
      out.write("              rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css\" integrity=\"sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js\" integrity=\"sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js\" integrity=\"sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            if (session.getAttribute("cart") == null) {
        
      out.write("\n");
      out.write("        <h3>Không có đơn hàng</h3>\n");
      out.write("        ");

        } else {
        
      out.write("\n");
      out.write("        <table class=\"table table-bordered\" align=\"center\">\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th>ID</th>\n");
      out.write("                    <th>Title</th>\n");
      out.write("                    <td>Quantity</td>\n");
      out.write("                    <th>Author</th>\n");
      out.write("                    <th>Price</th>\n");
      out.write("                    <th>Image</th>\n");
      out.write("                    <th>#</th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("\n");
      out.write("\n");
      out.write("                ");

                    Cart cart = (Cart) session.getAttribute("cart");
                    Hashtable content = cart.getContent();
                    Enumeration enumeration = content.keys();
                    while (enumeration.hasMoreElements()) {
                        String id = enumeration.nextElement().toString();
                        CartChild cc = (CartChild) content.get(id);
                        String title = cc.getBook().getTitle();
                        String author = cc.getBook().getAuthor();
                        Float price = cc.getBook().getPrice();
                        String image = cc.getBook().getImage();
                        int quantity = cc.getQuantity();
                
      out.write("\n");
      out.write("                <tr id=\"cart_");
      out.print(id);
      out.write("\">\n");
      out.write("                    <th scope=\"row\">");
      out.print(id);
      out.write("</th>\n");
      out.write("                    <td>");
      out.print(title);
      out.write("</td>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"text\" class=\"form-control cartquantity col-3\" data-id=\"");
      out.print(id);
      out.write("\" value=\"");
      out.print(quantity);
      out.write("\"/>\n");
      out.write("                        <button class=\"btn btn-success btnUpdate\" ><i class=\"material-icons md-18\">refresh</i></button>\n");
      out.write("                        <button class=\"btn btn-danger btnDelete\"  data-id=\"");
      out.print(id);
      out.write("\" ><i class=\"material-icons\">delete</i></button>\n");
      out.write("                    </td>\n");
      out.write("                    <td>");
      out.print(author);
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(price);
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(image);
      out.write("</td>\n");
      out.write("                    <td><a class=\"btn btn-primary\" href=\"CartControl?id=");
      out.print(id);
      out.write("&ac=del\">Delete</a></td>\n");
      out.write("                </tr>\n");
      out.write("                ");

                    }
                
      out.write("\n");
      out.write("\n");
      out.write("                ");

                    }
                
      out.write("\n");
      out.write("\n");
      out.write("            </tbody>\n");
      out.write("\n");
      out.write("            <tfoot>\n");
      out.write("                <tr class=\"danger\">\n");
      out.write("                    <td></td>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td>Tổng cộng</td>\n");
      out.write("                    <td>M</td>\n");
      out.write("                </tr>\n");
      out.write("            </tfoot>\n");
      out.write("        </table>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                $('.btnDelete').off('click').on('click', function (e) {\n");
      out.write("                    e.preventDefault();\n");
      out.write("                    e.stopPropagation();\n");
      out.write("\n");
      out.write("                    $.ajax({\n");
      out.write("                        url: 'CartControl',\n");
      out.write("                        data: {id: $(this).data('id'), ac: 'Delete'},\n");
      out.write("                        dataType: 'json',\n");
      out.write("                        type: 'POST',\n");
      out.write("                        success: function (res) {\n");
      out.write("                            if (res.status == true) {\n");
      out.write("                                window.location.href = \"BookShow/viewcart.jsp\";\n");
      out.write("                            }\n");
      out.write("\n");
      out.write("                        },\n");
      out.write("                        timeout: 2000\n");
      out.write("                    });\n");
      out.write("\n");
      out.write("                    $('#cart_' + $(this).data('id')).remove();\n");
      out.write("                });\n");
      out.write("\n");
      out.write("\n");
      out.write("                $('.btnUpdate').off('click').on('click', function (e) {\n");
      out.write("                    e.preventDefault();\n");
      out.write("                    e.stopPropagation();\n");
      out.write("\n");
      out.write("                    var listpro = $('.cartquantity');\n");
      out.write("                    var cartlist = [];\n");
      out.write("                    $.each(listpro, function (i, item) {\n");
      out.write("                        cartlist.push({\n");
      out.write("                            id: $(item).data('id'),\n");
      out.write("                            quantity: $(this).val(),\n");
      out.write("                            ac: 'Update'\n");
      out.write("                        })\n");
      out.write("                    });\n");
      out.write("\n");
      out.write("                    $.ajax({\n");
      out.write("                        url: 'CartControl',\n");
      out.write("                        data: {cartModel: JSON.stringify(cartlist), ac: 'Update'},\n");
      out.write("                        dataType: 'json',\n");
      out.write("                        type: 'POST',\n");
      out.write("                        contentType: 'application/json; charset=utf-8',\n");
      out.write("                        success: function (res) {\n");
      out.write("                            if (res.status == true) {\n");
      out.write("                                window.location.href = \"BookShow/viewcart.jsp\";\n");
      out.write("                            }\n");
      out.write("\n");
      out.write("                        },\n");
      out.write("                        timeout: 2000\n");
      out.write("                    });\n");
      out.write("\n");
      out.write("                });\n");
      out.write("\n");
      out.write("            });\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
