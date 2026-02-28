package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import wishlist.WishList;
import java.util.List;
import java.util.List;

public final class wishlist_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Wish List</title>\n");
      out.write("        <link rel=\"icon\" type=\"image/x-icon\" href=\"img/logo.png\">\n");
      out.write("        <script src=\"https://kit.fontawesome.com/853d2cd4f0.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css\" integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\" crossorigin=\"anonymous\">\n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                font-family: serif;\n");
      out.write("                text-align: center;\n");
      out.write("                background-color: #ddd;\n");
      out.write("            }\n");
      out.write("            .animated-gradient-text {\n");
      out.write("                font-size: 25px;\n");
      out.write("                font-weight: 900;\n");
      out.write("                background: linear-gradient(270deg, #ff6ec4, #7873f5, #7bdff2, #f7f881);\n");
      out.write("                background-size: 800% 800%;\n");
      out.write("                -webkit-background-clip: text;\n");
      out.write("                -webkit-text-fill-color: transparent;\n");
      out.write("                animation: gradientAnimation 8s ease infinite;\n");
      out.write("                text-transform: capitalize;        \n");
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
      out.write("            a{\n");
      out.write("                text-decoration: none;\n");
      out.write("                color: black;\n");
      out.write("                font-weight: 100;\n");
      out.write("            }\n");
      out.write("            a:hover {\n");
      out.write("                text-decoration: none;\n");
      out.write("                color: #dc3545;\n");
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
      out.write("            table {\n");
      out.write("                width: 100%;\n");
      out.write("                border-collapse: collapse;\n");
      out.write("                margin-top: 20px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            table, th, td {\n");
      out.write("                border: 1px solid #ddd;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            th, td {\n");
      out.write("                padding: 15px;\n");
      out.write("                text-align: left;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            th {\n");
      out.write("                background-color: #f8f9fa;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            td {\n");
      out.write("                background-color: #fff;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            table tr:nth-child(even) {\n");
      out.write("                background-color: #f2f2f2;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            table tr:hover {\n");
      out.write("                background-color: #ddd;\n");
      out.write("            }\n");
      out.write("\n");
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
      out.write("\n");
      out.write("            h4 {\n");
      out.write("                margin-top: 20px;\n");
      out.write("            }\n");
      out.write("            img.rabbitimg {\n");
      out.write("                width: 70px;\n");
      out.write("                height: 70px;\n");
      out.write("            }\n");
      out.write("            a.back {\n");
      out.write("                display: inline-block;\n");
      out.write("                padding: 10px 20px;\n");
      out.write("                color: #ffffff;\n");
      out.write("                background-color: #007bff; /* Bootstrap primary color */\n");
      out.write("                text-decoration: none;\n");
      out.write("                border-radius: 5px;\n");
      out.write("                font-weight: bold;\n");
      out.write("                transition: background-color 0.3s ease, color 0.3s ease;\n");
      out.write("                margin-bottom: 20px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            a.back:hover {\n");
      out.write("                background-color: #0056b3; /* Darker shade of blue */\n");
      out.write("                color: #ffffff;\n");
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
      out.write("            h1{\n");
      out.write("                color: #c82333\n");
      out.write("            }\n");
      out.write("            .social ul{\n");
      out.write("                margin-top: 20px;\n");
      out.write("                display: flex; \n");
      out.write("                justify-content: space-around;\n");
      out.write("            }\n");
      out.write("            .social .social-link{\n");
      out.write("               \n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            String user = (String) session.getAttribute("user");
        
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "headershop.jsp", out, false);
      out.write("\n");
      out.write("        <br>\n");
      out.write("        <div class=\"container\"> \n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-12\">  \n");
      out.write("                    <h1><i>My Wish List</i> <i class=\"fa-regular fa-heart\"></i> </h1>\n");
      out.write("                    <h4 class=\"animated-gradient-text\"> <p> Welcome ");
      out.print( user);
      out.write(" <i class=\"fa-regular fa-user\"></i> </p></h4> \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-12\">\n");
      out.write("                    ");

                        List<WishList> list = null;
                       
                            list = (List<WishList>) request.getAttribute("WISHLIST");
                        
                        if (list != null) {
                    
      out.write("\n");
      out.write("                    <table border=\"1px\" width=\"80%\" style=\"background-color: cornsilk\">\n");
      out.write("                        <tr>\n");
      out.write("                            <th>User Name</th>\n");
      out.write("                            <th> Image </th>\n");
      out.write("                            <th> Rabbit Name </th>\n");
      out.write("                            <th>Description</th>\n");
      out.write("                            <th>Price</th>\n");
      out.write("                            <th>Year of Production</th>\n");
      out.write("                            <th>Action</th>\n");
      out.write("                        </tr>\n");
      out.write("                        ");
                
                            for (WishList i : list) {
                        
      out.write("\n");
      out.write("                        <form action=\"MainController\"> \n");
      out.write("                            <tr>\n");
      out.write("                                <td> ");
      out.print( i.getuId());
      out.write(" </td>\n");
      out.write("                                <td> <img class=\"rabbitimg\" src=\"img/");
      out.print(i.getImage());
      out.write("\"> </td>\n");
      out.write("                                <td> ");
      out.print( i.getpName());
      out.write(" </td>\n");
      out.write("                                <td> ");
      out.print( i.getDescription());
      out.write(" </td>\n");
      out.write("                                <td> ");
      out.print( i.getpPrice());
      out.write(" $ </td>\n");
      out.write("                                <td> ");
      out.print( i.getYearOfProduction());
      out.write(" </td>\n");
      out.write("                            <input type=\"hidden\" name=\"uId\" value=\"");
      out.print( i.getuId());
      out.write("\">\n");
      out.write("                            <input type=\"hidden\" name=\"pName\" value=\"");
      out.print( i.getpName());
      out.write("\">\n");
      out.write("                            <input type=\"hidden\" name=\"rabbitID\" value=\"");
      out.print( i.getpId());
      out.write("\">\n");
      out.write("                            <input type=\"hidden\" name=\"userId\" value=\"");
      out.print( user);
      out.write("\">\n");
      out.write("                            <td> \n");
      out.write("                                <input type=\"submit\" name=\"action\" value=\"Delete\">\n");
      out.write("                                <input type=\"submit\" name=\"action\" value=\"Buy Now\">\n");
      out.write("                            </td>\n");
      out.write("                            </tr>\n");
      out.write("                        </form>\n");
      out.write("                        ");

                                }
                            }    
                        
      out.write("\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <br>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-12\">\n");
      out.write("                    <h4 style=\"color: green\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${removed}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" </h4> \n");
      out.write("                    <a class=\"back\" href=\"MainController?action=Shop%20again\"> Go back </a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <br>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-12\">\n");
      out.write("                    <div  class=\"social\">\n");
      out.write("                        <ul>\n");
      out.write("                            <li> <a class=\"social-link\" href=\"#\"><i class=\"fa-brands fa-facebook\"></i> &nbsp; Facebook </a> </li>\n");
      out.write("                            <li> <a class=\"social-link\" href=\"#\"><i class=\"fa-brands fa-square-instagram\"></i> &nbsp; Instagram </a> </li>\n");
      out.write("                            <li> <a class=\"social-link\" href=\"#\"><i class=\"fa-brands fa-square-x-twitter\"></i> &nbsp; X(Twitter) </a> </li>\n");
      out.write("                            <li> <a class=\"social-link\" href=\"#\"><i class=\"fa-brands fa-square-threads\"></i> &nbsp; Thread </a> </li>\n");
      out.write("                            <li> <a class=\"social-link\" href=\"#\"><i class=\"fa-brands fa-tiktok\"></i> &nbsp; Tiktok </a> </li>\n");
      out.write("                            <li> <a class=\"social-link\"href=\"#\"><i class=\"fa-brands fa-square-threads\"></i> &nbsp; Thread </a> </li>\n");
      out.write("                        </ul> \n");
      out.write("                    </div>   \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"footer\"> \n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.html", out, false);
      out.write(" \n");
      out.write("        </div>\n");
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
