package com.era.views;




public abstract class MaxsMinsJFrame extends BaseJFrame
{    
    public MaxsMinsJFrame(final String idTextTitleWindow) 
    {                        
        super(idTextTitleWindow);
        
        initComponents();
        
        postInitComponents();
    }

        
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jP1 = new javax.swing.JPanel();
        jBDel = new javax.swing.JButton();
        jBSal = new javax.swing.JButton();
        jBNew = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTab = new com.era.views.tables.MaxminconfTable();
        jLabel4 = new javax.swing.JLabel();
        jTEsta = new javax.swing.JTextField();
        jBBus3 = new javax.swing.JButton();

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
        jBDel.setToolTipText("Borrar Usuario(s) (Ctrl+SUPR)");
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
        jP1.add(jBDel, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, 110, 30));

        jBSal.setBackground(new java.awt.Color(255, 255, 255));
        jBSal.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBSal.setForeground(new java.awt.Color(0, 102, 0));
        jBSal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/sal.png"))); // NOI18N
        jBSal.setText("Salir");
        jBSal.setToolTipText("Salir (ESC)");
        jBSal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBSal.setNextFocusableComponent(jTEsta);
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
        jP1.add(jBSal, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, 110, 30));

        jBNew.setBackground(new java.awt.Color(255, 255, 255));
        jBNew.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBNew.setForeground(new java.awt.Color(0, 102, 0));
        jBNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/agre.png"))); // NOI18N
        jBNew.setText("Nuevo");
        jBNew.setToolTipText("Nuevo Usuario (Ctrl+N)");
        jBNew.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBNew.setNextFocusableComponent(jTab);
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
        jP1.add(jBNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, 90, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Usuarios:");
        jP1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 160, -1));

        jTab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Código"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTab.setGridColor(new java.awt.Color(255, 255, 255));
        jTab.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTab.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTabKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(jTab);

        jP1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 470, 250));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("*Usuario:");
        jP1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 140, -1));

        jTEsta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTEsta.setNextFocusableComponent(jBBus3);
        jTEsta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTEstaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTEstaFocusLost(evt);
            }
        });
        jTEsta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTEstaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTEstaKeyTyped(evt);
            }
        });
        jP1.add(jTEsta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 210, 20));

        jBBus3.setBackground(new java.awt.Color(255, 255, 255));
        jBBus3.setText("...");
        jBBus3.setToolTipText("Buscar Usuario(s)");
        jBBus3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBBus3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBBus3MouseExited(evt);
            }
        });
        jBBus3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBus3ActionPerformed(evt);
            }
        });
        jBBus3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBBus3KeyPressed(evt);
            }
        });
        jP1.add(jBBus3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 30, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jP1, javax.swing.GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jP1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        
    private void jTabKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTabKeyPressed
        
        
    }//GEN-LAST:event_jTabKeyPressed

        
    private void jBNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNewActionPerformed
                                                   
         
    }//GEN-LAST:event_jBNewActionPerformed
        
        
        
    
    
        
        
            
        
        
    
       
    private void jTEstaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTEstaFocusGained

    
    }//GEN-LAST:event_jTEstaFocusGained
        
        
    private void jTEstaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTEstaKeyPressed
    
        
    }//GEN-LAST:event_jTEstaKeyPressed
    
    
    private void jTEstaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTEstaKeyTyped
    
        
    }//GEN-LAST:event_jTEstaKeyTyped

    
    private void jBBus3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBus3ActionPerformed
    

    }//GEN-LAST:event_jBBus3ActionPerformed

   
    private void jBBus3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBBus3KeyPressed

        
    }//GEN-LAST:event_jBBus3KeyPressed

       
    private void formMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_formMouseWheelMoved
        
        
    }//GEN-LAST:event_formMouseWheelMoved

        
    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        
        
    }//GEN-LAST:event_formMouseDragged

       
    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        
        
    }//GEN-LAST:event_formMouseMoved

       
    
        
        
    
            
    
    
    private void jTEstaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTEstaFocusLost
    
        
    }//GEN-LAST:event_jTEstaFocusLost

    
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        
        
    }//GEN-LAST:event_formWindowClosing

      
    private void jBNewMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBNewMouseEntered
        
        
    }//GEN-LAST:event_jBNewMouseEntered

        
        
    private void jBDelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBDelMouseEntered
        
        
    }//GEN-LAST:event_jBDelMouseEntered

        
    private void jBSalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSalMouseEntered
        
        
    }//GEN-LAST:event_jBSalMouseEntered

        
    
    private void jBBus3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBBus3MouseEntered
        
        
    }//GEN-LAST:event_jBBus3MouseEntered

    
    private void jBBus3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBBus3MouseExited
        
    
    }//GEN-LAST:event_jBBus3MouseExited

        
        
    private void jBDelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBDelMouseExited
        
        
    }//GEN-LAST:event_jBDelMouseExited

        
    private void jBSalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSalMouseExited
        
        
    }//GEN-LAST:event_jBSalMouseExited

       
       
    private void jBNewMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBNewMouseExited
        
        
    }//GEN-LAST:event_jBNewMouseExited

                     
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton jBBus3;
    protected javax.swing.JButton jBDel;
    protected javax.swing.JButton jBNew;
    protected javax.swing.JButton jBSal;
    protected javax.swing.JLabel jLabel2;
    protected javax.swing.JLabel jLabel4;
    protected javax.swing.JPanel jP1;
    private javax.swing.JScrollPane jScrollPane2;
    protected javax.swing.JTextField jTEsta;
    protected com.era.views.tables.MaxminconfTable jTab;
    // End of variables declaration//GEN-END:variables

}/*Fin de public class Clientes extends javax.swing.JFrame */
