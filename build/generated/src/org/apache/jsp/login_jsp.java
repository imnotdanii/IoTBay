package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>IoTBay: Login</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"loginStyle.css\">\n");
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
            String emailErr = (String) session.getAttribute("emailErr");
            String passErr = (String) session.getAttribute("passErr");
        
      out.write("\n");
      out.write("\n");
      out.write("        <main>\n");
      out.write("            <div id=\"middle-div\">\n");
      out.write("                <h1>Sign in to IoTBay</h1>\n");
      out.write("                <h3>Or <a href=\"register.jsp\">create an account</a></h3>\n");
      out.write("                <span class=\"message\"> ");
      out.print((existErr != null ? existErr : ""));
      out.write("</span>\n");
      out.write("                <form action=\"");
      out.print(request.getContextPath());
      out.write("/LoginServlet\" method=\"POST\">\n");
      out.write("                    <input class=\"\" type=\"email\" name=\"email\" placeholder =\"Enter your email address...\" required><br>\n");
      out.write("                    <input class=\"\" type=\"password\" name=\"password\" placeholder =\"Enter your password...\" required><br>\n");
      out.write("                    <button type=\"submit\" id=\"login-button\">Login</button>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </main>\n");
      out.write("\n");
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
