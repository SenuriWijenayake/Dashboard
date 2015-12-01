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
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            label[for=\"nameFieldId\"] {\n");
      out.write("                color: black;\n");
      out.write("                size: 20px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">  \n");
      out.write("        <title>Welcome to AZD Procurement!</title>\n");
      out.write("        <meta name=\"description\" content=\"\">q\n");
      out.write("        <meta name=\"author\" content=\"templatemo\">\n");
      out.write("        <!-- \n");
      out.write("        Visual Admin Template\n");
      out.write("        http://www.templatemo.com/preview/templatemo_455_visual_admin\n");
      out.write("        -->\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,400italic,700' rel='stylesheet' type='text/css'>\n");
      out.write("        <link href=\"../css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"../css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"../css/templatemo-style.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\n");
      out.write("        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("          <script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\n");
      out.write("          <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\n");
      out.write("        <![endif]-->\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>  \n");
      out.write("        <!-- Left column -->\n");
      out.write("        <div class=\"templatemo-flex-row\">\n");
      out.write("            <div class=\"templatemo-sidebar\">\n");
      out.write("                <header class=\"templatemo-site-header\">\n");
      out.write("                    <div class=\"square\"></div>\n");
      out.write("                    <h1>Dashboard</h1>\n");
      out.write("                </header>\n");
      out.write("                <div class=\"profile-photo-container\">\n");
      out.write("                    <img src=\"../images/profile-photo.jpg\" alt=\"Profile Photo\" class=\"img-responsive\">  \n");
      out.write("                    <div class=\"profile-photo-overlay\"></div>\n");
      out.write("                </div>      \n");
      out.write("                <!-- Search box -->\n");
      out.write("                <form class=\"templatemo-search-form\" role=\"search\">\n");
      out.write("                    <div class=\"input-group\">\n");
      out.write("                        <button type=\"submit\" class=\"fa fa-search\"></button>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"Search\" name=\"srch-term\" id=\"srch-term\">           \n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("                <div class=\"mobile-menu-icon\">\n");
      out.write("                    <i class=\"fa fa-bars\"></i>\n");
      out.write("                </div>\n");
      out.write("                <nav class=\"templatemo-left-nav\">          \n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"../../../../Desktop/AZD_Dashboard/web/www/index.jsp\" class=\"active\"><i class=\"fa fa-home fa-fw\"></i>Home</a></li>\n");
      out.write("                        <li><a href=\"../../../../Desktop/AZD_Dashboard/web/www/index.jsp\"><i class=\"fa fa-bar-chart fa-fw\"></i>Reports</a></li>\n");
      out.write("                        <li><a href=\"../../../../Desktop/AZD_Dashboard/web/www/data-visualization.jsp\"><i class=\"fa fa-database fa-fw\"></i>Data Visualization</a></li>\n");
      out.write("                        <li><a href=\"../../../../Desktop/AZD_Dashboard/web/www/maps.jsp\"><i class=\"fa fa-map-marker fa-fw\"></i>Financials</a></li>\n");
      out.write("                        <li><a href=\"../../../../Desktop/AZD_Dashboard/web/www/manage-users.jsp\"><i class=\"fa fa-users fa-fw\"></i>Manage Users</a></li>\n");
      out.write("                        <li><a href=\"../../../../Desktop/AZD_Dashboard/web/www/preferences.jsp\"><i class=\"fa fa-sliders fa-fw\"></i>Preferences</a></li>\n");
      out.write("                        <li><a href=\"../../../../Desktop/AZD_Dashboard/web/www/index.jsp\"><i class=\"fa fa-eject fa-fw\"></i>Sign Out</a></li>\n");
      out.write("                    </ul>  \n");
      out.write("                </nav>\n");
      out.write("            </div>\n");
      out.write("            <!-- Main content --> \n");
      out.write("\n");
      out.write("            <div class=\"templatemo-content col-1 light-gray-bg\">\n");
      out.write("                <div class=\"templatemo-top-nav-container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <nav class=\"templatemo-top-nav col-lg-12 col-md-12\">\n");
      out.write("                            <ul class=\"text-uppercase\">\n");
      out.write("                                <li><a href=\"\" class=\"active\">Admin panel</a></li>\n");
      out.write("                                <li><a href=\"../../../../Desktop/AZD_Dashboard/web/www/Homepage - Copy.jsp\">Manufacturing & Procurement</a></li>\n");
      out.write("                                <li><a href=\"../../../../Desktop/AZD_Dashboard/web/www/Research.jsp\">Research and Development</a></li>\n");
      out.write("                                <li><a href=\"\"></a></li>\n");
      out.write("                                <li><a href=\"../../../../Desktop/AZD_Dashboard/web/www/login.jsp\"> </a></li>\n");
      out.write("                            </ul>  \n");
      out.write("                        </nav> \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"templatemo-content-container\">\n");
      out.write("\n");
      out.write("                    <input type=\"image\" src=\"../images/banner1.jpg\">     \n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"templatemo-flex-row flex-content-row\">\n");
      out.write("                    <div class=\"col-1\">\n");
      out.write("                        <div class=\"col-1\"></div>           \n");
      out.write("                    </div> <!-- Second row ends -->\n");
      out.write("                    <div class=\"templatemo-flex-row flex-content-row templatemo-overflow-hidden\"> <!-- overflow hidden for iPad mini landscape view-->\n");
      out.write("                        <div class=\"col-1 templatemo-overflow-hidden\"></div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div>\n");
      out.write("                        ");
      if (_jspx_meth_s_label_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        <br/><br/>\n");
      out.write("                        <table border=\"1\" cellpadding=\"15\" align=\"center\" width=\"80%\" height=\"80%\">\n");
      out.write("                            <thead>\n");
      out.write("                                <tr>\n");
      out.write("                                    <th>Requisitions</th>\n");
      out.write("                                    <th>Procurements</th>\n");
      out.write("                                </tr>\n");
      out.write("                            </thead>\n");
      out.write("                            <tbody>\n");
      out.write("\n");
      out.write("                                <tr>\n");
      out.write("                                    <td> <a href=\"materialRequisition.jsp\">\n");
      out.write("                                            Create New Procurement</td>\n");
      out.write("                                    <td> <a href=\"placePurchaseOrder.jsp\">\n");
      out.write("                                            Place Purchase Order\n");
      out.write("                                        </a> </td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td> <a href=\"viewExistingRequisitions.jsp\">\n");
      out.write("                                            View Existing Procurements\n");
      out.write("                                        </a></td>\n");
      out.write("                                    <td>\n");
      out.write("                                        <a href=\"viewPurchaseOrders.jsp\">\n");
      out.write("                                            View Purchase Orders \n");
      out.write("                                        </a> \n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td><a href=\"updateReq.jsp\">\n");
      out.write("                                            Update Procurement Details\n");
      out.write("                                        </a></td>\n");
      out.write("                                    <td>\n");
      out.write("\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td><a href=\"deleteRequisition.jsp\">\n");
      out.write("                                            Delete Requisitions\n");
      out.write("                                        </a>\n");
      out.write("                                    <td>\n");
      out.write("\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("                            </tbody>\n");
      out.write("                        </table>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <hr>\n");
      out.write("                    <hr><div>\n");
      out.write("                        <hr>\n");
      out.write("                        <footer class=\"text-right\">\n");
      out.write("                            <p>Copyright &copy; 2015 Dashboard \n");
      out.write("                                | Designed by <a href=\"http://www.EAD.com\" target=\"_parent\">Team EAD</a></p>\n");
      out.write("                        </footer> \n");
      out.write("                    </div>        \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- JS -->\n");
      out.write("        <script src=\"../../../../Desktop/AZD_Dashboard/web/www/js/jquery-1.11.2.min.js\"></script>      <!-- jQuery -->\n");
      out.write("        <script src=\"../../../../Desktop/AZD_Dashboard/web/www/js/jquery-migrate-1.2.1.min.js\"></script> <!--  jQuery Migrate Plugin -->\n");
      out.write("        <script src=\"https://www.google.com/jsapi\"></script> <!-- Google Chart -->\n");
      out.write("        <script>\n");
      out.write("            /* Google Chart \n");
      out.write("             -------------------------------------------------------------------*/\n");
      out.write("            // Load the Visualization API and the piechart package.\n");
      out.write("            google.load('visualization', '1.0', {'packages': ['corechart']});\n");
      out.write("\n");
      out.write("            // Set a callback to run when the Google Visualization API is loaded.\n");
      out.write("            google.setOnLoadCallback(drawChart);\n");
      out.write("\n");
      out.write("            // Callback that creates and populates a data table,\n");
      out.write("            // instantiates the pie chart, passes in the data and\n");
      out.write("            // draws it.\n");
      out.write("            function drawChart() {\n");
      out.write("\n");
      out.write("                // Create the data table.\n");
      out.write("                var data = new google.visualization.DataTable();\n");
      out.write("                data.addColumn('string', 'Topping');\n");
      out.write("                data.addColumn('number', 'Slices');\n");
      out.write("                data.addRows([\n");
      out.write("                    ['V Type Engines', 3],\n");
      out.write("                    ['4 Cylinder Engines', 1],\n");
      out.write("                    ['Boxer Engines', 1],\n");
      out.write("                    ['Intercooler', 1],\n");
      out.write("                    ['Turbo', 2]\n");
      out.write("                ]);\n");
      out.write("\n");
      out.write("                // Set chart options\n");
      out.write("                var options = {'title': 'Most Trending Sales'};\n");
      out.write("\n");
      out.write("                // Instantiate and draw our chart, passing in some options.\n");
      out.write("                var pieChart = new google.visualization.PieChart(document.getElementById('pie_chart_div'));\n");
      out.write("                pieChart.draw(data, options);\n");
      out.write("\n");
      out.write("                var barChart = new google.visualization.BarChart(document.getElementById('bar_chart_div'));\n");
      out.write("                barChart.draw(data, options);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            $(document).ready(function() {\n");
      out.write("                if ($.browser.mozilla) {\n");
      out.write("                    //refresh page on browser resize\n");
      out.write("                    // http://www.sitepoint.com/jquery-refresh-page-browser-resize/\n");
      out.write("                    $(window).bind('resize', function(e)\n");
      out.write("                    {\n");
      out.write("                        if (window.RT)\n");
      out.write("                            clearTimeout(window.RT);\n");
      out.write("                        window.RT = setTimeout(function()\n");
      out.write("                        {\n");
      out.write("                            this.location.reload(false); /* false to get page from cache */\n");
      out.write("                        }, 200);\n");
      out.write("                    });\n");
      out.write("                } else {\n");
      out.write("                    $(window).resize(function() {\n");
      out.write("                        drawChart();\n");
      out.write("                    });\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("        <script type=\"text/javascript\" src=\"../../../../Desktop/AZD_Dashboard/web/www/js/templatemo-script.js\"></script>      <!-- Templatemo Script -->\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>");
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
    _jspx_th_s_label_0.setValue("Manufacturing & Procurement Home");
    _jspx_th_s_label_0.setDynamicAttribute(null, "style", new String("font-size: 20pt;"));
    int _jspx_eval_s_label_0 = _jspx_th_s_label_0.doStartTag();
    if (_jspx_th_s_label_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_label_value_type_style_nobody.reuse(_jspx_th_s_label_0);
      return true;
    }
    _jspx_tagPool_s_label_value_type_style_nobody.reuse(_jspx_th_s_label_0);
    return false;
  }
}
