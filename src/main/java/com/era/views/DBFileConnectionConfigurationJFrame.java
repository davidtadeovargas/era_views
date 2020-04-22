package com.era.views;

//Config configuration database file
public class DBFileConnectionConfigurationJFrame extends BaseJFrame {
    
    public DBFileConnectionConfigurationJFrame() {
        
        //Init graphic components
        initComponents();
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jP1 = new javax.swing.JPanel();
        jBGua = new javax.swing.JButton();
        jBSal = new javax.swing.JButton();
        jTInst = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTBD = new javax.swing.JTextField();
        jTUsr = new javax.swing.JTextField();
        jPCont = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jTNom = new javax.swing.JTextField();
        jBProb = new javax.swing.JButton();
        jCMosC = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jTSuc = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTNoCaj = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTPort = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

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

        jBGua.setBackground(new java.awt.Color(255, 255, 255));
        jBGua.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBGua.setForeground(new java.awt.Color(0, 102, 0));
        jBGua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/save.png"))); // NOI18N
        jBGua.setText("Guardar");
        jBGua.setToolTipText("Guardar");
        jBGua.setNextFocusableComponent(jBSal);
        jBGua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBGuaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBGuaMouseExited(evt);
            }
        });
        jBGua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuaActionPerformed(evt);
            }
        });
        jBGua.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBGuaKeyPressed(evt);
            }
        });
        jP1.add(jBGua, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 120, 30));

        jBSal.setBackground(new java.awt.Color(255, 255, 255));
        jBSal.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBSal.setForeground(new java.awt.Color(0, 102, 0));
        jBSal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/sal.png"))); // NOI18N
        jBSal.setText("Salir");
        jBSal.setToolTipText("Salir (ESC)");
        jBSal.setNextFocusableComponent(jBProb);
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
        jP1.add(jBSal, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, 110, 30));

        jTInst.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTInst.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTInst.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTInstFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTInstFocusLost(evt);
            }
        });
        jTInst.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTInstKeyPressed(evt);
            }
        });
        jP1.add(jTInst, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 220, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CONFIGURACIÓN INICIAL");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jP1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 470, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("*Usuario:");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jP1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 220, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("*Contraseña:");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jP1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 220, -1));

        jTBD.setEditable(false);
        jTBD.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTBD.setText("DBEMPRESAS");
        jTBD.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTBD.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTBDFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTBDFocusLost(evt);
            }
        });
        jTBD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTBDMouseClicked(evt);
            }
        });
        jTBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTBDActionPerformed(evt);
            }
        });
        jTBD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTBDKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTBDKeyTyped(evt);
            }
        });
        jP1.add(jTBD, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 220, 20));

        jTUsr.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTUsr.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTUsr.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTUsrFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTUsrFocusLost(evt);
            }
        });
        jTUsr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTUsrKeyPressed(evt);
            }
        });
        jP1.add(jTUsr, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 220, 20));

        jPCont.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPCont.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPCont.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPContFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPContFocusLost(evt);
            }
        });
        jPCont.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPContKeyPressed(evt);
            }
        });
        jP1.add(jPCont, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 220, 20));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("*Instancia:");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jP1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 220, -1));

        jTNom.setEditable(false);
        jTNom.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTNom.setText("EASY RETAIL ADMIN");
        jTNom.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTNom.setNextFocusableComponent(jTInst);
        jTNom.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTNomFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTNomFocusLost(evt);
            }
        });
        jTNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTNomActionPerformed(evt);
            }
        });
        jTNom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTNomKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTNomKeyTyped(evt);
            }
        });
        jP1.add(jTNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 450, 20));

        jBProb.setBackground(new java.awt.Color(255, 255, 255));
        jBProb.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBProb.setForeground(new java.awt.Color(0, 102, 0));
        jBProb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/prov.png"))); // NOI18N
        jBProb.setText("Probar Conexión");
        jBProb.setToolTipText("Probar Conexión (F2)");
        jBProb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBProbMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBProbMouseExited(evt);
            }
        });
        jBProb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBProbActionPerformed(evt);
            }
        });
        jBProb.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBProbKeyPressed(evt);
            }
        });
        jP1.add(jBProb, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 220, 30));

        jCMosC.setBackground(new java.awt.Color(255, 255, 255));
        jCMosC.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCMosC.setText("Mostrar contraseña F4");
        jCMosC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCMosCActionPerformed(evt);
            }
        });
        jCMosC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jCMosCKeyPressed(evt);
            }
        });
        jP1.add(jCMosC, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 140, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("*Base de Datos:");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jP1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 220, -1));

        jTSuc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTSuc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTSuc.setNextFocusableComponent(jTNoCaj);
        jTSuc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTSucFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTSucFocusLost(evt);
            }
        });
        jTSuc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTSucKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTSucKeyTyped(evt);
            }
        });
        jP1.add(jTSuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 220, 20));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("*Nombre Sucursal:");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jP1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 220, -1));

        jTNoCaj.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTNoCaj.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTNoCaj.setNextFocusableComponent(jBGua);
        jTNoCaj.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTNoCajFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTNoCajFocusLost(evt);
            }
        });
        jTNoCaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTNoCajActionPerformed(evt);
            }
        });
        jTNoCaj.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTNoCajKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTNoCajKeyTyped(evt);
            }
        });
        jP1.add(jTNoCaj, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 220, 20));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("*Empresa:");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jP1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 450, -1));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("*Puerto:");
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jP1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 220, -1));

        jTPort.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTPort.setText("3306");
        jTPort.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTPort.setNextFocusableComponent(jTSuc);
        jTPort.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTPortFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTPortFocusLost(evt);
            }
        });
        jTPort.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTPortKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTPortKeyTyped(evt);
            }
        });
        jP1.add(jTPort, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 220, 20));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("*Numero Caja:");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jP1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 220, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jP1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jP1, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

        
    private void jBGuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuaActionPerformed
                       
    }//GEN-LAST:event_jBGuaActionPerformed
         
    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        
        
    }//GEN-LAST:event_formKeyPressed

   
    /*Cuando se presiona una tecla en el botón de guardar*/
    private void jBGuaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBGuaKeyPressed
                
    }//GEN-LAST:event_jBGuaKeyPressed

        
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
                
    }//GEN-LAST:event_formWindowClosing
        
    private void jP1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jP1KeyPressed
               
        
    }//GEN-LAST:event_jP1KeyPressed
        
    private void jBSalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalActionPerformed
        
    }//GEN-LAST:event_jBSalActionPerformed
        
    private void jBSalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBSalKeyPressed
                
    }//GEN-LAST:event_jBSalKeyPressed
   
    private void jTInstKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTInstKeyPressed
                   
        
    }//GEN-LAST:event_jTInstKeyPressed
        
    private void jTInstFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTInstFocusGained
                
    }//GEN-LAST:event_jTInstFocusGained
        
    private void jTUsrKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTUsrKeyPressed
                      
    }//GEN-LAST:event_jTUsrKeyPressed
        
    private void jTBDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTBDKeyPressed
                       
    }//GEN-LAST:event_jTBDKeyPressed

        
    private void jTUsrFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTUsrFocusGained
               
    }//GEN-LAST:event_jTUsrFocusGained
        
    private void jTBDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTBDFocusGained
                        
    }//GEN-LAST:event_jTBDFocusGained
        
    private void jPContKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPContKeyPressed
                
    }//GEN-LAST:event_jPContKeyPressed
        
    private void jPContFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPContFocusGained
                       
    }//GEN-LAST:event_jPContFocusGained
        
    private void jTNomFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTNomFocusGained
                      
    }//GEN-LAST:event_jTNomFocusGained
        
    private void jTNomKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTNomKeyPressed
                        
    }//GEN-LAST:event_jTNomKeyPressed
                
    private void jTNomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTNomKeyTyped
                
    }//GEN-LAST:event_jTNomKeyTyped

        
    private void jTBDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTBDKeyTyped
               
    }//GEN-LAST:event_jTBDKeyTyped

        
    private void jBProbKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBProbKeyPressed
                       
    }//GEN-LAST:event_jBProbKeyPressed

        
    private void jBProbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBProbActionPerformed
                
    }//GEN-LAST:event_jBProbActionPerformed
    
    private void jCMosCKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCMosCKeyPressed
                        
    }//GEN-LAST:event_jCMosCKeyPressed
        
    private void jCMosCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCMosCActionPerformed
                                
    }//GEN-LAST:event_jCMosCActionPerformed
              
    private void jTSucFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTSucFocusGained
                        
    }//GEN-LAST:event_jTSucFocusGained
        
    private void jTNoCajFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTNoCajFocusGained
                        
    }//GEN-LAST:event_jTNoCajFocusGained
        
    private void jTSucKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTSucKeyPressed
               
    }//GEN-LAST:event_jTSucKeyPressed
        
    private void jTNoCajKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTNoCajKeyPressed
               
    }//GEN-LAST:event_jTNoCajKeyPressed
    
    private void jTSucKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTSucKeyTyped
                       
    }//GEN-LAST:event_jTSucKeyTyped

        
    private void jTNoCajKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTNoCajKeyTyped
            
        
    }//GEN-LAST:event_jTNoCajKeyTyped
      
    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
                        
    }//GEN-LAST:event_formMouseMoved
     
    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
               
    }//GEN-LAST:event_formMouseDragged
          
    private void formMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_formMouseWheelMoved
               
    }//GEN-LAST:event_formMouseWheelMoved
      
    private void jTNomFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTNomFocusLost
                
    }//GEN-LAST:event_jTNomFocusLost
       
    private void jTInstFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTInstFocusLost
               
    }//GEN-LAST:event_jTInstFocusLost
        
    private void jTUsrFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTUsrFocusLost
        
    }//GEN-LAST:event_jTUsrFocusLost
    
    private void jPContFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPContFocusLost
            
    }//GEN-LAST:event_jPContFocusLost
       
    private void jTBDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTBDFocusLost
            
        
        
    }//GEN-LAST:event_jTBDFocusLost
   
    private void jTSucFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTSucFocusLost
        
    }//GEN-LAST:event_jTSucFocusLost
        
    private void jTNoCajFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTNoCajFocusLost
               
    }//GEN-LAST:event_jTNoCajFocusLost
        
    private void jBProbMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBProbMouseEntered
                       
    }//GEN-LAST:event_jBProbMouseEntered
       
    private void jBGuaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBGuaMouseEntered
                        
    }//GEN-LAST:event_jBGuaMouseEntered
    
    private void jBSalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSalMouseEntered
                       
    }//GEN-LAST:event_jBSalMouseEntered
       
    private void jBProbMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBProbMouseExited
                        
    }//GEN-LAST:event_jBProbMouseExited

    private void jBGuaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBGuaMouseExited
                        
    }//GEN-LAST:event_jBGuaMouseExited
        
    private void jBSalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSalMouseExited
               
    }//GEN-LAST:event_jBSalMouseExited
        
    private void jTPortFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTPortFocusGained
                        
    }//GEN-LAST:event_jTPortFocusGained
        
    private void jTPortFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTPortFocusLost
                       
    }//GEN-LAST:event_jTPortFocusLost
        
    private void jTPortKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTPortKeyPressed
                        
    }//GEN-LAST:event_jTPortKeyPressed
        
    private void jTPortKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTPortKeyTyped
                
        
    }//GEN-LAST:event_jTPortKeyTyped
    
    
    private void jTNoCajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTNoCajActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTNoCajActionPerformed

    private void jTBDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTBDMouseClicked


    }//GEN-LAST:event_jTBDMouseClicked

    private void jTBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTBDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTBDActionPerformed

    private void jTNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTNomActionPerformed
          
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    protected javax.swing.JButton jBGua;
    protected javax.swing.JButton jBProb;
    protected javax.swing.JButton jBSal;
    protected javax.swing.JCheckBox jCMosC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    protected javax.swing.JPanel jP1;
    protected javax.swing.JPasswordField jPCont;
    protected javax.swing.JTextField jTBD;
    protected javax.swing.JTextField jTInst;
    protected javax.swing.JTextField jTNoCaj;
    protected javax.swing.JTextField jTNom;
    protected javax.swing.JTextField jTPort;
    protected javax.swing.JTextField jTSuc;
    protected javax.swing.JTextField jTUsr;
    // End of variables declaration//GEN-END:variables
                
}/*Fin de public class Clientes extends javax.swing.JFrame */