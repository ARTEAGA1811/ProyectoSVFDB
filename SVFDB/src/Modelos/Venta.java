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
public class Venta {
    
     private int id;
   
    private String vendedor;
    private double total;
     private String Estado;
    
    public Venta(){
        
    }

    public Venta(int id, String vendedor, double total, String Estado) {
        this.id = id;
        this.vendedor = vendedor;
        this.total = total;
        this.Estado = Estado;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    

}