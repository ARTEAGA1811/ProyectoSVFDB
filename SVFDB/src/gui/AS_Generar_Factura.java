/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import Modelos.BDD;
import Modelos.Client;
import Modelos.Cliente;
import Modelos.Product;
import Modelos.Productos;
import Modelos.Proveed;
import Modelos.Proveedor;
import Modelos.Vent;
import Modelos.Venta;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import svfdb.Usuario;
import svfdb.ValidacionesCampos;

/**
 *
 * @author David Arteaga.
 */
public class AS_Generar_Factura extends javax.swing.JFrame {

       BDD baseDeDatos;
       Venta v = new Venta();
    Vent Vt = new Vent();
        Client client = new Client();
 Cliente cl = new Cliente();
        
        Proveed prov = new Proveed();
        Proveedor prove = new Proveedor();
          Productos pro = new Productos();
    Product proDao = new Product();
      DefaultTableModel modelo = new DefaultTableModel();  
    DefaultTableModel tmp = new DefaultTableModel();
   int item;
    double Totalpagar = 0.00;
    
 
    
    
   /* public AS_Generar_Factura(Usuario usuarioConsultado) {
        initComponents();
        
    
    }
  */  
    
    
    public AS_Generar_Factura(){
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCedulaGenFact = new javax.swing.JTextField();
        txtNombreGenFac = new javax.swing.JTextField();
        txtApellidoGenFac = new javax.swing.JTextField();
        txtCodigoGenFac = new javax.swing.JTextField();
        txtDireccionGenFac = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtTelefGenFac = new javax.swing.JTextField();
        txtCorreoGenFac = new javax.swing.JTextField();
        jScrollPane7 = new javax.swing.JScrollPane();
        tableFactura = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTFNombre1 = new javax.swing.JTextField();
        jTFNombre3 = new javax.swing.JTextField();
        jTFNombre4 = new javax.swing.JTextField();
        LabelTotal2 = new javax.swing.JLabel();
        btnGenerarVenta3 = new javax.swing.JButton();
        btnGuardarpro1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa.png"))); // NOI18N
        jLabel1.setText("Generar Facura");

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cédula : ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Código ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Apellido");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Dirección");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Teléfono");

        txtCedulaGenFact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCedulaGenFactKeyPressed(evt);
            }
        });

        txtNombreGenFac.setForeground(new java.awt.Color(255, 255, 255));
        txtNombreGenFac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreGenFacActionPerformed(evt);
            }
        });

        txtApellidoGenFac.setForeground(new java.awt.Color(255, 255, 255));
        txtApellidoGenFac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoGenFacActionPerformed(evt);
            }
        });

        txtCodigoGenFac.setForeground(new java.awt.Color(255, 255, 255));

        txtDireccionGenFac.setForeground(new java.awt.Color(255, 255, 255));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("E-mail");

        txtTelefGenFac.setForeground(new java.awt.Color(255, 255, 255));

        txtCorreoGenFac.setForeground(new java.awt.Color(255, 255, 255));

        tableFactura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CódigoPro", "Nombre Producto", "Cantidad de Producto", "Precio Unidad $", "Precio Total $"
            }
        ));
        tableFactura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableFacturaMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(tableFactura);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Valor Unitario: ");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("12 % IVA :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("desc :");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Valor Total :");

        jTFNombre1.setForeground(new java.awt.Color(255, 255, 255));
        jTFNombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNombre1ActionPerformed(evt);
            }
        });

        jTFNombre3.setForeground(new java.awt.Color(255, 255, 255));
        jTFNombre3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNombre3ActionPerformed(evt);
            }
        });

        jTFNombre4.setForeground(new java.awt.Color(255, 255, 255));
        jTFNombre4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNombre4ActionPerformed(evt);
            }
        });

        LabelTotal2.setText("-----");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 39, Short.MAX_VALUE)
                                .addComponent(jLabel12)
                                .addGap(58, 58, 58)
                                .addComponent(jTFNombre3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel13))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTFNombre1, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                                    .addComponent(LabelTotal2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTFNombre4, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LabelTotal2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFNombre4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFNombre3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btnGenerarVenta3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/print.png"))); // NOI18N
        btnGenerarVenta3.setText("Imprimir");

        btnGuardarpro1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/GuardarTodo.png"))); // NOI18N
        btnGuardarpro1.setText("Generar");
        btnGuardarpro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarpro1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtTelefGenFac, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                    .addComponent(txtCedulaGenFact))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtNombreGenFac, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txtApellidoGenFac, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCodigoGenFac, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(175, 175, 175))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtDireccionGenFac, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addGap(33, 33, 33)
                        .addComponent(txtCorreoGenFac, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 835, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(btnGuardarpro1)
                        .addGap(68, 68, 68)
                        .addComponent(btnGenerarVenta3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCedulaGenFact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtApellidoGenFac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtCodigoGenFac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtNombreGenFac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtDireccionGenFac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtTelefGenFac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtCorreoGenFac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(61, 61, 61))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGenerarVenta3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGuardarpro1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53))))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 840, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void tableFacturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableFacturaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tableFacturaMouseClicked

    private void txtApellidoGenFacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoGenFacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoGenFacActionPerformed

    private void txtNombreGenFacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreGenFacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreGenFacActionPerformed

    private void jTFNombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNombre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNombre1ActionPerformed

    private void jTFNombre3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNombre3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNombre3ActionPerformed

    private void jTFNombre4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNombre4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNombre4ActionPerformed

    private void btnGuardarpro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarpro1ActionPerformed

        if (tableFactura.getRowCount() > 0) {
             
    
              //  RegistrarVenta();
                JOptionPane.showMessageDialog(null, "Se ha registrado la venta Exitosamente");
                
                ActualizarStock();

                LimpiartableVenta();
        
         }
        
    }//GEN-LAST:event_btnGuardarpro1ActionPerformed

    private void txtCedulaGenFactKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaGenFactKeyPressed
        // TODO add your handling code here: ************************KEY PRESSED LA CEDULA DEL CLIENTE.
    /*    Cliente miClientee = new Cliente();
//        boolean esSoloNumeros = (evt.getKeyChar() >= 48 && evt.getKeyChar() <= 57);
//        if(!esSoloNumeros){
//            evt.consume();
//        }*/
    
