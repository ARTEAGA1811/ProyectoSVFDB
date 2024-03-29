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
public class Detalle {
 private int id;
    private String cod_pro;
    private String nombre;
    
    private int cantidad;
    private double precio;
      private double preciototal;
    private int id_venta;
    
    public Detalle(){
        
    }

    public Detalle(int id, String cod_pro, String nombre, int cantidad, double precio, double preciototal, int id_venta) {
        this.id = id;
        this.cod_pro = cod_pro;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.preciototal = preciototal;
        this.id_venta = id_venta;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCod_pro() {
        return cod_pro;
    }

    public void setCod_pro(String cod_pro) {
        this.cod_pro = cod_pro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPreciototal() {
        return preciototal;
    }

    public void setPreciototal(double preciototal) {
        this.preciototal = preciototal;
    }

    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }
}