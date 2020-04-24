package com.era.views;




public class RecibOrdJFrame extends BaseJFrame 
{        
    public RecibOrdJFrame() 
    {
        initComponents();
        
        jTab.getColumnModel().getColumn(23).setMinWidth(0);
        jTab.getColumnModel().getColumn(23).setMaxWidth(0);
        
        jTab.getColumnModel().getColumn(14).setMinWidth(0);
        jTab.getColumnModel().getColumn(14).setMaxWidth(0);
        
        jTab.setAutoResizeMode(0);
        
        this.getRootPane().setDefaultButton(jBGuar);
        
        jTSerProv.setVisible(false);
        
        jTab.getTableHeader().setReorderingAllowed(false);
        
        jTab.getColumnModel().getColumn(1).setPreferredWidth(160);        
        jTab.getColumnModel().getColumn(5).setPreferredWidth(400);        
        jTab.getColumnModel().getColumn(8).setPreferredWidth(150);
        jTab.getColumnModel().getColumn(19).setPreferredWidth(150);
        jTab.getColumnModel().getColumn(20).setPreferredWidth(150);
        jTab.getColumnModel().getColumn(21).setPreferredWidth(150);
        
        jTab.setFocusTraversalKeys(java.awt.KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, null);
        jTab.setFocusTraversalKeys(java.awt.KeyboardFocusManager.BACKWARD_TRAVERSAL_KEYS, null);
        
        jCRecibT.grabFocus();
        
    }
    
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jP1 = new javax.swing.JPanel();
        jBSal = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTab = new javax.swing.JTable();
        jP2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTNoDoc = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTCod = new javax.swing.JTextField();
        jTNomProv = new javax.swing.JTextField();
        jTCodProv = new javax.swing.JTextField();
        jTFec = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTEst = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTFEnt = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jTSubTot = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jTImp = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jTTot = new javax.swing.JTextField();
        jBGuar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTObserv = new javax.swing.JTextField();
        jBTabG = new javax.swing.JButton();
        jCRecibT = new javax.swing.JCheckBox();
        jLabel30 = new javax.swing.JLabel();
        jComSer = new javax.swing.JComboBox();
        jTSerProv = new javax.swing.JTextField();
        jCConta = new javax.swing.JCheckBox();
        jBCarg = new javax.swing.JButton();
        jBLimp = new javax.swing.JButton();
        jComMon = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jDesc = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jComFormPag = new javax.swing.JComboBox();
        jTComenSer = new javax.swing.JTextField();
        jTSerProd = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                formMouseWheelMoved(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jP1.setBackground(new java.awt.Color(255, 255, 255));
        jP1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jP1KeyPressed(evt);
            }
        });
        jP1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBSal.setBackground(new java.awt.Color(255, 255, 255));
        jBSal.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBSal.setForeground(new java.awt.Color(0, 102, 0));
        jBSal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/sal.png"))); // NOI18N
        jBSal.setText("Salir");
        jBSal.setToolTipText("Salir (ESC)");
        jBSal.setNextFocusableComponent(jTObserv);
        jBSal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBSalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBSalMouseExited(evt);
            }
        });
        jBSal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalActionPerformed(evt);
            }
        });
        jBSal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBSalKeyPressed(evt);
            }
        });
        jP1.add(jBSal, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, 120, 30));

        jTab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Cod. Producto", "Cantidad", "Unidad", "Almacén", "Descripción", "Costo", "Descuento", "Desc. Adicional", "Impuesto", "Moneda", "Importe", "Recibidos", "Cant. Recibir", "ID", "Talla", "Color", "Lote", "Pedimento", "Fecha caducidad", "Serie producto", "Comentario serie", "Garantía", "ImpoImpue"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true, true, true, true, true, true, false, true, true, true, true, true, true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTab.setGridColor(new java.awt.Color(255, 255, 255));
        jTab.setNextFocusableComponent(jBGuar);
        jTab.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTabKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTab);

        jP1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 1090, 240));

        jP2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("Cod. Proveedor:");
        jP2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 190, 110, -1));

        jLabel6.setText("Cod. proveedor:");
        jP2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 110, -1));

        jTNoDoc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTNoDoc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTNoDocFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTNoDocFocusLost(evt);
            }
        });
        jTNoDoc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTNoDocKeyPressed(evt);
            }
        });
        jP2.add(jTNoDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 120, 20));

        jLabel3.setText("Nombre proveedor:");
        jP2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 110, -1));

        jLabel2.setText("Fecha entrega:");
        jP2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 110, -1));

        jLabel20.setText("No. documento:");
        jP2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 110, -1));

        jTCod.setEditable(false);
        jTCod.setForeground(new java.awt.Color(51, 51, 255));
        jTCod.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTCod.setNextFocusableComponent(jTEst);
        jTCod.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTCodFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTCodFocusLost(evt);
            }
        });
        jTCod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTCodKeyPressed(evt);
            }
        });
        jP2.add(jTCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 50, 160, 20));

        jTNomProv.setEditable(false);
        jTNomProv.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTNomProv.setNextFocusableComponent(jTNoDoc);
        jTNomProv.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTNomProvFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTNomProvFocusLost(evt);
            }
        });
        jTNomProv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTNomProvKeyPressed(evt);
            }
        });
        jP2.add(jTNomProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 380, 20));

        jTCodProv.setEditable(false);
        jTCodProv.setBackground(new java.awt.Color(204, 255, 204));
        jTCodProv.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTCodProv.setNextFocusableComponent(jTNomProv);
        jTCodProv.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTCodProvFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTCodProvFocusLost(evt);
            }
        });
        jTCodProv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTCodProvKeyPressed(evt);
            }
        });
        jP2.add(jTCodProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 120, 20));

        jTFec.setEditable(false);
        jTFec.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTFec.setNextFocusableComponent(jTCod);
        jTFec.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTFecFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTFecFocusLost(evt);
            }
        });
        jTFec.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFecKeyPressed(evt);
            }
        });
        jP2.add(jTFec, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, 130, 20));

        jLabel5.setText("Cod. orden:");
        jP2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 50, 80, -1));

        jTEst.setEditable(false);
        jTEst.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTEst.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTEst.setNextFocusableComponent(jTab);
        jTEst.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTEstFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTEstFocusLost(evt);
            }
        });
        jTEst.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTEstKeyPressed(evt);
            }
        });
        jP2.add(jTEst, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 80, 90, 20));

        jLabel7.setText("Estado:");
        jP2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, 80, -1));

        jLabel8.setText("Fecha:");
        jP2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 80, -1));

        jTFEnt.setEditable(false);
        jTFEnt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTFEnt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTFEntFocusLost(evt);
            }
        });
        jP2.add(jTFEnt, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 130, 20));

        jLabel29.setText("Fecha compra:");
        jP2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 100, -1));

        jP1.add(jP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 810, 110));

        jTSubTot.setEditable(false);
        jTSubTot.setBackground(new java.awt.Color(204, 255, 204));
        jTSubTot.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTSubTot.setForeground(new java.awt.Color(51, 51, 0));
        jTSubTot.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTSubTot.setText("$0.00");
        jTSubTot.setFocusable(false);
        jTSubTot.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTSubTotFocusGained(evt);
            }
        });
        jTSubTot.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTSubTotKeyPressed(evt);
            }
        });
        jP1.add(jTSubTot, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 390, 160, 30));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel26.setText("Sub Total:");
        jP1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 400, 110, -1));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel27.setText("Impuesto:");
        jP1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 460, 110, -1));

        jTImp.setEditable(false);
        jTImp.setBackground(new java.awt.Color(204, 255, 204));
        jTImp.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTImp.setForeground(new java.awt.Color(51, 51, 0));
        jTImp.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTImp.setText("$0.00");
        jTImp.setFocusable(false);
        jTImp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTImpFocusGained(evt);
            }
        });
        jTImp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTImpKeyPressed(evt);
            }
        });
        jP1.add(jTImp, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 450, 160, 30));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel28.setText("Total:");
        jP1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 490, 110, -1));

        jTTot.setEditable(false);
        jTTot.setBackground(new java.awt.Color(204, 255, 204));
        jTTot.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTTot.setForeground(new java.awt.Color(51, 51, 0));
        jTTot.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTTot.setText("$0.00");
        jTTot.setFocusable(false);
        jTTot.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTTotFocusGained(evt);
            }
        });
        jTTot.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTTotKeyPressed(evt);
            }
        });
        jP1.add(jTTot, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 480, 160, 30));

        jBGuar.setBackground(new java.awt.Color(255, 255, 255));
        jBGuar.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBGuar.setForeground(new java.awt.Color(0, 102, 0));
        jBGuar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/save.png"))); // NOI18N
        jBGuar.setText("Guardar");
        jBGuar.setToolTipText("Guardar");
        jBGuar.setNextFocusableComponent(jBSal);
        jBGuar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBGuarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBGuarMouseExited(evt);
            }
        });
        jBGuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuarActionPerformed(evt);
            }
        });
        jBGuar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBGuarKeyPressed(evt);
            }
        });
        jP1.add(jBGuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 120, 30));

        jLabel1.setText("Observaciones:");
        jP1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, 130, -1));

        jTObserv.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTObserv.setNextFocusableComponent(jComMon);
        jTObserv.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTObservFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTObservFocusLost(evt);
            }
        });
        jTObserv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTObservKeyPressed(evt);
            }
        });
        jP1.add(jTObserv, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 390, 410, 20));

        jBTabG.setBackground(new java.awt.Color(0, 153, 153));
        jBTabG.setToolTipText("Mostrar Tabla en Grande");
        jBTabG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTabGActionPerformed(evt);
            }
        });
        jBTabG.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBTabGKeyPressed(evt);
            }
        });
        jP1.add(jBTabG, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 10, 20));

        jCRecibT.setBackground(new java.awt.Color(255, 255, 255));
        jCRecibT.setSelected(true);
        jCRecibT.setText("Recibir todo");
        jCRecibT.setName(""); // NOI18N
        jCRecibT.setNextFocusableComponent(jTNoDoc);
        jCRecibT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jCRecibTKeyPressed(evt);
            }
        });
        jP1.add(jCRecibT, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 140, -1));

        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel30.setText("*Serie compra:");
        jP1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 430, 100, -1));

        jComSer.setName(""); // NOI18N
        jComSer.setNextFocusableComponent(jComFormPag);
        jComSer.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jComSerFocusLost(evt);
            }
        });
        jComSer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComSerActionPerformed(evt);
            }
        });
        jComSer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComSerKeyPressed(evt);
            }
        });
        jP1.add(jComSer, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 430, 120, 20));

        jTSerProv.setEditable(false);
        jTSerProv.setFocusable(false);
        jP1.add(jTSerProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 50, 10, -1));

        jCConta.setBackground(new java.awt.Color(255, 255, 255));
        jCConta.setText("Contado ");
        jCConta.setNextFocusableComponent(jCRecibT);
        jCConta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jCContaKeyPressed(evt);
            }
        });
        jP1.add(jCConta, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 470, 110, 20));

        jBCarg.setBackground(new java.awt.Color(255, 255, 255));
        jBCarg.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jBCarg.setText("Cargar");
        jBCarg.setToolTipText("Cargar archivos de la compra");
        jBCarg.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBCarg.setName(""); // NOI18N
        jBCarg.setNextFocusableComponent(jBLimp);
        jBCarg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBCargMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBCargMouseExited(evt);
            }
        });
        jBCarg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCargActionPerformed(evt);
            }
        });
        jBCarg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBCargKeyPressed(evt);
            }
        });
        jP1.add(jBCarg, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 90, 70, -1));

        jBLimp.setBackground(new java.awt.Color(255, 255, 255));
        jBLimp.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jBLimp.setText("Limpiar");
        jBLimp.setToolTipText("Limpiar lista de archivos seleccionados");
        jBLimp.setNextFocusableComponent(jTab);
        jBLimp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBLimpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBLimpMouseExited(evt);
            }
        });
        jBLimp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpActionPerformed(evt);
            }
        });
        jBLimp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBLimpKeyPressed(evt);
            }
        });
        jP1.add(jBLimp, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 110, 70, 20));

        jComMon.setNextFocusableComponent(jComSer);
        jComMon.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jComMonFocusLost(evt);
            }
        });
        jComMon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComMonActionPerformed(evt);
            }
        });
        jComMon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComMonKeyPressed(evt);
            }
        });
        jP1.add(jComMon, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 410, 120, 20));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Moneda:");
        jP1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 410, 100, -1));

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel31.setText("Descuento:");
        jP1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 430, 110, -1));

        jDesc.setEditable(false);
        jDesc.setBackground(new java.awt.Color(204, 255, 204));
        jDesc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jDesc.setForeground(new java.awt.Color(51, 51, 0));
        jDesc.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jDesc.setText("$0.00");
        jDesc.setFocusable(false);
        jDesc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jDescFocusGained(evt);
            }
        });
        jDesc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jDescKeyPressed(evt);
            }
        });
        jP1.add(jDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 420, 160, 30));

        jLabel13.setText("Forma pago:");
        jP1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 450, 100, -1));

        jComFormPag.setNextFocusableComponent(jCConta);
        jComFormPag.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jComFormPagFocusLost(evt);
            }
        });
        jComFormPag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComFormPagActionPerformed(evt);
            }
        });
        jComFormPag.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComFormPagKeyPressed(evt);
            }
        });
        jP1.add(jComFormPag, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 450, 120, 20));

        jTComenSer.setEditable(false);
        jTComenSer.setFocusable(false);
        jP1.add(jTComenSer, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 50, 10, -1));

        jTSerProd.setEditable(false);
        jTSerProd.setFocusable(false);
        jP1.add(jTSerProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 50, 10, -1));

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
                .addComponent(jP1, javax.swing.GroupLayout.DEFAULT_SIZE, 557, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void jBSalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalActionPerformed
        
    
        
    }//GEN-LAST:event_jBSalActionPerformed

        
    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed

    
        
    }//GEN-LAST:event_formKeyPressed

    
    
    private void jTNoDocKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTNoDocKeyPressed
        
    
        
    }//GEN-LAST:event_jTNoDocKeyPressed

    
    
    private void jBSalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBSalKeyPressed
        
    
        
    }//GEN-LAST:event_jBSalKeyPressed

    
    
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        
    
        
    }//GEN-LAST:event_formWindowClosing

    
    
    private void jTNoDocFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTNoDocFocusGained
        
    
        
    }//GEN-LAST:event_jTNoDocFocusGained

        
    private void jP1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jP1KeyPressed
        
    
        
    }//GEN-LAST:event_jP1KeyPressed
               
    
    
    private void jTSubTotFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTSubTotFocusGained
        
    
        
    }//GEN-LAST:event_jTSubTotFocusGained

    
    
    private void jTImpFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTImpFocusGained
        
    
        
    }//GEN-LAST:event_jTImpFocusGained

    
    
    private void jTTotFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTTotFocusGained
        
        
    }//GEN-LAST:event_jTTotFocusGained

    
    
    private void jTSubTotKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTSubTotKeyPressed
        
    
        
    }//GEN-LAST:event_jTSubTotKeyPressed

    
    
    private void jTImpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTImpKeyPressed
        
    
        
    }//GEN-LAST:event_jTImpKeyPressed

    
    
    private void jTTotKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTTotKeyPressed
        
    
        
    }//GEN-LAST:event_jTTotKeyPressed

    
   
    private void jTCodProvFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCodProvFocusGained
        
   
        
    }//GEN-LAST:event_jTCodProvFocusGained

    
   
    private void jTNomProvFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTNomProvFocusGained
        
   
                
    }//GEN-LAST:event_jTNomProvFocusGained

    
   
    private void jTCodProvKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTCodProvKeyPressed
        
   
        
    }//GEN-LAST:event_jTCodProvKeyPressed

    
    
    private void jTNomProvKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTNomProvKeyPressed
        
    
        
    }//GEN-LAST:event_jTNomProvKeyPressed

    
    
    private void jTCodKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTCodKeyPressed
        
    
        
    }//GEN-LAST:event_jTCodKeyPressed

    
    
    private void jTCodFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCodFocusGained
        
    
        
    }//GEN-LAST:event_jTCodFocusGained

    
    
    private void jTFecKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFecKeyPressed
        
    
        
    }//GEN-LAST:event_jTFecKeyPressed

    
    
    private void jTFecFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFecFocusGained
        
    
        
    }//GEN-LAST:event_jTFecFocusGained

    
    
    private void jTEstFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTEstFocusGained
        
    
        
    }//GEN-LAST:event_jTEstFocusGained

    
    
    private void jTEstKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTEstKeyPressed
        
         
        
    }//GEN-LAST:event_jTEstKeyPressed

        
    private void jBGuarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBGuarKeyPressed
        
    
        
    }//GEN-LAST:event_jBGuarKeyPressed

    
    
    private void jBGuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuarActionPerformed
        
    
               
    }//GEN-LAST:event_jBGuarActionPerformed

    
    
    private void jTabKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTabKeyPressed
        
    
        
    }//GEN-LAST:event_jTabKeyPressed

    
    
    private void jTObservFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTObservFocusGained
        
        
        
    }//GEN-LAST:event_jTObservFocusGained

    
    
    private void jTObservKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTObservKeyPressed
        
    
        
    }//GEN-LAST:event_jTObservKeyPressed
                
   
    
    private void jTObservFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTObservFocusLost

    
        
    }//GEN-LAST:event_jTObservFocusLost

    
  
    private void formMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_formMouseWheelMoved
        
  
        
    }//GEN-LAST:event_formMouseWheelMoved

    
  
    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        
  
        
    }//GEN-LAST:event_formMouseDragged

    
  
    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        
  
        
    }//GEN-LAST:event_formMouseMoved

    
  
    private void jBTabGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTabGActionPerformed

  

    }//GEN-LAST:event_jBTabGActionPerformed

    
  
    private void jBTabGKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBTabGKeyPressed

  

    }//GEN-LAST:event_jBTabGKeyPressed

    
    
  
    private void jCRecibTKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCRecibTKeyPressed
        
  
        
    }//GEN-LAST:event_jCRecibTKeyPressed

    private void jComSerFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComSerFocusLost

  

    }//GEN-LAST:event_jComSerFocusLost

    
  
    private void jComSerKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComSerKeyPressed

  
        
    }//GEN-LAST:event_jComSerKeyPressed

    
  
    private void jDFechKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jDFechKeyPressed

  
    }//GEN-LAST:event_jDFechKeyPressed

    
    
    private void jCContaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCContaKeyPressed

    

    }//GEN-LAST:event_jCContaKeyPressed

    
    
    private void jBGuarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBGuarMouseEntered
        
    
        
    }//GEN-LAST:event_jBGuarMouseEntered

    
    
    private void jBSalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSalMouseExited
        
    
        
    }//GEN-LAST:event_jBSalMouseExited

    
    
    private void jBGuarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBGuarMouseExited
        
    
        
    }//GEN-LAST:event_jBGuarMouseExited

    
    
    private void jBSalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSalMouseEntered
        
    
        
    }//GEN-LAST:event_jBSalMouseEntered

    
    
    private void jBCargMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBCargMouseEntered

    

    }//GEN-LAST:event_jBCargMouseEntered

    
    
    private void jBCargMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBCargMouseExited

    

    }//GEN-LAST:event_jBCargMouseExited

    
    
    private void jBCargActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCargActionPerformed

    

    }//GEN-LAST:event_jBCargActionPerformed

    
    
    private void jBCargKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBCargKeyPressed

    

    }//GEN-LAST:event_jBCargKeyPressed

    
    
    private void jBLimpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpActionPerformed
        
    
        
    }//GEN-LAST:event_jBLimpActionPerformed

    
    
    private void jBLimpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBLimpKeyPressed
        
    
        
    }//GEN-LAST:event_jBLimpKeyPressed

    
    
    private void jBLimpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBLimpMouseEntered
        
    
        
    }//GEN-LAST:event_jBLimpMouseEntered

    
    
    private void jBLimpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBLimpMouseExited
        
    
        
    }//GEN-LAST:event_jBLimpMouseExited

    
    
    private void jTCodProvFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCodProvFocusLost
        
    
        
    }//GEN-LAST:event_jTCodProvFocusLost

    
    
    private void jTNoDocFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTNoDocFocusLost
    
    
        
    }//GEN-LAST:event_jTNoDocFocusLost

    
    
    private void jTNomProvFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTNomProvFocusLost
        
    
        
    }//GEN-LAST:event_jTNomProvFocusLost

    
    
    private void jTFecFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFecFocusLost
        
    
        
    }//GEN-LAST:event_jTFecFocusLost

    
    
    private void jTFEntFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFEntFocusLost
        
        
    }//GEN-LAST:event_jTFEntFocusLost

    

    private void jTCodFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCodFocusLost
        

        
    }//GEN-LAST:event_jTCodFocusLost

    

    private void jTEstFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTEstFocusLost
        

        
    }//GEN-LAST:event_jTEstFocusLost

    

    private void jComMonFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComMonFocusLost



    }//GEN-LAST:event_jComMonFocusLost

    

    private void jComMonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComMonActionPerformed


        
    }//GEN-LAST:event_jComMonActionPerformed

    
    
    private void jComMonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComMonKeyPressed

    

    }//GEN-LAST:event_jComMonKeyPressed

    
    
    private void jComSerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComSerActionPerformed

    
        
    }//GEN-LAST:event_jComSerActionPerformed

    
    
    private void jDescFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jDescFocusGained
        
    
        
    }//GEN-LAST:event_jDescFocusGained

    
    
    private void jDescKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jDescKeyPressed
        
        
        
    }//GEN-LAST:event_jDescKeyPressed

    
    
    private void jComFormPagFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComFormPagFocusLost

    
        
    }//GEN-LAST:event_jComFormPagFocusLost

    
    
    private void jComFormPagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComFormPagActionPerformed

    
                    
    }//GEN-LAST:event_jComFormPagActionPerformed

    
    
    private void jComFormPagKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComFormPagKeyPressed

    
        
    }//GEN-LAST:event_jComFormPagKeyPressed

       
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCarg;
    private javax.swing.JButton jBGuar;
    private javax.swing.JButton jBLimp;
    private javax.swing.JButton jBSal;
    private javax.swing.JButton jBTabG;
    private javax.swing.JCheckBox jCConta;
    private javax.swing.JCheckBox jCRecibT;
    private javax.swing.JComboBox jComFormPag;
    private javax.swing.JComboBox jComMon;
    private javax.swing.JComboBox jComSer;
    private javax.swing.JTextField jDesc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jP1;
    private javax.swing.JPanel jP2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTCod;
    private javax.swing.JTextField jTCodProv;
    private javax.swing.JTextField jTComenSer;
    private javax.swing.JTextField jTEst;
    private javax.swing.JTextField jTFEnt;
    private javax.swing.JTextField jTFec;
    private javax.swing.JTextField jTImp;
    private javax.swing.JTextField jTNoDoc;
    private javax.swing.JTextField jTNomProv;
    private javax.swing.JTextField jTObserv;
    private javax.swing.JTextField jTSerProd;
    private javax.swing.JTextField jTSerProv;
    private javax.swing.JTextField jTSubTot;
    private javax.swing.JTextField jTTot;
    private javax.swing.JTable jTab;
    // End of variables declaration//GEN-END:variables

}/*Fin de public class NuevaEmpresa extends javax.swing.JFrame */
