/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Braya
 */
public class ServletB extends HttpServlet {

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
            
           String apellido = request.getParameter("apellido");
           String nombre = request.getParameter("nombre");
           String tipo = request.getParameter("tipo");
           String documento = request.getParameter("documento");
           String ciudad = request.getParameter("ciudad");
           String contraseña = request.getParameter("contraseña");
           String departamento = request.getParameter("departamento");
           String fechadenacimiento = request.getParameter("fechadenacimiento");
           String ciudaddenacimineto = request.getParameter("ciudaddenacimiento");
           String ciudaddenacimiento = request.getParameter("ciudaddenacimiento");
           String departamentodenacimiento = request.getParameter("departamentodenacimiento");
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletB</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>El nombre es: " + nombre+ "</h1>");
            out.println("<h1>El apellido es: " + apellido+ "</h1>");
            out.println("<h1>El tipo de documento es : " + tipo+ "</h1>");
            out.println("<h1>El documento es: " + documento + "</h1>");
            out.println("<h1>la ciudad es: " + contraseña + "</h1>");
            out.println("<h1>la ciudad es: " + departamento + "</h1>");
            out.println("<h1>la ciudad es: " + fechadenacimiento + "</h1>");
            out.println("<h1>la ciudad es: " + ciudaddenacimiento + "</h1>");
            
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
        processRequest(request, response);
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
        processRequest(request, response);
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
