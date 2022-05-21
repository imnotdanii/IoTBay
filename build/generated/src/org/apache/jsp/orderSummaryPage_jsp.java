package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.*;
import controller.*;

public final class orderSummaryPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write('\n');
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
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"orderStyle.css\">\n");
      out.write("        <title>IoTBay: Order Form Page</title>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <header>\n");
      out.write("            <div id=\"top-bar\">\n");
      out.write("                <a href=\"index.jsp\"><img src=\"images/iotbaylogo.png\" alt=\"\" id=\"logo\"></a>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("        \n");
      out.write("        <h1>Products in Order:</h1> <br>\n");
      out.write("        <p>[Display Products in Cart]</p><br>\n");
      out.write("        ");
      out.write("\n");
      out.write("        ");
 
            //Get list of products in Cart, (request?) NEED CART OBJECT?
            //for loop through products and for each, jsp html to display.
            //${user.getOrders()} --?
        
      out.write("\n");
      out.write("        \n");
      out.write("        <h1>Contact & Address Information:</h1> <br>\n");
      out.write("        ");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("        \n");
      out.write("        ");

            User user = (User) session.getAttribute("user");
                if (user == null) {
        
      out.write("\n");
      out.write("                ");
      out.write("\n");
      out.write("                \n");
      out.write("                <p>Please provide your details to complete your order.</p><br>\n");
      out.write("                <br>\n");
      out.write("                <div id=\"customerDetailsDiv\">\n");
      out.write("                    <form action=\"");
      out.print(request.getContextPath());
      out.write("/SaveOrderServlet\"  method=\"post\">\n");
      out.write("                        <div id=\"custDeetsSubDivContact\">\n");
      out.write("                            <label for=\"name\">Name:</label>\n");
      out.write("                            <input type=\"text\" id=\"name\" name=\"name\" placeholder=\"Enter your full name...\" required=\"true\"><br>\n");
      out.write("                            <label for=\"email\">Email:</label>\n");
      out.write("                            <input type=\"text\" id=\"email\" name=\"email\" placeholder=\"Enter your email...\" required=\"true\"><br>\n");
      out.write("                            <label for=\"phone\">Phone number:</label>\n");
      out.write("                            <input type=\"text\" id=\"phone-number\" name=\"phone-number\" placeholder=\"Enter your phone number...\" required=\"true\"><br>\n");
      out.write("                        </div><br>\n");
      out.write("                        <div id=\"custDeetsSubDivAddress\">\n");
      out.write("                            <label for=\"address\">Address:</label>\n");
      out.write("                            <input type=\"text\" id=\"address\" name=\"address\" placeholder=\"Enter your full address...\" required=\"true\"><br>\n");
      out.write("                            <label type=\"text\">Accept Terms of Service:</label>\n");
      out.write("                            <input type=\"checkbox\" id=\"tos\" name=\"tos\" required=\"true\"><br>\n");
      out.write("                        </div><br>\n");
      out.write("                        <br>\n");
      out.write("                        ");
      out.write("\n");
      out.write("                        <input type=\"submit\" name=\"button1\" value=\"Save Order\" >\n");
      out.write("                        <input type=\"submit\" name=\"button2\" value=\"Proceed To Payment\" >\n");
      out.write("                        <input type=\"submit\" name=\"button3\" value=\"Cancel Order\" >\n");
      out.write("                        ");
      out.write("\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("                <br>\n");
      out.write("                <div id=\"login-button-Div\">\n");
      out.write("                    <p id=\"smallFont\">(Or if you already have an account, Sign in here:)</p><br>\n");
      out.write("                    <a href=\"login.jsp\"><button>Sign In</button></a><br>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("        ");
 
            } else {
        
      out.write("\n");
      out.write("                ");
      out.write("\n");
      out.write("                \n");
      out.write("                <p>Please check that your information is correct</p><br>\n");
      out.write("                <p>Name: </p><p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.getName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                <p>Email: </p><p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.getEmail()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                <p>Date of Birth: </p><p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.getDOB()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                <p>Phone Number: </p><p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.getPhone()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p><br>\n");
      out.write("                <p>Address: </p><p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.getAddress()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p><br>\n");
      out.write("                <br>\n");
      out.write("                <label type=\"text\">Accept Terms of Service:</label>\n");
      out.write("                            <input type=\"checkbox\" id=\"tos\" name=\"tos\" required=\"true\"><br>\n");
      out.write("                <a href=\"logout.jsp\"><button>Log Out</button></a>\n");
      out.write("                \n");
      out.write("                <form action=\"");
      out.print(request.getContextPath());
      out.write("/ManageProfileServlet\" method=\"post\">\n");
      out.write("                    ");
      out.write("\n");
      out.write("                    <button>Change Details</button><br>\n");
      out.write("                </form>\n");
      out.write("                <form>\n");
      out.write("                    ");
      out.write("\n");
      out.write("                    <br>\n");
      out.write("                        <input type=\"submit\" name=\"button1\" value=\"Save Order\" >\n");
      out.write("                        <input type=\"submit\" name=\"button2\" value=\"Proceed To Payment\" >\n");
      out.write("                        <input type=\"submit\" name=\"button3\" value=\"Cancel Order\" >\n");
      out.write("                    ");
      out.write("\n");
      out.write("                </form>\n");
      out.write("        ");

            }
        
      out.write("\n");
      out.write("        \n");
      out.write("        ");
      out.write("\n");
      out.write("        <div id=\"orderButtonsDiv\">\n");
      out.write("            ");
      out.write("\n");
      out.write("            ");
      out.write("\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <footer>\n");
      out.write("            <p>&copy; Group 8</p>\n");
      out.write("            <p>Introduction to Software Development 2022</p>\n");
      out.write("            <p>University of Technology, Sydney</p>\n");
      out.write("        </footer>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("    \n");
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
