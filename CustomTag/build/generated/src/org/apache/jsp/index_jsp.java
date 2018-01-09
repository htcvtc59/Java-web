package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/WEB-INF/tlds/newtag_library.tld");
    _jspx_dependants.add("/WEB-INF/tlds/TagLibDescription.tld");
    _jspx_dependants.add("/WEB-INF/tlds/TagWithBody.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_i_TagIteration_count_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_b_UpperCase;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_v_ViewData_table_namerow_db_countrow_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_i_TagIteration_count_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_b_UpperCase = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_v_ViewData_table_namerow_db_countrow_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_i_TagIteration_count_nobody.release();
    _jspx_tagPool_b_UpperCase.release();
    _jspx_tagPool_v_ViewData_table_namerow_db_countrow_nobody.release();
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      if (_jspx_meth_v_ViewData_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("        ");
      if (_jspx_meth_i_TagIteration_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("        <h1>Custom tag Handler With JSP Codes</h1>\n");
      out.write("        ");
      //  b:UpperCase
      tag.UpperCase _jspx_th_b_UpperCase_0 = (tag.UpperCase) _jspx_tagPool_b_UpperCase.get(tag.UpperCase.class);
      _jspx_th_b_UpperCase_0.setPageContext(_jspx_page_context);
      _jspx_th_b_UpperCase_0.setParent(null);
      int _jspx_eval_b_UpperCase_0 = _jspx_th_b_UpperCase_0.doStartTag();
      if (_jspx_eval_b_UpperCase_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_b_UpperCase_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_b_UpperCase_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_b_UpperCase_0.doInitBody();
        }
        do {
          out.write("\n");
          out.write("            These following information are displayed\n");
          out.write("            <ol>\n");
          out.write("                <li>Current Time");
          out.print(new java.util.Date());
          out.write("</li>\n");
          out.write("                <li>Host name");
          out.print(request.getRemoteHost());
          out.write("</li>\n");
          out.write("                <li>Session Id ");
          out.print(session.getId());
          out.write("</li>\n");
          out.write("            </ol>\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_b_UpperCase_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_b_UpperCase_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
      }
      if (_jspx_th_b_UpperCase_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_b_UpperCase.reuse(_jspx_th_b_UpperCase_0);
        return;
      }
      _jspx_tagPool_b_UpperCase.reuse(_jspx_th_b_UpperCase_0);
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

  private boolean _jspx_meth_v_ViewData_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  v:ViewData
    app.ViewData _jspx_th_v_ViewData_0 = (app.ViewData) _jspx_tagPool_v_ViewData_table_namerow_db_countrow_nobody.get(app.ViewData.class);
    _jspx_th_v_ViewData_0.setPageContext(_jspx_page_context);
    _jspx_th_v_ViewData_0.setParent(null);
    _jspx_th_v_ViewData_0.setDb("BooksDB");
    _jspx_th_v_ViewData_0.setCountrow(5);
    _jspx_th_v_ViewData_0.setNamerow("1,2,3,4");
    _jspx_th_v_ViewData_0.setTable("tblbook");
    int _jspx_eval_v_ViewData_0 = _jspx_th_v_ViewData_0.doStartTag();
    if (_jspx_th_v_ViewData_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_v_ViewData_table_namerow_db_countrow_nobody.reuse(_jspx_th_v_ViewData_0);
      return true;
    }
    _jspx_tagPool_v_ViewData_table_namerow_db_countrow_nobody.reuse(_jspx_th_v_ViewData_0);
    return false;
  }

  private boolean _jspx_meth_i_TagIteration_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  i:TagIteration
    tag.TagIteration _jspx_th_i_TagIteration_0 = (tag.TagIteration) _jspx_tagPool_i_TagIteration_count_nobody.get(tag.TagIteration.class);
    _jspx_th_i_TagIteration_0.setPageContext(_jspx_page_context);
    _jspx_th_i_TagIteration_0.setParent(null);
    _jspx_th_i_TagIteration_0.setCount(10);
    int _jspx_eval_i_TagIteration_0 = _jspx_th_i_TagIteration_0.doStartTag();
    if (_jspx_th_i_TagIteration_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_i_TagIteration_count_nobody.reuse(_jspx_th_i_TagIteration_0);
      return true;
    }
    _jspx_tagPool_i_TagIteration_count_nobody.reuse(_jspx_th_i_TagIteration_0);
    return false;
  }
}
