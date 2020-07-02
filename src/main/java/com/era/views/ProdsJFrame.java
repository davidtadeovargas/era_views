package com.era.views;


/*Clase para hacer una alta de producto*/
public abstract class ProdsJFrame extends BaseJFrame
{
    public ProdsJFrame(final String idTextTitleWindow)
    {               
        super(idTextTitleWindow);
        
        initComponents();
        
        postInitComponents();
        
        this.getRootPane().setDefaultButton(jBGuar);
        
        jBGuar.setEnabled(false);
    }

    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jP1 = new javax.swing.JPanel();
        jTProd = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jBNew = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jComUni = new com.era.views.comboboxes.UnidsCombobox();
        jComMeds = new com.era.views.comboboxes.MedsCombobox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTADescrip = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTAInfor = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();
        jTMax = new javax.swing.JTextField();
        jTMin = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTab = new com.era.views.tables.ProductTable();
        jBGuar = new javax.swing.JButton();
        jBDel = new javax.swing.JButton();
        jBLim = new javax.swing.JButton();
        jTExist = new javax.swing.JTextField();
        jCInvent = new javax.swing.JCheckBox();
        jLabel25 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jBCargImg = new javax.swing.JButton();
        jBDelImg = new javax.swing.JButton();
        jBBusc = new javax.swing.JButton();
        jTBusc = new javax.swing.JTextField();
        jBMosT = new javax.swing.JButton();
        jCComp = new javax.swing.JCheckBox();
        jBComps = new javax.swing.JButton();
        jTCodProv = new javax.swing.JTextField();
        jBBusc2 = new javax.swing.JButton();
        jCEsParaVent = new javax.swing.JCheckBox();
        jLabel33 = new javax.swing.JLabel();
        jTNom = new javax.swing.JTextField();
        jBCargF = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jBDelF = new javax.swing.JButton();
        jBFTec = new javax.swing.JButton();
        jCNoSolMaxMin = new javax.swing.JCheckBox();
        jCBajCost = new javax.swing.JCheckBox();
        jLabel36 = new javax.swing.JLabel();
        jCServ = new javax.swing.JCheckBox();
        jBVeGran = new javax.swing.JButton();
        jPanImg = new javax.swing.JPanel();
        jLImg = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jBExisAlma = new javax.swing.JButton();
        jCPed = new javax.swing.JCheckBox();
        jCNoSer = new javax.swing.JCheckBox();
        jBLim1 = new javax.swing.JButton();
        button_impuestos = new javax.swing.JButton();
        jLClaveSat = new javax.swing.JLabel();
        jTClaveSat = new javax.swing.JTextField();
        jBClaveSat = new javax.swing.JButton();
        jBSal = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jComLin = new com.era.views.comboboxes.LinesCombobox();
        jCMostrarXml = new javax.swing.JCheckBox();
        jComLug = new com.era.views.comboboxes.LugsCombobox();
        jComAna = new com.era.views.comboboxes.AnaqsCombobox();
        jLabel23 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        lprecsButton = new javax.swing.JButton();

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
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
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

