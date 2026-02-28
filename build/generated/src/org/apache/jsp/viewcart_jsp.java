package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import product.CartDTO;
import product.ProductDTO;
import java.util.List;

public final class viewcart_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Viewcart Page</title>\n");
      out.write("        <link rel=\"icon\" type=\"image/x-icon\" href=\"img/logo.png\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css\" integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\" crossorigin=\"anonymous\">\n");
      out.write("        <style>\n");
      out.write("            body {\n");
      out.write("                background-color: #f1f1f1;\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("                text-align: center;\n");
      out.write("                height: 700px;\n");
      out.write("            }\n");
      out.write("            .cont{\n");
      out.write("                text-align: center;\n");
      out.write("                width: 100%;\n");
      out.write("                float: left;\n");
      out.write("                font-size: 44px;\n");
      out.write("                color: #252525;\n");
      out.write("                font-weight: bold;\n");
      out.write("                text-transform: uppercase;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .social ul{\n");
      out.write("                margin-top: 20px;\n");
      out.write("                display: flex; \n");
      out.write("                justify-content: space-around;\n");
      out.write("                list-style: none;\n");
      out.write("            }\n");
      out.write("            .social ul a{\n");
      out.write("                margin-top: 20px;\n");
      out.write("                color: black;\n");
      out.write("                text-decoration: none;\n");
      out.write("            }\n");
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
      out.write("                background-color: #dda285e6;\n");
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
      out.write("                color: black;\n");
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
      out.write("            .logo{\n");
      out.write("                width: 70px;\n");
      out.write("                height: 40px;\n");
      out.write("            }\n");
      out.write("            .button{\n");
      out.write("                padding: 8px 16px;\n");
      out.write("                border-radius: 40px;\n");
      out.write("                margin: 10px; \n");
      out.write("            }\n");
      out.write("           \n");
      out.write("            \n");
      out.write("            .checkout{\n");
      out.write("                margin-bottom: 150px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-color: #fef4ec;\">\n");
      out.write("        ");

            String user = (String) session.getAttribute("user");
        
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "headershop.jsp", out, false);
      out.write("\n");
      out.write("        <div class=\"container\"> \n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-12\">  \n");
      out.write("                    <h1><i>My Cart</i></h1>\n");
      out.write("                    <h4> <p class=\"cont\"> Welcome ");
      out.print( user);
      out.write("</p></h4> \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <br>\n");
      out.write("        ");

            CartDTO cart = (CartDTO) session.getAttribute("CART");
            if (cart != null) {
                if (cart.getCart().size() > 0) {
        
      out.write("\n");
      out.write("        <table border=\"1px\">\n");
      out.write("            <tr>\n");
      out.write("                <th> Rabbit name </th>\n");
      out.write("                <th>  img </th>\n");
      out.write("                <th> Description </th>\n");
      out.write("                <th> Price </th>\n");
      out.write("                <th> Quanity </th>\n");
      out.write("                <th> Action </th>\n");
      out.write("            </tr>\n");
      out.write("            ");

                for (ProductDTO i : cart.getCart()) {
            
      out.write("\n");
      out.write("            <form action=\"MainController\"> \n");
      out.write("                <tr>\n");
      out.write("                    <td style=\"font-weight: bold;\"> \n");
      out.write("                        ");
      out.print(i.getName());
      out.write(" \n");
      out.write("                        <input type=\"hidden\" name=\"productName\" value=\"");
      out.print(i.getName());
      out.write("\">\n");
      out.write("                    </td>\n");
      out.write("                    <td> <img class=\"rabbitimg\" src=\"img/");
      out.print( i.getpImage());
      out.write("\"  </td>\n");
      out.write("                    <td> ");
      out.print(i.getpDescription());
      out.write("  </td>\n");
      out.write("                    <td> ");
      out.print(i.getPrice());
      out.write(" $ </td>\n");
      out.write("                    <td> \n");
      out.write("                        <input type=\"number\" name=\"productQuantity\" min=\"1\" required=\"\" value=\"");
      out.print(i.getQuantity());
      out.write("\">\n");
      out.write("                    </td>\n");
      out.write("                    <td> \n");
      out.write("                        <input type=\"hidden\" name=\"pId\" value=\"");
      out.print( i.getpId());
      out.write("\"> \n");
      out.write("                        <input type=\"submit\" name=\"action\" value=\"Edit\" style=\"padding: 8px 16px;\n");
      out.write("                border-radius: 40px;\n");
      out.write("                margin: 10px; \n");
      out.write("                background-color: black\"> \n");
      out.write("                        <input type=\"submit\" name=\"action\" value=\"Remove\" style=\"padding: 8px 16px;\n");
      out.write("                border-radius: 40px;\n");
      out.write("                margin: 10px;\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </form>\n");
      out.write("            ");

                }
            
      out.write("\n");
      out.write("        </table>\n");
      out.write("        ");

                }
            }
            if (cart == null || cart.getCart().isEmpty()) {
        
      out.write("\n");
      out.write("        <div class=\"noti\">\n");
      out.write("            <h3 style=\"color: red\">\n");
      out.write("                Your cart is empty !!\n");
      out.write("            </h3> \n");
      out.write("        </div>\n");
      out.write("        ");

            }
            if (cart != null && !cart.getCart().isEmpty()) {
                float total = cart.totalMoney();
        
      out.write("\n");
      out.write("        <h3 style=\"color: brown\">\n");
      out.write("            Your total money is: ");
      out.print( total);
      out.write(" $\n");
      out.write("        </h3>\n");
      out.write("        ");

            }
        
      out.write("\n");
      out.write("\n");
      out.write("        <br>\n");
      out.write("        <h3 style=\"color: red\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.outOfStock}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("   </h3>\n");
      out.write("        <h3 style=\"color: red\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.error}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("  </h3>\n");
      out.write("        <h3 style=\"color: red\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.editError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("  </h3>\n");
      out.write("        <h3 style=\"color: red\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.emptyCart}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("  </h3>\n");
      out.write("        ");

            if (request.getAttribute("emptyCart") != null) {
        
      out.write("\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            alert(\"You haven't added any product yet !!\")\n");
      out.write("        </script>\n");
      out.write("        ");

            }
        
      out.write("\n");
      out.write("        <h3 style=\"color: green\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.removed}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("  </h3>\n");
      out.write("        <h3 style=\"color: green\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.edited}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("  </h3>\n");
      out.write("        <div style=\"display: inline-flex\">\n");
      out.write("            <div class=\"addmore\">\n");
      out.write("                <form action=\"MainController\">\n");
      out.write("                    <input type=\"submit\" name=\"action\" value=\"Add more\" style=\"padding: 8px 16px;\n");
      out.write("                border-radius: 40px;\n");
      out.write("                margin: 10px; \n");
      out.write("                background-color: black\">\n");
      out.write("                </form> \n");
      out.write("            </div>\n");
      out.write("            <div class=\"checkout\">\n");
      out.write("                <form action=\"BeforeCheckOutController\">\n");
      out.write("                    <input type=\"submit\" name=\"action\" value=\"Check Out\" style=\"padding: 8px 16px;\n");
      out.write("                border-radius: 40px;\n");
      out.write("                margin: 10px; \">\n");
      out.write("                </form> \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-12\">\n");
      out.write("                    <div  class=\"social\">\n");
      out.write("                        <ul>\n");
      out.write("                            <li> <a href=\"#\"><i class=\"fa-brands fa-facebook\"></i> &nbsp; Facebook </a> </li>\n");
      out.write("                            <li> <a href=\"#\"><i class=\"fa-brands fa-square-instagram\"></i> &nbsp; Instagram </a> </li>\n");
      out.write("                            <li> <a href=\"#\"><i class=\"fa-brands fa-square-x-twitter\"></i> &nbsp; X(Twitter) </a> </li>\n");
      out.write("                            <li> <a href=\"#\"><i class=\"fa-brands fa-square-threads\"></i> &nbsp; Thread </a> </li>\n");
      out.write("                            <li> <a href=\"#\"><i class=\"fa-brands fa-tiktok\"></i> &nbsp; Tiktok </a> </li>\n");
      out.write("                            <li> <a href=\"#\"><i class=\"fa-brands fa-square-threads\"></i> &nbsp; Thread </a> </li>\n");
      out.write("                        </ul> \n");
      out.write("                    </div>   \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
