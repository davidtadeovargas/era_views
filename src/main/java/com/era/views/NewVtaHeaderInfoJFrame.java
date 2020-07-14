package com.era.views;

public abstract class NewVtaHeaderInfoJFrame extends BaseJFrame 
{
    public NewVtaHeaderInfoJFrame(final String idTextTitleWindow) 
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
        jPanel1 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jComboBoxSerie = new com.era.views.comboboxes.SeriesCombobox();
        jLabel44 = new javax.swing.JLabel();
        jLUsoCfdi = new javax.swing.JLabel();
        jTCta = new javax.swing.JTextField();
        jCMand = new javax.swing.JCheckBox();
        jCImp = new javax.swing.JCheckBox();
        jCMostA = new javax.swing.JCheckBox();
        jCheckboxTimbrar = new javax.swing.JCheckBox();
        jLabel40 = new javax.swing.JLabel();
        jSObserv = new javax.swing.JScrollPane();
        jTAObserv = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jComboboxMonedas = new com.era.views.comboboxes.CoinsCombobox();
        jLabel18 = new javax.swing.JLabel();
        jComboBoxMetodoPago = new com.era.views.comboboxes.MetodoPagoCombobox();
        jComboBoxFormaPago = new com.era.views.comboboxes.PaymentFormCombobox();
        jUsoCFDI = new com.era.views.comboboxes.UsoCFDICombobox();
        jLabel54 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtLugarExped = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jTFilt = new javax.swing.JTextField();
        jBFilt = new javax.swing.JButton();
        jLabel48 = new javax.swing.JLabel();
        jTTipoRelacion = new javax.swing.JTextField();
        jBTipoRelacion = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        JTFecha = new javax.swing.JTextField();
        jCCartaP = new javax.swing.JCheckBox();
        jLabel26 = new javax.swing.JLabel();
        jTextFieldVendedor = new javax.swing.JTextField();
        jRPagad = new javax.swing.JRadioButton();
        jRNoPag = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jP1.setBackground(new java.awt.Color(255, 255, 255));
        jP1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBSal.setBackground(new java.awt.Color(255, 255, 255));
        jBSal.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBSal.setForeground(new java.awt.Color(0, 102, 0));
        jBSal.setText("Salir");
        jBSal.setToolTipText("Salir (ESC)");
        jP1.add(jBSal, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 270, 100, 30));

        jBAcept.setBackground(new java.awt.Color(255, 255, 255));
        jBAcept.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBAcept.setForeground(new java.awt.Color(0, 102, 0));
        jBAcept.setText("Aceptar");
        jBAcept.setToolTipText("Nueva Asociaciòn (Ctrl+N)");
        jP1.add(jBAcept, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 270, 100, 30));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Encabezado", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setText("*Serie:");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 100, -1));

        jPanel1.add(jComboBoxSerie, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 120, 20));

        jLabel44.setText("Método Pago:");
        jPanel1.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 100, -1));

        jLUsoCfdi.setText("Uso de cfdi:");
        jPanel1.add(jLUsoCfdi, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 100, -1));

        jTCta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPanel1.add(jTCta, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 120, 20));

        jCMand.setBackground(new java.awt.Color(255, 255, 255));
        jCMand.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCMand.setSelected(true);
        jCMand.setText("Mandar correo F4");
        jPanel1.add(jCMand, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 130, -1));

        jCImp.setBackground(new java.awt.Color(255, 255, 255));
        jCImp.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCImp.setText("Imprimir F5");
        jPanel1.add(jCImp, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 110, -1));

        jCMostA.setBackground(new java.awt.Color(255, 255, 255));
        jCMostA.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCMostA.setText("Mostrar archivo F6");
        jPanel1.add(jCMostA, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 110, -1));

        jCheckboxTimbrar.setBackground(new java.awt.Color(255, 255, 255));
        jCheckboxTimbrar.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCheckboxTimbrar.setSelected(true);
        jCheckboxTimbrar.setText("Timbrar");
        jPanel1.add(jCheckboxTimbrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 100, 20));

        jLabel40.setText("Observaciones:");
        jPanel1.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 90, -1));

        jTAObserv.setColumns(20);
        jTAObserv.setRows(5);
        jSObserv.setViewportView(jTAObserv);

        jPanel1.add(jSObserv, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 250, 30));

        jLabel9.setText("Forma de Pago:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 110, 20));

        jPanel1.add(jComboboxMonedas, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 120, 20));

        jLabel18.setText("Moneda:");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 90, -1));

        jPanel1.add(jComboBoxMetodoPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 120, 20));

        jPanel1.add(jComboBoxFormaPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 250, 20));

        jPanel1.add(jUsoCFDI, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 120, 20));

        jLabel54.setText("Cuenta:");
        jPanel1.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 100, -1));

        jLabel5.setText("Lugar Expedición");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, -1, -1));
        jPanel1.add(txtLugarExped, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, 100, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("...");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 220, 30, 20));

        jLabel21.setText("Doc Relacionado:");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 90, -1));

        jTFilt.setBackground(new java.awt.Color(255, 255, 153));
        jTFilt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPanel1.add(jTFilt, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 120, 20));

        jBFilt.setBackground(new java.awt.Color(255, 255, 255));
        jBFilt.setText("D");
        jBFilt.setToolTipText("Buscar documento(s)");
        jPanel1.add(jBFilt, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, 30, 20));

        jLabel48.setText("Tipo Relación:");
        jPanel1.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 80, -1));

        jTTipoRelacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPanel1.add(jTTipoRelacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 120, 20));

        jBTipoRelacion.setBackground(new java.awt.Color(255, 255, 255));
        jBTipoRelacion.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBTipoRelacion.setText("jButton1");
        jPanel1.add(jBTipoRelacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, 30, 20));

        jLabel7.setText("Fecha");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, -1, -1));

        JTFecha.setEditable(false);
        jPanel1.add(JTFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 120, -1));

        jCCartaP.setBackground(new java.awt.Color(255, 255, 255));
        jCCartaP.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCCartaP.setText("Carta Porte");
        jPanel1.add(jCCartaP, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 90, -1));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel26.setText("Vendedor:");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, 90, 20));

        jTextFieldVendedor.setEditable(false);
        jTextFieldVendedor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPanel1.add(jTextFieldVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 30, 120, 20));

        jRPagad.setBackground(new java.awt.Color(255, 255, 255));
        jRPagad.setSelected(true);
        jRPagad.setText("Pagada");
        jPanel1.add(jRPagad, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, 70, -1));

        jRNoPag.setBackground(new java.awt.Color(255, 255, 255));
        jRNoPag.setText("No pagada");
        jPanel1.add(jRNoPag, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 70, -1, -1));

        jP1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 840, 260));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jP1, javax.swing.GroupLayout.PREFERRED_SIZE, 868, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jP1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JTextField JTFecha;
    protected javax.swing.JButton jBAcept;
    protected javax.swing.JButton jBFilt;
    protected javax.swing.JButton jBSal;
    protected javax.swing.JButton jBTipoRelacion;
    protected javax.swing.JButton jButton1;
    protected javax.swing.JCheckBox jCCartaP;
    protected javax.swing.JCheckBox jCImp;
    protected javax.swing.JCheckBox jCMand;
    protected javax.swing.JCheckBox jCMostA;
    protected javax.swing.JCheckBox jCheckboxTimbrar;
    protected com.era.views.comboboxes.PaymentFormCombobox jComboBoxFormaPago;
    protected com.era.views.comboboxes.MetodoPagoCombobox jComboBoxMetodoPago;
    protected com.era.views.comboboxes.SeriesCombobox jComboBoxSerie;
    protected com.era.views.comboboxes.CoinsCombobox jComboboxMonedas;
    protected javax.swing.JLabel jLUsoCfdi;
    protected javax.swing.JLabel jLabel18;
    protected javax.swing.JLabel jLabel21;
    protected javax.swing.JLabel jLabel22;
    protected javax.swing.JLabel jLabel26;
    protected javax.swing.JLabel jLabel40;
    protected javax.swing.JLabel jLabel44;
    protected javax.swing.JLabel jLabel48;
    protected javax.swing.JLabel jLabel5;
    protected javax.swing.JLabel jLabel54;
    protected javax.swing.JLabel jLabel7;
    protected javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jP1;
    protected javax.swing.JPanel jPanel1;
    protected javax.swing.JRadioButton jRNoPag;
    protected javax.swing.JRadioButton jRPagad;
    protected javax.swing.JScrollPane jSObserv;
    protected javax.swing.JTextArea jTAObserv;
    protected javax.swing.JTextField jTCta;
    protected javax.swing.JTextField jTFilt;
    protected javax.swing.JTextField jTTipoRelacion;
    protected javax.swing.JTextField jTextFieldVendedor;
    protected com.era.views.comboboxes.UsoCFDICombobox jUsoCFDI;
    protected javax.swing.JTextField txtLugarExped;
    // End of variables declaration//GEN-END:variables

}
