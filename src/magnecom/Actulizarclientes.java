/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magnecom;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mena4
 */
public class Actulizarclientes extends javax.swing.JInternalFrame {

    private static final long serialVersionUID = 1L;
    PreparedStatement ps;
ResultSet rs;
  Db con = new Db();
      Connection cn = Db.connect();

    /**
     * Creates new form Actulizarclientes
     */
    public Actulizarclientes() {
        initComponents();
        this.setLocation(200, 70);
        MostrarTabla();
    }

    void MostrarTabla(){
    try{
        Connection con;
        con = Db.connect();
        DefaultTableModel modelo = new DefaultTableModel();
        listaclientes.setModel(modelo);
        String sql = "SELECT id_cli,nombrec,apellidoc,direccionc,correoc,rfcc,telefono FROM cliente";
        //String sql = "SELECT * FROM cliente";
        ps = con.prepareStatement(sql);
        rs = ps.executeQuery();
        ResultSetMetaData rsMD = rs.getMetaData();
        int Columnas = rsMD.getColumnCount();
        modelo.addColumn("No.");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Direccion");
        modelo.addColumn("Correo");
        modelo.addColumn("RFC");
        modelo.addColumn("Telefono");
       
        listaclientes.setModel(modelo);
        while(rs.next())
        {
           Object[] filas = new Object[Columnas];
           for(int i =0; i<Columnas; i++){
               filas[i]= rs.getObject(i+1);
           }
           modelo.addRow(filas);
        }
        
        }catch(SQLException ex){
          System.err.println(ex.toString());      
        }
}
     public void limpiar()
    {
       RFC.setText("");
       nomcliente.setText("");
       apellcliente.setText("");
       dircliente.setText("");
       correo.setText("");
       telefonoclient.setText("");
       ID.setText(" ");
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        dircliente = new javax.swing.JTextField();
        correo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        telefonoclient = new javax.swing.JTextField();
        RFC = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        nomcliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        apellcliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaclientes = new javax.swing.JTable();
        editar = new javax.swing.JButton();
        actualizar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        jLabel4.setText("Correo");

        dircliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dirclienteActionPerformed(evt);
            }
        });
        dircliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dirclienteKeyTyped(evt);
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

        jLabel7.setText("Telefono");

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

        jLabel3.setText("Apellidos");

        listaclientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(listaclientes);

        editar.setText("Editar");
        editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarActionPerformed(evt);
            }
        });

        actualizar.setText("Actualizar");
        actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarActionPerformed(evt);
            }
        });

        jLabel5.setText("No.");

        ID.setEditable(false);

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(editar)
                .addGap(72, 72, 72)
                .addComponent(actualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(apellcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(correo, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(dircliente, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(RFC, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(nomcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2))
                            .addGap(29, 29, 29)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel4)
                                .addComponent(telefonoclient, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addContainerGap(427, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dircliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apellcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editar)
                    .addComponent(actualizar)
                    .addComponent(jButton2))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(20, 20, 20)
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
                    .addContainerGap(265, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dirclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dirclienteActionPerformed

    }//GEN-LAST:event_dirclienteActionPerformed

    private void correoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correoActionPerformed

    private void RFCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RFCActionPerformed

    }//GEN-LAST:event_RFCActionPerformed

    private void nomclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomclienteActionPerformed

    }//GEN-LAST:event_nomclienteActionPerformed

    private void apellclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellclienteActionPerformed

    }//GEN-LAST:event_apellclienteActionPerformed

    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed
        int fila = listaclientes.getSelectedRow();
        if(fila>=0){

            ID.setText(listaclientes.getValueAt(fila, 0).toString());
            nomcliente.setText(listaclientes.getValueAt(fila, 1).toString());
            apellcliente.setText(listaclientes.getValueAt(fila, 2).toString());
            dircliente.setText(listaclientes.getValueAt(fila, 3).toString());
            correo.setText(listaclientes.getValueAt(fila, 4).toString());
            telefonoclient.setText(listaclientes.getValueAt(fila, 5).toString());
            RFC.setText(listaclientes.getValueAt(fila, 5).toString());
        }
        else{

            JOptionPane.showMessageDialog(null, "porfavor seleccione una fila");
        }
    }//GEN-LAST:event_editarActionPerformed

    private void actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarActionPerformed

        PreparedStatement pps;
        try {
            pps = cn.prepareStatement("UPDATE cliente SET nombrec= ?,apellidoc= ?,direccionc= ?,correoc= ?,rfcc= ?,telefono= ? WHERE id_cli=?");

           
            pps.setString(1, nomcliente.getText());
            pps.setString(2, apellcliente.getText());
            pps.setString(3, dircliente.getText());
            pps.setString(4, correo.getText());
            pps.setString(5, RFC.getText());
            pps.setString(6, telefonoclient.getText());
            pps.setString(7, ID.getText());
            int n=pps.executeUpdate();
            if (n == 1) {

                JOptionPane.showMessageDialog(null," Registro Modificado");
                
            } else {
                JOptionPane.showMessageDialog(null,"No Existe el registro "+ RFC.getText()+ "que elijio");
            }
            limpiar();
            MostrarTabla();
        } catch (SQLException ex) {
            Logger.getLogger(Actulizarclientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_actualizarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();           // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void RFCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RFCKeyTyped
char t = evt.getKeyChar();

        if((t<'A'||t>'Z')&(t<'0'||t>'9')) evt.consume();        // TODO add your handling code here:
    }//GEN-LAST:event_RFCKeyTyped

    private void nomclienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomclienteKeyTyped
        // TODO add your handling code here:
        char t = evt.getKeyChar();

        if(t<'a'||t>'z') evt.consume();
    }//GEN-LAST:event_nomclienteKeyTyped

    private void telefonoclientKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefonoclientKeyTyped
        // TODO add your handling code here:
        char n = evt.getKeyChar();

        if(n<'0'||n>'9') evt.consume();
    }//GEN-LAST:event_telefonoclientKeyTyped

    private void dirclienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dirclienteKeyTyped
        // TODO add your handling code here:
        char t = evt.getKeyChar();

        if((t<'a'||t>'z')&(t<'0'||t>'9')) evt.consume();
    }//GEN-LAST:event_dirclienteKeyTyped

    private void apellclienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apellclienteKeyTyped
        // TODO add your handling code here:
        char t = evt.getKeyChar();

        if(t<'a'||t>'z') evt.consume();
    }//GEN-LAST:event_apellclienteKeyTyped

    private void correoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_correoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_correoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ID;
    private javax.swing.JTextField RFC;
    private javax.swing.JButton actualizar;
    private javax.swing.JTextField apellcliente;
    private javax.swing.JTextField correo;
    private javax.swing.JTextField dircliente;
    private javax.swing.JButton editar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable listaclientes;
    private javax.swing.JTextField nomcliente;
    private javax.swing.JTextField telefonoclient;
    // End of variables declaration//GEN-END:variables
}
