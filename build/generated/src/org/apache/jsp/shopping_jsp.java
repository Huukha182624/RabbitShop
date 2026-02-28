package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import product.CartDTO;
import java.util.ArrayList;
import user_rabbit.RabbitDTO;
import java.util.List;

public final class shopping_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css\" integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\" crossorigin=\"anonymous\">\n");
      out.write("        <style>\n");
      out.write("            #cart{\n");
      out.write("                width: 30px;\n");
      out.write("                height: 30px;\n");
      out.write("                margin-left: 10px\n");
      out.write("            }\n");
      out.write("            span{\n");
      out.write("                display: inline;\n");
      out.write("                width: 200px;\n");
      out.write("                height: 200px;\n");
      out.write("                background-color: red;\n");
      out.write("                opacity: 0.9;\n");
      out.write("                border-radius: 10px;\n");
      out.write("                color: white;\n");
      out.write("\n");
      out.write("                margin-bottom: 10px\n");
      out.write("            }\n");
      out.write("            img{\n");
      out.write("                width: 300px;\n");
      out.write("                height: 400px;\n");
      out.write("                margin-top: 0px;\n");
      out.write("                margin-left: 20px;\n");
      out.write("            }\n");
      out.write("            form{\n");
      out.write("                position: relative;\n");
      out.write("            }\n");
      out.write("            body{\n");
      out.write("                margin: 0;\n");
      out.write("\tfont-family: sans-serif;\n");
      out.write("\tfont-weight: 100;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <center>\n");
      out.write("        ");

            CartDTO cart = (CartDTO) session.getAttribute("CART");
        
      out.write("\n");
      out.write("\n");
      out.write("        <h1>Mobile Shopping</h1>\n");
      out.write("            \n");
      out.write("         ");

                    List<RabbitDTO> list2 = (List<RabbitDTO>) session.getAttribute("data");
                    if(list2 !=null ) {
                        
         
      out.write("\n");
      out.write("         <table border=\"1px\" width=\"50%\">\n");
      out.write("             <th> Rabbit Name  </th>\n");
      out.write("             <th> Price </th>\n");
      out.write("             <th> Quantity </th>\n");
      out.write("             <th> Action </th>\n");
      out.write("         ");
   for (RabbitDTO i : list2){
             
         
      out.write(" \n");
      out.write("             <form action=\"MainController\">\n");
      out.write("             <tr>\n");
      out.write("             <td> ");
      out.print( i.getRabbitName());
      out.write(" \n");
      out.write("                 <input type=\"hidden\" name=\"name\" value=\"");
      out.print(i.getRabbitName());
      out.write("\">\n");
      out.write("             </td>          \n");
      out.write("             <td> ");
      out.print( i.getPrice() );
      out.write(" $\n");
      out.write("                 <input type=\"hidden\" name=\"price\" value=\"");
      out.print(i.getPrice());
      out.write("\">\n");
      out.write("             </td>  \n");
      out.write("             <td> 1 \n");
      out.write("                  <input type=\"hidden\" name=\"quantity\" value=\"1\">\n");
      out.write("             </td>\n");
      out.write("             <td> \n");
      out.write("                 <input type=\"submit\" name=\"action\" value=\"Add To Cart\">\n");
      out.write("             </td>\n");
      out.write("             </tr>\n");
      out.write("             </form>\n");
      out.write("         ");

             }
}
             
      out.write("\n");
      out.write("         \n");
      out.write("         </table>\n");
      out.write("        <br>\n");
      out.write("        <form action=\"user.jsp\">\n");
      out.write("            <input type=\"submit\" value=\"Go Back\">\n");
      out.write("        </form>\n");
      out.write("        ***--------------------------------------------------------------------------------------------------------***<br>\n");
      out.write("\n");
      out.write("        <form action=\"MainController\">\n");
      out.write("            <input type=\"submit\" name=\"action\" value=\"View Cart\">\n");
      out.write("            <img id=\"cart\" src=\"img/img.png\"> \n");
      out.write("            ");

                if (cart != null) {
            
      out.write("\n");
      out.write("            <span id=\"quantity\"> &nbsp; ");
      out.print( cart.getCart().size());
      out.write(" &nbsp; </span>\n");
      out.write("            ");

                }
            
      out.write("\n");
      out.write("        </form>\n");
      out.write("<!--                             <img src=\"https://media.tenor.com/Lb9rxAribsUAAAAi/cat.gif\">-->\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");

            if (request.getAttribute("done") != null) {
                String done = (String) request.getAttribute("done");
        
      out.write("\n");
      out.write("        <h3 style=\"color: brown\"> ");
      out.print( done);
      out.write(" </h3>\n");
      out.write("        ");

            }
        
      out.write(" \n");
      out.write("    </center>\n");
      out.write("\n");
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
