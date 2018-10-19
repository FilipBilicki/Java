package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Kalkulator kredytowy</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<form action=\"HelloServlet\" method=\"get\">\r\n");
      out.write(" <div>\r\n");
      out.write("        <label>Wnioskowana kwota kredytu: <input type=\"text\" id=\"kwota\" name=\"kwota\"/></label>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div>\r\n");
      out.write("        <label>Ilosc rat: <input type=\"text\" id=\"ilosc_rat\" name=\"ilosc_rat\"/></label>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div>\r\n");
      out.write("        <label>Oprocentowanie   : <input type=\"text\" id=\"oprocentowanie\" name=\"oprocentowanie\"/></label>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div>\r\n");
      out.write("        <label>Oplata stala: <input type=\"text\" id=\"oplata_stala\" name=\"oplata_stala\"/></label>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div>\r\n");
      out.write("        <label>Rodzaj rat : malejaca,<input type=\"radio\" id=\"rodzaj_raty\" name=\"rodzaj_raty\" value=\"malejaca\"/></label> \r\n");
      out.write("       <label> stala: <input type=\"radio\" id=\"rodzaj_raty\" name=\"rodzaj_raty\" value=\"stala\"/></label>\r\n");
      out.write("        </div>\r\n");
      out.write("<input type=\"submit\" value=\"wyslij\"/>\r\n");
      out.write("</form>\r\n");
      out.write("</body>\r\n");
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
