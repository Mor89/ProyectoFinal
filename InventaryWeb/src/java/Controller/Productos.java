/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.CategoriaDAO;
import DAO.CategoriaDAOImplementar;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Wilson
 */
public class Productos extends HttpServlet {

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

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
         String estadop = request.getParameter("opcion");
         String id_pro = request.getParameter("idP");
         String nombre_pro = request.getParameter("nombreP");
         String stock_pro = request.getParameter("stockP");
         String precio_pro = request.getParameter("precioP");
         String unidad_pro = request.getParameter("unidadP");
         String estado_pro = request.getParameter("estadoP");
         String categoria_pro = request.getParameter("categoriaP");
         
         if(estadop.equals("listar")){
             this.listaCategoria(request, response);
             }else{
              
         }
         
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
    
    protected void listaCategoria(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         CategoriaDAO categoria = new CategoriaDAOImplementar();
         HttpSession sesion = request.getSession(true);
         sesion.setAttribute("lista", categoria.Listar());
         RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Vistas-Categorias/listarProducto.jsp");
         dispatcher.forward(request, response);
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
