package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import DTO.Book;

public final class bookadd_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>Index</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/icon?family=Material+Icons\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://code.getmdl.io/1.3.0/material.indigo-pink.min.css\">\n");
      out.write("        <script defer src=\"https://code.getmdl.io/1.3.0/material.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"mdl-layout\">\n");
      out.write("            ");

                if (request.getParameter("code") != null) {
                    if (request.getParameter("code").equals("1")) {
            
      out.write("\n");
      out.write("            <h3>Add Book</h3>\n");
      out.write("\n");
      out.write("            ");

            } else {
            
      out.write("\n");
      out.write("            <h3>Edit Book</h3>\n");
      out.write("\n");
      out.write("            ");

                    }
                }
            
      out.write("\n");
      out.write("\n");
      out.write("            ");

                if (request.getAttribute("book") != null) {
                    Book bb = (Book) request.getAttribute("book");
                    int id = bb.getId();
                    String des = bb.getDescription();
                    String author = bb.getAuthor();
                    Float price = bb.getPrice();
                    String image = bb.getImage();
                }

            
      out.write("\n");
      out.write("            <form method=\"POST\" action=\"BookServlet\" class=\"mdl-card\" style=\"margin-left: 400px\">\n");
      out.write("                <div class=\"mdl-textfield mdl-js-textfield mdl-textfield--floating-label hidden\">\n");
      out.write("                    <input class=\"mdl-textfield__input\" type=\"text\" id=\"title\" name=\"txttitle\">\n");
      out.write("                    <label class=\"mdl-textfield__label\" for=\"title\">Id...</label>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"mdl-textfield mdl-js-textfield mdl-textfield--floating-label\">\n");
      out.write("                    <input class=\"mdl-textfield__input\" type=\"text\" id=\"title\" name=\"txttitle\">\n");
      out.write("                    <label class=\"mdl-textfield__label\" for=\"title\">Title...</label>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"mdl-textfield mdl-js-textfield mdl-textfield--floating-label\">\n");
      out.write("                    <input class=\"mdl-textfield__input\" type=\"text\" id=\"description\" name=\"txtdescription\">\n");
      out.write("                    <label class=\"mdl-textfield__label\" for=\"description\">Description...</label>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"mdl-textfield mdl-js-textfield mdl-textfield--floating-label\">\n");
      out.write("                    <input class=\"mdl-textfield__input\" type=\"text\" id=\"author\" name=\"txtauthor\">\n");
      out.write("                    <label class=\"mdl-textfield__label\" for=\"author\">Author...</label>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"mdl-textfield mdl-js-textfield mdl-textfield--floating-label\">\n");
      out.write("                    <input class=\"mdl-textfield__input\" type=\"text\" id=\"author\" name=\"txtprice\">\n");
      out.write("                    <label class=\"mdl-textfield__label\" for=\"price\">Price...</label>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"mdl-textfield mdl-js-textfield mdl-textfield--floating-label\">\n");
      out.write("                    <input class=\"mdl-textfield__input\" type=\"text\" id=\"image\" name=\"txtimage\">\n");
      out.write("                    <label class=\"mdl-textfield__label\" for=\"image\">Image...</label>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                ");
                    if (request.getParameter("code") != null) {
                        if (request.getParameter("code").equals("1")) {
                
      out.write("\n");
      out.write("                <input type=\"submit\" value=\"AddBook\" name=\"action\"\n");
      out.write("                       class=\"mdl-button mdl-js-button mdl-button--raised mdl-button--colored\">\n");
      out.write("                ");

                } else {
                
      out.write("\n");
      out.write("                <input type=\"submit\" value=\"EditBook\" name=\"action\"\n");
      out.write("                       class=\"mdl-button mdl-js-button mdl-button--raised mdl-button--colored\">\n");
      out.write("                ");

                        }
                    }
                
      out.write("\n");
      out.write("\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
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
