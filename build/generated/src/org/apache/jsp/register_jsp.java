package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>IoTBay: Register</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"registerStyle.css\">\n");
      out.write("        <script src=\"https://kit.fontawesome.com/5b9a15581a.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("            <div id=\"top-bar\">\n");
      out.write("                <a href=\"index.jsp\"><img src=\"images/iotbaylogo.png\" alt=\"\" id=\"logo\"></a>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("        ");

            String existErr = (String) session.getAttribute("existErr");
        
      out.write("\n");
      out.write("\n");
      out.write("        <main>\n");
      out.write("            <div id=\"middle-div\">\n");
      out.write("                <div id=\"form-headings\">   \n");
      out.write("                    <h1>Register an account</h1>\n");
      out.write("                    <h3>Already a member? <a href=\"login.jsp\">Sign in here.</a></h3>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div id=\"form-container\">\n");
      out.write("                    <span class=\"message\"> ");
      out.print((existErr != null ? existErr : ""));
      out.write("</span>\n");
      out.write("\n");
      out.write("                    <form action=\"");
      out.print(request.getContextPath());
      out.write("/RegisterServlet\"  method=\"post\" id=\"register-form\">\n");
      out.write("                        <div id=\"top-form-container\">\n");
      out.write("                            <div class=\"half-container\" id=\"top-half\">\n");
      out.write("                                <label for=\"name\">Name:</label>\n");
      out.write("                                <input type=\"text\" id=\"name\" name=\"name\" placeholder=\"Enter your full name...\" required=\"true\"><br>\n");
      out.write("                                <label for=\"phone\">Phone number:</label>\n");
      out.write("                                <input type=\"text\" id=\"phone-number\" name=\"phone-number\" placeholder=\"Enter your phone number...\" required=\"true\"><br>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"half-container\">\n");
      out.write("                                <label for=\"address\">Address:</label>\n");
      out.write("                                <input type=\"text\" id=\"address\" name=\"address\" placeholder=\"Enter your full address...\" required=\"true\"><br>\n");
      out.write("                                <label for=\"dob\">Date of birth:</label>\n");
      out.write("                                <input type=\"text\" id=\"dob\" name=\"dob\" placeholder=\"Enter your date of birth...\" required=\"true\"><br>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <div id=\"bottom-form-container\">\n");
      out.write("                            <label for=\"email\">Email:</label>\n");
      out.write("                            <input type=\"text\" id=\"email\" name=\"email\" placeholder=\"Enter your email...\" required=\"true\"><br>\n");
      out.write("                            <label for=\"password\">Password:</label>\n");
      out.write("                            <input type=\"password\" id=\"password\" name=\"password\" placeholder=\"Enter your password...\" required=\"true\"><br>\n");
      out.write("                            <label for=\"password\">Confirm your password:</label>\n");
      out.write("                            <input type=\"password\" placeholder=\"Confirm your password...\"><br>\n");
      out.write("                            <label type=\"text\">Terms of Services</label>\n");
      out.write("                            <input type=\"checkbox\" id=\"tos\" name=\"tos\" required=\"true\"><br>\n");
      out.write("                            <input id=\"submit\" type=\"submit\" value=\"Sign Up\">\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </main>\n");
      out.write("        <footer>\n");
      out.write("            <p>&copy; Group 8</p>\n");
      out.write("            <p>Introduction to Software Development 2022</p>\n");
      out.write("            <p>University of Technology, Sydney</p>\n");
      out.write("        </footer>\n");
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
