package com.era.views;



public abstract class NewNotJFrame extends BaseJFrame
{        
    public NewNotJFrame(final String idTextTitleWindow) 
    {                                                 
        super(idTextTitleWindow);
        
        initComponents();

        jTTotCostF.setVisible(false);
        jTTotCost.setVisible(false);
        
        jTConcep.setVisible(false);
        jTCodConcep.setVisible(false);
        
        this.getRootPane().setDefaultButton(jBGuar);
        
        jTab.getColumnModel().getColumn(0).setPreferredWidth(60);
        jTab.getColumnModel().getColumn(5).setPreferredWidth(300);
        jTab.getColumnModel().getColumn(6).setPreferredWidth(300);
        
        jTab.getTableHeader().setReorderingAllowed(false);
        
        jTSaldDispo.setVisible(false);
        jTLimCred.setVisible(false);
        jTDiaCre.setVisible(false);
        
        jTAObserv.setFocusTraversalKeys(java.awt.KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, null);
        jTAObserv.setFocusTraversalKeys(java.awt.KeyboardFocusManager.BACKWARD_TRAVERSAL_KEYS, null);
        
        jTCli.grabFocus();
        
        jTab.setFocusTraversalKeys(java.awt.KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, null);
        jTab.setFocusTraversalKeys(java.awt.KeyboardFocusManager.BACKWARD_TRAVERSAL_KEYS, null);
    }
            
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jP1 = new javax.swing.JPanel();
        jBGuar = new javax.swing.JButton();
        jBSal = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTab = new javax.swing.JTable();
        jPParts = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jTFol = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jTFilt = new javax.swing.JTextField();
        jBFilt = new javax.swing.JButton();
        jLabel41 = new javax.swing.JLabel();
        jTNoSerF = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jTCliF = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jTSerF = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jTUsrF = new javax.swing.JTextField();
        jTMetPagF = new javax.swing.JTextField();
        jTCtaF = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jTFechF = new javax.swing.JTextField();
        jTSubTotF = new javax.swing.JTextField();
        jTImpueF = new javax.swing.JTextField();
        jTTotF = new javax.swing.JTextField();
        jTEstadF = new javax.swing.JTextField();
        jTMotivF = new javax.swing.JTextField();
        jTFVencF = new javax.swing.JTextField();
        jTObservF = new javax.swing.JTextField();
        jTTimbF = new javax.swing.JTextField();
        jTSucF = new javax.swing.JTextField();
        jTCajF = new javax.swing.JTextField();
        jBVePart = new javax.swing.JButton();
        jBConcep = new javax.swing.JButton();
        jComImp = new javax.swing.JComboBox();
        jLabel63 = new javax.swing.JLabel();
        jTTipoRelacion = new javax.swing.JTextField();
        jBTipoRelacion = new javax.swing.JButton();
        jLabel44 = new javax.swing.JLabel();
        jTTipoRelacionDesc = new javax.swing.JTextField();
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
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jTCo1 = new javax.swing.JTextField();
        jTCall = new javax.swing.JTextField();
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
        jTCli = new javax.swing.JTextField();
        jBCli = new javax.swing.JButton();
        jTNomCli = new javax.swing.JTextField();
        jTCond = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jTSer = new javax.swing.JTextField();
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
        jComSer = new javax.swing.JComboBox();
        jLMetPag = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jTCta = new javax.swing.JTextField();
        jCGuaPag = new javax.swing.JCheckBox();
        jCMand = new javax.swing.JCheckBox();
        jCImp = new javax.swing.JCheckBox();
        jCMostA = new javax.swing.JCheckBox();
        jCTim = new javax.swing.JCheckBox();
        jTCatGral = new javax.swing.JTextField();
        jLCatGral = new javax.swing.JLabel();
        jBCatGral = new javax.swing.JButton();
        jCFExt = new javax.swing.JCheckBox();
        jLabel40 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTAObserv = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jComMon = new javax.swing.JComboBox();
        cmbMetodoPago = new javax.swing.JComboBox();
        cmbUsoCfdi = new javax.swing.JComboBox();
        jLabel64 = new javax.swing.JLabel();
        jLNot = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jTImpue = new javax.swing.JTextField();
        jLabel62 = new javax.swing.JLabel();
        jTSubTot = new javax.swing.JTextField();
        jTTotCostF = new javax.swing.JTextField();
        jTTotCost = new javax.swing.JTextField();
        jTConcep = new javax.swing.JTextField();
        jTCodConcep = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
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
        jP1.add(jBGuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, 120, 30));

        jBSal.setBackground(new java.awt.Color(255, 255, 255));
        jBSal.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBSal.setForeground(new java.awt.Color(0, 102, 0));
        jBSal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/sal.png"))); // NOI18N
        jBSal.setText("Salir");
        jBSal.setToolTipText("Salir (ESC)");
        jBSal.setNextFocusableComponent(jTCli);
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
        jP1.add(jBSal, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 570, 110, 30));

        jTab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Qty.", "Folio", "Serie", "Cliente", "Nombre", "Descripción", "Subtotal", "Impuesto", "Total", "Total Costo", "Tipo Relacion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTab.setGridColor(new java.awt.Color(255, 255, 255));
        jTab.setNextFocusableComponent(jBGuar);
        jTab.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        jTab.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTabKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTab);

        jP1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 1080, 120));

        jPParts.setBackground(new java.awt.Color(255, 255, 255));
        jPParts.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos de la Factura", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPParts.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPPartsKeyPressed(evt);
            }
        });
        jPParts.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setText("Filtro Búsqueda:");
        jPParts.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 110, -1));

        jTFol.setEditable(false);
        jTFol.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTFol.setNextFocusableComponent(jTNoSerF);
        jTFol.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTFolFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTFolFocusLost(evt);
            }
        });
        jTFol.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFolKeyPressed(evt);
            }
        });
        jPParts.add(jTFol, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 90, 20));

        jLabel33.setText("Usuario:");
        jPParts.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, 80, -1));

        jTFilt.setBackground(new java.awt.Color(255, 255, 153));
        jTFilt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTFilt.setNextFocusableComponent(jBFilt);
        jTFilt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTFiltFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTFiltFocusLost(evt);
            }
        });
        jTFilt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFiltActionPerformed(evt);
            }
        });
        jTFilt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFiltKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFiltKeyTyped(evt);
            }
        });
        jPParts.add(jTFilt, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 260, 20));

        jBFilt.setBackground(new java.awt.Color(255, 255, 255));
        jBFilt.setText("D");
        jBFilt.setToolTipText("Buscar documento(s)");
        jBFilt.setNextFocusableComponent(jBConcep);
        jBFilt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBFiltMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBFiltMouseExited(evt);
            }
        });
        jBFilt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFiltActionPerformed(evt);
            }
        });
        jBFilt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBFiltKeyPressed(evt);
            }
        });
        jPParts.add(jBFilt, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 40, 20));

        jLabel41.setText("Tipo Relación:");
        jPParts.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 100, -1));

        jTNoSerF.setEditable(false);
        jTNoSerF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTNoSerF.setNextFocusableComponent(jTCliF);
        jTNoSerF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTNoSerFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTNoSerFFocusLost(evt);
            }
        });
        jTNoSerF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTNoSerFKeyPressed(evt);
            }
        });
        jPParts.add(jTNoSerF, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 90, 20));

        jLabel42.setText("Serie:");
        jPParts.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 100, -1));

        jTCliF.setEditable(false);
        jTCliF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTCliF.setNextFocusableComponent(jTSerF);
        jTCliF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTCliFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTCliFFocusLost(evt);
            }
        });
        jTCliF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTCliFKeyPressed(evt);
            }
        });
        jPParts.add(jTCliF, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 90, 20));

        jLabel43.setText("Cod.Cliente:");
        jPParts.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 100, -1));

        jTSerF.setEditable(false);
        jTSerF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTSerF.setNextFocusableComponent(jTMetPagF);
        jTSerF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTSerFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTSerFFocusLost(evt);
            }
        });
        jTSerF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTSerFKeyPressed(evt);
            }
        });
        jPParts.add(jTSerF, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 90, 20));

        jLabel46.setText("Serie Cliente:");
        jPParts.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 100, -1));

        jLabel49.setText("Método Pago:");
        jPParts.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 100, -1));

        jLabel50.setText("Cuenta:");
        jPParts.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 100, -1));

        jTUsrF.setEditable(false);
        jTUsrF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTUsrF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTUsrFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTUsrFFocusLost(evt);
            }
        });
        jTUsrF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTUsrFKeyPressed(evt);
            }
        });
        jPParts.add(jTUsrF, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 160, 170, 20));

        jTMetPagF.setEditable(false);
        jTMetPagF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTMetPagF.setNextFocusableComponent(jTCtaF);
        jTMetPagF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTMetPagFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTMetPagFFocusLost(evt);
            }
        });
        jTMetPagF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTMetPagFKeyPressed(evt);
            }
        });
        jPParts.add(jTMetPagF, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 90, 20));

        jTCtaF.setEditable(false);
        jTCtaF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTCtaF.setNextFocusableComponent(jTFechF);
        jTCtaF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTCtaFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTCtaFFocusLost(evt);
            }
        });
        jTCtaF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTCtaFKeyPressed(evt);
            }
        });
        jPParts.add(jTCtaF, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 90, 20));

        jLabel51.setText("Fecha:");
        jPParts.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 80, -1));

        jLabel52.setText("Subtotal:");
        jPParts.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 80, -1));

        jLabel53.setText("Impuesto:");
        jPParts.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 80, -1));

        jLabel54.setText("Total:");
        jPParts.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 80, -1));

        jLabel55.setText("Estado:");
        jPParts.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 80, -1));

        jLabel56.setText("Motivo:");
        jPParts.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 80, -1));

        jLabel57.setText("F. Vencimiento:");
        jPParts.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, 110, -1));

        jLabel58.setText("Timbrada:");
        jPParts.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, 80, -1));

        jLabel59.setText("Sucursal:");
        jPParts.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, 80, -1));

        jLabel60.setText("Caja:");
        jPParts.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, 80, -1));

        jLabel61.setText("Impuesto:");
        jPParts.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, 110, 10));

        jTFechF.setEditable(false);
        jTFechF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTFechF.setNextFocusableComponent(jTSubTotF);
        jTFechF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTFechFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTFechFFocusLost(evt);
            }
        });
        jTFechF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFechFKeyPressed(evt);
            }
        });
        jPParts.add(jTFechF, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 140, 20));

        jTSubTotF.setEditable(false);
        jTSubTotF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTSubTotF.setNextFocusableComponent(jTImpueF);
        jTSubTotF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTSubTotFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTSubTotFFocusLost(evt);
            }
        });
        jTSubTotF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTSubTotFKeyPressed(evt);
            }
        });
        jPParts.add(jTSubTotF, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 140, 20));

        jTImpueF.setEditable(false);
        jTImpueF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTImpueF.setNextFocusableComponent(jTTotF);
        jTImpueF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTImpueFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTImpueFFocusLost(evt);
            }
        });
        jTImpueF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTImpueFKeyPressed(evt);
            }
        });
        jPParts.add(jTImpueF, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 140, 20));

        jTTotF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTTotF.setNextFocusableComponent(jBVePart);
        jTTotF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTTotFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTTotFFocusLost(evt);
            }
        });
        jTTotF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTTotFKeyPressed(evt);
            }
        });
        jPParts.add(jTTotF, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 140, 20));

        jTEstadF.setEditable(false);
        jTEstadF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTEstadF.setNextFocusableComponent(jTMotivF);
        jTEstadF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTEstadFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTEstadFFocusLost(evt);
            }
        });
        jTEstadF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTEstadFKeyPressed(evt);
            }
        });
        jPParts.add(jTEstadF, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 140, 20));

        jTMotivF.setEditable(false);
        jTMotivF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTMotivF.setNextFocusableComponent(jTFVencF);
        jTMotivF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTMotivFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTMotivFFocusLost(evt);
            }
        });
        jTMotivF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTMotivFKeyPressed(evt);
            }
        });
        jPParts.add(jTMotivF, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 140, 20));

        jTFVencF.setEditable(false);
        jTFVencF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTFVencF.setNextFocusableComponent(jTObservF);
        jTFVencF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTFVencFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTFVencFFocusLost(evt);
            }
        });
        jTFVencF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFVencFKeyPressed(evt);
            }
        });
        jPParts.add(jTFVencF, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, 170, 20));

        jTObservF.setEditable(false);
        jTObservF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTObservF.setNextFocusableComponent(jTTimbF);
        jTObservF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTObservFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTObservFFocusLost(evt);
            }
        });
        jTObservF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTObservFKeyPressed(evt);
            }
        });
        jPParts.add(jTObservF, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 80, 170, 20));

        jTTimbF.setEditable(false);
        jTTimbF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTTimbF.setNextFocusableComponent(jTSucF);
        jTTimbF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTTimbFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTTimbFFocusLost(evt);
            }
        });
        jTTimbF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTTimbFKeyPressed(evt);
            }
        });
        jPParts.add(jTTimbF, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 100, 170, 20));

        jTSucF.setEditable(false);
        jTSucF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTSucF.setNextFocusableComponent(jTCajF);
        jTSucF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTSucFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTSucFFocusLost(evt);
            }
        });
        jTSucF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTSucFKeyPressed(evt);
            }
        });
        jPParts.add(jTSucF, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, 170, 20));

        jTCajF.setEditable(false);
        jTCajF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTCajF.setNextFocusableComponent(jTUsrF);
        jTCajF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTCajFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTCajFFocusLost(evt);
            }
        });
        jTCajF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTCajFKeyPressed(evt);
            }
        });
        jPParts.add(jTCajF, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 140, 170, 20));

        jBVePart.setBackground(new java.awt.Color(255, 255, 255));
        jBVePart.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBVePart.setForeground(new java.awt.Color(0, 104, 0));
        jBVePart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/verpartvta.png"))); // NOI18N
        jBVePart.setToolTipText("Ver las partidas de este documento");
        jBVePart.setNextFocusableComponent(jComImp);
        jBVePart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBVePartMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBVePartMouseExited(evt);
            }
        });
        jBVePart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVePartActionPerformed(evt);
            }
        });
        jBVePart.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBVePartKeyPressed(evt);
            }
        });
        jPParts.add(jBVePart, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, 50, 30));

        jBConcep.setBackground(new java.awt.Color(255, 255, 255));
        jBConcep.setText("C");
        jBConcep.setToolTipText("Buscar concepto(s)");
        jBConcep.setNextFocusableComponent(jTTipoRelacion);
        jBConcep.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBConcepMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBConcepMouseExited(evt);
            }
        });
        jBConcep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConcepActionPerformed(evt);
            }
        });
        jBConcep.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBConcepKeyPressed(evt);
            }
        });
        jPParts.add(jBConcep, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 40, 20));

        jComImp.setNextFocusableComponent(jTFol);
        jComImp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jComImpFocusLost(evt);
            }
        });
        jComImp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComImpActionPerformed(evt);
            }
        });
        jComImp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComImpKeyPressed(evt);
            }
        });
        jPParts.add(jComImp, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 20, 90, 20));

        jLabel63.setText("Observaciones:");
        jPParts.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, 110, -1));

        jTTipoRelacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTTipoRelacion.setNextFocusableComponent(jBTipoRelacion);
        jTTipoRelacion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTTipoRelacionFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTTipoRelacionFocusLost(evt);
            }
        });
        jTTipoRelacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTTipoRelacionKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTTipoRelacionKeyTyped(evt);
            }
        });
        jPParts.add(jTTipoRelacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 90, 20));

        jBTipoRelacion.setBackground(new java.awt.Color(255, 255, 255));
        jBTipoRelacion.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBTipoRelacion.setText("jButton1");
        jBTipoRelacion.setNextFocusableComponent(jTTotF);
        jBTipoRelacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTipoRelacionActionPerformed(evt);
            }
        });
        jPParts.add(jBTipoRelacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 40, 20));

        jLabel44.setText("Folio:");
        jPParts.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 100, -1));

        jTTipoRelacionDesc.setEditable(false);
        jTTipoRelacionDesc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTTipoRelacionDesc.setNextFocusableComponent(jTSubTotF);
        jTTipoRelacionDesc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTTipoRelacionDescFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTTipoRelacionDescFocusLost(evt);
            }
        });
        jTTipoRelacionDesc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTTipoRelacionDescKeyPressed(evt);
            }
        });
        jPParts.add(jTTipoRelacionDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 210, 20));

        jP1.add(jPParts, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 790, 200));

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
        jPClien.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 50, 70, -1));

        jLabel35.setText("*Estado:");
        jPClien.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, 70, -1));

        jLabel36.setText("Condiciones:");
        jPClien.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 230, -1));

        jTCo1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTCo1.setNextFocusableComponent(jCCo1);
        jTCo1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTCo1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTCo1FocusLost(evt);
            }
        });
        jTCo1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTCo1KeyPressed(evt);
            }
        });
        jPClien.add(jTCo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 90, 160, 20));

        jTCall.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTCall.setNextFocusableComponent(jTCol);
        jTCall.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTCallFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTCallFocusLost(evt);
            }
        });
        jTCall.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTCallKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTCallKeyTyped(evt);
            }
        });
        jPClien.add(jTCall, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 160, 20));

        jTCol.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTCol.setNextFocusableComponent(jTTel);
        jTCol.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTColFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTColFocusLost(evt);
            }
        });
        jTCol.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTColKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTColKeyTyped(evt);
            }
        });
        jPClien.add(jTCol, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 160, 20));

        jTTel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTTel.setNextFocusableComponent(jTPai);
        jTTel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTTelFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTTelFocusLost(evt);
            }
        });
        jTTel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTTelKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTTelKeyTyped(evt);
            }
        });
        jPClien.add(jTTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 160, 20));

        jTPai.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTPai.setNextFocusableComponent(jTCond);
        jTPai.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTPaiFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTPaiFocusLost(evt);
            }
        });
        jTPai.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTPaiKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTPaiKeyTyped(evt);
            }
        });
        jPClien.add(jTPai, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 160, 20));

        jTCP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTCP.setNextFocusableComponent(jTNoExt);
        jTCP.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTCPFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTCPFocusLost(evt);
            }
        });
        jTCP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTCPKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTCPKeyTyped(evt);
            }
        });
        jPClien.add(jTCP, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 160, 20));

        jTNoExt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTNoExt.setNextFocusableComponent(jTNoInt);
        jTNoExt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTNoExtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTNoExtFocusLost(evt);
            }
        });
        jTNoExt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTNoExtKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTNoExtKeyTyped(evt);
            }
        });
        jPClien.add(jTNoExt, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 160, 20));

        jTNoInt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTNoInt.setNextFocusableComponent(jTRFC);
        jTNoInt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTNoIntFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTNoIntFocusLost(evt);
            }
        });
        jTNoInt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTNoIntKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTNoIntKeyTyped(evt);
            }
        });
        jPClien.add(jTNoInt, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, 160, 20));

        jTRFC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTRFC.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTRFCFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTRFCFocusLost(evt);
            }
        });
        jTRFC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTRFCKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTRFCKeyTyped(evt);
            }
        });
        jPClien.add(jTRFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 160, 20));

        jTCiu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTCiu.setNextFocusableComponent(jTEstad);
        jTCiu.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTCiuFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTCiuFocusLost(evt);
            }
        });
        jTCiu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTCiuKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTCiuKeyTyped(evt);
            }
        });
        jPClien.add(jTCiu, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 50, 160, 20));

        jTEstad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTEstad.setNextFocusableComponent(jTCo1);
        jTEstad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTEstadFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTEstadFocusLost(evt);
            }
        });
        jTEstad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTEstadKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTEstadKeyTyped(evt);
            }
        });
        jPClien.add(jTEstad, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 70, 160, 20));

        jCGDats.setBackground(new java.awt.Color(255, 255, 255));
        jCGDats.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCGDats.setText("Modificar datos del cliente F11");
        jCGDats.setName(""); // NOI18N
        jCGDats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCGDatsActionPerformed(evt);
            }
        });
        jCGDats.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jCGDatsKeyPressed(evt);
            }
        });
        jPClien.add(jCGDats, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 150, 180, -1));

        jTCo3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTCo3.setNextFocusableComponent(jCCo3);
        jTCo3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTCo3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTCo3FocusLost(evt);
            }
        });
        jTCo3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTCo3KeyPressed(evt);
            }
        });
        jPClien.add(jTCo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 130, 160, 20));

        jCCo3.setBackground(new java.awt.Color(255, 255, 255));
        jCCo3.setText("Correo 3:");
        jCCo3.setNextFocusableComponent(jCGDats);
        jCCo3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCCo3ItemStateChanged(evt);
            }
        });
        jCCo3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jCCo3KeyPressed(evt);
            }
        });
        jPClien.add(jCCo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, 80, -1));

        jTCo2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTCo2.setNextFocusableComponent(jCCo2);
        jTCo2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTCo2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTCo2FocusLost(evt);
            }
        });
        jTCo2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTCo2KeyPressed(evt);
            }
        });
        jPClien.add(jTCo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 110, 160, 20));

        jCCo1.setBackground(new java.awt.Color(255, 255, 255));
        jCCo1.setSelected(true);
        jCCo1.setText("Correo 1:");
        jCCo1.setNextFocusableComponent(jTCo2);
        jCCo1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jCCo1KeyPressed(evt);
            }
        });
        jPClien.add(jCCo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, 80, -1));

        jCCo2.setBackground(new java.awt.Color(255, 255, 255));
        jCCo2.setText("Correo 2:");
        jCCo2.setNextFocusableComponent(jTCo3);
        jCCo2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCCo2ItemStateChanged(evt);
            }
        });
        jCCo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCCo2ActionPerformed(evt);
            }
        });
        jCCo2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jCCo2KeyPressed(evt);
            }
        });
        jPClien.add(jCCo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, 80, -1));

        jTCli.setBackground(new java.awt.Color(204, 255, 204));
        jTCli.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTCli.setNextFocusableComponent(jBCli);
        jTCli.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTCliFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTCliFocusLost(evt);
            }
        });
        jTCli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTCliKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTCliKeyTyped(evt);
            }
        });
        jPClien.add(jTCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 130, 20));

        jBCli.setBackground(new java.awt.Color(255, 255, 255));
        jBCli.setText("...");
        jBCli.setToolTipText("Buscar Cliente(s)");
        jBCli.setNextFocusableComponent(jTCall);
        jBCli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBCliMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBCliMouseExited(evt);
            }
        });
        jBCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCliActionPerformed(evt);
            }
        });
        jBCli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBCliKeyPressed(evt);
            }
        });
        jPClien.add(jBCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 30, 20));

        jTNomCli.setEditable(false);
        jTNomCli.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTNomCli.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTNomCliFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTNomCliFocusLost(evt);
            }
        });
        jTNomCli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTNomCliKeyPressed(evt);
            }
        });
        jPClien.add(jTNomCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 410, 20));

        jTCond.setEditable(false);
        jTCond.setBackground(new java.awt.Color(255, 255, 204));
        jTCond.setForeground(new java.awt.Color(0, 153, 0));
        jTCond.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTCond.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTCond.setFocusable(false);
        jTCond.setNextFocusableComponent(jTCP);
        jTCond.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTCondFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTCondFocusLost(evt);
            }
        });
        jTCond.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTCondKeyPressed(evt);
            }
        });
        jPClien.add(jTCond, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 320, 20));

        jLabel45.setText("País:");
        jPClien.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 70, -1));

        jLabel47.setText("*RFC:");
        jPClien.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 70, -1));

        jTSer.setEditable(false);
        jTSer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTSer.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTSerFocusLost(evt);
            }
        });
        jPClien.add(jTSer, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 70, 20));

        jP1.add(jPClien, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 790, 183));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel28.setText("Total:");
        jP1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 620, 110, -1));

        jTTot.setEditable(false);
        jTTot.setBackground(new java.awt.Color(204, 255, 204));
        jTTot.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTTot.setForeground(new java.awt.Color(51, 51, 0));
        jTTot.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTTot.setText("$0.00");
        jTTot.setNextFocusableComponent(jBGuar);
        jTTot.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTTotFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTTotFocusLost(evt);
            }
        });
        jTTot.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTTotKeyPressed(evt);
            }
        });
        jP1.add(jTTot, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 620, 160, 20));

        jTSaldDispo.setEditable(false);
        jTSaldDispo.setFocusable(false);
        jTSaldDispo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTSaldDispoActionPerformed(evt);
            }
        });
        jP1.add(jTSaldDispo, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 630, 10, -1));

        jTLimCred.setEditable(false);
        jTLimCred.setFocusable(false);
        jTLimCred.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTLimCredActionPerformed(evt);
            }
        });
        jP1.add(jTLimCred, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 630, 10, -1));

        jBTab1.setBackground(new java.awt.Color(0, 153, 153));
        jBTab1.setToolTipText("Mostrar Tabla en Grande");
        jBTab1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTab1ActionPerformed(evt);
            }
        });
        jBTab1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBTab1KeyPressed(evt);
            }
        });
        jP1.add(jBTab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 10, 20));

        jTDiaCre.setEditable(false);
        jTDiaCre.setFocusable(false);
        jP1.add(jTDiaCre, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 630, 10, -1));

        jBTod.setBackground(new java.awt.Color(255, 255, 255));
        jBTod.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jBTod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/marct.png"))); // NOI18N
        jBTod.setText("Marcar Todo");
        jBTod.setToolTipText("Marcar Todos los Registros de la Tabla (Alt+T)");
        jBTod.setName(""); // NOI18N
        jBTod.setNextFocusableComponent(jTab);
        jBTod.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBTodMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBTodMouseExited(evt);
            }
        });
        jBTod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTodActionPerformed(evt);
            }
        });
        jBTod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBTodKeyPressed(evt);
            }
        });
        jP1.add(jBTod, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 410, 130, 18));

        jBNew.setBackground(new java.awt.Color(255, 255, 255));
        jBNew.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBNew.setForeground(new java.awt.Color(0, 102, 0));
        jBNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/agre.png"))); // NOI18N
        jBNew.setText("Nueva");
        jBNew.setToolTipText("Nueva Partida (Ctrl+N)");
        jBNew.setNextFocusableComponent(jBDel);
        jBNew.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBNewMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBNewMouseExited(evt);
            }
        });
        jBNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNewActionPerformed(evt);
            }
        });
        jBNew.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBNewKeyPressed(evt);
            }
        });
        jP1.add(jBNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 110, 20));

        jBDel.setBackground(new java.awt.Color(255, 255, 255));
        jBDel.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBDel.setForeground(new java.awt.Color(0, 102, 0));
        jBDel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/del.png"))); // NOI18N
        jBDel.setText("Borrar");
        jBDel.setToolTipText("Borrar Partida(s) (Ctrl+SUPR)");
        jBDel.setNextFocusableComponent(jTab);
        jBDel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBDelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBDelMouseExited(evt);
            }
        });
        jBDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDelActionPerformed(evt);
            }
        });
        jBDel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBDelKeyPressed(evt);
            }
        });
        jP1.add(jBDel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, 110, 20));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Encabezado", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Fecha:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 80, -1));

        jLabel22.setText("*Serie:");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 100, -1));

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
        jPanel1.add(jComSer, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 120, 20));

        jLMetPag.setText("Método Pago:");
        jPanel1.add(jLMetPag, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 100, -1));

        jLabel48.setText("Uso Cfdi:");
        jPanel1.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 100, -1));

        jTCta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTCta.setNextFocusableComponent(jCGuaPag);
        jTCta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTCtaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTCtaFocusLost(evt);
            }
        });
        jTCta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTCtaActionPerformed(evt);
            }
        });
        jTCta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTCtaKeyPressed(evt);
            }
        });
        jPanel1.add(jTCta, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 120, 20));

        jCGuaPag.setBackground(new java.awt.Color(255, 255, 255));
        jCGuaPag.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCGuaPag.setText("Guardar Pago F7");
        jCGuaPag.setName(""); // NOI18N
        jCGuaPag.setNextFocusableComponent(jCMand);
        jCGuaPag.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jCGuaPagKeyPressed(evt);
            }
        });
        jPanel1.add(jCGuaPag, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 140, 20));

        jCMand.setBackground(new java.awt.Color(255, 255, 255));
        jCMand.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCMand.setSelected(true);
        jCMand.setText("Mandar Correo F4");
        jCMand.setNextFocusableComponent(jCImp);
        jCMand.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jCMandKeyPressed(evt);
            }
        });
        jPanel1.add(jCMand, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 130, -1));

        jCImp.setBackground(new java.awt.Color(255, 255, 255));
        jCImp.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCImp.setText("Imprimir F5");
        jCImp.setNextFocusableComponent(jCMostA);
        jCImp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jCImpKeyPressed(evt);
            }
        });
        jPanel1.add(jCImp, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 130, -1));

        jCMostA.setBackground(new java.awt.Color(255, 255, 255));
        jCMostA.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCMostA.setText("Mostrar Archivo F6");
        jCMostA.setNextFocusableComponent(jCTim);
        jCMostA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jCMostAKeyPressed(evt);
            }
        });
        jPanel1.add(jCMostA, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 130, -1));

        jCTim.setBackground(new java.awt.Color(255, 255, 255));
        jCTim.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCTim.setSelected(true);
        jCTim.setText("Timbrar");
        jCTim.setNextFocusableComponent(jTCatGral);
        jCTim.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jCTimKeyPressed(evt);
            }
        });
        jPanel1.add(jCTim, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 100, 20));

        jTCatGral.setNextFocusableComponent(jBCatGral);
        jTCatGral.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTCatGralFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTCatGralFocusLost(evt);
            }
        });
        jTCatGral.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTCatGralKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTCatGralKeyTyped(evt);
            }
        });
        jPanel1.add(jTCatGral, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 110, -1));

        jLCatGral.setText("Catálogo General");
        jPanel1.add(jLCatGral, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 130, -1));

        jBCatGral.setBackground(new java.awt.Color(255, 255, 255));
        jBCatGral.setText("...");
        jBCatGral.setToolTipText("Buscar Catálogo General");
        jBCatGral.setNextFocusableComponent(jCFExt);
        jBCatGral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCatGralActionPerformed(evt);
            }
        });
        jBCatGral.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBCatGralKeyPressed(evt);
            }
        });
        jPanel1.add(jBCatGral, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 30, 20));

        jCFExt.setBackground(new java.awt.Color(255, 255, 255));
        jCFExt.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCFExt.setText("Fecha Extra F12");
        jCFExt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCFExtActionPerformed(evt);
            }
        });
        jCFExt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jCFExtKeyPressed(evt);
            }
        });
        jPanel1.add(jCFExt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 140, 20));

        jLabel40.setText("Observaciones:");
        jPanel1.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 110, -1));

        jScrollPane2.setNextFocusableComponent(jTCli);

        jTAObserv.setColumns(20);
        jTAObserv.setLineWrap(true);
        jTAObserv.setRows(5);
        jTAObserv.setNextFocusableComponent(jTFilt);
        jTAObserv.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTAObservFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTAObservFocusLost(evt);
            }
        });
        jTAObserv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTAObservKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(jTAObserv);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 230, 40));

        jLabel9.setText("Moneda:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 110, -1));

        jComMon.setNextFocusableComponent(jTAObserv);
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
        jPanel1.add(jComMon, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 120, 20));

        jPanel1.add(cmbMetodoPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 120, 20));

        jPanel1.add(cmbUsoCfdi, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 120, 20));

        jLabel64.setText("Cuenta:");
        jPanel1.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 100, -1));

        jP1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 10, 280, 365));

        jLNot.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLNot.setForeground(new java.awt.Color(204, 0, 0));
        jLNot.setText("NOTA DE CRÉDITO CLIENTE");
        jLNot.setFocusable(false);
        jP1.add(jLNot, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 570, 530, -1));

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel37.setText("Impuesto:");
        jP1.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 600, 110, -1));

        jTImpue.setEditable(false);
        jTImpue.setBackground(new java.awt.Color(204, 255, 204));
        jTImpue.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTImpue.setForeground(new java.awt.Color(51, 51, 0));
        jTImpue.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTImpue.setText("$0.00");
        jTImpue.setNextFocusableComponent(jBGuar);
        jTImpue.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTImpueFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTImpueFocusLost(evt);
            }
        });
        jTImpue.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTImpueKeyPressed(evt);
            }
        });
        jP1.add(jTImpue, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 600, 160, 20));

        jLabel62.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel62.setText("Subtotal:");
        jP1.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 580, 110, -1));

        jTSubTot.setEditable(false);
        jTSubTot.setBackground(new java.awt.Color(204, 255, 204));
        jTSubTot.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTSubTot.setForeground(new java.awt.Color(51, 51, 0));
        jTSubTot.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTSubTot.setText("$0.00");
        jTSubTot.setNextFocusableComponent(jBGuar);
        jTSubTot.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTSubTotFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTSubTotFocusLost(evt);
            }
        });
        jTSubTot.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTSubTotKeyPressed(evt);
            }
        });
        jP1.add(jTSubTot, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 580, 160, 20));

        jTTotCostF.setEditable(false);
        jP1.add(jTTotCostF, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 630, 10, -1));

        jTTotCost.setEditable(false);
        jP1.add(jTTotCost, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 630, 10, -1));

        jTConcep.setEditable(false);
        jP1.add(jTConcep, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 630, 10, -1));

        jTCodConcep.setEditable(false);
        jP1.add(jTCodConcep, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 630, 10, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jP1, javax.swing.GroupLayout.PREFERRED_SIZE, 1116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jP1, javax.swing.GroupLayout.DEFAULT_SIZE, 655, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
                    
                                
    private void jBGuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuarActionPerformed
                                                                                      
        
    }//GEN-LAST:event_jBGuarActionPerformed
                                                            
                            
    private void jBSalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalActionPerformed
        
        
    }//GEN-LAST:event_jBSalActionPerformed

    
    
    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed

    
        
    }//GEN-LAST:event_formKeyPressed

        
    private void jBGuarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBGuarKeyPressed
        
    
        
    }//GEN-LAST:event_jBGuarKeyPressed

    
    
    private void jBSalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBSalKeyPressed
        
    
        
    }//GEN-LAST:event_jBSalKeyPressed

    
    
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        
    
        
    }//GEN-LAST:event_formWindowClosing

    
    
    private void jP1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jP1KeyPressed
        
    
        
    }//GEN-LAST:event_jP1KeyPressed

        
    
    private void jBNewKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBNewKeyPressed
        
    
        
    }//GEN-LAST:event_jBNewKeyPressed

    
    
    private void jBDelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBDelKeyPressed
        
    
        
    }//GEN-LAST:event_jBDelKeyPressed

    
    private void jPPartsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPPartsKeyPressed

    

    }//GEN-LAST:event_jPPartsKeyPressed
       
        
    
    private void jTTotFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTTotFocusGained
        
    
        
    }//GEN-LAST:event_jTTotFocusGained

    
    
    private void jTTotKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTTotKeyPressed
        
    
        
    }//GEN-LAST:event_jTTotKeyPressed
            
        
    
    private void jBNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNewActionPerformed
    
    
        
    }//GEN-LAST:event_jBNewActionPerformed

    
    
    private void jBDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDelActionPerformed
        
    
                
    }//GEN-LAST:event_jBDelActionPerformed

            

    private void jTFolFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFolFocusGained
        

        
    }//GEN-LAST:event_jTFolFocusGained

    

    private void jTFolKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFolKeyPressed
        

        
    }//GEN-LAST:event_jTFolKeyPressed

    

    private void jTabKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTabKeyPressed
        

        
    }//GEN-LAST:event_jTabKeyPressed

    

    private void jTCallFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCallFocusGained
        

        
    }//GEN-LAST:event_jTCallFocusGained

    

    private void jTColFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTColFocusGained
        

        
    }//GEN-LAST:event_jTColFocusGained

    

    private void jTTelFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTTelFocusGained
        

        
    }//GEN-LAST:event_jTTelFocusGained

    

    private void jTPaiFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTPaiFocusGained
        

        
    }//GEN-LAST:event_jTPaiFocusGained

    

    private void jTCPFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCPFocusGained
        

        
    }//GEN-LAST:event_jTCPFocusGained

    

    private void jTNoExtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTNoExtFocusGained
        

        
    }//GEN-LAST:event_jTNoExtFocusGained

    

    private void jTNoIntFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTNoIntFocusGained
        

        
    }//GEN-LAST:event_jTNoIntFocusGained

    

    private void jTRFCFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTRFCFocusGained
        

        
    }//GEN-LAST:event_jTRFCFocusGained

    

    private void jTCiuFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCiuFocusGained
        

        
    }//GEN-LAST:event_jTCiuFocusGained

    
    
    private void jTEstadFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTEstadFocusGained
        

        
    }//GEN-LAST:event_jTEstadFocusGained

    

    private void jTCo1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCo1FocusGained
        

        
    }//GEN-LAST:event_jTCo1FocusGained

    

    private void jTTelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTTelKeyPressed
        

        
    }//GEN-LAST:event_jTTelKeyPressed

    

    private void jTCallKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTCallKeyPressed
        

        
    }//GEN-LAST:event_jTCallKeyPressed

    

    private void jTColKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTColKeyPressed
        

        
    }//GEN-LAST:event_jTColKeyPressed

    

    private void jTPaiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTPaiKeyPressed
                

        
    }//GEN-LAST:event_jTPaiKeyPressed

    

    private void jTCPKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTCPKeyPressed
                

        
    }//GEN-LAST:event_jTCPKeyPressed

    

    private void jTNoExtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTNoExtKeyPressed
                        

        
    }//GEN-LAST:event_jTNoExtKeyPressed

    

    private void jTNoIntKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTNoIntKeyPressed
                        

                
    }//GEN-LAST:event_jTNoIntKeyPressed

    

    private void jTRFCKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTRFCKeyPressed
                        
        
        
    }//GEN-LAST:event_jTRFCKeyPressed

    
    
    private void jTCiuKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTCiuKeyPressed
                        
    
        
    }//GEN-LAST:event_jTCiuKeyPressed

        
    private void jTEstadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTEstadKeyPressed
                        
    
        
    }//GEN-LAST:event_jTEstadKeyPressed

        
    private void jTCo1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTCo1KeyPressed
                        
    
        
    }//GEN-LAST:event_jTCo1KeyPressed

    
    
                
    private void jCGDatsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCGDatsKeyPressed
                
        
    }//GEN-LAST:event_jCGDatsKeyPressed

        
    private void jTCo2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCo2FocusGained
        
    
        
    }//GEN-LAST:event_jTCo2FocusGained

    
    
    private void jTCo3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCo3FocusGained
        
    
        
    }//GEN-LAST:event_jTCo3FocusGained

    
    
    private void jTCo2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTCo2KeyPressed
                        
    
        
    }//GEN-LAST:event_jTCo2KeyPressed

    
    
    private void jTCo3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTCo3KeyPressed
                        
    
        
    }//GEN-LAST:event_jTCo3KeyPressed

    
    
    private void jCCo1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCCo1KeyPressed
        
    
        
    }//GEN-LAST:event_jCCo1KeyPressed

    
    
    private void jCCo2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCCo2KeyPressed
        
    
        
    }//GEN-LAST:event_jCCo2KeyPressed

    
    
    private void jCCo3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCCo3KeyPressed
        
    
        
    }//GEN-LAST:event_jCCo3KeyPressed

    
    
    private void jTCliFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCliFocusGained

    

    }//GEN-LAST:event_jTCliFocusGained

    
    
    private void jTCliFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCliFocusLost

        
                       
    }//GEN-LAST:event_jTCliFocusLost

    
    
    private void jTCliKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTCliKeyPressed

    

    }//GEN-LAST:event_jTCliKeyPressed

    
    
    private void jBCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCliActionPerformed

    
        
    }//GEN-LAST:event_jBCliActionPerformed

    
    
    private void jBCliKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBCliKeyPressed

    
        
    }//GEN-LAST:event_jBCliKeyPressed

    
    
    private void jTNomCliFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTNomCliFocusGained

    

    }//GEN-LAST:event_jTNomCliFocusGained

    
    
    private void jTNomCliKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTNomCliKeyPressed

    

    }//GEN-LAST:event_jTNomCliKeyPressed

    
    
    private void jTFiltFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFiltFocusGained

    
    }//GEN-LAST:event_jTFiltFocusGained

    
    
    private void jTFiltFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFiltFocusLost

    
        
    }//GEN-LAST:event_jTFiltFocusLost

    
    
        
    private void jTFiltKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFiltKeyPressed

        

    }//GEN-LAST:event_jTFiltKeyPressed

    
    
    private void jBFiltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFiltActionPerformed

    

    }//GEN-LAST:event_jBFiltActionPerformed

    
    
    private void jBFiltKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBFiltKeyPressed

    

    }//GEN-LAST:event_jBFiltKeyPressed

    
    
    private void jTCliKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTCliKeyTyped
        
    
        
    }//GEN-LAST:event_jTCliKeyTyped

    
    
    private void jTCallKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTCallKeyTyped
        
    
        
    }//GEN-LAST:event_jTCallKeyTyped

    
    
    private void jTColKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTColKeyTyped
        
    
        
    }//GEN-LAST:event_jTColKeyTyped

    
    
    private void jTTelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTTelKeyTyped
        
    
        
    }//GEN-LAST:event_jTTelKeyTyped

    
    
    private void jTPaiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTPaiKeyTyped
        
    
        
    }//GEN-LAST:event_jTPaiKeyTyped

    
    
    private void jTCPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTCPKeyTyped
        
    
        
    }//GEN-LAST:event_jTCPKeyTyped

    
    
    private void jTNoExtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTNoExtKeyTyped
        
    
        
    }//GEN-LAST:event_jTNoExtKeyTyped

    
    
    private void jTNoIntKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTNoIntKeyTyped
        
        
    }//GEN-LAST:event_jTNoIntKeyTyped

    
    
    private void jTRFCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTRFCKeyTyped
                
    
        
    }//GEN-LAST:event_jTRFCKeyTyped

    
    
    private void jTCiuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTCiuKeyTyped
        
        
    }//GEN-LAST:event_jTCiuKeyTyped

    
    
    private void jTEstadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTEstadKeyTyped
        
    
        
    }//GEN-LAST:event_jTEstadKeyTyped
        
    
    
    private void jTCallFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCallFocusLost

    
        
    }//GEN-LAST:event_jTCallFocusLost

    
    
    private void jTColFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTColFocusLost

    
        
    }//GEN-LAST:event_jTColFocusLost

    
    
    private void jTTelFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTTelFocusLost

    
       
    }//GEN-LAST:event_jTTelFocusLost

    
    
    private void jTPaiFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTPaiFocusLost

    
        
    }//GEN-LAST:event_jTPaiFocusLost

    
    
    private void jTCPFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCPFocusLost

    
        
    }//GEN-LAST:event_jTCPFocusLost

    
    
    private void jTNoExtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTNoExtFocusLost

    
        
    }//GEN-LAST:event_jTNoExtFocusLost

    
    
    private void jTNoIntFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTNoIntFocusLost
        
    
        
    }//GEN-LAST:event_jTNoIntFocusLost

    
    
    private void jTRFCFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTRFCFocusLost

    
        
    }//GEN-LAST:event_jTRFCFocusLost

    
    
    private void jTCiuFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCiuFocusLost

    
        
    }//GEN-LAST:event_jTCiuFocusLost

    
    
    private void jTEstadFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTEstadFocusLost

    
        
    }//GEN-LAST:event_jTEstadFocusLost

    
    
    private void jTCo1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCo1FocusLost

    
        
    }//GEN-LAST:event_jTCo1FocusLost

    
    
    private void jTCo2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCo2FocusLost

    
        
    }//GEN-LAST:event_jTCo2FocusLost

    
    
    private void jTCo3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCo3FocusLost

    
       
    }//GEN-LAST:event_jTCo3FocusLost
    
            
    
    private void jTFiltKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFiltKeyTyped
        
        
    }//GEN-LAST:event_jTFiltKeyTyped

           
    
    private void jCMostAKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCMostAKeyPressed
        
    
        
    }//GEN-LAST:event_jCMostAKeyPressed

    
    
    private void jCImpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCImpKeyPressed
        
    
        
    }//GEN-LAST:event_jCImpKeyPressed

    
    
    private void jCMandKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCMandKeyPressed
        
    
        
    }//GEN-LAST:event_jCMandKeyPressed

    
    
    
    private void jTCtaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTCtaKeyPressed
        
        
    }//GEN-LAST:event_jTCtaKeyPressed

    
    
    private void jCGuaPagKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCGuaPagKeyPressed
        
    
        
    }//GEN-LAST:event_jCGuaPagKeyPressed

    
    
    
    private void jTCtaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCtaFocusGained
        
    
        
    }//GEN-LAST:event_jTCtaFocusGained

    
    
    private void jComSerKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComSerKeyPressed
        
    
        
    }//GEN-LAST:event_jComSerKeyPressed
   

    
    private void formMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_formMouseWheelMoved
        
    
        
    }//GEN-LAST:event_formMouseWheelMoved

    
    
    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        
    
        
    }//GEN-LAST:event_formMouseDragged

    
    
    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        
    
        
    }//GEN-LAST:event_formMouseMoved
   
    
    
    
    private void jCFExtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCFExtKeyPressed
       
    
            
    }//GEN-LAST:event_jCFExtKeyPressed

    
    
    private void jDFExtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jDFExtKeyPressed
        
    
        
    }//GEN-LAST:event_jDFExtKeyPressed

    
    
    private void jCFExtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCFExtActionPerformed
        
    
        
    }//GEN-LAST:event_jCFExtActionPerformed
                
    
    
    private void jBTab1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTab1ActionPerformed

    

    }//GEN-LAST:event_jBTab1ActionPerformed

    
    
    private void jBTab1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBTab1KeyPressed

    

    }//GEN-LAST:event_jBTab1KeyPressed

    
    
    
    
    private void jCTimKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCTimKeyPressed
        
    
        
    }//GEN-LAST:event_jCTimKeyPressed

    
    
    private void jBTodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTodActionPerformed

    

    }//GEN-LAST:event_jBTodActionPerformed

    
    
    private void jBTodKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBTodKeyPressed

    

    }//GEN-LAST:event_jBTodKeyPressed

    
    
    private void jComSerFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComSerFocusLost
        
    
        
    }//GEN-LAST:event_jComSerFocusLost

    
    
        
        
    
    private void jCGDatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCGDatsActionPerformed

    
            
    }//GEN-LAST:event_jCGDatsActionPerformed
    
    
    
    private void jBCliMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBCliMouseEntered
        
    
                        
    }//GEN-LAST:event_jBCliMouseEntered

    
    
    private void jBFiltMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBFiltMouseEntered
        
    
        
    }//GEN-LAST:event_jBFiltMouseEntered
           
    
    
    private void jBNewMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBNewMouseEntered
        
    
        
    }//GEN-LAST:event_jBNewMouseEntered

    
    
    private void jBDelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBDelMouseEntered
        
    
        
    }//GEN-LAST:event_jBDelMouseEntered

    
    
    private void jBTodMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBTodMouseEntered
        
    
        
    }//GEN-LAST:event_jBTodMouseEntered

    
    
    private void jBGuarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBGuarMouseEntered
        
        
        
    }//GEN-LAST:event_jBGuarMouseEntered

    
    
    private void jBSalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSalMouseEntered
        
    
        
    }//GEN-LAST:event_jBSalMouseEntered

    
    
    private void jBFiltMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBFiltMouseExited
        
    
        
    }//GEN-LAST:event_jBFiltMouseExited

    
    
    private void jBCliMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBCliMouseExited
        
    
        
    }//GEN-LAST:event_jBCliMouseExited
        
    
    
    private void jBNewMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBNewMouseExited
        
    
        
    }//GEN-LAST:event_jBNewMouseExited

    
    
    private void jBDelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBDelMouseExited
        
    
        
    }//GEN-LAST:event_jBDelMouseExited

        
    
    
    private void jBTodMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBTodMouseExited
        
    
        
    }//GEN-LAST:event_jBTodMouseExited

    
    
    private void jBGuarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBGuarMouseExited
        
    
        
    }//GEN-LAST:event_jBGuarMouseExited

    
    
    private void jBSalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSalMouseExited
        
    
        
    }//GEN-LAST:event_jBSalMouseExited

    
    
    private void jTSerFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTSerFocusLost
        
    
        
    }//GEN-LAST:event_jTSerFocusLost

    
    
    private void jTNomCliFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTNomCliFocusLost
        
    
        
    }//GEN-LAST:event_jTNomCliFocusLost

        
    
    private void jTFolFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFolFocusLost
        
       
        
    }//GEN-LAST:event_jTFolFocusLost

    
    
    
    
    private void jTCtaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCtaFocusLost
        
    
        
    }//GEN-LAST:event_jTCtaFocusLost

    
    
    private void jTAObservFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTAObservFocusLost
        
    
        
    }//GEN-LAST:event_jTAObservFocusLost

    
    
    private void jBCatGralKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBCatGralKeyPressed

    
        
    }//GEN-LAST:event_jBCatGralKeyPressed

    
    
    private void jBCatGralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCatGralActionPerformed

    
        
    }//GEN-LAST:event_jBCatGralActionPerformed

    
    
    private void jTCatGralKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTCatGralKeyTyped

    

    }//GEN-LAST:event_jTCatGralKeyTyped

    
    private void jTCatGralKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTCatGralKeyPressed

    
        
    }//GEN-LAST:event_jTCatGralKeyPressed

    
    
    private void jTCatGralFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCatGralFocusLost

    
        
    }//GEN-LAST:event_jTCatGralFocusLost

        
    
    private void jTCatGralFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCatGralFocusGained

    
        
    }//GEN-LAST:event_jTCatGralFocusGained

    
    
    private void jBVePartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVePartActionPerformed

    
        
    }//GEN-LAST:event_jBVePartActionPerformed

    
    
    private void jTNoSerFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTNoSerFKeyPressed
        
    
        
    }//GEN-LAST:event_jTNoSerFKeyPressed

    
    
    private void jTCliFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTCliFKeyPressed
        
    
        
    }//GEN-LAST:event_jTCliFKeyPressed

    
    
    private void jTSerFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTSerFKeyPressed
        
    
        
    }//GEN-LAST:event_jTSerFKeyPressed

    
    
    private void jTMetPagFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTMetPagFKeyPressed
        
    
        
    }//GEN-LAST:event_jTMetPagFKeyPressed

    
    
    private void jTCtaFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTCtaFKeyPressed
        
    
        
    }//GEN-LAST:event_jTCtaFKeyPressed

    
    
    private void jTFechFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFechFKeyPressed
        
    
        
    }//GEN-LAST:event_jTFechFKeyPressed

    
    
    private void jTSubTotFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTSubTotFKeyPressed
        
    
        
    }//GEN-LAST:event_jTSubTotFKeyPressed

    
    
    private void jTImpueFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTImpueFKeyPressed
 
    
        
    }//GEN-LAST:event_jTImpueFKeyPressed

    
    
    private void jTTotFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTTotFKeyPressed
        
    
        
    }//GEN-LAST:event_jTTotFKeyPressed

    
    
    private void jTEstadFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTEstadFKeyPressed
        
    
        
    }//GEN-LAST:event_jTEstadFKeyPressed

    
    
    private void jTMotivFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTMotivFKeyPressed
        
    
        
    }//GEN-LAST:event_jTMotivFKeyPressed

    
    
    private void jTFVencFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFVencFKeyPressed
        
    
        
    }//GEN-LAST:event_jTFVencFKeyPressed

    
    
    private void jTObservFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTObservFKeyPressed
         
    
        
    }//GEN-LAST:event_jTObservFKeyPressed

    
    
    private void jTTimbFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTTimbFKeyPressed
        
    
        
    }//GEN-LAST:event_jTTimbFKeyPressed

    
    
    private void jTSucFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTSucFKeyPressed
        
    
        
    }//GEN-LAST:event_jTSucFKeyPressed

    
    
    private void jTCajFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTCajFKeyPressed
        
    
        
    }//GEN-LAST:event_jTCajFKeyPressed

    
    
    private void jTUsrFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTUsrFKeyPressed
        
    
        
    }//GEN-LAST:event_jTUsrFKeyPressed

    
    
    private void jTNoSerFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTNoSerFFocusLost
        
    
        
    }//GEN-LAST:event_jTNoSerFFocusLost

    
    
    private void jTCliFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCliFFocusLost
       
    
        
    }//GEN-LAST:event_jTCliFFocusLost

    
    
    private void jTSerFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTSerFFocusLost
        
        
        
    }//GEN-LAST:event_jTSerFFocusLost

    
    
    private void jTMetPagFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTMetPagFFocusLost
        
    
        
    }//GEN-LAST:event_jTMetPagFFocusLost

    
    
    private void jTCtaFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCtaFFocusLost
        
    
        
    }//GEN-LAST:event_jTCtaFFocusLost

    
    
    private void jTFechFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFechFFocusLost
       
    
        
    }//GEN-LAST:event_jTFechFFocusLost

    
    
    private void jTSubTotFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTSubTotFFocusLost
        
    
        
    }//GEN-LAST:event_jTSubTotFFocusLost

    
    
    private void jTImpueFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTImpueFFocusLost
        
    
        
    }//GEN-LAST:event_jTImpueFFocusLost

    
    
    private void jTTotFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTTotFFocusLost

    
        
    }//GEN-LAST:event_jTTotFFocusLost

    
    
    private void jTEstadFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTEstadFFocusLost
        
    
        
    }//GEN-LAST:event_jTEstadFFocusLost

    
    
    private void jTMotivFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTMotivFFocusLost
        
    
        
    }//GEN-LAST:event_jTMotivFFocusLost

    
    
    private void jTFVencFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFVencFFocusLost
        
    
        
    }//GEN-LAST:event_jTFVencFFocusLost

    
    
    private void jTObservFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTObservFFocusLost
        
    
        
    }//GEN-LAST:event_jTObservFFocusLost

    
    
    private void jTTimbFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTTimbFFocusLost
        
    
        
    }//GEN-LAST:event_jTTimbFFocusLost

    
    
    private void jTSucFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTSucFFocusLost
        
        
        
    }//GEN-LAST:event_jTSucFFocusLost

        
    private void jTCajFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCajFFocusLost
        
    
        
    }//GEN-LAST:event_jTCajFFocusLost

    
    
    private void jTUsrFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTUsrFFocusLost
        
    
        
    }//GEN-LAST:event_jTUsrFFocusLost

    
   
    private void jTNoSerFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTNoSerFFocusGained
        
   
        
    }//GEN-LAST:event_jTNoSerFFocusGained

    
   
    private void jTCliFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCliFFocusGained
        
   
        
    }//GEN-LAST:event_jTCliFFocusGained

    
   
    
    private void jTSerFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTSerFFocusGained
        
    
        
    }//GEN-LAST:event_jTSerFFocusGained

    
    
    private void jTMetPagFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTMetPagFFocusGained
        
    
        
    }//GEN-LAST:event_jTMetPagFFocusGained

    
    
    private void jTCtaFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCtaFFocusGained
        
    
        
    }//GEN-LAST:event_jTCtaFFocusGained

    
    
    private void jTFechFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFechFFocusGained
        
    
        
    }//GEN-LAST:event_jTFechFFocusGained

    
    
    private void jTSubTotFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTSubTotFFocusGained
        
    
        
    }//GEN-LAST:event_jTSubTotFFocusGained

    
    
    private void jTImpueFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTImpueFFocusGained
        
    
        
    }//GEN-LAST:event_jTImpueFFocusGained

    
    
    private void jTTotFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTTotFFocusGained

    
        
    }//GEN-LAST:event_jTTotFFocusGained

    
    
    private void jTEstadFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTEstadFFocusGained
        
    
        
    }//GEN-LAST:event_jTEstadFFocusGained

    
    
    private void jTMotivFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTMotivFFocusGained
        
    
        
    }//GEN-LAST:event_jTMotivFFocusGained

    
    
    private void jTFVencFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFVencFFocusGained
        
    
        
    }//GEN-LAST:event_jTFVencFFocusGained

    
    
    private void jTObservFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTObservFFocusGained
        
    
        
    }//GEN-LAST:event_jTObservFFocusGained

    
    
    private void jTTimbFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTTimbFFocusGained
        
    
        
    }//GEN-LAST:event_jTTimbFFocusGained

    
    
    private void jTSucFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTSucFFocusGained
        
    
        
    }//GEN-LAST:event_jTSucFFocusGained

    
    
    private void jTCajFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCajFFocusGained
        
    
        
    }//GEN-LAST:event_jTCajFFocusGained

    
    
    private void jTUsrFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTUsrFFocusGained
        
    
        
    }//GEN-LAST:event_jTUsrFFocusGained

    
    
    private void jBVePartMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBVePartMouseEntered
        
    
        
    }//GEN-LAST:event_jBVePartMouseEntered

    
    
    private void jBVePartKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBVePartKeyPressed
        
    
        
    }//GEN-LAST:event_jBVePartKeyPressed

    
    
    private void jBVePartMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBVePartMouseExited
        
    
        
    }//GEN-LAST:event_jBVePartMouseExited

    
    
    
    private void jTTotFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTTotFocusLost
        
    
        
    }//GEN-LAST:event_jTTotFocusLost

    
    
    private void jComSerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComSerActionPerformed
                    
    
        
    }//GEN-LAST:event_jComSerActionPerformed

    
    
    private void jTImpueFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTImpueFocusGained
        
    
        
    }//GEN-LAST:event_jTImpueFocusGained

    
    
    private void jTImpueFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTImpueFocusLost
        
    
        
    }//GEN-LAST:event_jTImpueFocusLost

    
    
    private void jTImpueKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTImpueKeyPressed
        
    
        
    }//GEN-LAST:event_jTImpueKeyPressed

    
    
    private void jTSubTotFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTSubTotFocusGained
        
    
        
    }//GEN-LAST:event_jTSubTotFocusGained

    
    
    private void jTSubTotFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTSubTotFocusLost

    
        
    }//GEN-LAST:event_jTSubTotFocusLost

    
    
    private void jTSubTotKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTSubTotKeyPressed

    
        
    }//GEN-LAST:event_jTSubTotKeyPressed

    
    
    private void jBConcepMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBConcepMouseEntered
        
    
        
    }//GEN-LAST:event_jBConcepMouseEntered

    
    
    private void jBConcepMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBConcepMouseExited
        
    
        
    }//GEN-LAST:event_jBConcepMouseExited

    
    
    private void jBConcepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConcepActionPerformed
        
    
                        
    }//GEN-LAST:event_jBConcepActionPerformed

    
    
    private void jBConcepKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBConcepKeyPressed
        
    
        
    }//GEN-LAST:event_jBConcepKeyPressed

    
    
    private void jTCondFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCondFocusGained
        
    
        
    }//GEN-LAST:event_jTCondFocusGained

    
    
    private void jTCondFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCondFocusLost
        
    
        
    }//GEN-LAST:event_jTCondFocusLost

    
    
    private void jTCondKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTCondKeyPressed
        
    
        
    }//GEN-LAST:event_jTCondKeyPressed

    

    private void jTAObservFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTAObservFocusGained
        

        
    }//GEN-LAST:event_jTAObservFocusGained

    

    private void jTAObservKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTAObservKeyPressed
        

        
    }//GEN-LAST:event_jTAObservKeyPressed

    

    private void jDFechKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jDFechKeyPressed



    }//GEN-LAST:event_jDFechKeyPressed

    

    private void jComMonFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComMonFocusLost



    }//GEN-LAST:event_jComMonFocusLost

    

    private void jComMonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComMonActionPerformed


        
    }//GEN-LAST:event_jComMonActionPerformed

    

    private void jComMonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComMonKeyPressed



    }//GEN-LAST:event_jComMonKeyPressed

    private void jComImpFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComImpFocusLost



    }//GEN-LAST:event_jComImpFocusLost

    

    private void jComImpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComImpActionPerformed


        
    }//GEN-LAST:event_jComImpActionPerformed

    

    private void jComImpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComImpKeyPressed



    }//GEN-LAST:event_jComImpKeyPressed

    private void jTCtaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTCtaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTCtaActionPerformed

    private void jTFiltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFiltActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFiltActionPerformed

    private void jTTipoRelacionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTTipoRelacionFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTTipoRelacionFocusGained

    private void jTTipoRelacionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTTipoRelacionFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTTipoRelacionFocusLost

    private void jTTipoRelacionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTTipoRelacionKeyPressed

    }//GEN-LAST:event_jTTipoRelacionKeyPressed

    private void jTTipoRelacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTTipoRelacionKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTTipoRelacionKeyTyped

    private void jTTipoRelacionDescFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTTipoRelacionDescFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTTipoRelacionDescFocusGained

    private void jTTipoRelacionDescFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTTipoRelacionDescFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTTipoRelacionDescFocusLost

    private void jTTipoRelacionDescKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTTipoRelacionDescKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTTipoRelacionDescKeyPressed

    private void jBTipoRelacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTipoRelacionActionPerformed
        
    }//GEN-LAST:event_jBTipoRelacionActionPerformed

    private void jTLimCredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTLimCredActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTLimCredActionPerformed

    private void jTSaldDispoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTSaldDispoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTSaldDispoActionPerformed

    private void jCCo2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCCo2ItemStateChanged
        
        
        
    }//GEN-LAST:event_jCCo2ItemStateChanged

    private void jCCo3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCCo3ItemStateChanged
        
        
        
    }//GEN-LAST:event_jCCo3ItemStateChanged

    private void jCCo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCCo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCCo2ActionPerformed

        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbMetodoPago;
    private javax.swing.JComboBox cmbUsoCfdi;
    private javax.swing.JButton jBCatGral;
    private javax.swing.JButton jBCli;
    private javax.swing.JButton jBConcep;
    private javax.swing.JButton jBDel;
    private javax.swing.JButton jBFilt;
    private javax.swing.JButton jBGuar;
    private javax.swing.JButton jBNew;
    private javax.swing.JButton jBSal;
    private javax.swing.JButton jBTab1;
    private javax.swing.JButton jBTipoRelacion;
    private javax.swing.JButton jBTod;
    private javax.swing.JButton jBVePart;
    private javax.swing.JCheckBox jCCo1;
    private javax.swing.JCheckBox jCCo2;
    private javax.swing.JCheckBox jCCo3;
    private javax.swing.JCheckBox jCFExt;
    private javax.swing.JCheckBox jCGDats;
    private javax.swing.JCheckBox jCGuaPag;
    private javax.swing.JCheckBox jCImp;
    private javax.swing.JCheckBox jCMand;
    private javax.swing.JCheckBox jCMostA;
    private javax.swing.JCheckBox jCTim;
    private javax.swing.JComboBox jComImp;
    private javax.swing.JComboBox jComMon;
    private javax.swing.JComboBox jComSer;
    private javax.swing.JLabel jLCatGral;
    private javax.swing.JLabel jLMetPag;
    private javax.swing.JLabel jLNot;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
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
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jP1;
    private javax.swing.JPanel jPClien;
    private javax.swing.JPanel jPParts;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTAObserv;
    private javax.swing.JTextField jTCP;
    private javax.swing.JTextField jTCajF;
    private javax.swing.JTextField jTCall;
    private javax.swing.JTextField jTCatGral;
    private javax.swing.JTextField jTCiu;
    private javax.swing.JTextField jTCli;
    private javax.swing.JTextField jTCliF;
    private javax.swing.JTextField jTCo1;
    private javax.swing.JTextField jTCo2;
    private javax.swing.JTextField jTCo3;
    private javax.swing.JTextField jTCodConcep;
    private javax.swing.JTextField jTCol;
    private javax.swing.JTextField jTConcep;
    private javax.swing.JTextField jTCond;
    private javax.swing.JTextField jTCta;
    private javax.swing.JTextField jTCtaF;
    private javax.swing.JTextField jTDiaCre;
    private javax.swing.JTextField jTEstad;
    private javax.swing.JTextField jTEstadF;
    private javax.swing.JTextField jTFVencF;
    private javax.swing.JTextField jTFechF;
    private javax.swing.JTextField jTFilt;
    private javax.swing.JTextField jTFol;
    private javax.swing.JTextField jTImpue;
    private javax.swing.JTextField jTImpueF;
    private javax.swing.JTextField jTLimCred;
    private javax.swing.JTextField jTMetPagF;
    private javax.swing.JTextField jTMotivF;
    private javax.swing.JTextField jTNoExt;
    private javax.swing.JTextField jTNoInt;
    private javax.swing.JTextField jTNoSerF;
    private javax.swing.JTextField jTNomCli;
    private javax.swing.JTextField jTObservF;
    private javax.swing.JTextField jTPai;
    private javax.swing.JTextField jTRFC;
    private javax.swing.JTextField jTSaldDispo;
    private javax.swing.JTextField jTSer;
    private javax.swing.JTextField jTSerF;
    private javax.swing.JTextField jTSubTot;
    private javax.swing.JTextField jTSubTotF;
    private javax.swing.JTextField jTSucF;
    private javax.swing.JTextField jTTel;
    private javax.swing.JTextField jTTimbF;
    private javax.swing.JTextField jTTipoRelacion;
    private javax.swing.JTextField jTTipoRelacionDesc;
    private javax.swing.JTextField jTTot;
    private javax.swing.JTextField jTTotCost;
    private javax.swing.JTextField jTTotCostF;
    private javax.swing.JTextField jTTotF;
    private javax.swing.JTextField jTUsrF;
    private javax.swing.JTable jTab;
    // End of variables declaration//GEN-END:variables

}/*Fin de public class NuevaEmpresa extends javax.swing.JFrame */
