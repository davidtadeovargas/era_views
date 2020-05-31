//Paquete
package com.era.views;



public abstract class CompsJFrame extends BaseJFrame
{
    public CompsJFrame(final String idTextTitleWindow)
    {              
        super(idTextTitleWindow);
        
        initComponents();
            
        //Post inicialization
        postInitComponents();
        
        this.getRootPane().setDefaultButton(jBNew);
        
        jTProd.grabFocus();
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jP1 = new javax.swing.JPanel();
        jBDel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jBSal = new javax.swing.JButton();
        jBNew = new javax.swing.JButton();
        jTDescrip = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTab = new javax.swing.JTable();
        jBBusc = new javax.swing.JButton();
        jTBusc = new javax.swing.JTextField();
        jBMostT = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTCant = new javax.swing.JTextField();
        jTKit = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTDescripKit = new javax.swing.JTextField();
        jTProd = new javax.swing.JTextField();
        jBBusc1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

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
        jBDel.setToolTipText("Borrar Componente(s) (Ctrl+SUPR)");
        jBDel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBDel.setNextFocusableComponent(jBSal);
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
        jP1.add(jBDel, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 180, 110, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Descripción del kit:");
        jP1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 270, -1));

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
        jP1.add(jBSal, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 210, 110, 30));

        jBNew.setBackground(new java.awt.Color(255, 255, 255));
        jBNew.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBNew.setForeground(new java.awt.Color(0, 102, 0));
        jBNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/agre.png"))); // NOI18N
        jBNew.setText("Nuevo");
        jBNew.setToolTipText("Nuevo Componente (Ctrl+N)");
        jBNew.setNextFocusableComponent(jTCant);
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
        jP1.add(jBNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, 110, 20));

        jTDescrip.setEditable(false);
        jTDescrip.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
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
        jP1.add(jTDescrip, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 270, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Componentes:");
        jP1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 160, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Cod. Kit:");
        jP1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 80, -1));

        jTab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Cod. Kit", "Cod. Producto", "Cantidad", "Descripción Producto"
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

        jP1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 640, 250));

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
        jP1.add(jBBusc, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 140, 20));

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
        jP1.add(jTBusc, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 430, 360, 20));

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
        jP1.add(jBMostT, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 430, 140, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("*Producto:");
        jP1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, -1));

        jTCant.setText("1");
        jTCant.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTCant.setNextFocusableComponent(jTab);
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
        jP1.add(jTCant, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 90, 20));

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
        jTKit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTKitKeyPressed(evt);
            }
        });
        jP1.add(jTKit, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 90, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("*Cantidad:");
        jP1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 80, -1));

        jTDescripKit.setEditable(false);
        jTDescripKit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTDescripKit.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTDescripKitFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTDescripKitFocusLost(evt);
            }
        });
        jTDescripKit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTDescripKitKeyPressed(evt);
            }
        });
        jP1.add(jTDescripKit, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 270, 20));

        jTProd.setBackground(new java.awt.Color(255, 255, 153));
        jTProd.setToolTipText("Ctrl+B búsqueda avanzada");
        jTProd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTProd.setNextFocusableComponent(jBBusc1);
        jTProd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTProdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTProdFocusLost(evt);
            }
        });
        jTProd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTProdKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTProdKeyTyped(evt);
            }
        });
        jP1.add(jTProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 170, 20));

        jBBusc1.setBackground(new java.awt.Color(255, 255, 255));
        jBBusc1.setText("...");
        jBBusc1.setToolTipText("Buscar Producto(s)");
        jBBusc1.setNextFocusableComponent(jBNew);
        jBBusc1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBBusc1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBBusc1MouseExited(evt);
            }
        });
        jBBusc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBusc1ActionPerformed(evt);
            }
        });
        jBBusc1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBBusc1KeyPressed(evt);
            }
        });
        jP1.add(jBBusc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 30, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Descripción del producto:");
        jP1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 270, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jP1, javax.swing.GroupLayout.DEFAULT_SIZE, 779, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jP1, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
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

        
    private void jTDescripKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTDescripKeyPressed

        
    }//GEN-LAST:event_jTDescripKeyPressed

        
    private void jTabKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTabKeyPressed
        
        
    }//GEN-LAST:event_jTabKeyPressed

        
    private void jTDescripFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTDescripFocusGained
        
        
    }//GEN-LAST:event_jTDescripFocusGained
           
        
    private void jBNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNewActionPerformed
            
         
    }//GEN-LAST:event_jBNewActionPerformed
        
        
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

            
    private void jTCantFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCantFocusGained
        
        
    }//GEN-LAST:event_jTCantFocusGained

        
    private void jTKitFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTKitFocusGained
        
        
    }//GEN-LAST:event_jTKitFocusGained

        
    private void jTCantKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTCantKeyPressed
        
        
    }//GEN-LAST:event_jTCantKeyPressed

        
    private void jTKitKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTKitKeyPressed
        
        
    }//GEN-LAST:event_jTKitKeyPressed

        
    private void jTCantFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCantFocusLost
    
        
    }//GEN-LAST:event_jTCantFocusLost

    
    private void jTCantKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTCantKeyTyped
           
        
    }//GEN-LAST:event_jTCantKeyTyped

        
    private void jTDescripKitFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTDescripKitFocusGained
        
        
    }//GEN-LAST:event_jTDescripKitFocusGained

        
    private void jTDescripKitKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTDescripKitKeyPressed
        
        
    }//GEN-LAST:event_jTDescripKitKeyPressed

        
    private void jTProdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTProdFocusGained

    
    }//GEN-LAST:event_jTProdFocusGained

        
    private void jTProdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTProdFocusLost

    
        
    }//GEN-LAST:event_jTProdFocusLost

       
    private void jTProdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTProdKeyPressed

    

    }//GEN-LAST:event_jTProdKeyPressed

        
    private void jTProdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTProdKeyTyped
    

    }//GEN-LAST:event_jTProdKeyTyped

    
    private void jBBusc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBusc1ActionPerformed
            

    }//GEN-LAST:event_jBBusc1ActionPerformed

        
    private void jBBusc1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBBusc1KeyPressed

    
    }//GEN-LAST:event_jBBusc1KeyPressed
                           
        
    private void formMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_formMouseWheelMoved
        
        
    }//GEN-LAST:event_formMouseWheelMoved

          
    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        
        
    }//GEN-LAST:event_formMouseDragged

        
    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        
        
    }//GEN-LAST:event_formMouseMoved

        
        
        
    private void jBBuscMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBBuscMouseExited
        
    
        
    }//GEN-LAST:event_jBBuscMouseExited

    
    private void jBBuscMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBBuscMouseEntered
            
        
    }//GEN-LAST:event_jBBuscMouseEntered

                
    
    
  
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        
        
    }//GEN-LAST:event_formWindowClosing

      
    private void jBBusc1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBBusc1MouseEntered
        
        
    }//GEN-LAST:event_jBBusc1MouseEntered

        
    private void jBNewMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBNewMouseEntered
        
        
    }//GEN-LAST:event_jBNewMouseEntered

        
        
    private void jBDelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBDelMouseEntered
        
        
    }//GEN-LAST:event_jBDelMouseEntered

        
    private void jBSalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSalMouseEntered
        
        
    }//GEN-LAST:event_jBSalMouseEntered

        
    private void jBMostTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBMostTMouseEntered
        
        
    }//GEN-LAST:event_jBMostTMouseEntered

        
    private void jBBusc1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBBusc1MouseExited
        
        
    }//GEN-LAST:event_jBBusc1MouseExited

        
    private void jBNewMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBNewMouseExited
        
        
    }//GEN-LAST:event_jBNewMouseExited

        
        
    private void jBDelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBDelMouseExited
        
        
    }//GEN-LAST:event_jBDelMouseExited

        
    private void jBSalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSalMouseExited
        
        
    }//GEN-LAST:event_jBSalMouseExited

        
    private void jBMostTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBMostTMouseExited
        
        
    }//GEN-LAST:event_jBMostTMouseExited

        
    private void jTBuscFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTBuscFocusLost
        
        
    }//GEN-LAST:event_jTBuscFocusLost

        
    private void jTDescripFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTDescripFocusLost
        
    
    }//GEN-LAST:event_jTDescripFocusLost

    
        
    private void jTKitFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTKitFocusLost
        
        
    }//GEN-LAST:event_jTKitFocusLost

    
    private void jTDescripKitFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTDescripKitFocusLost
        
        
    }//GEN-LAST:event_jTDescripKitFocusLost
       
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton jBBusc;
    protected javax.swing.JButton jBBusc1;
    protected javax.swing.JButton jBDel;
    protected javax.swing.JButton jBMostT;
    protected javax.swing.JButton jBNew;
    protected javax.swing.JButton jBSal;
    protected javax.swing.JLabel jLabel1;
    protected javax.swing.JLabel jLabel2;
    protected javax.swing.JLabel jLabel3;
    protected javax.swing.JLabel jLabel4;
    protected javax.swing.JLabel jLabel5;
    protected javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jP1;
    protected javax.swing.JScrollPane jScrollPane2;
    protected javax.swing.JTextField jTBusc;
    protected javax.swing.JTextField jTCant;
    protected javax.swing.JTextField jTDescrip;
    protected javax.swing.JTextField jTDescripKit;
    protected javax.swing.JTextField jTKit;
    protected javax.swing.JTextField jTProd;
    private javax.swing.JTable jTab;
    // End of variables declaration//GEN-END:variables

}/*Fin de public class Clientes extends javax.swing.JFrame */
