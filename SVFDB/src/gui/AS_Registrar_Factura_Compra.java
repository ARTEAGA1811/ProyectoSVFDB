/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import Modelos.BDD;
import Modelos.Fact;
import Modelos.Factura;
import Modelos.Product;
import Modelos.Productos;
import Modelos.Proveed;
import Modelos.Proveedor;
import Modelos.Vent;
import Modelos.Venta;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author David Arteaga.
 */
public class AS_Registrar_Factura_Compra extends javax.swing.JFrame {
    
       BDD baseDeDatos;
       Venta v = new Venta();
    Vent Vt = new Vent();
    Factura f = new Factura();
    Fact fac = new Fact();
        
        Proveed prov = new Proveed();
        Proveedor prove = new Proveedor();
          Productos pro = new Productos();
    Product proDao = new Product();
      DefaultTableModel modelo = new DefaultTableModel();  
    DefaultTableModel tmp = new DefaultTableModel();
   int item;
    double Totalpagar = 0.00;
    
    
    
    
    
    public AS_Registrar_Factura_Compra() {
        
      
        initComponents();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtRuc2 = new javax.swing.JTextField();
        txtNombreCome = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jScrollPane7 = new javax.swing.JScrollPane();
        tableCompra1 = new javax.swing.JTable();
        btnGuardarCompra = new javax.swing.JButton();
        LabelTotal1 = new javax.swing.JLabel();
        jLabel161 = new javax.swing.JLabel();
        txtStockDisponible = new javax.swing.JTextField();
        txtProdCompra = new javax.swing.JTextField();
        txtPrecioCompra = new javax.swing.JTextField();
        txtCantidadCompra = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        btnEliminarventa = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa.png"))); // NOI18N
        jLabel1.setText("REGISTRAR FACTURA COMPRA");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("RUC :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre Comercial");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Código ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Dirección");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Teléfono");

