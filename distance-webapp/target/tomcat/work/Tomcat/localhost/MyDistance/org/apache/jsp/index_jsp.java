/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2023-06-07 12:22:49 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<script src=\"http://code.jquery.com/jquery-latest.js\"></script>\n");
      out.write("<script>\n");
      out.write("$(document).ready(function() {\n");
      out.write("$('#submit').click(function(event) {\n");
      out.write("var mydistance=$('#mydistance').val();\n");
      out.write("var mydistanceIn=$('[name=distin]:checked').val();\n");
      out.write("var convertTo=$('[name=convertto]:checked').val();\n");
      out.write("if(mydistanceIn==convertTo){\n");
      out.write("    alert(\"Cannot have same unit\");\n");
      out.write("    return false;\n");
      out.write("}\n");
      out.write("console.log(mydistance+mydistanceIn+convertTo);\n");
      out.write("$.get('mydistance',{distance:mydistance,distIn:\n");
      out.write("mydistanceIn,convert:convertTo},function(responseText) {\n");
      out.write("$('#convertvalue').text(responseText);\n");
      out.write("});\n");
      out.write("});\n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<h2>MyDistance Utility</h2>\n");
      out.write("<form>\n");
      out.write("    <table>\n");
      out.write("        <tr>\n");
      out.write("            <td><input type=\"text\" id=\"mydistance\" name='distance'\n");
      out.write("            placeholder=\"My Distance In\"></td>\n");
      out.write("            <td> <input type=\"radio\" name=\"distin\" id=\"distin\"\n");
      out.write("            value=\"km\">KM<br>\n");
      out.write("            <input type=\"radio\" name=\"distin\" id=\"distin\"\n");
      out.write("            value=\"m\">Metre</td>\n");
      out.write("        </tr>\n");
      out.write("        <tr></tr>\n");
      out.write("        <tr></tr>\n");
      out.write("        <tr></tr>\n");
      out.write("        <tr>\n");
      out.write("            <td> <label for=\"convert\">Convert To</label></td>\n");
      out.write("            <td> <input type=\"radio\" name=\"convertto\" id=\"convertto\"\n");
      out.write("            value=\"yd\">Yard<br>\n");
      out.write("            <input type=\"radio\" name=\"convertto\" id=\"convertto\"\n");
      out.write("            value=\"mi\">Miles</td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td><input type=\"button\" id=\"submit\" value='Convert'></td>\n");
      out.write("        </tr>\n");
      out.write("    </table>\n");
      out.write("<div id=\"convertvalue\"> </div>\n");
      out.write("</form>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
