package com.era.views;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


/*Clase para hacer una alta de producto*/
public abstract class ProdsJFrame extends BaseJFrame
{
    public ProdsJFrame(final String idTextTitleWindow)
    {               
        super(idTextTitleWindow);
        
        initComponents();
        
        jTab.setAutoResizeMode(0);
        
        this.getRootPane().setDefaultButton(jBGuar);
        
        jTAlmaG.setVisible(false);
        jCMostrarXml.setVisible(false);
        
        jTab.getTableHeader().setReorderingAllowed(false);
        
        jTADescrip.setFocusTraversalKeys(java.awt.KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, null);
        jTADescrip.setFocusTraversalKeys(java.awt.KeyboardFocusManager.BACKWARD_TRAVERSAL_KEYS, null);
        
        jTAInfor.setFocusTraversalKeys(java.awt.KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, null);
        jTAInfor.setFocusTraversalKeys(java.awt.KeyboardFocusManager.BACKWARD_TRAVERSAL_KEYS, null);
        
        jTab.getColumnModel().getColumn(0).setPreferredWidth(30);
        jTab.getColumnModel().getColumn(1).setPreferredWidth(190);
        jTab.getColumnModel().getColumn(2).setPreferredWidth(300);        

        jTab.setFocusTraversalKeys(java.awt.KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, null);
        jTab.setFocusTraversalKeys(java.awt.KeyboardFocusManager.BACKWARD_TRAVERSAL_KEYS, null);

        TableRowSorter trs = new TableRowSorter<>((DefaultTableModel)jTab.getModel());
        jTab.setRowSorter(trs);
        trs.setSortsOnUpdates(true);
        
        jLImg.setVisible(false);

        jBGuar.setEnabled(false);
        
        jComLin.setSelectedItem("");        
        jComMeds.setSelectedItem("");
        jComUni.setSelectedItem("");
        jComUAd.setSelectedItem("");
    }

    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jP1 = new javax.swing.JPanel();
        jTProd = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jBNew = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jComUni = new javax.swing.JComboBox();
        jComMeds = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTADescrip = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTAInfor = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();
        jTMax = new javax.swing.JTextField();
        jTMin = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTab = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jBGuar = new javax.swing.JButton();
        jBDel = new javax.swing.JButton();
        jBLim = new javax.swing.JButton();
        jTMeds = new javax.swing.JTextField();
        jTMedMan = new javax.swing.JTextField();
        jTExist = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTUnid = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jComAna = new javax.swing.JComboBox();
        jTAnaq = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jComLug = new javax.swing.JComboBox();
        jTLug = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jComUAd = new javax.swing.JComboBox();
        jTUbi = new javax.swing.JTextField();
        jCInvent = new javax.swing.JCheckBox();
        jLabel25 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jBCargImg = new javax.swing.JButton();
        jBDelImg = new javax.swing.JButton();
        jBBusc = new javax.swing.JButton();
        jTBusc = new javax.swing.JTextField();
        jBMosT = new javax.swing.JButton();
        jCComp = new javax.swing.JCheckBox();
        jBComps = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        jBProd = new javax.swing.JButton();
        jBGen = new javax.swing.JButton();
        jTCodProv = new javax.swing.JTextField();
        jBBusc2 = new javax.swing.JButton();
        jCEsParaVent = new javax.swing.JCheckBox();
        jLabel33 = new javax.swing.JLabel();
        jTNom = new javax.swing.JTextField();
        jComImp = new javax.swing.JComboBox();
        jBCargF = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jBDelF = new javax.swing.JButton();
        jBFTec = new javax.swing.JButton();
        jCNoSolMaxMin = new javax.swing.JCheckBox();
        jCBajCost = new javax.swing.JCheckBox();
        jBPrec = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        jBTab1 = new javax.swing.JButton();
        jBTod = new javax.swing.JButton();
        jCServ = new javax.swing.JCheckBox();
        jTImpueVal = new javax.swing.JTextField();
        jBVeGran = new javax.swing.JButton();
        jSImg = new javax.swing.JScrollPane();
        jPanImg = new javax.swing.JPanel();
        jLImg = new javax.swing.JLabel();
        jTAlmaG = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jBCompa = new javax.swing.JButton();
        jBPart = new javax.swing.JButton();
        jLabel47 = new javax.swing.JLabel();
        jBGranDescrip = new javax.swing.JButton();
        jBMasSer = new javax.swing.JButton();
        jBConsec = new javax.swing.JButton();
        jBConsecU = new javax.swing.JButton();
        jRPEPS = new javax.swing.JRadioButton();
        jRUEPS = new javax.swing.JRadioButton();
        jRUltCost = new javax.swing.JRadioButton();
        jRProm = new javax.swing.JRadioButton();
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
        jComLin = new javax.swing.JComboBox<String>();
        jTLin = new javax.swing.JTextField();
        jCMostrarXml = new javax.swing.JCheckBox();

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
        jTProd.setNextFocusableComponent(jBProd);
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
        jP1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 50, -1));

        jComUni.setNextFocusableComponent(jComImp);
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
        jP1.add(jComUni, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 120, 20));

        jComMeds.setNextFocusableComponent(jTMedMan);
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
        jP1.add(jComMeds, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 120, 20));

        jTADescrip.setColumns(20);
        jTADescrip.setLineWrap(true);
        jTADescrip.setRows(5);
        jTADescrip.setToolTipText("Esta descripción se utiliza en el punto de venta");
        jTADescrip.setBorder(null);
        jTADescrip.setNextFocusableComponent(jBPart);
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

        jP1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 280, 70));

        jLabel8.setText("Medida:");
        jP1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        jTAInfor.setColumns(20);
        jTAInfor.setLineWrap(true);
        jTAInfor.setRows(5);
        jTAInfor.setBorder(null);
        jTAInfor.setNextFocusableComponent(jTMin);
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

        jP1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 280, 60));

        jLabel15.setText("Información:");
        jP1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 110, -1));

        jTMax.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTMax.setText("2");
        jTMax.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTMax.setNextFocusableComponent(jTCodProv);
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
        jP1.add(jTMax, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 440, 120, 20));

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
        jP1.add(jTMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 440, 80, 20));

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
        jTab.setGridColor(new java.awt.Color(255, 255, 255));
        jTab.setNextFocusableComponent(jBBusc);
        jTab.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        jTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabMouseClicked(evt);
            }
        });
        jTab.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTabKeyPressed(evt);
            }
        });
        jScrollPane3.setViewportView(jTab);
        if (jTab.getColumnModel().getColumnCount() > 0) {
            jTab.getColumnModel().getColumn(2).setMinWidth(480);
            jTab.getColumnModel().getColumn(2).setPreferredWidth(480);
        }

        jP1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 720, 150));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Productos:");
        jP1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 100, -1));

        jBGuar.setBackground(new java.awt.Color(255, 255, 255));
        jBGuar.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBGuar.setForeground(new java.awt.Color(0, 102, 0));
        jBGuar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/save.png"))); // NOI18N
        jBGuar.setText("Guardar");
        jBGuar.setToolTipText("Guardar cambios (Ctrl+G)");
        jBGuar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
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
        jBDel.setNextFocusableComponent(jBLim);
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

        jTMeds.setEditable(false);
        jTMeds.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jTMeds.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTMeds.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTMeds.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTMedsFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTMedsFocusLost(evt);
            }
        });
        jTMeds.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTMedsKeyPressed(evt);
            }
        });
        jP1.add(jTMeds, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 110, 20));

        jTMedMan.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTMedMan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTMedMan.setNextFocusableComponent(jComUni);
        jTMedMan.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTMedManFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTMedManFocusLost(evt);
            }
        });
        jTMedMan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTMedManKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTMedManKeyTyped(evt);
            }
        });
        jP1.add(jTMedMan, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, 50, 20));

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
        jP1.add(jTExist, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 610, 80, -1));

        jLabel18.setText("Impuesto:");
        jP1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 90, -1));

        jTUnid.setEditable(false);
        jTUnid.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jTUnid.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTUnid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
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
        jP1.add(jTUnid, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, 110, 20));

        jPanel2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPanel2KeyPressed(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel2.add(jComAna, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 120, 20));

        jTAnaq.setEditable(false);
        jTAnaq.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jTAnaq.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTAnaq.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTAnaqFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTAnaqFocusLost(evt);
            }
        });
        jTAnaq.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTAnaqKeyPressed(evt);
            }
        });
        jPanel2.add(jTAnaq, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 130, 20));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel23.setText("Anaquel:");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 60, -1));

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel28.setText("Ubicación Adicional:");
        jPanel2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 110, -1));

        jComLug.setNextFocusableComponent(jComUAd);
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
        jPanel2.add(jComLug, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 120, 20));

        jTLug.setEditable(false);
        jTLug.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jTLug.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTLug.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTLugFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTLugFocusLost(evt);
            }
        });
        jTLug.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTLugKeyPressed(evt);
            }
        });
        jPanel2.add(jTLug, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 130, 20));

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel37.setText("Lugar:");
        jPanel2.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 60, -1));

        jComUAd.setName(""); // NOI18N
        jComUAd.setNextFocusableComponent(jBComps);
        jComUAd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jComUAdFocusLost(evt);
            }
        });
        jComUAd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComUAdActionPerformed(evt);
            }
        });
        jComUAd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComUAdKeyPressed(evt);
            }
        });
        jPanel2.add(jComUAd, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 120, 20));

        jTUbi.setEditable(false);
        jTUbi.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jTUbi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTUbi.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTUbiFocusLost(evt);
            }
        });
        jPanel2.add(jTUbi, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 130, 20));

        jP1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 490, 430, 80));

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
        jP1.add(jCInvent, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, 110, -1));

        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel25.setText("*Máximo:");
        jP1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 440, 60, -1));

        jLabel29.setText("*Mínimo:");
        jP1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 60, -1));

        jLabel30.setText("Num.Partes, Compatibilidades  y Series:");
        jP1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 240, -1));

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
        jP1.add(jBCargImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 460, -1, -1));

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
        jP1.add(jBDelImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 460, 59, -1));

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
        jP1.add(jBBusc, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, 130, 19));

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
        jP1.add(jTBusc, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 230, 180, -1));

        jBMosT.setBackground(new java.awt.Color(255, 255, 255));
        jBMosT.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBMosT.setForeground(new java.awt.Color(0, 102, 0));
        jBMosT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/mostt.png"))); // NOI18N
        jBMosT.setText("Mostrar F4");
        jBMosT.setNextFocusableComponent(jTab);
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
        jP1.add(jBMosT, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 230, 120, 19));

        jCComp.setBackground(new java.awt.Color(255, 255, 255));
        jCComp.setText("Kit");
        jCComp.setNextFocusableComponent(jCPed);
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
        jP1.add(jCComp, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, 50, -1));

        jBComps.setBackground(new java.awt.Color(255, 255, 255));
        jBComps.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBComps.setText("Componentes");
        jBComps.setToolTipText("Agrega los componentes del kit");
        jBComps.setEnabled(false);
        jBComps.setNextFocusableComponent(jTExist);
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
        jP1.add(jBComps, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 570, 110, 20));

        jLabel35.setText("Costos:");
        jP1.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 460, 90, 20));

        jBProd.setBackground(new java.awt.Color(255, 255, 255));
        jBProd.setText("...");
        jBProd.setToolTipText("Buscar Producto(s)");
        jBProd.setNextFocusableComponent(jBConsec);
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
        jP1.add(jBProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 30, 20));

        jBGen.setBackground(new java.awt.Color(255, 255, 255));
        jBGen.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBGen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/gen.png"))); // NOI18N
        jBGen.setText(" F10");
        jBGen.setToolTipText("Generar aleatoriamente un código de producto");
        jBGen.setNextFocusableComponent(jTNom);
        jBGen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBGenMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBGenMouseExited(evt);
            }
        });
        jBGen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGenActionPerformed(evt);
            }
        });
        jBGen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBGenKeyPressed(evt);
            }
        });
        jP1.add(jBGen, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 90, 20));

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
        jP1.add(jTCodProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 460, 90, 20));

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
        jP1.add(jBBusc2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 460, 30, 20));

        jCEsParaVent.setBackground(new java.awt.Color(255, 255, 255));
        jCEsParaVent.setSelected(true);
        jCEsParaVent.setText("Es para venta");
        jCEsParaVent.setNextFocusableComponent(jCNoSolMaxMin);
        jCEsParaVent.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jCEsParaVentKeyPressed(evt);
            }
        });
        jP1.add(jCEsParaVent, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 120, -1));

        jLabel33.setText("Descripción:");
        jP1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 100, -1));

        jTNom.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTNom.setNextFocusableComponent(jTADescrip);
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
        jP1.add(jTNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 370, 20));

        jComImp.setNextFocusableComponent(jTAInfor);
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
        jP1.add(jComImp, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 120, 20));

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
        jP1.add(jBCargF, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 600, -1, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Ficha Técnica:");
        jP1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 580, 110, -1));

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
        jP1.add(jBDelF, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 600, -1, 20));

        jBFTec.setBackground(new java.awt.Color(255, 255, 255));
        jBFTec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/img.png"))); // NOI18N
        jBFTec.setToolTipText("Ver Ficha Técnica Completa");
        jBFTec.setNextFocusableComponent(jBGuar);
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
        jP1.add(jBFTec, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 600, 30, 20));

        jCNoSolMaxMin.setBackground(new java.awt.Color(255, 255, 255));
        jCNoSolMaxMin.setText("No solicitar MN");
        jCNoSolMaxMin.setToolTipText("No solicitar Máximos y Mínimos");
        jCNoSolMaxMin.setNextFocusableComponent(jCBajCost);
        jCNoSolMaxMin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jCNoSolMaxMinKeyPressed(evt);
            }
        });
        jP1.add(jCNoSolMaxMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 120, -1));

        jCBajCost.setBackground(new java.awt.Color(255, 255, 255));
        jCBajCost.setText("Permitir vender abajo del costo");
        jCBajCost.setToolTipText("Vender abajo del Costo");
        jCBajCost.setNextFocusableComponent(jCServ);
        jP1.add(jCBajCost, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 210, 20));

        jBPrec.setBackground(new java.awt.Color(255, 255, 255));
        jBPrec.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBPrec.setText("$");
        jBPrec.setToolTipText("");
        jBPrec.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jBPrec.setNextFocusableComponent(jRPEPS);
        jBPrec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBPrecMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBPrecMouseExited(evt);
            }
        });
        jBPrec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPrecActionPerformed(evt);
            }
        });
        jBPrec.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBPrecKeyPressed(evt);
            }
        });
        jP1.add(jBPrec, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 480, 60, 20));

        jLabel36.setText("*Unidad:");
        jP1.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

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
        jP1.add(jBTab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 10, 20, 20));

        jBTod.setBackground(new java.awt.Color(255, 255, 255));
        jBTod.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jBTod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/marct.png"))); // NOI18N
        jBTod.setText("Marcar todo");
        jBTod.setToolTipText("Marcar Todos los Registros de la Tabla (Alt+T)");
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
        jP1.add(jBTod, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 30, 130, 18));

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
        jP1.add(jCServ, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, 110, -1));

        jTImpueVal.setEditable(false);
        jTImpueVal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTImpueVal.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTImpueValFocusLost(evt);
            }
        });
        jP1.add(jTImpueVal, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, 70, 20));

        jBVeGran.setBackground(new java.awt.Color(255, 255, 255));
        jBVeGran.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/img.png"))); // NOI18N
        jBVeGran.setToolTipText("Ver imágen  de producto completa");
        jBVeGran.setName(""); // NOI18N
        jBVeGran.setNextFocusableComponent(jComAna);
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
        jP1.add(jBVeGran, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 460, 30, 20));

        jSImg.setNextFocusableComponent(jBCargImg);

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

        javax.swing.GroupLayout jPanImgLayout = new javax.swing.GroupLayout(jPanImg);
        jPanImg.setLayout(jPanImgLayout);
        jPanImgLayout.setHorizontalGroup(
            jPanImgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanImgLayout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addComponent(jLImg)
                .addGap(0, 227, Short.MAX_VALUE))
        );
        jPanImgLayout.setVerticalGroup(
            jPanImgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanImgLayout.createSequentialGroup()
                .addComponent(jLImg)
                .addContainerGap(251, Short.MAX_VALUE))
        );

        jSImg.setViewportView(jPanImg);

        jP1.add(jSImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, 430, 200));

        jTAlmaG.setEditable(false);
        jTAlmaG.setFocusable(false);
        jP1.add(jTAlmaG, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 80, -1));

        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel44.setText("Proveedor:");
        jP1.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 460, 70, -1));

        jBCompa.setBackground(new java.awt.Color(255, 255, 255));
        jBCompa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/compa.png"))); // NOI18N
        jBCompa.setToolTipText("Ver las compatibilidades del producto");
        jBCompa.setName(""); // NOI18N
        jBCompa.setNextFocusableComponent(jBMasSer);
        jBCompa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBCompaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBCompaMouseExited(evt);
            }
        });
        jBCompa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCompaActionPerformed(evt);
            }
        });
        jBCompa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBCompaKeyPressed(evt);
            }
        });
        jP1.add(jBCompa, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, 60, 20));

        jBPart.setBackground(new java.awt.Color(255, 255, 255));
        jBPart.setText("+");
        jBPart.setToolTipText("Asociar números de partes");
        jBPart.setNextFocusableComponent(jBCompa);
        jBPart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPartActionPerformed(evt);
            }
        });
        jBPart.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBPartKeyPressed(evt);
            }
        });
        jP1.add(jBPart, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 50, 20));

        jLabel47.setText("Existencia general:");
        jP1.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 590, 140, -1));

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
        jP1.add(jBGranDescrip, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, 10, 20));

        jBMasSer.setBackground(new java.awt.Color(255, 255, 255));
        jBMasSer.setText("+");
        jBMasSer.setToolTipText("Ver las series del producto");
        jBMasSer.setNextFocusableComponent(jComLin);
        jBMasSer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBMasSerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBMasSerMouseExited(evt);
            }
        });
        jBMasSer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMasSerActionPerformed(evt);
            }
        });
        jBMasSer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBMasSerKeyPressed(evt);
            }
        });
        jP1.add(jBMasSer, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, 50, 20));

        jBConsec.setBackground(new java.awt.Color(255, 255, 255));
        jBConsec.setToolTipText("Obtiene el primer consecutivo del código");
        jBConsec.setNextFocusableComponent(jBConsecU);
        jBConsec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBConsecMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBConsecMouseExited(evt);
            }
        });
        jBConsec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConsecActionPerformed(evt);
            }
        });
        jBConsec.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBConsecKeyPressed(evt);
            }
        });
        jP1.add(jBConsec, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 10, 20));

        jBConsecU.setBackground(new java.awt.Color(255, 255, 255));
        jBConsecU.setToolTipText("Obtiene el último consecutivo del código");
        jBConsecU.setNextFocusableComponent(jBGen);
        jBConsecU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBConsecUMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBConsecUMouseExited(evt);
            }
        });
        jBConsecU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConsecUActionPerformed(evt);
            }
        });
        jBConsecU.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBConsecUKeyPressed(evt);
            }
        });
        jP1.add(jBConsecU, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 10, 20));

        jRPEPS.setBackground(new java.awt.Color(255, 255, 255));
        jRPEPS.setText("PEPS");
        jRPEPS.setNextFocusableComponent(jRUEPS);
        jRPEPS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jRPEPSKeyPressed(evt);
            }
        });
        jP1.add(jRPEPS, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 610, 70, -1));

        jRUEPS.setBackground(new java.awt.Color(255, 255, 255));
        jRUEPS.setText("UEPS");
        jRUEPS.setNextFocusableComponent(jRUltCost);
        jRUEPS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jRUEPSKeyPressed(evt);
            }
        });
        jP1.add(jRUEPS, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 610, 70, -1));

        jRUltCost.setBackground(new java.awt.Color(255, 255, 255));
        jRUltCost.setSelected(true);
        jRUltCost.setText("Ult.Costo");
        jRUltCost.setNextFocusableComponent(jRProm);
        jRUltCost.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jRUltCostKeyPressed(evt);
            }
        });
        jP1.add(jRUltCost, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 610, 90, -1));

        jRProm.setBackground(new java.awt.Color(255, 255, 255));
        jRProm.setText("Promedio");
        jRProm.setNextFocusableComponent(jBCargImg);
        jRProm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jRPromKeyPressed(evt);
            }
        });
        jP1.add(jRProm, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 610, 100, -1));

        jBExisAlma.setBackground(new java.awt.Color(255, 255, 255));
        jBExisAlma.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBExisAlma.setForeground(new java.awt.Color(0, 102, 0));
        jBExisAlma.setText("Exist. almacenes");
        jBExisAlma.setToolTipText("Existencias del producto por almacén");
        jBExisAlma.setNextFocusableComponent(jBCargF);
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
        jP1.add(jBExisAlma, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 610, 130, 20));

        jCPed.setBackground(new java.awt.Color(255, 255, 255));
        jCPed.setText("Pedimento");
        jCPed.setToolTipText("Manejar lote y pedimento para el producto");
        jCPed.setNextFocusableComponent(jCNoSer);
        jCPed.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jCPedKeyPressed(evt);
            }
        });
        jP1.add(jCPed, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 583, 100, 20));

        jCNoSer.setBackground(new java.awt.Color(255, 255, 255));
        jCNoSer.setText("No. serie");
        jCNoSer.setNextFocusableComponent(jBPrec);
        jCNoSer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jCNoSerKeyPressed(evt);
            }
        });
        jP1.add(jCNoSer, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 600, 80, 30));

        jBLim1.setBackground(new java.awt.Color(255, 255, 255));
        jBLim1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBLim1.setForeground(new java.awt.Color(0, 102, 0));
        jBLim1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Activado-135x35px.png"))); // NOI18N
        jBLim1.setToolTipText("Abrir scaner");
        jBLim1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBLim1.setNextFocusableComponent(jBSal);
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
        button_impuestos.setText("+");
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
        jP1.add(button_impuestos, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 350, -1, 20));

        jLClaveSat.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLClaveSat.setText("*Clave SAT:");
        jP1.add(jLClaveSat, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 480, 70, -1));

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
        jP1.add(jTClaveSat, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 480, 90, 20));

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
        jP1.add(jBClaveSat, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 480, 30, 20));

        jBSal.setBackground(new java.awt.Color(255, 255, 255));
        jBSal.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBSal.setForeground(new java.awt.Color(0, 102, 0));
        jBSal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/sal.png"))); // NOI18N
        jBSal.setText("Salir");
        jBSal.setToolTipText("Salir (ESC)");
        jBSal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBSal.setNextFocusableComponent(jTProd);
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
        jP1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        jComLin.setNextFocusableComponent(jTLin);
        jP1.add(jComLin, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 120, -1));

        jTLin.setNextFocusableComponent(jComMeds);
        jP1.add(jTLin, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, 110, -1));

        jCMostrarXml.setBackground(new java.awt.Color(255, 255, 255));
        jCMostrarXml.setText("Mostrar componentes en XML");
        jP1.add(jCMostrarXml, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 560, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

        
    private void jTMedsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTMedsKeyPressed

    
    }//GEN-LAST:event_jTMedsKeyPressed
    
    
    private void jTMedsFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTMedsFocusGained

    
    }//GEN-LAST:event_jTMedsFocusGained

            
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

        
    private void jTMedManFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTMedManFocusGained
        
        
    }//GEN-LAST:event_jTMedManFocusGained

        
    private void jTMedManKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTMedManKeyPressed
        
        
    }//GEN-LAST:event_jTMedManKeyPressed

        
    private void jTMedManFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTMedManFocusLost
    
        
    }//GEN-LAST:event_jTMedManFocusLost

        
    private void jTMedManKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTMedManKeyTyped
        
        
    }//GEN-LAST:event_jTMedManKeyTyped
    
        
    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        
    
        
    }//GEN-LAST:event_formWindowGainedFocus
        
        
    private void jComMedsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComMedsActionPerformed
            
        
    }//GEN-LAST:event_jComMedsActionPerformed
        
    
    private void jTUnidFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTUnidFocusGained
        
        
    }//GEN-LAST:event_jTUnidFocusGained

        
    private void jTUnidKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTUnidKeyPressed
        
        
    }//GEN-LAST:event_jTUnidKeyPressed

        
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
                                            
                
    private void jPanel2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel2KeyPressed
                
        
    }//GEN-LAST:event_jPanel2KeyPressed

        
    private void jTAnaqFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTAnaqFocusGained
               
        
    }//GEN-LAST:event_jTAnaqFocusGained

        
    private void jTAnaqKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTAnaqKeyPressed
        
        
    }//GEN-LAST:event_jTAnaqKeyPressed

        
    private void jComAnaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComAnaActionPerformed
        
    
                
    }//GEN-LAST:event_jComAnaActionPerformed

    
    
    private void jComAnaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComAnaKeyPressed
        
        
    }//GEN-LAST:event_jComAnaKeyPressed

    
    
    private void jComLugKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComLugKeyPressed
        
        
    }//GEN-LAST:event_jComLugKeyPressed

        
    private void jTLugKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTLugKeyPressed
        
        
    }//GEN-LAST:event_jTLugKeyPressed

        
    private void jTLugFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTLugFocusGained
        
        
    }//GEN-LAST:event_jTLugFocusGained

        
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
                
        
    private void jBProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBProdActionPerformed
    
                        
    }//GEN-LAST:event_jBProdActionPerformed

    
    private void jBProdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBProdKeyPressed

        
    }//GEN-LAST:event_jBProdKeyPressed

        
    private void jBGenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGenActionPerformed
            
                
    }//GEN-LAST:event_jBGenActionPerformed

        
    private void jBGenKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBGenKeyPressed
        
            
    }//GEN-LAST:event_jBGenKeyPressed
           
            
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

       
    private void jComImpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComImpKeyPressed
        
        
    }//GEN-LAST:event_jComImpKeyPressed

    
        
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

        
    private void jBPrecKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBPrecKeyPressed
        
        
    }//GEN-LAST:event_jBPrecKeyPressed

       
    private void jBPrecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPrecActionPerformed
    
        
    }//GEN-LAST:event_jBPrecActionPerformed
        
   
    private void formMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_formMouseWheelMoved
        
        
    }//GEN-LAST:event_formMouseWheelMoved

       
    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        
        
    }//GEN-LAST:event_formMouseDragged

        
    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        
        
    }//GEN-LAST:event_formMouseMoved

    
    private void jComUAdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComUAdKeyPressed
        
        
    }//GEN-LAST:event_jComUAdKeyPressed
        
    
   
    private void jBTab1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTab1ActionPerformed

   
    }//GEN-LAST:event_jBTab1ActionPerformed

     
    private void jBTab1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBTab1KeyPressed

    
    }//GEN-LAST:event_jBTab1KeyPressed

        
    private void jComUAdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComUAdActionPerformed
            
                
    }//GEN-LAST:event_jComUAdActionPerformed

        
    private void jBBuscMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBBuscMouseEntered
            
        
    }//GEN-LAST:event_jBBuscMouseEntered

    
    private void jBBuscMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBBuscMouseExited
            
        
    }//GEN-LAST:event_jBBuscMouseExited

    
                
    private void jBTodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTodActionPerformed
    

    }//GEN-LAST:event_jBTodActionPerformed

    
    private void jBTodKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBTodKeyPressed

    
    }//GEN-LAST:event_jBTodKeyPressed

        
    private void jCServKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCServKeyPressed
        
        
    }//GEN-LAST:event_jCServKeyPressed

        
    private void jCServActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCServActionPerformed
            
        
    }//GEN-LAST:event_jCServActionPerformed

        
    private void jComImpFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComImpFocusLost
        
    
    }//GEN-LAST:event_jComImpFocusLost

    
        
    private void jComAnaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComAnaFocusLost
        
        
    }//GEN-LAST:event_jComAnaFocusLost

        
    private void jComLugFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComLugFocusLost
        
    
    }//GEN-LAST:event_jComLugFocusLost

        
    private void jComUAdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComUAdFocusLost
            
        
    }//GEN-LAST:event_jComUAdFocusLost

        
    private void jComImpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComImpActionPerformed
            
        
    }//GEN-LAST:event_jComImpActionPerformed

    
        
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

    
    private void jBProdMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBProdMouseEntered
        
        
    }//GEN-LAST:event_jBProdMouseEntered

    
    private void jBGenMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBGenMouseEntered
        
        
    }//GEN-LAST:event_jBGenMouseEntered

    
    private void jBPrecMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBPrecMouseEntered
        
        
    }//GEN-LAST:event_jBPrecMouseEntered

    
    private void jBBusc2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBBusc2MouseEntered
            
        
    }//GEN-LAST:event_jBBusc2MouseEntered

    
    
    private void jBMosTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBMosTMouseEntered
        
        
    }//GEN-LAST:event_jBMosTMouseEntered

        
    private void jBTodMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBTodMouseEntered
        
        
    }//GEN-LAST:event_jBTodMouseEntered

        
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

      
    private void jBProdMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBProdMouseExited
        
        
    }//GEN-LAST:event_jBProdMouseExited

        
    private void jBGenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBGenMouseExited
        
        
    }//GEN-LAST:event_jBGenMouseExited

        
    private void jBPrecMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBPrecMouseExited
        
        
    }//GEN-LAST:event_jBPrecMouseExited

        
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

    
        
    private void jTMedsFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTMedsFocusLost
        
        
    }//GEN-LAST:event_jTMedsFocusLost

    
    private void jTUnidFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTUnidFocusLost
        
        
    }//GEN-LAST:event_jTUnidFocusLost

        
    private void jTImpueValFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTImpueValFocusLost
        
        
    }//GEN-LAST:event_jTImpueValFocusLost

    
       
    private void jTAnaqFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTAnaqFocusLost
        
        
    }//GEN-LAST:event_jTAnaqFocusLost

        
    private void jTLugFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTLugFocusLost
        
        
    }//GEN-LAST:event_jTLugFocusLost

       
    private void jTUbiFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTUbiFocusLost
        
        
    }//GEN-LAST:event_jTUbiFocusLost
            
        
    private void jBCompaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBCompaKeyPressed
        
    
        
    }//GEN-LAST:event_jBCompaKeyPressed

        
    private void jBCompaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCompaActionPerformed
        
       
       
    }//GEN-LAST:event_jBCompaActionPerformed

    
    
    private void jBCompaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBCompaMouseEntered
        
        
    }//GEN-LAST:event_jBCompaMouseEntered

    
    private void jBCompaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBCompaMouseExited
        
        
    }//GEN-LAST:event_jBCompaMouseExited

        
    private void jBPartKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBPartKeyPressed
        
        
    }//GEN-LAST:event_jBPartKeyPressed

        
    private void jBPartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPartActionPerformed
        
        
    }//GEN-LAST:event_jBPartActionPerformed
    
    
    
    private void jBGranDescripActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGranDescripActionPerformed

        
    }//GEN-LAST:event_jBGranDescripActionPerformed

        
    private void jBGranDescripKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBGranDescripKeyPressed

    
    }//GEN-LAST:event_jBGranDescripKeyPressed

    
           
    private void jBMasSerKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBMasSerKeyPressed
        
        
    }//GEN-LAST:event_jBMasSerKeyPressed

       
    private void jBMasSerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBMasSerMouseEntered
        
        
    }//GEN-LAST:event_jBMasSerMouseEntered

        
    private void jBMasSerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBMasSerMouseExited
        
                
    }//GEN-LAST:event_jBMasSerMouseExited

        
    private void jBMasSerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMasSerActionPerformed
        
        
    }//GEN-LAST:event_jBMasSerActionPerformed

    
    
    
    
    
    
    
        
    private void jBConsecKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBConsecKeyPressed
        
        
    }//GEN-LAST:event_jBConsecKeyPressed

        
    private void jBConsecMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBConsecMouseEntered
        
        
    }//GEN-LAST:event_jBConsecMouseEntered

        
    private void jBConsecMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBConsecMouseExited
        
        
    }//GEN-LAST:event_jBConsecMouseExited

        
    private void jBConsecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConsecActionPerformed
        
    
        
    }//GEN-LAST:event_jBConsecActionPerformed

        
    private void jBTodMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBTodMouseExited
        
        
    }//GEN-LAST:event_jBTodMouseExited

        
    private void jBConsecUMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBConsecUMouseEntered
            
        
    }//GEN-LAST:event_jBConsecUMouseEntered

       
    private void jBConsecUMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBConsecUMouseExited
        
        
    }//GEN-LAST:event_jBConsecUMouseExited

        
    private void jBConsecUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConsecUActionPerformed
            
        
    }//GEN-LAST:event_jBConsecUActionPerformed

        
    private void jBConsecUKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBConsecUKeyPressed
        
        
    }//GEN-LAST:event_jBConsecUKeyPressed

       
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        
    
        
    }//GEN-LAST:event_formWindowActivated

    
    private void jRPEPSKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jRPEPSKeyPressed

    
    }//GEN-LAST:event_jRPEPSKeyPressed

    
    private void jRUEPSKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jRUEPSKeyPressed

    
    }//GEN-LAST:event_jRUEPSKeyPressed

       
    private void jRUltCostKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jRUltCostKeyPressed

    
    }//GEN-LAST:event_jRUltCostKeyPressed

    
   
    private void jRPromKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jRPromKeyPressed


    }//GEN-LAST:event_jRPromKeyPressed


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
  
            
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_impuestos;
    private javax.swing.JButton jBBusc;
    private javax.swing.JButton jBBusc2;
    private javax.swing.JButton jBCargF;
    private javax.swing.JButton jBCargImg;
    private javax.swing.JButton jBClaveSat;
    private javax.swing.JButton jBCompa;
    private javax.swing.JButton jBComps;
    private javax.swing.JButton jBConsec;
    private javax.swing.JButton jBConsecU;
    private javax.swing.JButton jBDel;
    private javax.swing.JButton jBDelF;
    private javax.swing.JButton jBDelImg;
    private javax.swing.JButton jBExisAlma;
    private javax.swing.JButton jBFTec;
    private javax.swing.JButton jBGen;
    private javax.swing.JButton jBGranDescrip;
    private javax.swing.JButton jBGuar;
    private javax.swing.JButton jBLim;
    public javax.swing.JButton jBLim1;
    private javax.swing.JButton jBMasSer;
    private javax.swing.JButton jBMosT;
    private javax.swing.JButton jBNew;
    private javax.swing.JButton jBPart;
    private javax.swing.JButton jBPrec;
    private javax.swing.JButton jBProd;
    private javax.swing.JButton jBSal;
    private javax.swing.JButton jBTab1;
    private javax.swing.JButton jBTod;
    private javax.swing.JButton jBVeGran;
    private javax.swing.JCheckBox jCBajCost;
    private javax.swing.JCheckBox jCComp;
    private javax.swing.JCheckBox jCEsParaVent;
    private javax.swing.JCheckBox jCInvent;
    private javax.swing.JCheckBox jCMostrarXml;
    private javax.swing.JCheckBox jCNoSer;
    private javax.swing.JCheckBox jCNoSolMaxMin;
    private javax.swing.JCheckBox jCPed;
    private javax.swing.JCheckBox jCServ;
    private javax.swing.JComboBox jComAna;
    private javax.swing.JComboBox jComImp;
    private javax.swing.JComboBox<String> jComLin;
    private javax.swing.JComboBox jComLug;
    private javax.swing.JComboBox jComMeds;
    private javax.swing.JComboBox jComUAd;
    private javax.swing.JComboBox jComUni;
    private javax.swing.JLabel jLClaveSat;
    private javax.swing.JLabel jLImg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jP1;
    private javax.swing.JPanel jPanImg;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRPEPS;
    private javax.swing.JRadioButton jRProm;
    private javax.swing.JRadioButton jRUEPS;
    private javax.swing.JRadioButton jRUltCost;
    private javax.swing.JScrollPane jSImg;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTADescrip;
    private javax.swing.JTextArea jTAInfor;
    private javax.swing.JTextField jTAlmaG;
    private javax.swing.JTextField jTAnaq;
    private javax.swing.JTextField jTBusc;
    private javax.swing.JTextField jTClaveSat;
    private javax.swing.JTextField jTCodProv;
    private javax.swing.JTextField jTExist;
    private javax.swing.JTextField jTImpueVal;
    private javax.swing.JTextField jTLin;
    private javax.swing.JTextField jTLug;
    private javax.swing.JTextField jTMax;
    private javax.swing.JTextField jTMedMan;
    private javax.swing.JTextField jTMeds;
    private javax.swing.JTextField jTMin;
    private javax.swing.JTextField jTNom;
    private javax.swing.JTextField jTProd;
    private javax.swing.JTextField jTUbi;
    private javax.swing.JTextField jTUnid;
    private javax.swing.JTable jTab;
    // End of variables declaration//GEN-END:variables

}/*Fin de public class NuevoCliente extends javax.swing.JFrame */
