package com.era.views;


public class CobroJFrame extends BaseJFrame
{
    public CobroJFrame(final String idTextTitleWindow) 
    {             
        super(idTextTitleWindow);
        
        initComponents();
        
        this.getRootPane().setDefaultButton(jBCob);
        
        jTEfeCant.grabFocus();                
        
        jTAObserv.setFocusTraversalKeys(java.awt.KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, null);
        jTAObserv.setFocusTraversalKeys(java.awt.KeyboardFocusManager.BACKWARD_TRAVERSAL_KEYS, null);
        
        jTSald.setText("$0.00");
        
        jTCamb.setText("$0.00");
    }
        
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jP1 = new javax.swing.JPanel();
        jBCob = new javax.swing.JButton();
        jBSal = new javax.swing.JButton();
        jTTot = new javax.swing.JTextField();
        jTEfe = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTEfeDescrip = new javax.swing.JTextField();
        jTEfeCant = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTCamb = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTSald = new javax.swing.JTextField();
        jTDebDescrip = new javax.swing.JTextField();
        jTDeb = new javax.swing.JTextField();
        jTDebCant = new javax.swing.JTextField();
        jTTar = new javax.swing.JTextField();
        jTTarDescrip = new javax.swing.JTextField();
        jTTarCredCant = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTAObserv = new javax.swing.JTextArea();
        jRTic = new javax.swing.JRadioButton();
        jRRem = new javax.swing.JRadioButton();
        jRFac = new javax.swing.JRadioButton();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jRNot = new javax.swing.JRadioButton();
        jLabel34 = new javax.swing.JLabel();
        jRNoPag = new javax.swing.JRadioButton();
        jRPagad = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jTVend = new javax.swing.JTextField();
        jBVend = new javax.swing.JButton();
        jTActivo = new javax.swing.JTextField();
        jBActivo = new javax.swing.JButton();
        jTSubramo = new javax.swing.JTextField();
        jBSubramo = new javax.swing.JButton();
        jTSector = new javax.swing.JTextField();
        jBSector = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setAlwaysOnTop(true);
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

