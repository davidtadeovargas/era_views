package com.era.views;

public abstract class NewVtaCustomerInfoJFrame extends BaseJFrame 
{
    public NewVtaCustomerInfoJFrame(final String idTextTitleWindow) 
    {                
        super(idTextTitleWindow);
        
        initComponents();                
        
        postInitComponents();
    }

    
    
       
        
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jP1 = new javax.swing.JPanel();
        jBSal = new javax.swing.JButton();
        jBAcept = new javax.swing.JButton();
        jPClien = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jTCo1 = new javax.swing.JTextField();
        jTextFieldCalle = new javax.swing.JTextField();
        jTCol = new javax.swing.JTextField();
        jTTel = new javax.swing.JTextField();
        jTPai = new javax.swing.JTextField();
        jTCP = new javax.swing.JTextField();
        jTNoExt = new javax.swing.JTextField();
        jTNoInt = new javax.swing.JTextField();
        jTRFC = new javax.swing.JTextField();
        jTCiu = new javax.swing.JTextField();
        jTEstad = new javax.swing.JTextField();
        jCGDats = new javax.swing.JCheckBox();
        jTCo3 = new javax.swing.JTextField();
        jCCo3 = new javax.swing.JCheckBox();
        jTCo2 = new javax.swing.JTextField();
        jCCo1 = new javax.swing.JCheckBox();
        jCCo2 = new javax.swing.JCheckBox();
        jTextFieldCliente = new javax.swing.JTextField();
        jButtonBuscarCliente = new javax.swing.JButton();
        jTNom = new javax.swing.JTextField();
        jTCond = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jCConta = new javax.swing.JCheckBox();
        jTListEmp = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jP1.setBackground(new java.awt.Color(255, 255, 255));
        jP1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBSal.setBackground(new java.awt.Color(255, 255, 255));
        jBSal.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBSal.setForeground(new java.awt.Color(0, 102, 0));
        jBSal.setText("Salir");
        jBSal.setToolTipText("Salir (ESC)");
        jP1.add(jBSal, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 200, 100, 30));

        jBAcept.setBackground(new java.awt.Color(255, 255, 255));
        jBAcept.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBAcept.setForeground(new java.awt.Color(0, 102, 0));
        jBAcept.setText("Aceptar");
        jBAcept.setToolTipText("Nueva Asociaciòn (Ctrl+N)");
        jP1.add(jBAcept, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 200, 100, 30));

        jPClien.setBackground(new java.awt.Color(255, 255, 255));
        jPClien.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos del Cliente", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPClien.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("Cod. Proveedor:");
        jPClien.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 190, 110, -1));

        jLabel6.setText("*CP:");
        jPClien.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 70, -1));

        jLabel20.setText("*Cliente:");
        jPClien.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 70, -1));

        jLabel24.setText("*Calle:");
        jPClien.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 70, -1));

        jLabel29.setText("Teléfono:");
        jPClien.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 70, -1));

        jLabel30.setText("*Colonia:");
        jPClien.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 70, -1));

        jLabel31.setText("*No. Exterior:");
        jPClien.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 90, -1));

        jLabel32.setText("No. Interior:");
        jPClien.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 90, -1));

        jLabel34.setText("*Ciudad:");
        jPClien.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 50, 70, -1));

        jLabel36.setText("Condiciones:");
        jPClien.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 230, -1));

        jLabel37.setText("Lista:");
        jPClien.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 70, -1));

        jTCo1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPClien.add(jTCo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 90, 120, 20));

        jTextFieldCalle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPClien.add(jTextFieldCalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 160, 20));

        jTCol.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPClien.add(jTCol, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 160, 20));

        jTTel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPClien.add(jTTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 160, 20));

        jTPai.setEditable(false);
        jTPai.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPClien.add(jTPai, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 160, 20));

        jTCP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPClien.add(jTCP, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 100, 20));

        jTNoExt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPClien.add(jTNoExt, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 100, 20));

        jTNoInt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPClien.add(jTNoInt, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, 100, 20));

        jTRFC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPClien.add(jTRFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 100, 20));

        jTCiu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPClien.add(jTCiu, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 50, 120, 20));

        jTEstad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPClien.add(jTEstad, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 70, 120, 20));

        jCGDats.setBackground(new java.awt.Color(255, 255, 255));
        jCGDats.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCGDats.setText("Mod. datos del cliente");
        jCGDats.setActionCommand("Mod. datos del cliente");
        jPClien.add(jCGDats, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 150, 170, -1));

        jTCo3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPClien.add(jTCo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 130, 120, 20));

        jCCo3.setBackground(new java.awt.Color(255, 255, 255));
        jCCo3.setText("Correo 3:");
        jPClien.add(jCCo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, -1, -1));

        jTCo2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPClien.add(jTCo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, 120, 20));

        jCCo1.setBackground(new java.awt.Color(255, 255, 255));
        jCCo1.setSelected(true);
        jCCo1.setText("Correo 1:");
        jPClien.add(jCCo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, -1, -1));

        jCCo2.setBackground(new java.awt.Color(255, 255, 255));
        jCCo2.setText("Correo 2:");
        jPClien.add(jCCo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, -1, -1));

        jTextFieldCliente.setBackground(new java.awt.Color(204, 255, 204));
        jTextFieldCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPClien.add(jTextFieldCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 160, 20));

        jButtonBuscarCliente.setBackground(new java.awt.Color(255, 255, 255));
        jButtonBuscarCliente.setText("...");
        jButtonBuscarCliente.setToolTipText("Búscar Cliente(s)");
        jPClien.add(jButtonBuscarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 30, 20));

        jTNom.setEditable(false);
        jTNom.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPClien.add(jTNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 320, 20));

        jTCond.setEditable(false);
        jTCond.setBackground(new java.awt.Color(255, 255, 204));
        jTCond.setForeground(new java.awt.Color(0, 153, 0));
        jTCond.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTCond.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTCond.setFocusable(false);
        jPClien.add(jTCond, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 320, 20));

        jLabel45.setText("Pais:");
        jPClien.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 70, -1));

        jCConta.setBackground(new java.awt.Color(255, 255, 255));
        jCConta.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCConta.setText("Contado");
        jCConta.setActionCommand("Contado");
        jPClien.add(jCConta, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 90, -1));

        jTListEmp.setEditable(false);
        jTListEmp.setBackground(new java.awt.Color(255, 255, 255));
        jTListEmp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTListEmp.setFocusable(false);
        jPClien.add(jTListEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, 100, 20));

        jLabel47.setText("*RFC:");
        jPClien.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 70, -1));

        jLabel41.setText("*Estado:");
        jPClien.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, 70, -1));

        jLabel35.setText("Fecha entrega:");
        jPClien.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 90, -1));

        jP1.add(jPClien, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 750, 183));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jP1, javax.swing.GroupLayout.DEFAULT_SIZE, 781, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jP1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton jBAcept;
    protected javax.swing.JButton jBSal;
    protected javax.swing.JButton jButtonBuscarCliente;
    protected javax.swing.JCheckBox jCCo1;
    protected javax.swing.JCheckBox jCCo2;
    protected javax.swing.JCheckBox jCCo3;
    protected javax.swing.JCheckBox jCConta;
    protected javax.swing.JCheckBox jCGDats;
    protected javax.swing.JLabel jLabel20;
    protected javax.swing.JLabel jLabel24;
    protected javax.swing.JLabel jLabel29;
    protected javax.swing.JLabel jLabel30;
    protected javax.swing.JLabel jLabel31;
    protected javax.swing.JLabel jLabel32;
    protected javax.swing.JLabel jLabel34;
    protected javax.swing.JLabel jLabel35;
    protected javax.swing.JLabel jLabel36;
    protected javax.swing.JLabel jLabel37;
    protected javax.swing.JLabel jLabel4;
    protected javax.swing.JLabel jLabel41;
    protected javax.swing.JLabel jLabel45;
    protected javax.swing.JLabel jLabel47;
    protected javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jP1;
    private javax.swing.JPanel jPClien;
    protected javax.swing.JTextField jTCP;
    protected javax.swing.JTextField jTCiu;
    protected javax.swing.JTextField jTCo1;
    protected javax.swing.JTextField jTCo2;
    protected javax.swing.JTextField jTCo3;
    protected javax.swing.JTextField jTCol;
    protected javax.swing.JTextField jTCond;
    protected javax.swing.JTextField jTEstad;
    protected javax.swing.JTextField jTListEmp;
    protected javax.swing.JTextField jTNoExt;
    protected javax.swing.JTextField jTNoInt;
    protected javax.swing.JTextField jTNom;
    protected javax.swing.JTextField jTPai;
    protected javax.swing.JTextField jTRFC;
    protected javax.swing.JTextField jTTel;
    protected javax.swing.JTextField jTextFieldCalle;
    protected javax.swing.JTextField jTextFieldCliente;
    // End of variables declaration//GEN-END:variables

}
