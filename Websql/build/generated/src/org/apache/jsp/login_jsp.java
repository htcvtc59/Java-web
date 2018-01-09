package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html class=\"mdc-typography\">\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Login</title>\n");
      out.write("        <link\n");
      out.write("            rel=\"stylesheet\"\n");
      out.write("            href=\"https://unpkg.com/material-components-web@latest/dist/material-components-web.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/material-components-web.min.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Login</h1>\n");
      out.write("        <form action=\"Login\" method=\"POST\">\n");
      out.write("            <div class=\"mdc-textfield\">\n");
      out.write("                <input type=\"text\" id=\"username\" class=\"mdc-textfield__input\" aria-controls=\"username-helptext\">\n");
      out.write("                <label for=\"username\" class=\"mdc-textfield__label\">Username</label>\n");
      out.write("            </div>\n");
      out.write("            <p id=\"username-helptext\" class=\"mdc-textfield-helptext\" aria-hidden=\"true\">\n");
      out.write("                This will be displayed on your public profile\n");
      out.write("            </p>\n");
      out.write("\n");
      out.write("            <br/> \n");
      out.write("            <br/>\n");
      out.write("\n");
      out.write("            <div class=\"mdc-textfieldpass\">\n");
      out.write("                <input type=\"text\" id=\"my-textfieldpass\" class=\"mdc-textfield__input\" name=\"txtPass\">\n");
      out.write("                <label class=\"mdc-textfield__label\" for=\"textfieldpass\">Password</label>\n");
      out.write("            </div> \n");
      out.write("            <!--            User:<input type=\"text\" name=\"txtUser\"><br/>\n");
      out.write("                        Pass:<input type=\"password\" ><br/>-->\n");
      out.write("            <input type=\"submit\" value=\"Login\" name=\"btnaction\" class=\"mdc-button mdc-button--raised mdc-button--primary\">    \n");
      out.write("            <input type=\"submit\" value=\"Register\" name=\"btnaction\" class=\"mdc-button mdc-button--raised mdc-button--primary\">\n");
      out.write("        </form>\n");
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