        jBCob.setBackground(new java.awt.Color(255, 255, 255));
        jBCob.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBCob.setForeground(new java.awt.Color(0, 102, 0));
        jBCob.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/cobra.png"))); // NOI18N
        jBCob.setText("COBRAR");
        jBCob.setToolTipText("Cobrar Venta (F10)");
        jBCob.setNextFocusableComponent(jBCob);
        jBCob.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBCobMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBCobMouseExited(evt);
            }
        });
        jBCob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCobActionPerformed(evt);
            }
        });
        jBCob.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBCobKeyPressed(evt);
            }
        });
        jP1.add(jBCob, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 120, 50));

        jBSal.setBackground(new java.awt.Color(255, 255, 255));
        jBSal.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBSal.setForeground(new java.awt.Color(0, 102, 0));
        jBSal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/sal.png"))); // NOI18N
        jBSal.setText("Salir");
        jBSal.setToolTipText("Salir (ESC)");
        jBSal.setNextFocusableComponent(jTEfeCant);
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
        jP1.add(jBSal, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, 120, 50));

        jTTot.setEditable(false);
        jTTot.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jTTot.setForeground(new java.awt.Color(0, 0, 255));
        jTTot.setNextFocusableComponent(jBCob);
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
        jP1.add(jTTot, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 150, 30));

        jTEfe.setEditable(false);
        jTEfe.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTEfe.setText("EFE");
        jTEfe.setFocusable(false);
        jTEfe.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTEfeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTEfeFocusLost(evt);
            }
        });
        jTEfe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTEfeKeyPressed(evt);
            }
        });
        jP1.add(jTEfe, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 110, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("PAGO 1:");
        jP1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 120, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Observaciones:");
        jP1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 260, -1));

        jTEfeDescrip.setEditable(false);
        jTEfeDescrip.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTEfeDescrip.setText("EFECTIVO");
        jTEfeDescrip.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTEfeDescripFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTEfeDescripFocusLost(evt);
            }
        });
        jTEfeDescrip.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTEfeDescripKeyPressed(evt);
            }
        });
        jP1.add(jTEfeDescrip, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 180, 30));

        jTEfeCant.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jTEfeCant.setForeground(new java.awt.Color(0, 0, 255));
        jTEfeCant.setText("$0.00");
        jTEfeCant.setNextFocusableComponent(jTDebCant);
        jTEfeCant.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTEfeCantFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTEfeCantFocusLost(evt);
            }
        });
        jTEfeCant.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTEfeCantKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTEfeCantKeyTyped(evt);
            }
        });
        jP1.add(jTEfeCant, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 150, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("*Saldo:");
        jP1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 150, -1));

        jTCamb.setEditable(false);
        jTCamb.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jTCamb.setForeground(new java.awt.Color(0, 0, 255));
        jTCamb.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTCambFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTCambFocusLost(evt);
            }
        });
        jTCamb.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTCambKeyPressed(evt);
            }
        });
        jP1.add(jTCamb, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 150, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Total:");
        jP1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 150, -1));

        jTSald.setEditable(false);
        jTSald.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jTSald.setForeground(new java.awt.Color(0, 0, 255));
        jTSald.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTSaldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTSaldFocusLost(evt);
            }
        });
        jTSald.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTSaldKeyPressed(evt);
            }
        });
        jP1.add(jTSald, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 150, 30));

        jTDebDescrip.setEditable(false);
        jTDebDescrip.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTDebDescrip.setText("DEBITO");
        jTDebDescrip.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTDebDescripFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTDebDescripFocusLost(evt);
            }
        });
        jTDebDescrip.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTDebDescripKeyPressed(evt);
            }
        });
        jP1.add(jTDebDescrip, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 180, 30));

        jTDeb.setEditable(false);
        jTDeb.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTDeb.setText("DEB");
        jTDeb.setFocusable(false);
        jTDeb.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTDebFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTDebFocusLost(evt);
            }
        });
        jTDeb.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTDebKeyPressed(evt);
            }
        });
        jP1.add(jTDeb, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 110, 30));

        jTDebCant.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jTDebCant.setForeground(new java.awt.Color(0, 0, 255));
        jTDebCant.setText("$0.00");
        jTDebCant.setNextFocusableComponent(jTTarCredCant);
        jTDebCant.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTDebCantFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTDebCantFocusLost(evt);
            }
        });
        jTDebCant.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTDebCantKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTDebCantKeyTyped(evt);
            }
        });
        jP1.add(jTDebCant, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 150, 30));

        jTTar.setEditable(false);
        jTTar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTTar.setText("TAR");
        jTTar.setFocusable(false);
        jTTar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTTarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTTarFocusLost(evt);
            }
        });
        jTTar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTTarKeyPressed(evt);
            }
        });
        jP1.add(jTTar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 110, 30));

        jTTarDescrip.setEditable(false);
        jTTarDescrip.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTTarDescrip.setText("TARJETA CREDITO");
        jTTarDescrip.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTTarDescripFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTTarDescripFocusLost(evt);
            }
        });
        jTTarDescrip.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTTarDescripKeyPressed(evt);
            }
        });
        jP1.add(jTTarDescrip, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 180, 30));

        jTTarCredCant.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jTTarCredCant.setForeground(new java.awt.Color(0, 0, 255));
        jTTarCredCant.setText("$0.00");
        jTTarCredCant.setNextFocusableComponent(jTAObserv);
        jTTarCredCant.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTTarCredCantFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTTarCredCantFocusLost(evt);
            }
        });
        jTTarCredCant.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTTarCredCantKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTTarCredCantKeyTyped(evt);
            }
        });
        jP1.add(jTTarCredCant, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 150, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Sector:");
        jP1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 100, -1));

        jTAObserv.setColumns(20);
        jTAObserv.setLineWrap(true);
        jTAObserv.setRows(5);
        jTAObserv.setNextFocusableComponent(jRTic);
        jTAObserv.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTAObservFocusGained(evt);
            }
        });
        jTAObserv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTAObservKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTAObserv);

        jP1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 220, 60));

        jRTic.setBackground(new java.awt.Color(255, 255, 255));
        jRTic.setSelected(true);
        jRTic.setText("Ticket");
        jRTic.setNextFocusableComponent(jRRem);
        jRTic.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jRTicKeyPressed(evt);
            }
        });
        jP1.add(jRTic, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 80, -1));

        jRRem.setBackground(new java.awt.Color(255, 255, 255));
        jRRem.setText("Remisión");
        jRRem.setNextFocusableComponent(jRFac);
        jRRem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRRemActionPerformed(evt);
            }
        });
        jRRem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jRRemKeyPressed(evt);
            }
        });
        jP1.add(jRRem, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 90, -1));

        jRFac.setBackground(new java.awt.Color(255, 255, 255));
        jRFac.setText("Factura");
        jRFac.setNextFocusableComponent(jRNot);
        jRFac.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jRFacKeyPressed(evt);
            }
        });
        jP1.add(jRFac, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 90, -1));

        jLabel31.setForeground(new java.awt.Color(0, 0, 255));
        jLabel31.setText("Altl+ N");
        jP1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 80, 20));

        jLabel32.setForeground(new java.awt.Color(0, 0, 255));
        jLabel32.setText("Altl+ T");
        jP1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 80, 20));

        jLabel33.setForeground(new java.awt.Color(0, 0, 255));
        jLabel33.setText("Altl+ R");
        jP1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 80, 20));

        jRNot.setBackground(new java.awt.Color(255, 255, 255));
        jRNot.setText("Nota");
        jRNot.setToolTipText("Es un ticket cancelado (solo como comprobante)");
        jRNot.setNextFocusableComponent(jBCob);
        jRNot.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jRNotKeyPressed(evt);
            }
        });
        jP1.add(jRNot, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 90, -1));

        jLabel34.setForeground(new java.awt.Color(0, 0, 255));
        jLabel34.setText("Altl+ F");
        jP1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 80, 20));

        jRNoPag.setBackground(new java.awt.Color(255, 255, 255));
        jRNoPag.setText("No pagada");
        jRNoPag.setNextFocusableComponent(jBCob);
        jRNoPag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRNoPagActionPerformed(evt);
            }
        });
        jRNoPag.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jRNoPagKeyPressed(evt);
            }
        });
        jP1.add(jRNoPag, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        jRPagad.setBackground(new java.awt.Color(255, 255, 255));
        jRPagad.setSelected(true);
        jRPagad.setText("Pagada");
        jRPagad.setNextFocusableComponent(jBCob);
        jRPagad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRPagadActionPerformed(evt);
            }
        });
        jRPagad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jRPagadKeyPressed(evt);
            }
        });
        jP1.add(jRPagad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 70, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Cambio:");
        jP1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 110, -1));

        jTVend.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTVend.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTVendFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTVendFocusLost(evt);
            }
        });
        jTVend.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTVendKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTVendKeyTyped(evt);
            }
        });
        jP1.add(jTVend, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, 120, 20));

        jBVend.setBackground(new java.awt.Color(255, 255, 255));
        jBVend.setText("...");
        jBVend.setToolTipText("Buscar Vendedor(es)");
        jBVend.setNextFocusableComponent(jTActivo);
        jBVend.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBVendMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBVendMouseExited(evt);
            }
        });
        jBVend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVendActionPerformed(evt);
            }
        });
        jBVend.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBVendKeyPressed(evt);
            }
        });
        jP1.add(jBVend, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, 30, 20));

        jTActivo.setEditable(false);
        jTActivo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTActivo.setNextFocusableComponent(jBActivo);
        jTActivo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTActivoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTActivoFocusLost(evt);
            }
        });
        jTActivo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTActivoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTActivoKeyTyped(evt);
            }
        });
        jP1.add(jTActivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, 120, 20));

        jBActivo.setBackground(new java.awt.Color(255, 255, 255));
        jBActivo.setText("...");
        jBActivo.setToolTipText("Buscar Vendedor(es)");
        jBActivo.setNextFocusableComponent(jTSubramo);
        jBActivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBActivoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBActivoMouseExited(evt);
            }
        });
        jBActivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBActivoActionPerformed(evt);
            }
        });
        jBActivo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBActivoKeyPressed(evt);
            }
        });
        jP1.add(jBActivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, 30, 20));

        jTSubramo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTSubramo.setNextFocusableComponent(jBSubramo);
        jTSubramo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTSubramoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTSubramoFocusLost(evt);
            }
        });
        jTSubramo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTSubramoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTSubramoKeyTyped(evt);
            }
        });
        jP1.add(jTSubramo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 120, 20));

        jBSubramo.setBackground(new java.awt.Color(255, 255, 255));
        jBSubramo.setText("...");
        jBSubramo.setToolTipText("Buscar Vendedor(es)");
        jBSubramo.setNextFocusableComponent(jTSector);
        jBSubramo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBSubramoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBSubramoMouseExited(evt);
            }
        });
        jBSubramo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSubramoActionPerformed(evt);
            }
        });
        jP1.add(jBSubramo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 310, 30, 20));

        jTSector.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTSector.setNextFocusableComponent(jBSector);
        jTSector.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTSectorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTSectorFocusLost(evt);
            }
        });
        jTSector.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTSectorKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTSectorKeyTyped(evt);
            }
        });
        jP1.add(jTSector, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, 120, 20));

        jBSector.setBackground(new java.awt.Color(255, 255, 255));
        jBSector.setText("...");
        jBSector.setToolTipText("Buscar Vendedor(es)");
        jBSector.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBSectorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBSectorMouseExited(evt);
            }
        });
        jBSector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSectorActionPerformed(evt);
            }
        });
        jBSector.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBSectorKeyPressed(evt);
            }
        });
        jP1.add(jBSector, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, 30, 20));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Vendedor:");
        jP1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 100, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Activo:");
        jP1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 100, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Subramo:");
        jP1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 100, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jP1, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jP1, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
        
    private void jBCobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCobActionPerformed

        
        
    }//GEN-LAST:event_jBCobActionPerformed
              
                            
    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        

        
    }//GEN-LAST:event_formKeyPressed

  
    private void jBCobKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBCobKeyPressed
        
        
    }//GEN-LAST:event_jBCobKeyPressed

    
      
    private void jP1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jP1KeyPressed
        
    
        
    }//GEN-LAST:event_jP1KeyPressed

        
    private void jBSalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalActionPerformed
        
    
        
    }//GEN-LAST:event_jBSalActionPerformed

    
  
    private void jBSalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBSalKeyPressed
        
  
        
    }//GEN-LAST:event_jBSalKeyPressed
   
    

    private void jTTotKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTTotKeyPressed


        
    }//GEN-LAST:event_jTTotKeyPressed

    
    private void jTTotFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTTotFocusGained
        
    
        
    }//GEN-LAST:event_jTTotFocusGained

                    
    private void jTTotFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTTotFocusLost
        
        
                
    }//GEN-LAST:event_jTTotFocusLost
                                            
    

    private void jTEfeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTEfeKeyPressed



    }//GEN-LAST:event_jTEfeKeyPressed
        
    

    private void jTEfeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTEfeFocusGained



    }//GEN-LAST:event_jTEfeFocusGained

       
    private void jTEfeDescripFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTEfeDescripFocusGained
                
    
        
    }//GEN-LAST:event_jTEfeDescripFocusGained

        
    private void jTEfeDescripKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTEfeDescripKeyPressed
        
    
        
    }//GEN-LAST:event_jTEfeDescripKeyPressed

    
   
    private void jTEfeCantFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTEfeCantFocusGained
        
   
        
    }//GEN-LAST:event_jTEfeCantFocusGained

    
   
    private void jTEfeCantFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTEfeCantFocusLost
        
                    
        
    }//GEN-LAST:event_jTEfeCantFocusLost

    
   
    private void jTEfeCantKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTEfeCantKeyPressed
        
   
        
    }//GEN-LAST:event_jTEfeCantKeyPressed

      
  
    private void jTCambFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCambFocusGained
        
  
        
    }//GEN-LAST:event_jTCambFocusGained

    
  
    private void jTCambKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTCambKeyPressed
        
  
        
    }//GEN-LAST:event_jTCambKeyPressed

    
  
    private void jTSaldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTSaldFocusGained
        
  
        
    }//GEN-LAST:event_jTSaldFocusGained
       
        
  
    private void jTSaldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTSaldKeyPressed
        
  
        
    }//GEN-LAST:event_jTSaldKeyPressed

    
        
  
    private void jTDebFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTDebFocusGained
        
  
        
    }//GEN-LAST:event_jTDebFocusGained

    
  
    private void jTDebDescripFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTDebDescripFocusGained
        
  
        
    }//GEN-LAST:event_jTDebDescripFocusGained

    
  
    private void jTTarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTTarFocusGained
        
        
        
    }//GEN-LAST:event_jTTarFocusGained

    
    
    private void jTTarDescripFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTTarDescripFocusGained
        
    
        
    }//GEN-LAST:event_jTTarDescripFocusGained

    
    
    private void jTDebKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTDebKeyPressed
        
    
        
    }//GEN-LAST:event_jTDebKeyPressed

    
    
    private void jTDebDescripKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTDebDescripKeyPressed
        
    
        
    }//GEN-LAST:event_jTDebDescripKeyPressed

    
    
    private void jTTarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTTarKeyPressed
        
    
        
    }//GEN-LAST:event_jTTarKeyPressed

    
    
    private void jTTarDescripKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTTarDescripKeyPressed
        
    
        
    }//GEN-LAST:event_jTTarDescripKeyPressed

    
    
    private void jTDebCantKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTDebCantKeyTyped
        
    
        
    }//GEN-LAST:event_jTDebCantKeyTyped

    
    
    private void jTTarCredCantKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTTarCredCantKeyTyped
        
    
        
    }//GEN-LAST:event_jTTarCredCantKeyTyped

    
    
    private void jTDebCantFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTDebCantFocusGained
        
    
        
    }//GEN-LAST:event_jTDebCantFocusGained

    
    
    private void jTTarCredCantFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTTarCredCantFocusGained
        
    
        
    }//GEN-LAST:event_jTTarCredCantFocusGained

    
    
    private void jTDebCantKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTDebCantKeyPressed
        
    
        
    }//GEN-LAST:event_jTDebCantKeyPressed

    
    
    private void jTTarCredCantKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTTarCredCantKeyPressed
        
    
                
    }//GEN-LAST:event_jTTarCredCantKeyPressed

    
    
    private void jTDebCantFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTDebCantFocusLost
        
    
        
    }//GEN-LAST:event_jTDebCantFocusLost

    
    
    private void jTTarCredCantFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTTarCredCantFocusLost
        
    
        
    }//GEN-LAST:event_jTTarCredCantFocusLost

    
    
    private void jTAObservFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTAObservFocusGained
        
    
        
    }//GEN-LAST:event_jTAObservFocusGained

    
    
    private void jTAObservKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTAObservKeyPressed
        
    
        
    }//GEN-LAST:event_jTAObservKeyPressed

    
    
    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        
    
        
    }//GEN-LAST:event_formMouseDragged

    
    
    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        
    
        
    }//GEN-LAST:event_formMouseMoved

    
    
    private void formMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_formMouseWheelMoved
        
    
        
    }//GEN-LAST:event_formMouseWheelMoved

    
    
    private void jTEfeCantKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTEfeCantKeyTyped
        
    
        
    }//GEN-LAST:event_jTEfeCantKeyTyped

    
    
    
    
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
                
    
        
    }//GEN-LAST:event_formWindowClosing

    
    
    private void jBCobMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBCobMouseEntered
        
    
        
    }//GEN-LAST:event_jBCobMouseEntered

    
    
    private void jBSalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSalMouseEntered
        
    
        
    }//GEN-LAST:event_jBSalMouseEntered

        
    private void jBCobMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBCobMouseExited
        
    
        
    }//GEN-LAST:event_jBCobMouseExited

    
    
    private void jBSalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSalMouseExited
        
    
        
    }//GEN-LAST:event_jBSalMouseExited

    
    
    private void jRTicKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jRTicKeyPressed
                
    
        
    }//GEN-LAST:event_jRTicKeyPressed

    
    
    private void jRRemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jRRemKeyPressed
        

        
    }//GEN-LAST:event_jRRemKeyPressed

    

    private void jRFacKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jRFacKeyPressed
        
        
    }//GEN-LAST:event_jRFacKeyPressed

    

    private void jTEfeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTEfeFocusLost
        

        
    }//GEN-LAST:event_jTEfeFocusLost

    

    private void jTDebFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTDebFocusLost
        

        
    }//GEN-LAST:event_jTDebFocusLost

    

    private void jTTarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTTarFocusLost
        

        
    }//GEN-LAST:event_jTTarFocusLost

    

    private void jTEfeDescripFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTEfeDescripFocusLost
        

        
    }//GEN-LAST:event_jTEfeDescripFocusLost

    

    private void jTDebDescripFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTDebDescripFocusLost
        

        
    }//GEN-LAST:event_jTDebDescripFocusLost

    

    private void jTTarDescripFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTTarDescripFocusLost
        

        
    }//GEN-LAST:event_jTTarDescripFocusLost

    

    private void jTSaldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTSaldFocusLost
       

        
    }//GEN-LAST:event_jTSaldFocusLost

    

    private void jTCambFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCambFocusLost
        

        
    }//GEN-LAST:event_jTCambFocusLost

    

    private void jRNotKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jRNotKeyPressed
        

        
    }//GEN-LAST:event_jRNotKeyPressed

    

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        

                
    }//GEN-LAST:event_formWindowActivated

    

    private void jRPagadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jRPagadKeyPressed
        
        
    }//GEN-LAST:event_jRPagadKeyPressed

    

    private void jRNoPagKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jRNoPagKeyPressed
        

        
    }//GEN-LAST:event_jRNoPagKeyPressed

    

    private void jRPagadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRPagadActionPerformed
        

        
    }//GEN-LAST:event_jRPagadActionPerformed

    

    private void jRNoPagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRNoPagActionPerformed
        
        
    }//GEN-LAST:event_jRNoPagActionPerformed

    private void jRRemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRRemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRRemActionPerformed

    private void jTVendFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTVendFocusGained


    }//GEN-LAST:event_jTVendFocusGained

    private void jTVendFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTVendFocusLost


    }//GEN-LAST:event_jTVendFocusLost

    private void jTVendKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTVendKeyPressed


    }//GEN-LAST:event_jTVendKeyPressed

    private void jTVendKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTVendKeyTyped



    }//GEN-LAST:event_jTVendKeyTyped

    private void jBVendMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBVendMouseEntered



    }//GEN-LAST:event_jBVendMouseEntered

    private void jBVendMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBVendMouseExited



    }//GEN-LAST:event_jBVendMouseExited

    private void jBVendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVendActionPerformed


    }//GEN-LAST:event_jBVendActionPerformed

    private void jBVendKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBVendKeyPressed


    }//GEN-LAST:event_jBVendKeyPressed

    private void jTActivoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTActivoFocusGained

    }//GEN-LAST:event_jTActivoFocusGained

    private void jTActivoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTActivoFocusLost

    }//GEN-LAST:event_jTActivoFocusLost

    private void jTActivoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTActivoKeyPressed

    }//GEN-LAST:event_jTActivoKeyPressed

    private void jTActivoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTActivoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTActivoKeyTyped

    private void jBActivoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBActivoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jBActivoMouseEntered

    private void jBActivoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBActivoMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jBActivoMouseExited

    private void jBActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBActivoActionPerformed
            
    }//GEN-LAST:event_jBActivoActionPerformed

    private void jBActivoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBActivoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBActivoKeyPressed

    private void jTSubramoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTSubramoFocusGained
        
    }//GEN-LAST:event_jTSubramoFocusGained

    private void jTSubramoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTSubramoFocusLost
        
    }//GEN-LAST:event_jTSubramoFocusLost

    private void jTSubramoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTSubramoKeyPressed
        
    }//GEN-LAST:event_jTSubramoKeyPressed

    private void jTSubramoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTSubramoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTSubramoKeyTyped

    private void jBSubramoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSubramoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jBSubramoMouseEntered

    private void jBSubramoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSubramoMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jBSubramoMouseExited

    private void jBSubramoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSubramoActionPerformed
        
    }//GEN-LAST:event_jBSubramoActionPerformed

    private void jTSectorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTSectorFocusGained
        
    }//GEN-LAST:event_jTSectorFocusGained

    private void jTSectorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTSectorFocusLost
        
    }//GEN-LAST:event_jTSectorFocusLost

    private void jTSectorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTSectorKeyPressed
        
    }//GEN-LAST:event_jTSectorKeyPressed

    private void jTSectorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTSectorKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTSectorKeyTyped

    private void jBSectorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSectorMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jBSectorMouseEntered

    private void jBSectorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSectorMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jBSectorMouseExited

    private void jBSectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSectorActionPerformed
        
    }//GEN-LAST:event_jBSectorActionPerformed

    private void jBSectorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBSectorKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBSectorKeyPressed
        
        
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBActivo;
    private javax.swing.JButton jBCob;
    private javax.swing.JButton jBSal;
    private javax.swing.JButton jBSector;
    private javax.swing.JButton jBSubramo;
    private javax.swing.JButton jBVend;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jP1;
    private javax.swing.JRadioButton jRFac;
    private javax.swing.JRadioButton jRNoPag;
    private javax.swing.JRadioButton jRNot;
    private javax.swing.JRadioButton jRPagad;
    private javax.swing.JRadioButton jRRem;
    private javax.swing.JRadioButton jRTic;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTAObserv;
    private javax.swing.JTextField jTActivo;
    private javax.swing.JTextField jTCamb;
    private javax.swing.JTextField jTDeb;
    private javax.swing.JTextField jTDebCant;
    private javax.swing.JTextField jTDebDescrip;
    private javax.swing.JTextField jTEfe;
    private javax.swing.JTextField jTEfeCant;
    private javax.swing.JTextField jTEfeDescrip;
    private javax.swing.JTextField jTSald;
    private javax.swing.JTextField jTSector;
    private javax.swing.JTextField jTSubramo;
    private javax.swing.JTextField jTTar;
    private javax.swing.JTextField jTTarCredCant;
    private javax.swing.JTextField jTTarDescrip;
    private javax.swing.JTextField jTTot;
    private javax.swing.JTextField jTVend;
    // End of variables declaration//GEN-END:variables

}/*Fin de public class Clientes extends javax.swing.JFrame */
