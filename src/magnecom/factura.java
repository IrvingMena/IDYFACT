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
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author mena4
 */
public final class factura extends javax.swing.JInternalFrame {

    private static final long serialVersionUID = 1L;
 

 
    public factura(){
        initComponents();
        this.setLocation(0, 0);
        Descrip.removeAllItems();
        NOMBREFAC.removeAllItems();
        //METODOFAC.removeAllItems();
        //CLAVEFAC.removeAllItems();
        //CFDIFAC.removeAllItems();
         combobox();
           bloquear_cajas();
           mostrarDescripcion();
           mostrarCliente();
         //  MetodoDePago();
          // Clavedeunidad();
          // CDFI();
           
    }
    
    public void  bloquear_cajas()
    {
       IMPORTE.setEnabled(false);
       IVAFAC.setEnabled(false);
       TOTALFAC.setEnabled(false);
       FOLIOFAC.setEnabled(false); 
       NoCliente.setEnabled(false);
       Nosev.setEnabled(false);
        CANTIDADFAC.setEnabled(false);  
        PRECIOFAC.setEnabled(false);
    }
    void limpiar(){
     CANTIDADFAC.setText("");
     RFCFAC.setText("");
     IMPORTE.setText("");
     PRECIOFAC.setText("");
     IVAFAC.setText("");
     TOTALFAC.setText("");
     CLave.setText("");
     CPFAC.setText("");
     Nosev.setText("");
     NoCliente.setText("");
     CLAVEFAC.removeAllItems();
     NOMBREFAC.removeAllItems();
     METODOFAC.removeAllItems();
     PAGOFAC.removeAllItems();
     CFDIFAC.removeAllItems();
     Descrip.removeAllItems();
       
 }
    public void  combobox()
    {
      Descrip.addItem(" ");
      NOMBREFAC.addItem(" ");
           
    }
    
    
   void mostrarDescripcion(){
try{
 Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/idyfact", "root", "");
 Statement st =con.createStatement();
 ResultSet rs = st.executeQuery("SELECT * FROM servicio");
 while(rs.next()){
  this.Descrip.addItem(rs.getString("detalle_servicio"));
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
  this.NOMBREFAC.addItem(rs.getString("nombrec"));
 }
 
 }catch(SQLException ex){
   Logger.getLogger(factura.class.getName()).log(Level.SEVERE,null,ex);  
}  
}
   
 void Descrip(){
try{
 Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/idyfact", "root","");
 Statement st =con.createStatement();
 ResultSet rs = st.executeQuery("SELECT * FROM servicio where detalle_servicio='"+this.Descrip.getSelectedItem()+"'");
 rs.next();
 this.Nosev.setText(rs.getString("idservicio"));
 this.CANTIDADFAC.setText(rs.getString("cantidad"));
 this.PRECIOFAC.setText(rs.getString("Precio_uni"));
 this.IMPORTE.setText(rs.getString("Importe"));
 }catch(SQLException ex){
   Logger.getLogger(factura.class.getName()).log(Level.SEVERE,null,ex);  
}
   
}
 
