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

/**
 *
 * @author mena4
 */
public final class RegistroServicio extends javax.swing.JInternalFrame {

    private static final long serialVersionUID = 1L;
    PreparedStatement ps;
ResultSet rs;
Connection con;

    /**
     * Creates new form RegistroServicio
     */
    public RegistroServicio() {
        initComponents();
         limpiar();
         this.setLocation(350, 180);
        bloquear_cajas();
    }
public void limpiar()
    {
       Cantidad.setText("");
       Descripcion.setText("");
       Precio.setText("");
       IMPORTE.setText("");
       
        
    }
    
    public void  bloquear_cajas()
    {
      Cantidad.setEnabled(false);
      Descripcion.setEnabled(false);
      Precio.setEnabled(false);
      nuevo.setEnabled(true);
      IMPORTE.setEnabled(false);
       regservicio.setEnabled(false);
       cancelserv.setEnabled(false);
       Total.setEnabled(false);
       
       
    }
    public void  desbloquear()
    {
       Cantidad.setEnabled(true);
       Descripcion.setEnabled(true);
       Precio.setEnabled(true);
       nuevo.setEnabled(false);
       regservicio.setEnabled(true);
       cancelserv.setEnabled(true);
       Total.setEnabled(true);
      
       
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        regservicio = new javax.swing.JButton();
        cancelserv = new javax.swing.JButton();
        nuevo = new javax.swing.JButton();
        salirserv = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Cantidad = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Descripcion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Precio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        IMPORTE = new javax.swing.JTextField();
        Total = new javax.swing.JButton();

        setTitle("Nuevo Servicio");

        regservicio.setText("Registrar");
        regservicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regservicioActionPerformed(evt);
            }
        });

        cancelserv.setText("Cancelar");
        cancelserv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelservActionPerformed(evt);
            }
        });

        nuevo.setText(" Nuevo registro");
        nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoActionPerformed(evt);
            }
        });

        salirserv.setText("Salir");
        salirserv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirservActionPerformed(evt);
            }
        });

        jLabel1.setText("Cantidad");

        jLabel2.setText("Descripción");

        jLabel3.setText("Precio");

        jLabel4.setText("Importe");

        IMPORTE.setEditable(false);
        IMPORTE.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        Total.setText("Calcular");
        Total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel1)
                        .addGap(174, 174, 174)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(44, 44, 44))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(regservicio, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel4)))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cancelserv)
                                    .addComponent(IMPORTE, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Total)
                                    .addComponent(nuevo))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(Precio, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                                .addComponent(salirserv, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(IMPORTE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Total))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nuevo)
                    .addComponent(cancelserv)
                    .addComponent(salirserv)
                    .addComponent(regservicio))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regservicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regservicioActionPerformed
       if(Cantidad.getText().length()>0 && Descripcion.getText().length()>0 && Precio.getText().length()>0 && IMPORTE.getText().length()>0 ){   
        try { 
            Connection con;
            con = Db.connect();
            ps = con.prepareStatement ("INSERT INTO servicio(detalle_servicio,cantidad,precio_uni,Importe) VALUES (?,?,?,?)");
            ps.setString(1, Descripcion.getText());
            ps.setString(2, Cantidad.getText());
            ps.setString(3, Precio.getText());
            ps.setString(4, IMPORTE.getText());
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
            }else{
            JOptionPane.showMessageDialog(rootPane, "No debes dejar campos vacios !!");        
        } 
        
        
        
    }//GEN-LAST:event_regservicioActionPerformed

    private void cancelservActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelservActionPerformed
        bloquear_cajas();
        limpiar();
    }//GEN-LAST:event_cancelservActionPerformed

    private void nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoActionPerformed
        desbloquear();
    }//GEN-LAST:event_nuevoActionPerformed

    private void salirservActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirservActionPerformed
        this.dispose();
    }//GEN-LAST:event_salirservActionPerformed

    private void TotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalActionPerformed
        // TODO add your handling code here:
        double cant;
        double unita,total1;;
        cant= Integer.parseInt(Cantidad.getText());
        unita= Integer.parseInt(Precio.getText());   
        total1=cant * unita;
        IMPORTE.setText(String.valueOf(total1));
    }//GEN-LAST:event_TotalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Cantidad;
    private javax.swing.JTextField Descripcion;
    private javax.swing.JTextField IMPORTE;
    private javax.swing.JTextField Precio;
    private javax.swing.JButton Total;
    private javax.swing.JButton cancelserv;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton nuevo;
    private javax.swing.JButton regservicio;
    private javax.swing.JButton salirserv;
    // End of variables declaration//GEN-END:variables
}
