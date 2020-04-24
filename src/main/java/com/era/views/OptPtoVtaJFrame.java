package com.era.views;



public class OptPtoVtaJFrame extends BaseJFrame 
{
    public OptPtoVtaJFrame() 
    {                
        initComponents();
                
    }

            
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jP1 = new javax.swing.JPanel();
        jBSal = new javax.swing.JButton();
        jBCortZ = new javax.swing.JButton();
        jBCortX = new javax.swing.JButton();
        jBImpVtas = new javax.swing.JButton();
        jBCanVtas = new javax.swing.JButton();
        jBVtas = new javax.swing.JButton();
        jBCompa = new javax.swing.JButton();
        jBDevP = new javax.swing.JButton();
        jBDev = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        
        jP1.setBackground(new java.awt.Color(255, 255, 255));
        jP1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBSal.setBackground(new java.awt.Color(255, 255, 255));
        jBSal.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBSal.setForeground(new java.awt.Color(0, 102, 0));
        jBSal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/sal.png"))); // NOI18N
        jBSal.setText("Salir");
        jBSal.setToolTipText("Salir (ESC)");
        jBSal.setNextFocusableComponent(jBCortX);
        jP1.add(jBSal, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 240, 110, 30));

        jBCortZ.setBackground(new java.awt.Color(255, 255, 255));
        jBCortZ.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBCortZ.setForeground(new java.awt.Color(0, 102, 0));
        jBCortZ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/tijera.gif"))); // NOI18N
        jBCortZ.setText("Corte Z");
        jBCortZ.setToolTipText("Generar corte de caja Z");
        jBCortZ.setNextFocusableComponent(jBImpVtas);
        jP1.add(jBCortZ, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 150, 50));

        jBCortX.setBackground(new java.awt.Color(255, 255, 255));
        jBCortX.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBCortX.setForeground(new java.awt.Color(0, 102, 0));
        jBCortX.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/tijera.gif"))); // NOI18N
        jBCortX.setText("Corte X");
        jBCortX.setToolTipText("Ver corte de caja X");
        jBCortX.setNextFocusableComponent(jBCortZ);
        jP1.add(jBCortX, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, 50));

        jBImpVtas.setBackground(new java.awt.Color(255, 255, 255));
        jBImpVtas.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBImpVtas.setForeground(new java.awt.Color(0, 102, 0));
        jBImpVtas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/impres.png"))); // NOI18N
        jBImpVtas.setText("Imprimir");
        jBImpVtas.setToolTipText("Imprimir Venta(s) ");
        jBImpVtas.setNextFocusableComponent(jBVtas);
        jP1.add(jBImpVtas, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 150, 50));

        jBCanVtas.setBackground(new java.awt.Color(255, 255, 255));
        jBCanVtas.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBCanVtas.setForeground(new java.awt.Color(0, 102, 0));
        jBCanVtas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/del.png"))); // NOI18N
        jBCanVtas.setText("Cancelar");
        jBCanVtas.setToolTipText("Cancelar venta(s) ");
        jBCanVtas.setNextFocusableComponent(jBDev);
        jP1.add(jBCanVtas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 150, 50));

        jBVtas.setBackground(new java.awt.Color(255, 255, 255));
        jBVtas.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBVtas.setForeground(new java.awt.Color(0, 102, 0));
        jBVtas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/vtas.png"))); // NOI18N
        jBVtas.setText("Ventas");
        jBVtas.setToolTipText("Ver ventas");
        jBVtas.setNextFocusableComponent(jBCompa);
        jP1.add(jBVtas, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, 150, 50));

        jBCompa.setBackground(new java.awt.Color(255, 255, 255));
        jBCompa.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBCompa.setForeground(new java.awt.Color(0, 102, 0));
        jBCompa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/compa.png"))); // NOI18N
        jBCompa.setText("Comp.");
        jBCompa.setToolTipText("Compatibilidades de productos");
        jBCompa.setNextFocusableComponent(jBCanVtas);
        jP1.add(jBCompa, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 150, 50));

        jBDevP.setBackground(new java.awt.Color(255, 255, 255));
        jBDevP.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBDevP.setForeground(new java.awt.Color(0, 102, 0));
        jBDevP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/devs.png"))); // NOI18N
        jBDevP.setText("Dev.Parcial");
        jBDevP.setToolTipText("Devolución parcial ventas");
        jBDevP.setNextFocusableComponent(jBSal);
        jP1.add(jBDevP, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 150, 50));

        jBDev.setBackground(new java.awt.Color(255, 255, 255));
        jBDev.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBDev.setForeground(new java.awt.Color(0, 102, 0));
        jBDev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/devs.png"))); // NOI18N
        jBDev.setText("Devolución");
        jBDev.setToolTipText("Devolución ventas");
        jBDev.setNextFocusableComponent(jBDevP);
        jP1.add(jBDev, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 150, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jP1, javax.swing.GroupLayout.PREFERRED_SIZE, 773, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jP1, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
           
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCanVtas;
    private javax.swing.JButton jBCompa;
    private javax.swing.JButton jBCortX;
    private javax.swing.JButton jBCortZ;
    private javax.swing.JButton jBDev;
    private javax.swing.JButton jBDevP;
    private javax.swing.JButton jBImpVtas;
    private javax.swing.JButton jBSal;
    private javax.swing.JButton jBVtas;
    private javax.swing.JPanel jP1;
    // End of variables declaration//GEN-END:variables

}
