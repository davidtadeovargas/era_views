package com.era.views;

public abstract class TraspasJFrame extends BaseJFrame {

    public TraspasJFrame(final String idTextTitleWindow) {
        
        super(idTextTitleWindow);
        
        initComponents();

        postInitComponents();        
    }
	
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jP1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jBSal = new javax.swing.JButton();
        jBTransfe = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTab = new com.era.views.tables.TraspasTable();
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
        jTExist = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jComUnid = new com.era.views.comboboxes.UnidsCombobox();
        jLabel13 = new javax.swing.JLabel();
        jLImg = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jComAlma = new com.era.views.comboboxes.WarehousesCombobox();
        jBExisAlma = new javax.swing.JButton();
        jComAlma2 = new com.era.views.comboboxes.WarehousesCombobox();
        jPanel1 = new javax.swing.JPanel();
        jBconfirmar = new javax.swing.JButton();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jP1.setBackground(new java.awt.Color(255, 255, 255));
        jP1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Almacén A:");
        jP1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, 80, -1));

        jBSal.setBackground(new java.awt.Color(255, 255, 255));
        jBSal.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBSal.setForeground(new java.awt.Color(0, 102, 0));
        jBSal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/sal.png"))); // NOI18N
        jBSal.setText("Salir");
        jBSal.setToolTipText("Salir (ESC)");
        jBSal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBSal.setNextFocusableComponent(jBBusc);
        jP1.add(jBSal, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 240, 120, 30));

        jBTransfe.setBackground(new java.awt.Color(255, 255, 255));
        jBTransfe.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBTransfe.setForeground(new java.awt.Color(0, 102, 0));
        jBTransfe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/transferencia.png"))); // NOI18N
        jBTransfe.setText("Trans.");
        jBTransfe.setToolTipText("Traspasar entra Almacén");
        jBTransfe.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBTransfe.setNextFocusableComponent(jBSal);
        jP1.add(jBTransfe, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 210, 120, 30));

        jTab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTab.setGridColor(new java.awt.Color(255, 255, 255));
        jTab.setNextFocusableComponent(jTProd);
        jTab.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
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
        jBMosTod.setNextFocusableComponent(jTab);
        jP1.add(jBMosTod, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 440, 140, 20));

        jTProd.setBackground(new java.awt.Color(255, 255, 153));
        jTProd.setToolTipText("Ctrl+B búsqueda avanzada");
        jTProd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTProd.setNextFocusableComponent(jBProd);
        jP1.add(jTProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 120, 20));

        jBProd.setBackground(new java.awt.Color(255, 255, 255));
        jBProd.setText("...");
        jBProd.setToolTipText("Buscar Producto(s)");
        jBProd.setNextFocusableComponent(jComAlma);
        jP1.add(jBProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 30, 20));

        jLabel5.setText("*Concepto:");
        jP1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 10, 100, -1));

        jTDescrip.setEditable(false);
        jTDescrip.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTDescrip.setNextFocusableComponent(jTExist);
        jP1.add(jTDescrip, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 230, 20));

        jLabel6.setText("Almacén:");
        jP1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 80, -1));

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
        jBConcep.setNextFocusableComponent(jSpinner1);
        jP1.add(jBConcep, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 30, 30, 20));

        jTExist.setEditable(false);
        jTExist.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTExist.setNextFocusableComponent(jComUnid);
        jP1.add(jTExist, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 80, 20));

        jLabel10.setText("*Cod. Producto:");
        jP1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 150, -1));

        jComUnid.setNextFocusableComponent(jComAlma2);
        jP1.add(jComUnid, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 170, 20));

        jLabel13.setText("Existencia:");
        jP1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 90, -1));

        jLImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/traspas2.png"))); // NOI18N
        jP1.add(jLImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 100, 70));

        jLabel15.setText("Unidad:");
        jP1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 60, -1));

        jComAlma.setNextFocusableComponent(jBExisAlma);
        jP1.add(jComAlma, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 80, 20));

        jBExisAlma.setBackground(new java.awt.Color(0, 153, 153));
        jBExisAlma.setToolTipText("Existencias por almacén del producto");
        jBExisAlma.setNextFocusableComponent(jTDescrip);
        jP1.add(jBExisAlma, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 10, 20));

        jComAlma2.setNextFocusableComponent(jTCant);
        jP1.add(jComAlma2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 30, 90, 20));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jBconfirmar.setBackground(new java.awt.Color(255, 255, 255));
        jBconfirmar.setText("confirmar");
        jBconfirmar.setNextFocusableComponent(jBTransfe);

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 0, 1));
        jSpinner1.setNextFocusableComponent(jBconfirmar);

        jLabel3.setText("Cantidad a recibir:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBconfirmar)))
                .addContainerGap(25, Short.MAX_VALUE))
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

        jP1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 120, 180, 70));

        jLabel4.setText("Recibir producto:");
        jP1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 100, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jP1, javax.swing.GroupLayout.DEFAULT_SIZE, 988, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jP1, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton jBBusc;
    protected javax.swing.JButton jBConcep;
    protected javax.swing.JButton jBExisAlma;
    protected javax.swing.JButton jBMosTod;
    protected javax.swing.JButton jBProd;
    protected javax.swing.JButton jBSal;
    protected javax.swing.JButton jBTransfe;
    protected javax.swing.JButton jBconfirmar;
    protected com.era.views.comboboxes.WarehousesCombobox jComAlma;
    protected com.era.views.comboboxes.WarehousesCombobox jComAlma2;
    protected com.era.views.comboboxes.UnidsCombobox jComUnid;
    protected javax.swing.JLabel jLImg;
    protected javax.swing.JLabel jLabel1;
    protected javax.swing.JLabel jLabel10;
    protected javax.swing.JLabel jLabel13;
    protected javax.swing.JLabel jLabel15;
    protected javax.swing.JLabel jLabel3;
    protected javax.swing.JLabel jLabel4;
    protected javax.swing.JLabel jLabel5;
    protected javax.swing.JLabel jLabel6;
    protected javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jP1;
    protected javax.swing.JPanel jPanel1;
    protected javax.swing.JScrollPane jScrollPane2;
    protected javax.swing.JSpinner jSpinner1;
    protected javax.swing.JTextField jTBusc;
    protected javax.swing.JTextField jTCant;
    protected javax.swing.JTextField jTConcep;
    protected javax.swing.JTextField jTDescrip;
    protected javax.swing.JTextField jTExist;
    protected javax.swing.JTextField jTProd;
    protected com.era.views.tables.TraspasTable jTab;
    // End of variables declaration//GEN-END:variables

}
