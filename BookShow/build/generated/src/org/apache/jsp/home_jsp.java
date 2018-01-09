package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import DTO.Book;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width,initial-scale=1\">\n");
      out.write("        <title>Home</title>\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/icon?family=Material+Icons\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://code.getmdl.io/1.3.0/material.indigo-pink.min.css\">\n");
      out.write("        <script defer src=\"https://code.getmdl.io/1.3.0/material.min.js\"></script>\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                $(\"#btnedit\").click(function () {\n");
      out.write("                    $.ajax({\n");
      out.write("                        type: 'GET',\n");
      out.write("                        url: \"bookadd.jsp?code=\" + 2,\n");
      out.write("                        contentType: 'application/json;charset=utf-8',\n");
      out.write("                        success: function (response) {\n");
      out.write("                            console.log(response);\n");
      out.write("                        }\n");
      out.write("                    });\n");
      out.write("                });\n");
      out.write("                $(\"#btndelete\").click(function () {\n");
      out.write("                    $.ajax({\n");
      out.write("                        type: 'GET',\n");
      out.write("                        url: \"bookadd.jsp?code=\" + 1,\n");
      out.write("                        contentType: 'application/json;charset=utf-8',\n");
      out.write("                        success: function (response) {\n");
      out.write("                            console.log(response);\n");
      out.write("                        }\n");
      out.write("                    });\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body id=\"container\">\n");
      out.write("        <a class=\"mdl-button mdl-js-button mdl-button--raised\" href=\"bookadd.jsp?code=1\">\n");
      out.write("            Add Book\n");
      out.write("        </a>\n");
      out.write("        ");

            if (request.getAttribute("data") == null) {
                response.sendRedirect("BookServlet?action=GetData");
            } else {

        
      out.write("\n");
      out.write("        <table class=\"mdl-data-table mdl-js-data-table mdl-data-table--selectable mdl-shadow--2dp\"\n");
      out.write("               align=\"center\">\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Title</th>\n");
      out.write("                    <th>Description</th>           \n");
      out.write("                    <th>Author</th>\n");
      out.write("                    <th>Price</th>\n");
      out.write("                    <th>Image</th>\n");
      out.write("                    <th>Edit</th>\n");
      out.write("                    <th>Delete</th>\n");
      out.write("                    <th>Cart</th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("                ");
                  
                    ArrayList<Book> list = (ArrayList<Book>) request.getAttribute("data");
                    for (Book b : list) {
                        String title = b.getTitle();
                        String description = b.getDescription();
                        String author = b.getAuthor();
                        Float price = b.getPrice();
                        String image = b.getImage();
                        int id = b.getId();
                
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.print(title);
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(description);
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(author);
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(price);
      out.write("</td>\n");
      out.write("                    <td><img src=\"image/");
      out.print(image);
      out.write("\" height=\"20\" width=\"20\"/></td>\n");
      out.write("                    <td><a href=\"BookServlet?action=Edit&id=");
      out.print(id);
      out.write("\" id=\"btnedit\" class=\"mdl-button mdl-js-button mdl-button--raised\" >Edit</a></td>\n");
      out.write("                    <td><a href=\"BookServlet?action=Delete&id=");
      out.print(id);
      out.write("\" id=\"btndelete\" class=\"mdl-button mdl-js-button mdl-button--raised\" >Delete</a></td>\n");
      out.write("                    <td><a href=\"CartControl?id=");
      out.print(id);
      out.write("&ac=add\" class=\"mdl-button mdl-js-button mdl-button--raised\" >AddCart</a></td>\n");
      out.write("                </tr>\n");
      out.write("                ");

                    }
                
      out.write("\n");
      out.write("\n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");

            }
        
      out.write("\n");
      out.write("\n");
      out.write("        <script src=\"https://unpkg.com/material-components-web@latest/dist/material-components-web.min.js\"></script>\n");
      out.write("        <script>window.mdc.autoInit();</script>\n");
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
