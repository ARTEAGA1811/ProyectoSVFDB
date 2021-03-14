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
import svfdb.Usuario;
/**
 * 
 * @author Jefferson Alquinga <sguergachi at gmail.com>
 */
public class BDD {
    
    Connection con;

    public BDD(){
        con = getConnection();
    }
    
    public Connection getConnection() {
        try {
            //String access = "jdbc:ucanaccess://D:/ventas.accdb";
            String myBD = "jdbc:mysql://localhost:3306/sistemaventasfacturacion?serverTimezone=UTC";
            con = DriverManager.getConnection(myBD, "root", "");
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

}



