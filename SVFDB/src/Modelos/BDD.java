/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JComboBox;
import svfdb.Usuario;
/**
 * 
 * @author Jefferson Alquinga <sguergachi at gmail.com>
 */
public class BDD {
    public static SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
    Connection con;

    public BDD(){
        con = getConnection();
        
    }
    
    public Connection getConnection() {
        try {
            //String access = "jdbc:ucanaccess://D:/ventas.accdb";
            String myBD = "jdbc:mysql://localhost:3306/sistemaventasfacturacion?serverTimezone=UTC";
            con = DriverManager.getConnection(myBD, "root", "yosoyart3");
            return con;
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return null;
    }
    
    public Usuario getUsuario(String login){
        Usuario usuario = new Usuario();
        String sql = "SELECT * FROM usuarios WHERE login = ?";
        PreparedStatement ps;
        ResultSet rs;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, login);
            rs= ps.executeQuery();
            if (rs.next()) {
                usuario = new Usuario(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8));
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }        
        
        return usuario;
    }
    
    public void registrarUsuario(Usuario usuario) throws SQLException{
        String sql = "INSERT INTO usuarios (login,password,nombre,apellido,direccion,telefono, nacimiento,rol) VALUES(?,?,?,?,?,?,?,?)";        
        PreparedStatement ps = con.prepareStatement(sql);
        
        ps.setString(1, usuario.getLogin());
        ps.setString(2, usuario.getPassword());
        ps.setString(3, usuario.getNombre());
        ps.setString(4, usuario.getApellido());
        ps.setString(5, usuario.getDireccion());
        ps.setString(6, usuario.getTelefono());
        ps.setString(7, usuario.getFechaNacimiento());
        ps.setString(8, usuario.getRol());

        ps.executeUpdate();
        ps.execute();
        
        
       
    }
    
    public void actualizarUsuario(Usuario usuario) throws SQLException{
        String sql = "UPDATE usuarios SET "
                + "password = ?, "
                + "nombre = ?, "
                + "apellido = ?, "
                + "direccion = ?, "
                + "telefono = ?,"
                + "nacimiento = ?,"
                + "rol = ? where login = ?";
        
        PreparedStatement ps = con.prepareStatement(sql);
        
        
        ps.setString(1, usuario.getPassword());
        ps.setString(2, usuario.getNombre());
        ps.setString(3, usuario.getApellido());
        ps.setString(4, usuario.getDireccion());
        ps.setString(5, usuario.getTelefono());
        ps.setString(6, usuario.getFechaNacimiento());
        ps.setString(7, usuario.getRol());       
        ps.setString(8, usuario.getLogin());
        
        ps.executeUpdate();
        
    }
   
  
}



