package com.era.views;


public abstract class CotNormJFrame extends BaseJFrame
{
    public CotNormJFrame(final String idTextTitleWindow) 
    {                
        super(idTextTitleWindow);
        
        initComponents();
        
        //Post inicialization
        postInitComponents();
        
        jTextFieldCliente.grabFocus();
                
        this.getRootPane().setDefaultButton(jBGuar);
    }
    
          
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jP1 = new javax.swing.JPanel();
        jBSal = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePartidas = new javax.swing.JTable();
        jBNew = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jBGuar = new javax.swing.JButton();
        jPClien = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTNom = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jBCli = new javax.swing.JButton();
        jTextFieldCliente = new javax.swing.JTextField();
        jTSer = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxSeries = new javax.swing.JComboBox();
        jCCo1 = new javax.swing.JCheckBox();
        jTCo1 = new javax.swing.JTextField();
        jCCo2 = new javax.swing.JCheckBox();
        jTCo2 = new javax.swing.JTextField();
        jCCo3 = new javax.swing.JCheckBox();
        jTCo3 = new javax.swing.JTextField();
        jCGuaCo = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jComboBoxVendedores = new javax.swing.JComboBox<String>();
        jLabel21 = new javax.swing.JLabel();
        jTextFieldReferencia = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        jButtonGenerarPDF = new javax.swing.JButton();
        jBDel = new javax.swing.JButton();
        jTextFieldImpuesto = new javax.swing.JTextField();
        jTSubTot = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTTot = new javax.swing.JTextField();
        jBTod = new javax.swing.JButton();
        jPOtr = new javax.swing.JPanel();
        jCMostA = new javax.swing.JCheckBox();
        jCImp = new javax.swing.JCheckBox();
        jCMand = new javax.swing.JCheckBox();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTAObserv = new javax.swing.JTextArea();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTADescrip = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        jComboboxMonedas = new javax.swing.JComboBox();
        jPParts = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jTextFilelProducto = new javax.swing.JTextField();
        jBProd = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTPre = new javax.swing.JTextField();
        jTextFieldDescripcion = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldListaPrecio = new javax.swing.JTextField();
        jButtonListaPrecio = new javax.swing.JButton();
        jTCant = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComUnid = new javax.swing.JComboBox();
        jTUnid = new javax.swing.JTextField();
        jBTipCam = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldExistenciaAlmacen = new javax.swing.JTextField();
        jSImg = new javax.swing.JScrollPane();
        jPanImg = new javax.swing.JPanel();
        jLImg = new javax.swing.JLabel();
        jBVeGran = new javax.swing.JButton();
        jBGranDescrip = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jTDesc = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jTSerProd = new javax.swing.JTextField();
        jBComenSer = new javax.swing.JButton();
        jLabel50 = new javax.swing.JLabel();
        jTKit = new javax.swing.JTextField();
        jComTall = new javax.swing.JComboBox();
        jTDescripTall = new javax.swing.JTextField();
        jTDescripColo = new javax.swing.JTextField();
        jComColo = new javax.swing.JComboBox();
        jCheckBoxBackOrder = new javax.swing.JCheckBox();
        jComboBoxAlmacen = new javax.swing.JComboBox();
        jTDescripAlma = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jBExisAlma = new javax.swing.JButton();
        jLabel46 = new javax.swing.JLabel();
        jTExistAlmacen = new javax.swing.JTextField();
        jButtonImpuestos = new javax.swing.JButton();
        jTextFieldCodigoOpcional = new javax.swing.JTextField();
        jLblCodigoOpcional = new javax.swing.JLabel();
        jTAlma2 = new javax.swing.JTextField();
        jTextFieldTotalDescuento = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTComenSer = new javax.swing.JTextField();
        jTGara = new javax.swing.JTextField();
        jTId = new javax.swing.JTextField();
        jTLot = new javax.swing.JTextField();
        jTPedimen = new javax.swing.JTextField();
        jTCadu = new javax.swing.JTextField();
        jTCantLot = new javax.swing.JTextField();
        jLNot = new javax.swing.JLabel();

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
        jBSal.setNextFocusableComponent(jTextFieldCliente);
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
        jP1.add(jBSal, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 520, 120, 30));

        jTablePartidas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Qty", "Producto", "Unidad", "Lista", "Descripción", "Precio", "Desc.%", "Almacén", "Importe", "%Impuesto", "Total Impuesto", "Importe Descuento", "Serie Producto", "Comentario Serie", "Garantía", "Es Kit", "Talla", "Color", "Back Order", "Lote", "Pedimento", "Caducidad", "Cod.Impuesto", "Codigo Opcional"
            }
        ));
        jTablePartidas.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTablePartidas.setGridColor(new java.awt.Color(255, 255, 255));
        jTablePartidas.setNextFocusableComponent(jBGuar);
        jTablePartidas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTablePartidas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTablePartidasKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTablePartidas);

        jP1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 1110, 160));

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
        jP1.add(jBNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 110, 20));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Impuesto:");
        jP1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 540, 160, -1));

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
        jP1.add(jBGuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 120, 30));

        jPClien.setBackground(new java.awt.Color(255, 255, 255));
        jPClien.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos del Cliente", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPClien.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPClienKeyPressed(evt);
            }
        });
        jPClien.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setText("Nombre cliente:");
        jPClien.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 120, -1));

        jLabel17.setText("*Código cliente:");
        jPClien.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 110, -1));

        jTNom.setEditable(false);
        jTNom.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTNom.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTNomFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTNomFocusLost(evt);
            }
        });
        jTNom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTNomKeyPressed(evt);
            }
        });
        jPClien.add(jTNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 180, 20));

        jLabel9.setText("Fecha cotización:");
        jPClien.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 135, -1));

        jBCli.setBackground(new java.awt.Color(255, 255, 255));
        jBCli.setText("...");
        jBCli.setToolTipText("Buscar Cliente(s)");
        jBCli.setNextFocusableComponent(jCCo1);
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
        jPClien.add(jBCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 30, 20));

        jTextFieldCliente.setBackground(new java.awt.Color(204, 255, 204));
        jTextFieldCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTextFieldCliente.setNextFocusableComponent(jBCli);
        jTextFieldCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldClienteFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldClienteFocusLost(evt);
            }
        });
        jTextFieldCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldClienteKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldClienteKeyTyped(evt);
            }
        });
        jPClien.add(jTextFieldCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 90, 20));

        jTSer.setEditable(false);
        jTSer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTSer.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTSerFocusLost(evt);
            }
        });
        jPClien.add(jTSer, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 60, 20));

        jLabel2.setText("Vendedor:");
        jPClien.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 130, -1));

        jComboBoxSeries.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jComboBoxSeriesFocusLost(evt);
            }
        });
        jComboBoxSeries.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSeriesActionPerformed(evt);
            }
        });
        jComboBoxSeries.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComboBoxSeriesKeyPressed(evt);
            }
        });
        jPClien.add(jComboBoxSeries, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, 140, 20));

        jCCo1.setBackground(new java.awt.Color(255, 255, 255));
        jCCo1.setSelected(true);
        jCCo1.setText("Correo 1");
        jCCo1.setNextFocusableComponent(jTCo1);
        jCCo1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jCCo1KeyPressed(evt);
            }
        });
        jPClien.add(jCCo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, 20));

        jTCo1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTCo1.setNextFocusableComponent(jCCo2);
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
        jPClien.add(jTCo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 180, 20));

        jCCo2.setBackground(new java.awt.Color(255, 255, 255));
        jCCo2.setText("Correo 2");
        jCCo2.setNextFocusableComponent(jTCo2);
        jCCo2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCCo2ItemStateChanged(evt);
            }
        });
        jCCo2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jCCo2KeyPressed(evt);
            }
        });
        jPClien.add(jCCo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, 20));

        jTCo2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTCo2.setNextFocusableComponent(jCCo3);
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
        jPClien.add(jTCo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 180, 20));

        jCCo3.setBackground(new java.awt.Color(255, 255, 255));
        jCCo3.setText("Correo 3");
        jCCo3.setNextFocusableComponent(jTCo3);
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
        jPClien.add(jCCo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, 20));

        jTCo3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTCo3.setNextFocusableComponent(jCGuaCo);
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
        jPClien.add(jTCo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 180, 20));

        jCGuaCo.setBackground(new java.awt.Color(255, 255, 255));
        jCGuaCo.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCGuaCo.setText("Guardar Correos F8");
        jCGuaCo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCGuaCoActionPerformed(evt);
            }
        });
        jCGuaCo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jCGuaCoKeyPressed(evt);
            }
        });
        jPClien.add(jCGuaCo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 180, -1));

        jLabel7.setText("*Serie cotización:");
        jPClien.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 130, -1));

        jLabel15.setText("Fecha vencimiento:");
        jPClien.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 130, -1));

        jComboBoxVendedores.setNextFocusableComponent(jTAObserv);
        jComboBoxVendedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxVendedoresActionPerformed(evt);
            }
        });
        jComboBoxVendedores.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComboBoxVendedoresKeyPressed(evt);
            }
        });
        jPClien.add(jComboBoxVendedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, 140, -1));

        jLabel21.setText("Fecha entrega:");
        jPClien.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 130, -1));

        jTextFieldReferencia.setEditable(false);
        jPClien.add(jTextFieldReferencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, 140, -1));

        jLabel47.setText("Referencia:");
        jPClien.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 70, -1));

        jButtonGenerarPDF.setBackground(new java.awt.Color(255, 255, 255));
        jButtonGenerarPDF.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButtonGenerarPDF.setForeground(new java.awt.Color(0, 102, 0));
        jButtonGenerarPDF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/genpdf.png"))); // NOI18N
        jButtonGenerarPDF.setToolTipText("Generar PDF de cotización");
        jButtonGenerarPDF.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonGenerarPDF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonGenerarPDFMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonGenerarPDFMouseExited(evt);
            }
        });
        jButtonGenerarPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGenerarPDFActionPerformed(evt);
            }
        });
        jButtonGenerarPDF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonGenerarPDFKeyPressed(evt);
            }
        });
        jPClien.add(jButtonGenerarPDF, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 110, 60, 30));

        jP1.add(jPClien, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 720, 150));

        jBDel.setBackground(new java.awt.Color(255, 255, 255));
        jBDel.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBDel.setForeground(new java.awt.Color(0, 102, 0));
        jBDel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/del.png"))); // NOI18N
        jBDel.setText("Borrar");
        jBDel.setToolTipText("Borrar Partida(s) (Ctrl+SUPR)");
        jBDel.setName(""); // NOI18N
        jBDel.setNextFocusableComponent(jTablePartidas);
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
        jP1.add(jBDel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 100, 20));

        jTextFieldImpuesto.setEditable(false);
        jTextFieldImpuesto.setBackground(new java.awt.Color(204, 255, 204));
        jTextFieldImpuesto.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextFieldImpuesto.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldImpuesto.setText("$0.00");
        jTextFieldImpuesto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTextFieldImpuesto.setNextFocusableComponent(jBGuar);
        jTextFieldImpuesto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldImpuestoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldImpuestoFocusLost(evt);
            }
        });
        jTextFieldImpuesto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldImpuestoKeyPressed(evt);
            }
        });
        jP1.add(jTextFieldImpuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 540, 200, 20));

        jTSubTot.setEditable(false);
        jTSubTot.setBackground(new java.awt.Color(204, 255, 204));
        jTSubTot.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTSubTot.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTSubTot.setText("$0.00");
        jTSubTot.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
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
        jP1.add(jTSubTot, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 520, 200, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Descuento:");
        jP1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 560, 190, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Sub Total:");
        jP1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 520, 120, -1));

        jTTot.setEditable(false);
        jTTot.setBackground(new java.awt.Color(204, 255, 204));
        jTTot.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTTot.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTTot.setText("$0.00");
        jTTot.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
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
        jP1.add(jTTot, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 580, 200, 20));

        jBTod.setBackground(new java.awt.Color(255, 255, 255));
        jBTod.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jBTod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/marct.png"))); // NOI18N
        jBTod.setText("Marcar Todo");
        jBTod.setToolTipText("Marcar Todos los Registros de la Tabla (Alt+T)");
        jBTod.setNextFocusableComponent(jTablePartidas);
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
        jP1.add(jBTod, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 342, 130, 18));

        jPOtr.setBackground(new java.awt.Color(255, 255, 255));
        jPOtr.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Encabezado", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPOtr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPOtrKeyPressed(evt);
            }
        });
        jPOtr.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCMostA.setBackground(new java.awt.Color(255, 255, 255));
        jCMostA.setText("Mostrar archivos ");
        jCMostA.setNextFocusableComponent(jCImp);
        jCMostA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCMostAActionPerformed(evt);
            }
        });
        jCMostA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jCMostAKeyPressed(evt);
            }
        });
        jPOtr.add(jCMostA, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 130, 20));

        jCImp.setBackground(new java.awt.Color(255, 255, 255));
        jCImp.setText("Imprimir ");
        jCImp.setNextFocusableComponent(jCMand);
        jCImp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jCImpKeyPressed(evt);
            }
        });
        jPOtr.add(jCImp, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 130, -1));

        jCMand.setBackground(new java.awt.Color(255, 255, 255));
        jCMand.setSelected(true);
        jCMand.setText("Mandar correo");
        jCMand.setNextFocusableComponent(jComboboxMonedas);
        jCMand.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jCMandKeyPressed(evt);
            }
        });
        jPOtr.add(jCMand, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 130, -1));

        jLabel29.setForeground(new java.awt.Color(51, 0, 255));
        jLabel29.setText("F4");
        jPOtr.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 30, -1));

        jLabel30.setForeground(new java.awt.Color(51, 0, 255));
        jLabel30.setText("F5");
        jPOtr.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 30, 20));

        jLabel28.setForeground(new java.awt.Color(51, 0, 255));
        jLabel28.setText("F6");
        jPOtr.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 30, 20));

        jLabel20.setText("Observaciones de la cotización:");
        jPOtr.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 200, -1));

        jScrollPane4.setNextFocusableComponent(jComboBoxSeries);

        jTAObserv.setColumns(20);
        jTAObserv.setLineWrap(true);
        jTAObserv.setRows(5);
        jTAObserv.setNextFocusableComponent(jTADescrip);
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
        jScrollPane4.setViewportView(jTAObserv);

        jPOtr.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 200, 40));

        jLabel19.setText("Descripción cotización:");
        jPOtr.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 200, -1));

        jTADescrip.setColumns(20);
        jTADescrip.setLineWrap(true);
        jTADescrip.setRows(5);
        jTADescrip.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTADescrip.setNextFocusableComponent(jCMostA);
        jTADescrip.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTADescripFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTADescripFocusLost(evt);
            }
        });
        jTADescrip.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTADescripKeyPressed(evt);
            }
        });
        jScrollPane3.setViewportView(jTADescrip);

        jPOtr.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 200, 40));

        jLabel11.setText("Cod. moneda:");
        jPOtr.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 100, -1));

        jComboboxMonedas.setName(""); // NOI18N
        jComboboxMonedas.setNextFocusableComponent(jTextFilelProducto);
        jComboboxMonedas.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jComboboxMonedasFocusLost(evt);
            }
        });
        jComboboxMonedas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboboxMonedasActionPerformed(evt);
            }
        });
        jComboboxMonedas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComboboxMonedasKeyPressed(evt);
            }
        });
        jPOtr.add(jComboboxMonedas, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 140, 20));

        jP1.add(jPOtr, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, 370, 150));

        jPParts.setBackground(new java.awt.Color(255, 255, 255));
        jPParts.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos del Producto", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPParts.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPPartsKeyPressed(evt);
            }
        });
        jPParts.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setText("Producto:");
        jPParts.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, -1));

        jTextFilelProducto.setBackground(new java.awt.Color(255, 255, 153));
        jTextFilelProducto.setToolTipText("Ctrl+B búsqueda avanzada");
        jTextFilelProducto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTextFilelProducto.setNextFocusableComponent(jBProd);
        jTextFilelProducto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFilelProductoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFilelProductoFocusLost(evt);
            }
        });
        jTextFilelProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFilelProductoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFilelProductoKeyTyped(evt);
            }
        });
        jPParts.add(jTextFilelProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 170, 20));

        jBProd.setBackground(new java.awt.Color(255, 255, 255));
        jBProd.setText("...");
        jBProd.setToolTipText("Buscar Producto(s)");
        jBProd.setName(""); // NOI18N
        jBProd.setNextFocusableComponent(jTCant);
        jBProd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBProdMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBProdMouseExited(evt);
            }
        });
        jBProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBProdActionPerformed(evt);
            }
        });
        jBProd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBProdKeyPressed(evt);
            }
        });
        jPParts.add(jBProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 30, 20));

        jLabel13.setText("Descripción:");
        jPParts.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 80, -1));

        jLabel18.setText("Almacén:");
        jPParts.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 100, -1));

        jTPre.setText("$0.00");
        jTPre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTPre.setNextFocusableComponent(jTextFieldListaPrecio);
        jTPre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTPreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTPreFocusLost(evt);
            }
        });
        jTPre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTPreActionPerformed(evt);
            }
        });
        jTPre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTPreKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTPreKeyTyped(evt);
            }
        });
        jPParts.add(jTPre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 70, 20));

        jTextFieldDescripcion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTextFieldDescripcion.setNextFocusableComponent(jTPre);
        jTextFieldDescripcion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldDescripcionFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldDescripcionFocusLost(evt);
            }
        });
        jTextFieldDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldDescripcionKeyPressed(evt);
            }
        });
        jPParts.add(jTextFieldDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 630, 20));

        jLabel8.setText("L.Precio:");
        jPParts.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 70, -1));

        jTextFieldListaPrecio.setText("1");
        jTextFieldListaPrecio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTextFieldListaPrecio.setNextFocusableComponent(jButtonListaPrecio);
        jTextFieldListaPrecio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldListaPrecioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldListaPrecioFocusLost(evt);
            }
        });
        jTextFieldListaPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldListaPrecioKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldListaPrecioKeyTyped(evt);
            }
        });
        jPParts.add(jTextFieldListaPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 60, 20));

        jButtonListaPrecio.setBackground(new java.awt.Color(255, 255, 255));
        jButtonListaPrecio.setText("jButton1");
        jButtonListaPrecio.setToolTipText("Buscar Listas de Precio");
        jButtonListaPrecio.setNextFocusableComponent(jTDesc);
        jButtonListaPrecio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonListaPrecioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonListaPrecioMouseExited(evt);
            }
        });
        jButtonListaPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListaPrecioActionPerformed(evt);
            }
        });
        jButtonListaPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonListaPrecioKeyPressed(evt);
            }
        });
        jPParts.add(jButtonListaPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 30, 20));

        jTCant.setText("1.0");
        jTCant.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTCant.setNextFocusableComponent(jComUnid);
        jTCant.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTCantFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTCantFocusLost(evt);
            }
        });
        jTCant.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTCantKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTCantKeyTyped(evt);
            }
        });
        jPParts.add(jTCant, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 60, 20));

        jLabel22.setText("Cantidad:");
        jPParts.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 60, -1));

        jLabel6.setText("%Desc:");
        jPParts.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 50, -1));

        jComUnid.setNextFocusableComponent(jTUnid);
        jComUnid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComUnidActionPerformed(evt);
            }
        });
        jComUnid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComUnidKeyPressed(evt);
            }
        });
        jPParts.add(jComUnid, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, 70, 20));

        jTUnid.setEditable(false);
        jTUnid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTUnid.setNextFocusableComponent(jTextFieldExistenciaAlmacen);
        jTUnid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTUnidFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTUnidFocusLost(evt);
            }
        });
        jTUnid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTUnidKeyPressed(evt);
            }
        });
        jPParts.add(jTUnid, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 80, 20));

        jBTipCam.setBackground(new java.awt.Color(255, 255, 255));
        jBTipCam.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBTipCam.setForeground(new java.awt.Color(0, 102, 0));
        jBTipCam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/dol.png"))); // NOI18N
        jBTipCam.setToolTipText("Definir el Tipo de Cambio del Día (F7)");
        jBTipCam.setNextFocusableComponent(jComColo);
        jBTipCam.setOpaque(false);
        jBTipCam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBTipCamMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBTipCamMouseExited(evt);
            }
        });
        jBTipCam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTipCamActionPerformed(evt);
            }
        });
        jBTipCam.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBTipCamKeyPressed(evt);
            }
        });
        jPParts.add(jBTipCam, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, 40, 40));

        jLabel3.setText("Existencia Alm:");
        jPParts.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 30, 90, -1));

        jTextFieldExistenciaAlmacen.setEditable(false);
        jTextFieldExistenciaAlmacen.setForeground(new java.awt.Color(51, 51, 255));
        jTextFieldExistenciaAlmacen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTextFieldExistenciaAlmacen.setNextFocusableComponent(jTextFieldDescripcion);
        jTextFieldExistenciaAlmacen.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldExistenciaAlmacenFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldExistenciaAlmacenFocusLost(evt);
            }
        });
        jTextFieldExistenciaAlmacen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldExistenciaAlmacenKeyPressed(evt);
            }
        });
        jPParts.add(jTextFieldExistenciaAlmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 30, 90, 20));

        jSImg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jSImgKeyPressed(evt);
            }
        });

        jPanImg.setBackground(new java.awt.Color(255, 255, 204));
        jPanImg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanImgMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanImgMouseExited(evt);
            }
        });
        jPanImg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPanImgKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanImgLayout = new javax.swing.GroupLayout(jPanImg);
        jPanImg.setLayout(jPanImgLayout);
        jPanImgLayout.setHorizontalGroup(
            jPanImgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanImgLayout.createSequentialGroup()
                .addComponent(jLImg)
                .addGap(0, 258, Short.MAX_VALUE))
        );
        jPanImgLayout.setVerticalGroup(
            jPanImgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanImgLayout.createSequentialGroup()
                .addComponent(jLImg)
                .addContainerGap(121, Short.MAX_VALUE))
        );

        jSImg.setViewportView(jPanImg);

        jPParts.add(jSImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 20, 260, -1));

        jBVeGran.setBackground(new java.awt.Color(255, 255, 255));
        jBVeGran.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/img.png"))); // NOI18N
        jBVeGran.setToolTipText("Ver Imágen  de Producto Completa");
        jBVeGran.setNextFocusableComponent(jBNew);
        jBVeGran.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBVeGranMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBVeGranMouseExited(evt);
            }
        });
        jBVeGran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVeGranActionPerformed(evt);
            }
        });
        jBVeGran.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBVeGranKeyPressed(evt);
            }
        });
        jPParts.add(jBVeGran, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 144, 30, 20));

        jBGranDescrip.setBackground(new java.awt.Color(0, 153, 153));
        jBGranDescrip.setToolTipText("Ver/Modificar Descripción en Grande");
        jBGranDescrip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGranDescripActionPerformed(evt);
            }
        });
        jBGranDescrip.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBGranDescripKeyPressed(evt);
            }
        });
        jPParts.add(jBGranDescrip, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 50, 10, 20));

        jLabel10.setText("Unidad:");
        jPParts.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 50, -1));

        jTDesc.setText("0");
        jTDesc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTDesc.setNextFocusableComponent(jComboBoxAlmacen);
        jTDesc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTDescFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTDescFocusLost(evt);
            }
        });
        jTDesc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTDescKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTDescKeyTyped(evt);
            }
        });
        jPParts.add(jTDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 70, 20));

        jLabel23.setText("Serie:");
        jPParts.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, 100, 20));

        jTSerProd.setToolTipText("Flecha abajo para ver las series existentes");
        jTSerProd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTSerProd.setNextFocusableComponent(jButtonImpuestos);
        jTSerProd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTSerProdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTSerProdFocusLost(evt);
            }
        });
        jTSerProd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTSerProdKeyPressed(evt);
            }
        });
        jPParts.add(jTSerProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 260, 20));

        jBComenSer.setBackground(new java.awt.Color(0, 153, 153));
        jBComenSer.setToolTipText("Comentario de la Serie");
        jBComenSer.setNextFocusableComponent(jBVeGran);
        jBComenSer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBComenSerActionPerformed(evt);
            }
        });
        jBComenSer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBComenSerKeyPressed(evt);
            }
        });
        jPParts.add(jBComenSer, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 90, 10, 20));

        jLabel50.setText("Es Kit:");
        jPParts.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 50, 20));

        jTKit.setEditable(false);
        jTKit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTKit.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTKitFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTKitFocusLost(evt);
            }
        });
        jPParts.add(jTKit, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 70, 20));

        jComTall.setNextFocusableComponent(jTDescripTall);
        jComTall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComTallActionPerformed(evt);
            }
        });
        jComTall.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComTallKeyPressed(evt);
            }
        });
        jPParts.add(jComTall, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 120, 20, 20));

        jTDescripTall.setEditable(false);
        jTDescripTall.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTDescripTall.setNextFocusableComponent(jBTipCam);
        jTDescripTall.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTDescripTallFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTDescripTallFocusLost(evt);
            }
        });
        jTDescripTall.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTDescripTallKeyPressed(evt);
            }
        });
        jPParts.add(jTDescripTall, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 120, 10, 20));

        jTDescripColo.setEditable(false);
        jTDescripColo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTDescripColo.setNextFocusableComponent(jBVeGran);
        jTDescripColo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTDescripColoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTDescripColoFocusLost(evt);
            }
        });
        jTDescripColo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTDescripColoKeyPressed(evt);
            }
        });
        jPParts.add(jTDescripColo, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 140, 10, 20));

        jComColo.setNextFocusableComponent(jTDescripColo);
        jComColo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComColoActionPerformed(evt);
            }
        });
        jComColo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComColoKeyPressed(evt);
            }
        });
        jPParts.add(jComColo, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 140, 20, 20));

        jCheckBoxBackOrder.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBoxBackOrder.setText("Backorder");
        jCheckBoxBackOrder.setNextFocusableComponent(jComTall);
        jCheckBoxBackOrder.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jCheckBoxBackOrderKeyPressed(evt);
            }
        });
        jPParts.add(jCheckBoxBackOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, 120, -1));

        jComboBoxAlmacen.setNextFocusableComponent(jTDescripAlma);
        jComboBoxAlmacen.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jComboBoxAlmacenFocusLost(evt);
            }
        });
        jComboBoxAlmacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxAlmacenActionPerformed(evt);
            }
        });
        jComboBoxAlmacen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComboBoxAlmacenKeyPressed(evt);
            }
        });
        jPParts.add(jComboBoxAlmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 70, 20));

        jTDescripAlma.setEditable(false);
        jTDescripAlma.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTDescripAlma.setNextFocusableComponent(jTKit);
        jTDescripAlma.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTDescripAlmaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTDescripAlmaFocusLost(evt);
            }
        });
        jTDescripAlma.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTDescripAlmaKeyPressed(evt);
            }
        });
        jPParts.add(jTDescripAlma, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 160, 20));

        jLabel27.setText("Precio:");
        jPParts.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 50, -1));

        jBExisAlma.setBackground(new java.awt.Color(0, 153, 153));
        jBExisAlma.setToolTipText("Existencias por almacén del producto");
        jBExisAlma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExisAlmaActionPerformed(evt);
            }
        });
        jBExisAlma.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBExisAlmaKeyPressed(evt);
            }
        });
        jPParts.add(jBExisAlma, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 10, 20));

        jLabel46.setText("Existencia:");
        jPParts.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 70, -1));

        jTExistAlmacen.setEditable(false);
        jTExistAlmacen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTExistAlmacen.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTExistAlmacenFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTExistAlmacenFocusLost(evt);
            }
        });
        jTExistAlmacen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTExistAlmacenKeyPressed(evt);
            }
        });
        jPParts.add(jTExistAlmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 50, 20));

        jButtonImpuestos.setBackground(new java.awt.Color(255, 255, 255));
        jButtonImpuestos.setText("+");
        jButtonImpuestos.setNextFocusableComponent(jTExistAlmacen);
        jButtonImpuestos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonImpuestosActionPerformed(evt);
            }
        });
        jButtonImpuestos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonImpuestosKeyPressed(evt);
            }
        });
        jPParts.add(jButtonImpuestos, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 70, 20));

        jTextFieldCodigoOpcional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodigoOpcionalActionPerformed(evt);
            }
        });
        jTextFieldCodigoOpcional.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldCodigoOpcionalKeyPressed(evt);
            }
        });
        jPParts.add(jTextFieldCodigoOpcional, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 210, 30));

        jLblCodigoOpcional.setText("Observacion Partida:");
        jPParts.add(jLblCodigoOpcional, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 130, -1));

        jP1.add(jPParts, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 1110, 176));

        jTAlma2.setEditable(false);
        jTAlma2.setFocusable(false);
        jP1.add(jTAlma2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 570, 10, -1));

        jTextFieldTotalDescuento.setBackground(new java.awt.Color(204, 255, 204));
        jTextFieldTotalDescuento.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextFieldTotalDescuento.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldTotalDescuento.setText("$0.00");
        jTextFieldTotalDescuento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTextFieldTotalDescuento.setNextFocusableComponent(jBGuar);
        jTextFieldTotalDescuento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldTotalDescuentoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldTotalDescuentoFocusLost(evt);
            }
        });
        jTextFieldTotalDescuento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldTotalDescuentoKeyPressed(evt);
            }
        });
        jP1.add(jTextFieldTotalDescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 560, 200, 20));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Total:");
        jP1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 580, 190, 20));

        jTComenSer.setEditable(false);
        jTComenSer.setFocusable(false);
        jTComenSer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTComenSerActionPerformed(evt);
            }
        });
        jP1.add(jTComenSer, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 0, 20, 10));

        jTGara.setEditable(false);
        jTGara.setFocusable(false);
        jP1.add(jTGara, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 570, 10, -1));

        jTId.setEditable(false);
        jTId.setFocusable(false);
        jP1.add(jTId, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 570, 10, -1));

        jTLot.setEditable(false);
        jTLot.setFocusable(false);
        jP1.add(jTLot, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 570, 10, -1));

        jTPedimen.setEditable(false);
        jTPedimen.setFocusable(false);
        jP1.add(jTPedimen, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 570, 10, -1));

        jTCadu.setEditable(false);
        jTCadu.setFocusable(false);
        jP1.add(jTCadu, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 570, 10, -1));

        jTCantLot.setEditable(false);
        jTCantLot.setText("0");
        jTCantLot.setFocusable(false);
        jP1.add(jTCantLot, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 570, 10, -1));

        jLNot.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLNot.setForeground(new java.awt.Color(204, 0, 0));
        jLNot.setFocusable(false);
        jP1.add(jLNot, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 520, 440, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jP1, javax.swing.GroupLayout.PREFERRED_SIZE, 1141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jP1, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
           
    
    
    private void jBSalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalActionPerformed

    
        
    }//GEN-LAST:event_jBSalActionPerformed

    
    
    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed

    
        
    }//GEN-LAST:event_formKeyPressed

    
    
    private void jBSalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBSalKeyPressed
        
    
        
    }//GEN-LAST:event_jBSalKeyPressed

    
    
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        
    
        
    }//GEN-LAST:event_formWindowClosing

    
    
    private void jTCantKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTCantKeyPressed
        
    
        
    }//GEN-LAST:event_jTCantKeyPressed

    
    
    private void jTablePartidasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTablePartidasKeyPressed
        
    
        
    }//GEN-LAST:event_jTablePartidasKeyPressed

    
    
    private void jBNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNewActionPerformed

    
        
    }//GEN-LAST:event_jBNewActionPerformed
            
    
    
    private void jBNewKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBNewKeyPressed
        
    
        
    }//GEN-LAST:event_jBNewKeyPressed

    
    
    private void jTADescripKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTADescripKeyPressed
        
    
        
    }//GEN-LAST:event_jTADescripKeyPressed

    
    
    private void jTCantFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCantFocusGained
        
    
        
    }//GEN-LAST:event_jTCantFocusGained

    
    
    private void jP1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jP1KeyPressed
        
    
        
    }//GEN-LAST:event_jP1KeyPressed

    
 
    private void jTAObservKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTAObservKeyPressed
                
 
        
    }//GEN-LAST:event_jTAObservKeyPressed

            
    
    private void jBGuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuarActionPerformed
        
    
            
    }//GEN-LAST:event_jBGuarActionPerformed
                
            
    
    private void jBGuarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBGuarKeyPressed
        
    
        
    }//GEN-LAST:event_jBGuarKeyPressed

    
    
    private void jTAObservFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTAObservFocusGained
        
    
        
    }//GEN-LAST:event_jTAObservFocusGained

    
    private void jTADescripFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTADescripFocusGained
        
    
        
    }//GEN-LAST:event_jTADescripFocusGained

    
    
    private void jPClienKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPClienKeyPressed
        
    
        
    }//GEN-LAST:event_jPClienKeyPressed

    
    
    private void jBDelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBDelKeyPressed
        
    
        
    }//GEN-LAST:event_jBDelKeyPressed

    
    
    private void jTextFieldImpuestoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldImpuestoKeyPressed
        
    
        
    }//GEN-LAST:event_jTextFieldImpuestoKeyPressed

    
    
    private void jTSubTotKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTSubTotKeyPressed
        
    
        
    }//GEN-LAST:event_jTSubTotKeyPressed

    
    
    private void jTSubTotFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTSubTotFocusGained
           
    
        
    }//GEN-LAST:event_jTSubTotFocusGained

    
    
    private void jTextFieldImpuestoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldImpuestoFocusGained
        
    
        
    }//GEN-LAST:event_jTextFieldImpuestoFocusGained

    
    
    private void jTTotFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTTotFocusGained
        
    
        
    }//GEN-LAST:event_jTTotFocusGained

    
    
    private void jTTotKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTTotKeyPressed
        
    
        
    }//GEN-LAST:event_jTTotKeyPressed

    
    
    private void jTextFieldDescripcionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDescripcionKeyPressed
        
    
        
    }//GEN-LAST:event_jTextFieldDescripcionKeyPressed

    
    
    private void jTextFieldDescripcionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldDescripcionFocusGained
        
    
        
    }//GEN-LAST:event_jTextFieldDescripcionFocusGained

    
    
    private void jTUnidFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTUnidFocusGained
        
    
        
    }//GEN-LAST:event_jTUnidFocusGained

    

    private void jTUnidKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTUnidKeyPressed
        

        
    }//GEN-LAST:event_jTUnidKeyPressed

    

    private void jComUnidKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComUnidKeyPressed
        

        
    }//GEN-LAST:event_jComUnidKeyPressed

    

    private void jTPreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTPreFocusGained
        
        
    }//GEN-LAST:event_jTPreFocusGained

    

    private void jTPreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTPreKeyPressed
        

        
    }//GEN-LAST:event_jTPreKeyPressed

    
    
    private void jComUnidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComUnidActionPerformed
                
    
        
    }//GEN-LAST:event_jComUnidActionPerformed

    
    
    private void jTCantKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTCantKeyTyped
        
    
        
    }//GEN-LAST:event_jTCantKeyTyped

    
    
    private void jTextFieldExistenciaAlmacenFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldExistenciaAlmacenFocusGained
           
        
    }//GEN-LAST:event_jTextFieldExistenciaAlmacenFocusGained

    
    
    private void jTextFieldExistenciaAlmacenKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldExistenciaAlmacenKeyPressed
        
    
        
    }//GEN-LAST:event_jTextFieldExistenciaAlmacenKeyPressed

            
    
    private void jTNomFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTNomFocusGained
        
    
    }//GEN-LAST:event_jTNomFocusGained

    
    
    private void jTNomKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTNomKeyPressed
        
    
        
    }//GEN-LAST:event_jTNomKeyPressed

    
    
    private void jBDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDelActionPerformed

    
                
    }//GEN-LAST:event_jBDelActionPerformed
                
    
    
    private void jTextFilelProductoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFilelProductoFocusGained

    
        
    }//GEN-LAST:event_jTextFilelProductoFocusGained

    
    
    private void jTextFilelProductoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFilelProductoFocusLost

    
        
    }//GEN-LAST:event_jTextFilelProductoFocusLost

    
    
    
    private void jTextFilelProductoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFilelProductoKeyPressed

    

    }//GEN-LAST:event_jTextFilelProductoKeyPressed

   
  
    private void jTextFilelProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFilelProductoKeyTyped

  
        
    }//GEN-LAST:event_jTextFilelProductoKeyTyped

    
  
    private void jBProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBProdActionPerformed

  
        
    }//GEN-LAST:event_jBProdActionPerformed

    
  
    private void jBProdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBProdKeyPressed

  
        
    }//GEN-LAST:event_jBProdKeyPressed
    
    
  
    private void jTAObservFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTAObservFocusLost

  
        
    }//GEN-LAST:event_jTAObservFocusLost

    
  
    private void jTADescripFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTADescripFocusLost
        
  
        
    }//GEN-LAST:event_jTADescripFocusLost

    
  
    private void jTCantFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCantFocusLost

  
        
    }//GEN-LAST:event_jTCantFocusLost
        
    
    
    private void jTextFieldDescripcionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldDescripcionFocusLost

    
        
    }//GEN-LAST:event_jTextFieldDescripcionFocusLost

                
    
    private void jTCo1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCo1FocusGained
        
    
        
    }//GEN-LAST:event_jTCo1FocusGained

    

    private void jTCo2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCo2FocusGained
        

        
    }//GEN-LAST:event_jTCo2FocusGained

    

    private void jTCo3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCo3FocusGained
        

        
    }//GEN-LAST:event_jTCo3FocusGained

    

    private void jTCo1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTCo1KeyPressed
        

        
    }//GEN-LAST:event_jTCo1KeyPressed

    

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
    
    

    private void jCMostAKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCMostAKeyPressed
        

        
    }//GEN-LAST:event_jCMostAKeyPressed
            
    

    private void jComboboxMonedasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboboxMonedasActionPerformed
        


    }//GEN-LAST:event_jComboboxMonedasActionPerformed

    

    private void jComboboxMonedasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboboxMonedasKeyPressed



    }//GEN-LAST:event_jComboboxMonedasKeyPressed
    
    

    private void jTPreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTPreFocusLost


                       
    }//GEN-LAST:event_jTPreFocusLost

    

    private void jCImpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCImpKeyPressed
        

        
    }//GEN-LAST:event_jCImpKeyPressed

    

    private void jCGuaCoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCGuaCoKeyPressed
        

        
    }//GEN-LAST:event_jCGuaCoKeyPressed

    

    private void jCMandKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCMandKeyPressed
        

        
    }//GEN-LAST:event_jCMandKeyPressed

    

    private void jTPreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTPreKeyTyped
        

        
    }//GEN-LAST:event_jTPreKeyTyped
                
    

    private void jBCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCliActionPerformed


        
    }//GEN-LAST:event_jBCliActionPerformed

    

    private void jBCliKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBCliKeyPressed



    }//GEN-LAST:event_jBCliKeyPressed

    

    private void jTextFieldClienteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldClienteFocusGained


        

    }//GEN-LAST:event_jTextFieldClienteFocusGained


    
    private void jTextFieldClienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldClienteFocusLost

    
        
    }//GEN-LAST:event_jTextFieldClienteFocusLost

    
    
    private void jTextFieldClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldClienteKeyPressed

    

    }//GEN-LAST:event_jTextFieldClienteKeyPressed
    
    
    
    private void jTextFieldClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldClienteKeyTyped

    
        
    }//GEN-LAST:event_jTextFieldClienteKeyTyped
    
    
    
    private void jBTipCamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTipCamActionPerformed

    
                    
    }//GEN-LAST:event_jBTipCamActionPerformed

    
    
    private void jBTipCamKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBTipCamKeyPressed

    

    }//GEN-LAST:event_jBTipCamKeyPressed

    
    private void jComboBoxSeriesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBoxSeriesKeyPressed

    

    }//GEN-LAST:event_jComboBoxSeriesKeyPressed

    
    
    private void formMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_formMouseWheelMoved
        
    
        
    }//GEN-LAST:event_formMouseWheelMoved

    
    
    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        
    
        
    }//GEN-LAST:event_formMouseDragged

    
    
    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        
    
        
    }//GEN-LAST:event_formMouseMoved

            
    
    
    
    
    
    
    
    private void jBTodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTodActionPerformed

    

    }//GEN-LAST:event_jBTodActionPerformed

    
    
    private void jBTodKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBTodKeyPressed

    

    }//GEN-LAST:event_jBTodKeyPressed

    
    
    private void jButtonListaPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListaPrecioActionPerformed

    
        
    }//GEN-LAST:event_jButtonListaPrecioActionPerformed

    
    
    private void jButtonListaPrecioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonListaPrecioKeyPressed

    
        
    }//GEN-LAST:event_jButtonListaPrecioKeyPressed

    
    
    private void jTextFieldListaPrecioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldListaPrecioFocusGained

    
        
    }//GEN-LAST:event_jTextFieldListaPrecioFocusGained

    
    
    private void jTextFieldListaPrecioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldListaPrecioFocusLost

    
        
    }//GEN-LAST:event_jTextFieldListaPrecioFocusLost

    
    
    private void jTextFieldListaPrecioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldListaPrecioKeyPressed

    
        
    }//GEN-LAST:event_jTextFieldListaPrecioKeyPressed

    
    
    private void jTextFieldListaPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldListaPrecioKeyTyped

    
        
    }//GEN-LAST:event_jTextFieldListaPrecioKeyTyped

    
    
    private void jPPartsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPPartsKeyPressed
        
    
        
    }//GEN-LAST:event_jPPartsKeyPressed

    
    
    private void jPOtrKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPOtrKeyPressed
        
    
        
    }//GEN-LAST:event_jPOtrKeyPressed

    
    
    private void jDFVencKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jDFVencKeyPressed

    

    }//GEN-LAST:event_jDFVencKeyPressed

    
    
    private void jComboBoxSeriesFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBoxSeriesFocusLost
        
    
        
    }//GEN-LAST:event_jComboBoxSeriesFocusLost

    
    
    private void jComboboxMonedasFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboboxMonedasFocusLost
        
    
        
    }//GEN-LAST:event_jComboboxMonedasFocusLost

    
    
    
    private void jCGuaCoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCGuaCoActionPerformed
        
    
        
    }//GEN-LAST:event_jCGuaCoActionPerformed

    
    
    private void jBVeGranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVeGranActionPerformed

    

    }//GEN-LAST:event_jBVeGranActionPerformed

    
    
    private void jBVeGranKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBVeGranKeyPressed

    

    }//GEN-LAST:event_jBVeGranKeyPressed

    
    
    private void jPanImgMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanImgMouseEntered

    

    }//GEN-LAST:event_jPanImgMouseEntered

    
    
    private void jPanImgMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanImgMouseExited

    
        
    }//GEN-LAST:event_jPanImgMouseExited

    
    
    private void jPanImgKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanImgKeyPressed

    

    }//GEN-LAST:event_jPanImgKeyPressed

    
    
    private void jSImgKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jSImgKeyPressed
        
    
        
    }//GEN-LAST:event_jSImgKeyPressed

    
    
    private void jBCliMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBCliMouseEntered
        
    
        
    }//GEN-LAST:event_jBCliMouseEntered

    
    
    private void jBProdMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBProdMouseEntered
        
    
        
    }//GEN-LAST:event_jBProdMouseEntered

    
    
    private void jButtonListaPrecioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonListaPrecioMouseEntered
        
    
        
    }//GEN-LAST:event_jButtonListaPrecioMouseEntered

    
    
    private void jBTipCamMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBTipCamMouseEntered
        
    
        
    }//GEN-LAST:event_jBTipCamMouseEntered

    
    
    private void jBNewMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBNewMouseEntered
        
    
        
    }//GEN-LAST:event_jBNewMouseEntered

    
    
    private void jBDelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBDelMouseEntered
        
    
        
    }//GEN-LAST:event_jBDelMouseEntered

    
    
    private void jBTodMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBTodMouseEntered
        
    
        
    }//GEN-LAST:event_jBTodMouseEntered

    
    
    private void jBVeGranMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBVeGranMouseEntered
        
    
        
    }//GEN-LAST:event_jBVeGranMouseEntered

    
    
    private void jBGuarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBGuarMouseEntered
        
    
        
    }//GEN-LAST:event_jBGuarMouseEntered

    
    
    private void jBSalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSalMouseEntered
        
    
        
    }//GEN-LAST:event_jBSalMouseEntered

    
    
    private void jBCliMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBCliMouseExited
        
    
        
    }//GEN-LAST:event_jBCliMouseExited


    
    private void jBProdMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBProdMouseExited
        
    
        
    }//GEN-LAST:event_jBProdMouseExited

    
    
    private void jButtonListaPrecioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonListaPrecioMouseExited
        
    
        
    }//GEN-LAST:event_jButtonListaPrecioMouseExited

    
    
    private void jBNewMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBNewMouseExited
        
    
        
    }//GEN-LAST:event_jBNewMouseExited

    
    
    private void jBDelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBDelMouseExited
        
    
        
    }//GEN-LAST:event_jBDelMouseExited

    
    
    private void jBTipCamMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBTipCamMouseExited
        
    
        
    }//GEN-LAST:event_jBTipCamMouseExited

    
    
    private void jBVeGranMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBVeGranMouseExited
        
    
        
    }//GEN-LAST:event_jBVeGranMouseExited

    
    
    private void jBTodMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBTodMouseExited
        
    
        
    }//GEN-LAST:event_jBTodMouseExited

    
    
    private void jBGuarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBGuarMouseExited
        
    
        
    }//GEN-LAST:event_jBGuarMouseExited

    
    
    private void jBSalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSalMouseExited
        
    
        
    }//GEN-LAST:event_jBSalMouseExited

    
   
    private void jTCo1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCo1FocusLost
        
   
        
    }//GEN-LAST:event_jTCo1FocusLost

    
   
    private void jTCo2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCo2FocusLost
        
   
        
    }//GEN-LAST:event_jTCo2FocusLost

    
   
    private void jTCo3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCo3FocusLost
        
        
        
        
    }//GEN-LAST:event_jTCo3FocusLost

    
    
    private void jTSerFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTSerFocusLost
        
    
        
    }//GEN-LAST:event_jTSerFocusLost

    
    
    private void jTNomFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTNomFocusLost
        
          
        
    }//GEN-LAST:event_jTNomFocusLost

    
    
    
    private void jTUnidFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTUnidFocusLost
        
    
        
    }//GEN-LAST:event_jTUnidFocusLost

    
    
    private void jTextFieldExistenciaAlmacenFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldExistenciaAlmacenFocusLost
 
    
        
    }//GEN-LAST:event_jTextFieldExistenciaAlmacenFocusLost
        
    
    
    
    private void jBGranDescripActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGranDescripActionPerformed

    

    }//GEN-LAST:event_jBGranDescripActionPerformed

    
    
    private void jBGranDescripKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBGranDescripKeyPressed

    
        
    }//GEN-LAST:event_jBGranDescripKeyPressed

    
    
    private void jTSubTotFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTSubTotFocusLost
        
    
        
    }//GEN-LAST:event_jTSubTotFocusLost

    
    
    private void jTextFieldImpuestoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldImpuestoFocusLost
        
    
        
    }//GEN-LAST:event_jTextFieldImpuestoFocusLost

    
    
    private void jTTotFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTTotFocusLost
        
    
        
    }//GEN-LAST:event_jTTotFocusLost

    
    
    private void jTDescFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTDescFocusGained
        
    
        
    }//GEN-LAST:event_jTDescFocusGained

    
    
    private void jTDescKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTDescKeyPressed
        
    
        
    }//GEN-LAST:event_jTDescKeyPressed

    
    
    private void jTDescKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTDescKeyTyped
        
    
        
    }//GEN-LAST:event_jTDescKeyTyped

    
    
    private void jTDescFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTDescFocusLost
        
    
        
    }//GEN-LAST:event_jTDescFocusLost

    
    
    private void jTextFieldTotalDescuentoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldTotalDescuentoFocusGained
        
    
        
    }//GEN-LAST:event_jTextFieldTotalDescuentoFocusGained

    
    
    private void jTextFieldTotalDescuentoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldTotalDescuentoFocusLost
 
    
        
    }//GEN-LAST:event_jTextFieldTotalDescuentoFocusLost

    
    
    private void jTextFieldTotalDescuentoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldTotalDescuentoKeyPressed
        
    
        
    }//GEN-LAST:event_jTextFieldTotalDescuentoKeyPressed

    
    
    private void jComboBoxSeriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSeriesActionPerformed
        
    
        
    }//GEN-LAST:event_jComboBoxSeriesActionPerformed

    
    
    private void jTSerProdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTSerProdFocusGained

    
        
    }//GEN-LAST:event_jTSerProdFocusGained

    
    
    private void jTSerProdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTSerProdFocusLost

    
            
    }//GEN-LAST:event_jTSerProdFocusLost

    
    
    private void jTSerProdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTSerProdKeyPressed

    
        
    }//GEN-LAST:event_jTSerProdKeyPressed

    
    
    private void jBComenSerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBComenSerActionPerformed

    
        
    }//GEN-LAST:event_jBComenSerActionPerformed

    
    
    private void jBComenSerKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBComenSerKeyPressed

    
        
    }//GEN-LAST:event_jBComenSerKeyPressed

    
    
    private void jTKitFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTKitFocusGained

    

    }//GEN-LAST:event_jTKitFocusGained

    
    
    private void jTKitFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTKitFocusLost

    

    }//GEN-LAST:event_jTKitFocusLost

    
    
    private void jComTallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComTallActionPerformed

    
        
    }//GEN-LAST:event_jComTallActionPerformed

    
    
    private void jComTallKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComTallKeyPressed

    
        
    }//GEN-LAST:event_jComTallKeyPressed

    
    
    private void jTDescripTallFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTDescripTallFocusGained

    
        
    }//GEN-LAST:event_jTDescripTallFocusGained

    
    
    private void jTDescripTallFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTDescripTallFocusLost

    
        
    }//GEN-LAST:event_jTDescripTallFocusLost

    
    
    private void jTDescripTallKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTDescripTallKeyPressed

    
        
    }//GEN-LAST:event_jTDescripTallKeyPressed

    
    
    private void jTDescripColoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTDescripColoFocusGained

    
        
    }//GEN-LAST:event_jTDescripColoFocusGained

    
    
    private void jTDescripColoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTDescripColoFocusLost

    
        
    }//GEN-LAST:event_jTDescripColoFocusLost

    
    
    private void jTDescripColoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTDescripColoKeyPressed

    
        
    }//GEN-LAST:event_jTDescripColoKeyPressed

    
    
    private void jComColoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComColoActionPerformed

    
        
    }//GEN-LAST:event_jComColoActionPerformed

    
    
    private void jComColoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComColoKeyPressed

    
        
    }//GEN-LAST:event_jComColoKeyPressed

    
    
    private void jDateBackOrderKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jDateBackOrderKeyPressed

    

    }//GEN-LAST:event_jDateBackOrderKeyPressed

    
    
    private void jCheckBoxBackOrderKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCheckBoxBackOrderKeyPressed

    

    }//GEN-LAST:event_jCheckBoxBackOrderKeyPressed

    
    
    
    
    
    private void jComboBoxAlmacenFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBoxAlmacenFocusLost

    

    }//GEN-LAST:event_jComboBoxAlmacenFocusLost

    
    
    private void jComboBoxAlmacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxAlmacenActionPerformed

    
        
    }//GEN-LAST:event_jComboBoxAlmacenActionPerformed

    
    
    private void jComboBoxAlmacenKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBoxAlmacenKeyPressed

    

    }//GEN-LAST:event_jComboBoxAlmacenKeyPressed

    
    
    private void jTDescripAlmaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTDescripAlmaFocusGained

    

    }//GEN-LAST:event_jTDescripAlmaFocusGained

    
   
    private void jTDescripAlmaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTDescripAlmaFocusLost

   

    }//GEN-LAST:event_jTDescripAlmaFocusLost

    
   
    private void jTDescripAlmaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTDescripAlmaKeyPressed

   

    }//GEN-LAST:event_jTDescripAlmaKeyPressed

    
    
    private void jBExisAlmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExisAlmaActionPerformed

    
        
    }//GEN-LAST:event_jBExisAlmaActionPerformed

    
    
    private void jBExisAlmaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBExisAlmaKeyPressed

    
        
    }//GEN-LAST:event_jBExisAlmaKeyPressed

    
    
    private void jDFEntKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jDFEntKeyPressed

    

    }//GEN-LAST:event_jDFEntKeyPressed

    
    
    private void jDFechKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jDFechKeyPressed

    

    }//GEN-LAST:event_jDFechKeyPressed

    
    private void jTComenSerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTComenSerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTComenSerActionPerformed

    private void jTExistAlmacenFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTExistAlmacenFocusGained

    

    }//GEN-LAST:event_jTExistAlmacenFocusGained

    private void jTExistAlmacenFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTExistAlmacenFocusLost

    
    }//GEN-LAST:event_jTExistAlmacenFocusLost

    private void jTExistAlmacenKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTExistAlmacenKeyPressed

    

    }//GEN-LAST:event_jTExistAlmacenKeyPressed

    private void jButtonImpuestosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonImpuestosActionPerformed

    

    }//GEN-LAST:event_jButtonImpuestosActionPerformed

    private void jButtonImpuestosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonImpuestosKeyPressed

    

    }//GEN-LAST:event_jButtonImpuestosKeyPressed

    private void jComboBoxVendedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxVendedoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxVendedoresActionPerformed

    private void jComboBoxVendedoresKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBoxVendedoresKeyPressed

    

    }//GEN-LAST:event_jComboBoxVendedoresKeyPressed

    private void jTextFieldCodigoOpcionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodigoOpcionalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCodigoOpcionalActionPerformed

    private void jButtonGenerarPDFMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonGenerarPDFMouseEntered

    
    }//GEN-LAST:event_jButtonGenerarPDFMouseEntered

    private void jButtonGenerarPDFMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonGenerarPDFMouseExited

    
    }//GEN-LAST:event_jButtonGenerarPDFMouseExited

    private void jButtonGenerarPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGenerarPDFActionPerformed
        
    
    }//GEN-LAST:event_jButtonGenerarPDFActionPerformed

    private void jButtonGenerarPDFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonGenerarPDFKeyPressed

    
    }//GEN-LAST:event_jButtonGenerarPDFKeyPressed

    private void jTextFieldCodigoOpcionalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCodigoOpcionalKeyPressed
        
    
        
    }//GEN-LAST:event_jTextFieldCodigoOpcionalKeyPressed

    private void jTPreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTPreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTPreActionPerformed

    private void jCCo2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCCo2ItemStateChanged
        
    
        
    }//GEN-LAST:event_jCCo2ItemStateChanged

    private void jCCo3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCCo3ItemStateChanged
        
    
    }//GEN-LAST:event_jCCo3ItemStateChanged

    private void jCMostAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCMostAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCMostAActionPerformed
    
                       
    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton jBCli;
    protected javax.swing.JButton jBComenSer;
    protected javax.swing.JButton jBDel;
    protected javax.swing.JButton jBExisAlma;
    protected javax.swing.JButton jBGranDescrip;
    protected javax.swing.JButton jBGuar;
    protected javax.swing.JButton jBNew;
    protected javax.swing.JButton jBProd;
    protected javax.swing.JButton jBSal;
    protected javax.swing.JButton jBTipCam;
    protected javax.swing.JButton jBTod;
    protected javax.swing.JButton jBVeGran;
    protected javax.swing.JButton jButtonGenerarPDF;
    protected javax.swing.JButton jButtonImpuestos;
    protected javax.swing.JButton jButtonListaPrecio;
    protected javax.swing.JCheckBox jCCo1;
    protected javax.swing.JCheckBox jCCo2;
    protected javax.swing.JCheckBox jCCo3;
    protected javax.swing.JCheckBox jCGuaCo;
    protected javax.swing.JCheckBox jCImp;
    protected javax.swing.JCheckBox jCMand;
    protected javax.swing.JCheckBox jCMostA;
    protected javax.swing.JCheckBox jCheckBoxBackOrder;
    protected javax.swing.JComboBox jComColo;
    protected javax.swing.JComboBox jComTall;
    protected javax.swing.JComboBox jComUnid;
    protected javax.swing.JComboBox jComboBoxAlmacen;
    protected javax.swing.JComboBox jComboBoxSeries;
    protected javax.swing.JComboBox<String> jComboBoxVendedores;
    protected javax.swing.JComboBox jComboboxMonedas;
    private javax.swing.JLabel jLImg;
    protected javax.swing.JLabel jLNot;
    protected javax.swing.JLabel jLabel1;
    protected javax.swing.JLabel jLabel10;
    protected javax.swing.JLabel jLabel11;
    protected javax.swing.JLabel jLabel12;
    protected javax.swing.JLabel jLabel13;
    protected javax.swing.JLabel jLabel14;
    protected javax.swing.JLabel jLabel15;
    protected javax.swing.JLabel jLabel16;
    protected javax.swing.JLabel jLabel17;
    protected javax.swing.JLabel jLabel18;
    protected javax.swing.JLabel jLabel19;
    protected javax.swing.JLabel jLabel2;
    protected javax.swing.JLabel jLabel20;
    protected javax.swing.JLabel jLabel21;
    protected javax.swing.JLabel jLabel22;
    protected javax.swing.JLabel jLabel23;
    protected javax.swing.JLabel jLabel27;
    protected javax.swing.JLabel jLabel28;
    protected javax.swing.JLabel jLabel29;
    protected javax.swing.JLabel jLabel3;
    protected javax.swing.JLabel jLabel30;
    protected javax.swing.JLabel jLabel4;
    protected javax.swing.JLabel jLabel46;
    protected javax.swing.JLabel jLabel47;
    protected javax.swing.JLabel jLabel5;
    protected javax.swing.JLabel jLabel50;
    protected javax.swing.JLabel jLabel6;
    protected javax.swing.JLabel jLabel7;
    protected javax.swing.JLabel jLabel8;
    protected javax.swing.JLabel jLabel9;
    protected javax.swing.JLabel jLblCodigoOpcional;
    private javax.swing.JPanel jP1;
    private javax.swing.JPanel jPClien;
    private javax.swing.JPanel jPOtr;
    private javax.swing.JPanel jPParts;
    private javax.swing.JPanel jPanImg;
    protected javax.swing.JScrollPane jSImg;
    protected javax.swing.JScrollPane jScrollPane1;
    protected javax.swing.JScrollPane jScrollPane3;
    protected javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTADescrip;
    private javax.swing.JTextArea jTAObserv;
    protected javax.swing.JTextField jTAlma2;
    protected javax.swing.JTextField jTCadu;
    protected javax.swing.JTextField jTCant;
    protected javax.swing.JTextField jTCantLot;
    protected javax.swing.JTextField jTCo1;
    protected javax.swing.JTextField jTCo2;
    protected javax.swing.JTextField jTCo3;
    private javax.swing.JTextField jTComenSer;
    protected javax.swing.JTextField jTDesc;
    protected javax.swing.JTextField jTDescripAlma;
    protected javax.swing.JTextField jTDescripColo;
    protected javax.swing.JTextField jTDescripTall;
    protected javax.swing.JTextField jTExistAlmacen;
    protected javax.swing.JTextField jTGara;
    protected javax.swing.JTextField jTId;
    protected javax.swing.JTextField jTKit;
    protected javax.swing.JTextField jTLot;
    protected javax.swing.JTextField jTNom;
    protected javax.swing.JTextField jTPedimen;
    protected javax.swing.JTextField jTPre;
    protected javax.swing.JTextField jTSer;
    protected javax.swing.JTextField jTSerProd;
    protected javax.swing.JTextField jTSubTot;
    protected javax.swing.JTextField jTTot;
    protected javax.swing.JTextField jTUnid;
    protected javax.swing.JTable jTablePartidas;
    protected javax.swing.JTextField jTextFieldCliente;
    protected javax.swing.JTextField jTextFieldCodigoOpcional;
    protected javax.swing.JTextField jTextFieldDescripcion;
    protected javax.swing.JTextField jTextFieldExistenciaAlmacen;
    protected javax.swing.JTextField jTextFieldImpuesto;
    protected javax.swing.JTextField jTextFieldListaPrecio;
    protected javax.swing.JTextField jTextFieldReferencia;
    protected javax.swing.JTextField jTextFieldTotalDescuento;
    protected javax.swing.JTextField jTextFilelProducto;
    // End of variables declaration//GEN-END:variables

}/*Fin de public class NuevoCliente extends javax.swing.JFrame */
