package com.era.views;





public abstract class IngrPrevComJFrame extends BaseJFrame 
{
    public IngrPrevComJFrame(final String idTextTitleWindow) 
    {                
        super(idTextTitleWindow);
        
        initComponents();
        jButtonGenerarPDF.setVisible(false);
        
        jTSerProd.setVisible (false);
        jTComenSer.setVisible(false);
        
        jTab.getColumnModel().getColumn(20).setMinWidth(0);
        jTab.getColumnModel().getColumn(20).setMaxWidth(0);
        
        jTab.setAutoResizeMode(0);
        
		jTab.getColumnModel().getColumn(1).setPreferredWidth(100);
        jTab.getColumnModel().getColumn(5).setPreferredWidth(500);
        jTab.getColumnModel().getColumn(8).setPreferredWidth(150);
        jTab.getColumnModel().getColumn(10).setPreferredWidth(120);
        jTab.getColumnModel().getColumn(16).setPreferredWidth(120);
        jTab.getColumnModel().getColumn(17).setPreferredWidth(190);
        jTab.getColumnModel().getColumn(18).setPreferredWidth(230);
        jTab.getColumnModel().getColumn(19).setPreferredWidth(230);
        
        jTAlma2.setVisible(false);
        
        this.getRootPane().setDefaultButton(jBGuar);
        
        jTab.getTableHeader().setReorderingAllowed(false);
        
        
                
    }
        
            
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jP1 = new javax.swing.JPanel();
        jBGuar = new javax.swing.JButton();
        jBSal = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTab = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTDesc = new javax.swing.JTextField();
        jComUnid = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        jTDescrip = new javax.swing.JTextField();
        jTCost = new javax.swing.JTextField();
        jTCant = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTDescAd = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jComImp = new javax.swing.JComboBox();
        jTValImp = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jTDescripUnid = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jTCodOpl2 = new javax.swing.JTextField();
        jTCodOp1 = new javax.swing.JTextField();
        jTExist = new javax.swing.JTextField();
        jBProd = new javax.swing.JButton();
        jTProd = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jTCodProv1 = new javax.swing.JTextField();
        jTCodProv2 = new javax.swing.JTextField();
        jSImg = new javax.swing.JScrollPane();
        jPanImg = new javax.swing.JPanel();
        jLImg = new javax.swing.JLabel();
        jBVeGran = new javax.swing.JButton();
        jBUltPre = new javax.swing.JButton();
        jComTall = new javax.swing.JComboBox();
        jLabel34 = new javax.swing.JLabel();
        jComColo = new javax.swing.JComboBox();
        jLabel35 = new javax.swing.JLabel();
        jTDescripColo = new javax.swing.JTextField();
        jTDescripTall = new javax.swing.JTextField();
        jTLot = new javax.swing.JTextField();
        jTPedimen = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jBGranDescrip = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jTGaran = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jBUltCostT = new javax.swing.JButton();
        jLabel40 = new javax.swing.JLabel();
        jComAlma = new javax.swing.JComboBox();
        jTDescripAlma = new javax.swing.JTextField();
        jBExisAlma = new javax.swing.JButton();
        jBTipCam = new javax.swing.JButton();
        jTCarSer = new javax.swing.JTextField();
        jBCarSer = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jTExistAlma = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTNoDoc = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTNom = new javax.swing.JTextField();
        jTProv = new javax.swing.JTextField();
        jBProv = new javax.swing.JButton();
        jTSer = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jCCo1 = new javax.swing.JCheckBox();
        jTCo1 = new javax.swing.JTextField();
        jTCo2 = new javax.swing.JTextField();
        jCCo2 = new javax.swing.JCheckBox();
        jCCo3 = new javax.swing.JCheckBox();
        jTCo3 = new javax.swing.JTextField();
        jCGua = new javax.swing.JCheckBox();
        jButtonGenerarPDF = new javax.swing.JButton();
        jTSubTot = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jTImp = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jTTot = new javax.swing.JTextField();
        jBTab1 = new javax.swing.JButton();
        jBTod = new javax.swing.JButton();
        jBNew = new javax.swing.JButton();
        jBDel = new javax.swing.JButton();
        jPEnca = new javax.swing.JPanel();
        jLEnt = new javax.swing.JLabel();
        jCImp = new javax.swing.JCheckBox();
        jLabel32 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jComSer = new javax.swing.JComboBox();
        jLabel29 = new javax.swing.JLabel();
        jComMon = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jLEnt1 = new javax.swing.JLabel();
        jTAlma2 = new javax.swing.JTextField();
        jTComenSer = new javax.swing.JTextField();
        jDesc = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jTSerProd = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        
        jP1.setBackground(new java.awt.Color(255, 255, 255));
        jP1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBGuar.setBackground(new java.awt.Color(255, 255, 255));
        jBGuar.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBGuar.setForeground(new java.awt.Color(0, 102, 0));
        jBGuar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/save.png"))); // NOI18N
        jBGuar.setText("Guardar");
        jBGuar.setToolTipText("Guardar");
        jBGuar.setNextFocusableComponent(jBSal);
        jP1.add(jBGuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, 120, 30));

        jBSal.setBackground(new java.awt.Color(255, 255, 255));
        jBSal.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBSal.setForeground(new java.awt.Color(0, 102, 0));
        jBSal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/sal.png"))); // NOI18N
        jBSal.setText("Salir");
        jBSal.setToolTipText("Salir (ESC)");
        jBSal.setNextFocusableComponent(jTProv);
        jP1.add(jBSal, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 550, 120, 30));

        jTab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Cod. Producto", "Qty.", "Unidad", "Almacén", "Descripción", "Costo", "Descuento", "Desc. Adicional", "Impuesto", "Impuesto valor", "Importe", "Talla", "Color", "Lote", "Pedimento", "Fecha Caducidad", "Serie Producto", "Comentario Serie", "Garantía", "Importe impuesto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTab.setGridColor(new java.awt.Color(255, 255, 255));
        jTab.setNextFocusableComponent(jBGuar);
        jScrollPane1.setViewportView(jTab);

        jP1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 1090, 160));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos del Producto", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setText("Costo:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 100, -1));

        jLabel11.setText("Descuento%:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 100, -1));

        jTDesc.setText("0");
        jTDesc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTDesc.setNextFocusableComponent(jBUltCostT);
        jPanel2.add(jTDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, 140, 20));

        jComUnid.setName(""); // NOI18N
        jComUnid.setNextFocusableComponent(jTDescripUnid);
        jPanel2.add(jComUnid, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 120, 20));

        jLabel12.setText("Cod. unidad:");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 87, -1));

        jTDescrip.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTDescrip.setNextFocusableComponent(jTDesc);
        jPanel2.add(jTDescrip, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 280, 20));

        jTCost.setText("$0.00");
        jTCost.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTCost.setNextFocusableComponent(jComImp);
        jPanel2.add(jTCost, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 120, 20));

        jTCant.setText("1");
        jTCant.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTCant.setNextFocusableComponent(jTDescAd);
        jPanel2.add(jTCant, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 100, 90, 20));

        jLabel15.setText("Color:");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 80, 100, -1));

        jLabel16.setText("Desc. adicional%:");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 120, 110, -1));

        jTDescAd.setText("0");
        jTDescAd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTDescAd.setNextFocusableComponent(jTLot);
        jPanel2.add(jTDescAd, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 120, 90, 20));

        jLabel17.setText("Cod. impuesto:");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 110, -1));

        jComImp.setNextFocusableComponent(jTValImp);
        jPanel2.add(jComImp, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 120, 20));

        jTValImp.setEditable(false);
        jTValImp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPanel2.add(jTValImp, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 140, 20));

        jLabel19.setText("Cod.producto:");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 110, -1));

        jTDescripUnid.setEditable(false);
        jTDescripUnid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTDescripUnid.setNextFocusableComponent(jTCost);
        jPanel2.add(jTDescripUnid, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 140, 20));

        jLabel5.setText("Cod. Opcional 2:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 110, -1));

        jLabel23.setText("Cod.proveedor:");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 110, -1));

        jTCodOpl2.setEditable(false);
        jTCodOpl2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPanel2.add(jTCodOpl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, 140, 20));

        jTCodOp1.setEditable(false);
        jTCodOp1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPanel2.add(jTCodOp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 120, 20));

        jTExist.setEditable(false);
        jTExist.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPanel2.add(jTExist, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, 90, 20));

        jBProd.setBackground(new java.awt.Color(255, 255, 255));
        jBProd.setText("...");
        jBProd.setToolTipText("Buscar Producto(s)");
        jBProd.setNextFocusableComponent(jComUnid);
        jPanel2.add(jBProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 30, 20));

        jTProd.setBackground(new java.awt.Color(255, 255, 153));
        jTProd.setToolTipText("Ctrl+B búsqueda avanzada");
        jTProd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTProd.setNextFocusableComponent(jBProd);
        jPanel2.add(jTProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 90, 20));

        jLabel24.setText("Cod. opcional 1:");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 110, -1));

        jLabel25.setText("Cod.proveedor:");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 110, -1));

        jTCodProv1.setEditable(false);
        jTCodProv1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTCodProv1.setNextFocusableComponent(jComAlma);
        jPanel2.add(jTCodProv1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 120, 20));

        jTCodProv2.setEditable(false);
        jTCodProv2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPanel2.add(jTCodProv2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, 140, 20));

        jPanImg.setBackground(new java.awt.Color(255, 255, 204));
        
        javax.swing.GroupLayout jPanImgLayout = new javax.swing.GroupLayout(jPanImg);
        jPanImg.setLayout(jPanImgLayout);
        jPanImgLayout.setHorizontalGroup(
            jPanImgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanImgLayout.createSequentialGroup()
                .addComponent(jLImg)
                .addGap(0, 171, Short.MAX_VALUE))
        );
        jPanImgLayout.setVerticalGroup(
            jPanImgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanImgLayout.createSequentialGroup()
                .addComponent(jLImg)
                .addContainerGap(150, Short.MAX_VALUE))
        );

        jSImg.setViewportView(jPanImg);

        jPanel2.add(jSImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 20, 190, 110));

        jBVeGran.setBackground(new java.awt.Color(255, 255, 255));
        jBVeGran.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/img.png"))); // NOI18N
        jBVeGran.setToolTipText("Ver Imágen  de Producto Completa");
        jBVeGran.setNextFocusableComponent(jBCarSer);
        jPanel2.add(jBVeGran, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 130, 30, 20));

        jBUltPre.setBackground(new java.awt.Color(255, 255, 255));
        jBUltPre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/ultpre.png"))); // NOI18N
        jBUltPre.setToolTipText("Ultimos 100 Precios de Compra de este Proveedor");
        jPanel2.add(jBUltPre, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, 40, 40));

        jComTall.setNextFocusableComponent(jComColo);
        jPanel2.add(jComTall, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 60, 90, 20));

        jLabel34.setText("Garantía:");
        jPanel2.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 100, -1));

        jComColo.setNextFocusableComponent(jTCant);
        jPanel2.add(jComColo, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 80, 90, 20));

        jLabel35.setText("Talla:");
        jPanel2.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 60, 100, -1));

        jTDescripColo.setEditable(false);
        jTDescripColo.setToolTipText("Descripción de Color");
        jTDescripColo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPanel2.add(jTDescripColo, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 80, 100, 20));

        jTDescripTall.setEditable(false);
        jTDescripTall.setToolTipText("Descripción de Talla");
        jTDescripTall.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPanel2.add(jTDescripTall, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 60, 100, 20));

        jTLot.setToolTipText("Lote");
        jTLot.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTLot.setNextFocusableComponent(jTPedimen);
        jPanel2.add(jTLot, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 140, 90, 20));

        jTPedimen.setToolTipText("Pedimento");
        jTPedimen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPanel2.add(jTPedimen, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 140, 100, 20));

        jLabel37.setText("Fecha caducidad:");
        jPanel2.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 160, 110, -1));

        jBGranDescrip.setBackground(new java.awt.Color(0, 153, 153));
        jBGranDescrip.setToolTipText("Ver/Modificar Descripción en Grande");
        jPanel2.add(jBGranDescrip, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 10, 20));

        jLabel38.setText("Lote y pedimento:");
        jPanel2.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 140, 110, -1));

        jLabel36.setText("Cantidad:");
        jPanel2.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 100, 100, -1));

        jTGaran.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTGaran.setNextFocusableComponent(jComTall);
        jPanel2.add(jTGaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 260, 20));

        jLabel39.setText("Existencia:");
        jPanel2.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, 100, -1));

        jBUltCostT.setBackground(new java.awt.Color(255, 255, 255));
        jBUltCostT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/ultcostpt.png"))); // NOI18N
        jBUltCostT.setToolTipText("Ultimos 100 Precios de Compra de todos los Proveedores");
        jBUltCostT.setNextFocusableComponent(jBUltPre);
        jPanel2.add(jBUltCostT, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, 40, 40));

        jLabel40.setText("Almacén:");
        jPanel2.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 87, -1));

        jComAlma.setNextFocusableComponent(jTDescripAlma);
        jPanel2.add(jComAlma, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 120, 20));

        jTDescripAlma.setEditable(false);
        jTDescripAlma.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTDescripAlma.setNextFocusableComponent(jComUnid);
        jPanel2.add(jTDescripAlma, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 140, 20));

        jBExisAlma.setBackground(new java.awt.Color(0, 153, 153));
        jBExisAlma.setToolTipText("Existencias por almacén del producto");
        jPanel2.add(jBExisAlma, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 10, 20));

        jBTipCam.setBackground(new java.awt.Color(255, 255, 255));
        jBTipCam.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBTipCam.setForeground(new java.awt.Color(0, 102, 0));
        jBTipCam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/dol.png"))); // NOI18N
        jBTipCam.setToolTipText("Definir el tipo de cambio dolar del día");
        jBTipCam.setNextFocusableComponent(jBUltCostT);
        jBTipCam.setOpaque(false);
        jPanel2.add(jBTipCam, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 40, 40));

        jTCarSer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTCarSer.setNextFocusableComponent(jBNew);
        jPanel2.add(jTCarSer, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 160, 160, 20));

        jBCarSer.setBackground(new java.awt.Color(255, 255, 255));
        jBCarSer.setText("..");
        jBCarSer.setToolTipText("Buscar archivo Excel con dos columnas: serie, comentario.");
        jBCarSer.setNextFocusableComponent(jTCarSer);
        jPanel2.add(jBCarSer, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 160, 30, 20));

        jLabel14.setText("Importar números de serie:");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 140, 150, 20));

        jLabel51.setText("Exist. almacen:");
        jPanel2.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 40, 90, -1));

        jTExistAlma.setEditable(false);
        jTExistAlma.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPanel2.add(jTExistAlma, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 40, 90, 20));

        jP1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 1090, 200));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos del Proveedor", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("Cod. Proveedor:");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 190, 110, -1));

        jLabel6.setText("*Cod. proveedor:");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 110, -1));

        jTNoDoc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPanel4.add(jTNoDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 90, 20));

        jLabel20.setText("*Folio documento:");
        jPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 110, -1));

        jTNom.setEditable(false);
        jTNom.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTNom.setNextFocusableComponent(jTNoDoc);
        jPanel4.add(jTNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 370, 20));

        jTProv.setBackground(new java.awt.Color(204, 255, 204));
        jTProv.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTProv.setNextFocusableComponent(jBProv);
        jPanel4.add(jTProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 90, 20));

        jBProv.setBackground(new java.awt.Color(255, 255, 255));
        jBProv.setText("...");
        jBProv.setToolTipText("Buscar Proveedor(es)");
        jBProv.setNextFocusableComponent(jTSer);
        jPanel4.add(jBProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 30, 20));

        jTSer.setEditable(false);
        jTSer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTSer.setNextFocusableComponent(jTNom);
        jPanel4.add(jTSer, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 60, 20));

        jLabel33.setText("Nombre:");
        jPanel4.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 80, -1));

        jCCo1.setBackground(new java.awt.Color(255, 255, 255));
        jCCo1.setSelected(true);
        jCCo1.setText("Correo 1");
        jPanel4.add(jCCo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, 20));

        jTCo1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPanel4.add(jTCo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 180, 20));

        jTCo2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPanel4.add(jTCo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 180, 20));

        jCCo2.setBackground(new java.awt.Color(255, 255, 255));
        jCCo2.setText("Correo 2");
        jPanel4.add(jCCo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, 20));

        jCCo3.setBackground(new java.awt.Color(255, 255, 255));
        jCCo3.setText("Correo 3");
        jPanel4.add(jCCo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, 20));

        jTCo3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPanel4.add(jTCo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 180, 20));

        jCGua.setBackground(new java.awt.Color(255, 255, 255));
        jCGua.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCGua.setText("Guardar Correos F8");
        jPanel4.add(jCGua, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 180, 20));

        jButtonGenerarPDF.setBackground(new java.awt.Color(255, 255, 255));
        jButtonGenerarPDF.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButtonGenerarPDF.setForeground(new java.awt.Color(0, 102, 0));
        jButtonGenerarPDF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/genpdf.png"))); // NOI18N
        jButtonGenerarPDF.setToolTipText("Generar PDF de cotización");
        jButtonGenerarPDF.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel4.add(jButtonGenerarPDF, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, 60, 30));

        jP1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 790, 130));

        jTSubTot.setEditable(false);
        jTSubTot.setBackground(new java.awt.Color(204, 255, 204));
        jTSubTot.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTSubTot.setForeground(new java.awt.Color(51, 51, 0));
        jTSubTot.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTSubTot.setText("$0.00");
        jTSubTot.setNextFocusableComponent(jBGuar);
        jP1.add(jTSubTot, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 550, 160, 20));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel26.setText("Sub Total:");
        jP1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 550, 110, -1));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel27.setText("Impuesto:");
        jP1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 590, 110, -1));

        jTImp.setEditable(false);
        jTImp.setBackground(new java.awt.Color(204, 255, 204));
        jTImp.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTImp.setForeground(new java.awt.Color(51, 51, 0));
        jTImp.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTImp.setText("$0.00");
        jTImp.setNextFocusableComponent(jBGuar);
        jP1.add(jTImp, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 590, 160, 20));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel28.setText("Total:");
        jP1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 610, 110, -1));

        jTTot.setEditable(false);
        jTTot.setBackground(new java.awt.Color(204, 255, 204));
        jTTot.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTTot.setForeground(new java.awt.Color(51, 51, 0));
        jTTot.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTTot.setText("$0.00");
        jTTot.setNextFocusableComponent(jBGuar);
        jP1.add(jTTot, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 610, 160, 20));

        jBTab1.setBackground(new java.awt.Color(0, 153, 153));
        jBTab1.setToolTipText("Mostrar Tabla en Grande");
        jP1.add(jBTab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 10, 20));

        jBTod.setBackground(new java.awt.Color(255, 255, 255));
        jBTod.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jBTod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/marct.png"))); // NOI18N
        jBTod.setText("Marcar todo");
        jBTod.setToolTipText("Marcar Todos los Registros de la Tabla (Alt+T)");
        jBTod.setNextFocusableComponent(jTab);
        jP1.add(jBTod, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 372, 130, 18));

        jBNew.setBackground(new java.awt.Color(255, 255, 255));
        jBNew.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBNew.setForeground(new java.awt.Color(0, 102, 0));
        jBNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/agre.png"))); // NOI18N
        jBNew.setText("Nuevo");
        jBNew.setToolTipText("Nueva Partida (Ctrl+N)");
        jBNew.setNextFocusableComponent(jBDel);
        jP1.add(jBNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 110, 20));

        jBDel.setBackground(new java.awt.Color(255, 255, 255));
        jBDel.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBDel.setForeground(new java.awt.Color(0, 102, 0));
        jBDel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/del.png"))); // NOI18N
        jBDel.setText("Borrar");
        jBDel.setToolTipText("Borrar Partida(s) (Ctrl+SUPR)");
        jBDel.setNextFocusableComponent(jBTod);
        jP1.add(jBDel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 110, 20));

        jPEnca.setBackground(new java.awt.Color(255, 255, 255));
        jPEnca.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Encabezado", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPEnca.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLEnt.setText("Fecha entrega:");
        jPEnca.add(jLEnt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 100, -1));

        jCImp.setBackground(new java.awt.Color(255, 255, 255));
        jCImp.setText("Imprimir");
        jCImp.setNextFocusableComponent(jComMon);
        jPEnca.add(jCImp, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 90, 20));

        jLabel32.setForeground(new java.awt.Color(0, 0, 255));
        jLabel32.setText("Ctrl+P");
        jPEnca.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 40, 20));

        jLabel30.setText("*Serie:");
        jPEnca.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 100, -1));

        jPEnca.add(jComSer, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 130, 20));

        jLabel29.setText("Fecha compra:");
        jPEnca.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 100, -1));

        jComMon.setName(""); // NOI18N
        jComMon.setNextFocusableComponent(jTProd);
        jPEnca.add(jComMon, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 80, 20));

        jLabel9.setText("Moneda:");
        jPEnca.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 50, 20));

        jLEnt1.setText("Fecha vencimiento:");
        jPEnca.add(jLEnt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 100, -1));

        jP1.add(jPEnca, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 20, 290, 130));
        jP1.add(jTAlma2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 370, 10, -1));

        jTComenSer.setEditable(false);
        jTComenSer.setFocusable(false);
        jP1.add(jTComenSer, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 370, 10, -1));

        jDesc.setEditable(false);
        jDesc.setBackground(new java.awt.Color(204, 255, 204));
        jDesc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jDesc.setForeground(new java.awt.Color(51, 51, 0));
        jDesc.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jDesc.setText("$0.00");
        jDesc.setNextFocusableComponent(jBGuar);
        jP1.add(jDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 570, 160, 20));

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel41.setText("Descuento:");
        jP1.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 570, 110, -1));

        jTSerProd.setEditable(false);
        jTSerProd.setFocusable(false);
        jP1.add(jTSerProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, 10, -1));

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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jP1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
       
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCarSer;
    private javax.swing.JButton jBDel;
    private javax.swing.JButton jBExisAlma;
    private javax.swing.JButton jBGranDescrip;
    private javax.swing.JButton jBGuar;
    private javax.swing.JButton jBNew;
    private javax.swing.JButton jBProd;
    private javax.swing.JButton jBProv;
    private javax.swing.JButton jBSal;
    private javax.swing.JButton jBTab1;
    private javax.swing.JButton jBTipCam;
    private javax.swing.JButton jBTod;
    private javax.swing.JButton jBUltCostT;
    private javax.swing.JButton jBUltPre;
    private javax.swing.JButton jBVeGran;
    private javax.swing.JButton jButtonGenerarPDF;
    private javax.swing.JCheckBox jCCo1;
    private javax.swing.JCheckBox jCCo2;
    private javax.swing.JCheckBox jCCo3;
    private javax.swing.JCheckBox jCGua;
    private javax.swing.JCheckBox jCImp;
    private javax.swing.JComboBox jComAlma;
    private javax.swing.JComboBox jComColo;
    private javax.swing.JComboBox jComImp;
    private javax.swing.JComboBox jComMon;
    private javax.swing.JComboBox jComSer;
    private javax.swing.JComboBox jComTall;
    private javax.swing.JComboBox jComUnid;
    private javax.swing.JTextField jDesc;
    private javax.swing.JLabel jLEnt;
    private javax.swing.JLabel jLEnt1;
    private javax.swing.JLabel jLImg;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jP1;
    private javax.swing.JPanel jPEnca;
    private javax.swing.JPanel jPanImg;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jSImg;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTAlma2;
    private javax.swing.JTextField jTCant;
    private javax.swing.JTextField jTCarSer;
    private javax.swing.JTextField jTCo1;
    private javax.swing.JTextField jTCo2;
    private javax.swing.JTextField jTCo3;
    private javax.swing.JTextField jTCodOp1;
    private javax.swing.JTextField jTCodOpl2;
    private javax.swing.JTextField jTCodProv1;
    private javax.swing.JTextField jTCodProv2;
    private javax.swing.JTextField jTComenSer;
    private javax.swing.JTextField jTCost;
    private javax.swing.JTextField jTDesc;
    private javax.swing.JTextField jTDescAd;
    private javax.swing.JTextField jTDescrip;
    private javax.swing.JTextField jTDescripAlma;
    private javax.swing.JTextField jTDescripColo;
    private javax.swing.JTextField jTDescripTall;
    private javax.swing.JTextField jTDescripUnid;
    private javax.swing.JTextField jTExist;
    private javax.swing.JTextField jTExistAlma;
    private javax.swing.JTextField jTGaran;
    private javax.swing.JTextField jTImp;
    private javax.swing.JTextField jTLot;
    private javax.swing.JTextField jTNoDoc;
    private javax.swing.JTextField jTNom;
    private javax.swing.JTextField jTPedimen;
    private javax.swing.JTextField jTProd;
    private javax.swing.JTextField jTProv;
    private javax.swing.JTextField jTSer;
    private javax.swing.JTextField jTSerProd;
    private javax.swing.JTextField jTSubTot;
    private javax.swing.JTextField jTTot;
    private javax.swing.JTextField jTValImp;
    private javax.swing.JTable jTab;
    // End of variables declaration//GEN-END:variables

}/*Fin de public class Clientes extends javax.swing.JFrame */
