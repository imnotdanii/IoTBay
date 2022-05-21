package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.*;
import controller.*;

public final class manageProfile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>IoTBay: User Profile</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"manageProfile.css\">\n");
      out.write("        <script src=\"https://kit.fontawesome.com/5b9a15581a.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <header>\n");
      out.write("        <div id=\"search-area-container\">\n");
      out.write("            <a href=\"index.jsp\"><img src=\"images/iotbaylogo.png\" alt=\"\" id=\"logo\"></a>\n");
      out.write("            <div class=\"search-form-container\">\n");
      out.write("                <form>\n");
      out.write("                    <input type=\"text\" placeholder=\"What are you looking for?\" name=\"search-bar\" id=\"search-bar\">\n");
      out.write("                    <button type=\"submit\"><i class=\"fa-solid fa-magnifying-glass\"></i></button>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"top-buttons\"> \n");
      out.write("                ");

                    User user = (User) session.getAttribute("user");
                
      out.write("\n");
      out.write("                <!-- need to change back to jsp -->\n");
      out.write("                <p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.getName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                <a href=\"logout.jsp\"><button>Log Out</button></a>\n");
      out.write("                <form action=\"");
      out.print(request.getContextPath());
      out.write("/ManageProfileServlet\" method=\"post\">\n");
      out.write("                    <button>Manage My Profile</button>\n");
      out.write("                </form>\n");
      out.write("                <a href=\"\"><i class=\"fa-solid fa-cart-shopping\"></i></a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div id=\"nav-container\">\n");
      out.write("            <nav>\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"index.html\" class=\"nav-link\">Home</a></li>\n");
      out.write("                    <li><a href=\"\"class=\"nav-link\" >Smart Home Devices</a></li>\n");
      out.write("                    <li><a href=\"\" class=\"nav-link\">Industrial Sensors</a></li>\n");
      out.write("                    <li><a href=\"\"class=\"nav-link\">Industrial Robots</a></li>\n");
      out.write("                    <li><a href=\"\"class=\"nav-link\">Healthcare Devices</a></li>\n");
      out.write("                    <li><a href=\"\"class=\"nav-link\">Wiring</a></li>\n");
      out.write("                    <li><a href=\"\"class=\"nav-link\">Modems and Routers</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
      out.write("        </div>\n");
      out.write("    </header>\n");
      out.write("\n");
      out.write("    <div id=\"grid-container\">\n");
      out.write("        <div id=\"navigation\">\n");
      out.write("            <nav id=\"navbar\">\n");
      out.write("                <header><h1 id=\"title\">Account Settings</h1></header>\n");
      out.write("                <ul id=\"account-list\">\n");
      out.write("                    <li><a href=\"#personal-information\" class=\"account-link\">Personal Information</a></li>\n");
      out.write("                    <li><a href=\"#order-history\" class=\"account-link\">Order History</a></li>\n");
      out.write("                    <li><a href=\"#payment-details\" class=\"account-link\">Payment Details</a></li>\n");
      out.write("                    <li><a href=\"#request-access-logs\" class=\"account-link\">Request Access Logs</a></li>\n");
      out.write("                    <li><a href=\"#contact-us\" class=\"account-link\">Contact Us</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div id=\"content\">\n");
      out.write("            <body>\n");
      out.write("                <main id=\"main-doc\">\n");
      out.write("                    <section class=\"main-section\"id=\"personal-information\">\n");
      out.write("                        <header>Personal Information    <a href=\"editUser.jsp\">edit</a>\n");
      out.write("                            </header>\n");
      out.write("                        <ul>\n");
      out.write("                            <h3>Full name: </h3> \n");
      out.write("                            <p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.getName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                            <h3>Current Address: </h3>\n");
      out.write("                            <p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.getAddress()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                            <h3>Date Of Birth: </h3>\n");
      out.write("                            <p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.getDob()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                            <h3>Phone Number: </h3>\n");
      out.write("                            <p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.getPhone()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                            <h3>Email: </h3>\n");
      out.write("                            <p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.getEmail()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                            <h3>Password: </h3>\n");
      out.write("                            <p>******</p>\n");
      out.write("                        </ul>\n");
      out.write("                    </section>\n");
      out.write("                    <section class=\"main-section\" id=\"order-history\">\n");
      out.write("                        <header>Your Order History</header>\n");
      out.write("                        <p>Lorem ipsum dolor sit, amet consectetur adipisicing elit. Quaerat, minus:</p>\n");
      out.write("                        <ul>\n");
      out.write("                            <li>Lorem ipsum dolor sit.</li>\n");
      out.write("                            <li>Lorem ipsum dolor, sit amet consectetur adipisicing elit. Corrupti.</li>\n");
      out.write("                            <li>Lorem ipsum dolor, sit amet consectetur adipisicing elit. Fugit, natus.</li>\n");
      out.write("                        </ul>\n");
      out.write("                    </section>\n");
      out.write("                        \n");
      out.write("                    <section class=\"main-section\"id=\"payment-details\">\n");
      out.write("                        <header>Payment Details    <a href=\"editPayment.jsp\">edit</a>\n");
      out.write("                            </header>\n");
      out.write("                        <ul>\n");
      out.write("                            <h3>Card Owner Name: </h3> \n");
      out.write("                            <p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${payment.getCOName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                            <h3>Expiry Date: </h3>\n");
      out.write("                            <p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${payment.getExpiryDate()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                            <h3>CVV Code: </h3>\n");
      out.write("                            <p>***</p>\n");
      out.write("                        </ul>\n");
      out.write("                    </section>\n");
      out.write("\n");
      out.write("                    <section class=\"main-section\" id=\"request-access-logs\">\n");
      out.write("                        <header>Request Access Logs</header>\n");
      out.write("                        <p>If you would like to view your access logs, <a href=\"\">click here to send an eRequest.</a></p>\n");
      out.write("\n");
      out.write("                    </section>\n");
      out.write("                    <section class=\"main-section\" id=\"contact-us\">\n");
      out.write("                        <header>Contact Us</header>\n");
      out.write("                        <p>If you have any issues with our products, please don't hesitate to contact us through our enquiry form. Please allow 24-48 hours for a customer service agent to respond.</p>\n");
      out.write("                    </section>\n");
      out.write("\n");
      out.write("                    <section class=\"e-section\" id=\"delete-account\">\n");
      out.write("                        <header>Delete Account</header>\n");
      out.write("                        <p>If you wish to delete your account, <a href=\"deleteUser.jsp\">click here</a>. You will not be able to retrieve your account.</p>\n");
      out.write("                    </section>\n");
      out.write("                </main>\n");
      out.write("            </body>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <footer>\n");
      out.write("        <p>&copy; Group 8</p>\n");
      out.write("        <p>Introduction to Software Development 2022</p>\n");
      out.write("        <p>University of Technology, Sydney</p>\n");
      out.write("    </footer>\n");
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
