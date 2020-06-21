package com.era.views;


public abstract class SalidaEntradaJFrame extends BaseJFrame {
    
        
    public SalidaEntradaJFrame(final String idTextTitleWindow) {
        
        super(idTextTitleWindow);
        
        initComponents();
        
        postInitComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPartidas = new com.era.views.tables.IngresTable();
        jBtnAceptar = new javax.swing.JButton();
        jBtnSalir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtFolioDocumento = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cmbAlmacen = new com.era.views.comboboxes.WarehousesCombobox();
        jLabel6 = new javax.swing.JLabel();
        jTxtDescripAlmacen = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtConcepto = new javax.swing.JTextField();
        jBtnConcepto = new javax.swing.JButton();
        jTxtConcepDescrip = new javax.swing.JTextField();
        pnlPartida = new javax.swing.JPanel();
        txtCantidad = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtProducto = new javax.swing.JTextField();
        jBtnBusProducto = new javax.swing.JButton();
        txtDescripcionProducto = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        cmbUnidad = new com.era.views.comboboxes.UnidsCombobox();
        txtExistencias = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtActivo = new javax.swing.JTextField();
        jBtnActivo = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        ftxCosto = new javax.swing.JFormattedTextField();
        lblLote = new javax.swing.JLabel();
        txtLote = new javax.swing.JTextField();
        lblCaducidad = new javax.swing.JLabel();
        txtPedimento = new javax.swing.JTextField();
        lblPedimento = new javax.swing.JLabel();
        caducityjCalendar = new com.toedter.calendar.JCalendar();
        btnBorrar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        inoutLabel = new java.awt.Label();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        tblPartidas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblPartidas.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        tblPartidas.setNextFocusableComponent(jBtnAceptar);
        tblPartidas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tblPartidas);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 410, 650, 90);

        jBtnAceptar.setBackground(new java.awt.Color(255, 255, 255));
        jBtnAceptar.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBtnAceptar.setForeground(new java.awt.Color(0, 102, 0));
        jBtnAceptar.setText("Guardar");
        jBtnAceptar.setNextFocusableComponent(jBtnSalir);
        jPanel1.add(jBtnAceptar);
        jBtnAceptar.setBounds(490, 500, 85, 30);

        jBtnSalir.setBackground(new java.awt.Color(255, 255, 255));
        jBtnSalir.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBtnSalir.setForeground(new java.awt.Color(0, 102, 0));
        jBtnSalir.setLabel("Salir");
        jBtnSalir.setNextFocusableComponent(txtConcepto);
        jPanel1.add(jBtnSalir);
        jBtnSalir.setBounds(580, 500, 90, 30);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Encabezado"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtFolioDocumento.setNextFocusableComponent(cmbAlmacen);
        jPanel2.add(txtFolioDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 147, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Folio Documento:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 113, 20));

        cmbAlmacen.setNextFocusableComponent(jTxtDescripAlmacen);
        jPanel2.add(cmbAlmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 90, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Almacén:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, -1, -1));

        jTxtDescripAlmacen.setEditable(false);
        jTxtDescripAlmacen.setEnabled(false);
        jTxtDescripAlmacen.setNextFocusableComponent(txtProducto);
        jPanel2.add(jTxtDescripAlmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, 122, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("*Concepto:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        txtConcepto.setNextFocusableComponent(jBtnConcepto);
        jPanel2.add(txtConcepto, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 121, -1));

        jBtnConcepto.setBackground(new java.awt.Color(255, 255, 255));
        jBtnConcepto.setText("...");
        jBtnConcepto.setNextFocusableComponent(jTxtConcepDescrip);
        jPanel2.add(jBtnConcepto, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 30, 20));

        jTxtConcepDescrip.setEditable(false);
        jTxtConcepDescrip.setEnabled(false);
        jTxtConcepDescrip.setNextFocusableComponent(txtFolioDocumento);
        jPanel2.add(jTxtConcepDescrip, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 203, -1));

        jPanel1.add(jPanel2);
        jPanel2.setBounds(20, 40, 650, 90);

        pnlPartida.setBackground(new java.awt.Color(255, 255, 255));
        pnlPartida.setBorder(javax.swing.BorderFactory.createTitledBorder("Partida"));
        pnlPartida.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCantidad.setText("0");
        txtCantidad.setNextFocusableComponent(ftxCosto);
        pnlPartida.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 40, 90, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("*Cantidad:");
        pnlPartida.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 41, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("*Cod. Producto:");
        pnlPartida.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 21, -1, -1));

        txtProducto.setBackground(new java.awt.Color(255, 255, 153));
        txtProducto.setNextFocusableComponent(jBtnBusProducto);
        pnlPartida.add(txtProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 41, 150, -1));

        jBtnBusProducto.setBackground(new java.awt.Color(255, 255, 255));
        jBtnBusProducto.setText("...");
        jBtnBusProducto.setNextFocusableComponent(txtDescripcionProducto);
        pnlPartida.add(jBtnBusProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 41, 30, 20));

        txtDescripcionProducto.setEditable(false);
        txtDescripcionProducto.setEnabled(false);
        txtDescripcionProducto.setNextFocusableComponent(txtCantidad);
        pnlPartida.add(txtDescripcionProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 41, 260, -1));

        jLabel11.setText("Existencias generales");
        pnlPartida.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 69, 170, -1));

        jLabel17.setText("Unidad:");
        pnlPartida.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 94, -1, -1));

        cmbUnidad.setNextFocusableComponent(txtLote);
        pnlPartida.add(cmbUnidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 91, 157, -1));

        txtExistencias.setEditable(false);
        txtExistencias.setEnabled(false);
        txtExistencias.setNextFocusableComponent(cmbUnidad);
        pnlPartida.add(txtExistencias, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 66, 90, -1));

        jLabel5.setText("Activo:");
        pnlPartida.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 118, -1, -1));

        txtActivo.setEditable(false);
        txtActivo.setEnabled(false);
        pnlPartida.add(txtActivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 115, 133, -1));

        jBtnActivo.setBackground(new java.awt.Color(255, 255, 255));
        jBtnActivo.setText("...");
        pnlPartida.add(jBtnActivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 114, 24, -1));

        jLabel14.setText("Costo:");
        pnlPartida.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 64, -1, 20));

        ftxCosto.setNextFocusableComponent(txtExistencias);
        pnlPartida.add(ftxCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 90, -1));

        lblLote.setText("Lote:");
        pnlPartida.add(lblLote, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 66, 90, -1));

        txtLote.setToolTipText("Lote");
        txtLote.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        txtLote.setNextFocusableComponent(txtPedimento);
        pnlPartida.add(txtLote, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 90, 20));

        lblCaducidad.setText("Fecha caducidad:");
        pnlPartida.add(lblCaducidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 190, 20));

        txtPedimento.setToolTipText("Pedimento");
        txtPedimento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        txtPedimento.setNextFocusableComponent(caducityjCalendar);
        pnlPartida.add(txtPedimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 100, 20));

        lblPedimento.setText("Pedimento:");
        pnlPartida.add(lblPedimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(379, 66, 90, -1));

        caducityjCalendar.setNextFocusableComponent(btnAgregar);
        pnlPartida.add(caducityjCalendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 124, -1, 132));

        jPanel1.add(pnlPartida);
        pnlPartida.setBounds(20, 130, 650, 260);

        btnBorrar.setBackground(new java.awt.Color(255, 255, 255));
        btnBorrar.setText("Borrar");
        btnBorrar.setName(""); // NOI18N
        btnBorrar.setNextFocusableComponent(tblPartidas);
        jPanel1.add(btnBorrar);
        btnBorrar.setBounds(100, 390, 80, 20);

        btnAgregar.setBackground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("Agregar");
        btnAgregar.setNextFocusableComponent(btnBorrar);
        jPanel1.add(btnAgregar);
        btnAgregar.setBounds(20, 390, 80, 20);

        inoutLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        inoutLabel.setText("Entrada/Salida");
        jPanel1.add(inoutLabel);
        inoutLabel.setBounds(30, 10, 630, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 687, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    

                                    
        
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton btnAgregar;
    protected javax.swing.JButton btnBorrar;
    protected com.toedter.calendar.JCalendar caducityjCalendar;
    protected com.era.views.comboboxes.WarehousesCombobox cmbAlmacen;
    protected com.era.views.comboboxes.UnidsCombobox cmbUnidad;
    protected javax.swing.JFormattedTextField ftxCosto;
    protected java.awt.Label inoutLabel;
    protected javax.swing.JButton jBtnAceptar;
    protected javax.swing.JButton jBtnActivo;
    protected javax.swing.JButton jBtnBusProducto;
    protected javax.swing.JButton jBtnConcepto;
    protected javax.swing.JButton jBtnSalir;
    protected javax.swing.JLabel jLabel10;
    protected javax.swing.JLabel jLabel11;
    protected javax.swing.JLabel jLabel14;
    protected javax.swing.JLabel jLabel17;
    protected javax.swing.JLabel jLabel5;
    protected javax.swing.JLabel jLabel6;
    protected javax.swing.JLabel jLabel7;
    protected javax.swing.JLabel jLabel8;
    protected javax.swing.JLabel jLabel9;
    protected javax.swing.JPanel jPanel1;
    protected javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    protected javax.swing.JScrollPane jScrollPane1;
    protected javax.swing.JTextField jTxtConcepDescrip;
    protected javax.swing.JTextField jTxtDescripAlmacen;
    protected javax.swing.JLabel lblCaducidad;
    protected javax.swing.JLabel lblLote;
    protected javax.swing.JLabel lblPedimento;
    protected javax.swing.JPanel pnlPartida;
    protected com.era.views.tables.IngresTable tblPartidas;
    protected javax.swing.JTextField txtActivo;
    protected javax.swing.JTextField txtCantidad;
    protected javax.swing.JTextField txtConcepto;
    protected javax.swing.JTextField txtDescripcionProducto;
    protected javax.swing.JTextField txtExistencias;
    protected javax.swing.JTextField txtFolioDocumento;
    protected javax.swing.JTextField txtLote;
    protected javax.swing.JTextField txtPedimento;
    protected javax.swing.JTextField txtProducto;
    // End of variables declaration//GEN-END:variables
}
