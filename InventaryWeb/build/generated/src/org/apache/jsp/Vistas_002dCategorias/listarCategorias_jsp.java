package org.apache.jsp.Vistas_002dCategorias;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.Categoria;

public final class listarCategorias_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/Vistas-Categorias/../WEB-INF/Vistas-Parciales/css-js.jspf");
    _jspx_dependants.add("/Vistas-Categorias/../WEB-INF/Vistas-Parciales/encabezado.jspf");
    _jspx_dependants.add("/Vistas-Categorias/../WEB-INF/Vistas-Parciales/pie.jspf");
  }

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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      java.util.List lista = null;
      synchronized (session) {
        lista = (java.util.List) _jspx_page_context.getAttribute("lista", PageContext.SESSION_SCOPE);
        if (lista == null){
          try {
            lista = (java.util.List) java.beans.Beans.instantiate(this.getClass().getClassLoader(), "java.util.List");
          } catch (ClassNotFoundException exc) {
            throw new InstantiationException(exc.getMessage());
          } catch (Exception exc) {
            throw new ServletException("Cannot create bean of class " + "java.util.List", exc);
          }
          _jspx_page_context.setAttribute("lista", lista, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Control de Inventario</title>\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<link href=\"css/estilo-base.css\" rel=\"stylesheet\" type=\"text/css\"> \r\n");
      out.write("<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script src=\"js/bootstrap.bundle.min.js\" type=\"text/javascript\"></script>");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div>\r\n");
      out.write("    <div class=\"encabezado\">\r\n");
      out.write("        Sistema de Control de Inventario\r\n");
      out.write("        <a href=\"Index\" class=\"btn btn-primary\">Inicio</a>\r\n");
      out.write("        <a href=\"categorias?opcion=listar\" class=\"btn btn-success\">Categorias</a>\r\n");
      out.write("        <a href=\"productos\" class=\"btn btn-success\">Productos</a>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"contenido\">");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        <!--<div style=\"width: 600px;\">-->\r\n");
      out.write("        <div class=\"col-auto bg-gray p-5 text-center\">\r\n");
      out.write("            <a href=\"");
      out.print( request.getContextPath() );
      out.write("/categorias?opcion=crear\" class =\"btn btn-success btn-sm glyphicon glyphicon-pencil\" role=\"button\">Nueva Categoria</a>\r\n");
      out.write("            <h3>Listado de Categorias</h3>\r\n");
      out.write("            <table class=\"table table-striped\">\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th>\r\n");
      out.write("                        ID\r\n");
      out.write("                    </th>\r\n");
      out.write("                    <th>\r\n");
      out.write("                        NOMBRE\r\n");
      out.write("                    </th>\r\n");
      out.write("                    <th>\r\n");
      out.write("                        ESTADO\r\n");
      out.write("                    </th>\r\n");
      out.write("                    <th>\r\n");
      out.write("                        ACCIONES\r\n");
      out.write("                    </th>\r\n");
      out.write("                </tr>\r\n");
      out.write("                ");

                 for(int i = 0; i < lista.size(); i++){
                    Categoria categoria = new Categoria();
                    categoria = (Categoria)lista.get(i);
                 
      out.write("\r\n");
      out.write("                 <tr>\r\n");
      out.write("                     <td>");
      out.print( categoria.getId_categoria() );
      out.write("</td>\r\n");
      out.write("                     <td>");
      out.print( categoria.getNom_categoria() );
      out.write("</td>\r\n");
      out.write("                     <td>");
      out.print( categoria.getEstado_categoria() );
      out.write("</td>\r\n");
      out.write("                     <td>\r\n");
      out.write("                         <a href=\"categorias?opcion=editar&&id=");
      out.print( categoria.getId_categoria() );
      out.write("&&nombre=");
      out.print( categoria.getNom_categoria() );
      out.write("&&estado=");
      out.print( categoria.getEstado_categoria() );
      out.write("\" class=\"btn btn-info btn-sm glyphicon glyphicon-edit\" role=\"button\">Editar</a>\r\n");
      out.write("                         <a href=\"categorias?opcion=eliminar&&id=");
      out.print( categoria.getId_categoria() );
      out.write("&&nombre=");
      out.print( categoria.getNom_categoria() );
      out.write("\" class=\"btn btn-danger btn-sm glyphicon glyphicon-remove\" role=\"button\">Eliminar</a>\r\n");
      out.write("                     </td>\r\n");
      out.write("                 </tr>\r\n");
      out.write("                 ");

                 }
                 
      out.write("\r\n");
      out.write("            </table>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"pie\">\r\n");
      out.write("    &COPY; ITCA-FEPADE\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
