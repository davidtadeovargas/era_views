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
        jTab = new com.era.views.tables.PartvtaTable();
        jBDel = new javax.swing.JButton();
        jB1 = new javax.swing.JButton();
        jBTecla = new javax.swing.JButton();
        jBSal = new javax.swing.JButton();
        jTQtyP = new javax.swing.JTextField();
        jTProd = new javax.swing.JTextField();
        jBProds = new javax.swing.JButton();
        jBNew = new javax.swing.JButton();
        jBCob = new javax.swing.JButton();
        jScrollPaneLin = new javax.swing.JScrollPane();
        jPanelLin = new com.era.views.panels.LinesJPanel();
        jBCli = new javax.swing.JButton();
        jBNewEmp = new javax.swing.JButton();
        jScrollProds = new javax.swing.JScrollPane();
        jPanProds = new com.era.views.panels.ProductsJPanel();
        jTDesc = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTTot = new javax.swing.JTextField();
        jTImpue = new javax.swing.JTextField();
        jTSubTot = new javax.swing.JTextField();
        jBVeGran = new javax.swing.JButton();
        jPanImg = new javax.swing.JPanel();
        jLImg = new javax.swing.JLabel();
        jPCon = new javax.swing.JPanel();
        jBLed = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTTotDesc = new javax.swing.JTextField();
        jLTipVta = new javax.swing.JLabel();
        jComUnid = new com.era.views.comboboxes.UnidsCombobox();
        jBScann = new javax.swing.JButton();
        jTCant = new javax.swing.JTextField();
        jBSincronizar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabelCred = new javax.swing.JLabel();

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
        jTab.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
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
        jB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB1ActionPerformed(evt);
            }
        });
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

        jScrollProds.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollProds.setToolTipText("");
        jScrollProds.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollProds.setViewportBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollProds.setAutoscrolls(true);
        jScrollProds.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        jPanProds.setAutoscrolls(true);
        jPanProds.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jPanProds.setLayout(new java.awt.GridLayout(5, 3));
        jScrollProds.setViewportView(jPanProds);

        jPanel1.add(jScrollProds, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 60, 500, 660));

        jTDesc.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jTDesc.setForeground(new java.awt.Color(0, 0, 255));
        jTDesc.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTDesc.setText("0");
        jTDesc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPanel1.add(jTDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 540, 70, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel2.setText("DESCUENTO %");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 540, 210, -1));

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
        jPanImg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanImg.add(jLImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.add(jPanImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 550, 200, 170));

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

        jLTipVta.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLTipVta.setText("VENTA DE CONTADO");
        jLTipVta.setFocusable(false);
        jPanel1.add(jLTipVta, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 10, 220, 40));

        jComUnid.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComUnid.setToolTipText("Unidad de producto");
        jComUnid.setName(""); // NOI18N
        jComUnid.setNextFocusableComponent(jBProds);
        jPanel1.add(jComUnid, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 490, 110, 50));

        jBScann.setBackground(new java.awt.Color(255, 255, 255));
        jBScann.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/activado-2.png"))); // NOI18N
        jBScann.setToolTipText("Abrir scaner");
        jBScann.setNextFocusableComponent(jBSal);
        jPanel1.add(jBScann, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 100, 80));

        jTCant.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTCant.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTCant.setText("1");
        jTCant.setToolTipText("Cantidad a Vender");
        jPanel1.add(jTCant, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 490, 70, 50));

        jBSincronizar.setBackground(new java.awt.Color(255, 255, 255));
        jBSincronizar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBSincronizar.setForeground(new java.awt.Color(255, 51, 51));
        jBSincronizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/sincronizacion.png"))); // NOI18N
        jBSincronizar.setToolTipText("Salir (ESC)");
        jBSincronizar.setNextFocusableComponent(jTProd);
        jPanel1.add(jBSincronizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 100, 80));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("OPCIONES F11");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 10, 280, 40));

        jLabelCred.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabelCred.setForeground(new java.awt.Color(0, 153, 51));
        jLabelCred.setText("Contado");
        jPanel1.add(jLabelCred, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 710, 480, 30));

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jB1ActionPerformed

    
        
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton jB1;
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
    protected com.era.views.comboboxes.UnidsCombobox jComUnid;
    protected javax.swing.JLabel jLImg;
    private javax.swing.JLabel jLTipVta;
    protected javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    protected javax.swing.JLabel jLabelCred;
    protected javax.swing.JPanel jPCon;
    protected javax.swing.JPanel jPanImg;
    protected com.era.views.panels.ProductsJPanel jPanProds;
    private javax.swing.JPanel jPanel1;
    protected com.era.views.panels.LinesJPanel jPanelLin;
    private javax.swing.JScrollPane jScrollPane1;
    protected javax.swing.JScrollPane jScrollPaneLin;
    protected javax.swing.JScrollPane jScrollProds;
    protected javax.swing.JTextField jTCant;
    protected javax.swing.JTextField jTCli;
    protected javax.swing.JTextField jTDesc;
    protected javax.swing.JTextField jTImpue;
    protected javax.swing.JTextField jTNomb;
    protected javax.swing.JTextField jTProd;
    protected javax.swing.JTextField jTQtyP;
    protected javax.swing.JTextField jTSubTot;
    protected javax.swing.JTextField jTTot;
    protected javax.swing.JTextField jTTotDesc;
    protected com.era.views.tables.PartvtaTable jTab;
    // End of variables declaration//GEN-END:variables

}/*Fin de public class PtoVtaTou extends javax.swing.JFrame */

