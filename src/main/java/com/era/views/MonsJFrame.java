package com.era.views;


public abstract class MonsJFrame extends BaseJFrame
{    
    public MonsJFrame(final String idTextTitleWindow) 
    {
        super(idTextTitleWindow);
        
        initComponents();
        
        postInitComponents();
        
        this.getRootPane().setDefaultButton(jBNew);
        
        jTCod.grabFocus();
    }
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jP1 = new javax.swing.JPanel();
        jBDel = new javax.swing.JButton();
        jLClaveSat = new javax.swing.JLabel();
        jBSal = new javax.swing.JButton();
        jTCod = new javax.swing.JTextField();
        jBNew = new javax.swing.JButton();
        jTDescrip = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTab = new javax.swing.JTable();
        jBBusc = new javax.swing.JButton();
        jTBusc = new javax.swing.JTextField();
        jBMostT = new javax.swing.JButton();
        jBDol = new javax.swing.JButton();
        jBActua = new javax.swing.JButton();
        jCMN = new javax.swing.JCheckBox();
        jBGua = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTSim = new javax.swing.JTextField();
        jTClaveSat = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jBClaveSat = new javax.swing.JButton();

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

        jBDel.setBackground(new java.awt.Color(255, 255, 255));
        jBDel.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBDel.setForeground(new java.awt.Color(0, 102, 0));
        jBDel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/del5.png"))); // NOI18N
        jBDel.setText("Borrar");
        jBDel.setToolTipText("Borrar moneda(s) (Ctrl+SUPR)");
        jBDel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBDel.setNextFocusableComponent(jBDol);
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
        jP1.add(jBDel, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 100, 120, 30));

        jLClaveSat.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLClaveSat.setText("*Clave Sat:");
        jP1.add(jLClaveSat, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 80, -1));

        jBSal.setBackground(new java.awt.Color(255, 255, 255));
        jBSal.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBSal.setForeground(new java.awt.Color(0, 102, 0));
        jBSal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/sal.png"))); // NOI18N
        jBSal.setText("Salir");
        jBSal.setToolTipText("Salir (ESC)");
        jBSal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBSal.setNextFocusableComponent(jTCod);
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
        jP1.add(jBSal, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 190, 120, 30));

        jTCod.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTCod.setNextFocusableComponent(jTDescrip);
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
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTCodKeyTyped(evt);
            }
        });
        jP1.add(jTCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 140, 20));

        jBNew.setBackground(new java.awt.Color(255, 255, 255));
        jBNew.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBNew.setForeground(new java.awt.Color(0, 102, 0));
        jBNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/agre.png"))); // NOI18N
        jBNew.setText("Nuevo");
        jBNew.setToolTipText("Nueva Moneda (Ctrl+N)");
        jBNew.setNextFocusableComponent(jCMN);
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
        jP1.add(jBNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 30, 100, 20));

        jTDescrip.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTDescrip.setNextFocusableComponent(jTSim);
        jTDescrip.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTDescripFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTDescripFocusLost(evt);
            }
        });
        jTDescrip.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTDescripKeyPressed(evt);
            }
        });
        jP1.add(jTDescrip, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 160, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Monedas:");
        jP1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 160, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("*Código Moneda:");
        jP1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 140, -1));

        jTab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Código", "Descripción", "Símbolo", "Clave SAT"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTab.setGridColor(new java.awt.Color(255, 255, 255));
        jTab.setNextFocusableComponent(jBBusc);
        jTab.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        jTab.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTabKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(jTab);

        jP1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 550, 240));

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
        jP1.add(jBBusc, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 140, 20));

        jTBusc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTBusc.setNextFocusableComponent(jBMostT);
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
        jP1.add(jTBusc, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 270, 20));

        jBMostT.setBackground(new java.awt.Color(255, 255, 255));
        jBMostT.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBMostT.setForeground(new java.awt.Color(0, 102, 0));
        jBMostT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/mostt.png"))); // NOI18N
        jBMostT.setText("Mostrar F4");
        jBMostT.setToolTipText("Mostrar Nuevamente todos los Registros");
        jBMostT.setNextFocusableComponent(jBDel);
        jBMostT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBMostTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBMostTMouseExited(evt);
            }
        });
        jBMostT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMostTActionPerformed(evt);
            }
        });
        jBMostT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBMostTKeyPressed(evt);
            }
        });
        jP1.add(jBMostT, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 350, 140, 20));

        jBDol.setBackground(new java.awt.Color(255, 255, 255));
        jBDol.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBDol.setForeground(new java.awt.Color(0, 102, 0));
        jBDol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/dol.png"))); // NOI18N
        jBDol.setText("T.Cambio");
        jBDol.setToolTipText("Tipo de cambio (F7)");
        jBDol.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBDol.setNextFocusableComponent(jBActua);
        jBDol.setOpaque(false);
        jBDol.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBDolMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBDolMouseExited(evt);
            }
        });
        jBDol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDolActionPerformed(evt);
            }
        });
        jBDol.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBDolKeyPressed(evt);
            }
        });
        jP1.add(jBDol, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, 120, 30));

        jBActua.setBackground(new java.awt.Color(255, 255, 255));
        jBActua.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBActua.setForeground(new java.awt.Color(0, 102, 0));
        jBActua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/actualizar.png"))); // NOI18N
        jBActua.setText("Actualizar");
        jBActua.setToolTipText("Actualizar registros (F5)");
        jBActua.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBActua.setNextFocusableComponent(jBSal);
        jBActua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBActuaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBActuaMouseExited(evt);
            }
        });
        jBActua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBActuaActionPerformed(evt);
            }
        });
        jBActua.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBActuaKeyPressed(evt);
            }
        });
        jP1.add(jBActua, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 160, 120, 30));

        jCMN.setBackground(new java.awt.Color(255, 255, 255));
        jCMN.setText("Moneda nacional M.N.");
        jCMN.setNextFocusableComponent(jTab);
        jCMN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jCMNKeyPressed(evt);
            }
        });
        jP1.add(jCMN, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 140, -1));

        jBGua.setBackground(new java.awt.Color(255, 255, 255));
        jBGua.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBGua.setForeground(new java.awt.Color(0, 102, 0));
        jBGua.setText("Guardar MN ");
        jBGua.setToolTipText("Guardar Moneda Nacional (F2)");
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
        jP1.add(jBGua, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 120, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("*Descripción:");
        jP1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 180, -1));

        jTSim.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTSim.setNextFocusableComponent(jTClaveSat);
        jTSim.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTSimFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTSimFocusLost(evt);
            }
        });
        jTSim.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTSimKeyPressed(evt);
            }
        });
        jP1.add(jTSim, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 80, 20));

        jTClaveSat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTClaveSat.setNextFocusableComponent(jBNew);
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
        });
        jP1.add(jTClaveSat, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, 90, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("*Símbolo:");
        jP1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 80, -1));

        jBClaveSat.setBackground(new java.awt.Color(255, 255, 255));
        jBClaveSat.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBClaveSat.setForeground(new java.awt.Color(0, 120, 0));
        jBClaveSat.setText("...");
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
        jP1.add(jBClaveSat, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, 40, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jP1, javax.swing.GroupLayout.DEFAULT_SIZE, 703, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jP1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

        
    private void jBDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDelActionPerformed
                                                      
        
    }//GEN-LAST:event_jBDelActionPerformed
      
    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        
        
    }//GEN-LAST:event_formKeyPressed

   
    private void jBDelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBDelKeyPressed
        
        
    }//GEN-LAST:event_jBDelKeyPressed
    
       
    private void jP1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jP1KeyPressed
        
        
    }//GEN-LAST:event_jP1KeyPressed

    
    private void jBSalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalActionPerformed
            
        
    }//GEN-LAST:event_jBSalActionPerformed

        
    private void jBSalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBSalKeyPressed
        
        
    }//GEN-LAST:event_jBSalKeyPressed

        
    private void jBNewKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBNewKeyPressed
        
        
    }//GEN-LAST:event_jBNewKeyPressed

        
    private void jTCodKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTCodKeyPressed

        
    }//GEN-LAST:event_jTCodKeyPressed

        
    private void jTCodFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCodFocusGained
        
        
    }//GEN-LAST:event_jTCodFocusGained

        
    private void jTDescripKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTDescripKeyPressed

        
    }//GEN-LAST:event_jTDescripKeyPressed

        
    private void jTabKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTabKeyPressed
        
        
    }//GEN-LAST:event_jTabKeyPressed

        
    private void jTDescripFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTDescripFocusGained
        
        
    }//GEN-LAST:event_jTDescripFocusGained

        
    private void jTCodFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCodFocusLost
    
               
    }//GEN-LAST:event_jTCodFocusLost

    
    private void jTDescripFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTDescripFocusLost
    
                        
    }//GEN-LAST:event_jTDescripFocusLost
           
    
    private void jBNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNewActionPerformed
                                                         
         
    }//GEN-LAST:event_jBNewActionPerformed

    
    private void jTCodKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTCodKeyTyped
            
        
    }//GEN-LAST:event_jTCodKeyTyped

    

    private void jBBuscKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBBuscKeyPressed

        
    }//GEN-LAST:event_jBBuscKeyPressed

    
    private void jTBuscFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTBuscFocusGained
    
        
    }//GEN-LAST:event_jTBuscFocusGained

    
    private void jTBuscKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTBuscKeyPressed
    
        
    }//GEN-LAST:event_jTBuscKeyPressed

    
    private void jBMostTKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBMostTKeyPressed

        
    }//GEN-LAST:event_jBMostTKeyPressed

        
    private void jBBuscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscActionPerformed
                            
        
    }//GEN-LAST:event_jBBuscActionPerformed

        
            
    private void jBMostTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMostTActionPerformed
                
        
    }//GEN-LAST:event_jBMostTActionPerformed

        
    private void jBDolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDolActionPerformed
    
                    
    }//GEN-LAST:event_jBDolActionPerformed

    
    private void jBDolKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBDolKeyPressed

    
    }//GEN-LAST:event_jBDolKeyPressed

        
    private void jBActuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBActuaActionPerformed

    
    }//GEN-LAST:event_jBActuaActionPerformed

        
    private void jBActuaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBActuaKeyPressed

    
    }//GEN-LAST:event_jBActuaKeyPressed

        
    private void formMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_formMouseWheelMoved
        
        
    }//GEN-LAST:event_formMouseWheelMoved

        
    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        
        
    }//GEN-LAST:event_formMouseDragged

        
    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        
        
    }//GEN-LAST:event_formMouseMoved

                
    private void jCMNKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCMNKeyPressed
                
        
    }//GEN-LAST:event_jCMNKeyPressed

        
    private void jBGuaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBGuaKeyPressed
        
        
    }//GEN-LAST:event_jBGuaKeyPressed

        
    private void jBGuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuaActionPerformed
            
        
    }//GEN-LAST:event_jBGuaActionPerformed

        
        
        
    private void jBBuscMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBBuscMouseEntered
            
        
    }//GEN-LAST:event_jBBuscMouseEntered

        
    private void jBBuscMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBBuscMouseExited
            
        
    }//GEN-LAST:event_jBBuscMouseExited

            
    
   
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        
         
    }//GEN-LAST:event_formWindowClosing

       
    private void jBNewMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBNewMouseEntered
        
        
    }//GEN-LAST:event_jBNewMouseEntered

        
    private void jBGuaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBGuaMouseEntered
        
        
    }//GEN-LAST:event_jBGuaMouseEntered

        
        
    private void jBDelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBDelMouseEntered
        
        
    }//GEN-LAST:event_jBDelMouseEntered

    
    private void jBDolMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBDolMouseEntered
        
        
    }//GEN-LAST:event_jBDolMouseEntered

        
    private void jBActuaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBActuaMouseEntered
        
        
    }//GEN-LAST:event_jBActuaMouseEntered

    
        
    private void jBSalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSalMouseEntered
        
        
    }//GEN-LAST:event_jBSalMouseEntered

        
    private void jBMostTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBMostTMouseEntered
        
        
    }//GEN-LAST:event_jBMostTMouseEntered

    
    
    private void jBNewMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBNewMouseExited
        
        
    }//GEN-LAST:event_jBNewMouseExited

        
    private void jBGuaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBGuaMouseExited
        
        
    }//GEN-LAST:event_jBGuaMouseExited

        
        
    private void jBDelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBDelMouseExited
        
        
    }//GEN-LAST:event_jBDelMouseExited

        
    private void jBDolMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBDolMouseExited
        
                
    }//GEN-LAST:event_jBDolMouseExited

        
    private void jBActuaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBActuaMouseExited
        
        
    }//GEN-LAST:event_jBActuaMouseExited


        
    private void jBSalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSalMouseExited
        
                
    }//GEN-LAST:event_jBSalMouseExited

        
    private void jBMostTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBMostTMouseExited
        
        
    }//GEN-LAST:event_jBMostTMouseExited

        
    private void jTBuscFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTBuscFocusLost

    
        
    }//GEN-LAST:event_jTBuscFocusLost

       
    private void jTSimFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTSimFocusGained
        
       
    }//GEN-LAST:event_jTSimFocusGained

        
    private void jTSimFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTSimFocusLost
            
        
    }//GEN-LAST:event_jTSimFocusLost

       
    private void jTSimKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTSimKeyPressed
        
        
    }//GEN-LAST:event_jTSimKeyPressed

    private void jTClaveSatFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTClaveSatFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTClaveSatFocusGained

    private void jTClaveSatFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTClaveSatFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTClaveSatFocusLost

    private void jTClaveSatKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTClaveSatKeyPressed
    
    }//GEN-LAST:event_jTClaveSatKeyPressed

    private void jBClaveSatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBClaveSatActionPerformed
    
    }//GEN-LAST:event_jBClaveSatActionPerformed

    private void jBClaveSatKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBClaveSatKeyPressed
        
    }//GEN-LAST:event_jBClaveSatKeyPressed
   
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton jBActua;
    protected javax.swing.JButton jBBusc;
    protected javax.swing.JButton jBClaveSat;
    protected javax.swing.JButton jBDel;
    protected javax.swing.JButton jBDol;
    protected javax.swing.JButton jBGua;
    protected javax.swing.JButton jBMostT;
    protected javax.swing.JButton jBNew;
    protected javax.swing.JButton jBSal;
    protected javax.swing.JCheckBox jCMN;
    protected javax.swing.JLabel jLClaveSat;
    protected javax.swing.JLabel jLabel2;
    protected javax.swing.JLabel jLabel3;
    protected javax.swing.JLabel jLabel4;
    protected javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jP1;
    protected javax.swing.JScrollPane jScrollPane2;
    protected javax.swing.JTextField jTBusc;
    protected javax.swing.JTextField jTClaveSat;
    protected javax.swing.JTextField jTCod;
    protected javax.swing.JTextField jTDescrip;
    protected javax.swing.JTextField jTSim;
    private javax.swing.JTable jTab;
    // End of variables declaration//GEN-END:variables

}/*Fin de public class Clientes extends javax.swing.JFrame */
