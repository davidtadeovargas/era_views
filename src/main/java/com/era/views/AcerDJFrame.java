package com.era.views;



public class AcerDJFrame extends BaseJFrame
{       
    public AcerDJFrame(final String idTextTitleWindow) 
    {         
        super(idTextTitleWindow);
        
        initComponents();
        
        serial.grabFocus();
    }

        
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        serialJTextField = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        serial = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        estadJTextField = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        txt_estado_inicio = new javax.swing.JTextField();
        txt_estado_asignadas = new javax.swing.JTextField();
        txt_estado_restantes = new javax.swing.JTextField();
        txt_estado_fin = new javax.swing.JTextField();
        txt_estado_descripcion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ayuda");
        setAutoRequestFocus(false);
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
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        serialJTextField.setBackground(new java.awt.Color(255, 255, 255));
        serialJTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 1, true));
        serialJTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                serialJTextFieldKeyPressed(evt);
            }
        });
        serialJTextField.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel4.setText("2.5.9");
        serialJTextField.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 80, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel6.setText("Versión:");
        serialJTextField.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 80, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel7.setText("Sistema:");
        serialJTextField.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 80, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel8.setText("Serial:");
        serialJTextField.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 80, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel3.setText("Easy Retail® Admin");
        serialJTextField.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 160, -1));

        serial.setEditable(false);
        serial.setNextFocusableComponent(estadJTextField);
        serial.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                serialFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                serialFocusLost(evt);
            }
        });
        serial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                serialKeyPressed(evt);
            }
        });
        serialJTextField.add(serial, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 330, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel9.setText("Estado:");
        serialJTextField.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 80, -1));

        estadJTextField.setEditable(false);
        estadJTextField.setNextFocusableComponent(serial);
        estadJTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                estadJTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                estadJTextFieldFocusLost(evt);
            }
        });
        estadJTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                estadJTextFieldKeyPressed(evt);
            }
        });
        serialJTextField.add(estadJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 330, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Información"));

        txt_estado_inicio.setEditable(false);

        txt_estado_asignadas.setEditable(false);

        txt_estado_restantes.setEditable(false);

        txt_estado_fin.setEditable(false);

        txt_estado_descripcion.setEditable(false);

        jLabel2.setText("Timbres Asignadas");

        jLabel5.setText("Timbres Disponibles");

        jLabel10.setText("Fecha de Inicio");

        jLabel11.setText("Fecha Final");

        jLabel12.setText("Descripción");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_estado_descripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                    .addComponent(txt_estado_fin)
                    .addComponent(txt_estado_inicio, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_estado_restantes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                            .addComponent(txt_estado_asignadas, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_estado_asignadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_estado_restantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_estado_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_estado_fin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_estado_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        serialJTextField.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 410, 160));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(serialJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(serialJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
            
    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        
        
        
    }//GEN-LAST:event_formKeyPressed
     
        
    private void serialJTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_serialJTextFieldKeyPressed
        
    
        
    }//GEN-LAST:event_serialJTextFieldKeyPressed
              
        
    private void formMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_formMouseWheelMoved
        
    
        
    }//GEN-LAST:event_formMouseWheelMoved

        
    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        
    
        
    }//GEN-LAST:event_formMouseDragged

        
    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        
    
        
    }//GEN-LAST:event_formMouseMoved

        
    private void serialFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_serialFocusGained
        
    
        
    }//GEN-LAST:event_serialFocusGained

        
    private void serialFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_serialFocusLost
        
    
        
    }//GEN-LAST:event_serialFocusLost

        
    private void serialKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_serialKeyPressed
        
    
        
    }//GEN-LAST:event_serialKeyPressed

        
    private void estadJTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_estadJTextFieldFocusGained
        
    
        
    }//GEN-LAST:event_estadJTextFieldFocusGained

        
    private void estadJTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_estadJTextFieldFocusLost
                
        estadJTextField.setCaretPosition(0);               
        
    }//GEN-LAST:event_estadJTextFieldFocusLost

    
    
    private void estadJTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_estadJTextFieldKeyPressed
        

        
    }//GEN-LAST:event_estadJTextFieldKeyPressed

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField estadJTextField;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField serial;
    private javax.swing.JPanel serialJTextField;
    private javax.swing.JTextField txt_estado_asignadas;
    private javax.swing.JTextField txt_estado_descripcion;
    private javax.swing.JTextField txt_estado_fin;
    private javax.swing.JTextField txt_estado_inicio;
    private javax.swing.JTextField txt_estado_restantes;
    // End of variables declaration//GEN-END:variables

}/*Fin de public class Clientes extends javax.swing.JFrame */
