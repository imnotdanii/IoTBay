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
      out.write("        ");
      out.write("\n");
      out.write("        <h1>Header/Menu/Banner Section</h1> <br>\n");
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

                //get needed parameters
                boolean cartEmpty = true; //request if cart is empty?
                boolean loggedIn = false; //request status of session?
                String emptyCartMessage = ""; 
            
      out.write("\n");
      out.write("            \n");
      out.write("            ");

                String accountID;// change this to int?
                if (loggedIn)
                {
                    accountID = request.getParameter("accountID"); //need to do this for int though?
                }
                else
                {
                    accountID = "Un-Registered User"; //or just getID and allocate Id for unreg'd?
                }
            
      out.write("\n");
      out.write("            \n");
      out.write("            ");

                if (cartEmpty)
                {
                    emptyCartMessage = "It looks like your cart is empty! Head over to the products page to add a product to your cart.";
                }
            
      out.write("\n");
      out.write("            \n");
      out.write("            <p> ");
      out.print( emptyCartMessage );
      out.write(" </p> <br>\n");
      out.write("            \n");
      out.write("            ");
      out.write("\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        ");
      out.write("\n");
      out.write("        <h1>Save/Create Order Buttons Section (Dynamic)</h1> <br>\n");
      out.write("        \n");
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
