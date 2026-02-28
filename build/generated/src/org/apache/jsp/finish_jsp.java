package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class finish_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Finish Page</title>\n");
      out.write("        <link rel=\"icon\" type=\"image/x-icon\" href=\"img/logo.png\">\n");
      out.write("        <script src=\"https://kit.fontawesome.com/853d2cd4f0.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css\" integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\" crossorigin=\"anonymous\">\n");
      out.write("        <style>\n");
      out.write("            body {\n");
      out.write("                font-family: serif;\n");
      out.write("                background-color: #ccc;\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("\n");
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
      out.write("            .form-container {\n");
      out.write("                background: #f2f2f2;\n");
      out.write("                opacity: 0.9;\n");
      out.write("                padding: 20px;\n");
      out.write("                margin-top: 20px;\n");
      out.write("                border-radius: 5px;\n");
      out.write("                box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\n");
      out.write("            }\n");
      out.write("            .form-container form {\n");
      out.write("                display: flex;\n");
      out.write("                justify-content: center;\n");
      out.write("                align-items: center;\n");
      out.write("                margin-bottom: 10px;\n");
      out.write("            }\n");
      out.write("            .form-container input[type=\"text\"] {\n");
      out.write("                width: 200px;\n");
      out.write("                padding: 10px;\n");
      out.write("                margin-right: 10px;\n");
      out.write("                border: 1px solid #ccc;\n");
      out.write("                border-radius: 5px;\n");
      out.write("            }\n");
      out.write("            .form-container input[type=\"submit\"] {\n");
      out.write("                padding: 10px 20px;\n");
      out.write("                background: #50b3a2;\n");
      out.write("                color: #fff;\n");
      out.write("                border: none;\n");
      out.write("                border-radius: 5px;\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("            .form-container input[type=\"submit\"]:hover {\n");
      out.write("                background: #45a089;\n");
      out.write("            }\n");
      out.write("            .notification {\n");
      out.write("                color: brown;\n");
      out.write("                font-size: 18px;\n");
      out.write("                text-align: center;\n");
      out.write("                margin-top: 20px;\n");
      out.write("            }\n");
      out.write("            table {\n");
      out.write("                width: 70%;\n");
      out.write("                margin: 20px auto;\n");
      out.write("                border-collapse: collapse;\n");
      out.write("                background-color: cornsilk;\n");
      out.write("            }\n");
      out.write("            table, th, td {\n");
      out.write("                border: 1px solid #ddd;\n");
      out.write("            }\n");
      out.write("            th, td {\n");
      out.write("                padding: 10px;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("            th {\n");
      out.write("                background-color: #50b3a2;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("            tr:nth-child(even) {\n");
      out.write("                background-color: #f2f2f2;\n");
      out.write("            }\n");
      out.write("            tr:hover {\n");
      out.write("                background-color: #ddd;\n");
      out.write("            }\n");
      out.write("            img.rabbitimg {\n");
      out.write("                width: 70px;\n");
      out.write("                height: 70px;\n");
      out.write("            }\n");
      out.write("            input[type=\"submit\"] {\n");
      out.write("                background-color: #dc3545;\n");
      out.write("                color: white;\n");
      out.write("                border: none;\n");
      out.write("                padding: 10px 20px;\n");
      out.write("                text-decoration: none;\n");
      out.write("                margin: 4px 2px;\n");
      out.write("                cursor: pointer;\n");
      out.write("                border-radius: 4px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            input[type=\"submit\"]:hover {\n");
      out.write("                background-color: #c82333;\n");
      out.write("            }\n");
      out.write("            a {\n");
      out.write("                text-decoration: none;\n");
      out.write("                color: #50b3a2;\n");
      out.write("                font-weight: bold;\n");
      out.write("            }\n");
      out.write("            a:hover {\n");
      out.write("                color: #45a089;\n");
      out.write("            }\n");
      out.write("            .navbar{\n");
      out.write("                background-color: blueviolet;\n");
      out.write("                width: 100%;\n");
      out.write("                background-color: #660066;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            header{\n");
      out.write("                background-color: #660066;;\n");
      out.write("            }\n");
      out.write("            .logo{\n");
      out.write("                width: 70px;\n");
      out.write("                height: 40px;\n");
      out.write("            }\n");
      out.write("            footer {\n");
      out.write("                background-color: #f1f1f1;\n");
      out.write("                padding: 10px 0;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("            a {\n");
      out.write("                text-decoration: none;\n");
      out.write("                color: #50b3a2;\n");
      out.write("                font-weight: bold;\n");
      out.write("            }\n");
      out.write("            a:hover {\n");
      out.write("                color: #45a089;\n");
      out.write("            }\n");
      out.write("            .shopagain{\n");
      out.write("                margin: 50px auto 183px;\n");
      out.write("            }\n");
      out.write("            .thanks{\n");
      out.write("                margin-top: 40px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-color: #fef4ec;\">\n");
      out.write("        \n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "headershop.jsp", out, false);
      out.write("\n");
      out.write("        \n");
      out.write("        <br>\n");
      out.write("        <div class=\"thanks\">\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "thankyou.jsp", out, false);
      out.write(" \n");
      out.write("        </div>\n");
      out.write("        <div class=\"shopagain\">\n");
      out.write("            <form action=\"MainController\">\n");
      out.write("                <input type=\"submit\" name=\"action\" value=\"Shop again\" style=\"padding: 8px 16px;\n");
      out.write("                border-radius: 40px;\n");
      out.write("                margin: 10px;     \n");
      out.write("                background-color: black;\n");
      out.write("                    margin-left: 47%;\">\n");
      out.write("            </form> \n");
      out.write("        </div>\n");
      out.write("        <div class=\"footer\"> ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.html", out, false);
      out.write(" </div>\n");
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
