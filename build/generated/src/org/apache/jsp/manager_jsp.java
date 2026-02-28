package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import invoice.invoiceDTO;
import user_rabbit.userDTO;
import wishlist.WishList;
import wishlist.WishList;
import java.util.List;

public final class manager_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("img");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
      out.write("        <title>Manager Page</title>\n");
      out.write("        <link rel=\"icon\" type=\"image/x-icon\" href=\"img/logo.png\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css\" integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\" crossorigin=\"anonymous\">\n");
      out.write("        <style>\n");
      out.write("            body {\n");
      out.write("                font-family: serif;\n");
      out.write("                background-color: #ccc;\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("            }\n");
      out.write("            .animated-gradient-text {\n");
      out.write("                font-size: 50px;\n");
      out.write("                font-weight: 900;\n");
      out.write("                background: linear-gradient(270deg, #ff6ec4, #7873f5, #7bdff2, #f7f881);\n");
      out.write("                background-size: 800% 800%;\n");
      out.write("                -webkit-background-clip: text;\n");
      out.write("                -webkit-text-fill-color: transparent;\n");
      out.write("                animation: gradientAnimation 8s ease infinite;\n");
      out.write("                text-transform: uppercase;\n");
      out.write("                border-bottom: solid 1px;\n");
      out.write("                border-bottom-style: dashed\n");
      out.write("\n");
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
      out.write("            table {\n");
      out.write("                width: 60%;\n");
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
      out.write("            a {\n");
      out.write("                text-decoration: none;\n");
      out.write("                color: #50b3a2;\n");
      out.write("                font-weight: bold;\n");
      out.write("            }\n");
      out.write("            a:hover {\n");
      out.write("                color: #45a089;\n");
      out.write("            }\n");
      out.write("            footer {\n");
      out.write("                background-color: #f1f1f1;\n");
      out.write("                padding: 10px 0;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <center>\n");
      out.write("        ");

            String search = "";
            String user = (String) session.getAttribute("user");
            if (session.getAttribute("search") != null) {
                search = (String) session.getAttribute("search");
            }

        
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "headershop.jsp", out, false);
      out.write("\n");
      out.write("        <br>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <h1 class=\"animated-gradient-text\"> <p> Welcome Admin ");
      out.print( user);
      out.write(" <i class=\"fa-solid fa-user-secret\"></i> </p></h1>  \n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"form-container\">\n");
      out.write("            <form action=\"MainController\" method=\"post\">\n");
      out.write("                Search User &nbsp;  <input type=\"text\" name=\"search\" value=\"");
      out.print( search);
      out.write("\"> &nbsp; \n");
      out.write("                <input type=\"submit\" name=\"action\" value=\"Search user\"> &nbsp; <i class=\"fa-solid fa-magnifying-glass\"></i>\n");
      out.write("            </form> <br>\n");
      out.write("            <form action=\"MainController\" method=\"post\">\n");
      out.write("                <input type=\"submit\" name=\"action\" value=\"Show Invoice\"> &nbsp;  <i class=\"fa-solid fa-magnifying-glass\"></i> \n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        <div>\n");
      out.write("            <a id=\"wish\" href='WishListDBController'> User wishlist </a>\n");
      out.write("        </div>\n");
      out.write("        ");

            List<userDTO> list = null;
            if (request.getAttribute("USER_LIST") != null) {
                list = (List<userDTO>) request.getAttribute("USER_LIST");

        
      out.write("\n");
      out.write("        <table border=\"1px\" width=\"60%\" style=\"background-color: cornsilk\">\n");
      out.write("            <tr>\n");
      out.write("                <th>User ID</th>\n");
      out.write("                <th>Full Name</th>\n");
      out.write("                <th>Password</th>\n");
      out.write("                <th>Role</th>\n");
      out.write("            </tr>\n");
      out.write("            ");
                for (userDTO i : list) {
            
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td> ");
      out.print( i.getUserId());
      out.write(" </td>\n");
      out.write("                <td> ");
      out.print( i.getFullName());
      out.write("  </td>\n");
      out.write("                <td> ");
      out.print( i.getPassword());
      out.write(" </td>\n");
      out.write("                ");

                    if (i.getRole() == 1) {
                
      out.write("\n");
      out.write("                <td> Manager </td>  \n");
      out.write("                ");
  }
                    if (i.getRole() == 0) {
                
      out.write("\n");
      out.write("                <td> User </td>  \n");
      out.write("                ");
 }
                    if (i.getRole() == 2) {
                
      out.write("\n");
      out.write("                <td> Staff </td> \n");
      out.write("                ");

                            }
                        }
                    }
                
      out.write("\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("\n");
      out.write("        ");

            List<WishList> list2 = null;
            if (request.getAttribute("WISHLISTDB") != null) {
                list2 = (List<WishList>) request.getAttribute("WISHLISTDB");

        
      out.write("\n");
      out.write("        <table border=\"1px\" width=\"60%\" style=\"background-color: cornsilk\">\n");
      out.write("            <tr>\n");
      out.write("                <th>User Id</th>\n");
      out.write("                <th>Mobile Name</th>\n");
      out.write("                <th>Description</th>\n");
      out.write("                <th>Price</th>\n");
      out.write("                <th>Year of Production</th>\n");
      out.write("            </tr>\n");
      out.write("            ");
                for (WishList i : list2) {
            
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td> ");
      out.print( i.getuId());
      out.write(" </td>\n");
      out.write("                <td> ");
      out.print( i.getpName());
      out.write(" </td>\n");
      out.write("                <td> ");
      out.print( i.getDescription());
      out.write(" </td>\n");
      out.write("                <td> ");
      out.print( i.getpPrice());
      out.write(" $ </td>\n");
      out.write("                <td> ");
      out.print( i.getYearOfProduction());
      out.write(" </td>       \n");
      out.write("            </tr>\n");
      out.write("            ");

                    }
                }
            
      out.write("\n");
      out.write("        </table>\n");
      out.write("\n");
      out.write("        ");

            List<invoiceDTO> list3 = new ArrayList<invoiceDTO>();
            if (request.getAttribute("INVOICE_LIST") != null) {
                list3 = (List<invoiceDTO>) request.getAttribute("INVOICE_LIST");
            
        
      out.write("\n");
      out.write("        <table border=\"1px\" width=\"60%\" style=\"background-color: cornsilk\">\n");
      out.write("            <tr>\n");
      out.write("                <th>Invoice Id</th>\n");
      out.write("                <th>User ID</th>\n");
      out.write("                <th>Total</th>\n");
      out.write("                <th>Date Buy</th>\n");
      out.write("                <th>Address</th>\n");
      out.write("                <th>Phone number</th>\n");
      out.write("                <th>City</th>\n");
      out.write("            </tr>\n");
      out.write("            ");

                for (invoiceDTO i : list3) {
            
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td> ");
      out.print( i.getInvId());
      out.write(" </td>\n");
      out.write("                <td> ");
      out.print( i.getUserId());
      out.write(" </td>\n");
      out.write("                <td> ");
      out.print( i.getTotal());
      out.write(" </td>\n");
      out.write("                <td> ");
      out.print( i.getDateBuy());
      out.write(" $ </td>\n");
      out.write("                <td> ");
      out.print( i.getPhone());
      out.write(" </td> \n");
      out.write("                <td> ");
      out.print( i.getAddress());
      out.write(" </td> \n");
      out.write("                <td> ");
      out.print( i.getCity());
      out.write(" </td>       \n");
      out.write("            </tr>\n");
      out.write("            ");

                }
}

            
      out.write("\n");
      out.write("        </table>\n");
      out.write("        <div class=\"form-container\">\n");
      out.write("        <form  action=\"LoginController\" method=\"get\">\n");
      out.write("            <input type=\"submit\" value=\"Loggout\">\n");
      out.write("        </form>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"footer\"> \n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.html", out, false);
      out.write(" \n");
      out.write("        </div>\n");
      out.write("    </center>\n");
      out.write("    <br> \n");
      out.write("</body>\n");
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
