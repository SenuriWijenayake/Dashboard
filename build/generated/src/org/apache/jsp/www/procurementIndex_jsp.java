package org.apache.jsp.www;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class procurementIndex_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_label_value_type_style_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_s_label_value_type_style_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_s_label_value_type_style_nobody.release();
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Welcome to AZD Procurement!</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      if (_jspx_meth_s_label_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        <br/><br/><br><br>\n");
      out.write("        <a href=\"materialRequisition.jsp\">\n");
      out.write("            ");
      if (_jspx_meth_s_label_1(_jspx_page_context))
        return;
      out.write(" \n");
      out.write("        </a> <br><br><br>\n");
      out.write("        <a href=\"viewExistingRequisitions.jsp\">\n");
      out.write("            ");
      if (_jspx_meth_s_label_2(_jspx_page_context))
        return;
      out.write(" \n");
      out.write("        </a> <br><br><br>\n");
      out.write("        <a href=\"updateReq.jsp\">\n");
      out.write("            ");
      if (_jspx_meth_s_label_3(_jspx_page_context))
        return;
      out.write(" \n");
      out.write("        </a> <br><br><br>\n");
      out.write("        <a href=\"deleteRequisition.jsp\">\n");
      out.write("            ");
      if (_jspx_meth_s_label_4(_jspx_page_context))
        return;
      out.write(" \n");
      out.write("        </a> <br><br><br>\n");
      out.write("        <a href=\"placePurchaseOrder.jsp\">\n");
      out.write("            ");
      if (_jspx_meth_s_label_5(_jspx_page_context))
        return;
      out.write(" \n");
      out.write("        </a> <br><br><br>\n");
      out.write("        <a href=\"viewPurchaseOrders.jsp\">\n");
      out.write("            ");
      if (_jspx_meth_s_label_6(_jspx_page_context))
        return;
      out.write(" \n");
      out.write("        </a> <br><br><br>\n");
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

  private boolean _jspx_meth_s_label_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:label
    org.apache.struts2.views.jsp.ui.LabelTag _jspx_th_s_label_0 = (org.apache.struts2.views.jsp.ui.LabelTag) _jspx_tagPool_s_label_value_type_style_nobody.get(org.apache.struts2.views.jsp.ui.LabelTag.class);
    _jspx_th_s_label_0.setPageContext(_jspx_page_context);
    _jspx_th_s_label_0.setParent(null);
    _jspx_th_s_label_0.setDynamicAttribute(null, "type", new String("text"));
    _jspx_th_s_label_0.setValue("Procurement Home");
    _jspx_th_s_label_0.setDynamicAttribute(null, "style", new String("font-size: 20pt;"));
    int _jspx_eval_s_label_0 = _jspx_th_s_label_0.doStartTag();
    if (_jspx_th_s_label_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_label_value_type_style_nobody.reuse(_jspx_th_s_label_0);
      return true;
    }
    _jspx_tagPool_s_label_value_type_style_nobody.reuse(_jspx_th_s_label_0);
    return false;
  }

  private boolean _jspx_meth_s_label_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:label
    org.apache.struts2.views.jsp.ui.LabelTag _jspx_th_s_label_1 = (org.apache.struts2.views.jsp.ui.LabelTag) _jspx_tagPool_s_label_value_type_style_nobody.get(org.apache.struts2.views.jsp.ui.LabelTag.class);
    _jspx_th_s_label_1.setPageContext(_jspx_page_context);
    _jspx_th_s_label_1.setParent(null);
    _jspx_th_s_label_1.setDynamicAttribute(null, "type", new String("text"));
    _jspx_th_s_label_1.setValue("Create New Procurement");
    _jspx_th_s_label_1.setDynamicAttribute(null, "style", new String("font-size: 15pt;"));
    int _jspx_eval_s_label_1 = _jspx_th_s_label_1.doStartTag();
    if (_jspx_th_s_label_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_label_value_type_style_nobody.reuse(_jspx_th_s_label_1);
      return true;
    }
    _jspx_tagPool_s_label_value_type_style_nobody.reuse(_jspx_th_s_label_1);
    return false;
  }

  private boolean _jspx_meth_s_label_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:label
    org.apache.struts2.views.jsp.ui.LabelTag _jspx_th_s_label_2 = (org.apache.struts2.views.jsp.ui.LabelTag) _jspx_tagPool_s_label_value_type_style_nobody.get(org.apache.struts2.views.jsp.ui.LabelTag.class);
    _jspx_th_s_label_2.setPageContext(_jspx_page_context);
    _jspx_th_s_label_2.setParent(null);
    _jspx_th_s_label_2.setDynamicAttribute(null, "type", new String("text"));
    _jspx_th_s_label_2.setValue("View Existing Procurements");
    _jspx_th_s_label_2.setDynamicAttribute(null, "style", new String("font-size: 15pt;"));
    int _jspx_eval_s_label_2 = _jspx_th_s_label_2.doStartTag();
    if (_jspx_th_s_label_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_label_value_type_style_nobody.reuse(_jspx_th_s_label_2);
      return true;
    }
    _jspx_tagPool_s_label_value_type_style_nobody.reuse(_jspx_th_s_label_2);
    return false;
  }

  private boolean _jspx_meth_s_label_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:label
    org.apache.struts2.views.jsp.ui.LabelTag _jspx_th_s_label_3 = (org.apache.struts2.views.jsp.ui.LabelTag) _jspx_tagPool_s_label_value_type_style_nobody.get(org.apache.struts2.views.jsp.ui.LabelTag.class);
    _jspx_th_s_label_3.setPageContext(_jspx_page_context);
    _jspx_th_s_label_3.setParent(null);
    _jspx_th_s_label_3.setDynamicAttribute(null, "type", new String("text"));
    _jspx_th_s_label_3.setValue("Update Procurement Details");
    _jspx_th_s_label_3.setDynamicAttribute(null, "style", new String("font-size: 15pt;"));
    int _jspx_eval_s_label_3 = _jspx_th_s_label_3.doStartTag();
    if (_jspx_th_s_label_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_label_value_type_style_nobody.reuse(_jspx_th_s_label_3);
      return true;
    }
    _jspx_tagPool_s_label_value_type_style_nobody.reuse(_jspx_th_s_label_3);
    return false;
  }

  private boolean _jspx_meth_s_label_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:label
    org.apache.struts2.views.jsp.ui.LabelTag _jspx_th_s_label_4 = (org.apache.struts2.views.jsp.ui.LabelTag) _jspx_tagPool_s_label_value_type_style_nobody.get(org.apache.struts2.views.jsp.ui.LabelTag.class);
    _jspx_th_s_label_4.setPageContext(_jspx_page_context);
    _jspx_th_s_label_4.setParent(null);
    _jspx_th_s_label_4.setDynamicAttribute(null, "type", new String("text"));
    _jspx_th_s_label_4.setValue("Delete Requisitions");
    _jspx_th_s_label_4.setDynamicAttribute(null, "style", new String("font-size: 15pt;"));
    int _jspx_eval_s_label_4 = _jspx_th_s_label_4.doStartTag();
    if (_jspx_th_s_label_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_label_value_type_style_nobody.reuse(_jspx_th_s_label_4);
      return true;
    }
    _jspx_tagPool_s_label_value_type_style_nobody.reuse(_jspx_th_s_label_4);
    return false;
  }

  private boolean _jspx_meth_s_label_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:label
    org.apache.struts2.views.jsp.ui.LabelTag _jspx_th_s_label_5 = (org.apache.struts2.views.jsp.ui.LabelTag) _jspx_tagPool_s_label_value_type_style_nobody.get(org.apache.struts2.views.jsp.ui.LabelTag.class);
    _jspx_th_s_label_5.setPageContext(_jspx_page_context);
    _jspx_th_s_label_5.setParent(null);
    _jspx_th_s_label_5.setDynamicAttribute(null, "type", new String("text"));
    _jspx_th_s_label_5.setValue("Place Purchase Order");
    _jspx_th_s_label_5.setDynamicAttribute(null, "style", new String("font-size: 15pt;"));
    int _jspx_eval_s_label_5 = _jspx_th_s_label_5.doStartTag();
    if (_jspx_th_s_label_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_label_value_type_style_nobody.reuse(_jspx_th_s_label_5);
      return true;
    }
    _jspx_tagPool_s_label_value_type_style_nobody.reuse(_jspx_th_s_label_5);
    return false;
  }

  private boolean _jspx_meth_s_label_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:label
    org.apache.struts2.views.jsp.ui.LabelTag _jspx_th_s_label_6 = (org.apache.struts2.views.jsp.ui.LabelTag) _jspx_tagPool_s_label_value_type_style_nobody.get(org.apache.struts2.views.jsp.ui.LabelTag.class);
    _jspx_th_s_label_6.setPageContext(_jspx_page_context);
    _jspx_th_s_label_6.setParent(null);
    _jspx_th_s_label_6.setDynamicAttribute(null, "type", new String("text"));
    _jspx_th_s_label_6.setValue("View Purchase Orders");
    _jspx_th_s_label_6.setDynamicAttribute(null, "style", new String("font-size: 15pt;"));
    int _jspx_eval_s_label_6 = _jspx_th_s_label_6.doStartTag();
    if (_jspx_th_s_label_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_label_value_type_style_nobody.reuse(_jspx_th_s_label_6);
      return true;
    }
    _jspx_tagPool_s_label_value_type_style_nobody.reuse(_jspx_th_s_label_6);
    return false;
  }
}
