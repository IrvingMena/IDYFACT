/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magnecom;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.SqlUsuarios;

/**
 *
 * @author mena4
 */
public class cotizacion extends javax.swing.JInternalFrame {

    private static final long serialVersionUID = 1L;
ResultSet rs;
Db con = new Db();
 Connection cn = con.connect();


    public cotizacion() {
        initComponents();
        this.setLocation(39, 10);
        DESCRIPCIONCOT.removeAllItems();
        Clientecot.removeAllItems();
        combobox();
        bloquear_cajas();
        mostrarDescripcion();
        mostrarCliente();
        
    }
public void  bloquear_cajas()
    {
       IMPORTE.setEnabled(false);
       TOTALCOT.setEnabled(false);
       IVACOT.setEnabled(false);
       PRECIOCOT.setEnabled(false); 
       Cantidad.setEnabled(false);
       NoCli.setEnabled(false);
       NoServ.setEnabled(false);
       EMAILCOT.setEnabled(false);
       TELEFONOCOT.setEnabled(false);
       DIRECCIONCOT.setEnabled(false);
       NOCOT.setEnabled(false);
       
           }
 public void  combobox()
    {
      Clientecot.addItem(" ");
      DESCRIPCIONCOT.addItem(" ");
           
    }
  void mostrarDescripcion(){
try{
 Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/idyfact", "root", "");
 Statement st =con.createStatement();
 ResultSet rs = st.executeQuery("SELECT * FROM servicio");
 while(rs.next()){
  this.DESCRIPCIONCOT.addItem(rs.getString("detalle_servicio"));
 }
 
 }catch(SQLException ex){
   Logger.getLogger(factura.class.getName()).log(Level.SEVERE,null,ex);  
}  
}
   void mostrarCliente(){
try{
 Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/idyfact", "root", "");
 Statement st =con.createStatement();
 ResultSet rs = st.executeQuery("SELECT * FROM cliente");
 while(rs.next()){
  this.Clientecot.addItem(rs.getString("nombrec"));
 }
 
 }catch(SQLException ex){
   Logger.getLogger(factura.class.getName()).log(Level.SEVERE,null,ex);  
}  
}
   
 void Descrip(){
try{
 Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/idyfact", "root","");
 Statement st =con.createStatement();
 ResultSet rs = st.executeQuery("SELECT * FROM servicio where detalle_servicio='"+ this.DESCRIPCIONCOT.getSelectedItem()+"'");
 rs.next();
 this.NoServ.setText(rs.getString("idservicio"));
 this.Cantidad.setText(rs.getString("cantidad"));
 this.PRECIOCOT.setText(rs.getString("Precio_uni"));
 this.IMPORTE.setText(rs.getString("Importe"));
 
 }catch(SQLException ex){
   Logger.getLogger(factura.class.getName()).log(Level.SEVERE,null,ex);  
}
   
}
 
 void cliente(){
    try{
 Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/idyfact", "root","");
 Statement st =con.createStatement();
 ResultSet rs = st.executeQuery("SELECT * FROM cliente where nombrec='"+ this.Clientecot.getSelectedItem()+"'");
 rs.next();
 this.NoCli.setText(rs.getString("id_cli"));
  this.EMAILCOT.setText(rs.getString("correoc"));
  this.DIRECCIONCOT.setText(rs.getString("direccionc"));
  this.TELEFONOCOT.setText(rs.getString("telefono"));
  }catch(SQLException ex){
   Logger.getLogger(factura.class.getName()).log(Level.SEVERE,null,ex);  
} 
     
 }
 
