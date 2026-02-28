/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import user_rabbit.DAO;
import user_rabbit.RabbitDTO;

/**
 *
 * @author DELL'
 */
@WebServlet(name = "UpdateRabbitController", urlPatterns = {"/UpdateRabbitController"})
public class UpdateRabbitController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet UpdateMobileController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet UpdateMobileController at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String rabbitId = request.getParameter("rabbitId");
        DAO dao = new DAO();
        RabbitDTO w = dao.getRabbitById(rabbitId);
        request.setAttribute("rabbit", w);
        request.getRequestDispatcher("updaterabbit.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String rabbitID = request.getParameter("rabbitId");
        String description = request.getParameter("description");
        String price_raw = request.getParameter("price");
        String rabbitName = request.getParameter("rabbitName");
        String img = request.getParameter("img");
        String yearOfProduction_raw = request.getParameter("yearOfProduction");
        String quantity_raw = request.getParameter("quantity");
        String notSale_raw = request.getParameter("notSale");
        boolean notSale = false;
        DAO dao = new DAO();
        try {
            float price = Float.parseFloat(price_raw);
            int yearOfProduction = Integer.parseInt(yearOfProduction_raw);
            int quantity = Integer.parseInt(quantity_raw);
            int check = Integer.parseInt(notSale_raw);
            if (check == 1) {
                notSale = true;
            }
             RabbitDTO w = new RabbitDTO(rabbitID, description, price, rabbitName,img , yearOfProduction, quantity, notSale);
             dao.updateRabbit(w);
            String update = "This rabbit "+rabbitID+" has been updated!!";
            request.setAttribute("update", update);
            request.getRequestDispatcher("staff.jsp").forward(request, response);
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