        txtRuc2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRuc2ActionPerformed(evt);
            }
        });
        txtRuc2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtRuc2KeyPressed(evt);
            }
        });

        txtNombreCome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreComeActionPerformed(evt);
            }
        });
        txtNombreCome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreComeKeyTyped(evt);
            }
        });

        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdKeyTyped(evt);
            }
        });

        txtDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDireccionKeyTyped(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("E-mail");

        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        tableCompra1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CódigoPro", "Nombre Producto", "Cantidad de Producto", "Precio Unidad $", "Precio Total $"
            }
        ));
        tableCompra1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableCompra1MouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(tableCompra1);

        btnGuardarCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/GuardarTodo.png"))); // NOI18N
        btnGuardarCompra.setText("Registrar");
        btnGuardarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCompraActionPerformed(evt);
            }
        });

        LabelTotal1.setText("-----");

        jLabel161.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/money.png"))); // NOI18N
        jLabel161.setText("Total a Pagar:");

        txtStockDisponible.setEditable(false);

        txtProdCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProdCompraActionPerformed(evt);
            }
        });
        txtProdCompra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtProdCompraKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtProdCompraKeyTyped(evt);
            }
        });

        txtPrecioCompra.setEditable(false);

        txtCantidadCompra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCantidadCompraKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadCompraKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Código");

        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });
        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodigoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodigoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoKeyTyped(evt);
            }
        });

        btnEliminarventa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/eliminar.png"))); // NOI18N
        btnEliminarventa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarventaActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Producto");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Cantidad");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Precio");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 835, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(btnGuardarCompra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel161)
                        .addGap(40, 40, 40)
                        .addComponent(LabelTotal1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(24, 24, 24))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                                    .addComponent(txtRuc2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtNombreCome, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtProdCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)
                                .addComponent(txtCantidadCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(137, 137, 137))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jLabel8))
                            .addComponent(txtCodigo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(87, 87, 87)
                        .addComponent(jLabel10)
                        .addGap(96, 96, 96)
                        .addComponent(jLabel5)
                        .addGap(67, 67, 67)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(jLabel12))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtPrecioCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(txtStockDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(147, 147, 147)
                        .addComponent(btnEliminarventa))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtRuc2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtNombreCome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(jLabel12))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtPrecioCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtStockDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtProdCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCantidadCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnEliminarventa, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelTotal1)
                    .addComponent(jLabel161))
                .addGap(8, 8, 8)
                .addComponent(btnGuardarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarventaActionPerformed

        modelo = (DefaultTableModel) tableCompra1.getModel();
        modelo.removeRow(tableCompra1.getSelectedRow());

        TotalPagar();
        txtProdCompra.requestFocus();

        JOptionPane.showMessageDialog(null,"Venta Eliminada");
    }//GEN-LAST:event_btnEliminarventaActionPerformed

    private void txtCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoKeyTyped

    private void txtCodigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyReleased

        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoKeyReleased

    private void txtCodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            if (!"".equals(txtCodigo.getText())) {
                String cod = txtCodigo.getText();
                pro = proDao.BuscarPro(cod);
                if (pro.getNombre() != null) {

                    txtProdCompra.setText("" + pro.getNombre());
                    txtPrecioCompra.setText("" + pro.getPrecio());
                    txtStockDisponible.setText("" + pro.getStock());
                    txtCantidadCompra.requestFocus();
                } else {
                    LimparVenta();
                    txtCodigo.requestFocus();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ingrese el codigo del producto");
                txtCodigo.requestFocus();
            }
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoKeyPressed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed


        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void txtCantidadCompraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadCompraKeyTyped
        // TODO add your handling code here:
    //GEN-LAST:event_txtCantidadCompraKeyTyped

        //*********************************************************************KEY TIPPED NOMBRE DEL PRODUCTO
        if(txtProdCompra.getText().length() > 29){
            evt.consume();
        }
        
        
    }//GEN-LAST:event_txtProdCompraKeyTyped


    private void txtCantidadCompraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadCompraKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            if (!"".equals(txtCantidadCompra.getText())||!"".equals(txtPrecioCompra.getText())) {

                String cod = txtCodigo.getText();
                String nombre = txtProdCompra.getText();

                int cant = Integer.parseInt(txtCantidadCompra.getText());

                double precio =  Double.parseDouble(txtPrecioCompra.getText());

                double total = cant * precio;
                int stock = Integer.parseInt(txtStockDisponible.getText());
                if (stock >= cant) {
                    item = item + 1;
                    tmp = (DefaultTableModel) tableCompra1.getModel();
                    for (int i = 0; i < tableCompra1.getRowCount(); i++) {
                        if (tableCompra1.getValueAt(i, 1).equals(txtProdCompra.getText())) {

                            JOptionPane.showMessageDialog(null, "El producto ya esta registrado");
                            return;
                        }
                    }
                    ArrayList lista = new ArrayList();
                    lista.add(item);
                    lista.add(cod);
                    lista.add(nombre);
                    lista.add(cant);
                    lista.add(precio);
                    lista.add(cant*precio);
                    Object[] O = new Object[5];
                    O[0] = lista.get(1);
                    O[1] = lista.get(2);
                    O[2] = lista.get(3);
                    O[3] = lista.get(4);
                    O[4] = lista.get(5);
                    tmp.addRow(O);
                    tableCompra1.setModel(tmp);
                    TotalPagar();
                    LimparVenta();
                    txtCodigo.requestFocus();
                } else {
                    JOptionPane.showMessageDialog(null, "Stock insuficiente, número de productos en stock "+ stock);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ingrese Cantidad");
            }
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadCompraKeyPressed

    private void txtProdCompraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProdCompraKeyTyped

    }//GEN-LAST:event_txtProdCompraKeyTyped

    private void txtProdCompraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProdCompraKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            if (!"".equals(txtProdCompra.getText())) {
                String cod = txtProdCompra.getText();
                pro = proDao.BuscarPro1(cod);
                if (pro.getCodigo() != null) {

                    txtCodigo.setText("" + pro.getCodigo());

                    txtPrecioCompra.setText("" + pro.getPrecio());
                    txtStockDisponible.setText("" + pro.getStock());
                    txtCantidadCompra.requestFocus();
                } else {
                    LimparVenta();
                    txtProdCompra.requestFocus();
                    JOptionPane.showMessageDialog(null, "Producto no disponible en el inventario, intenta con otro producto");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Producto no disponible en el inventario, intenta con otro producto");

                txtProdCompra.requestFocus();
            }

        }
    }//GEN-LAST:event_txtProdCompraKeyPressed

    private void txtProdCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProdCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProdCompraActionPerformed

    private void btnGuardarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCompraActionPerformed

        if (tableCompra1.getRowCount() > 0) {

            RegistrarFactura();

            //  RegistrarVenta();
            JOptionPane.showMessageDialog(null, "Se ha registrado la venta Exitosamente");
            ActualizarStock();

            LimpiartableVenta();

        }

        // TODO add your handling code here:

    }//GEN-LAST:event_btnGuardarCompraActionPerformed

    private void tableCompra1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableCompra1MouseClicked
        // TODO add your handling code here:

    //GEN-LAST:event_tableCompra1MouseClicked

         boolean esSoloNumeros = (evt.getKeyChar() >= 48 && evt.getKeyChar() <= 57);
        if(txtCodigo.getText().length() >3){
            evt.consume();
        }
        if(!esSoloNumeros){
            evt.consume();
        }
    }//GEN-LAST:event_txtCodigoKeyTyped


    private void txtNombreComeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreComeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreComeActionPerformed

    private void txtRuc2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRuc2KeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            if (!"".equals(txtRuc2.getText())) {
                String cod = txtRuc2.getText();
                prove = prov.BuscarProve(cod);

                if (prove.getComercial() != null) {

                    txtNombreCome.setText("" + prove.getComercial());
                    txtId.setText("" + prove.getId());
                    txtTelefono.setText("" + prove.getTelefono());
                    txtDireccion.setText("" + prove.getDireccion());
                    txtEmail.setText("" + prove.getEmail());
                    txtRuc2.requestFocus();
                } else {

                    txtRuc2.requestFocus();
                }
            } else {
                JOptionPane.showMessageDialog(null, "No exite Proveedor con ese RUC ");
                txtId.requestFocus();
            }
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_txtRuc2KeyPressed

    private void txtRuc2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRuc2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRuc2ActionPerformed

    private void txtNombreComeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreComeKeyTyped
        // TODO add your handling code here: *************************KEY TIPPED NOMBRE COMERCIAL
        //Hasta 60 caracteres alfanumericos.
        
        if(txtNombreCome.getText().length() >59){
            evt.consume();
        }
        
    }//GEN-LAST:event_txtNombreComeKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        // TODO add your handling code here: ************************KEY TIPPED DEL TELEFONO
         boolean esSoloNumeros = (evt.getKeyChar() >= 48 && evt.getKeyChar() <= 57);
        if(!esSoloNumeros){
            evt.consume();
        }
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyTyped
        // TODO add your handling code here:
        if(txtDireccion.getText().length() >199){
            evt.consume();
        }
    }//GEN-LAST:event_txtDireccionKeyTyped

    private void txtIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyTyped
        // TODO add your handling code here: ***************************KEY TIPPED CODIGO
        boolean esSoloNumeros = (evt.getKeyChar() >= 48 && evt.getKeyChar() <= 57);
        if(txtId.getText().length() >3){
            evt.consume();
        }
        if(!esSoloNumeros){
            evt.consume();
        }
    }//GEN-LAST:event_txtIdKeyTyped

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelTotal1;
    private javax.swing.JButton btnEliminarventa;
    private javax.swing.JButton btnGuardarCompra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel161;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTable tableCompra1;
    private javax.swing.JTextField txtCantidadCompra;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombreCome;
    private javax.swing.JTextField txtPrecioCompra;
    private javax.swing.JTextField txtProdCompra;
    private javax.swing.JTextField txtRuc2;
    private javax.swing.JTextField txtStockDisponible;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables


       private void LimparVenta() {
           
       
      //  txtNombreVentaC.setText("");
       
      //  txtNombreVentaC.setText("");
  
      //  txtPrecioVentaC.setText("");
       // txtIdVenta.setText("");
        
}
private void TotalPagar() {
    
        Totalpagar = 0.00;
        int numFila = tableCompra1.getRowCount();
        for (int i = 0; i < numFila; i++) {
            double cal = Double.parseDouble(String.valueOf(tableCompra1.getModel().getValueAt(i, 4)));
            Totalpagar = Totalpagar + cal;
        }
        LabelTotal1.setText(String.format("%.2f", Totalpagar));
}

private void LimpiartableVenta() {
        tmp = (DefaultTableModel) tableCompra1.getModel();
        int fila = tableCompra1.getRowCount();
        for (int i = 0; i < fila; i++) {
            tmp.removeRow(0);
        }
    }
     private void RegistrarFactura() {

        String Ruc =txtRuc2.getText();
        
          String Nombre = txtNombreCome.getText();
          
          String Direc = txtDireccion.getText();
          
       
        
        double monto = Totalpagar;
       
        f.setRuc(Ruc);
        f.setProveedor(Nombre);
        
        f.setDireccion(Direc);
        
        f.setTotal(monto);
    
         fac.RegistrarFactura(f);
   
    }



    private void ActualizarStock() {
        for (int i = 0; i < tableCompra1.getRowCount(); i++) {
            String cod = tableCompra1.getValueAt(i, 0).toString();
            int cant = Integer.parseInt(tableCompra1.getValueAt(i, 2).toString());
            pro = proDao.BuscarPro(cod);
            int StockActual = (int) (pro.getStock() - cant);
            Vt.ActualizarStock(StockActual, cod);

        }
    }
}


