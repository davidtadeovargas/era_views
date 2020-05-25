package com.era.views;


public abstract class NewVtaJFrame extends BaseJFrame
{        
    
    public NewVtaJFrame(final String idTextTitleWindow) {
        
        super(idTextTitleWindow);
        
        initComponents();
        
        postInitComponents();
    }
                    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jP1 = new javax.swing.JPanel();
        jBGuar = new javax.swing.JButton();
        jBSal = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePartidas = new javax.swing.JTable();
        jPParts = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTDesc = new javax.swing.JTextField();
        jComUnid = new javax.swing.JComboBox();
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
        jBUltPre = new javax.swing.JButton();
        jBList = new javax.swing.JButton();
        jBVeGran = new javax.swing.JButton();
        jBTipCam = new javax.swing.JButton();
        jSImg = new javax.swing.JScrollPane();
        jPanImg = new javax.swing.JPanel();
        jLImg = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jBGranDescrip = new javax.swing.JButton();
        jBUltCostT = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jComboBoxAlmacenes = new javax.swing.JComboBox();
        jBExisAlma = new javax.swing.JButton();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jTCuentaCont = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        jBCuentaCont = new javax.swing.JButton();
        jBtnReferencia = new javax.swing.JButton();
        jTReferencia = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTxtCodOpc = new javax.swing.JTextField();
        jLblCodigoOpcional = new javax.swing.JLabel();
        jBDatsCarta = new javax.swing.JButton();
        jPClien = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jTCo1 = new javax.swing.JTextField();
        jTextFieldCalle = new javax.swing.JTextField();
        jTCol = new javax.swing.JTextField();
        jTTel = new javax.swing.JTextField();
        jTPai = new javax.swing.JTextField();
        jTCP = new javax.swing.JTextField();
        jTNoExt = new javax.swing.JTextField();
        jTNoInt = new javax.swing.JTextField();
        jTRFC = new javax.swing.JTextField();
        jTCiu = new javax.swing.JTextField();
        jTEstad = new javax.swing.JTextField();
        jCGDats = new javax.swing.JCheckBox();
        jTCo3 = new javax.swing.JTextField();
        jCCo3 = new javax.swing.JCheckBox();
        jTCo2 = new javax.swing.JTextField();
        jCCo1 = new javax.swing.JCheckBox();
        jCCo2 = new javax.swing.JCheckBox();
        jTextFieldCliente = new javax.swing.JTextField();
        jButtonBuscarCliente = new javax.swing.JButton();
        jTNom = new javax.swing.JTextField();
        jTCond = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jCConta = new javax.swing.JCheckBox();
        jTListEmp = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        jTextFieldSerieCliente = new javax.swing.JTextField();
        jBDom = new javax.swing.JButton();
        jLabel41 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jButtonBuscarPedidos = new javax.swing.JButton();
        jButtonBuscarRemisiones = new javax.swing.JButton();
        jBGenPDF = new javax.swing.JButton();
        jTSubTot = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        campo_impuesto = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jTTot = new javax.swing.JTextField();
        jTSaldDispo = new javax.swing.JTextField();
        jTLimCred = new javax.swing.JTextField();
        jBTab1 = new javax.swing.JButton();
        jTDiaCre = new javax.swing.JTextField();
        jBTod = new javax.swing.JButton();
        jBNew = new javax.swing.JButton();
        jBDel = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jComboBoxSerie = new javax.swing.JComboBox();
        jLabel44 = new javax.swing.JLabel();
        jLUsoCfdi = new javax.swing.JLabel();
        jTCta = new javax.swing.JTextField();
        jCGuaPag = new javax.swing.JCheckBox();
        jCMand = new javax.swing.JCheckBox();
        jCImp = new javax.swing.JCheckBox();
        jCMostA = new javax.swing.JCheckBox();
        jCheckboxTimbrar = new javax.swing.JCheckBox();
        jCFExt = new javax.swing.JCheckBox();
        jLabel40 = new javax.swing.JLabel();
        jSObserv = new javax.swing.JScrollPane();
        jTAObserv = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jComboboxMonedas = new javax.swing.JComboBox();
        jLabel18 = new javax.swing.JLabel();
        jComboBoxMetodoPago = new javax.swing.JComboBox();
        jComboBoxFormaPago = new javax.swing.JComboBox();
        jUsoCFDI = new javax.swing.JComboBox<String>();
        jLabel54 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtLugarExped = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jTFilt = new javax.swing.JTextField();
        jBFilt = new javax.swing.JButton();
        jLabel48 = new javax.swing.JLabel();
        jTTipoRelacion = new javax.swing.JTextField();
        jBTipoRelacion = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        JTFecha = new javax.swing.JTextField();
        jCCartaP = new javax.swing.JCheckBox();
        jTAlma2 = new javax.swing.JTextField();
        jTCadu = new javax.swing.JTextField();
        jTId = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jTTotDesc = new javax.swing.JTextField();
        jTComenSer = new javax.swing.JTextField();
        jTGara = new javax.swing.JTextField();
        jTTotCost = new javax.swing.JTextField();
        jScrTab = new javax.swing.JScrollPane();
        jTabDir = new javax.swing.JTable();
        jTEsKit = new javax.swing.JTextField();
        jLTipVta = new javax.swing.JLabel();
        jTTotSald = new javax.swing.JTextField();
        jLTotSald = new javax.swing.JLabel();
        jLNot = new javax.swing.JLabel();
        jTCantLot = new javax.swing.JTextField();
        jTSerProd = new javax.swing.JTextField();
        jRPagad = new javax.swing.JRadioButton();
        jRNoPag = new javax.swing.JRadioButton();
        jTextFieldVendedor = new javax.swing.JTextField();
        jBVend = new javax.swing.JButton();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        campo_retencion = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jBCarSer = new javax.swing.JButton();
        jTCarSer = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jComTall = new javax.swing.JComboBox();
        jTDescripTall = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jComColo = new javax.swing.JComboBox();
        jTDescripColo = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        jTKit = new javax.swing.JTextField();
        jCBack = new javax.swing.JCheckBox();
        jCheckboxRemision = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jTLot = new javax.swing.JTextField();
        jTPedimen = new javax.swing.JTextField();
        jbLotPed = new javax.swing.JButton();
        btnPrevio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        
        jP1.setBackground(new java.awt.Color(255, 255, 255));
        jP1.setEnabled(false);
        jP1.setFocusable(false);
        jP1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBGuar.setBackground(new java.awt.Color(255, 255, 255));
        jBGuar.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBGuar.setForeground(new java.awt.Color(0, 102, 0));
        jBGuar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/save.png"))); // NOI18N
        jBGuar.setText("Guardar");
        jBGuar.setToolTipText("Guardar");
        jBGuar.setNextFocusableComponent(jBSal);
        jP1.add(jBGuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 600, 120, -1));

        jBSal.setBackground(new java.awt.Color(255, 255, 255));
        jBSal.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBSal.setForeground(new java.awt.Color(0, 102, 0));
        jBSal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/sal.png"))); // NOI18N
        jBSal.setText("Salir");
        jBSal.setToolTipText("Salir (ESC)");
        jBSal.setNextFocusableComponent(jRPagad);
        jP1.add(jBSal, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 600, 120, -1));

        jTablePartidas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Cod. Producto", "Cant.", "Unidad", "Almacèn", "Lista", "Descripción", "Precio", "Descuento", "Impuesto", "Importe", "Es Kit", "Total Impuesto", "Talla", "Color", "Lote", "Pedimento", "Caducidad", "ID", "Backorder", "Importe Descuento ", "Serie Producto", "Comentario Serie", "Garantía", "Costo", "Cantlotori", "Cod.Impuesto", "Activo", "Cuenta Contable", "Codigo Opcional", "Guid"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, true, true, true, true, true, false, false, true, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTablePartidas.setGridColor(new java.awt.Color(255, 255, 255));
        jTablePartidas.setNextFocusableComponent(jBGuar);
        jTablePartidas.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        jScrollPane1.setViewportView(jTablePartidas);

        jP1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 980, 130));

        jPParts.setBackground(new java.awt.Color(255, 255, 255));
        jPParts.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos del Producto", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPParts.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setText("Precio:");
        jPParts.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 60, -1));

        jLabel11.setText("Desc.%:");
        jPParts.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 60, -1));

        jTDesc.setText("0");
        jTDesc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTDesc.setNextFocusableComponent(jTCant);
        jPParts.add(jTDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 80, 20));

        jComUnid.setNextFocusableComponent(jTDescripUni);
        jPParts.add(jComUnid, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 90, 20));

        jTDescrip.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTDescrip.setNextFocusableComponent(jComboBoxAlmacenes);
        jPParts.add(jTDescrip, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 210, 20));

        jTPre.setText("$0.00");
        jTPre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTPre.setNextFocusableComponent(jTDesc);
        jPParts.add(jTPre, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 80, 20));

        jTCant.setText("1");
        jTCant.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTCant.setNextFocusableComponent(jTList);
        jPParts.add(jTCant, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, 80, 20));

        jLabel15.setText("U.Costo:");
        jPParts.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 60, -1));

        jLabel19.setText("Cod. Producto:");
        jPParts.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 110, -1));

        jTDescripUni.setEditable(false);
        jTDescripUni.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPParts.add(jTDescripUni, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 80, 20));

        jTDescripAlma.setEditable(false);
        jTDescripAlma.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTDescripAlma.setNextFocusableComponent(jComColo);
        jPParts.add(jTDescripAlma, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 70, 20));

        jTextFieldExistencia.setEditable(false);
        jTextFieldExistencia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPParts.add(jTextFieldExistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 40, 100, 20));

        jTCost.setEditable(false);
        jTCost.setText("$0.00");
        jTCost.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPParts.add(jTCost, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, 100, 20));

        jTextFieldProducto.setBackground(new java.awt.Color(255, 255, 153));
        jTextFieldProducto.setToolTipText("Ctrl+B búsqueda avanzada");
        jTextFieldProducto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTextFieldProducto.setNextFocusableComponent(jBProd);
        jPParts.add(jTextFieldProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 60, 20));

        jBProd.setBackground(new java.awt.Color(255, 255, 255));
        jBProd.setText("...");
        jBProd.setToolTipText("Búscar Producto(s)");
        jBProd.setNextFocusableComponent(jTDescrip);
        jPParts.add(jBProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 30, 20));

        jTList.setText("1");
        jTList.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTList.setNextFocusableComponent(jBList);
        jPParts.add(jTList, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 50, 20));

        jBUltPre.setBackground(new java.awt.Color(255, 255, 255));
        jBUltPre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/ultpre.png"))); // NOI18N
        jBUltPre.setToolTipText("Ultimos 100 Precios de Venta por este Cliente");
        jBUltPre.setNextFocusableComponent(jBTipCam);
        jPParts.add(jBUltPre, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, 50, 50));

        jBList.setBackground(new java.awt.Color(255, 255, 255));
        jBList.setText("jButton1");
        jBList.setToolTipText("Búscar Listas de Precio");
        jBList.setName(""); // NOI18N
        jBList.setNextFocusableComponent(jBUltCostT);
        jPParts.add(jBList, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 30, 20));

        jBVeGran.setBackground(new java.awt.Color(255, 255, 255));
        jBVeGran.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/img.png"))); // NOI18N
        jBVeGran.setToolTipText("Ver Imágen  de Producto Completa");
        jBVeGran.setNextFocusableComponent(jBNew);
        jPParts.add(jBVeGran, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 100, 30, 20));

        jBTipCam.setBackground(new java.awt.Color(255, 255, 255));
        jBTipCam.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBTipCam.setForeground(new java.awt.Color(0, 102, 0));
        jBTipCam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/dol.png"))); // NOI18N
        jBTipCam.setToolTipText("Definir el tipo de cambio dollar del dìa");
        jBTipCam.setOpaque(false);
        jPParts.add(jBTipCam, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, 50, 50));

        jPanImg.setBackground(new java.awt.Color(255, 255, 204));
        
        javax.swing.GroupLayout jPanImgLayout = new javax.swing.GroupLayout(jPanImg);
        jPanImg.setLayout(jPanImgLayout);
        jPanImgLayout.setHorizontalGroup(
            jPanImgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanImgLayout.createSequentialGroup()
                .addComponent(jLImg)
                .addGap(0, 80, Short.MAX_VALUE))
        );
        jPanImgLayout.setVerticalGroup(
            jPanImgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanImgLayout.createSequentialGroup()
                .addComponent(jLImg)
                .addContainerGap(101, Short.MAX_VALUE))
        );

        jSImg.setViewportView(jPanImg);

        jPParts.add(jSImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 20, 60, 80));

        jLabel13.setText("Cod. Unidad:");
        jPParts.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 87, -1));

        jLabel46.setText("Existencia:");
        jPParts.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, 70, -1));

        jLabel49.setText("L.Precio:");
        jPParts.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 60, 20));

        jBGranDescrip.setBackground(new java.awt.Color(0, 153, 153));
        jBGranDescrip.setToolTipText("Ver/Modificar Descripción en Grande");
        jPParts.add(jBGranDescrip, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 10, 20));

        jBUltCostT.setBackground(new java.awt.Color(255, 255, 255));
        jBUltCostT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/ultprect.png"))); // NOI18N
        jBUltCostT.setToolTipText("Ultimos 100 Precios de Venta de todos los Clientes");
        jBUltCostT.setNextFocusableComponent(jBUltPre);
        jPParts.add(jBUltCostT, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, 50, 50));

        jLabel16.setText("Almacén:");
        jPParts.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 87, -1));

        jComboBoxAlmacenes.setNextFocusableComponent(jTDescripAlma);
        jPParts.add(jComboBoxAlmacenes, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 90, 20));

        jBExisAlma.setBackground(new java.awt.Color(0, 153, 153));
        jBExisAlma.setToolTipText("Existencias por almacén del producto");
        jPParts.add(jBExisAlma, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 10, 20));

        jLabel42.setText("Cant:");
        jPParts.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 60, -1));

        jLabel43.setText("Impuestos:");
        jPParts.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 110, -1));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setText("+");
        jPParts.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 90, 20));

        jTCuentaCont.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTCuentaCont.setNextFocusableComponent(jBList);
        jPParts.add(jTCuentaCont, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 140, 20));

        jLabel53.setText("Cuenta Contable:");
        jPParts.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 100, 20));

        jBCuentaCont.setBackground(new java.awt.Color(255, 255, 255));
        jBCuentaCont.setText("jButton1");
        jBCuentaCont.setToolTipText("Búscar Listas de Precio");
        jBCuentaCont.setName(""); // NOI18N
        jBCuentaCont.setNextFocusableComponent(jBUltCostT);
        jPParts.add(jBCuentaCont, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 30, 20));

        jBtnReferencia.setBackground(new java.awt.Color(255, 255, 255));
        jBtnReferencia.setText("jButton1");
        jPParts.add(jBtnReferencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 30, 20));

        jTReferencia.setEditable(false);
        jPParts.add(jTReferencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 140, -1));

        jLabel1.setText("Activo");
        jPParts.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 100, -1));
        jPParts.add(jTxtCodOpc, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 170, 40));

        jLblCodigoOpcional.setText("Observacion Partida:");
        jPParts.add(jLblCodigoOpcional, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 110, -1));

        jBDatsCarta.setText("Datos Carta Porte");
        jPParts.add(jBDatsCarta, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 110, -1));

        jP1.add(jPParts, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 710, 240));

        jPClien.setBackground(new java.awt.Color(255, 255, 255));
        jPClien.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos del Cliente", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPClien.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("Cod. Proveedor:");
        jPClien.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 190, 110, -1));

        jLabel6.setText("*CP:");
        jPClien.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 70, -1));

        jLabel20.setText("*Cliente:");
        jPClien.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 70, -1));

        jLabel24.setText("*Calle:");
        jPClien.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 70, -1));

        jLabel29.setText("Teléfono:");
        jPClien.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 70, -1));

        jLabel30.setText("*Colonia:");
        jPClien.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 70, -1));

        jLabel31.setText("*No. Exterior:");
        jPClien.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 90, -1));

        jLabel32.setText("No. Interior:");
        jPClien.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 90, -1));

        jLabel34.setText("*Ciudad:");
        jPClien.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, 70, -1));

        jLabel36.setText("Condiciones:");
        jPClien.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 230, -1));

        jLabel37.setText("Lista:");
        jPClien.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 70, -1));

        jTCo1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTCo1.setNextFocusableComponent(jCCo1);
        jPClien.add(jTCo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, 120, 20));

        jTextFieldCalle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTextFieldCalle.setNextFocusableComponent(jTCol);
        jPClien.add(jTextFieldCalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 160, 20));

        jTCol.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTCol.setNextFocusableComponent(jTTel);
        jPClien.add(jTCol, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 160, 20));

        jTTel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTTel.setNextFocusableComponent(jTPai);
        jPClien.add(jTTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 160, 20));

        jTPai.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTPai.setNextFocusableComponent(jTCP);
        jPClien.add(jTPai, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 160, 20));

        jTCP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTCP.setNextFocusableComponent(jTNoExt);
        jPClien.add(jTCP, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 100, 20));

        jTNoExt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTNoExt.setNextFocusableComponent(jTNoInt);
        jPClien.add(jTNoExt, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 100, 20));

        jTNoInt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTNoInt.setNextFocusableComponent(jTRFC);
        jPClien.add(jTNoInt, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, 100, 20));

        jTRFC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTRFC.setNextFocusableComponent(jCConta);
        jPClien.add(jTRFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 100, 20));

        jTCiu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTCiu.setNextFocusableComponent(jTEstad);
        jPClien.add(jTCiu, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 50, 120, 20));

        jTEstad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTEstad.setNextFocusableComponent(jTCo1);
        jPClien.add(jTEstad, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, 120, 20));

        jCGDats.setBackground(new java.awt.Color(255, 255, 255));
        jCGDats.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCGDats.setText("Mod. datos del cliente F11");
        jPClien.add(jCGDats, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 150, 170, -1));

        jTCo3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTCo3.setNextFocusableComponent(jCCo3);
        jPClien.add(jTCo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, 120, 20));

        jCCo3.setBackground(new java.awt.Color(255, 255, 255));
        jCCo3.setText("Correo 3:");
        jCCo3.setNextFocusableComponent(jCGDats);
        jPClien.add(jCCo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, -1, -1));

        jTCo2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTCo2.setNextFocusableComponent(jCCo2);
        jPClien.add(jTCo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 120, 20));

        jCCo1.setBackground(new java.awt.Color(255, 255, 255));
        jCCo1.setSelected(true);
        jCCo1.setText("Correo 1:");
        jCCo1.setNextFocusableComponent(jTCo2);
        jPClien.add(jCCo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, -1, -1));

        jCCo2.setBackground(new java.awt.Color(255, 255, 255));
        jCCo2.setText("Correo 2:");
        jCCo2.setNextFocusableComponent(jTCo3);
        jPClien.add(jCCo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, -1, -1));

        jTextFieldCliente.setBackground(new java.awt.Color(204, 255, 204));
        jTextFieldCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTextFieldCliente.setNextFocusableComponent(jButtonBuscarCliente);
        jPClien.add(jTextFieldCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 60, 20));

        jButtonBuscarCliente.setBackground(new java.awt.Color(255, 255, 255));
        jButtonBuscarCliente.setText("...");
        jButtonBuscarCliente.setToolTipText("Búscar Cliente(s)");
        jButtonBuscarCliente.setNextFocusableComponent(jTextFieldCalle);
        jPClien.add(jButtonBuscarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 30, 20));

        jTNom.setEditable(false);
        jTNom.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPClien.add(jTNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 320, 20));

        jTCond.setEditable(false);
        jTCond.setBackground(new java.awt.Color(255, 255, 204));
        jTCond.setForeground(new java.awt.Color(0, 153, 0));
        jTCond.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTCond.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTCond.setFocusable(false);
        jPClien.add(jTCond, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 320, 20));

        jLabel45.setText("Pais:");
        jPClien.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 70, -1));

        jCConta.setBackground(new java.awt.Color(255, 255, 255));
        jCConta.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCConta.setText("Contado F8");
        jCConta.setNextFocusableComponent(jBDom);
        jPClien.add(jCConta, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 90, -1));

        jTListEmp.setEditable(false);
        jTListEmp.setBackground(new java.awt.Color(255, 255, 255));
        jTListEmp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTListEmp.setFocusable(false);
        jPClien.add(jTListEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, 100, 20));

        jLabel47.setText("*RFC:");
        jPClien.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 70, -1));

        jTextFieldSerieCliente.setEditable(false);
        jTextFieldSerieCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPClien.add(jTextFieldSerieCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 70, 20));

        jBDom.setBackground(new java.awt.Color(255, 255, 255));
        jBDom.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jBDom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/doment.png"))); // NOI18N
        jBDom.setToolTipText("Definir Domicilio de Entrega");
        jPClien.add(jBDom, new org.netbeans.lib.awtextra.AbsoluteConstraints(481, 150, 30, 30));

        jLabel41.setText("*Estado:");
        jPClien.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, 70, -1));

        jLabel35.setText("Fecha entrega:");
        jPClien.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 90, -1));

        jButtonBuscarPedidos.setBackground(new java.awt.Color(255, 255, 255));
        jButtonBuscarPedidos.setText("...");
        jButtonBuscarPedidos.setToolTipText("Buscar Pedido");
        jPClien.add(jButtonBuscarPedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 30, 20));

        jButtonBuscarRemisiones.setBackground(new java.awt.Color(255, 255, 255));
        jButtonBuscarRemisiones.setText("...");
        jButtonBuscarRemisiones.setToolTipText("Buscar Remisiones");
        jPClien.add(jButtonBuscarRemisiones, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 30, 20));

        jBGenPDF.setBackground(new java.awt.Color(255, 255, 255));
        jBGenPDF.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBGenPDF.setForeground(new java.awt.Color(0, 102, 0));
        jBGenPDF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/genpdf.png"))); // NOI18N
        jBGenPDF.setToolTipText("Generar PDF de venta");
        jBGenPDF.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPClien.add(jBGenPDF, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 60, 50, 30));

        jP1.add(jPClien, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 710, 183));

        jTSubTot.setEditable(false);
        jTSubTot.setBackground(new java.awt.Color(204, 255, 204));
        jTSubTot.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTSubTot.setForeground(new java.awt.Color(51, 51, 0));
        jTSubTot.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTSubTot.setText("$0.00");
        jTSubTot.setNextFocusableComponent(jBGuar);
        jP1.add(jTSubTot, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 600, 120, 20));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel26.setText("Vendedor:");
        jP1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 610, 90, 20));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel27.setText("Retención:");
        jP1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 660, 110, 20));

        campo_impuesto.setEditable(false);
        campo_impuesto.setBackground(new java.awt.Color(204, 255, 204));
        campo_impuesto.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        campo_impuesto.setForeground(new java.awt.Color(51, 51, 0));
        campo_impuesto.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        campo_impuesto.setText("$0.00");
        campo_impuesto.setNextFocusableComponent(jBGuar);
        jP1.add(campo_impuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 640, 120, 20));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel28.setText("Descuento:");
        jP1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 620, 110, 20));

        jTTot.setEditable(false);
        jTTot.setBackground(new java.awt.Color(204, 255, 204));
        jTTot.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTTot.setForeground(new java.awt.Color(51, 51, 0));
        jTTot.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTTot.setText("$0.00");
        jTTot.setNextFocusableComponent(jBGuar);
        jP1.add(jTTot, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 680, 120, 20));

        jTSaldDispo.setEditable(false);
        jTSaldDispo.setText("0");
        jTSaldDispo.setFocusable(false);
        jP1.add(jTSaldDispo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 680, 10, -1));

        jTLimCred.setEditable(false);
        jTLimCred.setFocusable(false);
        jP1.add(jTLimCred, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 680, 10, -1));

        jBTab1.setBackground(new java.awt.Color(0, 153, 153));
        jBTab1.setToolTipText("Mostrar Tabla en Grande");
        jP1.add(jBTab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 10, 20));

        jTDiaCre.setEditable(false);
        jTDiaCre.setFocusable(false);
        jP1.add(jTDiaCre, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 680, 10, -1));

        jBTod.setBackground(new java.awt.Color(255, 255, 255));
        jBTod.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jBTod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/marct.png"))); // NOI18N
        jBTod.setText("Marcar todo");
        jBTod.setToolTipText("Marcar Todos los Registros de la Tabla (Alt+T)");
        jBTod.setName(""); // NOI18N
        jBTod.setNextFocusableComponent(jTablePartidas);
        jP1.add(jBTod, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 450, 130, 18));

        jBNew.setBackground(new java.awt.Color(255, 255, 255));
        jBNew.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBNew.setForeground(new java.awt.Color(0, 102, 0));
        jBNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/agre.png"))); // NOI18N
        jBNew.setText("Nueva");
        jBNew.setToolTipText("Nueva Partida (Ctrl+N)");
        jBNew.setNextFocusableComponent(jBDel);
        jP1.add(jBNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 110, 20));

        jBDel.setBackground(new java.awt.Color(255, 255, 255));
        jBDel.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBDel.setForeground(new java.awt.Color(0, 102, 0));
        jBDel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/del.png"))); // NOI18N
        jBDel.setText("Borrar");
        jBDel.setToolTipText("Borrar Partida(s) (Ctrl+SUPR)");
        jBDel.setNextFocusableComponent(jTablePartidas);
        jP1.add(jBDel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 450, 110, 20));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Encabezado", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Fecha:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 80, -1));

        jLabel22.setText("*Serie:");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 100, -1));

        jPanel1.add(jComboBoxSerie, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 120, 20));

        jLabel44.setText("Forma Pago:");
        jPanel1.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 100, -1));

        jLUsoCfdi.setText("Uso de cfdi:");
        jPanel1.add(jLUsoCfdi, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 100, -1));

        jTCta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTCta.setNextFocusableComponent(jCGuaPag);
        jPanel1.add(jTCta, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 120, 20));

        jCGuaPag.setBackground(new java.awt.Color(255, 255, 255));
        jCGuaPag.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCGuaPag.setText("Guardar pago F7");
        jCGuaPag.setName(""); // NOI18N
        jCGuaPag.setNextFocusableComponent(jCheckboxRemision);
        jPanel1.add(jCGuaPag, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 110, 20));

        jCMand.setBackground(new java.awt.Color(255, 255, 255));
        jCMand.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCMand.setSelected(true);
        jCMand.setText("Mandar correo F4");
        jCMand.setNextFocusableComponent(jCImp);
        jPanel1.add(jCMand, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 130, -1));

        jCImp.setBackground(new java.awt.Color(255, 255, 255));
        jCImp.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCImp.setText("Imprimir F5");
        jPanel1.add(jCImp, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 110, -1));

        jCMostA.setBackground(new java.awt.Color(255, 255, 255));
        jCMostA.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCMostA.setText("Mostrar archivo F6");
        jCMostA.setNextFocusableComponent(jCheckboxTimbrar);
        jPanel1.add(jCMostA, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 110, -1));

        jCheckboxTimbrar.setBackground(new java.awt.Color(255, 255, 255));
        jCheckboxTimbrar.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCheckboxTimbrar.setSelected(true);
        jCheckboxTimbrar.setText("Timbrar");
        jPanel1.add(jCheckboxTimbrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 100, 20));

        jCFExt.setBackground(new java.awt.Color(255, 255, 255));
        jCFExt.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCFExt.setText("Fecha extra F12");
        jPanel1.add(jCFExt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 110, 20));

        jLabel40.setText("Observaciones:");
        jPanel1.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 90, -1));

        jSObserv.setNextFocusableComponent(jTextFieldCliente);
        
        jTAObserv.setColumns(20);
        jTAObserv.setRows(5);
        jTAObserv.setNextFocusableComponent(jTextFieldProducto);
        jSObserv.setViewportView(jTAObserv);

        jPanel1.add(jSObserv, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 250, 30));

        jLabel9.setText("Método de Pago:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 110, 20));

        jComboboxMonedas.setNextFocusableComponent(jComboBoxMetodoPago);
        jPanel1.add(jComboboxMonedas, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 120, 20));

        jLabel18.setText("Moneda:");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 90, -1));

        jComboBoxMetodoPago.setNextFocusableComponent(jCMostA);
        jPanel1.add(jComboBoxMetodoPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 120, 20));

        jComboBoxFormaPago.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PAGO EN UNA SOLA EXHIBICION", "PAGO EN PARCIALIDADES O DIFERIDO" }));
        jPanel1.add(jComboBoxFormaPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 250, 20));

        jPanel1.add(jUsoCFDI, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 120, 20));

        jLabel54.setText("Cuenta:");
        jPanel1.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 100, -1));

        jLabel5.setText("Lugar Expedición");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, -1, -1));

        jPanel1.add(txtLugarExped, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, 100, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("...");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, 30, 20));

        jLabel21.setText("Doc Relacionado:");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 90, -1));

        jTFilt.setBackground(new java.awt.Color(255, 255, 153));
        jTFilt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPanel1.add(jTFilt, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 120, 20));

        jBFilt.setBackground(new java.awt.Color(255, 255, 255));
        jBFilt.setText("D");
        jBFilt.setToolTipText("Buscar documento(s)");
        jPanel1.add(jBFilt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 30, 20));

        jLabel48.setText("Tipo Relación:");
        jPanel1.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 80, -1));

        jTTipoRelacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPanel1.add(jTTipoRelacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 120, 20));

        jBTipoRelacion.setBackground(new java.awt.Color(255, 255, 255));
        jBTipoRelacion.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBTipoRelacion.setText("jButton1");
        jPanel1.add(jBTipoRelacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 30, 20));

        jLabel7.setText("Fecha");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));
        jPanel1.add(JTFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 120, -1));

        jCCartaP.setBackground(new java.awt.Color(255, 255, 255));
        jCCartaP.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCCartaP.setText("Carta Porte");
        jPanel1.add(jCCartaP, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 90, -1));

        jP1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, 270, 430));

        jTAlma2.setEditable(false);
        jTAlma2.setFocusable(false);
        jP1.add(jTAlma2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 680, 10, -1));

        jTCadu.setEditable(false);
        jTCadu.setFocusable(false);
        jP1.add(jTCadu, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 680, 10, -1));

        jTId.setEditable(false);
        jTId.setFocusable(false);
        jP1.add(jTId, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 680, 10, -1));

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel33.setText("Total:");
        jP1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 680, 110, 20));

        jTTotDesc.setEditable(false);
        jTTotDesc.setBackground(new java.awt.Color(204, 255, 204));
        jTTotDesc.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTTotDesc.setForeground(new java.awt.Color(51, 51, 0));
        jTTotDesc.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTTotDesc.setText("$0.00");
        jTTotDesc.setNextFocusableComponent(jBGuar);
        jP1.add(jTTotDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 620, 120, 20));

        jTComenSer.setEditable(false);
        jTComenSer.setFocusable(false);
        jP1.add(jTComenSer, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 680, 10, 20));

        jTGara.setEditable(false);
        jTGara.setFocusable(false);
        jP1.add(jTGara, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 680, 10, -1));

        jTTotCost.setEditable(false);
        jTTotCost.setFocusable(false);
        jP1.add(jTTotCost, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 680, 10, -1));

        jScrTab.setEnabled(false);
        jScrTab.setFocusable(false);

        jTabDir.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "tel", "lada", "exten", "cel", "telper1", "telper2", "calle", "col", "noext", "noint", "cp", "ciu", "estad", "pais", "co1", "co2", "co3"
            }
        ));
        jTabDir.setEnabled(false);
        jTabDir.setFocusable(false);
        jTabDir.setShowHorizontalLines(false);
        jTabDir.setShowVerticalLines(false);
        jScrTab.setViewportView(jTabDir);

        jP1.add(jScrTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 680, 20, 20));

        jTEsKit.setEditable(false);
        jTEsKit.setFocusable(false);
        jP1.add(jTEsKit, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 680, 10, 20));

        jLTipVta.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLTipVta.setText("VENTA A CRÉDITO");
        jLTipVta.setFocusable(false);
        jP1.add(jLTipVta, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 640, 500, -1));

        jTTotSald.setEditable(false);
        jTTotSald.setBackground(new java.awt.Color(255, 204, 204));
        jTTotSald.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTTotSald.setForeground(new java.awt.Color(51, 51, 0));
        jTTotSald.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTTotSald.setText("$0.00");
        jTTotSald.setNextFocusableComponent(jBGuar);
        jP1.add(jTTotSald, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 700, 120, 20));

        jLTotSald.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLTotSald.setForeground(new java.awt.Color(204, 0, 51));
        jLTotSald.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLTotSald.setText("Total a pagar:");
        jP1.add(jLTotSald, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 700, 160, 20));

        jLNot.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLNot.setForeground(new java.awt.Color(204, 0, 0));
        jLNot.setText("NUEVA FACTURA");
        jLNot.setFocusable(false);
        jP1.add(jLNot, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 600, 270, -1));

        jTCantLot.setEditable(false);
        jTCantLot.setText("0");
        jP1.add(jTCantLot, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 680, 10, -1));

        jTSerProd.setEditable(false);
        jTSerProd.setFocusable(false);
        jP1.add(jTSerProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 680, 10, 20));

        jRPagad.setBackground(new java.awt.Color(255, 255, 255));
        jRPagad.setSelected(true);
        jRPagad.setText("Pagada");
        jRPagad.setNextFocusableComponent(jRNoPag);
        
        jP1.add(jRPagad, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 660, 70, -1));

        jRNoPag.setBackground(new java.awt.Color(255, 255, 255));
        jRNoPag.setText("No pagada");
        jRNoPag.setNextFocusableComponent(jTextFieldCliente);
        jP1.add(jRNoPag, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 660, -1, -1));

        jTextFieldVendedor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jP1.add(jTextFieldVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 610, 120, 20));

        jBVend.setBackground(new java.awt.Color(255, 255, 255));
        jBVend.setText("...");
        jBVend.setToolTipText("Buscar Vendedor(es)");
        jP1.add(jBVend, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 610, 30, 20));

        jLabel51.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel51.setText("Sub Total:");
        jP1.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 600, 110, 20));

        jLabel52.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel52.setText("Impuesto:");
        jP1.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 640, 110, 20));

        campo_retencion.setEditable(false);
        campo_retencion.setBackground(new java.awt.Color(204, 255, 204));
        campo_retencion.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        campo_retencion.setForeground(new java.awt.Color(51, 51, 0));
        campo_retencion.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        campo_retencion.setText("$0.00");
        campo_retencion.setNextFocusableComponent(jBGuar);
        jP1.add(campo_retencion, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 660, 120, 20));

        jLabel23.setText("Importar números de serie:");
        jP1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 720, 160, 20));

        jBCarSer.setBackground(new java.awt.Color(255, 255, 255));
        jBCarSer.setText("..");
        jBCarSer.setToolTipText("Búscar archivo EXCEL para series con dos columnas");
        jP1.add(jBCarSer, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 680, 30, 20));

        jTCarSer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jP1.add(jTCarSer, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 680, 20, 20));

        jLabel14.setText("Cod. Talla:");
        jP1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 680, 60, 20));

        jComTall.setNextFocusableComponent(jTDescripTall);
        jP1.add(jComTall, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 680, 20, -1));

        jTDescripTall.setEditable(false);
        jTDescripTall.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTDescripTall.setNextFocusableComponent(jComColo);
        jP1.add(jTDescripTall, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 680, 20, 20));

        jLabel12.setText("Cod. Color:");
        jP1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 700, 60, -1));

        jComColo.setNextFocusableComponent(jTDescripColo);
        jP1.add(jComColo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 700, 20, -1));

        jTDescripColo.setEditable(false);
        jTDescripColo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTDescripColo.setNextFocusableComponent(jComUnid);
        jP1.add(jTDescripColo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 700, 20, 20));

        jLabel50.setText("Es Kit:");
        jP1.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 680, 30, 20));

        jTKit.setEditable(false);
        jTKit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jP1.add(jTKit, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 680, 20, 20));

        jCBack.setBackground(new java.awt.Color(255, 255, 255));
        jCBack.setText("Backorder");
        jCBack.setNextFocusableComponent(jTSerProd);
        jP1.add(jCBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 680, 50, -1));

        jCheckboxRemision.setBackground(new java.awt.Color(255, 255, 255));
        jCheckboxRemision.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCheckboxRemision.setText("Remisión Alt+R");
        jCheckboxRemision.setToolTipText("La venta es una Remisión");
        jCheckboxRemision.setNextFocusableComponent(jCMand);
        jP1.add(jCheckboxRemision, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 700, 50, -1));

        jLabel2.setText("Lote y pedimento");
        jP1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 710, -1, -1));

        jTLot.setFocusable(false);
        jP1.add(jTLot, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 710, 70, 20));

        jTPedimen.setFocusable(false);
        jP1.add(jTPedimen, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 710, 70, 20));

        jbLotPed.setText("jbLotPed");
        jP1.add(jbLotPed, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 710, 30, 20));

        btnPrevio.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnPrevio.setForeground(new java.awt.Color(0, 102, 0));
        btnPrevio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/genpdf.png"))); // NOI18N
        btnPrevio.setText("Previo");
        jP1.add(btnPrevio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 633, 120, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jP1, javax.swing.GroupLayout.PREFERRED_SIZE, 1012, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addComponent(jP1, javax.swing.GroupLayout.PREFERRED_SIZE, 735, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
            
       
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JTFecha;
    private javax.swing.JButton btnPrevio;
    private javax.swing.JTextField campo_impuesto;
    private javax.swing.JTextField campo_retencion;
    private javax.swing.JButton jBCarSer;
    private javax.swing.JButton jBCuentaCont;
    private javax.swing.JButton jBDatsCarta;
    private javax.swing.JButton jBDel;
    private javax.swing.JButton jBDom;
    private javax.swing.JButton jBExisAlma;
    private javax.swing.JButton jBFilt;
    private javax.swing.JButton jBGenPDF;
    private javax.swing.JButton jBGranDescrip;
    private javax.swing.JButton jBGuar;
    private javax.swing.JButton jBList;
    private javax.swing.JButton jBNew;
    private javax.swing.JButton jBProd;
    private javax.swing.JButton jBSal;
    private javax.swing.JButton jBTab1;
    private javax.swing.JButton jBTipCam;
    private javax.swing.JButton jBTipoRelacion;
    private javax.swing.JButton jBTod;
    private javax.swing.JButton jBUltCostT;
    private javax.swing.JButton jBUltPre;
    private javax.swing.JButton jBVeGran;
    private javax.swing.JButton jBVend;
    private javax.swing.JButton jBtnReferencia;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonBuscarCliente;
    private javax.swing.JButton jButtonBuscarPedidos;
    private javax.swing.JButton jButtonBuscarRemisiones;
    private javax.swing.JCheckBox jCBack;
    private javax.swing.JCheckBox jCCartaP;
    private javax.swing.JCheckBox jCCo1;
    private javax.swing.JCheckBox jCCo2;
    private javax.swing.JCheckBox jCCo3;
    private javax.swing.JCheckBox jCConta;
    private javax.swing.JCheckBox jCFExt;
    private javax.swing.JCheckBox jCGDats;
    private javax.swing.JCheckBox jCGuaPag;
    private javax.swing.JCheckBox jCImp;
    private javax.swing.JCheckBox jCMand;
    private javax.swing.JCheckBox jCMostA;
    private javax.swing.JCheckBox jCheckboxRemision;
    private javax.swing.JCheckBox jCheckboxTimbrar;
    private javax.swing.JComboBox jComColo;
    private javax.swing.JComboBox jComTall;
    private javax.swing.JComboBox jComUnid;
    private javax.swing.JComboBox jComboBoxAlmacenes;
    private javax.swing.JComboBox jComboBoxFormaPago;
    private javax.swing.JComboBox jComboBoxMetodoPago;
    private javax.swing.JComboBox jComboBoxSerie;
    private javax.swing.JComboBox jComboboxMonedas;
    private javax.swing.JLabel jLImg;
    private javax.swing.JLabel jLNot;
    private javax.swing.JLabel jLTipVta;
    private javax.swing.JLabel jLTotSald;
    private javax.swing.JLabel jLUsoCfdi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLblCodigoOpcional;
    private javax.swing.JPanel jP1;
    private javax.swing.JPanel jPClien;
    private javax.swing.JPanel jPParts;
    private javax.swing.JPanel jPanImg;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRNoPag;
    private javax.swing.JRadioButton jRPagad;
    private javax.swing.JScrollPane jSImg;
    private javax.swing.JScrollPane jSObserv;
    private javax.swing.JScrollPane jScrTab;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTAObserv;
    private javax.swing.JTextField jTAlma2;
    private javax.swing.JTextField jTCP;
    private javax.swing.JTextField jTCadu;
    private javax.swing.JTextField jTCant;
    private javax.swing.JTextField jTCantLot;
    private javax.swing.JTextField jTCarSer;
    private javax.swing.JTextField jTCiu;
    private javax.swing.JTextField jTCo1;
    private javax.swing.JTextField jTCo2;
    private javax.swing.JTextField jTCo3;
    private javax.swing.JTextField jTCol;
    private javax.swing.JTextField jTComenSer;
    private javax.swing.JTextField jTCond;
    private javax.swing.JTextField jTCost;
    private javax.swing.JTextField jTCta;
    private javax.swing.JTextField jTCuentaCont;
    private javax.swing.JTextField jTDesc;
    private javax.swing.JTextField jTDescrip;
    private javax.swing.JTextField jTDescripAlma;
    private javax.swing.JTextField jTDescripColo;
    private javax.swing.JTextField jTDescripTall;
    private javax.swing.JTextField jTDescripUni;
    private javax.swing.JTextField jTDiaCre;
    private javax.swing.JTextField jTEsKit;
    private javax.swing.JTextField jTEstad;
    private javax.swing.JTextField jTFilt;
    private javax.swing.JTextField jTGara;
    private javax.swing.JTextField jTId;
    private javax.swing.JTextField jTKit;
    private javax.swing.JTextField jTLimCred;
    private javax.swing.JTextField jTList;
    private javax.swing.JTextField jTListEmp;
    private javax.swing.JTextField jTLot;
    private javax.swing.JTextField jTNoExt;
    private javax.swing.JTextField jTNoInt;
    private javax.swing.JTextField jTNom;
    private javax.swing.JTextField jTPai;
    private javax.swing.JTextField jTPedimen;
    private javax.swing.JTextField jTPre;
    private javax.swing.JTextField jTRFC;
    private javax.swing.JTextField jTReferencia;
    private javax.swing.JTextField jTSaldDispo;
    private javax.swing.JTextField jTSerProd;
    private javax.swing.JTextField jTSubTot;
    private javax.swing.JTextField jTTel;
    private javax.swing.JTextField jTTipoRelacion;
    private javax.swing.JTextField jTTot;
    private javax.swing.JTextField jTTotCost;
    private javax.swing.JTextField jTTotDesc;
    private javax.swing.JTextField jTTotSald;
    private javax.swing.JTable jTabDir;
    private javax.swing.JTable jTablePartidas;
    private javax.swing.JTextField jTextFieldCalle;
    private javax.swing.JTextField jTextFieldCliente;
    private javax.swing.JTextField jTextFieldExistencia;
    private javax.swing.JTextField jTextFieldProducto;
    private javax.swing.JTextField jTextFieldSerieCliente;
    private javax.swing.JTextField jTextFieldVendedor;
    private javax.swing.JTextField jTxtCodOpc;
    private javax.swing.JComboBox<String> jUsoCFDI;
    private javax.swing.JButton jbLotPed;
    private javax.swing.JTextField txtLugarExped;
    // End of variables declaration//GEN-END:variables

}
