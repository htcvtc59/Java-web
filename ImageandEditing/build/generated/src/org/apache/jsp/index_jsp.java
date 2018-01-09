package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("        <script src=\"tinymce/js/tinymce/tinymce.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!--Choose Multiple Editor class  . mytextarea <textarea class=\"mytextarea\" name=\"tinymce\"></textarea>-->\n");
      out.write("        <script>\n");
      out.write("            tinymce.init({\n");
      out.write("                selector: '#mytextarea',\n");
      out.write("                theme: 'modern',\n");
      out.write("                skin: 'lightgray',\n");
      out.write("                width: 700,\n");
      out.write("                height: 300,\n");
      out.write("                plugins: [\n");
      out.write("                    'advlist autolink link image lists charmap print preview hr anchor pagebreak spellchecker',\n");
      out.write("                    'searchreplace wordcount visualblocks visualchars code fullscreen insertdatetime media nonbreaking',\n");
      out.write("                    'save table contextmenu directionality emoticons template paste textcolor colorpicker'\n");
      out.write("                ],\n");
      out.write("                content_css: 'css/content.css',\n");
      out.write("                toolbar: 'insertfile undo redo | styleselect | bold italic | alignleft aligncenter alignright alignjustify | bullist numlist outdent indent | link image | print preview media fullpage | forecolor backcolor emoticons',\n");
      out.write("                images_upload_url: 'Editing',\n");
      out.write("                images_upload_base_path: '/uploaded/image/path/image.png',\n");
      out.write("                images_upload_credentials: true,\n");
      out.write("                images_upload_handler: function (blobInfo, success, failure) {\n");
      out.write("                    var xhr, formData;\n");
      out.write("\n");
      out.write("                    xhr = new XMLHttpRequest();\n");
      out.write("                    xhr.withCredentials = false;\n");
      out.write("                    xhr.open('POST', 'Editing');\n");
      out.write("\n");
      out.write("                    xhr.onload = function () {\n");
      out.write("                        var json;\n");
      out.write("\n");
      out.write("                        if (xhr.status < 200 || xhr.status >= 300) {\n");
      out.write("                            failure('HTTP Error: ' + xhr.status);\n");
      out.write("                            return;\n");
      out.write("                        }\n");
      out.write("\n");
      out.write("                        json = JSON.parse(xhr.responseText);\n");
      out.write("\n");
      out.write("                        if (!json || typeof json.location != 'string') {\n");
      out.write("                            failure('Invalid JSON: ' + xhr.responseText);\n");
      out.write("                            return;\n");
      out.write("                        }\n");
      out.write("\n");
      out.write("                        success(json.location);\n");
      out.write("                    };\n");
      out.write("\n");
      out.write("                    formData = new FormData();\n");
      out.write("                    formData.append('file', blobInfo.blob(), fileName(blobInfo));\n");
      out.write("\n");
      out.write("                    xhr.send(formData);\n");
      out.write("                }\n");
      out.write("\n");
      out.write("\n");
      out.write("            });\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>TinyMCE Quick Start Guide</h1>\n");
      out.write("        <form method=\"post\" action=\"Editing\">\n");
      out.write("            <textarea id=\"mytextarea\" name=\"tinymce\"></textarea>\n");
      out.write("            <input type=\"submit\" value=\"TinyMCE\" />\n");
      out.write("        </form>\n");
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
