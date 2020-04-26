/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magnecom;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.SqlUsuarios;

/**
 *
 * @author mena4
 */
public final class Cliente extends javax.swing.JInternalFrame {

    private static final long serialVersionUID = 1L;
PreparedStatement ps;
ResultSet rs;
Connection con;
    /**
     * Creates new form Cliente
     */
    public Cliente() {
        initComponents();
        limpiar();
        this.setLocation(450, 50);
        bloquear_cajas();
    }
    
    /**
     *
     */

    
    
    
    
 public void limpiar()
    {
       RFC.setText("");
       nomcliente.setText("");
       apellcliente.setText("");
       dircliente.setText("");
       correo.setText("");
       telefonoclient.setText("");
        
    }
    
    public void  bloquear_cajas()
    {
       RFC.setEnabled(false);
       nomcliente.setEnabled(false);
       apellcliente.setEnabled(false);
       dircliente.setEnabled(false);       
       nuevojButton1.setEnabled(true);
       regclientejButton1.setEnabled(false);
       cancelclijButton2.setEnabled(false);
       telefonoclient.setEnabled(false);
       correo.setEnabled(false);
       
    }
    public void  desbloquear()
    {
       RFC.setEnabled(true);
       
       nomcliente.setEnabled(true);
       apellcliente.setEnabled(true);
       dircliente.setEnabled(true);       
       telefonoclient.setEnabled(true);
       nuevojButton1.setEnabled(false);
       regclientejButton1.setEnabled(true);
       cancelclijButton2.setEnabled(true);
       correo.setEnabled(true);
       
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nomcliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        apellcliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        dircliente = new javax.swing.JTextField();
        correo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        regclientejButton1 = new javax.swing.JButton();
        nuevojButton1 = new javax.swing.JButton();
        cancelclijButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        salirclijButton3 = new javax.swing.JButton();
        telefonoclient = new javax.swing.JTextField();
        RFC = new javax.swing.JTextField();

        setTitle("Nuevo Cliente");

        jLabel1.setText("RFC");

        nomcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomclienteActionPerformed(evt);
            }
        });
        nomcliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nomclienteKeyTyped(evt);
            }
        });

        jLabel2.setText("Nombres");

        apellcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellclienteActionPerformed(evt);
            }
        });
        apellcliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                apellclienteKeyTyped(evt);
            }
        });

        jLabel3.setText("Apellidos (Opcional)");

        jLabel4.setText("Correo");

        dircliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dirclienteActionPerformed(evt);
            }
        });

        correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correoActionPerformed(evt);
            }
        });
        correo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                correoKeyTyped(evt);
            }
        });

        jLabel6.setText("Direccion");

        regclientejButton1.setText("Registrar");
        regclientejButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regclientejButton1ActionPerformed(evt);
            }
        });

        nuevojButton1.setText(" Nuevo registro");
        nuevojButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevojButton1ActionPerformed(evt);
            }
        });

        cancelclijButton2.setText("Cancelar");
        cancelclijButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelclijButton2ActionPerformed(evt);
            }
        });

        jLabel7.setText("Telefono");

        salirclijButton3.setText("Salir");
        salirclijButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirclijButton3ActionPerformed(evt);
            }
        });

        telefonoclient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonoclientActionPerformed(evt);
            }
        });
        telefonoclient.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telefonoclientKeyTyped(evt);
            }
        });

        RFC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RFCActionPerformed(evt);
            }
        });
        RFC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                RFCKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(regclientejButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cancelclijButton2)
                .addGap(45, 45, 45)
                .addComponent(nuevojButton1)
                .addGap(18, 18, 18)
                .addComponent(salirclijButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(13, 13, 13)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(RFC, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(dircliente, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(apellcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3)
                                        .addComponent(nomcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2))
                                    .addGap(29, 29, 29)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel7)
                                        .addComponent(telefonoclient, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                                        .addComponent(jLabel4)
                                        .addComponent(correo)))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(17, 17, 17)
                            .addComponent(jLabel6)))
                    .addContainerGap(20, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(383, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nuevojButton1)
                    .addComponent(cancelclijButton2)
                    .addComponent(salirclijButton3)
                    .addComponent(regclientejButton1))
                .addGap(19, 19, 19))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1)
                    .addGap(18, 18, 18)
                    .addComponent(RFC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(23, 23, 23)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nomcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(telefonoclient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(apellcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabel6)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(dircliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(180, 180, 180)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomclienteActionPerformed
      
    }//GEN-LAST:event_nomclienteActionPerformed

    private void apellclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellclienteActionPerformed
        
    }//GEN-LAST:event_apellclienteActionPerformed

    private void dirclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dirclienteActionPerformed

    }//GEN-LAST:event_dirclienteActionPerformed

    private void correoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correoActionPerformed

    private void regclientejButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regclientejButton1ActionPerformed
