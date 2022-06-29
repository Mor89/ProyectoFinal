/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import Factory.*;
import Model.Producto;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Wilson
 */
public class ProductoDAOImplementar implements ProductoDAO{

    private ConexionBD conn;

    public ProductoDAOImplementar() {
       // this.conn = FactoryConexionDB.open(FactoryConexionDB.MySQL);
    }
    
    
    
    
    @Override
    public List<Producto> Listar() {
        this.conn = FactoryConexionDB.open(FactoryConexionDB.MySQL);
        StringBuilder miSQL = new StringBuilder();
        miSQL.append("select * from tb_producto;");
        List<Producto> lista = new ArrayList<Producto>();
        try{
            ResultSet resultadoSQL = this.conn.consultaSQL(miSQL.toString());
            while(resultadoSQL.next()){
                Producto producto = new Producto();
                
                producto.setId_producto(resultadoSQL.getInt("id_producto"));
                producto.setNom_producto(resultadoSQL.getString("nom_producto"));
                producto.setStock(resultadoSQL.getInt("stock"));
                producto.setPrecio(resultadoSQL.getInt("precio"));
                producto.setUnidadMedida(resultadoSQL.getString("unidad_de_medida"));
                producto.setEstado(resultadoSQL.getInt("estado_producto"));
                producto.setCatogoria_id(resultadoSQL.getInt("categoria"));
                lista.add(producto);
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            this.conn.cerrarConexion();
        }
        return lista;
    }

    @Override
    public List<Producto> Listar2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Producto editarPro(int id_cat_edit) {
        this.conn = FactoryConexionDB.open(FactoryConexionDB.MySQL);
        Producto producto = new Producto();
        StringBuilder miSQL = new StringBuilder();
        miSQL.append("select * from tb_producto where id_producto = ").append(id_cat_edit);
        try{
            ResultSet resultadoSQL = this.conn.consultaSQL(miSQL.toString());
            while(resultadoSQL.next()){
                producto.setId_producto(resultadoSQL.getInt("id_producto"));
                producto.setNom_producto(resultadoSQL.getString("nom_producto"));
                producto.setStock(resultadoSQL.getInt("stock"));
                producto.setPrecio(resultadoSQL.getInt("precio"));
                producto.setUnidadMedida(resultadoSQL.getString("unidad_de_medida"));
                producto.setEstado(resultadoSQL.getInt("estado_producto"));
                producto.setCatogoria_id(resultadoSQL.getInt("categoria"));
            }
            
        }catch(Exception e){
            
        }finally{
            this.conn.cerrarConexion();
        }
        
        return producto;
    }

    @Override
    public boolean guardarPro(Producto producto) {
        this.conn = FactoryConexionDB.open(FactoryConexionDB.MySQL);
        boolean guarda = false;
        
        try{
            if(producto.getId_producto() == 0){
                System.out.println("Guardar");
                StringBuilder miSQL = new StringBuilder();
                miSQL.append("INSERT INTO tb_producto(nom_producto, stock, precio, unidad_de_medida, estado_producto, categoria ) values('");
                miSQL.append(producto.getNom_producto() + "', ").append(producto.getStock() + "', ").append(producto.getPrecio() + "', ").append(producto.getUnidadMedida()+
                        "', ").append(producto.getEstado() + "', ").append(producto.getCatogoria_id());
                miSQL.append(");");
                this.conn.ejecutarSQL(miSQL.toString());
            }else if(producto.getId_producto() > 0){
                
                System.out.println("Update");
                StringBuilder miSQL = new StringBuilder();
                miSQL.append("UPDATE tb_producto SET id_producto = ").append(producto.getId_producto());
                miSQL.append(", nom_producto = '").append(producto.getNom_producto());
                miSQL.append("', stock = ").append(producto.getStock());
                miSQL.append("', precio = ").append(producto.getPrecio());
                miSQL.append("', unidad_de_medida = ").append(producto.getUnidadMedida());
                miSQL.append("', estado_producto = ").append(producto.getEstado());
                miSQL.append("', categoria = ").append(producto.getCatogoria_id());
                miSQL.append(" WHERE id_producto = ").append(producto.getId_producto()).append(";");
                this.conn.ejecutarSQL(miSQL.toString());
            }
           guarda = true;
        }catch(Exception e){
            
        }finally{
            this.conn.cerrarConexion();
        }
        
        return guarda;
    }

    @Override
    public boolean borrarPro(int id_pro_borrar) {
          this.conn = FactoryConexionDB.open(FactoryConexionDB.MySQL);
        boolean borra = false;
        try{
            StringBuilder miSQL = new StringBuilder();
            miSQL.append("Delete from tb_producto where id_producto = ").append(id_pro_borrar);
            this.conn.ejecutarSQL(miSQL.toString());
            borra = true;
        }catch(Exception e){
            
        }finally{
            this.conn.cerrarConexion();
        }
        
        return borra;
    }
}
