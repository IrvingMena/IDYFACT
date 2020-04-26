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
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author mena4
 */
public final class listaservicio extends javax.swing.JInternalFrame {

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
    public listaservicio() {
        initComponents();
        this.setLocation(200, 70);
        MostrarTabla();
        
        
    }
 void MostrarTabla(){
    try{
        Connection con;
        con = Db.connect();
        DefaultTableModel modelo = new DefaultTableModel();
        listaservicio.setModel(modelo);
        String sql = "SELECT idservicio,detalle_servicio, cantidad, Precio_uni, Importe FROM servicio";
        //String sql = "SELECT * FROM cliente";
        ps = con.prepareStatement(sql);
        rs = ps.executeQuery();
        ResultSetMetaData rsMD = rs.getMetaData();
        int Columnas = rsMD.getColumnCount();
        modelo.addColumn("No.");
        modelo.addColumn("Detalle de servicio");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Precio unitario");
        modelo.addColumn("Importe");
        listaservicio.setModel(modelo);
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
        
        
    /*    void MostrarTabla(){
         DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Dirección");
        modelo.addColumn("Correo");
        modelo.addColumn("RFC");
        modelo.addColumn("Telefono");
         TablaClientes.setModel(modelo);
     
         
         String sql = "SELECT * FROM cliente";
         String datos[] = new String[6];
          
          try {
            Statement  st = cn.createStatement();
              ResultSet rs = st.executeQuery(sql);
              while(rs.next()){
                  datos[0] = rs.getString(1);
                  datos[1] = rs.getString(2);
                  datos[2] = rs.getString(3);
                  datos[3] = rs.getString(4);
                  datos[4] = rs.getString(5);
                  datos[5] = rs.getString(6);
                  modelo.addRow(datos);
              
              }
              TablaClientes.setModel(modelo);
              
          } catch (SQLException ex) {
              Logger.getLogger(listaservicio.class.getName()).log(Level.SEVERE, null, ex);
          }
         
                 
    }*/
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaservicio = new javax.swing.JTable();

        setResizable(true);
        setTitle("Lista de servicios");

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        listaservicio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(listaservicio);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 824, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jButton2)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
this.dispose();           // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable listaservicio;
    // End of variables declaration//GEN-END:variables
}
