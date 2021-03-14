/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package svfdb;

/**
 *
 * @author David Arteaga / Mittsaker / Art3-
 * 14 feb. 2021 12:24:20 p. m.
 */
public class Usuario {
    private String login;
    private String password;
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;
    private String fechaNacimiento;
    private String rol;

    public Usuario(String login, String password, String nombre, String apellido, String direccion, String telefono, String fechaNacimiento, String rol) {
        this.login = login;
        this.password = password;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.rol = rol;
    }
    
    public Usuario(){};
    
    //Metodos
    public void ingresarLogin(String login){
        this.login = login;
    }
    
    public boolean validarLogin(String pass){
        if(password == null)
            return false;
        
        return password.equals(pass);
    }

    public String getRol() {
        return rol;
    }
    
    
    
           
}
