/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Product {
    
    Connection con;
   BDD cn = new BDD();
    PreparedStatement ps;
    ResultSet rs;
      public boolean RegistrarProductos(Productos pro){
        String sql = "INSERT INTO productos codigo, nombre,tipo,precio, stock,fechaCaducidad,Proveedor) VALUES (?,?,?,?,?,?,?) ";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, pro.getCodigo());
            ps.setString(2, pro.getNombre());
            ps.setString(3, pro.getTipo());
            ps.setDouble(4, pro.getPrecio());
      
             ps.setInt(5, pro.getStock());
            ps.setString(6, pro.getFechacaducidad());
           ps.setString(7, pro.getProveedor());
      
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }
    }

    
    public List ListarProductos(){
       List<Productos> Listapro = new ArrayList();
       String sql = "SELECT * FROM productos";
       try {
           con = cn.getConnection();
           ps = con.prepareStatement(sql);
           rs = ps.executeQuery();
           while (rs.next()) {               
               Productos pro = new Productos();
             
               
                pro.setId(rs.getInt("id"));
               pro.setCodigo(rs.getString("codigo"));
               pro.setNombre(rs.getString("nombre"));
               pro.setTipo(rs.getString("tipo"));
               pro.setStock(rs.getInt("stock"));
              pro.setPrecio(rs.getDouble("precio"));
                pro.setFechacaducidad(rs.getString("fechacaducidad"));
               pro.setProveedor(rs.getString("proveedor"));
               Listapro.add(pro);
           }
         
       } catch (SQLException e) {
           System.out.println(e.toString());
       }
       return Listapro;
   }
    
    public boolean EliminarProductos(int id){
       String sql = "DELETE FROM productos WHERE id = ?";
       try {
           ps = con.prepareStatement(sql);
           ps.setInt(1, id);
           ps.execute();
           return true;
       } catch (SQLException e) {
           System.out.println(e.toString());
           return false;
       }finally{
           try {
               con.close();
           } catch (SQLException ex) {
               System.out.println(ex.toString());
           }
       }
   }
    
    public boolean ModificarProductos(Productos pro){
       String sql = "UPDATE productos SET codigo=?, nombre=?,tipo=?,precio=?, stock=?,fechaCaducidad=?,proveedor=? WHERE id=?";
       try {
           
     
           ps = con.prepareStatement(sql);
           
           
            ps.setString(1, pro.getCodigo());
            ps.setString(2, pro.getNombre());
            ps.setString(3, pro.getTipo());
       
            ps.setDouble(4, pro.getPrecio());
  
             ps.setInt(5, pro.getStock());
            ps.setString(6, pro.getFechacaducidad());
           ps.setString(7, pro.getProveedor());
          
           ps.setInt(8, pro.getId());
           ps.execute();
           return true;
       } catch (SQLException e) {
           System.out.println(e.toString());
           return false;
       }finally{
           try {
               con.close();
           } catch (SQLException e) {
               System.out.println(e.toString());
           }
       }
   }
    
    
    public void ConsularProveedor(JComboBox proveedor){
        String sql = "SELECT comercial FROM proveedor";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {                
               proveedor.addItem(rs.getString("comercial"));
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }
    public void ConsularProd(JComboBox productos){
        String sql = "SELECT nombre FROM productos";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {                
               productos.addItem(rs.getString("nombre"));
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }
    
     public void ConsularUsuario(JComboBox Usuario){
       
        String sql = "SELECT nombre,apellido FROM usuarios";
        
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {          
                
               Usuario.addItem(rs.getString("nombre")+" "+rs.getString("apellido"));
               
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }
    
    public Productos BuscarPro(String cod){
        Productos producto = new Productos();
        String sql = "SELECT * FROM productos WHERE codigo = ?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, cod);
            rs = ps.executeQuery();
            if (rs.next()) {
                producto.setNombre(rs.getString("nombre"));
                producto.setPrecio(rs.getDouble("precio"));
                producto.setStock(rs.getInt("stock"));
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return producto;
    }
    
    public Config BuscarDatos(){
        Config conf = new Config();
        String sql = "SELECT * FROM config";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                conf.setId(rs.getInt("id"));
                conf.setRuc(rs.getInt("ruc"));
                conf.setNombre(rs.getString("nombre"));
                conf.setTelefono(rs.getInt("telefono"));
                conf.setDireccion(rs.getString("direccion"));
         
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return conf;
    }
    
    public boolean ModificarDatos(Config conf){
       String sql = "UPDATE config SET ruc=?, nombre=?, telefono=?, direccion=? WHERE id=?";
       try {
           ps = con.prepareStatement(sql);
           ps.setInt(1, conf.getRuc());
           ps.setString(2, conf.getNombre());
           ps.setInt(3, conf.getTelefono());
           ps.setString(4, conf.getDireccion());
    
           ps.setInt(5, conf.getId());
           ps.execute();
           return true;
       } catch (SQLException e) {
           System.out.println(e.toString());
           return false;
       }finally{
           try {
               con.close();
           } catch (SQLException e) {
               System.out.println(e.toString());
           }
       }
   }
    
}



