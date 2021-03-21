/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelos;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Proveedor {
    
    private int id;
    private int ruc;
    private String nombre;
    private String apellido;    
    private String comercial;
    private int telefono;
     private String email;
    private String direccion;
    private String Estado;
   
    
    public Proveedor(){
        
    }

    public Proveedor(int id, int ruc, String nombre, String apellido, String comercial, int telefono, String email, String direccion, String Estado) {
        this.id = id;
        this.ruc = ruc;
        this.nombre = nombre;
        this.apellido = apellido;
        this.comercial = comercial;
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;
        this.Estado = Estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRuc() {
        return ruc;
    }

    public void setRuc(int ruc) {
        this.ruc = ruc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getComercial() {
        return comercial;
    }

    public void setComercial(String comercial) {
        this.comercial = comercial;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEstado() {
        return Estado = "Activo"; 
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    

    

}