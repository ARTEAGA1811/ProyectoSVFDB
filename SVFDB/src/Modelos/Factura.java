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
public class Factura {
    
    
         private int id;
   
    private String ruc;
    private String proveedor;
     private String direccion;
     private double total; 

    public Factura() {
    }

    public Factura(int id, String ruc, String proveedor, String direccion, double total) {
        this.id = id;
        this.ruc = ruc;
        this.proveedor = proveedor;
        this.direccion = direccion;
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

}
