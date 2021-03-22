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
public class Proveed {
    
      Connection con;
    BDD cn = new BDD();
    PreparedStatement ps;
    ResultSet rs;
    public boolean RegistrarProveedor(Proveedor pr){
        String sql = "INSERT INTO proveedor(ruc, nombre,apellido,comercial, telefono,email, direccion, estado) VALUES (?,?,?,?,?,?,?,?)";
        try {
           con = cn.getConnection();
           ps = con.prepareStatement(sql);
           ps.setString(1, pr.getRuc());
           ps.setString(2, pr.getNombre());
           ps.setString(3, pr.getApellido());
             ps.setString(4, pr.getComercial());
           ps.setInt(5, pr.getTelefono());
           ps.setString(6, pr.getEmail());
           ps.setString(7, pr.getDireccion());
           ps.setString(8, pr.getEstado());
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
    
    public List ListarProveedor(){
        List<Proveedor> Listapr = new ArrayList();
        String sql = "SELECT * FROM proveedor";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {                
                Proveedor pr = new Proveedor();
                pr.setId(rs.getInt("id"));
                pr.setRuc(rs.getString("ruc"));
                pr.setNombre(rs.getString("nombre"));
                        pr.setApellido(rs.getString("apellido"));
                        pr.setComercial(rs.getString("comercial"));
                pr.setTelefono(rs.getInt("telefono"));
                pr.setDireccion(rs.getString("direccion"));
                 pr.setEmail(rs.getString("email"));
                pr.setEstado(rs.getString("estado"));
                Listapr.add(pr);
            }
            
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return Listapr;
    }
    
    public boolean EliminarProveedor(int id){
        String sql = "DELETE FROM proveedor WHERE id = ? ";
        try {
            con = cn.getConnection();
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
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
    }
    
    public boolean ModificarProveedor(Proveedor pr){
        String sql = "UPDATE proveedor SET ruc=?, nombre=?,apellido=?,Comercial=?, telefono=?, email=? ,direccion=?, estado=? WHERE id=?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, pr.getRuc());
            ps.setString(2, pr.getNombre());
             ps.setString(3, pr.getApellido());
               ps.setString(4, pr.getComercial());
            ps.setInt(5, pr.getTelefono());
             ps.setString(6, pr.getEmail());
            ps.setString(7, pr.getDireccion());
            ps.setString(8, pr.getEstado());
            ps.setInt(9, pr.getId());
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
    
    public Proveedor BuscarProve(String cod){
        Proveedor proved = new Proveedor();
        String sql = "SELECT * FROM proveedor WHERE ruc = ?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, cod);
            rs = ps.executeQuery();
            if (rs.next()) {
                proved.setComercial(rs.getString("comercial"));
                proved.setTelefono(rs.getInt("telefono"));
                proved.setDireccion(rs.getString("direccion"));
                proved.setEmail(rs.getString("email"));
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return proved ;
    }

}
