package com.era.views;

public class TraspasJFrame extends BaseJFrame {

    public TraspasJFrame() {
        
        initComponents();

        
    }
	
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jP1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jBSal = new javax.swing.JButton();
        jBTransfe = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTab = new javax.swing.JTable();
        jBBusc = new javax.swing.JButton();
        jTBusc = new javax.swing.JTextField();
        jBMosTod = new javax.swing.JButton();
        jTProd = new javax.swing.JTextField();
        jBProd = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTDescrip = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTCant = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTConcep = new javax.swing.JTextField();
        jBConcep = new javax.swing.JButton();
        jTDescripConcep = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTExist = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jBTab1 = new javax.swing.JButton();
        jBTod = new javax.swing.JButton();
        jComUnid = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        jTUnid = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jBPrec1 = new javax.swing.JButton();
        jLImg = new javax.swing.JLabel();
        jComTall = new javax.swing.JComboBox();
        jComColo = new javax.swing.JComboBox();
        jTTall = new javax.swing.JTextField();
        jTColo = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jComAlma = new javax.swing.JComboBox();
        jTDescripAlma = new javax.swing.JTextField();
        jBExisAlma = new javax.swing.JButton();
        jComAlma2 = new javax.swing.JComboBox();
        jTDescripAlma2 = new javax.swing.JTextField();
        jBExisAlma1 = new javax.swing.JButton();
        jTComenSer = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jBconfirmar = new javax.swing.JButton();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTUsr = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        btnUsuario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        
        jP1.setBackground(new java.awt.Color(255, 255, 255));
        jP1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Almacén A:");
        jP1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, 80, -1));

        jBSal.setBackground(new java.awt.Color(255, 255, 255));
        jBSal.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBSal.setForeground(new java.awt.Color(0, 102, 0));
        jBSal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/sal.png"))); // NOI18N
        jBSal.setText("Salir");
        jBSal.setToolTipText("Salir (ESC)");
        jBSal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBSal.setNextFocusableComponent(jTProd);
        jP1.add(jBSal, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 260, 120, 30));

        jBTransfe.setBackground(new java.awt.Color(255, 255, 255));
        jBTransfe.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBTransfe.setForeground(new java.awt.Color(0, 102, 0));
        jBTransfe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/transferencia.png"))); // NOI18N
        jBTransfe.setText("Trans.");
        jBTransfe.setToolTipText("Traspasar entra Almacén");
        jBTransfe.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBTransfe.setNextFocusableComponent(jBSal);
        jP1.add(jBTransfe, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 230, 120, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Traspasos:");
        jP1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 160, -1));

        jTab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Cod. Producto", "Cod. Almacén", "Unidad", "Cod. Concepto", "Cant. Saliente", "Cod. Almacén", "Cant. Entrante", "Fecha Traspaso", "Sucursal", "Caja", "Usuario", "Nombre Usuario"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTab.setGridColor(new java.awt.Color(255, 255, 255));
        jTab.setNextFocusableComponent(jBBusc);
        jTab.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        jScrollPane2.setViewportView(jTab);

        jP1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 840, 230));

        jBBusc.setBackground(new java.awt.Color(255, 255, 255));
        jBBusc.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBBusc.setForeground(new java.awt.Color(0, 102, 0));
        jBBusc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/busc5.png"))); // NOI18N
        jBBusc.setText("Buscar F3");
        jBBusc.setNextFocusableComponent(jTBusc);
        jP1.add(jBBusc, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 140, 20));

        jTBusc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTBusc.setNextFocusableComponent(jBMosTod);
        jP1.add(jTBusc, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, 560, 20));

        jBMosTod.setBackground(new java.awt.Color(255, 255, 255));
        jBMosTod.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBMosTod.setForeground(new java.awt.Color(0, 102, 0));
        jBMosTod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/mostt.png"))); // NOI18N
        jBMosTod.setText("Mostrar F4");
        jBMosTod.setToolTipText("Mostrar Nuevamente todos los Registros");
        jBMosTod.setNextFocusableComponent(jBTransfe);
        jP1.add(jBMosTod, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 440, 140, 20));

        jTProd.setBackground(new java.awt.Color(255, 255, 153));
        jTProd.setToolTipText("Ctrl+B búsqueda avanzada");
        jTProd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTProd.setNextFocusableComponent(jBProd);
        jP1.add(jTProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 120, 20));

        jBProd.setBackground(new java.awt.Color(255, 255, 255));
        jBProd.setText("...");
        jBProd.setToolTipText("Buscar Producto(s)");
        jBProd.setNextFocusableComponent(jComAlma);
        jP1.add(jBProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 30, 20));

        jLabel5.setText("*Concepto:");
        jP1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 10, 100, -1));

        jTDescrip.setEditable(false);
        jTDescrip.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jP1.add(jTDescrip, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 230, 20));

        jLabel6.setText("Almacén:");
        jP1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 80, -1));

        jTCant.setText("1");
        jTCant.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTCant.setNextFocusableComponent(jTConcep);
        jP1.add(jTCant, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 30, 70, 20));

        jLabel7.setText("*Cantidad:");
        jP1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 10, 80, -1));

        jTConcep.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTConcep.setNextFocusableComponent(jBConcep);
        jP1.add(jTConcep, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 30, 110, 20));

        jBConcep.setBackground(new java.awt.Color(255, 255, 255));
        jBConcep.setText("...");
        jBConcep.setToolTipText("Buscar Concepto(s)");
        jBConcep.setNextFocusableComponent(jTab);
        jP1.add(jBConcep, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 30, 30, 20));

        jTDescripConcep.setEditable(false);
        jTDescripConcep.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jP1.add(jTDescripConcep, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 70, 140, 20));

        jLabel8.setText("Descripción:");
        jP1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 50, 150, -1));

        jTExist.setEditable(false);
        jTExist.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jP1.add(jTExist, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 80, 20));

        jLabel10.setText("*Cod. Producto:");
        jP1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, -1));

        jLabel11.setText("Descripción:");
        jP1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 150, -1));

        jBTab1.setBackground(new java.awt.Color(0, 153, 153));
        jBTab1.setToolTipText("Mostrar Tabla en Grande");
        jP1.add(jBTab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 10, 20));

        jBTod.setBackground(new java.awt.Color(255, 255, 255));
        jBTod.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jBTod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/marct.png"))); // NOI18N
        jBTod.setText("Marcar todo");
        jBTod.setToolTipText("Seleccionar Todos los Elementos de la Tabla (Alt+T)");
        jBTod.setNextFocusableComponent(jTab);
        jP1.add(jBTod, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 190, 130, 20));

        jComUnid.setNextFocusableComponent(jTUnid);
        jP1.add(jComUnid, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 90, 20));

        jLabel13.setText("Existencia:");
        jP1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 90, -1));

        jTUnid.setEditable(false);
        jTUnid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTUnid.setNextFocusableComponent(jComTall);
        jP1.add(jTUnid, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 80, 20));

        jLabel14.setText("Color:");
        jP1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 60, -1));

        jBPrec1.setBackground(new java.awt.Color(255, 255, 255));
        jBPrec1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBPrec1.setText("$");
        jBPrec1.setToolTipText("Lista de Precios y Costeos");
        jBPrec1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jBPrec1.setNextFocusableComponent(jComUnid);
        jP1.add(jBPrec1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 80, 20));

        jLImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/traspas2.png"))); // NOI18N
        jP1.add(jLImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 100, 70));

        jComTall.setNextFocusableComponent(jTTall);
        jP1.add(jComTall, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 90, 20));

        jComColo.setNextFocusableComponent(jTColo);
        jP1.add(jComColo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 90, 20));

        jTTall.setEditable(false);
        jTTall.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTTall.setNextFocusableComponent(jComColo);
        jP1.add(jTTall, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 80, 20));

        jTColo.setEditable(false);
        jTColo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jP1.add(jTColo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 80, 20));

        jLabel15.setText("Unidad:");
        jP1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 60, -1));

        jLabel16.setText("Talla:");
        jP1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 60, -1));

        jComAlma.setNextFocusableComponent(jTDescripAlma);
        jP1.add(jComAlma, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 80, 20));

        jTDescripAlma.setEditable(false);
        jTDescripAlma.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTDescripAlma.setNextFocusableComponent(jBPrec1);
        jP1.add(jTDescripAlma, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 100, 20));

        jBExisAlma.setBackground(new java.awt.Color(0, 153, 153));
        jBExisAlma.setToolTipText("Existencias por almacén del producto");
        jP1.add(jBExisAlma, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 10, 20));

        jComAlma2.setNextFocusableComponent(jTDescripAlma2);
        jP1.add(jComAlma2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, 80, 20));

        jTDescripAlma2.setEditable(false);
        jTDescripAlma2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTDescripAlma2.setNextFocusableComponent(jTCant);
        jP1.add(jTDescripAlma2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 30, 90, 20));

        jBExisAlma1.setBackground(new java.awt.Color(0, 153, 153));
        jBExisAlma1.setToolTipText("Existencias por almacén del producto");
        jP1.add(jBExisAlma1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 30, 10, 20));

        jTComenSer.setEditable(false);
        jTComenSer.setFocusable(false);
        jP1.add(jTComenSer, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 90, 10, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jBconfirmar.setBackground(new java.awt.Color(255, 255, 255));
        jBconfirmar.setText("confirmar");
        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 0, 1));

        jLabel3.setText("Cantidad a recibir:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBconfirmar)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBconfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jP1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 140, 170, 70));

        jLabel4.setText("Recibir producto:");
        jP1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 120, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 0));
        jButton1.setText("GenerarReporte");
        jP1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 290, 120, 30));
        jP1.add(jTUsr, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 130, -1));

        jLabel19.setText("Usuario:");
        jP1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        btnUsuario.setText("...");
        jP1.add(btnUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 40, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jP1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jP1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUsuario;
    private javax.swing.JButton jBBusc;
    private javax.swing.JButton jBConcep;
    private javax.swing.JButton jBExisAlma;
    private javax.swing.JButton jBExisAlma1;
    private javax.swing.JButton jBMosTod;
    private javax.swing.JButton jBPrec1;
    private javax.swing.JButton jBProd;
    private javax.swing.JButton jBSal;
    private javax.swing.JButton jBTab1;
    private javax.swing.JButton jBTod;
    private javax.swing.JButton jBTransfe;
    private javax.swing.JButton jBconfirmar;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComAlma;
    private javax.swing.JComboBox jComAlma2;
    private javax.swing.JComboBox jComColo;
    private javax.swing.JComboBox jComTall;
    private javax.swing.JComboBox jComUnid;
    private javax.swing.JLabel jLImg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jP1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField jTBusc;
    private javax.swing.JTextField jTCant;
    private javax.swing.JTextField jTColo;
    private javax.swing.JTextField jTComenSer;
    private javax.swing.JTextField jTConcep;
    private javax.swing.JTextField jTDescrip;
    private javax.swing.JTextField jTDescripAlma;
    private javax.swing.JTextField jTDescripAlma2;
    private javax.swing.JTextField jTDescripConcep;
    private javax.swing.JTextField jTExist;
    private javax.swing.JTextField jTProd;
    private javax.swing.JTextField jTTall;
    private javax.swing.JTextField jTUnid;
    private javax.swing.JTextField jTUsr;
    private javax.swing.JTable jTab;
    // End of variables declaration//GEN-END:variables

}
