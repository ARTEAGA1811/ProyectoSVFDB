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
public class Fact {

    
    Connection con;
    BDD cn = new BDD();
    PreparedStatement ps;
    ResultSet rs;
    int r;
    
    public int IdFac(){
        int id = 0;
        String sql = "SELECT MAX(id) FROM fc ";
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
    
    public int RegistrarFactura(Factura f){
        String sql = "INSERT INTO fc (ruc, proveedor,direccion,total) VALUES (?,?,?,?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
          
            ps.setString(1, f.getRuc());
            
             ps.setString(2, f.getProveedor());
            ps.setString(3, f.getDireccion());
            ps.setDouble(4, f.getTotal());
            
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
    
    public List ListarFactura(){
       List<Factura> ListaFactura = new ArrayList();
       String sql = "SELECT * FROM fc";
       try {
           con = cn.getConnection();
           ps = con.prepareStatement(sql);
           rs = ps.executeQuery();
           while (rs.next()) {               
               Factura fact = new Factura();
               
               fact.setId(rs.getInt("id"));
     
               fact.setRuc(rs.getString("ruc"));
               
               fact.setProveedor(rs.getString("proveedor"));
                fact.setDireccion(rs.getString("direccion"));
               
               fact.setTotal(rs.getDouble("total"));
               
               ListaFactura.add(fact);
           }
       } catch (SQLException e) {
           System.out.println(e.toString());
       }
       return ListaFactura;
   }
    
}
