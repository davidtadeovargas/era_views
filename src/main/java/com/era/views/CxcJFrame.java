package com.era.views;


public abstract class CxcJFrame extends BaseJFrame
{
    public CxcJFrame(final String idTextTitleWindow) 
    {
        super(idTextTitleWindow);
        
        initComponents();
        
        //Post inicialization
        postInitComponents();
        
        this.getRootPane().setDefaultButton(jBAbon);
        
        jTCli.grabFocus();
                
    }

    
            
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jP1 = new javax.swing.JPanel();
        jBAbon = new javax.swing.JButton();
        jBSal = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jCPe = new javax.swing.JCheckBox();
        jCCo = new javax.swing.JCheckBox();
        jBVerA = new javax.swing.JButton();
        jTCli = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTNom = new javax.swing.JTextField();
        jBCli = new javax.swing.JButton();
        jCVen = new javax.swing.JCheckBox();
        jBVis = new javax.swing.JButton();
        jTDia = new javax.swing.JTextField();
        jTCond = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jCalendarFrom = new com.toedter.calendar.JCalendar();
        jCalendarUntil = new com.toedter.calendar.JCalendar();
        jBSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabCXC = new com.era.views.tables.CxcTable();

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

        jBAbon.setBackground(new java.awt.Color(255, 255, 255));
        jBAbon.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBAbon.setForeground(new java.awt.Color(0, 102, 0));
        jBAbon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/abona.png"))); // NOI18N
        jBAbon.setText("Pagos");
        jBAbon.setToolTipText("Abonar a Venta");
        jBAbon.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBAbon.setNextFocusableComponent(jBVerA);
        jBAbon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBAbonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBAbonMouseExited(evt);
            }
        });
        jBAbon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAbonActionPerformed(evt);
            }
        });
        jBAbon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBAbonKeyPressed(evt);
            }
        });
        jP1.add(jBAbon, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 200, 120, 30));

        jBSal.setBackground(new java.awt.Color(255, 255, 255));
        jBSal.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBSal.setForeground(new java.awt.Color(0, 102, 0));
        jBSal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/sal.png"))); // NOI18N
        jBSal.setText("Salir");
        jBSal.setToolTipText("Salir (ESC)");
        jBSal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBSal.setName(""); // NOI18N
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
        jP1.add(jBSal, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 290, 120, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("A:");
        jP1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 20, 40, -1));

        jCPe.setBackground(new java.awt.Color(255, 255, 255));
        jCPe.setSelected(true);
        jCPe.setText("PE");
        jCPe.setToolTipText("Documentos aun pendientes");
        jCPe.setNextFocusableComponent(jCCo);
        jCPe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCPeActionPerformed(evt);
            }
        });
        jCPe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jCPeKeyPressed(evt);
            }
        });
        jP1.add(jCPe, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 80, -1));

        jCCo.setBackground(new java.awt.Color(255, 255, 255));
        jCCo.setText("CO");
        jCCo.setToolTipText("Documentos confirmados");
        jCCo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCCoActionPerformed(evt);
            }
        });
        jCCo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jCCoKeyPressed(evt);
            }
        });
        jP1.add(jCCo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 80, -1));

        jBVerA.setBackground(new java.awt.Color(255, 255, 255));
        jBVerA.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBVerA.setForeground(new java.awt.Color(0, 102, 0));
        jBVerA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/abon.png"))); // NOI18N
        jBVerA.setText("Abonos");
        jBVerA.setToolTipText("Ver Todos los Abonos de Compra(s) (F2)");
        jBVerA.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBVerA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBVerAMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBVerAMouseExited(evt);
            }
        });
        jBVerA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVerAActionPerformed(evt);
            }
        });
        jBVerA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBVerAKeyPressed(evt);
            }
        });
        jP1.add(jBVerA, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 230, 120, 30));

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
        jTCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTCliActionPerformed(evt);
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
        jP1.add(jTCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 120, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("De:");
        jP1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 40, -1));

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
        jP1.add(jTNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 230, 20));

        jBCli.setBackground(new java.awt.Color(255, 255, 255));
        jBCli.setText("...");
        jBCli.setToolTipText("Buscar Cliente(s)");
        jBCli.setNextFocusableComponent(jTNom);
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
        jP1.add(jBCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 30, 20));

        jCVen.setBackground(new java.awt.Color(255, 255, 255));
        jCVen.setText("Vencido a:");
        jCVen.setNextFocusableComponent(jTDia);
        jCVen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCVenActionPerformed(evt);
            }
        });
        jCVen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jCVenKeyPressed(evt);
            }
        });
        jP1.add(jCVen, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 90, 20));

        jBVis.setBackground(new java.awt.Color(255, 255, 255));
        jBVis.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBVis.setForeground(new java.awt.Color(0, 102, 0));
        jBVis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/visor.png"))); // NOI18N
        jBVis.setText("Reporte");
        jBVis.setToolTipText("Reporte (F6)");
        jBVis.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBVis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBVisMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBVisMouseExited(evt);
            }
        });
        jBVis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVisActionPerformed(evt);
            }
        });
        jBVis.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBVisKeyPressed(evt);
            }
        });
        jP1.add(jBVis, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 260, 120, 30));

        jTDia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTDia.setText("30");
        jTDia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTDia.setNextFocusableComponent(jTabCXC);
        jTDia.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTDiaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTDiaFocusLost(evt);
            }
        });
        jTDia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTDiaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTDiaKeyTyped(evt);
            }
        });
        jP1.add(jTDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 30, 20));

        jTCond.setEditable(false);
        jTCond.setBackground(new java.awt.Color(255, 255, 204));
        jTCond.setForeground(new java.awt.Color(0, 153, 0));
        jTCond.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTCond.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTCond.setFocusable(false);
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
        jP1.add(jTCond, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 380, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Cliente:");
        jP1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 80, -1));
        jP1.add(jCalendarFrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, -1, -1));
        jP1.add(jCalendarUntil, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 20, -1, -1));

        jBSearch.setBackground(new java.awt.Color(255, 255, 255));
        jBSearch.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBSearch.setForeground(new java.awt.Color(0, 102, 0));
        jBSearch.setText("Buscar");
        jBSearch.setToolTipText("Abonar a Venta");
        jBSearch.setNextFocusableComponent(jBVerA);
        jBSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBSearchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBSearchMouseExited(evt);
            }
        });
        jBSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSearchActionPerformed(evt);
            }
        });
        jBSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBSearchKeyPressed(evt);
            }
        });
        jP1.add(jBSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 90, 30));

        jScrollPane1.setViewportView(jTabCXC);

        jP1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 840, 230));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jP1, javax.swing.GroupLayout.DEFAULT_SIZE, 990, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jP1, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void jBAbonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAbonActionPerformed

    
        
    }//GEN-LAST:event_jBAbonActionPerformed
   
   
    
    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        
    
        
    }//GEN-LAST:event_formKeyPressed

   
    
    private void jBAbonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBAbonKeyPressed
        
    
        
    }//GEN-LAST:event_jBAbonKeyPressed

        
    
    private void jP1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jP1KeyPressed
        
    
        
    }//GEN-LAST:event_jP1KeyPressed

    
    
    private void jBSalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalActionPerformed
        
    
        
    }//GEN-LAST:event_jBSalActionPerformed

    
    
    private void jBSalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBSalKeyPressed
        
    
        
    }//GEN-LAST:event_jBSalKeyPressed
    
    
    
        
    
    private void jTabCXCKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTabCXCKeyPressed
        
    
        
    }//GEN-LAST:event_jTabCXCKeyPressed
    
    
                    
    
    
    private void jBVerAKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBVerAKeyPressed
        
    
        
    }//GEN-LAST:event_jBVerAKeyPressed

    
    
    
    
    private void jCPeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCPeKeyPressed
        
    
        
    }//GEN-LAST:event_jCPeKeyPressed

    
    
    private void jCCoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCCoKeyPressed
        
    
        
    }//GEN-LAST:event_jCCoKeyPressed

    
    
    private void jCPeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCPeActionPerformed

    
        
    }//GEN-LAST:event_jCPeActionPerformed

    
    
    private void jCCoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCCoActionPerformed

    

    }//GEN-LAST:event_jCCoActionPerformed

    
    
    private void jDTDeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jDTDeKeyPressed
        
    
        
    }//GEN-LAST:event_jDTDeKeyPressed

    
    
    private void jDTAKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jDTAKeyPressed
                
    
        
    }//GEN-LAST:event_jDTAKeyPressed
    
    
    
    private void jDTDePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDTDePropertyChange
        
    
        
    }//GEN-LAST:event_jDTDePropertyChange

    
    
    private void jDTAPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDTAPropertyChange
        
    
        
    }//GEN-LAST:event_jDTAPropertyChange

    
    
    private void jTCliFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCliFocusGained
        
    
        
    }//GEN-LAST:event_jTCliFocusGained

    
    
    private void jTCliKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTCliKeyPressed
        
    
        
    }//GEN-LAST:event_jTCliKeyPressed

    
    
    private void jBCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCliActionPerformed
        
    
        
    }//GEN-LAST:event_jBCliActionPerformed

    
    
    private void jTCliKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTCliKeyTyped
        
    
        
    }//GEN-LAST:event_jTCliKeyTyped

    
    
    private void jTCliFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCliFocusLost

    
        
    }//GEN-LAST:event_jTCliFocusLost

    
    
    private void jBVerAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVerAActionPerformed
        

    }//GEN-LAST:event_jBVerAActionPerformed

    

    private void jBCliKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBCliKeyPressed
        

            
    }//GEN-LAST:event_jBCliKeyPressed

    

    private void jCVenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCVenActionPerformed



    }//GEN-LAST:event_jCVenActionPerformed

    

    private void jCVenKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCVenKeyPressed



    }//GEN-LAST:event_jCVenKeyPressed

    

    

    

    private void formMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_formMouseWheelMoved
        

        
    }//GEN-LAST:event_formMouseWheelMoved

    

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        

        
    }//GEN-LAST:event_formMouseDragged

    

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        

        
    }//GEN-LAST:event_formMouseMoved

    

    private void jBVisKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBVisKeyPressed
        
        
        
    }//GEN-LAST:event_jBVisKeyPressed

        
    private void jBVisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVisActionPerformed
        
    
        
    }//GEN-LAST:event_jBVisActionPerformed

    
    
    
    
    
    
    
    
    
    
    
   
    
   
    
   
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        
        
        
    }//GEN-LAST:event_formWindowClosing

    
    
    private void jBCliMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBCliMouseEntered
        
    
        
    }//GEN-LAST:event_jBCliMouseEntered

    
    
        
    private void jBAbonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBAbonMouseEntered
        
    
        
    }//GEN-LAST:event_jBAbonMouseEntered

    
    
    private void jBVerAMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBVerAMouseEntered
        
    
        
    }//GEN-LAST:event_jBVerAMouseEntered

    
    
    
    
    private void jBVisMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBVisMouseEntered
        
    
        
    }//GEN-LAST:event_jBVisMouseEntered

    
    
    private void jBSalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSalMouseEntered
        
    
        
    }//GEN-LAST:event_jBSalMouseEntered

    
    
    private void jBCliMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBCliMouseExited
        
    
        
    }//GEN-LAST:event_jBCliMouseExited

    
    
    
    
    private void jBAbonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBAbonMouseExited
        
    
        
    }//GEN-LAST:event_jBAbonMouseExited

    
    
    private void jBVerAMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBVerAMouseExited
        
    
        
    }//GEN-LAST:event_jBVerAMouseExited

    
    
    
   
    private void jBVisMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBVisMouseExited
        
   
        
    }//GEN-LAST:event_jBVisMouseExited

    
   
    private void jBSalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSalMouseExited
        
   
        
    }//GEN-LAST:event_jBSalMouseExited

    
   
    private void jTNomFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTNomFocusLost
        
   
        
    }//GEN-LAST:event_jTNomFocusLost

    
   
    
   
    
   
    
   
    
   
    
   

   
    
   
    
   
    
   
    
   
    
   
    
   
    private void jTDiaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTDiaKeyTyped
        
   
        
    }//GEN-LAST:event_jTDiaKeyTyped

    
   
    private void jTDiaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTDiaKeyPressed
        
   
        
    }//GEN-LAST:event_jTDiaKeyPressed

    
   
    private void jTDiaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTDiaFocusGained
        
   
        
    }//GEN-LAST:event_jTDiaFocusGained

    
   
    private void jTDiaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTDiaFocusLost
        
   
        
    }//GEN-LAST:event_jTDiaFocusLost

    
   
    
   
    
   
    
   
    
   
    
   
   
   
    
   
    
   
    
   
    
    
    
    
    
    
    private void jTCondFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCondFocusGained
        
    
        
    }//GEN-LAST:event_jTCondFocusGained

    
    
    private void jTCondFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCondFocusLost
        
    
        
    }//GEN-LAST:event_jTCondFocusLost

    
    
    private void jTCondKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTCondKeyPressed
        
        
        
    }//GEN-LAST:event_jTCondKeyPressed

    
    
    private void jTNomFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTNomFocusGained
        
    
        
    }//GEN-LAST:event_jTNomFocusGained

    
    
    private void jTNomKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTNomKeyPressed
 
    
        
    }//GEN-LAST:event_jTNomKeyPressed

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    private void jTFolBancFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFolBancFocusGained

    

    }//GEN-LAST:event_jTFolBancFocusGained

    
    
    private void jTFolBancFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFolBancFocusLost

    

    }//GEN-LAST:event_jTFolBancFocusLost

    
    
    
    private void jTFolBancKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFolBancKeyPressed

    

    }//GEN-LAST:event_jTFolBancKeyPressed

    
    
    private void jTFolBancKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFolBancKeyTyped



    }//GEN-LAST:event_jTFolBancKeyTyped

    private void jTCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTCliActionPerformed

    private void jBSearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSearchMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jBSearchMouseEntered

    private void jBSearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSearchMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jBSearchMouseExited

    private void jBSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBSearchActionPerformed

    private void jBSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBSearchKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBSearchKeyPressed
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton jBAbon;
    protected javax.swing.JButton jBCli;
    protected javax.swing.JButton jBSal;
    protected javax.swing.JButton jBSearch;
    protected javax.swing.JButton jBVerA;
    protected javax.swing.JButton jBVis;
    protected javax.swing.JCheckBox jCCo;
    protected javax.swing.JCheckBox jCPe;
    protected javax.swing.JCheckBox jCVen;
    protected com.toedter.calendar.JCalendar jCalendarFrom;
    protected com.toedter.calendar.JCalendar jCalendarUntil;
    protected javax.swing.JLabel jLabel3;
    protected javax.swing.JLabel jLabel6;
    protected javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jP1;
    private javax.swing.JScrollPane jScrollPane1;
    protected javax.swing.JTextField jTCli;
    protected javax.swing.JTextField jTCond;
    protected javax.swing.JTextField jTDia;
    protected javax.swing.JTextField jTNom;
    protected com.era.views.tables.CxcTable jTabCXC;
    // End of variables declaration//GEN-END:variables

}/*Fin de public class Clientes extends javax.swing.JFrame */
