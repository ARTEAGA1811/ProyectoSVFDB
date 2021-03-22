/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import Modelos.BDD;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import svfdb.Usuario;

/**
 *
 * @author David Arteaga.
 */
public class AS_ResetearPassword extends javax.swing.JFrame {

    BDD baseDeDatos;
    /**
     * Creates new form ActualizarPassword
     */
    public AS_ResetearPassword(BDD baseDeDatos) {
        initComponents();
        this.baseDeDatos = baseDeDatos;
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
        lblresetearLogin = new javax.swing.JLabel();
        jTFLogin = new javax.swing.JTextField();
        lblresetearPass = new javax.swing.JLabel();
        lblresetearValidarPass = new javax.swing.JLabel();
        jBResetear = new javax.swing.JButton();
        jTFNuevaPass = new javax.swing.JPasswordField();
        jTFNuevaPass2 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/config.png"))); // NOI18N
        jLabel1.setText("Resetear Password");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblresetearLogin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblresetearLogin.setForeground(new java.awt.Color(0, 51, 255));
        lblresetearLogin.setText("Login");

        jTFLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFLoginKeyTyped(evt);
            }
        });

        lblresetearPass.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblresetearPass.setForeground(new java.awt.Color(0, 51, 255));
        lblresetearPass.setText("Nueva Contraseña");

        lblresetearValidarPass.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblresetearValidarPass.setForeground(new java.awt.Color(0, 51, 255));
        lblresetearValidarPass.setText("Ingrese  de nuevo la contraseña");

        jBResetear.setText("Resetear Password");
        jBResetear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBResetearActionPerformed(evt);
            }
        });

        jTFNuevaPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFNuevaPassKeyTyped(evt);
            }
        });

        jTFNuevaPass2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFNuevaPass2KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblresetearPass, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblresetearValidarPass, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblresetearLogin, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTFLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                            .addComponent(jTFNuevaPass)
                            .addComponent(jTFNuevaPass2))
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jBResetear, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(148, 148, 148))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblresetearLogin)
                    .addComponent(jTFLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblresetearPass)
                    .addComponent(jTFNuevaPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblresetearValidarPass)
                    .addComponent(jTFNuevaPass2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jBResetear, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBResetearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBResetearActionPerformed
        Usuario usuarioResetear = baseDeDatos.getUsuario(jTFLogin.getText());
        String pass1 = new String(jTFNuevaPass.getPassword());
        
        //******************************* Validacion del campo, falta validar que tenga al menos una Mayuscula y numero
        String validarPassUno = new String(jTFNuevaPass.getPassword());
        String validarPassDos = new String(jTFNuevaPass2.getPassword());
        char passUnoCadena[] = validarPassUno.toCharArray();
        char passDosCadena[] = validarPassDos.toCharArray();
        
        boolean passUnoTieneMayus = false;
        
        for(int i=0; i< passUnoCadena.length; i++){
            if(Character.isUpperCase(passUnoCadena[i])){
                passUnoTieneMayus = true;
            }
        }
           
        boolean passUnoTieneUnNumero = false;
        for(int i = 0; i< passUnoCadena.length; i++){
            try{
                int cambiarANumero = Character.getNumericValue(passUnoCadena[i]);
                passUnoTieneUnNumero = true;
            }catch(Exception e){
                
            }
        }
   
          
        
        boolean passDosTieneMayus = false;     
        for(int i=0; i< passDosCadena.length; i++){
            if(Character.isUpperCase(passDosCadena[i])){
                passDosTieneMayus = true;
            }
        }
        
        boolean passDosTieneUnNumero = false;
        for(int i = 0; i< passDosCadena.length; i++){
            try{
                int cambiarANumero = Character.getNumericValue(passDosCadena[i]);
                passDosTieneUnNumero = true;
            }catch(Exception e){
                
            }
        }
        
//        if(!valePassUno){
//            jTFNuevaPass.setBackground(Color.red);
//        }
//        if(!valePassDos){
//            jTFNuevaPass2.setBackground(Color.red);
//        }
        
        boolean sonCamposValidos = passUnoTieneMayus && passUnoTieneUnNumero && passDosTieneMayus && passDosTieneUnNumero;
        
        //*************************************************************
        
        boolean passDiferentes = !pass1.equals(new String(jTFNuevaPass2.getPassword()));
        
        if(!usuarioResetear.estaRegistrado() || passDiferentes || (sonCamposValidos == false))
            JOptionPane.showMessageDialog(this, "Datos Incorrectos", "", JOptionPane.ERROR_MESSAGE);
        else{
            usuarioResetear.setPassword(pass1);
            try {
                baseDeDatos.actualizarUsuario(usuarioResetear);
                JOptionPane.showMessageDialog(this, "Password reseteado con éxito");
            } catch (SQLException ex) {
                Logger.getLogger(AS_ResetearPassword.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_jBResetearActionPerformed

    private void jTFLoginKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFLoginKeyTyped
        // TODO add your handling code here: *****************************KEYTIPPED LOGIN
        //Login: Hasta 18 caracteres alfabeticos.

        
        if(jTFLogin.getText().length() >17){
            evt.consume();
        }
    }//GEN-LAST:event_jTFLoginKeyTyped

    private void jTFNuevaPassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFNuevaPassKeyTyped
        // TODO add your handling code here:********************************KEYTIPPED NUEVA PASS
        //Debe ser alfanumerico
        //Solo numeros
        boolean esSoloNumeros = (evt.getKeyChar() >= 48 && evt.getKeyChar() <= 57);
        //Solo letras maysculas o minusculas
        boolean esLetrasMayuOMinu = (evt.getKeyChar() >= 65 && evt.getKeyChar() <= 90) || (evt.getKeyChar() >=97 && evt.getKeyChar() <= 122);
        
        if(!(esSoloNumeros || esLetrasMayuOMinu)){
            evt.consume();
        }
        //Hasta 12 caracteres alfanumericos.
        
        if(jTFNuevaPass.getText().length() >11){
            evt.consume();
        }
        //No se podra tener espacios
        if(evt.getKeyChar() == 32){
            evt.consume();
        }
        
    }//GEN-LAST:event_jTFNuevaPassKeyTyped

    private void jTFNuevaPass2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFNuevaPass2KeyTyped
        // TODO add your handling code here:********************************** KEY TIPPED INGRESAR DE NUEVO LA PASS
        //Debe ser alfanumerico
        //Solo numeros
        boolean esSoloNumeros = (evt.getKeyChar() >= 48 && evt.getKeyChar() <= 57);
        //Solo letras maysculas o minusculas
        boolean esLetrasMayuOMinu = (evt.getKeyChar() >= 65 && evt.getKeyChar() <= 90) || (evt.getKeyChar() >=97 && evt.getKeyChar() <= 122);
        
        if(!(esSoloNumeros || esLetrasMayuOMinu)){
            evt.consume();
        }
        //Hasta 12 caracteres alfanumericos.
        
        if(jTFNuevaPass2.getText().length() >11){
            evt.consume();
        }
        //No se podra tener espacios
        if(evt.getKeyChar() == 32){
            evt.consume();
        }
    }//GEN-LAST:event_jTFNuevaPass2KeyTyped

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBResetear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTFLogin;
    private javax.swing.JPasswordField jTFNuevaPass;
    private javax.swing.JPasswordField jTFNuevaPass2;
    private javax.swing.JLabel lblresetearLogin;
    private javax.swing.JLabel lblresetearPass;
    private javax.swing.JLabel lblresetearValidarPass;
    // End of variables declaration//GEN-END:variables
}
