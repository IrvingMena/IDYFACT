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
public final class listafactura extends javax.swing.JInternalFrame {

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
    public listafactura() {
        initComponents();
        this.setLocation(200, 70);
        MostrarTabla();
        
        
    }
 void MostrarTabla(){
    try{
        Connection con;
        con = Db.connect();
        DefaultTableModel modelo = new DefaultTableModel();//
        listacotizacion.setModel(modelo);
        String sql = "select nombrec,rfcc, correoc, fecha, metodo_de_pago,usocfdi,detalle_servicio,cantidad,Precio_uni,Importe,iva,precio_total  from cliente, factura, servicio where id_cli = idcliente and id_servicio = idservicio";
       //String sql = "select * from cliente, factura, servicio where id_cli = idcliente and id_servicio = idservicio";
        ps = con.prepareStatement(sql);
        rs = ps.executeQuery();
        ResultSetMetaData rsMD = rs.getMetaData();
        int Columnas = rsMD.getColumnCount();
        
        modelo.addColumn("Nombre");
        modelo.addColumn("RFC");
        modelo.addColumn("Correo");
        modelo.addColumn("Fecha");
        modelo.addColumn("Metodo de pago");
        modelo.addColumn("Uso de CDFI");
        modelo.addColumn("Detalle del servicio");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Precio Unitario");
        modelo.addColumn("Importe");
        modelo.addColumn("Iva");
        modelo.addColumn("Precio Total");
              listacotizacion.setModel(modelo);
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
        listacotizacion = new javax.swing.JTable();

        setTitle("Lista de facturas");

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        listacotizacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(listacotizacion);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 961, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jButton2)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
this.dispose();           // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable listacotizacion;
    // End of variables declaration//GEN-END:variables
}
