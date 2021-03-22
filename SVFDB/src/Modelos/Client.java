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
import javax.swing.JOptionPane;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Client {

    static String RegistrarCliente;
 BDD cn = new BDD();
 
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public boolean RegistrarCliente(Cliente cl){
        String sql = "INSERT INTO clientes (dni, nombre,apellido, telefono, correo,direccion,estado) VALUES (?,?,?,?,?,?,?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, cl.getDni());
            ps.setString(2, cl.getNombre());
               ps.setString(3, cl.getApellido());
            ps.setInt(4, cl.getTelefono());
             ps.setString(5, cl.getCorreo());
            ps.setString(6, cl.getDireccion());
            ps.setString(7, cl.getEstado());
          
     
            ps.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }finally{
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
    }
    
   public List ListarCliente(){
       
       List<Cliente> ListaCl = new ArrayList();
       String sql = "SELECT * FROM clientes";
       try {
           con = cn.getConnection();
           ps = con.prepareStatement(sql);
           rs = ps.executeQuery();
           while (rs.next()) {               
               Cliente cl = new Cliente();
               
               cl.setId(rs.getInt("id"));
               cl.setDni(rs.getString("dni"));
               cl.setNombre(rs.getString("Nombre"));
               
               cl.setApellido(rs.getString("Apellido"));
               cl.setTelefono(rs.getInt("telefono"));
               
                  cl.setCorreo(rs.getString("correo"));
                  
               cl.setDireccion(rs.getString("direccion"));
               
                cl.setEstado(rs.getString("estado"));
            
               ListaCl.add(cl);
           }
       } catch (SQLException e) {
           System.out.println(e.toString());
       }
       return ListaCl;
   }
   
   public boolean EliminarCliente(int id){
       
  String sql = "DELETE FROM clientes WHERE id = ?";
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
   
   public boolean ModificarCliente(Cliente cl){
       String sql = "UPDATE clientes SET dni=?, nombre=?, apellido=? , telefono=?,correo=?, direccion=? WHERE id=?";
       try {
           ps = con.prepareStatement(sql);
           ps.setString(1, cl.getDni());
           ps.setString(2, cl.getNombre());
            
           ps.setString(3, cl.getApellido());
                      ps.setInt(4, cl.getTelefono());
              ps.setString(5, cl.getCorreo());
           ps.setString(6, cl.getDireccion());
        
           ps.setInt(7, cl.getId());
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
   
   public Cliente Buscarcliente(int dni){
       Cliente cl = new Cliente();
       String sql = "SELECT * FROM clientes WHERE dni = ?";
       try {
           con = cn.getConnection();
           ps = con.prepareStatement(sql);
           ps.setInt(1, dni);
           rs = ps.executeQuery();
           if (rs.next()) {
               cl.setNombre(rs.getString("nombre"));
               cl.setApellido(rs.getString("apellido"));
               cl.setTelefono(rs.getInt("telefono"));
               cl.setDireccion(rs.getString("direccion"));
               cl.setCorreo(rs.getString("correo"));
            
           }
       } catch (SQLException e) {
           System.out.println(e.toString());
       }
       return cl;
       
   }
public Cliente BuscarClien(String cod){
        Cliente clien = new Cliente();
        
        String sql = "SELECT * FROM clientes WHERE dni = ?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, cod);
            rs = ps.executeQuery();
            if (rs.next()) {
        
                clien.setNombre(rs.getString("nombre"));
                 clien.setApellido(rs.getString("apellido"));
                clien.setTelefono(rs.getInt("telefono"));
                   clien.setCorreo(rs.getString("correo"));
                clien.setDireccion(rs.getString("direccion"));
                                                                      
                
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return clien ;
    }

   
}      
