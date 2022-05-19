package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.*;
import controller.*;

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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>IoTBay: Buy IoT Devices</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"indexStyle.css\">\n");
      out.write("        <script src=\"https://kit.fontawesome.com/5b9a15581a.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body onload=\"startTime()\">\n");
      out.write("        <header>\n");
      out.write("            <div id=\"search-area-container\">\n");
      out.write("                <a href=\"index.html\"><img src=\"images/iotbaylogo.png\" alt=\"\" id=\"logo\"></a>\n");
      out.write("                <div class=\"search-form-container\">\n");
      out.write("                    <form>\n");
      out.write("                        <input type=\"text\" placeholder=\"What are you looking for?\" name=\"search-bar\" id=\"search-bar\">\n");
      out.write("                        <button type=\"submit\"><i class=\"fa-solid fa-magnifying-glass\"></i></button>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"top-buttons\"> \n");
      out.write("                    <!-- need to change back to jsp -->\n");
      out.write("                    ");

                        User user = (User) session.getAttribute("user");

                        if (user == null) {
                    
      out.write("\n");
      out.write("                    <a href=\"login.jsp\"><button>Sign In</button></a>\n");
      out.write("                    <a href=\"register.jsp\"><button>Register</button></a>\n");
      out.write("\n");
      out.write("                    ");
 } else {
                    
      out.write("\n");
      out.write("                    <p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.getName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                    <a href=\"logout.jsp\"><button>Log Out</button></a>\n");
      out.write("                    <form action=\"");
      out.print(request.getContextPath());
      out.write("/ManageProfileServlet\" method=\"post\">\n");
      out.write("                        <button>Manage My Profile</button>\n");
      out.write("                    </form>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                    <a href=\"\"><i class=\"fa-solid fa-cart-shopping\"></i></a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div id=\"nav-container\">\n");
      out.write("                <nav>\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"index.html\" class=\"nav-link\">Home</a></li>\n");
      out.write("                        <li><a href=\"\"class=\"nav-link\" >Smart Home Devices</a></li>\n");
      out.write("                        <li><a href=\"\" class=\"nav-link\">Industrial Sensors</a></li>\n");
      out.write("                        <li><a href=\"\"class=\"nav-link\">Industrial Robots</a></li>\n");
      out.write("                        <li><a href=\"\"class=\"nav-link\">Healthcare Devices</a></li>\n");
      out.write("                        <li><a href=\"\"class=\"nav-link\">Wiring</a></li>\n");
      out.write("                        <li><a href=\"\"class=\"nav-link\">Modems and Routers</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </nav>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("        <main>\n");
      out.write("            <div id=\"slideshow-container\">\n");
      out.write("                <div class=\"img-container slideshow-animation\"><img src=\"placeholder.jpg\" alt=\"\"></div>\n");
      out.write("                <div class=\"img-container slideshow-animation\"><img src=\"placeholder.jpg\" alt=\"\"></div>\n");
      out.write("                <div class=\"img-container slideshow-animation\"><img src=\"placeholder.jpg\" alt=\"\"></div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div id=\"products-container\"> \n");
      out.write("                <div class=\"products-row\">\n");
      out.write("                    <div class=\"products-column\">\n");
      out.write("                        <a href=\"\"><img src=\"images/R7000.png\" alt=\"R7000\"></a> \n");
      out.write("                        <a href=\"\"><img src=\"images/RAX10.jpg\" alt=\"RAX10\"></a> \n");
      out.write("                        <a href=\"\"><img src=\"images/RAX30.jpg\" alt=\"RAX30\"></a> \n");
      out.write("                        <a href=\"\"><img src=\"images/RT2600ac.png\" alt=\"RT2600ac\"></a> \n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"products-column\">\n");
      out.write("                        <a href=\"\"><img src=\"images/raspbi3.webp\" alt=\"\"></a> \n");
      out.write("                        <a href=\"\"><img src=\"images/raspberrypi-modela.webp\" alt=\"\"></a> \n");
      out.write("                        <a href=\"\"><img src=\"images/raspbi4.webp\" alt=\"\"></a> \n");
      out.write("                        <a href=\"\"><img src=\"images/raspbicomputemodel.png\" alt=\"\"></a> \n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"products-column\">\n");
      out.write("                        <a href=\"\"><img src=\"images/ebaydoorbell.webp\" alt=\"\"></a> \n");
      out.write("                        <a href=\"\"><img src=\"images/googledoorbell.png\" alt=\"\"></a> \n");
      out.write("                        <a href=\"\"><img src=\"images/ringdoorbell.webp\" alt=\"\"></a> \n");
      out.write("                        <a href=\"\"><img src=\"images/blackdoorbell.webp\" alt=\"\"></a> \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("        </main>\n");
      out.write("\n");
      out.write("        <footer>\n");
      out.write("            <p>&copy; Group 8</p>\n");
      out.write("            <p>Introduction to Software Development 2022</p>\n");
      out.write("            <p>University of Technology, Sydney</p>\n");
      out.write("        </footer>\n");
      out.write("        <script type=\"text/javascript\" src=\"index.js\"></script>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/ConnServlet", out, true);
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/ManageProfileServlet", out, true);
      out.write("\n");
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
}
