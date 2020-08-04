package com.era.views;



//Search over catalogs
public abstract class SearchJFrame extends BaseJFrame {
        
    public SearchJFrame(final String idTextTitleWindow) {
        
        super(idTextTitleWindow);
        
        //Init graphic componentes
        initComponents();
        
        postInitComponents();
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelTable = new javax.swing.JPanel();
        jP1 = new javax.swing.JPanel();
        labelPaginacion = new javax.swing.JLabel();
        jBCarg = new javax.swing.JButton();
        jBSal = new javax.swing.JButton();
        jTextFieldSearch = new javax.swing.JTextField();
        jBtnSearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
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

        jPanelTable.setBackground(new java.awt.Color(204, 102, 255));
        jPanelTable.setLayout(new java.awt.BorderLayout());
        getContentPane().add(jPanelTable, java.awt.BorderLayout.CENTER);

        jP1.setBackground(new java.awt.Color(255, 255, 255));
        jP1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jP1KeyPressed(evt);
            }
        });
        jP1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelPaginacion.setText("Paginación:");
        jP1.add(labelPaginacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 240, -1));

        jBCarg.setBackground(new java.awt.Color(255, 255, 255));
        jBCarg.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBCarg.setForeground(new java.awt.Color(0, 102, 0));
        jBCarg.setText("Aceptar");
        jBCarg.setToolTipText("Aceptar (ENTER)");
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
        jP1.add(jBCarg, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, -1, -1));

        jBSal.setBackground(new java.awt.Color(255, 255, 255));
        jBSal.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBSal.setForeground(new java.awt.Color(0, 102, 0));
        jBSal.setText("Salir");
        jBSal.setToolTipText("Salir (ESC)");
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
        jP1.add(jBSal, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 70, -1));
        jP1.add(jTextFieldSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 200, -1));

        jBtnSearch.setBackground(new java.awt.Color(255, 255, 255));
        jBtnSearch.setText("...");
        jP1.add(jBtnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 30, 20));

        getContentPane().add(jP1, java.awt.BorderLayout.PAGE_END);

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
                       
    private void jBCargKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBCargKeyPressed
       
    }//GEN-LAST:event_jBCargKeyPressed
        
    private void jBCargActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCargActionPerformed
                
    }//GEN-LAST:event_jBCargActionPerformed
                            
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
    protected javax.swing.JButton jBCarg;
    protected javax.swing.JButton jBSal;
    protected javax.swing.JButton jBtnSearch;
    protected javax.swing.JPanel jP1;
    protected javax.swing.JPanel jPanelTable;
    protected javax.swing.JTextField jTextFieldSearch;
    protected javax.swing.JLabel labelPaginacion;
    // End of variables declaration//GEN-END:variables
        
}