 void limpiar(){
     Cantidad.setText("");
     EMAILCOT.setText("");
     DIRECCIONCOT.setText("");
     IMPORTE.setText("");
     CELULARCOT.setText("");
     NoServ.setText("");
     CIUDADCOT.setText("");
     ESTADOCOT.setText("");
     NoCli.setText("");
     IVACOT.setText("");
     TOTALCOT.setText("");
     TELEFONOCOT.setText("");
     PRECIOCOT.setText("");
     DESCRIPCIONCOT.removeAllItems();
     Clientecot.removeAllItems();
       
 }
 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        EMAILCOT = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        IVACOT = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        TOTALCOT = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        NOCOT = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TELEFONOCOT = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        CELULARCOT = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        PRECIOCOT = new javax.swing.JTextField();
        CANCELARCOT = new javax.swing.JButton();
        ACEPTARCOT = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        Cantidad = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        IMPORTE = new javax.swing.JTextField();
        Calcular = new javax.swing.JToggleButton();
        FECHACOT = new com.toedter.calendar.JDateChooser();
        CIUDADCOT = new javax.swing.JTextField();
        ESTADOCOT = new javax.swing.JTextField();
        DESCRIPCIONCOT = new javax.swing.JComboBox<>();
        Clientecot = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        DIRECCIONCOT = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        NoCli = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        NoServ = new javax.swing.JTextField();
        BuscarCli = new javax.swing.JButton();
        BuscarServ = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Dirección: ");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Ciudad: ");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Estado: ");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("E-mail: ");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("Teléfono:");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel19.setText("IVA 16%");

        IVACOT.setEditable(false);

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel20.setText("TOTAL: ");

        TOTALCOT.setEditable(false);
        TOTALCOT.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("COTIZACIÓN ");

        jLabel2.setText("No.");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("FECHA DE ELABORACIÓN ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Tec. Jacinto Mena Chi ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("R.F.C. ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("MEPJ7005097I6 ");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("Celular:");

        CELULARCOT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CELULARCOTKeyTyped(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Detalles de la cotización: ");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setText("Descripción:");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setText("Precio unitario: ");

        CANCELARCOT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CANCELARCOT.setText("CANCELAR ");
        CANCELARCOT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CANCELARCOTActionPerformed(evt);
            }
        });

        ACEPTARCOT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ACEPTARCOT.setText("ACEPTAR ");
        ACEPTARCOT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ACEPTARCOTActionPerformed(evt);
            }
        });

        jLabel17.setText("Cantidad");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel18.setText("Importe");

        IMPORTE.setEditable(false);

        Calcular.setText("Calcular");
        Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularActionPerformed(evt);
            }
        });

        FECHACOT.setDateFormatString("yyyy-MM-dd");
        FECHACOT.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);

        CIUDADCOT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CIUDADCOTKeyTyped(evt);
            }
        });

        ESTADOCOT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ESTADOCOTKeyTyped(evt);
            }
        });

        DESCRIPCIONCOT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        Clientecot.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setText("Cliente");

        jLabel21.setText("No.");

        jLabel22.setText("No.");

        BuscarCli.setText("Buscar");
        BuscarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarCliActionPerformed(evt);
            }
        });

        BuscarServ.setText("Buscar");
        BuscarServ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarServActionPerformed(evt);
            }
        });

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Emcabezado magnecom.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EMAILCOT, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel11)
                        .addGap(210, 210, 210)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CANCELARCOT)
                        .addGap(101, 101, 101)
                        .addComponent(ACEPTARCOT))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NoCli, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Clientecot, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BuscarCli))
                            .addComponent(jLabel13)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(4, 4, 4)
                                                .addComponent(jLabel22)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(NoServ, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel15)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(DESCRIPCIONCOT, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(27, 27, 27)
                                                        .addComponent(jLabel16)
                                                        .addGap(22, 22, 22)
                                                        .addComponent(PRECIOCOT, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(26, 26, 26)
                                                        .addComponent(jLabel18)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(IMPORTE, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(Calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, Short.MAX_VALUE))))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel17)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jLabel19)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(IVACOT, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(22, 22, 22)
                                                .addComponent(BuscarServ))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(332, 332, 332)
                                        .addComponent(TELEFONOCOT, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(85, 85, 85)
                                        .addComponent(CELULARCOT, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CIUDADCOT, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(276, 276, 276))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(DIRECCIONCOT, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ESTADOCOT, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(996, 996, 996)
                                    .addComponent(jLabel20)
                                    .addGap(16, 16, 16)
                                    .addComponent(TOTALCOT, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 688, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FECHACOT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(NOCOT, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(NOCOT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(FECHACOT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)))
                .addComponent(jLabel4)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(Clientecot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(NoCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BuscarCli))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(EMAILCOT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(TELEFONOCOT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(CELULARCOT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(CIUDADCOT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(DIRECCIONCOT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(ESTADOCOT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(IVACOT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(DESCRIPCIONCOT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22)
                            .addComponent(NoServ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BuscarServ))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel18)
                                .addComponent(IMPORTE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Calcular))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel17)
                                .addComponent(Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel16)
                                .addComponent(PRECIOCOT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(TOTALCOT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ACEPTARCOT)
                    .addComponent(CANCELARCOT))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CANCELARCOTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CANCELARCOTActionPerformed
        // TODO add your handling code here:
      this.dispose();

    }//GEN-LAST:event_CANCELARCOTActionPerformed

    private void ACEPTARCOTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ACEPTARCOTActionPerformed
     SqlUsuarios modSql = new SqlUsuarios();
        if(CELULARCOT.getText().length()>0 && CIUDADCOT.getText().length()>0 && ESTADOCOT.getText().length()>0 && FECHACOT.getDateFormatString().length()>0){
          
          if(NoServ.getText().length()>0 && Cantidad.getText().length()>0 && PRECIOCOT.getText().length()>0 && IMPORTE.getText().length()>0){
              
                   if(NoCli.getText().length()>0 && EMAILCOT.getText().length()>0 && TELEFONOCOT.getText().length()>0 && DIRECCIONCOT.getText().length()>0){ 
                         
                       if(TOTALCOT.getText().length()>0  && IVACOT.getText().length()>0 ){ 
                        if (modSql.esTelefono(CELULARCOT.getText())) {  
              try {
                  PreparedStatement ps;
           String f2;
    Date fecha = FECHACOT.getDate();
       SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
       f2 = sdf.format(fecha);
            ps = cn.prepareStatement ("INSERT INTO cotizacion(celular,id_servicio,ciudad,estado,fecha,id_cliente,iva, precio_total) VALUES(?,?,?,?,?,?,?,?)");
            ps.setString(1, CELULARCOT.getText());
            ps.setString(2, NoServ.getText());
            ps.setString(3, CIUDADCOT.getText());
            ps.setString(4, ESTADOCOT.getText());
            ps.setString(5, f2);
            ps.setString(6, NoCli.getText());
            ps.setString(7, IVACOT.getText());
            ps.setString(8, TOTALCOT.getText());
           int res;
           res = ps.executeUpdate();
           if(res > 0){
               JOptionPane.showMessageDialog(rootPane, "Cotizacion exitosa");
               limpiar();
           }else{
               JOptionPane.showMessageDialog(rootPane, "Error");
               limpiar();
           }
            
        } catch (SQLException ex) {
            Logger.getLogger(LoginRegistrar.class.getName()).log(Level.SEVERE, null, ex);
        }  // TODO add your handling code here:
                        
                       }else {
           JOptionPane.showMessageDialog(null, "El telefono es incorrecto debe de contar con 10 digitos "); 
                } 
              
            
                         }else{
                                JOptionPane.showMessageDialog(rootPane, "Porfavor calcule el total");        
                            }   
              
                    }else{
                         JOptionPane.showMessageDialog(rootPane, "Elija Un Cliente");        
                     }
           
             }else{
                 JOptionPane.showMessageDialog(rootPane, "Elija Un Servicio");        
             }
    
      }else{
            JOptionPane.showMessageDialog(rootPane, "No debes dejar campos vacios !!");        
        }
        
      
        
    }//GEN-LAST:event_ACEPTARCOTActionPerformed

    @SuppressWarnings("empty-statement")
    private void CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularActionPerformed
        // TODO add your handling code here:
        double cant;
        double unita,total1;;
        cant= Integer.parseInt(Cantidad.getText());
        unita= Integer.parseInt(PRECIOCOT.getText());   
        total1=cant * unita;
        IMPORTE.setText(String.valueOf(total1));
        
        double IVa,IMPORT = total1;              
        IVa = IMPORT*16/100;
        IVACOT.setText(String.valueOf(IVa));
        
        double impor,iva,total2;
        iva = IVa;
        impor= total1;  
        total2=impor+iva;
        TOTALCOT.setText(String.valueOf(total2));
        
    }//GEN-LAST:event_CalcularActionPerformed

    private void BuscarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarCliActionPerformed
        // TODO add your handling code here:
        cliente();
    }//GEN-LAST:event_BuscarCliActionPerformed

    private void BuscarServActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarServActionPerformed
        // TODO add your handling code here:
        Descrip();
    }//GEN-LAST:event_BuscarServActionPerformed

    private void CELULARCOTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CELULARCOTKeyTyped
        // TODO add your handling code here:
        char n = evt.getKeyChar();
        if(n<'0'||n>'9') evt.consume();
    }//GEN-LAST:event_CELULARCOTKeyTyped

    private void CIUDADCOTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CIUDADCOTKeyTyped
        // TODO add your handling code here:
         char t = evt.getKeyChar();

        if(t<'a'||t>'z') evt.consume();
    }//GEN-LAST:event_CIUDADCOTKeyTyped

    private void ESTADOCOTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ESTADOCOTKeyTyped
        // TODO add your handling code here:
         char t = evt.getKeyChar();

        if(t<'a'||t>'z') evt.consume();
    }//GEN-LAST:event_ESTADOCOTKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ACEPTARCOT;
    private javax.swing.JButton BuscarCli;
    private javax.swing.JButton BuscarServ;
    private javax.swing.JButton CANCELARCOT;
    private javax.swing.JTextField CELULARCOT;
    private javax.swing.JTextField CIUDADCOT;
    private javax.swing.JToggleButton Calcular;
    private javax.swing.JTextField Cantidad;
    private javax.swing.JComboBox<String> Clientecot;
    private javax.swing.JComboBox<String> DESCRIPCIONCOT;
    private javax.swing.JTextField DIRECCIONCOT;
    private javax.swing.JTextField EMAILCOT;
    private javax.swing.JTextField ESTADOCOT;
    private com.toedter.calendar.JDateChooser FECHACOT;
    private javax.swing.JTextField IMPORTE;
    private javax.swing.JTextField IVACOT;
    private javax.swing.JTextField NOCOT;
    private javax.swing.JTextField NoCli;
    private javax.swing.JTextField NoServ;
    private javax.swing.JTextField PRECIOCOT;
    private javax.swing.JTextField TELEFONOCOT;
    private javax.swing.JTextField TOTALCOT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables

    private String convertTostring(Date date) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