if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
          /*
            if (!"".equals(txtCedulaGenFact.getText())) {
                //boolean esCedulaValida = new ValidacionesCampos().validadorDeCedula(txtCedulaGenFact.getText());
                String cod = txtCedulaGenFact.getText();
                cl = client.BuscarCli(cod);
                        
                        if (cl.getNombre()!= null) {
                    
                 txtNombreGenFac.setText("" + cl.getNombre());
                 txtApellidoGenFac.setText("" + cl.getApellido());
                 txtTelefGenFac.setText("" + cl.getTelefono());
                 txtDireccionGenFac.setText("" + cl.getDireccion());
                 txtCorreoGenFac.setText("" + cl.getCorreo());

                    txtCedulaGenFact.requestFocus();
                } else {
                   
                    
                    txtCedulaGenFact.requestFocus();
                }
            } else {
                JOptionPane.showMessageDialog(null, "No exite Proveedor con ese RUC ");
                
                txtCedulaGenFact.requestFocus();
            }
*/


        
     
            
            
            
            
            
            
            
            if(txtCedulaGenFact.getText().isEmpty() == false){
                boolean esCedulaValida = new ValidacionesCampos().validadorDeCedula(txtCedulaGenFact.getText());
                //boolean esCedulaValida = true;
                if(esCedulaValida){
                    String cod = txtCedulaGenFact.getText();
                    cl = client.BuscarCli(cod);
                    //miClientee = miClient.Buscarcliente(Integer.parseInt(txtCedulaGenFact.getText()));
                    System.out.println("nombre: "+ cl.getNombre());
                    if(cl.getNombre() != null){
                        System.out.println("Vale esto?");
                        txtNombreGenFac.setText(""+ cl.getNombre());
                        txtApellidoGenFac.setText(""+ cl.getApellido());
                        txtTelefGenFac.setText(Integer.toString(cl.getTelefono()));
                        txtDireccionGenFac.setText(""+ cl.getDireccion());
                        txtCorreoGenFac.setText(""+ cl.getCorreo());
                    }else{
                        //En este caso es que no ha demiClienteetectado una cedula registrada
                        JOptionPane.showMessageDialog(null, "Cliente no registrado, ingrese datos");
                        //limpiarEstaVentana();
                    
                    
                    }    
                }else{
                    JOptionPane.showMessageDialog(null, "Cedula incorrecta, vuelva a ingresar");
                    //limpiarEstaVentana();
                }
                
            }
            
        }
        
        
        
        

    }//GEN-LAST:event_txtCedulaGenFactKeyPressed

 
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelTotal2;
    private javax.swing.JButton btnGenerarVenta3;
    private javax.swing.JButton btnGuardarpro1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTextField jTFNombre1;
    private javax.swing.JTextField jTFNombre3;
    private javax.swing.JTextField jTFNombre4;
    private javax.swing.JTable tableFactura;
    private javax.swing.JTextField txtApellidoGenFac;
    private javax.swing.JTextField txtCedulaGenFact;
    private javax.swing.JTextField txtCodigoGenFac;
    private javax.swing.JTextField txtCorreoGenFac;
    private javax.swing.JTextField txtDireccionGenFac;
    private javax.swing.JTextField txtNombreGenFac;
    private javax.swing.JTextField txtTelefGenFac;
    // End of variables declaration//GEN-END:variables


        

private void TotalPagar() {
    
        Totalpagar = 0.00;
        int numFila = tableFactura.getRowCount();
        for (int i = 0; i < numFila; i++) {
            double cal = Double.parseDouble(String.valueOf(tableFactura.getModel().getValueAt(i, 4)));
            Totalpagar = Totalpagar + cal;
        }
        LabelTotal2.setText(String.format("%.2f", Totalpagar));
}

private void LimpiartableVenta() {
        tmp = (DefaultTableModel) tableFactura.getModel();
        int fila =tableFactura.getRowCount();
        for (int i = 0; i < fila; i++) {
            tmp.removeRow(0);
        }
    }
    private void ActualizarStock() {
        for (int i = 0; i < tableFactura.getRowCount(); i++) {
            String cod = tableFactura.getValueAt(i, 0).toString();
            int cant = Integer.parseInt(tableFactura.getValueAt(i, 2).toString());
            pro = proDao.BuscarPro(cod);
            int StockActual = (int) (pro.getStock() - cant);
            Vt.ActualizarStock(StockActual, cod);

        }
    }

}
