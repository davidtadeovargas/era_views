package com.era.views;





public abstract class NewClienExpJFrame extends BaseJFrame 
{        
    
    public NewClienExpJFrame(final String idTextTitleWindow)
    {
        super(idTextTitleWindow);
        
        initComponents();
                
        postInitComponents();
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jP1 = new javax.swing.JPanel();
        jTNomb = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTCall = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTCol = new javax.swing.JTextField();
        jTEstad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTPai = new javax.swing.JTextField();
        jTCiu = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTCP = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jBGuar = new javax.swing.JButton();
        jBSal = new javax.swing.JButton();
        jTRFC = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTTel = new javax.swing.JTextField();
        jTCo1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTPag1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTAObserv = new javax.swing.JTextArea();
        jTPag2 = new javax.swing.JTextField();
        jTCo2 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTCo3 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jTTelPer1 = new javax.swing.JTextField();
        jTTelPers2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jTNoExt = new javax.swing.JTextField();
        jTNoInt = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jRaFis = new javax.swing.JRadioButton();
        jRaMor = new javax.swing.JRadioButton();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jTCta = new javax.swing.JTextField();
        jTMetPag = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jComSer = new javax.swing.JComboBox();
        jTCodEmp = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jTLada = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jTExten = new javax.swing.JTextField();
        jTCel = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Cliente Express");
        setResizable(false);
        
        jP1.setBackground(new java.awt.Color(255, 255, 255));
        jP1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTNomb.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTNomb.setNextFocusableComponent(jTLada);
        jP1.add(jTNomb, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 230, 20));

