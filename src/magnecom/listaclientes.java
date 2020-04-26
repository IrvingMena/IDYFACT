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
public final class listaclientes extends javax.swing.JInternalFrame {

    private static final long serialVersionUID = 1L;
   
    //Db conn = new Db();
   //Connection con = conn.getDb();
    PreparedStatement ps = null;
           ResultSet rs = null;
   Db con = new Db();
      Connection cn = Db.connect();
   
    /**
     * Creates new form listaservicio
     */
    public listaclientes() {
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
        
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaclientes = new javax.swing.JTable();
        eliminar = new javax.swing.JButton();

        setTitle("Lista de clientes");

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

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

        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(eliminar))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 824, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(eliminar))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
this.dispose();           // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        // TODO add your handling code here:
        int fila =listaclientes.getSelectedRow();

        if(fila>=0){
            String valor = listaclientes.getValueAt(fila,0).toString();

            try {
                PreparedStatement pps= cn.prepareStatement("DELETE FROM cliente WHERE id_cli="+valor);

                int n=pps.executeUpdate();

                JOptionPane.showMessageDialog(null," Registro eliminado");
                MostrarTabla();

            } catch (SQLException ex) {
                Logger.getLogger(listaclientes.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        else {
            JOptionPane.showMessageDialog(null,"Seleccione un registro ");
        }
        
    }//GEN-LAST:event_eliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton eliminar;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable listaclientes;
    // End of variables declaration//GEN-END:variables
}
