package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cartSummaryPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    \n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"orderStyle.css\">\n");
      out.write("        <title>IoTBay: Cart Summary Page</title>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("            <div id=\"top-bar\">\n");
      out.write("                <a href=\"index.html\"><img src=\"images/iotbaylogo.png\" alt=\"\" id=\"logo\"></a>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("        \n");
      out.write("        ");
      out.write("\n");
      out.write("        <h1>Cart Summary Section (Dynamic)</h1> <br>\n");
      out.write("        \n");
      out.write("        <div id=\"cartDiv\">\n");
      out.write("            \n");
      out.write("            ");
      out.write("\n");
      out.write("            \n");
      out.write("            ");

                //for FUTURE cart component?
                //get needed parameters
                //Need a WatchCartServlet?
                boolean cartEmpty = true; //request if cart is empty?
                boolean loggedIn = false; //request status of session?
                String cartMessage = ""; 
            
      out.write("\n");
      out.write("            \n");
      out.write("            ");

                if (cartEmpty)
                {
                    cartMessage = "It looks like your cart is empty! Head over to the products page to add a product to your cart.";
                }
                else
                {
                    cartMessage = "Please select 'Create Order' to continue!";
                }
            
      out.write("\n");
      out.write("            \n");
      out.write("            <p> ");
      out.print( cartMessage );
      out.write(" </p> <br>\n");
      out.write("            \n");
      out.write("            ");
      out.write("\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        ");
      out.write("\n");
      out.write("        <h1>Save/Create Order Buttons Section (Dynamic)</h1> <br>\n");
      out.write("        \n");
      out.write("        <div id=\"orderButtonsDiv\">\n");
      out.write("            ");
      out.write("\n");
      out.write("            \n");
      out.write("            <form action=\"/CreateOrderServlet\" method=\"post\">\n");
      out.write("                <button>Create Order</button>\n");
      out.write("            </form>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <footer>\n");
      out.write("            <p>&copy; Group 8</p>\n");
      out.write("            <p>Introduction to Software Development 2022</p>\n");
      out.write("            <p>University of Technology, Sydney</p>\n");
      out.write("        </footer>\n");
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