        jLabel2.setText("*Razón Social:");
        jLabel2.setToolTipText("Nombre de la Empresa o Nombnre del Cliente");
        jP1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 130, -1));

        jLabel3.setText("Calle:");
        jP1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jTCall.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTCall.setNextFocusableComponent(jTNoExt);
        jP1.add(jTCall, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 230, 20));

        jLabel4.setText("Colonia:");
        jP1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        jTCol.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTCol.setNextFocusableComponent(jTCP);
        jP1.add(jTCol, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 230, 20));

        jTEstad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTEstad.setNextFocusableComponent(jTPai);
        jP1.add(jTEstad, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 230, 20));

        jLabel5.setText("Estado:");
        jP1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        jLabel6.setText("País:");
        jP1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        jTPai.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTPai.setNextFocusableComponent(jTRFC);
        jP1.add(jTPai, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 230, 20));

        jTCiu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTCiu.setNextFocusableComponent(jTEstad);
        jP1.add(jTCiu, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 230, 20));

        jLabel7.setText("Ciudad:");
        jP1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        jLabel8.setText("Cuenta:");
        jP1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 130, -1));

        jTCP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTCP.setNextFocusableComponent(jTCiu);
        jP1.add(jTCP, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 230, 20));

        jLabel9.setText("No. Interior:");
        jP1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 100, -1));

        jBGuar.setBackground(new java.awt.Color(255, 255, 255));
        jBGuar.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBGuar.setForeground(new java.awt.Color(0, 102, 0));
        jBGuar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/save.png"))); // NOI18N
        jBGuar.setText("Guardar");
        jBGuar.setToolTipText("Guardar");
        jBGuar.setNextFocusableComponent(jBSal);
        jP1.add(jBGuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 440, 120, -1));

        jBSal.setBackground(new java.awt.Color(255, 255, 255));
        jBSal.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBSal.setForeground(new java.awt.Color(0, 102, 0));
        jBSal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/sal.png"))); // NOI18N
        jBSal.setText("Salir");
        jBSal.setToolTipText("Salir (ESC)");
        jBSal.setName(""); // NOI18N
        jBSal.setNextFocusableComponent(jRaMor);
        jP1.add(jBSal, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 440, 120, -1));

        jTRFC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTRFC.setNextFocusableComponent(jTAObserv);
        jP1.add(jTRFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 230, 20));

        jLabel11.setText("RFC:");
        jP1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        jLabel13.setText("Teléfono Personal 2:");
        jP1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jTTel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTTel.setNextFocusableComponent(jTExten);
        jP1.add(jTTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 130, 20));

        jTCo1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTCo1.setNextFocusableComponent(jTCo2);
        jP1.add(jTCo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 50, 230, 20));

        jLabel15.setText("Página Web1:");
        jP1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, -1, -1));

        jTPag1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTPag1.setNextFocusableComponent(jTPag2);
        jP1.add(jTPag1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, 230, 20));

        jTAObserv.setColumns(20);
        jTAObserv.setLineWrap(true);
        jTAObserv.setRows(5);
        jTAObserv.setBorder(null);
        jTAObserv.setNextFocusableComponent(jTMetPag);
        jScrollPane1.setViewportView(jTAObserv);

        jP1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 230, 40));

        jTPag2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTPag2.setNextFocusableComponent(jComSer);
        jP1.add(jTPag2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, 230, 20));

        jTCo2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTCo2.setNextFocusableComponent(jTCo3);
        jP1.add(jTCo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, 230, 20));

        jLabel17.setText("Correo2:");
        jP1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, -1, -1));

        jLabel18.setText("Correo3:");
        jP1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, -1, -1));

        jTCo3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTCo3.setNextFocusableComponent(jTPag1);
        jP1.add(jTCo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, 230, 20));

        jLabel19.setText("Página Web2:");
        jP1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, -1, -1));

        jLabel20.setText("Teléfono:");
        jP1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel21.setText("Teléfono Personal 1:");
        jP1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jTTelPer1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTTelPer1.setNextFocusableComponent(jTTelPers2);
        jP1.add(jTTelPer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 230, 20));

        jTTelPers2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTTelPers2.setNextFocusableComponent(jTCall);
        jP1.add(jTTelPers2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 230, 20));

        jLabel10.setText("CP:");
        jP1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        jLabel22.setText("No. Exterior:");
        jP1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 100, -1));

        jTNoExt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTNoExt.setNextFocusableComponent(jTNoInt);
        jP1.add(jTNoExt, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 230, 20));

        jTNoInt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTNoInt.setNextFocusableComponent(jTCol);
        jP1.add(jTNoInt, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 230, 20));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jRaFis.setBackground(new java.awt.Color(255, 255, 255));
        jRaFis.setText("Persona Física");
        jRaFis.setNextFocusableComponent(jTNomb);
        jPanel2.add(jRaFis, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 130, -1));

        jRaMor.setBackground(new java.awt.Color(255, 255, 255));
        jRaMor.setSelected(true);
        jRaMor.setText("Persona Moral");
        jRaMor.setNextFocusableComponent(jRaFis);
        jPanel2.add(jRaMor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, -1));

        jP1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 230, 30));

        jLabel28.setText("Observaciones:");
        jP1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));

        jLabel29.setText("Método Pago:");
        jP1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 130, -1));

        jTCta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTCta.setNextFocusableComponent(jTCo1);
        jP1.add(jTCta, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, 130, 20));

        jTMetPag.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTMetPag.setNextFocusableComponent(jTCta);
        jP1.add(jTMetPag, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, 130, 20));

        jLabel30.setText("Correo1:");
        jP1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 54, -1, 10));

        jComSer.setNextFocusableComponent(jTCodEmp);
        jP1.add(jComSer, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, 100, 20));

        jTCodEmp.setBackground(new java.awt.Color(204, 255, 204));
        jTCodEmp.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 1, true));
        jTCodEmp.setNextFocusableComponent(jRaMor);
        jP1.add(jTCodEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, 100, 20));

        jLabel35.setText("*Serie:");
        jP1.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 100, -1));

        jLabel36.setText("Cod.Cliente:");
        jP1.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 100, -1));

        jTLada.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTLada.setNextFocusableComponent(jTTel);
        jP1.add(jTLada, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 50, 20));

        jLabel31.setText("Lada:");
        jP1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 40, 20));

        jLabel23.setText("Extensión:");
        jP1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 100, -1));

        jLabel41.setText("Célular:");
        jP1.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 100, -1));

        jTExten.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jTExten.setNextFocusableComponent(jTCel);
        jP1.add(jTExten, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 230, 20));

        jTCel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));        
        jP1.add(jTCel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 230, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jP1, javax.swing.GroupLayout.PREFERRED_SIZE, 755, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jP1, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

        
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBGuar;
    private javax.swing.JButton jBSal;
    private javax.swing.JComboBox jComSer;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jP1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRaFis;
    private javax.swing.JRadioButton jRaMor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTAObserv;
    private javax.swing.JTextField jTCP;
    private javax.swing.JTextField jTCall;
    private javax.swing.JTextField jTCel;
    private javax.swing.JTextField jTCiu;
    private javax.swing.JTextField jTCo1;
    private javax.swing.JTextField jTCo2;
    private javax.swing.JTextField jTCo3;
    private javax.swing.JTextField jTCodEmp;
    private javax.swing.JTextField jTCol;
    private javax.swing.JTextField jTCta;
    private javax.swing.JTextField jTEstad;
    private javax.swing.JTextField jTExten;
    private javax.swing.JTextField jTLada;
    private javax.swing.JTextField jTMetPag;
    private javax.swing.JTextField jTNoExt;
    private javax.swing.JTextField jTNoInt;
    private javax.swing.JTextField jTNomb;
    private javax.swing.JTextField jTPag1;
    private javax.swing.JTextField jTPag2;
    private javax.swing.JTextField jTPai;
    private javax.swing.JTextField jTRFC;
    private javax.swing.JTextField jTTel;
    private javax.swing.JTextField jTTelPer1;
    private javax.swing.JTextField jTTelPers2;
    // End of variables declaration//GEN-END:variables

}
