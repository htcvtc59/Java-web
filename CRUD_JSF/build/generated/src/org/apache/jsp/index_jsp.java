package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_dataTable_var_value_binding;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_column;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_outputText_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_f_facet_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_f_view;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_commandButton_value_action_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_form;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_h_dataTable_var_value_binding = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_h_column = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_h_outputText_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_f_facet_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_f_view = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_h_commandButton_value_action_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_h_form = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_h_dataTable_var_value_binding.release();
    _jspx_tagPool_h_column.release();
    _jspx_tagPool_h_outputText_value_nobody.release();
    _jspx_tagPool_f_facet_name.release();
    _jspx_tagPool_f_view.release();
    _jspx_tagPool_h_commandButton_value_action_nobody.release();
    _jspx_tagPool_h_form.release();
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
      if (_jspx_meth_f_view_0(_jspx_page_context))
        return;
      out.write('\n');
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

  private boolean _jspx_meth_f_view_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:view
    com.sun.faces.taglib.jsf_core.ViewTag _jspx_th_f_view_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.jsf_core.ViewTag.class) : new com.sun.faces.taglib.jsf_core.ViewTag();
    _jspx_th_f_view_0.setPageContext(_jspx_page_context);
    _jspx_th_f_view_0.setParent(null);
    _jspx_th_f_view_0.setJspId("id7");
    int _jspx_eval_f_view_0 = _jspx_th_f_view_0.doStartTag();
    if (_jspx_eval_f_view_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_f_view_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_f_view_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_f_view_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("    <html xmlns:h=\"http://xmlns.jcp.org/jsf/html\" \n");
        out.write("          xmlns:f=\"http://xmlns.jcp.org/jsf/core\"\n");
        out.write("          xmlns:p=\"http://primefaces.org/ui\"\n");
        out.write("          xmlns:ui=\"http://java.sun.com/jsf/facelets\"\n");
        out.write("          >\n");
        out.write("        <head>\n");
        out.write("            <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
        out.write("            <title>Index</title>\n");
        out.write("        </head>\n");
        out.write("        <body>\n");
        out.write("            ");
        if (_jspx_meth_h_form_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_f_view_0, _jspx_page_context))
          return true;
        out.write("  \n");
        out.write("        </body>\n");
        out.write("    </html>\n");
        int evalDoAfterBody = _jspx_th_f_view_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_f_view_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_f_view_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_f_view.reuse(_jspx_th_f_view_0);
      return true;
    }
    _jspx_tagPool_f_view.reuse(_jspx_th_f_view_0);
    return false;
  }

  private boolean _jspx_meth_h_form_0(javax.servlet.jsp.tagext.JspTag _jspx_th_f_view_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:form
    com.sun.faces.taglib.html_basic.FormTag _jspx_th_h_form_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.FormTag.class) : new com.sun.faces.taglib.html_basic.FormTag();
    _jspx_th_h_form_0.setPageContext(_jspx_page_context);
    _jspx_th_h_form_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_f_view_0);
    _jspx_th_h_form_0.setJspId("id16");
    int _jspx_eval_h_form_0 = _jspx_th_h_form_0.doStartTag();
    if (_jspx_eval_h_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_h_form_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_h_form_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_h_form_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                ");
        if (_jspx_meth_h_commandButton_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                    <table>\n");
        out.write("                        <thead>\n");
        out.write("                            <tr>\n");
        out.write("                                <th>");
        if (_jspx_meth_h_column_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_form_0, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                            <th>");
        if (_jspx_meth_h_column_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_form_0, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                            <th>");
        if (_jspx_meth_h_column_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_form_0, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                            <th>");
        if (_jspx_meth_h_column_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_form_0, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                            <th>");
        if (_jspx_meth_h_column_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_form_0, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                            <th>");
        if (_jspx_meth_h_column_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_form_0, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                                </tr>\n");
        out.write("                            </thead>\n");
        out.write("                            <tbody>\n");
        out.write("                               \n");
        out.write("                        ");
        if (_jspx_meth_h_dataTable_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                    </tbody>\n");
        out.write("                </table>\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_h_form_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_h_form_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_h_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_form.reuse(_jspx_th_h_form_0);
      return true;
    }
    _jspx_tagPool_h_form.reuse(_jspx_th_h_form_0);
    return false;
  }

  private boolean _jspx_meth_h_commandButton_0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:commandButton
    com.sun.faces.taglib.html_basic.CommandButtonTag _jspx_th_h_commandButton_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.CommandButtonTag.class) : new com.sun.faces.taglib.html_basic.CommandButtonTag();
    _jspx_th_h_commandButton_0.setPageContext(_jspx_page_context);
    _jspx_th_h_commandButton_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_0);
    _jspx_th_h_commandButton_0.setJspId("id18");
    _jspx_th_h_commandButton_0.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("Add", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    _jspx_th_h_commandButton_0.setAction(org.apache.jasper.runtime.PageContextImpl.getMethodExpression("create.jsp", (PageContext)_jspx_page_context, null, java.lang.Object.class, new Class[] {}));
    int _jspx_eval_h_commandButton_0 = _jspx_th_h_commandButton_0.doStartTag();
    if (_jspx_th_h_commandButton_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_commandButton_value_action_nobody.reuse(_jspx_th_h_commandButton_0);
      return true;
    }
    _jspx_tagPool_h_commandButton_value_action_nobody.reuse(_jspx_th_h_commandButton_0);
    return false;
  }

  private boolean _jspx_meth_h_column_0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:column
    com.sun.faces.taglib.html_basic.ColumnTag _jspx_th_h_column_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.ColumnTag.class) : new com.sun.faces.taglib.html_basic.ColumnTag();
    _jspx_th_h_column_0.setPageContext(_jspx_page_context);
    _jspx_th_h_column_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_0);
    _jspx_th_h_column_0.setJspId("id24");
    int _jspx_eval_h_column_0 = _jspx_th_h_column_0.doStartTag();
    if (_jspx_eval_h_column_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_h_column_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_h_column_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_h_column_0.doInitBody();
      }
      do {
        if (_jspx_meth_f_facet_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_column_0, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_h_column_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_h_column_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_h_column_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_column.reuse(_jspx_th_h_column_0);
      return true;
    }
    _jspx_tagPool_h_column.reuse(_jspx_th_h_column_0);
    return false;
  }

  private boolean _jspx_meth_f_facet_0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_column_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:facet
    javax.faces.webapp.FacetTag _jspx_th_f_facet_0 = (javax.faces.webapp.FacetTag) _jspx_tagPool_f_facet_name.get(javax.faces.webapp.FacetTag.class);
    _jspx_th_f_facet_0.setPageContext(_jspx_page_context);
    _jspx_th_f_facet_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_column_0);
    _jspx_th_f_facet_0.setName("header");
    int _jspx_eval_f_facet_0 = _jspx_th_f_facet_0.doStartTag();
    if (_jspx_eval_f_facet_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write('#');
        int evalDoAfterBody = _jspx_th_f_facet_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_f_facet_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_f_facet_name.reuse(_jspx_th_f_facet_0);
      return true;
    }
    _jspx_tagPool_f_facet_name.reuse(_jspx_th_f_facet_0);
    return false;
  }

  private boolean _jspx_meth_h_column_1(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:column
    com.sun.faces.taglib.html_basic.ColumnTag _jspx_th_h_column_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.ColumnTag.class) : new com.sun.faces.taglib.html_basic.ColumnTag();
    _jspx_th_h_column_1.setPageContext(_jspx_page_context);
    _jspx_th_h_column_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_0);
    _jspx_th_h_column_1.setJspId("id29");
    int _jspx_eval_h_column_1 = _jspx_th_h_column_1.doStartTag();
    if (_jspx_eval_h_column_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_h_column_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_h_column_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_h_column_1.doInitBody();
      }
      do {
        if (_jspx_meth_f_facet_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_column_1, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_h_column_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_h_column_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_h_column_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_column.reuse(_jspx_th_h_column_1);
      return true;
    }
    _jspx_tagPool_h_column.reuse(_jspx_th_h_column_1);
    return false;
  }

  private boolean _jspx_meth_f_facet_1(javax.servlet.jsp.tagext.JspTag _jspx_th_h_column_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:facet
    javax.faces.webapp.FacetTag _jspx_th_f_facet_1 = (javax.faces.webapp.FacetTag) _jspx_tagPool_f_facet_name.get(javax.faces.webapp.FacetTag.class);
    _jspx_th_f_facet_1.setPageContext(_jspx_page_context);
    _jspx_th_f_facet_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_column_1);
    _jspx_th_f_facet_1.setName("header");
    int _jspx_eval_f_facet_1 = _jspx_th_f_facet_1.doStartTag();
    if (_jspx_eval_f_facet_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write('I');
        out.write('D');
        int evalDoAfterBody = _jspx_th_f_facet_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_f_facet_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_f_facet_name.reuse(_jspx_th_f_facet_1);
      return true;
    }
    _jspx_tagPool_f_facet_name.reuse(_jspx_th_f_facet_1);
    return false;
  }

  private boolean _jspx_meth_h_column_2(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:column
    com.sun.faces.taglib.html_basic.ColumnTag _jspx_th_h_column_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.ColumnTag.class) : new com.sun.faces.taglib.html_basic.ColumnTag();
    _jspx_th_h_column_2.setPageContext(_jspx_page_context);
    _jspx_th_h_column_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_0);
    _jspx_th_h_column_2.setJspId("id34");
    int _jspx_eval_h_column_2 = _jspx_th_h_column_2.doStartTag();
    if (_jspx_eval_h_column_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_h_column_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_h_column_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_h_column_2.doInitBody();
      }
      do {
        if (_jspx_meth_f_facet_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_column_2, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_h_column_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_h_column_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_h_column_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_column.reuse(_jspx_th_h_column_2);
      return true;
    }
    _jspx_tagPool_h_column.reuse(_jspx_th_h_column_2);
    return false;
  }

  private boolean _jspx_meth_f_facet_2(javax.servlet.jsp.tagext.JspTag _jspx_th_h_column_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:facet
    javax.faces.webapp.FacetTag _jspx_th_f_facet_2 = (javax.faces.webapp.FacetTag) _jspx_tagPool_f_facet_name.get(javax.faces.webapp.FacetTag.class);
    _jspx_th_f_facet_2.setPageContext(_jspx_page_context);
    _jspx_th_f_facet_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_column_2);
    _jspx_th_f_facet_2.setName("header");
    int _jspx_eval_f_facet_2 = _jspx_th_f_facet_2.doStartTag();
    if (_jspx_eval_f_facet_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("Name");
        int evalDoAfterBody = _jspx_th_f_facet_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_f_facet_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_f_facet_name.reuse(_jspx_th_f_facet_2);
      return true;
    }
    _jspx_tagPool_f_facet_name.reuse(_jspx_th_f_facet_2);
    return false;
  }

  private boolean _jspx_meth_h_column_3(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:column
    com.sun.faces.taglib.html_basic.ColumnTag _jspx_th_h_column_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.ColumnTag.class) : new com.sun.faces.taglib.html_basic.ColumnTag();
    _jspx_th_h_column_3.setPageContext(_jspx_page_context);
    _jspx_th_h_column_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_0);
    _jspx_th_h_column_3.setJspId("id39");
    int _jspx_eval_h_column_3 = _jspx_th_h_column_3.doStartTag();
    if (_jspx_eval_h_column_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_h_column_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_h_column_3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_h_column_3.doInitBody();
      }
      do {
        if (_jspx_meth_f_facet_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_column_3, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_h_column_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_h_column_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_h_column_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_column.reuse(_jspx_th_h_column_3);
      return true;
    }
    _jspx_tagPool_h_column.reuse(_jspx_th_h_column_3);
    return false;
  }

  private boolean _jspx_meth_f_facet_3(javax.servlet.jsp.tagext.JspTag _jspx_th_h_column_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:facet
    javax.faces.webapp.FacetTag _jspx_th_f_facet_3 = (javax.faces.webapp.FacetTag) _jspx_tagPool_f_facet_name.get(javax.faces.webapp.FacetTag.class);
    _jspx_th_f_facet_3.setPageContext(_jspx_page_context);
    _jspx_th_f_facet_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_column_3);
    _jspx_th_f_facet_3.setName("header");
    int _jspx_eval_f_facet_3 = _jspx_th_f_facet_3.doStartTag();
    if (_jspx_eval_f_facet_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("Price");
        int evalDoAfterBody = _jspx_th_f_facet_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_f_facet_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_f_facet_name.reuse(_jspx_th_f_facet_3);
      return true;
    }
    _jspx_tagPool_f_facet_name.reuse(_jspx_th_f_facet_3);
    return false;
  }

  private boolean _jspx_meth_h_column_4(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:column
    com.sun.faces.taglib.html_basic.ColumnTag _jspx_th_h_column_4 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.ColumnTag.class) : new com.sun.faces.taglib.html_basic.ColumnTag();
    _jspx_th_h_column_4.setPageContext(_jspx_page_context);
    _jspx_th_h_column_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_0);
    _jspx_th_h_column_4.setJspId("id44");
    int _jspx_eval_h_column_4 = _jspx_th_h_column_4.doStartTag();
    if (_jspx_eval_h_column_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_h_column_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_h_column_4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_h_column_4.doInitBody();
      }
      do {
        if (_jspx_meth_f_facet_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_column_4, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_h_column_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_h_column_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_h_column_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_column.reuse(_jspx_th_h_column_4);
      return true;
    }
    _jspx_tagPool_h_column.reuse(_jspx_th_h_column_4);
    return false;
  }

  private boolean _jspx_meth_f_facet_4(javax.servlet.jsp.tagext.JspTag _jspx_th_h_column_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:facet
    javax.faces.webapp.FacetTag _jspx_th_f_facet_4 = (javax.faces.webapp.FacetTag) _jspx_tagPool_f_facet_name.get(javax.faces.webapp.FacetTag.class);
    _jspx_th_f_facet_4.setPageContext(_jspx_page_context);
    _jspx_th_f_facet_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_column_4);
    _jspx_th_f_facet_4.setName("header");
    int _jspx_eval_f_facet_4 = _jspx_th_f_facet_4.doStartTag();
    if (_jspx_eval_f_facet_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("Edit");
        int evalDoAfterBody = _jspx_th_f_facet_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_f_facet_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_f_facet_name.reuse(_jspx_th_f_facet_4);
      return true;
    }
    _jspx_tagPool_f_facet_name.reuse(_jspx_th_f_facet_4);
    return false;
  }

  private boolean _jspx_meth_h_column_5(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:column
    com.sun.faces.taglib.html_basic.ColumnTag _jspx_th_h_column_5 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.ColumnTag.class) : new com.sun.faces.taglib.html_basic.ColumnTag();
    _jspx_th_h_column_5.setPageContext(_jspx_page_context);
    _jspx_th_h_column_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_0);
    _jspx_th_h_column_5.setJspId("id49");
    int _jspx_eval_h_column_5 = _jspx_th_h_column_5.doStartTag();
    if (_jspx_eval_h_column_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_h_column_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_h_column_5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_h_column_5.doInitBody();
      }
      do {
        if (_jspx_meth_f_facet_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_column_5, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_h_column_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_h_column_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_h_column_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_column.reuse(_jspx_th_h_column_5);
      return true;
    }
    _jspx_tagPool_h_column.reuse(_jspx_th_h_column_5);
    return false;
  }

  private boolean _jspx_meth_f_facet_5(javax.servlet.jsp.tagext.JspTag _jspx_th_h_column_5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:facet
    javax.faces.webapp.FacetTag _jspx_th_f_facet_5 = (javax.faces.webapp.FacetTag) _jspx_tagPool_f_facet_name.get(javax.faces.webapp.FacetTag.class);
    _jspx_th_f_facet_5.setPageContext(_jspx_page_context);
    _jspx_th_f_facet_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_column_5);
    _jspx_th_f_facet_5.setName("header");
    int _jspx_eval_f_facet_5 = _jspx_th_f_facet_5.doStartTag();
    if (_jspx_eval_f_facet_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("Delete");
        int evalDoAfterBody = _jspx_th_f_facet_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_f_facet_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_f_facet_name.reuse(_jspx_th_f_facet_5);
      return true;
    }
    _jspx_tagPool_f_facet_name.reuse(_jspx_th_f_facet_5);
    return false;
  }

  private boolean _jspx_meth_h_dataTable_0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:dataTable
    com.sun.faces.taglib.html_basic.DataTableTag _jspx_th_h_dataTable_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.DataTableTag.class) : new com.sun.faces.taglib.html_basic.DataTableTag();
    _jspx_th_h_dataTable_0.setPageContext(_jspx_page_context);
    _jspx_th_h_dataTable_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_0);
    _jspx_th_h_dataTable_0.setJspId("id56");
    _jspx_th_h_dataTable_0.setBinding(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{table}", (PageContext)_jspx_page_context, javax.faces.component.UIComponent.class, null));
    _jspx_th_h_dataTable_0.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{productBean.items}", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    _jspx_th_h_dataTable_0.setVar("p");
    int _jspx_eval_h_dataTable_0 = _jspx_th_h_dataTable_0.doStartTag();
    if (_jspx_eval_h_dataTable_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_h_dataTable_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_h_dataTable_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_h_dataTable_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                            <tr>\n");
        out.write("                                <td>");
        if (_jspx_meth_h_column_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_dataTable_0, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("                                <td>");
        if (_jspx_meth_h_column_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_dataTable_0, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("                                <td>");
        if (_jspx_meth_h_column_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_dataTable_0, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("                                <td>");
        if (_jspx_meth_h_column_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_dataTable_0, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("                                <td>");
        if (_jspx_meth_h_column_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_dataTable_0, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("                                <td>");
        if (_jspx_meth_h_column_11((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_dataTable_0, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("                                    </tr>\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_h_dataTable_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_h_dataTable_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_h_dataTable_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_dataTable_var_value_binding.reuse(_jspx_th_h_dataTable_0);
      return true;
    }
    _jspx_tagPool_h_dataTable_var_value_binding.reuse(_jspx_th_h_dataTable_0);
    return false;
  }

  private boolean _jspx_meth_h_column_6(javax.servlet.jsp.tagext.JspTag _jspx_th_h_dataTable_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:column
    com.sun.faces.taglib.html_basic.ColumnTag _jspx_th_h_column_6 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.ColumnTag.class) : new com.sun.faces.taglib.html_basic.ColumnTag();
    _jspx_th_h_column_6.setPageContext(_jspx_page_context);
    _jspx_th_h_column_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_dataTable_0);
    _jspx_th_h_column_6.setJspId("id60");
    int _jspx_eval_h_column_6 = _jspx_th_h_column_6.doStartTag();
    if (_jspx_eval_h_column_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_h_column_6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_h_column_6.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_h_column_6.doInitBody();
      }
      do {
        if (_jspx_meth_h_outputText_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_column_6, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_h_column_6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_h_column_6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_h_column_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_column.reuse(_jspx_th_h_column_6);
      return true;
    }
    _jspx_tagPool_h_column.reuse(_jspx_th_h_column_6);
    return false;
  }

  private boolean _jspx_meth_h_outputText_0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_column_6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:outputText
    com.sun.faces.taglib.html_basic.OutputTextTag _jspx_th_h_outputText_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.OutputTextTag.class) : new com.sun.faces.taglib.html_basic.OutputTextTag();
    _jspx_th_h_outputText_0.setPageContext(_jspx_page_context);
    _jspx_th_h_outputText_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_column_6);
    _jspx_th_h_outputText_0.setJspId("id61");
    _jspx_th_h_outputText_0.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{table.rowIndex+1}", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_h_outputText_0 = _jspx_th_h_outputText_0.doStartTag();
    if (_jspx_th_h_outputText_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_0);
      return true;
    }
    _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_0);
    return false;
  }

  private boolean _jspx_meth_h_column_7(javax.servlet.jsp.tagext.JspTag _jspx_th_h_dataTable_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:column
    com.sun.faces.taglib.html_basic.ColumnTag _jspx_th_h_column_7 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.ColumnTag.class) : new com.sun.faces.taglib.html_basic.ColumnTag();
    _jspx_th_h_column_7.setPageContext(_jspx_page_context);
    _jspx_th_h_column_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_dataTable_0);
    _jspx_th_h_column_7.setJspId("id64");
    int _jspx_eval_h_column_7 = _jspx_th_h_column_7.doStartTag();
    if (_jspx_eval_h_column_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_h_column_7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_h_column_7.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_h_column_7.doInitBody();
      }
      do {
        if (_jspx_meth_h_outputText_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_column_7, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_h_column_7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_h_column_7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_h_column_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_column.reuse(_jspx_th_h_column_7);
      return true;
    }
    _jspx_tagPool_h_column.reuse(_jspx_th_h_column_7);
    return false;
  }

  private boolean _jspx_meth_h_outputText_1(javax.servlet.jsp.tagext.JspTag _jspx_th_h_column_7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:outputText
    com.sun.faces.taglib.html_basic.OutputTextTag _jspx_th_h_outputText_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.OutputTextTag.class) : new com.sun.faces.taglib.html_basic.OutputTextTag();
    _jspx_th_h_outputText_1.setPageContext(_jspx_page_context);
    _jspx_th_h_outputText_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_column_7);
    _jspx_th_h_outputText_1.setJspId("id65");
    _jspx_th_h_outputText_1.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{p.id}", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_h_outputText_1 = _jspx_th_h_outputText_1.doStartTag();
    if (_jspx_th_h_outputText_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_1);
      return true;
    }
    _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_1);
    return false;
  }

  private boolean _jspx_meth_h_column_8(javax.servlet.jsp.tagext.JspTag _jspx_th_h_dataTable_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:column
    com.sun.faces.taglib.html_basic.ColumnTag _jspx_th_h_column_8 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.ColumnTag.class) : new com.sun.faces.taglib.html_basic.ColumnTag();
    _jspx_th_h_column_8.setPageContext(_jspx_page_context);
    _jspx_th_h_column_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_dataTable_0);
    _jspx_th_h_column_8.setJspId("id68");
    int _jspx_eval_h_column_8 = _jspx_th_h_column_8.doStartTag();
    if (_jspx_eval_h_column_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_h_column_8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_h_column_8.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_h_column_8.doInitBody();
      }
      do {
        if (_jspx_meth_h_outputText_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_column_8, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_h_column_8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_h_column_8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_h_column_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_column.reuse(_jspx_th_h_column_8);
      return true;
    }
    _jspx_tagPool_h_column.reuse(_jspx_th_h_column_8);
    return false;
  }

  private boolean _jspx_meth_h_outputText_2(javax.servlet.jsp.tagext.JspTag _jspx_th_h_column_8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:outputText
    com.sun.faces.taglib.html_basic.OutputTextTag _jspx_th_h_outputText_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.OutputTextTag.class) : new com.sun.faces.taglib.html_basic.OutputTextTag();
    _jspx_th_h_outputText_2.setPageContext(_jspx_page_context);
    _jspx_th_h_outputText_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_column_8);
    _jspx_th_h_outputText_2.setJspId("id69");
    _jspx_th_h_outputText_2.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{p.name}", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_h_outputText_2 = _jspx_th_h_outputText_2.doStartTag();
    if (_jspx_th_h_outputText_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_2);
      return true;
    }
    _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_2);
    return false;
  }

  private boolean _jspx_meth_h_column_9(javax.servlet.jsp.tagext.JspTag _jspx_th_h_dataTable_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:column
    com.sun.faces.taglib.html_basic.ColumnTag _jspx_th_h_column_9 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.ColumnTag.class) : new com.sun.faces.taglib.html_basic.ColumnTag();
    _jspx_th_h_column_9.setPageContext(_jspx_page_context);
    _jspx_th_h_column_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_dataTable_0);
    _jspx_th_h_column_9.setJspId("id72");
    int _jspx_eval_h_column_9 = _jspx_th_h_column_9.doStartTag();
    if (_jspx_eval_h_column_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_h_column_9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_h_column_9.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_h_column_9.doInitBody();
      }
      do {
        if (_jspx_meth_h_outputText_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_column_9, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_h_column_9.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_h_column_9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_h_column_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_column.reuse(_jspx_th_h_column_9);
      return true;
    }
    _jspx_tagPool_h_column.reuse(_jspx_th_h_column_9);
    return false;
  }

  private boolean _jspx_meth_h_outputText_3(javax.servlet.jsp.tagext.JspTag _jspx_th_h_column_9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:outputText
    com.sun.faces.taglib.html_basic.OutputTextTag _jspx_th_h_outputText_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.OutputTextTag.class) : new com.sun.faces.taglib.html_basic.OutputTextTag();
    _jspx_th_h_outputText_3.setPageContext(_jspx_page_context);
    _jspx_th_h_outputText_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_column_9);
    _jspx_th_h_outputText_3.setJspId("id73");
    _jspx_th_h_outputText_3.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{p.price}", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_h_outputText_3 = _jspx_th_h_outputText_3.doStartTag();
    if (_jspx_th_h_outputText_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_3);
      return true;
    }
    _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_3);
    return false;
  }

  private boolean _jspx_meth_h_column_10(javax.servlet.jsp.tagext.JspTag _jspx_th_h_dataTable_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:column
    com.sun.faces.taglib.html_basic.ColumnTag _jspx_th_h_column_10 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.ColumnTag.class) : new com.sun.faces.taglib.html_basic.ColumnTag();
    _jspx_th_h_column_10.setPageContext(_jspx_page_context);
    _jspx_th_h_column_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_dataTable_0);
    _jspx_th_h_column_10.setJspId("id76");
    int _jspx_eval_h_column_10 = _jspx_th_h_column_10.doStartTag();
    if (_jspx_eval_h_column_10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_h_column_10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_h_column_10.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_h_column_10.doInitBody();
      }
      do {
        if (_jspx_meth_h_commandButton_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_column_10, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_h_column_10.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_h_column_10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_h_column_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_column.reuse(_jspx_th_h_column_10);
      return true;
    }
    _jspx_tagPool_h_column.reuse(_jspx_th_h_column_10);
    return false;
  }

  private boolean _jspx_meth_h_commandButton_1(javax.servlet.jsp.tagext.JspTag _jspx_th_h_column_10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:commandButton
    com.sun.faces.taglib.html_basic.CommandButtonTag _jspx_th_h_commandButton_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.CommandButtonTag.class) : new com.sun.faces.taglib.html_basic.CommandButtonTag();
    _jspx_th_h_commandButton_1.setPageContext(_jspx_page_context);
    _jspx_th_h_commandButton_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_column_10);
    _jspx_th_h_commandButton_1.setJspId("id77");
    _jspx_th_h_commandButton_1.setAction(org.apache.jasper.runtime.PageContextImpl.getMethodExpression("#{productBean.viewedit(p.id)}", (PageContext)_jspx_page_context, null, java.lang.Object.class, new Class[] {}));
    _jspx_th_h_commandButton_1.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("Edit", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_h_commandButton_1 = _jspx_th_h_commandButton_1.doStartTag();
    if (_jspx_th_h_commandButton_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_commandButton_value_action_nobody.reuse(_jspx_th_h_commandButton_1);
      return true;
    }
    _jspx_tagPool_h_commandButton_value_action_nobody.reuse(_jspx_th_h_commandButton_1);
    return false;
  }

  private boolean _jspx_meth_h_column_11(javax.servlet.jsp.tagext.JspTag _jspx_th_h_dataTable_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:column
    com.sun.faces.taglib.html_basic.ColumnTag _jspx_th_h_column_11 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.ColumnTag.class) : new com.sun.faces.taglib.html_basic.ColumnTag();
    _jspx_th_h_column_11.setPageContext(_jspx_page_context);
    _jspx_th_h_column_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_dataTable_0);
    _jspx_th_h_column_11.setJspId("id80");
    int _jspx_eval_h_column_11 = _jspx_th_h_column_11.doStartTag();
    if (_jspx_eval_h_column_11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_h_column_11 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_h_column_11.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_h_column_11.doInitBody();
      }
      do {
        if (_jspx_meth_h_commandButton_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_column_11, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_h_column_11.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_h_column_11 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_h_column_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_column.reuse(_jspx_th_h_column_11);
      return true;
    }
    _jspx_tagPool_h_column.reuse(_jspx_th_h_column_11);
    return false;
  }

  private boolean _jspx_meth_h_commandButton_2(javax.servlet.jsp.tagext.JspTag _jspx_th_h_column_11, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:commandButton
    com.sun.faces.taglib.html_basic.CommandButtonTag _jspx_th_h_commandButton_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.CommandButtonTag.class) : new com.sun.faces.taglib.html_basic.CommandButtonTag();
    _jspx_th_h_commandButton_2.setPageContext(_jspx_page_context);
    _jspx_th_h_commandButton_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_column_11);
    _jspx_th_h_commandButton_2.setJspId("id81");
    _jspx_th_h_commandButton_2.setAction(org.apache.jasper.runtime.PageContextImpl.getMethodExpression("#{productBean.delete(p.id)}", (PageContext)_jspx_page_context, null, java.lang.Object.class, new Class[] {}));
    _jspx_th_h_commandButton_2.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("Delete", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_h_commandButton_2 = _jspx_th_h_commandButton_2.doStartTag();
    if (_jspx_th_h_commandButton_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_commandButton_value_action_nobody.reuse(_jspx_th_h_commandButton_2);
      return true;
    }
    _jspx_tagPool_h_commandButton_value_action_nobody.reuse(_jspx_th_h_commandButton_2);
    return false;
  }
}
