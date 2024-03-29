package com.era.views;

public abstract class FacturarTicketsJFrame extends BaseJFrame {
    
    
    
    public FacturarTicketsJFrame(final String idTextTitleWindow) {
        
        super(idTextTitleWindow);
                
        initComponents();
        
        postInitComponents();
        
        this.getRootPane().setDefaultButton(jBtnFacturar);
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jBtnCliente = new javax.swing.JButton();
        jTxtNomCliente = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jCBEnviarCorreo = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtLugarExp = new javax.swing.JTextField();
        btnLugExp = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTxtArObservaciones = new javax.swing.JTextArea();
        jBtnFacturar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        label_total = new javax.swing.JLabel();
        jDayChooserFrom = new com.toedter.calendar.JCalendar();
        jDayChooserUntil = new com.toedter.calendar.JCalendar();
        jLabelTotal = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableSales = new com.era.views.tables.SalesTable();
        jComSerie = new com.era.views.comboboxes.SeriesCombobox();
        jComMetodoPago = new com.era.views.comboboxes.MetodoPagoCombobox();
        formaPagoDescrip = new javax.swing.JTextField();
        lugarExpedicionDescrip = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Facturar Tickets");
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("*Cliente:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 15, 60, -1));

        jBtnCliente.setBackground(new java.awt.Color(255, 255, 255));
        jBtnCliente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBtnCliente.setText("jButton1");
        getContentPane().add(jBtnCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(524, 12, 31, 20));

        jTxtNomCliente.setEditable(false);
        getContentPane().add(jTxtNomCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 12, 430, -1));

        btnBuscar.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(0, 102, 0));
        btnBuscar.setText("Buscar");
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 160, -1, -1));

        jCBEnviarCorreo.setBackground(new java.awt.Color(255, 255, 255));
        jCBEnviarCorreo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCBEnviarCorreo.setSelected(true);
        jCBEnviarCorreo.setText("Enviar por correo");
        getContentPane().add(jCBEnviarCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(734, 206, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("*Serie:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, 105, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("*Forma Pago:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 60, 105, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("*Lugar Expedicion:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 130, 157, -1));
        getContentPane().add(txtLugarExp, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 150, 130, -1));

        btnLugExp.setBackground(new java.awt.Color(255, 255, 255));
        btnLugExp.setText("...");
        btnLugExp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLugExpActionPerformed(evt);
            }
        });
        getContentPane().add(btnLugExp, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 150, 30, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Observaciones:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(734, 231, 157, -1));

        jTxtArObservaciones.setColumns(20);
        jTxtArObservaciones.setRows(5);
        jScrollPane2.setViewportView(jTxtArObservaciones);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(734, 251, 157, 142));

        jBtnFacturar.setBackground(new java.awt.Color(255, 255, 255));
        jBtnFacturar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBtnFacturar.setForeground(new java.awt.Color(0, 102, 0));
        jBtnFacturar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/fac.png"))); // NOI18N
        jBtnFacturar.setText("Facturar");
        getContentPane().add(jBtnFacturar, new org.netbeans.lib.awtextra.AbsoluteConstraints(734, 402, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("De:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 47, 40, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Hasta:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 60, -1));

        label_total.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        label_total.setText("Total: ");
        getContentPane().add(label_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 80, 80, -1));
        getContentPane().add(jDayChooserFrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));
        getContentPane().add(jDayChooserUntil, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, -1, -1));

        jLabelTotal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelTotal.setText("$0.00");
        getContentPane().add(jLabelTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 110, 100, -1));

        jTableSales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableSales);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 720, 190));
        getContentPane().add(jComSerie, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 30, 160, -1));
        getContentPane().add(jComMetodoPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 80, 160, 20));

        formaPagoDescrip.setEditable(false);
        getContentPane().add(formaPagoDescrip, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 102, 160, -1));

        lugarExpedicionDescrip.setEditable(false);
        getContentPane().add(lugarExpedicionDescrip, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 170, 160, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLugExpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLugExpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLugExpActionPerformed



   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton btnBuscar;
    protected javax.swing.JButton btnLugExp;
    protected javax.swing.JTextField formaPagoDescrip;
    protected javax.swing.JButton jBtnCliente;
    protected javax.swing.JButton jBtnFacturar;
    protected javax.swing.JCheckBox jCBEnviarCorreo;
    protected com.era.views.comboboxes.MetodoPagoCombobox jComMetodoPago;
    protected com.era.views.comboboxes.SeriesCombobox jComSerie;
    protected com.toedter.calendar.JCalendar jDayChooserFrom;
    protected com.toedter.calendar.JCalendar jDayChooserUntil;
    protected javax.swing.JLabel jLabel1;
    protected javax.swing.JLabel jLabel2;
    protected javax.swing.JLabel jLabel3;
    protected javax.swing.JLabel jLabel4;
    protected javax.swing.JLabel jLabel5;
    protected javax.swing.JLabel jLabel6;
    protected javax.swing.JLabel jLabel7;
    protected javax.swing.JLabel jLabelTotal;
    private javax.swing.JScrollPane jScrollPane1;
    protected javax.swing.JScrollPane jScrollPane2;
    protected com.era.views.tables.SalesTable jTableSales;
    protected javax.swing.JTextArea jTxtArObservaciones;
    protected javax.swing.JTextField jTxtNomCliente;
    protected javax.swing.JLabel label_total;
    protected javax.swing.JTextField lugarExpedicionDescrip;
    protected javax.swing.JTextField txtLugarExp;
    // End of variables declaration//GEN-END:variables
}
