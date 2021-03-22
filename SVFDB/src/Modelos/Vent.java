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

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Vent {
    
    Connection con;
    BDD cn = new BDD();
    PreparedStatement ps;
    ResultSet rs;
    int r;
    
    public int IdVenta(){
        int id = 0;
        String sql = "SELECT MAX(id) FROM ventas";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                id = rs.getInt(1);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return id;
    }
    
    public int RegistrarVenta(Venta v){
        String sql = "INSERT INTO ventas (vendedor, total,estado) VALUES (?,?,?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
          
            ps.setString(1, v.getVendedor());
            ps.setDouble(2, v.getTotal());
            ps.setString(3, v.getEstado());
            ps.execute();
        } catch (SQLException e) {
            System.out.println(e.toString());
        }finally{
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
        return r;
    }
    
    public int RegistrarDetalle(Detalle Dv){
        
       String sql = "INSERT INTO detalle (cod_pro,nombre,cantidad, precio,preciototal, id_venta) VALUES (?,?,?,?,?,?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            
            ps.setString(1, Dv.getCod_pro());
            ps.setString(2, Dv.getNombre());
            ps.setInt(3, Dv.getCantidad());
            ps.setDouble(4, Dv.getPrecio());
            ps.setDouble(5, Dv.getPreciototal());
            ps.setInt(6, Dv.getId());
            ps.execute();
        } catch (SQLException e) {
            System.out.println(e.toString());
        }finally{
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
        return r;
    }
    
    public boolean ActualizarStock(int cant, String cod){
        String sql = "UPDATE productos SET stock = ? WHERE codigo = ?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1,cant);
            ps.setString(2, cod);
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }
    }
    public List ListarDetalle(){
        
       List<Detalle> ListaDetalle = new ArrayList();
       String sql = "SELECT * FROM detalle";
       try {
           con = cn.getConnection();
           ps = con.prepareStatement(sql);
           rs = ps.executeQuery();
           while (rs.next()) {    
               
               Detalle De = new Detalle();
               
               De.setId(rs.getInt("id"));
     
               De.setCod_pro("cod_pro");
               
                De.setNombre("nombre");
  
              De.setCantidad(rs.getInt("cantidad"));
               
               De.setPrecio(rs.getDouble("precio"));
               
               De.setPreciototal(rs.getDouble("preciototal"));
                   De.setId_venta(rs.getInt("id_venta"));
               
               ListaDetalle.add(De);
           }
       } catch (SQLException e) {
           System.out.println(e.toString());
       }
       return ListaDetalle;
   }
    
    

    
   public List Listarventas(){
       List<Venta> ListaVenta = new ArrayList();
       String sql = "SELECT * FROM ventas";
       try {
           con = cn.getConnection();
           ps = con.prepareStatement(sql);
           rs = ps.executeQuery();
           while (rs.next()) {               
               Venta vent = new Venta();
               
               vent.setId(rs.getInt("id"));
     
               vent.setVendedor(rs.getString("vendedor"));
               
               vent.setEstado(rs.getString("estado"));
               
               vent.setTotal(rs.getDouble("total"));
               
               ListaVenta.add(vent);
           }
       } catch (SQLException e) {
           System.out.println(e.toString());
       }
       return ListaVenta;
   }
    
    
}



