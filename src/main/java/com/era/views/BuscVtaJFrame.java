package com.era.views;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;




public class BuscVtaJFrame extends javax.swing.JFrame
{
    public BuscVtaJFrame() 
    {           
        initComponents();

        this.setAlwaysOnTop(true);
        
        jTab.getColumnModel().getColumn(6).setPreferredWidth(150);
        jTab.getColumnModel().getColumn(8).setPreferredWidth(150);
        jTab.getColumnModel().getColumn(9).setPreferredWidth(150);
        
        this.getRootPane().setDefaultButton(jBCarg);
                        
        jTab.setAutoResizeMode(0);
        
        jTab.getTableHeader().setReorderingAllowed(false);
        
        this.setLocationRelativeTo(null);
        
        this.setAlwaysOnTop(true);
        
        TableRowSorter trs = new TableRowSorter<>((DefaultTableModel)jTab.getModel());
        jTab.setRowSorter(trs);
        trs.setSortsOnUpdates(true);
        
        jTab.grabFocus();
        
        jTab.setFocusTraversalKeys(java.awt.KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, null);
        jTab.setFocusTraversalKeys(java.awt.KeyboardFocusManager.BACKWARD_TRAVERSAL_KEYS, null);                                
        
    }

    
    
        
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jP1 = new javax.swing.JPanel();
        jBCarg = new javax.swing.JButton();
        jBSal = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTab = new javax.swing.JTable();
        jLTot = new javax.swing.JLabel();
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

        jBCarg.setBackground(new java.awt.Color(255, 255, 255));
        jBCarg.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBCarg.setForeground(new java.awt.Color(0, 102, 0));
        jBCarg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/carg.png"))); // NOI18N
        jBCarg.setText("Aceptar");
        jBCarg.setToolTipText("Aceptar (ENTER)");
        jBCarg.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBCarg.setNextFocusableComponent(jBSal);
        jBCarg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBCargMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBCargMouseExited(evt);
            }
        });
        jBCarg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCargActionPerformed(evt);
            }
        });
        jBCarg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBCargKeyPressed(evt);
            }
        });
        jP1.add(jBCarg, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, 140, 30));

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
        jP1.add(jBSal, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, 140, 30));

        jTab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Fecha", "Folio", "Serie", "Tipo Documento", "Cod.Cliente", "Método Pago", "Fecha Vencimiento", "SubTotal", "Impuesto", "Total", "Estado", "Observaciones", "Timbrada"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTab.setGridColor(new java.awt.Color(255, 255, 255));
        jTab.setInheritsPopupMenu(true);
        jTab.setNextFocusableComponent(jBCarg);
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
        jScrollPane2.setViewportView(jTab);

        jP1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 300));

        jLTot.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLTot.setForeground(new java.awt.Color(204, 0, 0));
        jLTot.setFocusable(false);
        jP1.add(jLTot, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 140, 120, 20));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setText("TOTAL:");
        jP1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 110, 90, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jP1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jP1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
        
    
    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        
    
        
    }//GEN-LAST:event_formKeyPressed
   
    
    
    private void jP1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jP1KeyPressed
        
    
        
    }//GEN-LAST:event_jP1KeyPressed

    
    
    private void jBSalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalActionPerformed
        
    
        
    }//GEN-LAST:event_jBSalActionPerformed

    
    
    private void jBSalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBSalKeyPressed
        
    
        
    }//GEN-LAST:event_jBSalKeyPressed

    
    
    private void jTabKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTabKeyPressed
        
    
        
    }//GEN-LAST:event_jTabKeyPressed
       
    
    
    private void jBCargKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBCargKeyPressed

    

    }//GEN-LAST:event_jBCargKeyPressed

    
    
    private void jBCargActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCargActionPerformed

    
        
    }//GEN-LAST:event_jBCargActionPerformed

    
    
    private void jTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabMouseClicked
        
    
        
    }//GEN-LAST:event_jTabMouseClicked

    
    
    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
       
    
        
    }//GEN-LAST:event_formMouseDragged

    
    
    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        
    
        
    }//GEN-LAST:event_formMouseMoved

    
    
    private void formMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_formMouseWheelMoved
        
    
        
    }//GEN-LAST:event_formMouseWheelMoved

            
    
    
    
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        
    
        
    }//GEN-LAST:event_formWindowClosing

    
    
    private void jBCargMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBCargMouseEntered
        
    
        
    }//GEN-LAST:event_jBCargMouseEntered

    
    
    private void jBSalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSalMouseEntered
        
    
        
    }//GEN-LAST:event_jBSalMouseEntered

    
    
    private void jBCargMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBCargMouseExited
        
    
        
    }//GEN-LAST:event_jBCargMouseExited

    
    
    private void jBSalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSalMouseExited
        
    
        
    }//GEN-LAST:event_jBSalMouseExited
    
        
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCarg;
    private javax.swing.JButton jBSal;
    private javax.swing.JLabel jLTot;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jP1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTab;
    // End of variables declaration//GEN-END:variables

}