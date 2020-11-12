package com.era.views;


public abstract class TipCamJFrame extends BaseJFrame
{    
    public TipCamJFrame(final String idTextTitleWindow) 
    {
        super(idTextTitleWindow);
        
        initComponents();
        
        postInitComponents();
        
        this.getRootPane().setDefaultButton(buttonCancel);
        
        valueTextField.grabFocus();
    }
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jP1 = new javax.swing.JPanel();
        valueTextField = new javax.swing.JTextField();
        buttonCancel = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        buttonAcept = new javax.swing.JButton();

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

        valueTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        valueTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                valueTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                valueTextFieldFocusLost(evt);
            }
        });
        valueTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                valueTextFieldKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                valueTextFieldKeyTyped(evt);
            }
        });
        jP1.add(valueTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 210, 20));

        buttonCancel.setBackground(new java.awt.Color(255, 255, 255));
        buttonCancel.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        buttonCancel.setForeground(new java.awt.Color(0, 102, 0));
        buttonCancel.setText("Cancelar");
        buttonCancel.setToolTipText("Nueva Moneda (Ctrl+N)");
        buttonCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonCancelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonCancelMouseExited(evt);
            }
        });
        buttonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelActionPerformed(evt);
            }
        });
        buttonCancel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                buttonCancelKeyPressed(evt);
            }
        });
        jP1.add(buttonCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 100, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Tipo de cambio:");
        jP1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 140, -1));

        buttonAcept.setBackground(new java.awt.Color(255, 255, 255));
        buttonAcept.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        buttonAcept.setForeground(new java.awt.Color(0, 102, 0));
        buttonAcept.setText("Aceptar");
        buttonAcept.setToolTipText("Nueva Moneda (Ctrl+N)");
        buttonAcept.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonAceptMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonAceptMouseExited(evt);
            }
        });
        buttonAcept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAceptActionPerformed(evt);
            }
        });
        buttonAcept.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                buttonAceptKeyPressed(evt);
            }
        });
        jP1.add(buttonAcept, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 100, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jP1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jP1, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

              
    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        
        
    }//GEN-LAST:event_formKeyPressed

       
       
    private void jP1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jP1KeyPressed
        
        
    }//GEN-LAST:event_jP1KeyPressed

    
        
        
    private void buttonCancelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buttonCancelKeyPressed
        
        
    }//GEN-LAST:event_buttonCancelKeyPressed

        
    private void valueTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valueTextFieldKeyPressed

        
    }//GEN-LAST:event_valueTextFieldKeyPressed

        
    private void valueTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_valueTextFieldFocusGained
        
        
    }//GEN-LAST:event_valueTextFieldFocusGained

        
        
    private void jTabKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTabKeyPressed
        
        
    }//GEN-LAST:event_jTabKeyPressed

        
        
    private void valueTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_valueTextFieldFocusLost
    
               
    }//GEN-LAST:event_valueTextFieldFocusLost

               
    
    private void buttonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelActionPerformed
                                                         
         
    }//GEN-LAST:event_buttonCancelActionPerformed

    
    private void valueTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valueTextFieldKeyTyped
            
        
    }//GEN-LAST:event_valueTextFieldKeyTyped

    

    
    
    
        
        
            
        
    
        
        
        
    private void formMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_formMouseWheelMoved
        
        
    }//GEN-LAST:event_formMouseWheelMoved

        
    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        
        
    }//GEN-LAST:event_formMouseDragged

        
    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        
        
    }//GEN-LAST:event_formMouseMoved

                
        
        
        
        
        
        
            
    
   
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        
         
    }//GEN-LAST:event_formWindowClosing

       
    private void buttonCancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCancelMouseEntered
        
        
    }//GEN-LAST:event_buttonCancelMouseEntered

        
        
        
    
        
    
        
        
    
    
    private void buttonCancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCancelMouseExited
        
        
    }//GEN-LAST:event_buttonCancelMouseExited

        
        
        
        
        

        
        
        
       
        
       
    private void jBActuaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBActuaKeyPressed

    }//GEN-LAST:event_jBActuaKeyPressed

    private void jBActuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBActuaActionPerformed

    }//GEN-LAST:event_jBActuaActionPerformed

    private void jBActuaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBActuaMouseExited

    }//GEN-LAST:event_jBActuaMouseExited

    private void jBActuaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBActuaMouseEntered

    }//GEN-LAST:event_jBActuaMouseEntered

    private void buttonAceptMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAceptMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonAceptMouseEntered

    private void buttonAceptMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAceptMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonAceptMouseExited

    private void buttonAceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAceptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonAceptActionPerformed

    private void buttonAceptKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buttonAceptKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonAceptKeyPressed
   
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton buttonAcept;
    protected javax.swing.JButton buttonCancel;
    protected javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jP1;
    protected javax.swing.JTextField valueTextField;
    // End of variables declaration//GEN-END:variables

}/*Fin de public class Clientes extends javax.swing.JFrame */
