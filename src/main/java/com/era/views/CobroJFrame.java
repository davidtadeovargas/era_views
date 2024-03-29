package com.era.views;



public abstract class CobroJFrame extends BaseJFrame
{
    public CobroJFrame(final String idTextTitleWindow) 
    {             
        super(idTextTitleWindow);
        
        initComponents();
        
        //Post inicialization
        postInitComponents();                
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTAObserv = new javax.swing.JTextArea();
        jRTic = new javax.swing.JRadioButton();
        jRRem = new javax.swing.JRadioButton();
        jRFac = new javax.swing.JRadioButton();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jRadioButtonCash = new javax.swing.JRadioButton();
        jRadioButtonCredit = new javax.swing.JRadioButton();
        jLabelCred = new java.awt.Label();

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
        jRFac.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jRFacKeyPressed(evt);
            }
        });
        jP1.add(jRFac, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 90, -1));

        jLabel32.setForeground(new java.awt.Color(0, 0, 255));
        jLabel32.setText("Altl+ T");
        jP1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 80, 20));

        jLabel33.setForeground(new java.awt.Color(0, 0, 255));
        jLabel33.setText("Altl+ R");
        jP1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 80, 20));

        jLabel34.setForeground(new java.awt.Color(0, 0, 255));
        jLabel34.setText("Altl+ F");
        jP1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 80, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Cambio:");
        jP1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 110, -1));

        jRadioButtonCash.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButtonCash.setText("Contado");
        jP1.add(jRadioButtonCash, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 150, -1));

        jRadioButtonCredit.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButtonCredit.setText("Crédito");
        jP1.add(jRadioButtonCredit, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, 150, -1));

        jLabelCred.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabelCred.setForeground(new java.awt.Color(0, 153, 51));
        jP1.add(jLabelCred, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 240, -1));

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

    

    

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        

                
    }//GEN-LAST:event_formWindowActivated

    

    

    

    

    private void jRRemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRRemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRRemActionPerformed
        
        
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton jBCob;
    protected javax.swing.JButton jBSal;
    protected javax.swing.JLabel jLabel3;
    protected javax.swing.JLabel jLabel32;
    protected javax.swing.JLabel jLabel33;
    protected javax.swing.JLabel jLabel34;
    protected javax.swing.JLabel jLabel4;
    protected javax.swing.JLabel jLabel5;
    protected javax.swing.JLabel jLabel6;
    protected javax.swing.JLabel jLabel8;
    protected java.awt.Label jLabelCred;
    private javax.swing.JPanel jP1;
    protected javax.swing.JRadioButton jRFac;
    protected javax.swing.JRadioButton jRRem;
    protected javax.swing.JRadioButton jRTic;
    protected javax.swing.JRadioButton jRadioButtonCash;
    protected javax.swing.JRadioButton jRadioButtonCredit;
    protected javax.swing.JScrollPane jScrollPane1;
    protected javax.swing.JTextArea jTAObserv;
    protected javax.swing.JTextField jTCamb;
    protected javax.swing.JTextField jTDeb;
    protected javax.swing.JTextField jTDebCant;
    protected javax.swing.JTextField jTDebDescrip;
    protected javax.swing.JTextField jTEfe;
    protected javax.swing.JTextField jTEfeCant;
    protected javax.swing.JTextField jTEfeDescrip;
    protected javax.swing.JTextField jTSald;
    protected javax.swing.JTextField jTTar;
    protected javax.swing.JTextField jTTarCredCant;
    protected javax.swing.JTextField jTTarDescrip;
    protected javax.swing.JTextField jTTot;
    // End of variables declaration//GEN-END:variables

}/*Fin de public class Clientes extends javax.swing.JFrame */
