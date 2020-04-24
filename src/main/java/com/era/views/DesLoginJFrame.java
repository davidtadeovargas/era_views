package com.era.views;


public class DesLoginJFrame extends BaseJFrame
{        
    
    public DesLoginJFrame() 
    {        
        initComponents();
        
        
                        
    }

        
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jP1 = new javax.swing.JPanel();
        jBIng = new javax.swing.JButton();
        jBSal = new javax.swing.JButton();
        jPContra = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTUsr = new javax.swing.JTextField();
        jCMostC = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        
        jP1.setBackground(new java.awt.Color(255, 255, 255));
        jP1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBIng.setBackground(new java.awt.Color(255, 255, 255));
        jBIng.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBIng.setForeground(new java.awt.Color(0, 102, 0));
        jBIng.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/ent.png"))); // NOI18N
        jBIng.setText("Entrar");
        jBIng.setToolTipText("Entrar (ENTER)");
        jBIng.setNextFocusableComponent(jBSal);
        jP1.add(jBIng, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 110, -1));

        jBSal.setBackground(new java.awt.Color(255, 255, 255));
        jBSal.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBSal.setForeground(new java.awt.Color(0, 102, 0));
        jBSal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/sal.png"))); // NOI18N
        jBSal.setText("Salir");
        jBSal.setToolTipText("Salir (ESC)");
        jP1.add(jBSal, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 110, -1));

        jPContra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPContra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPContra.setNextFocusableComponent(jCMostC);
        jP1.add(jPContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 230, 20));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Contraseña:");
        jP1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 230, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Usuario:");
        jP1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 230, -1));

        jTUsr.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTUsr.setText("SUP");
        jTUsr.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTUsr.setNextFocusableComponent(jPContra);
        jP1.add(jTUsr, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 230, 20));

        jCMostC.setBackground(new java.awt.Color(255, 255, 255));
        jCMostC.setText("Mostrar Contraseña F2");
        jCMostC.setNextFocusableComponent(jBIng);
        jP1.add(jCMostC, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 180, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jP1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jP1, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBIng;
    private javax.swing.JButton jBSal;
    private javax.swing.JCheckBox jCMostC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jP1;
    private javax.swing.JPasswordField jPContra;
    private javax.swing.JTextField jTUsr;
    // End of variables declaration//GEN-END:variables

}
