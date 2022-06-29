<%-- 
    Document   : listarProductos
    Created on : 20-jun-2022, 14:08:12
    Author     : Wilson
--%>


<%@page import="Model.Producto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:useBean id="lista" scope="session" class="java.util.List" />
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Control de Inventario</title>
        <%@include file = "../WEB-INF/Vistas-Parciales/css-js.jspf" %>
    </head>
    <body>
        <%@include file = "../WEB-INF/Vistas-Parciales/encabezado.jspf" %>
        
        <!--<div style="width: 600px;">-->
        <div class="col-auto bg-gray p-5 text-center">
            <a href="<%= request.getContextPath() %>/productos?opcion=crear" class ="btn btn-success btn-sm glyphicon glyphicon-pencil" role="button">Nuevo Producto</a>
            <h3>Listado de Productos</h3>
            <table class="table table-striped">
                <tr>
                    <th>
                        ID
                    </th>
                    <th>
                        NOMBRE
                    </th>
                    <th>
                        CATEGORIA
                    </th>
                    <th>
                        STOCK
                    </th>
                    <th>
                        PRECIO
                    </th>
                    <th>
                        UNIDAD DE MEDIDA
                    </th>
                    <th>
                        ESTADO PRODUCTO
                    </th>
                    <th>
                        CATEGORIA
                    </th>
                </tr>
                <%
                 for(int i = 0; i < lista.size(); i++){
                    Producto producto = new Producto();
                    producto = (Producto)lista.get(i);
                 %>
                 <tr>
                     <td><%= producto.getId_producto() %></td>
                     <td><%= producto.getNom_producto() %></td>
                     <td><%= producto.getStock() %></td>
                     <td><%= producto.getPrecio() %></td>
                     <td><%= producto.getUnidadMedida() %></td>
                     <td><%= producto.getEstado() %></td>
                     <td><%= producto.getCatogoria_id() %></td>
                     <td>
                         
                         
                     </td>
                 </tr>
                 <%
                 }
                 %>
            </table>
        </div>
        
        <%@include file = "../WEB-INF/Vistas-Parciales/pie.jspf" %>
    </body>
</html>

