package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Login Page</title>\n");
      out.write("        <link rel=\"icon\" type=\"image/x-icon\" href=\"img/logo.png\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css\" integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\" crossorigin=\"anonymous\">\n");
      out.write("        <style>\n");
      out.write("            @keyframes gradientAnimation {\n");
      out.write("                0% {\n");
      out.write("                    background-position: 0% 50%;\n");
      out.write("                }\n");
      out.write("                50% {\n");
      out.write("                    background-position: 100% 50%;\n");
      out.write("                }\n");
      out.write("                100% {\n");
      out.write("                    background-position: 0% 50%;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            body {\n");
      out.write("                background:  #fef4ec;\n");
      out.write("                .container {\n");
      out.write("                    width: 80%;\n");
      out.write("                    margin: 0 auto;\n");
      out.write("                    padding: 20px;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                .row {\n");
      out.write("                    display: flex;\n");
      out.write("                    flex-wrap: wrap;\n");
      out.write("                    margin-bottom: 20px;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                .col-md {\n");
      out.write("                    flex: 1;\n");
      out.write("                    padding: 10px;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                .form {\n");
      out.write("                    background-color: #f1f1f1;\n");
      out.write("                    padding: 159px 78px;\n");
      out.write("                    border-radius: 10px;\n");
      out.write("                    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                .form h1 {\n");
      out.write("                    margin-bottom: 40px;\n");
      out.write("                    font-size: 44px;\n");
      out.write("                    color: #252525;\n");
      out.write("                    font-weight: bold;\n");
      out.write("                    text-transform: uppercase;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                .form input[type=\"text\"],\n");
      out.write("                .form input[type=\"password\"] {\n");
      out.write("                    width: 50%; /* Adjust the width as needed */\n");
      out.write("                    padding: 5px; /* Reduce padding to make the input smaller */\n");
      out.write("                    margin-bottom: 10px;\n");
      out.write("                    border: 1px solid #ccc;\n");
      out.write("                    border-radius: 5px;\n");
      out.write("                    font-size: 14px; /* Adjust font size as needed */\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                .form input[type=\"submit\"] {\n");
      out.write("                    padding: 10px 20px;\n");
      out.write("                    border: none;\n");
      out.write("                    border-radius: 5px;\n");
      out.write("                    background-color: #007bff;\n");
      out.write("                    color: white;\n");
      out.write("                    cursor: pointer;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                .form input[type=\"submit\"]:hover {\n");
      out.write("                    background-color: #0056b3;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                .form input[type=\"checkbox\"] {\n");
      out.write("                    margin-right: 10px;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                .form h3 {\n");
      out.write("                    color: red;\n");
      out.write("                    margin-top: 20px;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                img {\n");
      out.write("                    max-width: 100%;\n");
      out.write("                    height: auto;\n");
      out.write("                    display: block;\n");
      out.write("                    margin: 0 auto;\n");
      out.write("                }\n");
      out.write("                footer {\n");
      out.write("                    background-color: #f1f1f1;\n");
      out.write("                    padding: 10px 0;\n");
      out.write("                    text-align: center;\n");
      out.write("                }\n");
      out.write("            </style>\n");
      out.write("        </head>\n");
      out.write("        <body>\n");
      out.write("            <div class=\"container\"> \n");
      out.write("                <div class=\"row\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md\"> &nbsp;</div>\n");
      out.write("\n");
      out.write("                <div class=\"row\"> \n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                        <div class=\"form\" style=\"text-align:center \">\n");
      out.write("                                <h1>JELLYFISH LOGIN</h1>\n");
      out.write("                                <form action=\"LoginController\" method=\"post\">\n");
      out.write("                                    User ID: &nbsp;&nbsp;   <input type=\"text\" name=\"userID\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cookie.cuser.value}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"> <br>\n");
      out.write("                                    Password: <input type=\"password\" name=\"password\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cookie.cpass.value}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"> <br>\n");
      out.write("                                    <input type=\"submit\" name=\"action\" value=\"Login\">\n");
      out.write("                                    <input type=\"checkbox\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${(cookie.crem!=null?'checked':'')}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                                           name=\"rem\" value=\"ON\"> Remember me <br>\n");
      out.write("                                </form>\n");
      out.write("                                ");

                                    if (request.getAttribute("error") != null) {
                                        String loi = (String) request.getAttribute("error");
                                
      out.write("  \n");
      out.write("                                <h3 style=\"color: red\"> ");
      out.print( loi);
      out.write(" </h3>\n");
      out.write("                                ");

                                    }
                                
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </body>\n");
      out.write("        </html>\n");
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