SqlUsuarios modSql = new SqlUsuarios();
        if(RFC.getText().length()>0 && nomcliente.getText().length()>0 && dircliente.getText().length()>0 && correo.getText().length()>0 && telefonoclient.getText().length()>0){   
       if (modSql.esEmail(correo.getText())){
           if (modSql.esRFC(RFC.getText())){
              if (modSql.esTelefono(telefonoclient.getText())) {
            try { 
            Connection con;
            con = Db.connect();
            ps = con.prepareStatement ("INSERT INTO cliente(nombrec,apellidoc,direccionc,correoc,rfcc,telefono) VALUES (?,?,?,?,?,?)");
            ps.setString(1, nomcliente.getText());
            ps.setString(2, apellcliente.getText());
            ps.setString(3, dircliente.getText());
            ps.setString(4, correo.getText());
            ps.setString(5, RFC.getText());
            ps.setString(6, telefonoclient.getText());
            int res;
           res = ps.executeUpdate();
           if(res > 0){
               JOptionPane.showMessageDialog(rootPane, "Registro exitoso");
               limpiar();
           }else{
               JOptionPane.showMessageDialog(rootPane, "Error al registrar");
               limpiar();
           }   
           
        }catch (SQLException ex) {
            Logger.getLogger(LoginRegistrar.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("ERORO!!!");
        }
           }else {
           JOptionPane.showMessageDialog(null, "El telefono es incorrecto debe de contar con 10 digitos "); 
                } 
              
              
           }else {
           JOptionPane.showMessageDialog(null, "El RFC es incorrecto"); 
                }
       
       }else {
           JOptionPane.showMessageDialog(null, "El email es incorrecto"); 
                }
   
            }else{
            JOptionPane.showMessageDialog(rootPane, "No debes dejar campos vacios !!");        
        }
    }//GEN-LAST:event_regclientejButton1ActionPerformed

    private void nuevojButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevojButton1ActionPerformed
        desbloquear();
    }//GEN-LAST:event_nuevojButton1ActionPerformed

    private void cancelclijButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelclijButton2ActionPerformed
        bloquear_cajas();
        limpiar();
    }//GEN-LAST:event_cancelclijButton2ActionPerformed

    private void salirclijButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirclijButton3ActionPerformed
        this.dispose();
    }//GEN-LAST:event_salirclijButton3ActionPerformed

    private void RFCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RFCActionPerformed
      
    }//GEN-LAST:event_RFCActionPerformed

    private void telefonoclientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonoclientActionPerformed
        // TODO add your handling code here:
         
    }//GEN-LAST:event_telefonoclientActionPerformed

    private void telefonoclientKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefonoclientKeyTyped
        // TODO add your handling code here:
        char n = evt.getKeyChar();
        if(n<'0'||n>'9') evt.consume();
    }//GEN-LAST:event_telefonoclientKeyTyped

    private void nomclienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomclienteKeyTyped
        // TODO add your handling code here:
        char t = evt.getKeyChar();

        if(t<'a'||t>'z') evt.consume();
    }//GEN-LAST:event_nomclienteKeyTyped

    private void apellclienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apellclienteKeyTyped
        // TODO add your handling code here:
        char t = evt.getKeyChar();

        if(t<'a'||t>'z') evt.consume();
    }//GEN-LAST:event_apellclienteKeyTyped

    private void correoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_correoKeyTyped
        // TODO add your handling code here:
         
    }//GEN-LAST:event_correoKeyTyped

    private void RFCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RFCKeyTyped
        // TODO add your handling code here:
         char t = evt.getKeyChar();

        if((t<'A'||t>'Z')&(t<'0'||t>'9')) evt.consume();
    }//GEN-LAST:event_RFCKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField RFC;
    private javax.swing.JTextField apellcliente;
    private javax.swing.JButton cancelclijButton2;
    private javax.swing.JTextField correo;
    private javax.swing.JTextField dircliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField nomcliente;
    private javax.swing.JButton nuevojButton1;
    private javax.swing.JButton regclientejButton1;
    private javax.swing.JButton salirclijButton3;
    private javax.swing.JTextField telefonoclient;
    // End of variables declaration//GEN-END:variables
}
