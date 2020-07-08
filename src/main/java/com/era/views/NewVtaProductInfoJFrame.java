package com.era.views;

public abstract class NewVtaProductInfoJFrame extends BaseJFrame 
{
    public NewVtaProductInfoJFrame(final String idTextTitleWindow) 
    {                
        super(idTextTitleWindow);
        
        initComponents();                
        
        postInitComponents();
    }

    
    
       
        
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jP1 = new javax.swing.JPanel();
        jBSal = new javax.swing.JButton();
        jBAcept = new javax.swing.JButton();
        jPParts = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTDesc = new javax.swing.JTextField();
        jComUnid = new com.era.views.comboboxes.UnidsCombobox();
        jTDescrip = new javax.swing.JTextField();
        jTPre = new javax.swing.JTextField();
        jTCant = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jTDescripUni = new javax.swing.JTextField();
        jTDescripAlma = new javax.swing.JTextField();
        jTextFieldExistencia = new javax.swing.JTextField();
        jTCost = new javax.swing.JTextField();
        jTextFieldProducto = new javax.swing.JTextField();
        jBProd = new javax.swing.JButton();
        jTList = new javax.swing.JTextField();
        jBList = new javax.swing.JButton();
        jBVeGran = new javax.swing.JButton();
        jPanImg = new javax.swing.JPanel();
        jLImg = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jBGranDescrip = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jComboBoxAlmacenes = new com.era.views.comboboxes.WarehousesCombobox();
        jBExisAlma = new javax.swing.JButton();
        jLabel42 = new javax.swing.JLabel();
        jTCuentaCont = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        jBCuentaCont = new javax.swing.JButton();
        jBtnReferencia = new javax.swing.JButton();
        jTReferencia = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTxtCodOpc = new javax.swing.JTextField();
        jLblCodigoOpcional = new javax.swing.JLabel();
        jBDatsCarta = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTLot = new javax.swing.JTextField();
        jTPedimen = new javax.swing.JTextField();
        jbLotPed = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jP1.setBackground(new java.awt.Color(255, 255, 255));
        jP1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBSal.setBackground(new java.awt.Color(255, 255, 255));
        jBSal.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBSal.setForeground(new java.awt.Color(0, 102, 0));
        jBSal.setText("Salir");
        jBSal.setToolTipText("Salir (ESC)");
        jP1.add(jBSal, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 250, 100, 30));

        jBAcept.setBackground(new java.awt.Color(255, 255, 255));
        jBAcept.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBAcept.setForeground(new java.awt.Color(0, 102, 0));
        jBAcept.setText("Aceptar");
        jBAcept.setToolTipText("Nueva Asociaciòn (Ctrl+N)");
        jP1.add(jBAcept, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 250, 100, 30));

        jPParts.setBackground(new java.awt.Color(255, 255, 255));
        jPParts.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos del Producto", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPParts.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setText("Precio:");
        jPParts.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, 60, -1));

        jLabel11.setText("Desc.%:");
        jPParts.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 60, -1));

        jTDesc.setText("0");
        jTDesc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPParts.add(jTDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 80, 20));

        jPParts.add(jComUnid, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 90, 20));

        jTDescrip.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPParts.add(jTDescrip, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 280, 20));

        jTPre.setEditable(false);
        jTPre.setText("$0.00");
        jTPre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPParts.add(jTPre, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, 80, 20));

        jTCant.setText("1");
        jTCant.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPParts.add(jTCant, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, 80, 20));

        jLabel15.setText("U.Costo:");
        jPParts.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, 60, -1));

        jLabel19.setText("Cod. Producto:");
        jPParts.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 110, -1));

        jTDescripUni.setEditable(false);
        jTDescripUni.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPParts.add(jTDescripUni, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 80, 20));

        jTDescripAlma.setEditable(false);
        jTDescripAlma.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPParts.add(jTDescripAlma, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 70, 20));

        jTextFieldExistencia.setEditable(false);
        jTextFieldExistencia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPParts.add(jTextFieldExistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 40, 100, 20));

        jTCost.setEditable(false);
        jTCost.setText("$0.00");
        jTCost.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPParts.add(jTCost, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, 100, 20));

        jTextFieldProducto.setBackground(new java.awt.Color(255, 255, 153));
        jTextFieldProducto.setToolTipText("Ctrl+B búsqueda avanzada");
        jTextFieldProducto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPParts.add(jTextFieldProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 60, 20));

        jBProd.setBackground(new java.awt.Color(255, 255, 255));
        jBProd.setText("...");
        jBProd.setToolTipText("Búscar Producto(s)");
        jPParts.add(jBProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 30, 20));

        jTList.setText("1");
        jTList.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPParts.add(jTList, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 50, 20));

        jBList.setBackground(new java.awt.Color(255, 255, 255));
        jBList.setText("jButton1");
        jBList.setToolTipText("Búscar Listas de Precio");
        jBList.setName(""); // NOI18N
        jPParts.add(jBList, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, 30, 20));

        jBVeGran.setBackground(new java.awt.Color(255, 255, 255));
        jBVeGran.setText("...");
        jBVeGran.setToolTipText("Ver Imágen  de Producto Completa");
        jPParts.add(jBVeGran, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 160, 30, 20));

        jPanImg.setBackground(new java.awt.Color(255, 255, 204));

        javax.swing.GroupLayout jPanImgLayout = new javax.swing.GroupLayout(jPanImg);
        jPanImg.setLayout(jPanImgLayout);
        jPanImgLayout.setHorizontalGroup(
            jPanImgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanImgLayout.createSequentialGroup()
                .addComponent(jLImg)
                .addGap(0, 180, Short.MAX_VALUE))
        );
        jPanImgLayout.setVerticalGroup(
            jPanImgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanImgLayout.createSequentialGroup()
                .addComponent(jLImg)
                .addContainerGap(140, Short.MAX_VALUE))
        );

        jPParts.add(jPanImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 20, 180, 140));

        jLabel13.setText("Cod. Unidad:");
        jPParts.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 87, -1));

        jLabel46.setText("Existencia:");
        jPParts.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 40, 70, -1));

        jLabel49.setText("L.Precio:");
        jPParts.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 60, 20));

        jBGranDescrip.setBackground(new java.awt.Color(0, 153, 153));
        jBGranDescrip.setToolTipText("Ver/Modificar Descripción en Grande");
        jPParts.add(jBGranDescrip, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 10, 20));

        jLabel16.setText("Almacén:");
        jPParts.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 87, -1));

        jPParts.add(jComboBoxAlmacenes, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 90, 20));

        jBExisAlma.setBackground(new java.awt.Color(0, 153, 153));
        jBExisAlma.setToolTipText("Existencias por almacén del producto");
        jPParts.add(jBExisAlma, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 10, 20));

        jLabel42.setText("Cant:");
        jPParts.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 60, -1));

        jTCuentaCont.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPParts.add(jTCuentaCont, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 140, 20));

        jLabel53.setText("Cuenta Contable:");
        jPParts.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 100, 20));

        jBCuentaCont.setBackground(new java.awt.Color(255, 255, 255));
        jBCuentaCont.setText("jButton1");
        jBCuentaCont.setToolTipText("Búscar Listas de Precio");
        jBCuentaCont.setName(""); // NOI18N
        jPParts.add(jBCuentaCont, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 30, 20));

        jBtnReferencia.setBackground(new java.awt.Color(255, 255, 255));
        jBtnReferencia.setText("jButton1");
        jPParts.add(jBtnReferencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 30, 20));

        jTReferencia.setEditable(false);
        jPParts.add(jTReferencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 140, -1));

        jLabel1.setText("Activo");
        jPParts.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 100, -1));
        jPParts.add(jTxtCodOpc, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 170, 40));

        jLblCodigoOpcional.setText("Observaciones:");
        jPParts.add(jLblCodigoOpcional, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 110, -1));

        jBDatsCarta.setBackground(new java.awt.Color(255, 255, 255));
        jBDatsCarta.setText("Datos Carta Porte");
        jPParts.add(jBDatsCarta, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 170, -1));

        jLabel2.setText("Lote y pedimento");
        jPParts.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, -1, -1));

        jTLot.setFocusable(false);
        jPParts.add(jTLot, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, 70, -1));

        jTPedimen.setFocusable(false);
        jPParts.add(jTPedimen, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 150, 70, -1));

        jbLotPed.setText("jbLotPed");
        jPParts.add(jbLotPed, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 150, 30, 20));

        jP1.add(jPParts, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 940, 240));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jP1, javax.swing.GroupLayout.DEFAULT_SIZE, 1007, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jP1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton jBAcept;
    protected javax.swing.JButton jBCuentaCont;
    protected javax.swing.JButton jBDatsCarta;
    protected javax.swing.JButton jBExisAlma;
    protected javax.swing.JButton jBGranDescrip;
    protected javax.swing.JButton jBList;
    protected javax.swing.JButton jBProd;
    protected javax.swing.JButton jBSal;
    protected javax.swing.JButton jBVeGran;
    protected javax.swing.JButton jBtnReferencia;
    protected com.era.views.comboboxes.UnidsCombobox jComUnid;
    protected com.era.views.comboboxes.WarehousesCombobox jComboBoxAlmacenes;
    protected javax.swing.JLabel jLImg;
    protected javax.swing.JLabel jLabel1;
    protected javax.swing.JLabel jLabel10;
    protected javax.swing.JLabel jLabel11;
    protected javax.swing.JLabel jLabel13;
    protected javax.swing.JLabel jLabel15;
    protected javax.swing.JLabel jLabel16;
    protected javax.swing.JLabel jLabel19;
    protected javax.swing.JLabel jLabel2;
    protected javax.swing.JLabel jLabel42;
    protected javax.swing.JLabel jLabel46;
    protected javax.swing.JLabel jLabel49;
    protected javax.swing.JLabel jLabel53;
    protected javax.swing.JLabel jLblCodigoOpcional;
    private javax.swing.JPanel jP1;
    private javax.swing.JPanel jPParts;
    protected javax.swing.JPanel jPanImg;
    protected javax.swing.JTextField jTCant;
    protected javax.swing.JTextField jTCost;
    protected javax.swing.JTextField jTCuentaCont;
    protected javax.swing.JTextField jTDesc;
    protected javax.swing.JTextField jTDescrip;
    protected javax.swing.JTextField jTDescripAlma;
    protected javax.swing.JTextField jTDescripUni;
    protected javax.swing.JTextField jTList;
    protected javax.swing.JTextField jTLot;
    protected javax.swing.JTextField jTPedimen;
    protected javax.swing.JTextField jTPre;
    protected javax.swing.JTextField jTReferencia;
    protected javax.swing.JTextField jTextFieldExistencia;
    protected javax.swing.JTextField jTextFieldProducto;
    protected javax.swing.JTextField jTxtCodOpc;
    protected javax.swing.JButton jbLotPed;
    // End of variables declaration//GEN-END:variables

}
