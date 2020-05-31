package com.era.views;

public abstract class PtoVtaTouJFrame extends BaseJFrame 
{
    public PtoVtaTouJFrame(final String idTextTitleWindow) 
    {                                      
        super(idTextTitleWindow);
        
        initComponents();

        postInitComponents();
    }



    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jBNewVta = new javax.swing.JButton();
        jTCli = new javax.swing.JTextField();
        jTNomb = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTab = new javax.swing.JTable();
        jBDel = new javax.swing.JButton();
        jB1 = new javax.swing.JButton();
        jBTecla = new javax.swing.JButton();
        jBSal = new javax.swing.JButton();
        jTQtyP = new javax.swing.JTextField();
        jTProd = new javax.swing.JTextField();
        jTMon = new javax.swing.JTextField();
        jBProds = new javax.swing.JButton();
        jBNew = new javax.swing.JButton();
        jBCob = new javax.swing.JButton();
        jScrollPaneLin = new javax.swing.JScrollPane();
        jPanelLin = new javax.swing.JPanel();
        jBCli = new javax.swing.JButton();
        jBNewEmp = new javax.swing.JButton();
        jScrollProds = new javax.swing.JScrollPane();
        jPanProds = new javax.swing.JPanel();
        jBBuscGral = new javax.swing.JButton();
        jTBuscGral = new javax.swing.JTextField();
        jTDesc = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTSer = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTTot = new javax.swing.JTextField();
        jTImpue = new javax.swing.JTextField();
        jTSubTot = new javax.swing.JTextField();
        jBVeGran = new javax.swing.JButton();
        jPanImg = new javax.swing.JPanel();
        jLImg = new javax.swing.JLabel();
        jTCodProd = new javax.swing.JTextField();
        jPCon = new javax.swing.JPanel();
        jBLed = new javax.swing.JButton();
        jTColo = new javax.swing.JTextField();
        jTAlma = new javax.swing.JTextField();
        jTTall = new javax.swing.JTextField();
        jTId = new javax.swing.JTextField();
        jTLot = new javax.swing.JTextField();
        jTPedimen = new javax.swing.JTextField();
        jTCadu = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTTotDesc = new javax.swing.JTextField();
        jTComenSer = new javax.swing.JTextField();
        jTSerProd = new javax.swing.JTextField();
        jTGara = new javax.swing.JTextField();
        jTTotCost = new javax.swing.JTextField();
        jTFec = new javax.swing.JTextField();
        jLTipVta = new javax.swing.JLabel();
        jTCantLot = new javax.swing.JTextField();
        jTList = new javax.swing.JTextField();
        jComUnid = new javax.swing.JComboBox();
        jTImpo = new javax.swing.JTextField();
        jTRecib = new javax.swing.JTextField();
        jTMarc = new javax.swing.JTextField();
        jTMod = new javax.swing.JTextField();
        jTColoAut = new javax.swing.JTextField();
        jTPlacs = new javax.swing.JTextField();
        jTNom = new javax.swing.JTextField();
        jTTarCirc = new javax.swing.JTextField();
        jTNumLic = new javax.swing.JTextField();
        jTTel = new javax.swing.JTextField();
        jTDirPart = new javax.swing.JTextField();
        jTDirOfi = new javax.swing.JTextField();
        jTTelOfi = new javax.swing.JTextField();
        jBScann = new javax.swing.JButton();
        jTCant = new javax.swing.JTextField();
        jBSincronizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBNewVta.setBackground(new java.awt.Color(255, 255, 255));
        jBNewVta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/newvta.png"))); // NOI18N
        jBNewVta.setToolTipText("Nueva Venta");
        jBNewVta.setNextFocusableComponent(jBDel);
        jPanel1.add(jBNewVta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 100, 90));

        jTCli.setBackground(new java.awt.Color(204, 255, 204));
        jTCli.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTCli.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTCli.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTCli.setNextFocusableComponent(jBNewVta);
        jPanel1.add(jTCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 110, 40));

        jTNomb.setEditable(false);
        jTNomb.setBackground(new java.awt.Color(204, 255, 255));
        jTNomb.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTNomb.setBorder(null);
        jTNomb.setFocusable(false);
        jPanel1.add(jTNomb, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 460, 40));

        jTab.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Qty.", "Cod. Producto", "Unidad", "Descripción", "Desc.", "Precio", "Importe", "Impuesto", "Valor Imp.", "Almacen", "Talla", "Color", "Lote", "Pedimento", "Caducidad", "ID", "Es Kit", "Precio Original", "Importe Descuento", "Serie Producto", "Comentario Producto", "Garantía", "Costo", "idped", "Cod Impuesto", "Fila"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, true, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTab.setGridColor(new java.awt.Color(255, 255, 255));
        jTab.setRowHeight(25);
        jScrollPane1.setViewportView(jTab);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 570, 430));

        jBDel.setBackground(new java.awt.Color(255, 255, 255));
        jBDel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/delpart.png"))); // NOI18N
        jBDel.setToolTipText("Borrar Partida");
        jBDel.setNextFocusableComponent(jB1);
        jPanel1.add(jBDel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 100, 90));

        jB1.setBackground(new java.awt.Color(255, 255, 255));
        jB1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/calcg.png"))); // NOI18N
        jB1.setToolTipText("Calculadora");
        jB1.setNextFocusableComponent(jBTecla);
        jPanel1.add(jB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 100, 90));

        jBTecla.setBackground(new java.awt.Color(255, 255, 255));
        jBTecla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/tecla.png"))); // NOI18N
        jBTecla.setToolTipText("Teclado Virtual");
        jBTecla.setNextFocusableComponent(jBSal);
        jPanel1.add(jBTecla, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 100, 80));

        jBSal.setBackground(new java.awt.Color(255, 255, 255));
        jBSal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBSal.setForeground(new java.awt.Color(255, 51, 51));
        jBSal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/salpto.png"))); // NOI18N
        jBSal.setToolTipText("Salir (ESC)");
        jBSal.setNextFocusableComponent(jTProd);
        jPanel1.add(jBSal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 100, 80));

        jTQtyP.setEditable(false);
        jTQtyP.setBackground(new java.awt.Color(255, 255, 255));
        jTQtyP.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jTQtyP.setForeground(new java.awt.Color(102, 102, 0));
        jTQtyP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTQtyP.setText("0 pzas");
        jTQtyP.setToolTipText("Cantidad de Productos Actual en las Partidas");
        jTQtyP.setBorder(null);
        jTQtyP.setFocusable(false);
        jTQtyP.setNextFocusableComponent(jTProd);
        jPanel1.add(jTQtyP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 660, 100, 50));

        jTProd.setBackground(new java.awt.Color(255, 255, 153));
        jTProd.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jTProd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTProd.setNextFocusableComponent(jTCant);
        jPanel1.add(jTProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 490, 270, 50));

        jTMon.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jTMon.setNextFocusableComponent(jComUnid);
        jPanel1.add(jTMon, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 490, 50, 50));

        jBProds.setBackground(new java.awt.Color(255, 255, 255));
        jBProds.setText("...");
        jBProds.setToolTipText("Buscar productos (Flecha abajo)");
        jBProds.setNextFocusableComponent(jBNew);
        jPanel1.add(jBProds, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 490, 40, 50));

        jBNew.setBackground(new java.awt.Color(255, 255, 255));
        jBNew.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBNew.setForeground(new java.awt.Color(51, 153, 0));
        jBNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/agre8.png"))); // NOI18N
        jBNew.setToolTipText("Agregar Producto(CTRL+N)");
        jBNew.setName(""); // NOI18N
        jBNew.setNextFocusableComponent(jBCob);
        jPanel1.add(jBNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 490, 40, 50));

        jBCob.setBackground(new java.awt.Color(255, 255, 255));
        jBCob.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/cobra.png"))); // NOI18N
        jBCob.setToolTipText("Cobrar");
        jBCob.setNextFocusableComponent(jTDesc);
        jPanel1.add(jBCob, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 490, 40, 50));

        jScrollPaneLin.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPaneLin.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPaneLin.setAutoscrolls(true);
        jScrollPaneLin.setViewportView(jPanelLin);

        jPanel1.add(jScrollPaneLin, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 60, 200, 490));

        jBCli.setBackground(new java.awt.Color(255, 255, 255));
        jBCli.setText("...");
        jBCli.setToolTipText("Buscar Cliente");
        jBCli.setNextFocusableComponent(jTCli);
        jPanel1.add(jBCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, 60, 40));

        jBNewEmp.setBackground(new java.awt.Color(255, 255, 255));
        jBNewEmp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Insertar.gif"))); // NOI18N
        jBNewEmp.setToolTipText("Nuevo Cliente");
        jBNewEmp.setNextFocusableComponent(jBCli);
        jPanel1.add(jBNewEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, 60, 40));

        jScrollProds.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollProds.setToolTipText("");
        jScrollProds.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollProds.setViewportBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollProds.setAutoscrolls(true);
        jScrollProds.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        jPanProds.setAutoscrolls(true);
        jPanProds.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanProds.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jPanProds.setLayout(new java.awt.GridLayout(5, 3));
        jScrollProds.setViewportView(jPanProds);

        jPanel1.add(jScrollProds, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 60, 500, 660));

        jBBuscGral.setBackground(new java.awt.Color(255, 255, 255));
        jBBuscGral.setText("...");
        jBBuscGral.setToolTipText("Buscar Catálogo General");
        jBBuscGral.setNextFocusableComponent(jBNewEmp);
        jPanel1.add(jBBuscGral, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 540, 60, 40));

        jTBuscGral.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTBuscGral.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTBuscGral.setNextFocusableComponent(jBBuscGral);
        jPanel1.add(jTBuscGral, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 540, 170, 40));

        jTDesc.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jTDesc.setForeground(new java.awt.Color(0, 0, 255));
        jTDesc.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTDesc.setText("0");
        jTDesc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTDesc.setNextFocusableComponent(jTBuscGral);
        jPanel1.add(jTDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 540, 70, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel2.setText("DESCUENTO %");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 540, 210, -1));

        jTSer.setEditable(false);
        jTSer.setFocusable(false);
        jPanel1.add(jTSer, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 710, 10, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel5.setText("SUBTOTAL:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 580, 220, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel7.setText("IMPUESTO:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 610, 220, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel6.setText("DESCUENTO:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 640, 220, 30));

        jTTot.setEditable(false);
        jTTot.setBackground(new java.awt.Color(255, 255, 204));
        jTTot.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jTTot.setForeground(new java.awt.Color(0, 0, 255));
        jTTot.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTTot.setText("$0.00");
        jTTot.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPanel1.add(jTTot, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 670, 300, 30));

        jTImpue.setEditable(false);
        jTImpue.setBackground(new java.awt.Color(255, 255, 204));
        jTImpue.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jTImpue.setForeground(new java.awt.Color(0, 0, 255));
        jTImpue.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTImpue.setText("$0.00");
        jTImpue.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTImpue.setFocusable(false);
        jPanel1.add(jTImpue, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 610, 300, 30));

        jTSubTot.setEditable(false);
        jTSubTot.setBackground(new java.awt.Color(255, 255, 204));
        jTSubTot.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jTSubTot.setForeground(new java.awt.Color(0, 0, 255));
        jTSubTot.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTSubTot.setText("$0.00");
        jTSubTot.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTSubTot.setFocusable(false);
        jPanel1.add(jTSubTot, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 580, 300, 30));

        jBVeGran.setBackground(new java.awt.Color(255, 255, 255));
        jBVeGran.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/img.png"))); // NOI18N
        jBVeGran.setToolTipText("Ver Imágen  de Producto Completa");
        jBVeGran.setNextFocusableComponent(jBNewEmp);
        jPanel1.add(jBVeGran, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 720, 200, 30));

        jPanImg.setBackground(new java.awt.Color(255, 255, 204));

        javax.swing.GroupLayout jPanImgLayout = new javax.swing.GroupLayout(jPanImg);
        jPanImg.setLayout(jPanImgLayout);
        jPanImgLayout.setHorizontalGroup(
            jPanImgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanImgLayout.createSequentialGroup()
                .addComponent(jLImg)
                .addGap(0, 200, Short.MAX_VALUE))
        );
        jPanImgLayout.setVerticalGroup(
            jPanImgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanImgLayout.createSequentialGroup()
                .addComponent(jLImg)
                .addContainerGap(170, Short.MAX_VALUE))
        );

        jPanel1.add(jPanImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 550, 200, 170));

        jTCodProd.setEditable(false);
        jPanel1.add(jTCodProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 710, 10, -1));

        jPCon.setBackground(new java.awt.Color(255, 255, 255));
        jPCon.setFocusable(false);

        jBLed.setBackground(new java.awt.Color(255, 255, 255));
        jBLed.setForeground(new java.awt.Color(255, 255, 255));
        jBLed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/concon.png"))); // NOI18N
        jBLed.setBorder(null);
        jBLed.setFocusable(false);

        javax.swing.GroupLayout jPConLayout = new javax.swing.GroupLayout(jPCon);
        jPCon.setLayout(jPConLayout);
        jPConLayout.setHorizontalGroup(
            jPConLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPConLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jBLed, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPConLayout.setVerticalGroup(
            jPConLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPConLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBLed, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        jPanel1.add(jPCon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 610, 100, 50));

        jTColo.setEditable(false);
        jPanel1.add(jTColo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 710, 10, -1));

        jTAlma.setEditable(false);
        jPanel1.add(jTAlma, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 710, 10, -1));

        jTTall.setEditable(false);
        jPanel1.add(jTTall, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 710, 10, -1));

        jTId.setEditable(false);
        jPanel1.add(jTId, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 710, 10, -1));

        jTLot.setEditable(false);
        jPanel1.add(jTLot, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 710, 10, -1));

        jTPedimen.setEditable(false);
        jPanel1.add(jTPedimen, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 710, 10, -1));

        jTCadu.setEditable(false);
        jPanel1.add(jTCadu, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 710, 10, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel8.setText("TOTAL:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 670, 220, 30));

        jTTotDesc.setEditable(false);
        jTTotDesc.setBackground(new java.awt.Color(255, 255, 204));
        jTTotDesc.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jTTotDesc.setForeground(new java.awt.Color(0, 0, 255));
        jTTotDesc.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTTotDesc.setText("$0.00");
        jTTotDesc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTTotDesc.setFocusable(false);
        jPanel1.add(jTTotDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 640, 300, 30));

        jTComenSer.setEditable(false);
        jTComenSer.setBackground(new java.awt.Color(255, 255, 255));
        jTComenSer.setFocusable(false);
        jPanel1.add(jTComenSer, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 710, 10, 20));

        jTSerProd.setEditable(false);
        jTSerProd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPanel1.add(jTSerProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 710, 10, 20));

        jTGara.setEditable(false);
        jPanel1.add(jTGara, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 710, 10, -1));

        jTTotCost.setEditable(false);
        jTTotCost.setFocusable(false);
        jPanel1.add(jTTotCost, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 710, 10, -1));

        jTFec.setEditable(false);
        jTFec.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTFec.setBorder(null);
        jTFec.setFocusable(false);
        jPanel1.add(jTFec, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 10, 310, 40));

        jLTipVta.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLTipVta.setText("VENTA DE CONTADO");
        jLTipVta.setFocusable(false);
        jPanel1.add(jLTipVta, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 10, 220, 40));

        jTCantLot.setEditable(false);
        jTCantLot.setText("0");
        jPanel1.add(jTCantLot, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 710, 10, -1));

        jTList.setEditable(false);
        jPanel1.add(jTList, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 710, 10, -1));

        jComUnid.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComUnid.setToolTipText("Unidad de producto");
        jComUnid.setName(""); // NOI18N
        jComUnid.setNextFocusableComponent(jBProds);
        jPanel1.add(jComUnid, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 490, 80, 50));
        jPanel1.add(jTImpo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 730, 10, -1));
        jPanel1.add(jTRecib, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 730, 10, -1));
        jPanel1.add(jTMarc, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 730, 10, -1));
        jPanel1.add(jTMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 730, 10, -1));
        jPanel1.add(jTColoAut, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 730, 10, -1));
        jPanel1.add(jTPlacs, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 730, 10, -1));
        jPanel1.add(jTNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 730, 10, -1));
        jPanel1.add(jTTarCirc, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 730, 10, -1));
        jPanel1.add(jTNumLic, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 730, 10, -1));
        jPanel1.add(jTTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 730, 10, -1));
        jPanel1.add(jTDirPart, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 730, 10, -1));
        jPanel1.add(jTDirOfi, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 730, 10, -1));
        jPanel1.add(jTTelOfi, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 730, 10, -1));

        jBScann.setBackground(new java.awt.Color(255, 255, 255));
        jBScann.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/activado-2.png"))); // NOI18N
        jBScann.setToolTipText("Abrir scaner");
        jBScann.setNextFocusableComponent(jBSal);
        jPanel1.add(jBScann, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 100, 80));

        jTCant.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTCant.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTCant.setText("1");
        jTCant.setToolTipText("Cantidad a Vender");
        jTCant.setNextFocusableComponent(jTMon);
        jPanel1.add(jTCant, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 490, 50, 50));

        jBSincronizar.setBackground(new java.awt.Color(255, 255, 255));
        jBSincronizar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBSincronizar.setForeground(new java.awt.Color(255, 51, 51));
        jBSincronizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/sincronizacion.png"))); // NOI18N
        jBSincronizar.setToolTipText("Salir (ESC)");
        jBSincronizar.setNextFocusableComponent(jTProd);
        jPanel1.add(jBSincronizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 100, 80));

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
        
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton jB1;
    protected javax.swing.JButton jBBuscGral;
    protected javax.swing.JButton jBCli;
    protected javax.swing.JButton jBCob;
    protected javax.swing.JButton jBDel;
    protected javax.swing.JButton jBLed;
    protected javax.swing.JButton jBNew;
    protected javax.swing.JButton jBNewEmp;
    protected javax.swing.JButton jBNewVta;
    protected javax.swing.JButton jBProds;
    protected javax.swing.JButton jBSal;
    protected javax.swing.JButton jBScann;
    protected javax.swing.JButton jBSincronizar;
    protected javax.swing.JButton jBTecla;
    protected javax.swing.JButton jBVeGran;
    protected javax.swing.JComboBox jComUnid;
    private javax.swing.JLabel jLImg;
    private javax.swing.JLabel jLTipVta;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    protected javax.swing.JPanel jPCon;
    protected javax.swing.JPanel jPanImg;
    protected javax.swing.JPanel jPanProds;
    private javax.swing.JPanel jPanel1;
    protected javax.swing.JPanel jPanelLin;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPaneLin;
    private javax.swing.JScrollPane jScrollProds;
    private javax.swing.JTextField jTAlma;
    protected javax.swing.JTextField jTBuscGral;
    private javax.swing.JTextField jTCadu;
    protected javax.swing.JTextField jTCant;
    private javax.swing.JTextField jTCantLot;
    protected javax.swing.JTextField jTCli;
    private javax.swing.JTextField jTCodProd;
    private javax.swing.JTextField jTColo;
    private javax.swing.JTextField jTColoAut;
    private javax.swing.JTextField jTComenSer;
    protected javax.swing.JTextField jTDesc;
    private javax.swing.JTextField jTDirOfi;
    private javax.swing.JTextField jTDirPart;
    private javax.swing.JTextField jTFec;
    private javax.swing.JTextField jTGara;
    private javax.swing.JTextField jTId;
    private javax.swing.JTextField jTImpo;
    protected javax.swing.JTextField jTImpue;
    private javax.swing.JTextField jTList;
    private javax.swing.JTextField jTLot;
    private javax.swing.JTextField jTMarc;
    private javax.swing.JTextField jTMod;
    protected javax.swing.JTextField jTMon;
    private javax.swing.JTextField jTNom;
    protected javax.swing.JTextField jTNomb;
    private javax.swing.JTextField jTNumLic;
    private javax.swing.JTextField jTPedimen;
    private javax.swing.JTextField jTPlacs;
    protected javax.swing.JTextField jTProd;
    private javax.swing.JTextField jTQtyP;
    private javax.swing.JTextField jTRecib;
    private javax.swing.JTextField jTSer;
    private javax.swing.JTextField jTSerProd;
    protected javax.swing.JTextField jTSubTot;
    private javax.swing.JTextField jTTall;
    private javax.swing.JTextField jTTarCirc;
    private javax.swing.JTextField jTTel;
    private javax.swing.JTextField jTTelOfi;
    protected javax.swing.JTextField jTTot;
    private javax.swing.JTextField jTTotCost;
    protected javax.swing.JTextField jTTotDesc;
    protected javax.swing.JTable jTab;
    // End of variables declaration//GEN-END:variables

}/*Fin de public class PtoVtaTou extends javax.swing.JFrame */

