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
    private String rol;

    public Usuario(String login, String password, String rol) {
        this.login = login;
        this.password = password;
        this.rol = rol;
    }
    
    //Metodos
    public void ingresarLogin(String login){
        this.login = login;
    }
    
    public boolean validarLogin(String loginIngreso){
        return login.equals(loginIngreso);
    }
    
           
}
