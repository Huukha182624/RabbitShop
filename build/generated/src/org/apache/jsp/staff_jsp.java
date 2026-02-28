package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import user_rabbit.RabbitDTO;
import java.util.List;

public final class staff_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Staff page</title>\n");
      out.write("        <link rel=\"icon\" type=\"image/x-icon\" href=\"img/logo.png\">\n");
      out.write("        <script src=\"https://kit.fontawesome.com/853d2cd4f0.js\" crossorigin=\"anonymous\"></script>\n");
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
      out.write("            img.rabbitimg {\n");
      out.write("                width: 70px;\n");
      out.write("                height: 70px;\n");
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
      out.write("            \n");
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
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            String search = "";
            String user = (String) session.getAttribute("user");
            if (session.getAttribute("search") != null) {
                search = (String) session.getAttribute("search");
            }
        
      out.write("\n");
      out.write("    <center>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "headershop.jsp", out, false);
      out.write("\n");
      out.write("            <br>\n");
      out.write("            <div class=\"container\">\n");
      out.write("               <h1 class=\"animated-gradient-text\"> <p> Welcome staff ");
      out.print( user);
      out.write(" <i class=\"fa-solid fa-user-tie\"></i> </p></h1>  \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("\n");
      out.write("            <div class=\"form-container\">\n");
      out.write("                <form action=\"addrabbit.jsp\">\n");
      out.write("                    Add new rabbit &nbsp; <input type=\"submit\" value=\"Add rabbit\"> &nbsp; <i class=\"fa-solid fa-plus\"></i>\n");
      out.write("                </form>\n");
      out.write("                <form action=\"MainController\" method=\"post\">\n");
      out.write("                    Search rabbit (ID or Name) &nbsp;  <input type=\"text\" name=\"search\" value=\"");
      out.print( search);
      out.write("\" > &nbsp; \n");
      out.write("                    <input type=\"submit\" name=\"action\" value=\"Search rabbit\"> &nbsp;  <i class=\"fa-solid fa-magnifying-glass\"></i> <br> <br><br>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            ");

                if (request.getAttribute("deleted") != null) {
                    String deleted = (String) request.getAttribute("deleted");
            
      out.write("\n");
      out.write("            <div class=\"notification\">");
      out.print( deleted);
      out.write("</div>\n");
      out.write("            ");
 }
                if (request.getAttribute("add") != null) {
                    String add = (String) request.getAttribute("add");
            
      out.write("\n");
      out.write("            <div class=\"notification\">");
      out.print( add);
      out.write("</div>\n");
      out.write("            ");

                }
                if (request.getAttribute("update") != null) {
                    String update = (String) request.getAttribute("update");
            
      out.write("\n");
      out.write("            <div class=\"notification\">");
      out.print( update);
      out.write("</div>\n");
      out.write("            ");

                }
                List<RabbitDTO> list = null;
                if (request.getAttribute("RABBIT_LIST") != null) {
                    list = (List<RabbitDTO>) request.getAttribute("RABBIT_LIST");
            
      out.write("\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Rabbit ID</th>\n");
      out.write("                    <th>img</th>\n");
      out.write("                    <th>Description</th>\n");
      out.write("                    <th>Price</th>\n");
      out.write("                    <th>Rabbit Name</th>\n");
      out.write("                    <th>Year of Production</th>\n");
      out.write("                    <th>Quantity</th>\n");
      out.write("                    <th>notSale</th>\n");
      out.write("                    <th>Action</th>\n");
      out.write("                </tr>\n");
      out.write("                ");
 for (RabbitDTO i : list) {
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.print( i.getRabbitId());
      out.write("</td>\n");
      out.write("                    <td><img class=\"rabbitimg\" src=\"img/");
      out.print( i.getImg());
      out.write("\"></td>\n");
      out.write("                    <td>");
      out.print( i.getDescription());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( i.getPrice());
      out.write(" $</td>\n");
      out.write("                    <td>");
      out.print( i.getRabbitName());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( i.getYearOfProduction());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( i.getQuantity());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( i.isNotSale() ? 1 : 0);
      out.write("</td>\n");
      out.write("                    <td>\n");
      out.write("                        <a href=\"#\" onclick=\"doDelete('");
      out.print( i.getRabbitId());
      out.write("')\">Delete</a> &nbsp; &nbsp; \n");
      out.write("                        <a href=\"UpdateRabbitController?rabbitId=");
      out.print( i.getRabbitId());
      out.write("\">Update</a>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                ");
 }
                } 
      out.write("\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("            <div class=\"form-container\">\n");
      out.write("                <form action=\"LoginController\" method=\"get\">\n");
      out.write("                    <input type=\"submit\" value=\"Loggout\" > &nbsp; <i class=\"fa-solid fa-right-from-bracket\"></i>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            <br>\n");
      out.write("            <div class=\"imgsetting\">\n");
      out.write("                ");

                    List<RabbitDTO> list2 = null;
                    if (request.getAttribute("RABBIT_LIST") != null) {
                        list2 = (List<RabbitDTO>) request.getAttribute("RABBIT_LIST");

                
      out.write("\n");
      out.write("                ");
                for (RabbitDTO i : list2) {

                
      out.write("    \n");
      out.write("                <img class=\"rabbitimg\" src=\"img/");
      out.print(i.getImg());
      out.write("\"> \n");
      out.write("                ");

                        }
                    }
                
      out.write("\n");
      out.write("            </div>\n");
      out.write("    </center>\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        function doDelete(rabbitId) {\n");
      out.write("            if (confirm(\"Are you sure to delete this rabbit with id:\" + rabbitId + \"?\")) {\n");
      out.write("                window.location = \"MainController?rabbitId=\" + rabbitId + \"&action=deleterabbit\";\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("    <br> <br>\n");
      out.write("    <div class=\"footer\"> \n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.html", out, false);
      out.write(" \n");
      out.write("    </div>\n");
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