 void cliente(){
    try{
 Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/idyfact", "root","");
 Statement st =con.createStatement();
 ResultSet rs = st.executeQuery("SELECT * FROM cliente where nombrec='"+ this.NOMBREFAC.getSelectedItem()+"'");
 rs.next();
 this.NoCliente.setText(rs.getString("id_cli"));
  this.APELLIDOFAC.setText(rs.getString("apellidoc"));
  this.DIRECFAC.setText(rs.getString("direccionc"));
  this.RFCFAC.setText(rs.getString("rfcc"));
  }catch(SQLException ex){
   Logger.getLogger(factura.class.getName()).log(Level.SEVERE,null,ex);  
} 
     
 }

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        PAGOFAC = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        METODOFAC = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        CFDIFAC = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        IVAFAC = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        CLAVEFAC = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        CANCELARFAC = new javax.swing.JButton();
        ACEPTARFAC = new javax.swing.JButton();
        CANTIDADFAC = new javax.swing.JTextField();
        TOTALFAC = new javax.swing.JTextField();
        PRECIOFAC = new javax.swing.JTextField();
        APELLIDOFAC = new javax.swing.JTextField();
        CPFAC = new javax.swing.JTextField();
        DIRECFAC = new javax.swing.JTextField();
        Nosev = new javax.swing.JTextField();
        FOLIOFAC = new javax.swing.JTextField();
        FECHAFAC = new com.toedter.calendar.JDateChooser();
        jLabel26 = new javax.swing.JLabel();
        IMPORTE = new javax.swing.JTextField();
        Calcular = new javax.swing.JToggleButton();
        Descrip = new javax.swing.JComboBox<>();
        NOMBREFAC = new javax.swing.JComboBox<>();
        jLabel27 = new javax.swing.JLabel();
        NoCliente = new javax.swing.JTextField();
        CLave = new javax.swing.JTextField();
        RFCFAC = new javax.swing.JTextField();
        BusqCli = new javax.swing.JButton();
        BusqDescrip = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Facturación");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Nombre del cliente: ");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel20.setText("Forma de pago:");

        PAGOFAC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01 efectivo", "02 cheque nominativo", "03 transferencia electrónica de fondos", "04 tarjeta de crédito", "05 monedero electrónico", "06 dinero electrónico", "08 vales de despensa", "12 dación en pago", "13 pago por subrogación", "14 pago por consignación", "15 condonación", "17 compensación", "23 novación", "24 confusión", "25 remisión de deuda", "26 prescripción o caducidad", "27 a satisfacción del acreedor", "28 tarjeta de débito", "29 tarjeta de servicios", "30 aplicación de anticipos", "31 intermediario pagos", "99 por definir" }));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Apellido:");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel21.setText("Método de pago:");

        METODOFAC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "(PUE) Pago en una sola exhibicion", "(PPD) Pago en parcialidades o diferido" }));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Dirección: ");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel22.setText("Uso de CFDI:");

        CFDIFAC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "G01 Adquisicion de mercancias", "G02 Devoluciones", "descuentos o bonificaciones", "G03 Gastos en general", "I01 Construcciones", "I02 Mobilario y equipo de oficina por inversiones", "I03 Equipo de transporte", "I04 Equipo de cómputo y accesorios", "I05 Dados. troqueles", "moldes", "matrices y herramental", "I06 Comunicaciones telefónicas", "I07 Comunicaciones satelitales", "I08 Otra maquinaria y equipo", "D01 Honorarios médicos dentales y gastos hospitalarios", "D02 Gastos médicos por incapacidad o discapacidad", "D03 Gastos funerales", "D04 Donativos", "D05 Intereses reales efectivamente pagados por créditos hipotecarios (casa habitación)", "D06 Aportaciones voluntarias al SAR", "D07 Primas por seguros de gastos médicos", "D08 Gastos de transportación escolar obligatoria", "D09 Depósitos en cuentas para el ahorro primas que tengan como base planes de pensiones", "D10 Pagos por servicios", "educativos (colegiaturas)", "P01 Por definir" }));
        CFDIFAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CFDIFACActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("C.P: ");
        jLabel11.setToolTipText("");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel23.setText("Precio untario: ");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Código de servicio:  ");

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel24.setText("IVA 16%: ");

        IVAFAC.setEditable(false);
        IVAFAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IVAFACActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Cantidad: ");

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel25.setText("Total: ");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("Clave unidad: ");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("FACTURACIÓN ");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("R.F.C.:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Folio: ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("JACINTO MENA PUC");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setText("DATOS DEL CLIENTE ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("R.F.C.MEPJ7005097I6");
        jLabel4.setToolTipText("");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setText("DATOS DEL SERVICIO");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel5.setText("9811179163");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setText("Clave servicio: ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel6.setText("144938 ");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Fecha:");

        CLAVEFAC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Unidad de servicio (E48)" }));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel19.setText("Descripción: ");

        CANCELARFAC.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CANCELARFAC.setText("CANCELAR ");
        CANCELARFAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CANCELARFACActionPerformed(evt);
            }
        });

        ACEPTARFAC.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ACEPTARFAC.setText("ACEPTAR ");
        ACEPTARFAC.setToolTipText("");
        ACEPTARFAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ACEPTARFACActionPerformed(evt);
            }
        });

        CANTIDADFAC.setEditable(false);
        CANTIDADFAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CANTIDADFACActionPerformed(evt);
            }
        });
        CANTIDADFAC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CANTIDADFACKeyReleased(evt);
            }
        });

        TOTALFAC.setEditable(false);
        TOTALFAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TOTALFACActionPerformed(evt);
            }
        });

        PRECIOFAC.setEditable(false);
        PRECIOFAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PRECIOFACActionPerformed(evt);
            }
        });

        APELLIDOFAC.setEditable(false);
        APELLIDOFAC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                APELLIDOFACKeyTyped(evt);
            }
        });

        CPFAC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CPFACKeyTyped(evt);
            }
        });

        DIRECFAC.setEditable(false);
        DIRECFAC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                DIRECFACKeyTyped(evt);
            }
        });

        FOLIOFAC.setEditable(false);
        FOLIOFAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FOLIOFACActionPerformed(evt);
            }
        });

        FECHAFAC.setDateFormatString("yyyy/mm/dd");

        jLabel26.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel26.setText("Importe");

        IMPORTE.setEditable(false);
        IMPORTE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IMPORTEActionPerformed(evt);
            }
        });

        Calcular.setText("Calcular");
        Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularActionPerformed(evt);
            }
        });

        Descrip.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        NOMBREFAC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel27.setText("NO.");

        CLave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLaveActionPerformed(evt);
            }
        });
        CLave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CLaveKeyTyped(evt);
            }
        });

        RFCFAC.setEditable(false);

        BusqCli.setText("Buscar cliente");
        BusqCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BusqCliActionPerformed(evt);
            }
        });

        BusqDescrip.setText("Buscar cliente");
        BusqDescrip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BusqDescripActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FECHAFAC, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FOLIOFAC, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(20, 20, 20))
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(16, 16, 16))))
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Descrip, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BusqDescrip, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Nosev, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel20)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(PAGOFAC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel22)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CFDIFAC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel18)
                                        .addGap(18, 18, 18)
                                        .addComponent(CLave, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CLAVEFAC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel21)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(METODOFAC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(jLabel11)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CPFAC, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(160, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(IMPORTE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CANTIDADFAC, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(PRECIOFAC, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(Calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CANCELARFAC)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(177, 177, 177)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ACEPTARFAC)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel24)
                                            .addGap(18, 18, 18)
                                            .addComponent(IVAFAC))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel25)
                                            .addGap(39, 39, 39)
                                            .addComponent(TOTALFAC, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(65, 65, 65))))
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RFCFAC, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(APELLIDOFAC, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DIRECFAC, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel17)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(NoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(NOMBREFAC, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BusqCli, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel16)
                        .addComponent(jLabel27)
                        .addComponent(NoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(FOLIOFAC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(FECHAFAC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(NOMBREFAC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BusqCli))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(RFCFAC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(APELLIDOFAC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(DIRECFAC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel17)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(CLAVEFAC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(METODOFAC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(CPFAC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(CLave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(PAGOFAC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(CFDIFAC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(Nosev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(Descrip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BusqDescrip))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(IMPORTE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel13)
                                .addComponent(CANTIDADFAC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel23)
                                .addComponent(PRECIOFAC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addComponent(Calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(IVAFAC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(TOTALFAC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CANCELARFAC)
                            .addComponent(ACEPTARFAC))))
                .addGap(89, 89, 89))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IVAFACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IVAFACActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IVAFACActionPerformed

    private void ACEPTARFACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ACEPTARFACActionPerformed
      if(NoCliente.getText().length()>0 && RFCFAC.getText().length()>0 && DIRECFAC.getText().length()>0 && FECHAFAC.getDateFormatString().length()>0){
          
          if(Nosev.getText().length()>0 && CANTIDADFAC.getText().length()>0 && PRECIOFAC.getText().length()>0 && IMPORTE.getText().length()>0){
              
                   if(CLave.getText().length()>0 && CPFAC.getText().length()>0){ 
                         
                       if(TOTALFAC.getText().length()>0  && IVAFAC.getText().length()>0 ){ 
                           
              try {
                  
                  ResultSet rs;
                  PreparedStatement ps;
            Db con = new Db();
 Connection cn = con.connect();
         String f2;
    Date fecha = FECHAFAC.getDate();
       SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
       f2 = sdf.format(fecha);
            
            ps = cn.prepareStatement ("INSERT INTO factura(metodo_de_pago, usocfdi, clave_de_unidad, c_p, id_servicio, idcliente, iva, precio_total, formadepago, fecha) VALUES(?,?,?,?,?,?,?,?,?,?)");
           ps.setString(1, METODOFAC.getSelectedItem().toString());
           ps.setString(2, CFDIFAC.getSelectedItem().toString());
           ps.setString(3, CLAVEFAC.getSelectedItem().toString());
            ps.setString(4, CPFAC.getText());  
            ps.setString(5, Nosev.getText());
            ps.setString(6, NoCliente.getText());
            ps.setString(7, IVAFAC.getText());
            ps.setString(8, TOTALFAC.getText()); 
             ps.setString(9, PAGOFAC.getSelectedItem().toString());
             ps.setString(10, f2);
            int res;
           res = ps.executeUpdate();
           if(res > 0){
               JOptionPane.showMessageDialog(rootPane, "Factura exitosa");
               limpiar();
           }else{
               JOptionPane.showMessageDialog(rootPane, "Error");
               limpiar();
           }
            
        }catch (SQLException ex) {
            Logger.getLogger(LoginRegistrar.class.getName()).log(Level.SEVERE, null, ex);
        }      
                            }else{
                                JOptionPane.showMessageDialog(rootPane, "Porfavor calcule el total");        
                            }   
              
                    }else{
                         JOptionPane.showMessageDialog(rootPane, "No debes dejar campos vacios !!");        
                     }
           
             }else{
                 JOptionPane.showMessageDialog(rootPane, "Elija Un Servicio");        
             }
    
      }else{
            JOptionPane.showMessageDialog(rootPane, "Elija Un Cliente");        
        }
        
    
    }//GEN-LAST:event_ACEPTARFACActionPerformed

    private void CANTIDADFACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CANTIDADFACActionPerformed
         // TODO add your handling code here:
      
    }//GEN-LAST:event_CANTIDADFACActionPerformed

    private void CANTIDADFACKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CANTIDADFACKeyReleased
        
                
    }//GEN-LAST:event_CANTIDADFACKeyReleased

    private void TOTALFACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TOTALFACActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TOTALFACActionPerformed

    private void FOLIOFACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FOLIOFACActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FOLIOFACActionPerformed

    private void PRECIOFACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PRECIOFACActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PRECIOFACActionPerformed

    private void IMPORTEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IMPORTEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IMPORTEActionPerformed

    @SuppressWarnings("empty-statement")
    private void CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularActionPerformed
        // TODO add your handling code here:
        double cant= 0;
        double unita,total1;;
        cant= Integer.parseInt(CANTIDADFAC.getText());
        unita= Integer.parseInt(PRECIOFAC.getText());   
        total1=cant * unita;
        IMPORTE.setText(String.valueOf(total1));
        
        double IVa,IMPORT = total1;              
        IVa = IMPORT*16/100;
        IVAFAC.setText(String.valueOf(IVa));
        
        double impor,iva,total2;
        
        iva = IVa;
        impor= total1;  
        total2=impor+iva;
        TOTALFAC.setText(String.valueOf(total2));
    }//GEN-LAST:event_CalcularActionPerformed

    private void CANCELARFACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CANCELARFACActionPerformed
this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_CANCELARFACActionPerformed

    private void BusqCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BusqCliActionPerformed
       cliente();
    }//GEN-LAST:event_BusqCliActionPerformed

    private void BusqDescripActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BusqDescripActionPerformed
        // TODO add your handling code here:
        Descrip();
    }//GEN-LAST:event_BusqDescripActionPerformed

    private void CFDIFACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CFDIFACActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_CFDIFACActionPerformed

    private void APELLIDOFACKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_APELLIDOFACKeyTyped
        // TODO add your handling code here:
         char t = evt.getKeyChar();

        if(t<'a'||t>'z') evt.consume();
    }//GEN-LAST:event_APELLIDOFACKeyTyped

    private void DIRECFACKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DIRECFACKeyTyped
        // TODO add your handling code here:
         char t = evt.getKeyChar();

        if((t<'a'||t>'z')&(t<'0'||t>'9')) evt.consume();
    }//GEN-LAST:event_DIRECFACKeyTyped

    private void CLaveKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CLaveKeyTyped
        // TODO add your handling code here:
        char n = evt.getKeyChar();
        if(n<'0'||n>'9') evt.consume();
    }//GEN-LAST:event_CLaveKeyTyped

    private void CPFACKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CPFACKeyTyped
        // TODO add your handling code here:
        char n = evt.getKeyChar();
        if(n<'0'||n>'9') evt.consume();
    }//GEN-LAST:event_CPFACKeyTyped

    private void CLaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CLaveActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ACEPTARFAC;
    private javax.swing.JTextField APELLIDOFAC;
    private javax.swing.JButton BusqCli;
    private javax.swing.JButton BusqDescrip;
    private javax.swing.JButton CANCELARFAC;
    private javax.swing.JTextField CANTIDADFAC;
    private javax.swing.JComboBox<String> CFDIFAC;
    private javax.swing.JComboBox<String> CLAVEFAC;
    private javax.swing.JTextField CLave;
    private javax.swing.JTextField CPFAC;
    private javax.swing.JToggleButton Calcular;
    private javax.swing.JTextField DIRECFAC;
    private javax.swing.JComboBox<String> Descrip;
    private com.toedter.calendar.JDateChooser FECHAFAC;
    private javax.swing.JTextField FOLIOFAC;
    private javax.swing.JTextField IMPORTE;
    private javax.swing.JTextField IVAFAC;
    private javax.swing.JComboBox<String> METODOFAC;
    private javax.swing.JComboBox<String> NOMBREFAC;
    private javax.swing.JTextField NoCliente;
    private javax.swing.JTextField Nosev;
    private javax.swing.JComboBox<String> PAGOFAC;
    private javax.swing.JTextField PRECIOFAC;
    private javax.swing.JTextField RFCFAC;
    private javax.swing.JTextField TOTALFAC;
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
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables



}
