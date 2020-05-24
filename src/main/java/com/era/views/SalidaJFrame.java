package com.era.views;


public abstract class SalidaJFrame extends BaseJFrame {
    
        public SalidaJFrame(final String idTextTitleWindow) {
            
            super(idTextTitleWindow);
            
        initComponents();
         
        
                         
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jBtnBusProducto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTab = new javax.swing.JTable();
        jBtnAceptar = new javax.swing.JButton();
        jBtnSalir = new javax.swing.JButton();
        jTxtDescripcionProd = new javax.swing.JTextField();
        jTxtProducto = new javax.swing.JTextField();
        jTxtExistencias = new javax.swing.JTextField();
        jCbUnidad = new javax.swing.JComboBox();
        jTxtUnidad = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jCbAlmacen = new javax.swing.JComboBox<String>();
        jLabel6 = new javax.swing.JLabel();
        jTxtCantidad = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTxtConcepto = new javax.swing.JTextField();
        jBtnConcepto = new javax.swing.JButton();
        jTxtConcepDescrip = new javax.swing.JTextField();
        jTxtDescripAlmacen = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTxtLote = new javax.swing.JTextField();
        jTxtPedimento = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTxtImporNumSeries = new javax.swing.JTextField();
        jBtnImporNumSeries = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTxtActivo = new javax.swing.JTextField();
        jBtnActivo = new javax.swing.JButton();
        jTComenSer = new javax.swing.JTextField();
        jTSerProd = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jBtnBusProducto.setBackground(new java.awt.Color(255, 255, 255));
        jBtnBusProducto.setText("...");
        jPanel1.add(jBtnBusProducto);
        jBtnBusProducto.setBounds(160, 30, 30, 20);

        jTab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "E/S", "Cod. Producto", "Unidad", "Cod. Almacen", "Cantidad", "Cod. Concepto", "Fecha", "Sucursal ", "Caja", "Usuario", "Nombre Usuario", "activo"
            }
        ));
        jScrollPane1.setViewportView(jTab);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 150, 650, 250);

        jBtnAceptar.setBackground(new java.awt.Color(255, 255, 255));
        jBtnAceptar.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBtnAceptar.setForeground(new java.awt.Color(0, 102, 0));
        jBtnAceptar.setLabel("Aceptar");
        jPanel1.add(jBtnAceptar);
        jBtnAceptar.setBounds(660, 150, 85, 30);

        jBtnSalir.setBackground(new java.awt.Color(255, 255, 255));
        jBtnSalir.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBtnSalir.setForeground(new java.awt.Color(0, 102, 0));
        jBtnSalir.setLabel("Salir");
        jPanel1.add(jBtnSalir);
        jBtnSalir.setBounds(660, 180, 85, 30);

        jTxtDescripcionProd.setEditable(false);
        jTxtDescripcionProd.setEnabled(false);
        jPanel1.add(jTxtDescripcionProd);
        jTxtDescripcionProd.setBounds(10, 50, 260, 20);

        jTxtProducto.setBackground(new java.awt.Color(255, 255, 153));
        jPanel1.add(jTxtProducto);
        jTxtProducto.setBounds(10, 30, 150, 20);

        jTxtExistencias.setEditable(false);
        jTxtExistencias.setEnabled(false);
        jPanel1.add(jTxtExistencias);
        jTxtExistencias.setBounds(170, 70, 100, 20);

        jPanel1.add(jCbUnidad);
        jCbUnidad.setBounds(90, 90, 80, 20);

        jTxtUnidad.setEditable(false);
        jTxtUnidad.setEnabled(false);
        jPanel1.add(jTxtUnidad);
        jTxtUnidad.setBounds(170, 90, 100, 20);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("*Cod. Producto:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(10, 10, 114, 17);

        jLabel11.setText("Existencias generales");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(10, 70, 160, 14);

        jLabel17.setText("Unidad:");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(10, 90, 80, 14);

        jPanel1.add(jCbAlmacen);
        jCbAlmacen.setBounds(190, 30, 90, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Almacén:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(190, 10, 63, 17);
        jPanel1.add(jTxtCantidad);
        jTxtCantidad.setBounds(450, 30, 90, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("*Cantidad:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(450, 10, 76, 17);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("*Concepto:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(540, 10, 81, 17);
        jPanel1.add(jTxtConcepto);
        jTxtConcepto.setBounds(540, 30, 90, 20);

        jBtnConcepto.setText("...");
        jPanel1.add(jBtnConcepto);
        jBtnConcepto.setBounds(630, 30, 30, 20);

        jTxtConcepDescrip.setEditable(false);
        jTxtConcepDescrip.setEnabled(false);
        jPanel1.add(jTxtConcepDescrip);
        jTxtConcepDescrip.setBounds(540, 50, 120, 20);

        jTxtDescripAlmacen.setEditable(false);
        jTxtDescripAlmacen.setEnabled(false);
        jPanel1.add(jTxtDescripAlmacen);
        jTxtDescripAlmacen.setBounds(280, 30, 100, 20);

        jLabel1.setText("Lote :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 110, 90, 14);

        jLabel2.setText("Pedimento:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(100, 110, 80, 14);
        jPanel1.add(jTxtLote);
        jTxtLote.setBounds(10, 130, 90, 20);
        jPanel1.add(jTxtPedimento);
        jTxtPedimento.setBounds(100, 130, 90, 20);

        jLabel3.setText("Fecha de caducidad:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(280, 50, 160, 14);

        jLabel4.setText("Importar número de series:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(280, 90, 160, 14);
        jPanel1.add(jTxtImporNumSeries);
        jTxtImporNumSeries.setBounds(280, 110, 140, 20);

        jBtnImporNumSeries.setText("...");
        jPanel1.add(jBtnImporNumSeries);
        jBtnImporNumSeries.setBounds(420, 110, 20, 20);

        jLabel5.setText("Activo:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(440, 90, 140, 14);

        jTxtActivo.setEditable(false);
        jTxtActivo.setEnabled(false);
        jPanel1.add(jTxtActivo);
        jTxtActivo.setBounds(440, 110, 140, 20);

        jBtnActivo.setText("...");
        jPanel1.add(jBtnActivo);
        jBtnActivo.setBounds(580, 110, 20, 20);

        jTComenSer.setEditable(false);
        jPanel1.add(jTComenSer);
        jTComenSer.setBounds(610, 80, 10, 20);

        jTSerProd.setEditable(false);
        jPanel1.add(jTSerProd);
        jTSerProd.setBounds(620, 80, 10, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 756, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAceptar;
    private javax.swing.JButton jBtnActivo;
    private javax.swing.JButton jBtnBusProducto;
    private javax.swing.JButton jBtnConcepto;
    private javax.swing.JButton jBtnImporNumSeries;
    private javax.swing.JButton jBtnSalir;
    private javax.swing.JComboBox<String> jCbAlmacen;
    private javax.swing.JComboBox jCbUnidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTComenSer;
    private javax.swing.JTextField jTSerProd;
    private javax.swing.JTable jTab;
    private javax.swing.JTextField jTxtActivo;
    private javax.swing.JTextField jTxtCantidad;
    public javax.swing.JTextField jTxtConcepDescrip;
    public javax.swing.JTextField jTxtConcepto;
    private javax.swing.JTextField jTxtDescripAlmacen;
    private javax.swing.JTextField jTxtDescripcionProd;
    private javax.swing.JTextField jTxtExistencias;
    private javax.swing.JTextField jTxtImporNumSeries;
    private javax.swing.JTextField jTxtLote;
    private javax.swing.JTextField jTxtPedimento;
    private javax.swing.JTextField jTxtProducto;
    private javax.swing.JTextField jTxtUnidad;
    // End of variables declaration//GEN-END:variables
}
