package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class accountkit_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Account Kit</title>\n");
      out.write("        <script src=\"https://sdk.accountkit.com/en_US/sdk.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <input value=\"+1\" id=\"country_code\" />\n");
      out.write("        <input placeholder=\"phone number\" id=\"phone_number\"/>\n");
      out.write("        <button onclick=\"smsLogin();\">Login via SMS</button>\n");
      out.write("        <div>OR</div>\n");
      out.write("        <input placeholder=\"email\" id=\"email\"/>\n");
      out.write("        <button onclick=\"emailLogin();\">Login via Email</button>\n");
      out.write("        \n");
      out.write("        <script>\n");
      out.write("            // initialize Account Kit with CSRF protection\n");
      out.write("            AccountKit_OnInteractive = function () {\n");
      out.write("                AccountKit.init(\n");
      out.write("                        {\n");
      out.write("                            appId: \"514820375523268\",\n");
      out.write("                            state: \"2ab052d15e74d225616ffd1ec69354f0\",\n");
      out.write("                            version: \"v1.1\",\n");
      out.write("                            fbAppEventsEnabled: true\n");
      out.write("//                            Redirect: \"accountkit.jsp\"\n");
      out.write("                        }\n");
      out.write("                );\n");
      out.write("            };\n");
      out.write("\n");
      out.write("            // login callback\n");
      out.write("            function loginCallback(response) {\n");
      out.write("                if (response.status === \"PARTIALLY_AUTHENTICATED\") {\n");
      out.write("                    var code = response.code;\n");
      out.write("                    var csrf = response.state;\n");
      out.write("                    // Send code to server to exchange for access token\n");
      out.write("                } else if (response.status === \"NOT_AUTHENTICATED\") {\n");
      out.write("                    // handle authentication failure\n");
      out.write("                } else if (response.status === \"BAD_PARAMS\") {\n");
      out.write("                    // handle bad parameters\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            // phone form submission handler\n");
      out.write("            function smsLogin() {\n");
      out.write("                var countryCode = document.getElementById(\"country_code\").value;\n");
      out.write("                var phoneNumber = document.getElementById(\"phone_number\").value;\n");
      out.write("                AccountKit.login(\n");
      out.write("                        'PHONE',\n");
      out.write("                        {countryCode: countryCode, phoneNumber: phoneNumber}, // will use default values if not specified\n");
      out.write("                        loginCallback\n");
      out.write("                        );\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            // email form submission handler\n");
      out.write("            function emailLogin() {\n");
      out.write("                var emailAddress = document.getElementById(\"email\").value;\n");
      out.write("                AccountKit.login(\n");
      out.write("                        'EMAIL',\n");
      out.write("                        {emailAddress: emailAddress},\n");
      out.write("                        loginCallback\n");
      out.write("                        );\n");
      out.write("            }\n");
      out.write("        </script>\n");
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
