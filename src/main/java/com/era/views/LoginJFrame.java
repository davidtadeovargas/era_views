package com.era.views;

//Login to system view
public class LoginJFrame extends BaseJFrame {
                
    public LoginJFrame() {
        
        //Init graphic components
        initComponents();
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jP1 = new javax.swing.JPanel();
        jbuttonLogin = new javax.swing.JButton();
        jbuttonExit = new javax.swing.JButton();
        jPContra = new javax.swing.JPasswordField();
        jTEmp = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTEsta = new javax.swing.JTextField();
        jBEmp = new javax.swing.JButton();
        jCMostC = new javax.swing.JCheckBox();
        JBCreaEmpresa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Login");
        setResizable(false);
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
        jP1.setMinimumSize(new java.awt.Dimension(300, 450));
        jP1.setPreferredSize(new java.awt.Dimension(300, 450));
        jP1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jP1KeyPressed(evt);
            }
        });
        jP1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbuttonLogin.setBackground(new java.awt.Color(255, 255, 255));
        jbuttonLogin.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jbuttonLogin.setForeground(new java.awt.Color(0, 102, 0));
        jbuttonLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/ent.png"))); // NOI18N
        jbuttonLogin.setText("Entrar");
        jbuttonLogin.setToolTipText("Entrar al Sistema (ENTER)");
        jbuttonLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbuttonLogin.setNextFocusableComponent(jbuttonExit);
        jbuttonLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbuttonLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbuttonLoginMouseExited(evt);
            }
        });
        jbuttonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuttonLoginActionPerformed(evt);
            }
        });
        jbuttonLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbuttonLoginKeyPressed(evt);
            }
        });
        jP1.add(jbuttonLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 110, 30));

        jbuttonExit.setBackground(new java.awt.Color(255, 255, 255));
        jbuttonExit.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jbuttonExit.setForeground(new java.awt.Color(0, 102, 0));
        jbuttonExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/sal.png"))); // NOI18N
        jbuttonExit.setText("Salir");
        jbuttonExit.setToolTipText("Salir (ESC)");
        jbuttonExit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbuttonExit.setNextFocusableComponent(jTEmp);
        jbuttonExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbuttonExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbuttonExitMouseExited(evt);
            }
        });
        jbuttonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuttonExitActionPerformed(evt);
            }
        });
        jbuttonExit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbuttonExitKeyPressed(evt);
            }
        });
        jP1.add(jbuttonExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 110, 30));

        jPContra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPContra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPContra.setNextFocusableComponent(jCMostC);
        jPContra.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPContraFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPContraFocusLost(evt);
            }
        });
        jPContra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPContraKeyPressed(evt);
            }
        });
        jP1.add(jPContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 230, 20));

        jTEmp.setEditable(false);
        jTEmp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTEmp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTEmp.setFocusable(false);
        jTEmp.setNextFocusableComponent(jBEmp);
        jTEmp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTEmpFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTEmpFocusLost(evt);
            }
        });
        jTEmp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTEmpMouseClicked(evt);
            }
        });
        jTEmp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTEmpKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTEmpKeyTyped(evt);
            }
        });
        jP1.add(jTEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 230, 20));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Contraseña:");
        jP1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 230, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Empresa:");
        jP1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 230, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Usuario:");
        jP1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 230, -1));

        jTEsta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTEsta.setText("SUP");
        jTEsta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTEsta.setNextFocusableComponent(jPContra);
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
        jP1.add(jTEsta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 230, 20));

        jBEmp.setBackground(new java.awt.Color(255, 255, 255));
        jBEmp.setText("...");
        jBEmp.setToolTipText("Búscar Empresa(s)");
        jBEmp.setNextFocusableComponent(jTEsta);
        jBEmp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jBEmpFocusLost(evt);
            }
        });
        jBEmp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBEmpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBEmpMouseExited(evt);
            }
        });
        jBEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEmpActionPerformed(evt);
            }
        });
        jBEmp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBEmpKeyPressed(evt);
            }
        });
        jP1.add(jBEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 30, 20));

        jCMostC.setBackground(new java.awt.Color(255, 255, 255));
        jCMostC.setText("Mostrar Contraseña F2");
        jCMostC.setNextFocusableComponent(jbuttonLogin);
        jCMostC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCMostCActionPerformed(evt);
            }
        });
        jCMostC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jCMostCKeyPressed(evt);
            }
        });
        jP1.add(jCMostC, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 180, -1));

        JBCreaEmpresa.setBackground(new java.awt.Color(255, 255, 255));
        JBCreaEmpresa.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        JBCreaEmpresa.setForeground(new java.awt.Color(0, 102, 0));
        JBCreaEmpresa.setText("Crear Empresa");
        JBCreaEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCreaEmpresaActionPerformed(evt);
            }
        });
        jP1.add(JBCreaEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 160, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jP1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jP1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    //The user clicked in login
    private void jbuttonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuttonLoginActionPerformed
                        
        
        
    }//GEN-LAST:event_jbuttonLoginActionPerformed
                
        
    /*Cuando se presiona el botón de salir*/
    private void jbuttonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuttonExitActionPerformed

        
        
    }//GEN-LAST:event_jbuttonExitActionPerformed

    
    /*Cuando se presiona una tecla en el formulario*/
    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed

        
    }//GEN-LAST:event_formKeyPressed

    
    /*Cuando se presiona una tecla en el botón de ingresar*/
    private void jbuttonLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbuttonLoginKeyPressed
        
        
    }//GEN-LAST:event_jbuttonLoginKeyPressed

    
    /*Cuando se presiona una tecla en el botón de cancelar*/
    private void jbuttonExitKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbuttonExitKeyPressed
        
        
    }//GEN-LAST:event_jbuttonExitKeyPressed

    
    /*Cuando se esta cerrando el formulario*/
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        
        
    }//GEN-LAST:event_formWindowClosing

    
    /*Cuando se presiona una tecla en el panel*/
    private void jP1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jP1KeyPressed
        
        
    }//GEN-LAST:event_jP1KeyPressed

    
    /*Cuando se presiona una tecla en el campo de edición de empresa*/
    private void jTEmpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTEmpKeyPressed

        
        
    }//GEN-LAST:event_jTEmpKeyPressed

    
    /*Cuando se presiona una tecla en el camo de edición de password*/
    private void jPContraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPContraKeyPressed

        
        
    }//GEN-LAST:event_jPContraKeyPressed

    
    /*Cuando se gana el foco del teclado en el campo de edición de empresa*/
    private void jTEmpFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTEmpFocusGained
        
        
    }//GEN-LAST:event_jTEmpFocusGained

    
    /*Cuando se ganael foco del teclado en el campo de edición de password*/
    private void jPContraFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPContraFocusGained
        
        
        
    }//GEN-LAST:event_jPContraFocusGained
        
               
    private void jTEmpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTEmpKeyTyped
        
        
        
    }//GEN-LAST:event_jTEmpKeyTyped

    
    /*Cuando se pierde el foco del teclado en el campo de contraseña*/
    private void jPContraFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPContraFocusLost

        
        
    }//GEN-LAST:event_jPContraFocusLost

    
    /*Cuando se gana el foco del teclado en el campo de usuario*/
    private void jTEstaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTEstaFocusGained
        
        
    }//GEN-LAST:event_jTEstaFocusGained
        
    
    /*Cuando se presiona una tecla en el campo de usuario*/
    private void jTEstaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTEstaKeyPressed
        
        
    }//GEN-LAST:event_jTEstaKeyPressed

        
    /*Cuando se tipea una tecla en el campo de usuario*/
    private void jTEstaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTEstaKeyTyped
        
        
        
    }//GEN-LAST:event_jTEstaKeyTyped

    
    /*Cuando se presiona el botón de buscar coincidencia de empresas*/
    private void jBEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEmpActionPerformed

        
        
    }//GEN-LAST:event_jBEmpActionPerformed

    
    /*Cuando se presiona una tecla en el botón de buscar*/
    private void jBEmpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBEmpKeyPressed

        
    }//GEN-LAST:event_jBEmpKeyPressed

    
    /*Cuando sucede una acción en el checkbox de mostrar contraseña*/
    private void jCMostCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCMostCActionPerformed

        

    }//GEN-LAST:event_jCMostCActionPerformed

    
    /*Cuando se presiona un tecla en el campo de mostrar contraseña*/
    private void jCMostCKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCMostCKeyPressed

        
    }//GEN-LAST:event_jCMostCKeyPressed

    
    /*Cuando se pierde el foco del teclado en el campo de empresa*/
    private void jTEmpFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTEmpFocusLost
        
        
    }//GEN-LAST:event_jTEmpFocusLost

    
    
    
    /*Cuando se pierde el foco del teclado en el campo de El usuario*/
    private void jTEstaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTEstaFocusLost

        
    }//GEN-LAST:event_jTEstaFocusLost

    
    /*Cuando se hace clic en el control del nombre de la empresa*/
    private void jTEmpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTEmpMouseClicked
                
        
    }//GEN-LAST:event_jTEmpMouseClicked

    
    /*Cuando se pierde el foco del teclado en el botón de búscar empresa*/
    private void jBEmpFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jBEmpFocusLost
        
        
        
    }//GEN-LAST:event_jBEmpFocusLost

    
    /*Cuando el mouse entra en el botón específico*/
    private void jbuttonLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbuttonLoginMouseEntered
        
        
    }//GEN-LAST:event_jbuttonLoginMouseEntered

    
    /*Cuando el mouse entra en el botón específico*/
    private void jbuttonExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbuttonExitMouseEntered
        
        
    }//GEN-LAST:event_jbuttonExitMouseEntered

    
    /*Cuando el mouse sale del botón específico*/
    private void jbuttonLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbuttonLoginMouseExited
        
        
    }//GEN-LAST:event_jbuttonLoginMouseExited

    
    /*Cuando el mouse sale del botón específico*/
    private void jbuttonExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbuttonExitMouseExited
        
        
    }//GEN-LAST:event_jbuttonExitMouseExited

    
    /*Cuando el mouse entra en el botón de búscar empresa*/
    private void jBEmpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBEmpMouseEntered
        
                
    }//GEN-LAST:event_jBEmpMouseEntered

    
    /*Cuando el mouse sale del botón de búscar empresa*/
    private void jBEmpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBEmpMouseExited
        
        
    }//GEN-LAST:event_jBEmpMouseExited

    private void JBCreaEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCreaEmpresaActionPerformed
        
        
        
    }//GEN-LAST:event_JBCreaEmpresaActionPerformed
       
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton JBCreaEmpresa;
    protected javax.swing.JButton jBEmp;
    protected javax.swing.JCheckBox jCMostC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    protected javax.swing.JPanel jP1;
    protected javax.swing.JPasswordField jPContra;
    protected javax.swing.JTextField jTEmp;
    protected javax.swing.JTextField jTEsta;
    protected javax.swing.JButton jbuttonExit;
    protected javax.swing.JButton jbuttonLogin;
    // End of variables declaration//GEN-END:variables
    
}/*Fin de public class NuevaEmpresa extends javax.swing.JFrame */
