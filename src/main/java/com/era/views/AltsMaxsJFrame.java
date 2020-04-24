package com.era.views;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;



public class AltsMaxsJFrame extends BaseJFrame 
{
    public AltsMaxsJFrame() 
    {                                       
        initComponents();
        
        jTab.getTableHeader().setReorderingAllowed(false);
        
        TableRowSorter trs = new TableRowSorter<>((DefaultTableModel)jTab.getModel());
        jTab.setRowSorter(trs);
        trs.setSortsOnUpdates(true);
        
        jTBusc.grabFocus();
        
        jTab.setFocusTraversalKeys(java.awt.KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, null);
        jTab.setFocusTraversalKeys(java.awt.KeyboardFocusManager.BACKWARD_TRAVERSAL_KEYS, null);
    }

        
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jP1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jBSal = new javax.swing.JButton();
        jSP1 = new javax.swing.JScrollPane();
        jTab = new javax.swing.JTable();
        jBBusc = new javax.swing.JButton();
        jTBusc = new javax.swing.JTextField();
        jBMostT = new javax.swing.JButton();
        jBVis = new javax.swing.JButton();
        jBActua = new javax.swing.JButton();
        jBTabG = new javax.swing.JButton();

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

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Productos arriba del máximo:");
        jP1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 310, -1));

        jBSal.setBackground(new java.awt.Color(255, 255, 255));
        jBSal.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBSal.setForeground(new java.awt.Color(0, 102, 0));
        jBSal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/sal.png"))); // NOI18N
        jBSal.setText("Salir");
        jBSal.setToolTipText("Salir (ESC)");
        jBSal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBSal.setNextFocusableComponent(jTab);
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
        jP1.add(jBSal, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 90, 120, 30));

        jSP1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jSP1KeyPressed(evt);
            }
        });

        jTab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Cod. Producto", "Cod. Op. 1", "Cod. Op. 2", "Descripción", "Información", "Cod. Almacén", "Cod. Anaquel", "Cod. Lugar", "Existencia", "Mínimo", "Máximo"
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
        jTab.setNextFocusableComponent(jBBusc);
        jTab.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTab.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTabKeyPressed(evt);
            }
        });
        jSP1.setViewportView(jTab);

        jP1.add(jSP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 1000, 500));

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
        jP1.add(jBBusc, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 130, 20));

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
        jP1.add(jTBusc, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 530, 730, 20));

        jBMostT.setBackground(new java.awt.Color(255, 255, 255));
        jBMostT.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBMostT.setForeground(new java.awt.Color(0, 102, 0));
        jBMostT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/mostt.png"))); // NOI18N
        jBMostT.setText("Mostrar F4");
        jBMostT.setToolTipText("Mostrar Nuevamente todos los Registros");
        jBMostT.setNextFocusableComponent(jBVis);
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
        jP1.add(jBMostT, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 530, 140, 20));

        jBVis.setBackground(new java.awt.Color(255, 255, 255));
        jBVis.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBVis.setForeground(new java.awt.Color(0, 102, 0));
        jBVis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/visor.png"))); // NOI18N
        jBVis.setText("Reporte");
        jBVis.setToolTipText("Generar Reporte (Ctrl+R)");
        jBVis.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBVis.setNextFocusableComponent(jBActua);
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
        jP1.add(jBVis, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 30, 120, 30));

        jBActua.setBackground(new java.awt.Color(255, 255, 255));
        jBActua.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBActua.setForeground(new java.awt.Color(0, 102, 0));
        jBActua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/actualizar.png"))); // NOI18N
        jBActua.setText("Actualizar");
        jBActua.setToolTipText("Actualizar Registros (F5)");
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
        jP1.add(jBActua, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 60, 120, 30));

        jBTabG.setBackground(new java.awt.Color(0, 153, 153));
        jBTabG.setToolTipText("Mostrar Tabla en Grande");
        jBTabG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTabGActionPerformed(evt);
            }
        });
        jBTabG.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBTabGKeyPressed(evt);
            }
        });
        jP1.add(jBTabG, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 10, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jP1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jP1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

        
    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        
    
        
    }//GEN-LAST:event_formKeyPressed
    
       
    private void jP1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jP1KeyPressed
        
   
        
    }//GEN-LAST:event_jP1KeyPressed

      
    private void jBSalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBSalKeyPressed
        
    
        
    }//GEN-LAST:event_jBSalKeyPressed

        
    private void jBSalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalActionPerformed
            
        
    }//GEN-LAST:event_jBSalActionPerformed

            
    private void jTabKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTabKeyPressed
            
        
    }//GEN-LAST:event_jTabKeyPressed
               
            
    private void jTBuscFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTBuscFocusGained
                
        
    }//GEN-LAST:event_jTBuscFocusGained

        
    private void jTBuscKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTBuscKeyPressed
        
        
    }//GEN-LAST:event_jTBuscKeyPressed

    
    private void jBBuscKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBBuscKeyPressed
        
        
        
    }//GEN-LAST:event_jBBuscKeyPressed

           
    private void jBMostTKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBMostTKeyPressed
        
       
        
    }//GEN-LAST:event_jBMostTKeyPressed
    

    
    private void jBMostTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMostTActionPerformed
        
        
    }//GEN-LAST:event_jBMostTActionPerformed

       
    private void jBBuscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscActionPerformed
                
        
    }//GEN-LAST:event_jBBuscActionPerformed

    
    
    private void jBVisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVisActionPerformed
        
                
    }//GEN-LAST:event_jBVisActionPerformed

    
    private void jBVisKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBVisKeyPressed

    
    }//GEN-LAST:event_jBVisKeyPressed

        
    private void jBActuaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBActuaKeyPressed

    

    }//GEN-LAST:event_jBActuaKeyPressed

        
    private void jBActuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBActuaActionPerformed
        
    
        
    }//GEN-LAST:event_jBActuaActionPerformed

        
    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        
    
        
    }//GEN-LAST:event_formMouseMoved

    
   
    private void formMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_formMouseWheelMoved
        
   
        
    }//GEN-LAST:event_formMouseWheelMoved

       
    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        
    
        
    }//GEN-LAST:event_formMouseDragged

    private void jBTabGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTabGActionPerformed

    

    }//GEN-LAST:event_jBTabGActionPerformed

        
    private void jBTabGKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBTabGKeyPressed

    

    }//GEN-LAST:event_jBTabGKeyPressed

    
    private void jSP1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jSP1KeyPressed
        
    
        
    }//GEN-LAST:event_jSP1KeyPressed

        
    private void jBBuscMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBBuscMouseEntered
        
    
        
    }//GEN-LAST:event_jBBuscMouseEntered

        
    private void jBBuscMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBBuscMouseExited
        
    
        
    }//GEN-LAST:event_jBBuscMouseExited

    
    
        
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        

        
    }//GEN-LAST:event_formWindowClosing

    

    private void jBVisMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBVisMouseEntered
        

        
    }//GEN-LAST:event_jBVisMouseEntered

        
    private void jBActuaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBActuaMouseEntered
        
    
        
    }//GEN-LAST:event_jBActuaMouseEntered

        
    private void jBSalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSalMouseEntered
        
    
        
    }//GEN-LAST:event_jBSalMouseEntered

        
    private void jBMostTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBMostTMouseEntered
        
    
        
    }//GEN-LAST:event_jBMostTMouseEntered

        
    private void jBVisMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBVisMouseExited
        
    
        
    }//GEN-LAST:event_jBVisMouseExited

        
    private void jBActuaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBActuaMouseExited
        
    
        
    }//GEN-LAST:event_jBActuaMouseExited

        
    private void jBSalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSalMouseExited
        
    
        
    }//GEN-LAST:event_jBSalMouseExited

        
    private void jBMostTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBMostTMouseExited
        
    
        
    }//GEN-LAST:event_jBMostTMouseExited

        
    private void jTBuscFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTBuscFocusLost

    

    }//GEN-LAST:event_jTBuscFocusLost
      
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBActua;
    private javax.swing.JButton jBBusc;
    private javax.swing.JButton jBMostT;
    private javax.swing.JButton jBSal;
    private javax.swing.JButton jBTabG;
    private javax.swing.JButton jBVis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jP1;
    private javax.swing.JScrollPane jSP1;
    private javax.swing.JTextField jTBusc;
    private javax.swing.JTable jTab;
    // End of variables declaration//GEN-END:variables

}