        jTProd.setBackground(new java.awt.Color(255, 255, 153));
        jTProd.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTProd.setToolTipText("Ctrl+B búsqueda avanzada");
        jTProd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTProd.setNextFocusableComponent(jTNom);
        jTProd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTProdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTProdFocusLost(evt);
            }
        });
        jTProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTProdActionPerformed(evt);
            }
        });
        jTProd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTProdKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTProdKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTProdKeyTyped(evt);
            }
        });
        jP1.add(jTProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 140, 20));

        jLabel2.setText("*Código producto:");
        jP1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, -1));

        jBNew.setBackground(new java.awt.Color(255, 255, 255));
        jBNew.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBNew.setForeground(new java.awt.Color(0, 102, 0));
        jBNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/agre8.png"))); // NOI18N
        jBNew.setText("Nuevo");
        jBNew.setToolTipText("Nuevo producto (Ctrl+N)");
        jBNew.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
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
        jP1.add(jBNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 80, 130, 30));

        jLabel13.setText("*Nombre:");
        jP1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 80, -1));

        jComUni.setNextFocusableComponent(jComAna);
        jComUni.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jComUniFocusLost(evt);
            }
        });
        jComUni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComUniActionPerformed(evt);
            }
        });
        jComUni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComUniKeyPressed(evt);
            }
        });
        jP1.add(jComUni, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 120, 20));

        jComMeds.setNextFocusableComponent(jComUni);
        jComMeds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComMedsActionPerformed(evt);
            }
        });
        jComMeds.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComMedsKeyPressed(evt);
            }
        });
        jP1.add(jComMeds, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 120, 20));

        jTADescrip.setColumns(20);
        jTADescrip.setLineWrap(true);
        jTADescrip.setRows(5);
        jTADescrip.setToolTipText("Esta descripción se utiliza en el punto de venta");
        jTADescrip.setBorder(null);
        jTADescrip.setNextFocusableComponent(jTAInfor);
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
        jScrollPane1.setViewportView(jTADescrip);

        jP1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, 230, 160));

        jLabel8.setText("Medida:");
        jP1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        jTAInfor.setColumns(20);
        jTAInfor.setLineWrap(true);
        jTAInfor.setRows(5);
        jTAInfor.setBorder(null);
        jTAInfor.setNextFocusableComponent(jBCargImg);
        jTAInfor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTAInforFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTAInforFocusLost(evt);
            }
        });
        jTAInfor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTAInforKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(jTAInfor);

        jP1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 450, 230, 70));

        jLabel15.setText("Información:");
        jP1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 430, 110, -1));

        jTMax.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTMax.setText("2");
        jTMax.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTMax.setNextFocusableComponent(lprecsButton);
        jTMax.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTMaxFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTMaxFocusLost(evt);
            }
        });
        jTMax.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTMaxKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTMaxKeyTyped(evt);
            }
        });
        jP1.add(jTMax, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 370, 120, 20));

        jTMin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTMin.setText("1");
        jTMin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTMin.setNextFocusableComponent(jTMax);
        jTMin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTMinFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTMinFocusLost(evt);
            }
        });
        jTMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTMinActionPerformed(evt);
            }
        });
        jTMin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTMinKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTMinKeyTyped(evt);
            }
        });
        jP1.add(jTMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 80, 20));

        jTab.setGridColor(new java.awt.Color(255, 255, 255));
        jTab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Cod. Producto", "Descripción"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTab.setNextFocusableComponent(jBBusc);
        jTab.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        jScrollPane3.setViewportView(jTab);
        if (jTab.getColumnModel().getColumnCount() > 0) {
            jTab.getColumnModel().getColumn(2).setMinWidth(480);
            jTab.getColumnModel().getColumn(2).setPreferredWidth(480);
        }

        jP1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 720, 160));

        jBGuar.setBackground(new java.awt.Color(255, 255, 255));
        jBGuar.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBGuar.setForeground(new java.awt.Color(0, 102, 0));
        jBGuar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/save.png"))); // NOI18N
        jBGuar.setText("Guardar");
        jBGuar.setToolTipText("Guardar cambios (Ctrl+G)");
        jBGuar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBGuar.setName(""); // NOI18N
        jBGuar.setNextFocusableComponent(jBNew);
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
        jP1.add(jBGuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 50, 130, 30));

        jBDel.setBackground(new java.awt.Color(255, 255, 255));
        jBDel.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBDel.setForeground(new java.awt.Color(0, 102, 0));
        jBDel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/can.png"))); // NOI18N
        jBDel.setText("Borrar");
        jBDel.setToolTipText("Borrar proucto(s) (Ctrl+SUPR)");
        jBDel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBDel.setNextFocusableComponent(jBLim1);
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
        jP1.add(jBDel, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 110, 130, 30));

        jBLim.setBackground(new java.awt.Color(255, 255, 255));
        jBLim.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBLim.setForeground(new java.awt.Color(0, 102, 0));
        jBLim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/limp.png"))); // NOI18N
        jBLim.setText("Limpiar");
        jBLim.setToolTipText("Limpiar todos los campos para un nuevo producto");
        jBLim.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBLim.setNextFocusableComponent(jBSal);
        jBLim.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBLimMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBLimMouseExited(evt);
            }
        });
        jBLim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimActionPerformed(evt);
            }
        });
        jBLim.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBLimKeyPressed(evt);
            }
        });
        jP1.add(jBLim, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 170, 130, 30));
        jBLim.getAccessibleContext().setAccessibleName("");

        jTExist.setEditable(false);
        jTExist.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTExist.setFocusable(false);
        jTExist.setNextFocusableComponent(jBExisAlma);
        jTExist.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTExistFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTExistFocusLost(evt);
            }
        });
        jTExist.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTExistKeyPressed(evt);
            }
        });
        jP1.add(jTExist, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 470, 80, -1));

        jCInvent.setBackground(new java.awt.Color(255, 255, 255));
        jCInvent.setSelected(true);
        jCInvent.setText("Inventariable");
        jCInvent.setName(""); // NOI18N
        jCInvent.setNextFocusableComponent(jCComp);
        jCInvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCInventActionPerformed(evt);
            }
        });
        jCInvent.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jCInventKeyPressed(evt);
            }
        });
        jP1.add(jCInvent, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 110, -1));

        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel25.setText("*Máximo:");
        jP1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, 60, -1));

        jLabel29.setText("*Mínimo:");
        jP1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 60, -1));

        jBCargImg.setBackground(new java.awt.Color(255, 255, 255));
        jBCargImg.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jBCargImg.setText("Cargar");
        jBCargImg.setToolTipText("Cargar imágen de producto");
        jBCargImg.setNextFocusableComponent(jBDelImg);
        jBCargImg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBCargImgMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBCargImgMouseExited(evt);
            }
        });
        jBCargImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCargImgActionPerformed(evt);
            }
        });
        jBCargImg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBCargImgKeyPressed(evt);
            }
        });
        jP1.add(jBCargImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 420, -1, -1));

        jBDelImg.setBackground(new java.awt.Color(255, 255, 255));
        jBDelImg.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jBDelImg.setText("Borrar");
        jBDelImg.setToolTipText("Borrar imágen de producto");
        jBDelImg.setNextFocusableComponent(jBVeGran);
        jBDelImg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBDelImgMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBDelImgMouseExited(evt);
            }
        });
        jBDelImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDelImgActionPerformed(evt);
            }
        });
        jBDelImg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBDelImgKeyPressed(evt);
            }
        });
        jP1.add(jBDelImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 420, 59, -1));

        jBBusc.setBackground(new java.awt.Color(255, 255, 255));
        jBBusc.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBBusc.setForeground(new java.awt.Color(0, 102, 0));
        jBBusc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/busc5.png"))); // NOI18N
        jBBusc.setText("Buscar F3");
        jBBusc.setNextFocusableComponent(jTBusc);
        jBBusc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBBuscMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBBuscMouseExited(evt);
            }
        });
        jBBusc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscActionPerformed(evt);
            }
        });
        jBBusc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBBuscKeyPressed(evt);
            }
        });
        jP1.add(jBBusc, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 130, 19));

        jTBusc.setNextFocusableComponent(jBMosT);
        jTBusc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTBuscFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTBuscFocusLost(evt);
            }
        });
        jTBusc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTBuscKeyPressed(evt);
            }
        });
        jP1.add(jTBusc, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 460, -1));

        jBMosT.setBackground(new java.awt.Color(255, 255, 255));
        jBMosT.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBMosT.setForeground(new java.awt.Color(0, 102, 0));
        jBMosT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/mostt.png"))); // NOI18N
        jBMosT.setText("Mostrar F4");
        jBMosT.setNextFocusableComponent(jComLin);
        jBMosT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBMosTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBMosTMouseExited(evt);
            }
        });
        jBMosT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMosTActionPerformed(evt);
            }
        });
        jBMosT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBMosTKeyPressed(evt);
            }
        });
        jP1.add(jBMosT, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 210, 130, 19));

        jCComp.setBackground(new java.awt.Color(255, 255, 255));
        jCComp.setText("Kit");
        jCComp.setNextFocusableComponent(jTADescrip);
        jCComp.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCCompStateChanged(evt);
            }
        });
        jCComp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCCompActionPerformed(evt);
            }
        });
        jCComp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jCCompKeyPressed(evt);
            }
        });
        jP1.add(jCComp, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 510, 80, -1));

        jBComps.setBackground(new java.awt.Color(255, 255, 255));
        jBComps.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBComps.setText("Componentes");
        jBComps.setToolTipText("Agrega los componentes del kit");
        jBComps.setEnabled(false);
        jBComps.setNextFocusableComponent(button_impuestos);
        jBComps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCompsActionPerformed(evt);
            }
        });
        jBComps.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBCompsKeyPressed(evt);
            }
        });
        jP1.add(jBComps, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 110, 20));

        jTCodProv.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTCodProv.setName(""); // NOI18N
        jTCodProv.setNextFocusableComponent(jBBusc2);
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
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTCodProvKeyTyped(evt);
            }
        });
        jP1.add(jTCodProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, 90, 20));

        jBBusc2.setBackground(new java.awt.Color(255, 255, 255));
        jBBusc2.setText("...");
        jBBusc2.setToolTipText("Buscar proveedor(es)");
        jBBusc2.setNextFocusableComponent(jTClaveSat);
        jBBusc2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBBusc2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBBusc2MouseExited(evt);
            }
        });
        jBBusc2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBusc2ActionPerformed(evt);
            }
        });
        jBBusc2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBBusc2KeyPressed(evt);
            }
        });
        jP1.add(jBBusc2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 390, 30, 20));

        jCEsParaVent.setBackground(new java.awt.Color(255, 255, 255));
        jCEsParaVent.setSelected(true);
        jCEsParaVent.setText("Es para venta");
        jCEsParaVent.setNextFocusableComponent(jCNoSolMaxMin);
        jCEsParaVent.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jCEsParaVentKeyPressed(evt);
            }
        });
        jP1.add(jCEsParaVent, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 120, -1));

        jLabel33.setText("Descripción:");
        jP1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, 100, -1));

        jTNom.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTNom.setNextFocusableComponent(jBGuar);
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
        jP1.add(jTNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 470, 20));

        jBCargF.setBackground(new java.awt.Color(255, 255, 255));
        jBCargF.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jBCargF.setText("Cargar");
        jBCargF.setToolTipText("Cargar ficha técnica para producto");
        jBCargF.setNextFocusableComponent(jBDelF);
        jBCargF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBCargFMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBCargFMouseExited(evt);
            }
        });
        jBCargF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCargFActionPerformed(evt);
            }
        });
        jBCargF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBCargFKeyPressed(evt);
            }
        });
        jP1.add(jBCargF, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, -1, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Ficha Técnica:");
        jP1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, 110, -1));

        jBDelF.setBackground(new java.awt.Color(255, 255, 255));
        jBDelF.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jBDelF.setText("Borrar");
        jBDelF.setToolTipText("Borrar archivo de ficha técnica");
        jBDelF.setNextFocusableComponent(jBFTec);
        jBDelF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBDelFMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBDelFMouseExited(evt);
            }
        });
        jBDelF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDelFActionPerformed(evt);
            }
        });
        jBDelF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBDelFKeyPressed(evt);
            }
        });
        jP1.add(jBDelF, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, -1, 20));

        jBFTec.setBackground(new java.awt.Color(255, 255, 255));
        jBFTec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/img.png"))); // NOI18N
        jBFTec.setToolTipText("Ver Ficha Técnica Completa");
        jBFTec.setNextFocusableComponent(jTMin);
        jBFTec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBFTecMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBFTecMouseExited(evt);
            }
        });
        jBFTec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFTecActionPerformed(evt);
            }
        });
        jBFTec.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBFTecKeyPressed(evt);
            }
        });
        jP1.add(jBFTec, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, 30, 20));

        jCNoSolMaxMin.setBackground(new java.awt.Color(255, 255, 255));
        jCNoSolMaxMin.setText("Solicitar MaxMin");
        jCNoSolMaxMin.setToolTipText("No solicitar Máximos y Mínimos");
        jCNoSolMaxMin.setNextFocusableComponent(jCBajCost);
        jCNoSolMaxMin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jCNoSolMaxMinKeyPressed(evt);
            }
        });
        jP1.add(jCNoSolMaxMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 120, -1));

        jCBajCost.setBackground(new java.awt.Color(255, 255, 255));
        jCBajCost.setText("Permitir vender abajo del costo");
        jCBajCost.setToolTipText("Vender abajo del Costo");
        jCBajCost.setNextFocusableComponent(jCServ);
        jP1.add(jCBajCost, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 210, 20));

        jLabel36.setText("*Unidad:");
        jP1.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        jCServ.setBackground(new java.awt.Color(255, 255, 255));
        jCServ.setText("Servicio");
        jCServ.setNextFocusableComponent(jCInvent);
        jCServ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCServActionPerformed(evt);
            }
        });
        jCServ.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jCServKeyPressed(evt);
            }
        });
        jP1.add(jCServ, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 110, -1));

        jBVeGran.setBackground(new java.awt.Color(255, 255, 255));
        jBVeGran.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/img.png"))); // NOI18N
        jBVeGran.setToolTipText("Ver imágen  de producto completa");
        jBVeGran.setName(""); // NOI18N
        jBVeGran.setNextFocusableComponent(jTExist);
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
        jP1.add(jBVeGran, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 420, 30, 20));

        jPanImg.setBackground(new java.awt.Color(255, 255, 204));
        jPanImg.setNextFocusableComponent(jBCargImg);
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
        jPanImg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanImg.add(jLImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 160));

        jP1.add(jPanImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 260, 180, 160));

        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel44.setText("Proveedor:");
        jP1.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, 70, -1));

        jLabel47.setText("Existencia general:");
        jP1.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 450, 140, -1));

        jBExisAlma.setBackground(new java.awt.Color(255, 255, 255));
        jBExisAlma.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBExisAlma.setForeground(new java.awt.Color(0, 102, 0));
        jBExisAlma.setText("Exist. almacenes");
        jBExisAlma.setToolTipText("Existencias del producto por almacén");
        jBExisAlma.setNextFocusableComponent(jTProd);
        jBExisAlma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBExisAlmaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBExisAlmaMouseExited(evt);
            }
        });
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
        jP1.add(jBExisAlma, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 500, 130, 20));

        jCPed.setBackground(new java.awt.Color(255, 255, 255));
        jCPed.setText("Pedimento");
        jCPed.setToolTipText("Manejar lote y pedimento para el producto");
        jCPed.setNextFocusableComponent(jCComp);
        jCPed.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jCPedKeyPressed(evt);
            }
        });
        jP1.add(jCPed, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 490, 130, 20));

        jCNoSer.setBackground(new java.awt.Color(255, 255, 255));
        jCNoSer.setText("No. serie");
        jCNoSer.setNextFocusableComponent(jCPed);
        jCNoSer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jCNoSerKeyPressed(evt);
            }
        });
        jP1.add(jCNoSer, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 470, 110, 20));

        jBLim1.setBackground(new java.awt.Color(255, 255, 255));
        jBLim1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBLim1.setForeground(new java.awt.Color(0, 102, 0));
        jBLim1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Activado-135x35px.png"))); // NOI18N
        jBLim1.setToolTipText("Abrir scaner");
        jBLim1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBLim1.setNextFocusableComponent(jBLim);
        jBLim1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBLim1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBLim1MouseExited(evt);
            }
        });
        jBLim1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLim1ActionPerformed(evt);
            }
        });
        jBLim1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBLim1KeyPressed(evt);
            }
        });
        jP1.add(jBLim1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 140, 130, 30));

        button_impuestos.setBackground(new java.awt.Color(255, 255, 255));
        button_impuestos.setText("Impuestos");
        button_impuestos.setNextFocusableComponent(jBCargF);
        button_impuestos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_impuestosActionPerformed(evt);
            }
        });
        button_impuestos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                button_impuestosKeyPressed(evt);
            }
        });
        jP1.add(button_impuestos, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 110, 20));

        jLClaveSat.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLClaveSat.setText("*Clave SAT:");
        jP1.add(jLClaveSat, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, 70, -1));

        jTClaveSat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTClaveSat.setNextFocusableComponent(jBClaveSat);
        jTClaveSat.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTClaveSatFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTClaveSatFocusLost(evt);
            }
        });
        jTClaveSat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTClaveSatKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTClaveSatKeyTyped(evt);
            }
        });
        jP1.add(jTClaveSat, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 410, 90, 20));

        jBClaveSat.setBackground(new java.awt.Color(255, 255, 255));
        jBClaveSat.setText("...");
        jBClaveSat.setToolTipText("Buscar garantía");
        jBClaveSat.setNextFocusableComponent(jCEsParaVent);
        jBClaveSat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBClaveSatMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBClaveSatMouseExited(evt);
            }
        });
        jBClaveSat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBClaveSatActionPerformed(evt);
            }
        });
        jBClaveSat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBClaveSatKeyPressed(evt);
            }
        });
        jP1.add(jBClaveSat, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 410, 30, 20));

        jBSal.setBackground(new java.awt.Color(255, 255, 255));
        jBSal.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBSal.setForeground(new java.awt.Color(0, 102, 0));
        jBSal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/sal.png"))); // NOI18N
        jBSal.setText("Salir");
        jBSal.setToolTipText("Salir (ESC)");
        jBSal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBSal.setNextFocusableComponent(jBBusc);
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
        jP1.add(jBSal, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 200, 130, 30));

        jLabel3.setText("Linea");
        jP1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        jComLin.setNextFocusableComponent(jComMeds);
        jP1.add(jComLin, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 120, 20));

        jCMostrarXml.setBackground(new java.awt.Color(255, 255, 255));
        jCMostrarXml.setText("Mostrar componentes en XML");
        jCMostrarXml.setNextFocusableComponent(jCNoSer);
        jP1.add(jCMostrarXml, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 450, 200, -1));

        jComLug.setNextFocusableComponent(jBComps);
        jComLug.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jComLugFocusLost(evt);
            }
        });
        jComLug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComLugActionPerformed(evt);
            }
        });
        jComLug.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComLugKeyPressed(evt);
            }
        });
        jP1.add(jComLug, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 120, 20));

        jComAna.setNextFocusableComponent(jComLug);
        jComAna.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jComAnaFocusLost(evt);
            }
        });
        jComAna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComAnaActionPerformed(evt);
            }
        });
        jComAna.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComAnaKeyPressed(evt);
            }
        });
        jP1.add(jComAna, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 120, 20));

        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel23.setText("Anaquel:");
        jP1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 60, -1));

        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel37.setText("Lugar:");
        jP1.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 60, -1));

        lprecsButton.setBackground(new java.awt.Color(255, 255, 255));
        lprecsButton.setText("Lista de precios");
        lprecsButton.setNextFocusableComponent(jTCodProv);
        lprecsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lprecsButtonActionPerformed(evt);
            }
        });
        jP1.add(lprecsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jP1, javax.swing.GroupLayout.PREFERRED_SIZE, 877, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jP1, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

        
    private void jBNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNewActionPerformed
    
    }//GEN-LAST:event_jBNewActionPerformed

        
    private void jBSalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalActionPerformed

    
    }//GEN-LAST:event_jBSalActionPerformed

        
    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed

    
    }//GEN-LAST:event_formKeyPressed

        
    private void jTProdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTProdKeyPressed

           
    }//GEN-LAST:event_jTProdKeyPressed
        
            
    private void jBNewKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBNewKeyPressed

        
    }//GEN-LAST:event_jBNewKeyPressed

        
    private void jBSalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBSalKeyPressed

    
    }//GEN-LAST:event_jBSalKeyPressed

        
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

    
    }//GEN-LAST:event_formWindowClosing

        
    private void jTProdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTProdFocusGained

    
    }//GEN-LAST:event_jTProdFocusGained

                    
    private void jP1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jP1KeyPressed


    }//GEN-LAST:event_jP1KeyPressed

    
    private void jComMedsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComMedsKeyPressed

    
    }//GEN-LAST:event_jComMedsKeyPressed

           
    private void jComUniKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComUniKeyPressed

        
    }//GEN-LAST:event_jComUniKeyPressed

        
    private void jTADescripKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTADescripKeyPressed

    
    }//GEN-LAST:event_jTADescripKeyPressed
        
    private void jTADescripFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTADescripFocusGained


    }//GEN-LAST:event_jTADescripFocusGained

    
    private void jTAInforKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTAInforKeyPressed

    
    }//GEN-LAST:event_jTAInforKeyPressed

        
    private void jTAInforFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTAInforFocusGained

    
    }//GEN-LAST:event_jTAInforFocusGained
        
    
    private void jTMinKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTMinKeyPressed

    
    }//GEN-LAST:event_jTMinKeyPressed

        
    private void jTMaxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTMaxKeyPressed

    
    }//GEN-LAST:event_jTMaxKeyPressed
    
    
        
    private void jTMinFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTMinFocusGained
    

    }//GEN-LAST:event_jTMinFocusGained

    
    private void jTMaxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTMaxFocusGained

    
    }//GEN-LAST:event_jTMaxFocusGained

        
    private void jTabKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTabKeyPressed

    
    }//GEN-LAST:event_jTabKeyPressed

        
    private void jBGuarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBGuarKeyPressed

    
    }//GEN-LAST:event_jBGuarKeyPressed

        
    private void jBDelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBDelKeyPressed

    
    }//GEN-LAST:event_jBDelKeyPressed

       
    private void jBLimKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBLimKeyPressed

    
    }//GEN-LAST:event_jBLimKeyPressed

            
    
            
    private void jTADescripFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTADescripFocusLost
        
    }//GEN-LAST:event_jTADescripFocusLost

       
     
    private void jTAInforFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTAInforFocusLost
    
        
    }//GEN-LAST:event_jTAInforFocusLost

    
    private void jTMinFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTMinFocusLost
    
        
    }//GEN-LAST:event_jTMinFocusLost

    

    private void jTMaxFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTMaxFocusLost

        
    }//GEN-LAST:event_jTMaxFocusLost

               
    private void jTMinKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTMinKeyTyped
        

    }//GEN-LAST:event_jTMinKeyTyped

    
    private void jTMaxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTMaxKeyTyped
            
        
    }//GEN-LAST:event_jTMaxKeyTyped

        
        
        
            
        
    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        
    
        
    }//GEN-LAST:event_formWindowGainedFocus
        
        
    private void jComMedsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComMedsActionPerformed
            
        
    }//GEN-LAST:event_jComMedsActionPerformed
        
    
        
        
    private void jComUniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComUniActionPerformed
            
                
    }//GEN-LAST:event_jComUniActionPerformed

        
    private void jBDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDelActionPerformed
                    
        
    }//GEN-LAST:event_jBDelActionPerformed

        
    private void jBLimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimActionPerformed
            
                
    }//GEN-LAST:event_jBLimActionPerformed
        
      
    private void jTExistKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTExistKeyPressed
        
        
    }//GEN-LAST:event_jTExistKeyPressed
    
        
    private void jTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabMouseClicked
        
    
    }//GEN-LAST:event_jTabMouseClicked

        
    private void jBGuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuarActionPerformed
                        
        
    }//GEN-LAST:event_jBGuarActionPerformed
                                            
                
        
        
        
    private void jComAnaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComAnaActionPerformed
        
    
                
    }//GEN-LAST:event_jComAnaActionPerformed

    
    
    private void jComAnaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComAnaKeyPressed
        
        
    }//GEN-LAST:event_jComAnaKeyPressed

    
    
    private void jComLugKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComLugKeyPressed
        
        
    }//GEN-LAST:event_jComLugKeyPressed

        
        
        
    private void jComLugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComLugActionPerformed
            
                
    }//GEN-LAST:event_jComLugActionPerformed

        
    private void jCInventKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCInventKeyPressed
        
        
    }//GEN-LAST:event_jCInventKeyPressed

        
    private void jCInventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCInventActionPerformed
            
    }//GEN-LAST:event_jCInventActionPerformed

    
            
    private void jTProdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTProdFocusLost

        
    }//GEN-LAST:event_jTProdFocusLost
           
    
    private void jTProdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTProdKeyTyped

           
       
    }//GEN-LAST:event_jTProdKeyTyped

        
    private void jBCargImgKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBCargImgKeyPressed
        
        
    }//GEN-LAST:event_jBCargImgKeyPressed
    
        
    private void jBCargImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCargImgActionPerformed
            
        
    }//GEN-LAST:event_jBCargImgActionPerformed

        
    private void jBDelImgKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBDelImgKeyPressed
        
        
    }//GEN-LAST:event_jBDelImgKeyPressed

        
    private void jBDelImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDelImgActionPerformed
                    
        
    }//GEN-LAST:event_jBDelImgActionPerformed

        
    private void jTBuscFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTBuscFocusGained
       
        
    }//GEN-LAST:event_jTBuscFocusGained

    
    private void jTBuscKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTBuscKeyPressed
    
        
    }//GEN-LAST:event_jTBuscKeyPressed

    
    private void jBBuscKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBBuscKeyPressed
        
        
    }//GEN-LAST:event_jBBuscKeyPressed

        
    private void jBBuscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscActionPerformed
            
        
    }//GEN-LAST:event_jBBuscActionPerformed

        
    private void jBMosTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMosTActionPerformed
            
        
    }//GEN-LAST:event_jBMosTActionPerformed
        
    private void jBMosTKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBMosTKeyPressed
        
        
    }//GEN-LAST:event_jBMosTKeyPressed

    
    private void jCCompKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCCompKeyPressed
        
        
    }//GEN-LAST:event_jCCompKeyPressed

        
    private void jCCompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCCompActionPerformed
            
        
    }//GEN-LAST:event_jCCompActionPerformed

        
    private void jBCompsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBCompsKeyPressed
        
        
    }//GEN-LAST:event_jBCompsKeyPressed

        
    private void jBCompsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCompsActionPerformed
            
        
    }//GEN-LAST:event_jBCompsActionPerformed
                
        
    
        
                   
            
    private void jTCodProvFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCodProvFocusGained

       
    }//GEN-LAST:event_jTCodProvFocusGained

        
    private void jTCodProvFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCodProvFocusLost
    
        
    }//GEN-LAST:event_jTCodProvFocusLost

   
    private void jTCodProvKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTCodProvKeyPressed
   

    }//GEN-LAST:event_jTCodProvKeyPressed

    
    private void jTCodProvKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTCodProvKeyTyped
    
        
    }//GEN-LAST:event_jTCodProvKeyTyped

    
    private void jBBusc2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBusc2ActionPerformed
    

    }//GEN-LAST:event_jBBusc2ActionPerformed

    
    private void jBBusc2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBBusc2KeyPressed

        
    }//GEN-LAST:event_jBBusc2KeyPressed

    
    private void jCEsParaVentKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCEsParaVentKeyPressed
        
        
    }//GEN-LAST:event_jCEsParaVentKeyPressed

    
    private void jTNomKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTNomKeyPressed
        
        
    }//GEN-LAST:event_jTNomKeyPressed

        
    private void jTNomFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTNomFocusGained
        
    
    }//GEN-LAST:event_jTNomFocusGained

        
    private void jTNomFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTNomFocusLost
    
        
    }//GEN-LAST:event_jTNomFocusLost

       
    
        
    private void jBCargFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBCargFKeyPressed
        
        
    }//GEN-LAST:event_jBCargFKeyPressed

        
    private void jBCargFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCargFActionPerformed
            
        
    }//GEN-LAST:event_jBCargFActionPerformed

        
    private void jBDelFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBDelFKeyPressed
        
        
    }//GEN-LAST:event_jBDelFKeyPressed

        
    private void jBFTecKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBFTecKeyPressed
        
        
    }//GEN-LAST:event_jBFTecKeyPressed

        
    private void jBDelFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDelFActionPerformed
            
        
    }//GEN-LAST:event_jBDelFActionPerformed

        
    private void jBFTecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFTecActionPerformed
            
        
    }//GEN-LAST:event_jBFTecActionPerformed

        
    private void jCNoSolMaxMinKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCNoSolMaxMinKeyPressed
        
        
    }//GEN-LAST:event_jCNoSolMaxMinKeyPressed

        
               
   
    private void formMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_formMouseWheelMoved
        
        
    }//GEN-LAST:event_formMouseWheelMoved

       
    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        
        
    }//GEN-LAST:event_formMouseDragged

        
    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        
        
    }//GEN-LAST:event_formMouseMoved

            
    
   
     
        
        
    private void jBBuscMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBBuscMouseEntered
            
        
    }//GEN-LAST:event_jBBuscMouseEntered

    
    private void jBBuscMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBBuscMouseExited
            
        
    }//GEN-LAST:event_jBBuscMouseExited

    
                
    
        
    private void jCServKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCServKeyPressed
        
        
    }//GEN-LAST:event_jCServKeyPressed

        
    private void jCServActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCServActionPerformed
            
        
    }//GEN-LAST:event_jCServActionPerformed

        
    
        
    private void jComAnaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComAnaFocusLost
        
        
    }//GEN-LAST:event_jComAnaFocusLost

        
    private void jComLugFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComLugFocusLost
        
    
    }//GEN-LAST:event_jComLugFocusLost

        
        
    
        
    private void jPanImgMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanImgMouseEntered
    

    }//GEN-LAST:event_jPanImgMouseEntered

    
    private void jPanImgMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanImgMouseExited
    
        
    }//GEN-LAST:event_jPanImgMouseExited

    
    private void jPanImgKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanImgKeyPressed
    

    }//GEN-LAST:event_jPanImgKeyPressed

        
    private void jBVeGranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVeGranActionPerformed
    
        
    }//GEN-LAST:event_jBVeGranActionPerformed

    
    private void jBVeGranKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBVeGranKeyPressed

    
    }//GEN-LAST:event_jBVeGranKeyPressed

    
    
    
    
    private void jBBusc2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBBusc2MouseEntered
            
        
    }//GEN-LAST:event_jBBusc2MouseEntered

    
    
    private void jBMosTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBMosTMouseEntered
        
        
    }//GEN-LAST:event_jBMosTMouseEntered

        
        
    private void jBGuarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBGuarMouseEntered
        
        
    }//GEN-LAST:event_jBGuarMouseEntered

        
    private void jBDelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBDelMouseEntered
        
        
    }//GEN-LAST:event_jBDelMouseEntered

        
    private void jBNewMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBNewMouseEntered
        
        
    }//GEN-LAST:event_jBNewMouseEntered

        
    private void jBLimMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBLimMouseEntered
        
        
    }//GEN-LAST:event_jBLimMouseEntered

        
    private void jBSalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSalMouseEntered
        
        
    }//GEN-LAST:event_jBSalMouseEntered

    
       
    private void jBCargImgMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBCargImgMouseEntered
        
        
    }//GEN-LAST:event_jBCargImgMouseEntered

        
    private void jBDelImgMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBDelImgMouseEntered
        
        
    }//GEN-LAST:event_jBDelImgMouseEntered

        
    private void jBVeGranMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBVeGranMouseEntered
        
        
    }//GEN-LAST:event_jBVeGranMouseEntered

            
    
    private void jBCargFMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBCargFMouseEntered
        
        
    }//GEN-LAST:event_jBCargFMouseEntered

    
    private void jBDelFMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBDelFMouseEntered
        
        
    }//GEN-LAST:event_jBDelFMouseEntered

       
    private void jBFTecMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBFTecMouseEntered
        
        
    }//GEN-LAST:event_jBFTecMouseEntered

      
        
        
        
    private void jBBusc2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBBusc2MouseExited
        
        
    }//GEN-LAST:event_jBBusc2MouseExited

    
       
    private void jBMosTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBMosTMouseExited
        
        
    }//GEN-LAST:event_jBMosTMouseExited

       
    private void jBGuarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBGuarMouseExited
        
        
    }//GEN-LAST:event_jBGuarMouseExited

        
    private void jBDelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBDelMouseExited
        
        
    }//GEN-LAST:event_jBDelMouseExited

        
    private void jBNewMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBNewMouseExited
        
        
    }//GEN-LAST:event_jBNewMouseExited

        
    private void jBLimMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBLimMouseExited
        
        
    }//GEN-LAST:event_jBLimMouseExited

        
    private void jBSalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSalMouseExited
        
        
    }//GEN-LAST:event_jBSalMouseExited

       
    private void jBCargImgMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBCargImgMouseExited
        
        
    }//GEN-LAST:event_jBCargImgMouseExited

       
    private void jBDelImgMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBDelImgMouseExited
        
        
    }//GEN-LAST:event_jBDelImgMouseExited

        
    private void jBVeGranMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBVeGranMouseExited
        
        
    }//GEN-LAST:event_jBVeGranMouseExited

    
        
    private void jBCargFMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBCargFMouseExited
        
        
    }//GEN-LAST:event_jBCargFMouseExited

        
    private void jBDelFMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBDelFMouseExited
        
        
    }//GEN-LAST:event_jBDelFMouseExited

        
    private void jBFTecMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBFTecMouseExited
        
        
    }//GEN-LAST:event_jBFTecMouseExited

        
    private void jTBuscFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTBuscFocusLost

    
        
    }//GEN-LAST:event_jTBuscFocusLost

        
    private void jTExistFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTExistFocusLost
        
        
    }//GEN-LAST:event_jTExistFocusLost

    
        
    
        
    
       
        
                   
        
        
    
    
    
        
            
    
    
        
    
           
       
        
        
    
    
    
    
    
    
    
        
        
        
        
        
        
       
        
        
       
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        
    
        
    }//GEN-LAST:event_formWindowActivated

    
    
       
    
   

    private void jBExisAlmaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBExisAlmaKeyPressed
        
        
    }//GEN-LAST:event_jBExisAlmaKeyPressed

    
    private void jTExistFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTExistFocusGained
        
        
    }//GEN-LAST:event_jTExistFocusGained

    
   
    private void jBExisAlmaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBExisAlmaMouseEntered
 
        
    }//GEN-LAST:event_jBExisAlmaMouseEntered

    
  
    private void jBExisAlmaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBExisAlmaMouseExited
 
        
    }//GEN-LAST:event_jBExisAlmaMouseExited

    
  
    private void jBExisAlmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExisAlmaActionPerformed
        

        
    }//GEN-LAST:event_jBExisAlmaActionPerformed

    
    private void jCPedKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCPedKeyPressed
        
        
    }//GEN-LAST:event_jCPedKeyPressed

        
    private void jComUniFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComUniFocusLost
    
    
        
    }//GEN-LAST:event_jComUniFocusLost

        
    private void jCNoSerKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCNoSerKeyPressed
        
        
    }//GEN-LAST:event_jCNoSerKeyPressed

    
    
    
    private void jTMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTMinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTMinActionPerformed

    private void jBLim1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBLim1MouseEntered
       
    }//GEN-LAST:event_jBLim1MouseEntered

    private void jBLim1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBLim1MouseExited
       
    }//GEN-LAST:event_jBLim1MouseExited

    private void jBLim1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLim1ActionPerformed
        
    }//GEN-LAST:event_jBLim1ActionPerformed

    private void jBLim1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBLim1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBLim1KeyPressed

    private void button_impuestosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_impuestosActionPerformed

        
    }//GEN-LAST:event_button_impuestosActionPerformed

    
    private void button_impuestosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_button_impuestosKeyPressed

        

    }//GEN-LAST:event_button_impuestosKeyPressed

    private void jTProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTProdActionPerformed

    private void jTProdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTProdKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTProdKeyReleased

    private void jTClaveSatFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTClaveSatFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTClaveSatFocusGained

    private void jTClaveSatFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTClaveSatFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTClaveSatFocusLost

    private void jTClaveSatKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTClaveSatKeyPressed
        
    }//GEN-LAST:event_jTClaveSatKeyPressed

    private void jTClaveSatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTClaveSatKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTClaveSatKeyTyped

    private void jBClaveSatMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBClaveSatMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jBClaveSatMouseEntered

    private void jBClaveSatMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBClaveSatMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jBClaveSatMouseExited

    private void jBClaveSatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBClaveSatActionPerformed
        
    }//GEN-LAST:event_jBClaveSatActionPerformed

    private void jBClaveSatKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBClaveSatKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBClaveSatKeyPressed

    private void jCCompStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCCompStateChanged
        
    }//GEN-LAST:event_jCCompStateChanged

    private void lprecsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lprecsButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lprecsButtonActionPerformed
  
            
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton button_impuestos;
    protected javax.swing.JButton jBBusc;
    protected javax.swing.JButton jBBusc2;
    protected javax.swing.JButton jBCargF;
    protected javax.swing.JButton jBCargImg;
    protected javax.swing.JButton jBClaveSat;
    protected javax.swing.JButton jBComps;
    protected javax.swing.JButton jBDel;
    protected javax.swing.JButton jBDelF;
    protected javax.swing.JButton jBDelImg;
    protected javax.swing.JButton jBExisAlma;
    protected javax.swing.JButton jBFTec;
    protected javax.swing.JButton jBGuar;
    protected javax.swing.JButton jBLim;
    protected javax.swing.JButton jBLim1;
    protected javax.swing.JButton jBMosT;
    protected javax.swing.JButton jBNew;
    protected javax.swing.JButton jBSal;
    protected javax.swing.JButton jBVeGran;
    protected javax.swing.JCheckBox jCBajCost;
    protected javax.swing.JCheckBox jCComp;
    protected javax.swing.JCheckBox jCEsParaVent;
    protected javax.swing.JCheckBox jCInvent;
    protected javax.swing.JCheckBox jCMostrarXml;
    protected javax.swing.JCheckBox jCNoSer;
    protected javax.swing.JCheckBox jCNoSolMaxMin;
    protected javax.swing.JCheckBox jCPed;
    protected javax.swing.JCheckBox jCServ;
    protected com.era.views.comboboxes.AnaqsCombobox jComAna;
    protected com.era.views.comboboxes.LinesCombobox jComLin;
    protected com.era.views.comboboxes.LugsCombobox jComLug;
    protected com.era.views.comboboxes.MedsCombobox jComMeds;
    protected com.era.views.comboboxes.UnidsCombobox jComUni;
    protected javax.swing.JLabel jLClaveSat;
    protected javax.swing.JLabel jLImg;
    protected javax.swing.JLabel jLabel13;
    protected javax.swing.JLabel jLabel15;
    protected javax.swing.JLabel jLabel2;
    protected javax.swing.JLabel jLabel23;
    protected javax.swing.JLabel jLabel25;
    protected javax.swing.JLabel jLabel29;
    protected javax.swing.JLabel jLabel3;
    protected javax.swing.JLabel jLabel33;
    protected javax.swing.JLabel jLabel36;
    protected javax.swing.JLabel jLabel37;
    protected javax.swing.JLabel jLabel44;
    protected javax.swing.JLabel jLabel47;
    protected javax.swing.JLabel jLabel7;
    protected javax.swing.JLabel jLabel8;
    protected javax.swing.JPanel jP1;
    protected javax.swing.JPanel jPanImg;
    protected javax.swing.JScrollPane jScrollPane1;
    protected javax.swing.JScrollPane jScrollPane2;
    protected javax.swing.JScrollPane jScrollPane3;
    protected javax.swing.JTextArea jTADescrip;
    protected javax.swing.JTextArea jTAInfor;
    protected javax.swing.JTextField jTBusc;
    protected javax.swing.JTextField jTClaveSat;
    protected javax.swing.JTextField jTCodProv;
    protected javax.swing.JTextField jTExist;
    protected javax.swing.JTextField jTMax;
    protected javax.swing.JTextField jTMin;
    protected javax.swing.JTextField jTNom;
    protected javax.swing.JTextField jTProd;
    protected com.era.views.tables.ProductTable jTab;
    protected javax.swing.JButton lprecsButton;
    // End of variables declaration//GEN-END:variables

}/*Fin de public class NuevoCliente extends javax.swing.JFrame */
