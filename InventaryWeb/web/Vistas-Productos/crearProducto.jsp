<%@page contentType="text/html" pageEncoding="UTF-8"%>

<jsp:useBean id="producto" scope="session" class="Model.Producto" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Control de Inventario</title>
        <%@include file= "../WEB-INF/Vistas-Parciales/css-js.jspf" %>
        <script type="text/javascript">
            function regresar(url) {
                location.href = url;
            }
        </script>
    </head>
    <body>
        <%@include file= "../WEB-INF/Vistas-Parciales/encabezado.jspf" %>

        <h3>Nuevo Producto</h3>
        <form class="form-horizontal" id="frmProducto" name="frmProducto" action="<%= request.getContextPath()%>/productos" method="post">
            <input type="hidden" name="txtId_producto" value="<%= producto.getId_producto()%>">
            <div class="form-group">
                <label for="txtNom_pro" class="col-sm-2 control-label">Nombre:</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" name="txtNom_pro" value="<%= producto.getNom_producto()%>">
                </div>
            </div>
                <div class="form-group">
                <label for="txtStock_pro" class="col-sm-2 control-label">Stock:</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" name="txtStock_pro" value="<%= producto.getStock() %>">
                </div>
            </div>
                <div class="form-group">
                <label for="txtPrecio_pro" class="col-sm-2 control-label">Precio:</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" name="txtPrecio_pro" value="<%= producto.getPrecio()%>">
                </div>
            </div>
                <div class="form-group">
                <label for="txtUnidadM_pro" class="col-sm-2 control-label">Unidad de medida</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" name="txtUnidadM_pro" value="<%= producto.getUnidadMedida()%>">
                </div>
            </div>
                
                
            <div class="form-group">
                <label for="txtEstado_pro" class="col-sm-2 control-label">Estado:</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" name="txtEstado_pro" value="<%= producto.getEstado()%>">
                </div>
            </div>
                <div class="form-group">
                <label for="txtIdcategoria_pro" class="col-sm-2 control-label">Categoria</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" name="txtIdcategoria_pro" value="<%= producto.getCatogoria_id() %>">
                </div>
            </div>
            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <input type="submit" class="btn btn-success btn-sm" name="btnGuardar" value="Guardar" />
                    <input type="button" class="btn bg-danger btn-sm" onclick="regresar('<%= request.getContextPath()%>/productos?opcion=listar')"
                </div>
            </div>
        </form>
                
    <%@include file= "../WEB-INF/Vistas-Parciales/pie.jspf" %>
    </body>
</html>
