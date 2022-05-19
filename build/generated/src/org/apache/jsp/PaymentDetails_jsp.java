package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class PaymentDetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>IoTBay: Payment</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"PaymentStyle.css\">\n");
      out.write("        <!--<script src=\"https://kit.fontawesome.com/5b9a15581a.js\" crossorigin=\"anonymous\"></script>-->\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("        <div id=\"top-bar\">\n");
      out.write("           <a href=\"index.html\"><img src=\"iotbaylogo.png\" alt=\"\" id=\"logo\"></a>\n");
      out.write("        </div>\n");
      out.write("    </header>\n");
      out.write("        <main>\n");
      out.write("        <div id=\"middle-div\">\n");
      out.write("            <h1>Please enter your payment details</h1>\n");
      out.write("            <h3>Or <a href=\"register.jsp\">back to order</a></h3>\n");
      out.write("        <!--<form action=\"ready.jsp\" method=\"POST\" id=\"payment-form\">-->\n");
      out.write("            <h2><label for=\"payment-method\">Choose a payment method:</label>\n");
      out.write("            <select id=\"payment-method\" name=\"payment-method\">\n");
      out.write("                <option value=\"visacard\">VISA Card</option>\n");
      out.write("                <option value=\"mastercard\">MasterCard</option>\n");
      out.write("                <option value=\"paypal\">PayPal</option>\n");
      out.write("                <option value=\"applepay\">Apple Pay</option>\n");
      out.write("                <option value=\"giftcard\">Gift Card</option>    \n");
      out.write("            </select>\n");
      out.write("            </h2>\n");
      out.write("            \n");
      out.write("            <form>\n");
      out.write("                <label for=\"name\">Card Owner Name:</label><br>\n");
      out.write("                <input type=\"text\" id=\"COname\" name=\"COname\" placeholder=\"Enter your card owner name...\" required=\"true\"><br>\n");
      out.write("                <label for=\"CNumber\">Card Number:</label><br>\n");
      out.write("                <input type=\"text\" id=\"CNumber\" name=\"CNumber\" placeholder=\"Enter your card number...\" required=\"true\"><br>\n");
      out.write("                <label for=\"EDate\">Expiry Date:</label><br>\n");
      out.write("                <input type=\"text\" id=\"EDate\" name=\"EDate\" placeholder=\"Enter your card expiry date...\" required=\"true\"><br>\n");
      out.write("                <label for=\"cvv\">CVV Code:</label><br>\n");
      out.write("                <input type=\"password\" id=\"cvv\" name=\"cvv\" placeholder=\"Enter your cvv code...\" required=\"true\"><br>\n");
      out.write("                <button type=\"submit\" id=\"payment-button\" value=\"sumbit\">Pay</button>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        </main>\n");
      out.write("        \n");
      out.write("        <footer>\n");
      out.write("            <p>&copy; Group 8</p>\n");
      out.write("            <p>Introduction to Software Development 2022</p>\n");
      out.write("            <p>University of Technology, Sydney</p>\n");
      out.write("        </footer>\n");
      out.write("        \n");
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
