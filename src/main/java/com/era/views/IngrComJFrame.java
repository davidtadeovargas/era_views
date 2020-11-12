package com.era.views;

public abstract class IngrComJFrame extends BaseJFrame 
{
    public IngrComJFrame(final String idTextTitleWindow){
        
        super(idTextTitleWindow);
        
        initComponents();
        
        postInitComponents();
        
        this.getRootPane().setDefaultButton(jBGuar);
    }
        

            
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jP1 = new javax.swing.JPanel();
        jBGuar = new javax.swing.JButton();
        jBSal = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePartidas = new javax.swing.JTable();
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
        jBGranDescrip = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        jTGaran = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jBUltCostT = new javax.swing.JButton();
        jLabel40 = new javax.swing.JLabel();
        jComAlma = new javax.swing.JComboBox();
        jTDescripAlma = new javax.swing.JTextField();
        jBExisAlma = new javax.swing.JButton();
        jBCarg = new javax.swing.JButton();
        jBLimp = new javax.swing.JButton();
        jBTipCam = new javax.swing.JButton();
        jTCarSer = new javax.swing.JTextField();
        jBCarSer = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jTCuentaCont = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        jBCuentaCont = new javax.swing.JButton();
        jBtnReferencia1 = new javax.swing.JButton();
        jTActivo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jTLot = new javax.swing.JTextField();
        jTPedimen = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cbAduana = new javax.swing.JComboBox();
        txtAduana = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldNumeroDocumento = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldProveedor = new javax.swing.JTextField();
        jBProv = new javax.swing.JButton();
        jTextFieldCondiciones = new javax.swing.JTextField();
        jCheckBoxContado = new javax.swing.JCheckBox();
        jTextFieldSerieProveedor = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jCCo1 = new javax.swing.JCheckBox();
        jTextFieldCorreo1 = new javax.swing.JTextField();
        jCCo2 = new javax.swing.JCheckBox();
        jTextFieldCorreo2 = new javax.swing.JTextField();
        jCCo3 = new javax.swing.JCheckBox();
        jTextFieldCorreo3 = new javax.swing.JTextField();
        jCGua = new javax.swing.JCheckBox();
        jLGua = new javax.swing.JLabel();
        jLGua1 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jTextFieldMetodoPago = new javax.swing.JTextField();
        jTextFieldCuenta = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cmbFormaPago = new javax.swing.JComboBox();
        jBGenPDF = new javax.swing.JButton();
        jTSubTot = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jTextFieldImpuesto = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jTTot = new javax.swing.JTextField();
        jBNew = new javax.swing.JButton();
        jBDel = new javax.swing.JButton();
        jPEnca = new javax.swing.JPanel();
        jLEnt = new javax.swing.JLabel();
        jCOrd = new javax.swing.JCheckBox();
        jLabel31 = new javax.swing.JLabel();
        jCImp = new javax.swing.JCheckBox();
        jLabel32 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jComboBoxSerieCompra = new javax.swing.JComboBox();
        jLabel29 = new javax.swing.JLabel();
        jComboBoxMonedas = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jCEnvCorreo = new javax.swing.JCheckBox();
        jTAlma2 = new javax.swing.JTextField();
        jTComenSer = new javax.swing.JTextField();
        jLNot = new javax.swing.JLabel();
        jLTipVta = new javax.swing.JLabel();
        jLTotSald = new javax.swing.JLabel();
        jTTotSald = new javax.swing.JTextField();
        jTextFieldTotalDescuento = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jTSerProd = new javax.swing.JTextField();
        jTRetencion = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jComImp = new javax.swing.JComboBox();
        jTValImp = new javax.swing.JTextField();

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
        jP1.add(jBGuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, 120, 30));

        jBSal.setBackground(new java.awt.Color(255, 255, 255));
        jBSal.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBSal.setForeground(new java.awt.Color(0, 102, 0));
        jBSal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/sal.png"))); // NOI18N
        jBSal.setText("Salir");
        jBSal.setToolTipText("Salir (ESC)");
        jBSal.setNextFocusableComponent(jTextFieldProveedor);
        jP1.add(jBSal, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 560, 120, 30));

        jTablePartidas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Cod. Producto", "Cant.", "Unidad", "Almacén", "Descripción", "Costo", "Descuento", "Desc. Adicional", "Impuesto", "Impuesto valor", "Importe", "Talla", "Color", "Lote", "Pedimento", "Fecha Caducidad", "Serie Producto", "Comentario Serie", "Garantía", "Importe impuesto", "Cuenta Contable", "Activo", "Aduana"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTablePartidas.setGridColor(new java.awt.Color(255, 255, 255));
        jTablePartidas.setNextFocusableComponent(jBGuar);
        jScrollPane1.setViewportView(jTablePartidas);

        jP1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 1090, 150));

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
        jPanel2.add(jTExist, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 40, 90, 20));

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
        jBUltPre.setNextFocusableComponent(jTGaran);
        jPanel2.add(jBUltPre, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, 40, 40));

        jComTall.setNextFocusableComponent(jComColo);
        jPanel2.add(jComTall, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 60, 90, 20));

        jLabel34.setText("Garantía:");
        jPanel2.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, 100, -1));

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

        jBGranDescrip.setBackground(new java.awt.Color(0, 153, 153));
        jBGranDescrip.setToolTipText("Ver/Modificar Descripción en Grande");
        jPanel2.add(jBGranDescrip, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 10, 20));

        jLabel36.setText("Cantidad:");
        jPanel2.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 100, 100, -1));

        jTGaran.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTGaran.setNextFocusableComponent(jComTall);
        jPanel2.add(jTGaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, 190, 20));

        jLabel39.setText("Existencia:");
        jPanel2.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 40, 100, -1));

        jBUltCostT.setBackground(new java.awt.Color(255, 255, 255));
        jBUltCostT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/ultcostpt.png"))); // NOI18N
        jBUltCostT.setToolTipText("Ultimos 100 Precios de Compra de todos los Proveedores");
        jBUltCostT.setNextFocusableComponent(jBUltPre);
        jPanel2.add(jBUltCostT, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, 40, 40));

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

        jBCarg.setBackground(new java.awt.Color(255, 255, 255));
        jBCarg.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jBCarg.setText("Cargar");
        jBCarg.setToolTipText("Cargar archivos de la compra");
        jBCarg.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBCarg.setName(""); // NOI18N
        jBCarg.setNextFocusableComponent(jBLimp);
        jPanel2.add(jBCarg, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 70, -1));

        jBLimp.setBackground(new java.awt.Color(255, 255, 255));
        jBLimp.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jBLimp.setText("Limpiar");
        jBLimp.setToolTipText("Limpiar lista de archivos seleccionados");
        jBLimp.setNextFocusableComponent(jBTipCam);
        jPanel2.add(jBLimp, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, 70, 20));

        jBTipCam.setBackground(new java.awt.Color(255, 255, 255));
        jBTipCam.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBTipCam.setForeground(new java.awt.Color(0, 102, 0));
        jBTipCam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/dol.png"))); // NOI18N
        jBTipCam.setToolTipText("Definir el tipo de cambio dollar del dìa");
        jBTipCam.setNextFocusableComponent(jBUltCostT);
        jBTipCam.setOpaque(false);
        jPanel2.add(jBTipCam, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, 40, 40));

        jTCarSer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTCarSer.setNextFocusableComponent(jBNew);
        jPanel2.add(jTCarSer, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 160, 160, 20));

        jBCarSer.setBackground(new java.awt.Color(255, 255, 255));
        jBCarSer.setText("..");
        jBCarSer.setToolTipText("Buscar archivo EXCEL para series con dos columnas");
        jBCarSer.setNextFocusableComponent(jTCarSer);
        jPanel2.add(jBCarSer, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 160, 30, 20));

        jLabel14.setText("Importar números de serie:");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 140, 150, 20));

        jTCuentaCont.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPanel2.add(jTCuentaCont, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 140, 20));

        jLabel53.setText("Cuenta Contable:");
        jPanel2.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 100, 20));

        jBCuentaCont.setBackground(new java.awt.Color(255, 255, 255));
        jBCuentaCont.setText("jButton1");
        jBCuentaCont.setToolTipText("Búscar Listas de Precio");
        jBCuentaCont.setName(""); // NOI18N
        jPanel2.add(jBCuentaCont, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 30, 20));

        jBtnReferencia1.setText("jButton1");
        jPanel2.add(jBtnReferencia1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 30, 20));

        jTActivo.setEditable(false);
        jPanel2.add(jTActivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 140, 20));

        jLabel3.setText("Activo");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 185, 100, -1));

        jLabel43.setText("Impuestos:");
        jPanel2.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 110, -1));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setText("+");
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 120, 20));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Lotes y Pedimento"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Aduana:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 45, -1, -1));

        jLabel38.setText("Lote:");
        jPanel1.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 30, -1));

        jLabel37.setText("Fecha caducidad:");
        jPanel1.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 65, 90, -1));

        jTLot.setToolTipText("Lote");
        jTLot.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTLot.setNextFocusableComponent(jTPedimen);
        jPanel1.add(jTLot, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 90, 20));

        jTPedimen.setToolTipText("Pedimento");
        jTPedimen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPanel1.add(jTPedimen, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 100, 20));

        jLabel7.setText("Pedimento:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 70, 20));

        jPanel1.add(cbAduana, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 45, 60, -1));
        jPanel1.add(txtAduana, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 45, 150, -1));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 140, 330, 90));

        jP1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 1090, 230));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos del Proveedor", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("Cod. Proveedor:");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 190, 110, -1));

        jLabel6.setText("*Cod. proveedor:");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 110, -1));

        jTextFieldNumeroDocumento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPanel4.add(jTextFieldNumeroDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 90, 20));

        jLabel2.setText("Crédito:");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 80, -1));

        jLabel20.setText("*Folio documento:");
        jPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 110, -1));

        jTextFieldNombre.setEditable(false);
        jTextFieldNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTextFieldNombre.setNextFocusableComponent(jTextFieldNumeroDocumento);
        jPanel4.add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 370, 20));

        jTextFieldProveedor.setBackground(new java.awt.Color(204, 255, 204));
        jTextFieldProveedor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTextFieldProveedor.setNextFocusableComponent(jBProv);
        jPanel4.add(jTextFieldProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 90, 20));

        jBProv.setBackground(new java.awt.Color(255, 255, 255));
        jBProv.setText("...");
        jBProv.setToolTipText("Buscar Proveedor(es)");
        jBProv.setNextFocusableComponent(jTextFieldSerieProveedor);
        jPanel4.add(jBProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 30, 20));

        jTextFieldCondiciones.setEditable(false);
        jTextFieldCondiciones.setBackground(new java.awt.Color(255, 255, 204));
        jTextFieldCondiciones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTextFieldCondiciones.setFocusable(false);
        jTextFieldCondiciones.setNextFocusableComponent(jCCo1);
        jPanel4.add(jTextFieldCondiciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, 370, 20));

        jCheckBoxContado.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBoxContado.setText("Contado ");
        jPanel4.add(jCheckBoxContado, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 80, -1));

        jTextFieldSerieProveedor.setEditable(false);
        jTextFieldSerieProveedor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTextFieldSerieProveedor.setNextFocusableComponent(jTextFieldNombre);
        jPanel4.add(jTextFieldSerieProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 60, 20));

        jLabel33.setText("Nombre:");
        jPanel4.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 80, -1));

        jCCo1.setBackground(new java.awt.Color(255, 255, 255));
        jCCo1.setSelected(true);
        jCCo1.setText("Correo 1");
        jCCo1.setNextFocusableComponent(jTextFieldCorreo1);
        jPanel4.add(jCCo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 100, 20));

        jTextFieldCorreo1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTextFieldCorreo1.setNextFocusableComponent(jCheckBoxContado);
        jPanel4.add(jTextFieldCorreo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 180, 20));

        jCCo2.setBackground(new java.awt.Color(255, 255, 255));
        jCCo2.setText("Correo 2");
        jCCo2.setNextFocusableComponent(jTextFieldCorreo2);
        jCCo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCCo2ActionPerformed(evt);
            }
        });
        jPanel4.add(jCCo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 110, 20));

        jTextFieldCorreo2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTextFieldCorreo2.setNextFocusableComponent(jCGua);
        jPanel4.add(jTextFieldCorreo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 180, 20));

        jCCo3.setBackground(new java.awt.Color(255, 255, 255));
        jCCo3.setText("Correo 3");
        jCCo3.setNextFocusableComponent(jTextFieldCorreo3);
        jPanel4.add(jCCo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 110, 20));

        jTextFieldCorreo3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPanel4.add(jTextFieldCorreo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 180, 20));

        jCGua.setBackground(new java.awt.Color(255, 255, 255));
        jCGua.setText("Modificar proveedor");
        jPanel4.add(jCGua, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 160, 20));

        jLGua.setForeground(new java.awt.Color(0, 0, 255));
        jLGua.setText("F8");
        jPanel4.add(jLGua, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, 60, 20));

        jLGua1.setForeground(new java.awt.Color(0, 0, 255));
        jLGua1.setText("Alt+G");
        jPanel4.add(jLGua1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 70, -1));

        jLabel44.setText("Forma pago:");
        jPanel4.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 60, 100, -1));

        jTextFieldMetodoPago.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTextFieldMetodoPago.setNextFocusableComponent(jCCo2);
        jPanel4.add(jTextFieldMetodoPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 60, 120, 20));

        jTextFieldCuenta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTextFieldCuenta.setNextFocusableComponent(cmbFormaPago);
        jPanel4.add(jTextFieldCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 80, 120, 20));

        jLabel48.setText("Cuenta:");
        jPanel4.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, 100, -1));

        jLabel13.setText("Método pago:");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 100, 100, -1));

        cmbFormaPago.setNextFocusableComponent(jCCo3);
        jPanel4.add(cmbFormaPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 100, 120, 20));

        jBGenPDF.setBackground(new java.awt.Color(255, 255, 255));
        jBGenPDF.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBGenPDF.setForeground(new java.awt.Color(0, 102, 0));
        jBGenPDF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/pdf.png"))); // NOI18N
        jBGenPDF.setToolTipText("Generar PDF de documento");
        jBGenPDF.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBGenPDF.setName(""); // NOI18N
        jPanel4.add(jBGenPDF, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 60, 30));

        jP1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 790, 150));

        jTSubTot.setEditable(false);
        jTSubTot.setBackground(new java.awt.Color(204, 255, 204));
        jTSubTot.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTSubTot.setForeground(new java.awt.Color(51, 51, 0));
        jTSubTot.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTSubTot.setText("$0.00");
        jTSubTot.setNextFocusableComponent(jBGuar);
        jP1.add(jTSubTot, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 560, 160, 20));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel26.setText("Sub Total:");
        jP1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 560, 110, -1));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel27.setText("Retención:");
        jP1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 620, 110, -1));

        jTextFieldImpuesto.setEditable(false);
        jTextFieldImpuesto.setBackground(new java.awt.Color(204, 255, 204));
        jTextFieldImpuesto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldImpuesto.setForeground(new java.awt.Color(51, 51, 0));
        jTextFieldImpuesto.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldImpuesto.setText("$0.00");
        jTextFieldImpuesto.setNextFocusableComponent(jBGuar);
        jP1.add(jTextFieldImpuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 600, 160, 20));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel28.setText("Total:");
        jP1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 640, 110, -1));

        jTTot.setEditable(false);
        jTTot.setBackground(new java.awt.Color(204, 255, 204));
        jTTot.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTTot.setForeground(new java.awt.Color(51, 51, 0));
        jTTot.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTTot.setText("$0.00");
        jTTot.setNextFocusableComponent(jBGuar);
        jP1.add(jTTot, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 640, 160, 20));

        jBNew.setBackground(new java.awt.Color(255, 255, 255));
        jBNew.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBNew.setForeground(new java.awt.Color(0, 102, 0));
        jBNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/agre.png"))); // NOI18N
        jBNew.setText("Nuevo");
        jBNew.setToolTipText("Nueva Partida (Ctrl+N)");
        jBNew.setNextFocusableComponent(jBDel);
        jP1.add(jBNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 110, 20));

        jBDel.setBackground(new java.awt.Color(255, 255, 255));
        jBDel.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBDel.setForeground(new java.awt.Color(0, 102, 0));
        jBDel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/del.png"))); // NOI18N
        jBDel.setText("Borrar");
        jBDel.setToolTipText("Borrar Partida(s) (Ctrl+SUPR)");
        jP1.add(jBDel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, 110, 20));

        jPEnca.setBackground(new java.awt.Color(255, 255, 255));
        jPEnca.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Encabezado", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPEnca.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLEnt.setText("Fecha entrega:");
        jPEnca.add(jLEnt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 100, -1));

        jCOrd.setBackground(new java.awt.Color(255, 255, 255));
        jCOrd.setText("Orden de compra");
        jCOrd.setNextFocusableComponent(jCImp);
        jPEnca.add(jCOrd, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, 20));

        jLabel31.setForeground(new java.awt.Color(0, 0, 255));
        jLabel31.setText("Altl+O");
        jPEnca.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 80, 20));

        jCImp.setBackground(new java.awt.Color(255, 255, 255));
        jCImp.setText("Imprimir");
        jCImp.setNextFocusableComponent(jComboBoxMonedas);
        jPEnca.add(jCImp, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 80, 20));

        jLabel32.setForeground(new java.awt.Color(0, 0, 255));
        jLabel32.setText("Ctrl+P");
        jPEnca.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 60, 20));

        jLabel30.setText("*Serie:");
        jPEnca.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 100, -1));

        jComboBoxSerieCompra.setNextFocusableComponent(jCOrd);
        jPEnca.add(jComboBoxSerieCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 130, 20));

        jLabel29.setText("Fecha compra:");
        jPEnca.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 100, -1));

        jComboBoxMonedas.setName(""); // NOI18N
        jComboBoxMonedas.setNextFocusableComponent(jTProd);
        jPEnca.add(jComboBoxMonedas, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 80, 20));

        jLabel9.setText("Moneda:");
        jPEnca.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 80, 20));

        jCEnvCorreo.setBackground(new java.awt.Color(255, 255, 255));
        jCEnvCorreo.setText("Enviar Correo");
        jCEnvCorreo.setNextFocusableComponent(jCImp);
        jPEnca.add(jCEnvCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, 20));

        jP1.add(jPEnca, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 10, 290, 150));
        jP1.add(jTAlma2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 380, 10, -1));

        jTComenSer.setEditable(false);
        jTComenSer.setFocusable(false);
        jP1.add(jTComenSer, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 380, 10, -1));

        jLNot.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLNot.setForeground(new java.awt.Color(204, 0, 0));
        jLNot.setText("NUEVA COMPRA");
        jLNot.setFocusable(false);
        jP1.add(jLNot, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 560, 420, -1));

        jLTipVta.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLTipVta.setText("COMPRA A CRÉDITO");
        jLTipVta.setFocusable(false);
        jP1.add(jLTipVta, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 600, 500, -1));

        jLTotSald.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLTotSald.setForeground(new java.awt.Color(204, 0, 51));
        jLTotSald.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLTotSald.setText("Total a pagar:");
        jP1.add(jLTotSald, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 660, 160, 20));

        jTTotSald.setEditable(false);
        jTTotSald.setBackground(new java.awt.Color(255, 204, 204));
        jTTotSald.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTTotSald.setForeground(new java.awt.Color(51, 51, 0));
        jTTotSald.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTTotSald.setText("$0.00");
        jP1.add(jTTotSald, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 660, 160, 20));

        jTextFieldTotalDescuento.setEditable(false);
        jTextFieldTotalDescuento.setBackground(new java.awt.Color(204, 255, 204));
        jTextFieldTotalDescuento.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldTotalDescuento.setForeground(new java.awt.Color(51, 51, 0));
        jTextFieldTotalDescuento.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldTotalDescuento.setText("$0.00");
        jTextFieldTotalDescuento.setNextFocusableComponent(jBGuar);
        jP1.add(jTextFieldTotalDescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 580, 160, 20));

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel41.setText("Descuento:");
        jP1.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 580, 110, -1));

        jTSerProd.setEditable(false);
        jTSerProd.setFocusable(false);
        jP1.add(jTSerProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 380, 10, -1));

        jTRetencion.setEditable(false);
        jTRetencion.setBackground(new java.awt.Color(204, 255, 204));
        jTRetencion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTRetencion.setForeground(new java.awt.Color(51, 51, 0));
        jTRetencion.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTRetencion.setText("$0.00");
        jTRetencion.setNextFocusableComponent(jBGuar);
        jP1.add(jTRetencion, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 620, 160, 20));

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel42.setText("Impuesto:");
        jP1.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 600, 110, -1));

        jLabel17.setText("Cod. impuesto:");
        jP1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 110, -1));

        jComImp.setNextFocusableComponent(jTValImp);
        jP1.add(jComImp, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 430, 120, 20));

        jTValImp.setEditable(false);
        jTValImp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTValImp.setNextFocusableComponent(jBCarg);
        jP1.add(jTValImp, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 430, 140, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jP1, javax.swing.GroupLayout.DEFAULT_SIZE, 1119, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jP1, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCCo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCCo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCCo2ActionPerformed
   
    
       
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cbAduana;
    protected javax.swing.JComboBox cmbFormaPago;
    protected javax.swing.JButton jBCarSer;
    protected javax.swing.JButton jBCarg;
    protected javax.swing.JButton jBCuentaCont;
    protected javax.swing.JButton jBDel;
    protected javax.swing.JButton jBExisAlma;
    protected javax.swing.JButton jBGenPDF;
    protected javax.swing.JButton jBGranDescrip;
    protected javax.swing.JButton jBGuar;
    protected javax.swing.JButton jBLimp;
    protected javax.swing.JButton jBNew;
    protected javax.swing.JButton jBProd;
    protected javax.swing.JButton jBProv;
    protected javax.swing.JButton jBSal;
    protected javax.swing.JButton jBTipCam;
    protected javax.swing.JButton jBUltCostT;
    protected javax.swing.JButton jBUltPre;
    protected javax.swing.JButton jBVeGran;
    protected javax.swing.JButton jBtnReferencia1;
    protected javax.swing.JButton jButton2;
    protected javax.swing.JCheckBox jCCo1;
    protected javax.swing.JCheckBox jCCo2;
    protected javax.swing.JCheckBox jCCo3;
    protected javax.swing.JCheckBox jCEnvCorreo;
    protected javax.swing.JCheckBox jCGua;
    protected javax.swing.JCheckBox jCImp;
    protected javax.swing.JCheckBox jCOrd;
    protected javax.swing.JCheckBox jCheckBoxContado;
    protected javax.swing.JComboBox jComAlma;
    protected javax.swing.JComboBox jComColo;
    protected javax.swing.JComboBox jComImp;
    protected javax.swing.JComboBox jComTall;
    protected javax.swing.JComboBox jComUnid;
    protected javax.swing.JComboBox jComboBoxMonedas;
    protected javax.swing.JComboBox jComboBoxSerieCompra;
    protected javax.swing.JLabel jLEnt;
    protected javax.swing.JLabel jLGua;
    protected javax.swing.JLabel jLGua1;
    private javax.swing.JLabel jLImg;
    protected javax.swing.JLabel jLNot;
    protected javax.swing.JLabel jLTipVta;
    protected javax.swing.JLabel jLTotSald;
    private javax.swing.JLabel jLabel1;
    protected javax.swing.JLabel jLabel10;
    protected javax.swing.JLabel jLabel11;
    protected javax.swing.JLabel jLabel12;
    protected javax.swing.JLabel jLabel13;
    protected javax.swing.JLabel jLabel14;
    protected javax.swing.JLabel jLabel15;
    protected javax.swing.JLabel jLabel16;
    protected javax.swing.JLabel jLabel17;
    protected javax.swing.JLabel jLabel19;
    protected javax.swing.JLabel jLabel2;
    protected javax.swing.JLabel jLabel20;
    protected javax.swing.JLabel jLabel23;
    protected javax.swing.JLabel jLabel24;
    protected javax.swing.JLabel jLabel25;
    protected javax.swing.JLabel jLabel26;
    protected javax.swing.JLabel jLabel27;
    protected javax.swing.JLabel jLabel28;
    protected javax.swing.JLabel jLabel29;
    protected javax.swing.JLabel jLabel3;
    protected javax.swing.JLabel jLabel30;
    protected javax.swing.JLabel jLabel31;
    protected javax.swing.JLabel jLabel32;
    protected javax.swing.JLabel jLabel33;
    protected javax.swing.JLabel jLabel34;
    protected javax.swing.JLabel jLabel35;
    protected javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    protected javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    protected javax.swing.JLabel jLabel40;
    protected javax.swing.JLabel jLabel41;
    protected javax.swing.JLabel jLabel42;
    protected javax.swing.JLabel jLabel43;
    protected javax.swing.JLabel jLabel44;
    protected javax.swing.JLabel jLabel48;
    protected javax.swing.JLabel jLabel5;
    protected javax.swing.JLabel jLabel53;
    protected javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    protected javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jP1;
    protected javax.swing.JPanel jPEnca;
    private javax.swing.JPanel jPanImg;
    protected javax.swing.JPanel jPanel1;
    protected javax.swing.JPanel jPanel2;
    protected javax.swing.JPanel jPanel4;
    protected javax.swing.JScrollPane jSImg;
    protected javax.swing.JScrollPane jScrollPane1;
    protected javax.swing.JTextField jTActivo;
    protected javax.swing.JTextField jTAlma2;
    protected javax.swing.JTextField jTCant;
    protected javax.swing.JTextField jTCarSer;
    protected javax.swing.JTextField jTCodOp1;
    protected javax.swing.JTextField jTCodOpl2;
    protected javax.swing.JTextField jTCodProv1;
    protected javax.swing.JTextField jTCodProv2;
    protected javax.swing.JTextField jTComenSer;
    protected javax.swing.JTextField jTCost;
    protected javax.swing.JTextField jTCuentaCont;
    protected javax.swing.JTextField jTDesc;
    protected javax.swing.JTextField jTDescAd;
    protected javax.swing.JTextField jTDescrip;
    protected javax.swing.JTextField jTDescripAlma;
    protected javax.swing.JTextField jTDescripColo;
    protected javax.swing.JTextField jTDescripTall;
    protected javax.swing.JTextField jTDescripUnid;
    protected javax.swing.JTextField jTExist;
    protected javax.swing.JTextField jTGaran;
    private javax.swing.JTextField jTLot;
    private javax.swing.JTextField jTPedimen;
    protected javax.swing.JTextField jTProd;
    protected javax.swing.JTextField jTRetencion;
    protected javax.swing.JTextField jTSerProd;
    protected javax.swing.JTextField jTSubTot;
    protected javax.swing.JTextField jTTot;
    protected javax.swing.JTextField jTTotSald;
    protected javax.swing.JTextField jTValImp;
    private javax.swing.JTable jTablePartidas;
    protected javax.swing.JTextField jTextFieldCondiciones;
    protected javax.swing.JTextField jTextFieldCorreo1;
    protected javax.swing.JTextField jTextFieldCorreo2;
    protected javax.swing.JTextField jTextFieldCorreo3;
    protected javax.swing.JTextField jTextFieldCuenta;
    protected javax.swing.JTextField jTextFieldImpuesto;
    protected javax.swing.JTextField jTextFieldMetodoPago;
    protected javax.swing.JTextField jTextFieldNombre;
    protected javax.swing.JTextField jTextFieldNumeroDocumento;
    protected javax.swing.JTextField jTextFieldProveedor;
    protected javax.swing.JTextField jTextFieldSerieProveedor;
    protected javax.swing.JTextField jTextFieldTotalDescuento;
    private javax.swing.JTextField txtAduana;
    // End of variables declaration//GEN-END:variables

}/*Fin de public class Clientes extends javax.swing.JFrame */
