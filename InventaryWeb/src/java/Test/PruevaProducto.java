/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import DAO.ProductoDAO;
import DAO.ProductoDAOImplementar;
import Model.Producto;
import java.util.List;

/**
 *
 * @author Wilson
 */
public class PruevaProducto {

    public static void main(String[] args) {
        PruevaProducto evaluar = new PruevaProducto();
        evaluar.listarproducto();
       // evaluar.eliminarProducto();
        evaluar.listarproducto();
        //evaluar.editarProducto();
        evaluar.guardarProducto();
    }
    
    
    private void listarproducto() {
        ProductoDAO producto = new ProductoDAOImplementar();        
     //Prueba Listar
     List<Producto> listar = producto.Listar();
     System.out.println("Listado de Productos");
     for(Producto productoListar: listar){
     System.out.println("ID: " + productoListar.getId_producto() + "\n" +
     "Nombre: " + productoListar.getNom_producto()+ "\n"+
     "stock: " + productoListar.getStock() + "\n" +
     "precio: " + productoListar.getPrecio() + "\n" +
     "Unidad Medida:" + productoListar.getUnidadMedida() + "\n" +
     "Estado Producto: " + productoListar.getEstado() + "\n" +
     "Categoria" + productoListar.getCatogoria_id());
    }
    }

    
    
     
     
    public void editarProducto() {
        ProductoDAO producto = new ProductoDAOImplementar();
        Producto pro_edit = producto.editarPro(1);
        System.out.println("PRODUCTO A MODIFICAR");
        System.out.println("ID: " + pro_edit.getId_producto() + "\n"
                + "Nombre: " + pro_edit.getNom_producto() + "\n"
                + "stock: " + pro_edit.getStock() + "\n"
                + "precio: " + pro_edit.getPrecio() + "\n"
                + "Unidad Medida: " + pro_edit.getUnidadMedida() + "\n"
                + "Estado Producto: " + pro_edit.getEstado() + "\n"
                + "Categoria: " + pro_edit.getCatogoria_id());
    }
   
    public void guardarProducto() {
        ProductoDAO producto = new ProductoDAOImplementar();
        Producto guardarPro = new Producto();
        
        guardarPro.setNom_producto("cangrejos");
        guardarPro.setCatogoria_id(1);
        guardarPro.setStock(1);
        guardarPro.setPrecio(4);
        guardarPro.setUnidadMedida("libras");
        guardarPro.setEstado(1);
        guardarPro.setCatogoria_id(3);                       
        producto.guardarPro(guardarPro);

    }
    
  /*  public void eliminarProducto(){
        ProductoDAO producto = new ProductoDAOImplementar();
        producto.borrarPro(2);
    
    }
    */
}
